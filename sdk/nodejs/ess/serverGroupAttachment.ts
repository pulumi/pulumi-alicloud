// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Attaches/Detaches server group to a specified scaling group.
 *
 * For information about  server group attachment, see [AttachServerGroups](https://www.alibabacloud.com/help/en/auto-scaling/developer-reference/api-attachservergroups).
 *
 * > **NOTE:** If scaling group's network type is `VPC`, the server groups must be in the same `VPC`.
 *
 * > **NOTE:** server group attachment is defined uniquely by `scalingGroupId`, `serverGroupId`,`type`, `port`.
 *
 * > **NOTE:** Resource `alicloud.ess.ServerGroupAttachment` don't support modification.
 *
 * > **NOTE:** Available since v1.231.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const myName = `${name}-${defaultInteger.result}`;
 * const _default = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultGetInstanceTypes = _default.then(_default => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: _default.zones?.[0]?.id,
 *     cpuCoreCount: 2,
 *     memorySize: 4,
 * }));
 * const defaultGetImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     mostRecent: true,
 *     owners: "system",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     vpcName: myName,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     vswitchName: myName,
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     name: myName,
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultScalingGroup = new alicloud.ess.ScalingGroup("default", {
 *     minSize: 0,
 *     maxSize: 2,
 *     scalingGroupName: myName,
 *     defaultCooldown: 200,
 *     removalPolicies: ["OldestInstance"],
 *     vswitchIds: [defaultSwitch.id],
 * });
 * const defaultScalingConfiguration = new alicloud.ess.ScalingConfiguration("default", {
 *     scalingGroupId: defaultScalingGroup.id,
 *     imageId: defaultGetImages.then(defaultGetImages => defaultGetImages.images?.[0]?.id),
 *     instanceType: defaultGetInstanceTypes.then(defaultGetInstanceTypes => defaultGetInstanceTypes.instanceTypes?.[0]?.id),
 *     securityGroupId: defaultSecurityGroup.id,
 *     systemDiskSize: 50,
 *     forceDelete: true,
 *     active: true,
 *     enable: true,
 * });
 * const defaultServerGroup = new alicloud.alb.ServerGroup("default", {
 *     serverGroupName: myName,
 *     vpcId: defaultNetwork.id,
 *     healthCheckConfig: {
 *         healthCheckEnabled: false,
 *     },
 *     stickySessionConfig: {
 *         stickySessionEnabled: true,
 *         cookie: "tf-example",
 *         stickySessionType: "Server",
 *     },
 * });
 * const defaultServerGroupAttachment = new alicloud.ess.ServerGroupAttachment("default", {
 *     scalingGroupId: defaultScalingConfiguration.scalingGroupId,
 *     serverGroupId: defaultServerGroup.id,
 *     port: 9000,
 *     type: "ALB",
 *     weight: 50,
 *     forceAttach: true,
 * });
 * ```
 */
export class ServerGroupAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroupAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupAttachmentState, opts?: pulumi.CustomResourceOptions): ServerGroupAttachment {
        return new ServerGroupAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/serverGroupAttachment:ServerGroupAttachment';

    /**
     * Returns true if the given object is an instance of ServerGroupAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerGroupAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerGroupAttachment.__pulumiType;
    }

    /**
     * If instances of scaling group are attached/removed from backend server when
     * server group from scaling group. Default to false.
     */
    public readonly forceAttach!: pulumi.Output<boolean | undefined>;
    /**
     * The port will be used for Server Group backend server.
     */
    public readonly port!: pulumi.Output<number>;
    /**
     * ID of the scaling group.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;
    /**
     * ID of Server Group.
     */
    public readonly serverGroupId!: pulumi.Output<string>;
    /**
     * The type of server group N. Valid values: ALB, NLB.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The weight of an ECS instance attached to the Server Group.
     */
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a ServerGroupAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerGroupAttachmentArgs | ServerGroupAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerGroupAttachmentState | undefined;
            resourceInputs["forceAttach"] = state ? state.forceAttach : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
            resourceInputs["serverGroupId"] = state ? state.serverGroupId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as ServerGroupAttachmentArgs | undefined;
            if ((!args || args.port === undefined) && !opts.urn) {
                throw new Error("Missing required property 'port'");
            }
            if ((!args || args.scalingGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            if ((!args || args.serverGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverGroupId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.weight === undefined) && !opts.urn) {
                throw new Error("Missing required property 'weight'");
            }
            resourceInputs["forceAttach"] = args ? args.forceAttach : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
            resourceInputs["serverGroupId"] = args ? args.serverGroupId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerGroupAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerGroupAttachment resources.
 */
export interface ServerGroupAttachmentState {
    /**
     * If instances of scaling group are attached/removed from backend server when
     * server group from scaling group. Default to false.
     */
    forceAttach?: pulumi.Input<boolean>;
    /**
     * The port will be used for Server Group backend server.
     */
    port?: pulumi.Input<number>;
    /**
     * ID of the scaling group.
     */
    scalingGroupId?: pulumi.Input<string>;
    /**
     * ID of Server Group.
     */
    serverGroupId?: pulumi.Input<string>;
    /**
     * The type of server group N. Valid values: ALB, NLB.
     */
    type?: pulumi.Input<string>;
    /**
     * The weight of an ECS instance attached to the Server Group.
     */
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ServerGroupAttachment resource.
 */
export interface ServerGroupAttachmentArgs {
    /**
     * If instances of scaling group are attached/removed from backend server when
     * server group from scaling group. Default to false.
     */
    forceAttach?: pulumi.Input<boolean>;
    /**
     * The port will be used for Server Group backend server.
     */
    port: pulumi.Input<number>;
    /**
     * ID of the scaling group.
     */
    scalingGroupId: pulumi.Input<string>;
    /**
     * ID of Server Group.
     */
    serverGroupId: pulumi.Input<string>;
    /**
     * The type of server group N. Valid values: ALB, NLB.
     */
    type: pulumi.Input<string>;
    /**
     * The weight of an ECS instance attached to the Server Group.
     */
    weight: pulumi.Input<number>;
}
