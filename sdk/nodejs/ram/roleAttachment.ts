// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RAM role attachment resource to bind role for several ECS instances.
 *
 * > **NOTE:** Deprecated since v1.250.0.
 *
 * > **DEPRECATED:** This resource has been deprecated from version `1.250.0`. Please use new resource alicloud_ecs_ram_role_attachment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultGetInstanceTypes = _default.then(_default => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: _default.zones?.[0]?.id,
 *     cpuCoreCount: 2,
 *     memorySize: 8,
 *     instanceTypeFamily: "ecs.g6",
 * }));
 * const defaultGetImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     mostRecent: true,
 *     owners: "system",
 * });
 * const config = new pulumi.Config();
 * const name = config.get("name") || "ecsInstanceVPCExample";
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     securityGroupName: name,
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultSecurityGroupRule = new alicloud.ecs.SecurityGroupRule("default", {
 *     type: "ingress",
 *     ipProtocol: "tcp",
 *     nicType: "intranet",
 *     policy: "accept",
 *     portRange: "22/22",
 *     priority: 1,
 *     securityGroupId: defaultSecurityGroup.id,
 *     cidrIp: "172.16.0.0/24",
 * });
 * const foo = new alicloud.ecs.Instance("foo", {
 *     vswitchId: defaultSwitch.id,
 *     imageId: defaultGetImages.then(defaultGetImages => defaultGetImages.images?.[0]?.id),
 *     instanceType: defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes?.[0]?.id),
 *     systemDiskCategory: "cloud_efficiency",
 *     internetChargeType: "PayByTraffic",
 *     internetMaxBandwidthOut: 5,
 *     securityGroups: [defaultSecurityGroup.id],
 *     instanceName: name,
 * });
 * const role = new alicloud.ram.Role("role", {
 *     name: "terraform-example",
 *     document: `  {
 *     "Statement": [
 *       {
 *         "Action": "sts:AssumeRole",
 *         "Effect": "Allow",
 *         "Principal": {
 *           "Service": [
 *             "ecs.aliyuncs.com"
 *           ]
 *         }
 *       }
 *     ],
 *     "Version": "1"
 *   }
 *
 * `,
 *     description: "this is a test",
 *     force: true,
 * });
 * const attach = new alicloud.ram.RoleAttachment("attach", {
 *     roleName: role.name,
 *     instanceIds: [foo].map(__item => __item.id),
 * });
 * ```
 */
export class RoleAttachment extends pulumi.CustomResource {
    /**
     * Get an existing RoleAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleAttachmentState, opts?: pulumi.CustomResourceOptions): RoleAttachment {
        return new RoleAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ram/roleAttachment:RoleAttachment';

    /**
     * Returns true if the given object is an instance of RoleAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleAttachment.__pulumiType;
    }

    /**
     * The list of ECS instance's IDs.
     */
    public readonly instanceIds!: pulumi.Output<string[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    public readonly roleName!: pulumi.Output<string>;

    /**
     * Create a RoleAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleAttachmentArgs | RoleAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleAttachmentState | undefined;
            resourceInputs["instanceIds"] = state ? state.instanceIds : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
        } else {
            const args = argsOrState as RoleAttachmentArgs | undefined;
            if ((!args || args.instanceIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceIds'");
            }
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["instanceIds"] = args ? args.instanceIds : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleAttachment resources.
 */
export interface RoleAttachmentState {
    /**
     * The list of ECS instance's IDs.
     */
    instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    roleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RoleAttachment resource.
 */
export interface RoleAttachmentArgs {
    /**
     * The list of ECS instance's IDs.
     */
    instanceIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
     */
    roleName: pulumi.Input<string>;
}
