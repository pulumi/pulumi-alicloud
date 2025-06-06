// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECS Security Group resource.
 *
 * For information about ECS Security Group and how to use it, see [What is Security Group](https://www.alibabacloud.com/help/en/ecs/developer-reference/api-createsecuritygroup).
 *
 * > **NOTE:** Available since v1.0.0.
 *
 * > **NOTE:** `alicloud.ecs.SecurityGroup` is used to build and manage a security group, and `alicloud.ecs.SecurityGroupRule` can define ingress or egress rules for it.
 *
 * > **NOTE:** From version 1.7.2, `alicloud.ecs.SecurityGroup` has supported to segregate different ECS instance in which the same security group.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.ecs.SecurityGroup("default", {securityGroupName: "terraform-example"});
 * ```
 *
 * Basic Usage for VPC
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.vpc.Network("default", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("default", {
 *     securityGroupName: "terraform-example",
 *     vpcId: _default.id,
 * });
 * ```
 *
 * ## Module Support
 *
 * You can use the existing security-group module
 * to create a security group and add several rules one-click.
 *
 * ## Import
 *
 * ECS Security Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ecs/securityGroup:SecurityGroup example <id>
 * ```
 */
export class SecurityGroup extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGroupState, opts?: pulumi.CustomResourceOptions): SecurityGroup {
        return new SecurityGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/securityGroup:SecurityGroup';

    /**
     * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityGroup.__pulumiType;
    }

    /**
     * (Available since v1.239.0) The time when the security group was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the security group. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     *
     * @deprecated Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     */
    public readonly innerAccess!: pulumi.Output<boolean>;
    /**
     * The internal access control policy of the security group. Valid values:
     * - `Accept`: The internal interconnectivity policy.
     * - `Drop`: The internal isolation policy.
     */
    public readonly innerAccessPolicy!: pulumi.Output<string>;
    /**
     * Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     *
     * @deprecated Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the resource group to which the security group belongs. **NOTE:** From version 1.115.0, `resourceGroupId` can be modified.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * The name of the security group. The name must be `2` to `128` characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).
     */
    public readonly securityGroupName!: pulumi.Output<string>;
    /**
     * The type of the security group. Default value: `normal`. Valid values:
     */
    public readonly securityGroupType!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the VPC in which you want to create the security group.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a SecurityGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityGroupArgs | SecurityGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityGroupState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["innerAccess"] = state ? state.innerAccess : undefined;
            resourceInputs["innerAccessPolicy"] = state ? state.innerAccessPolicy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["securityGroupName"] = state ? state.securityGroupName : undefined;
            resourceInputs["securityGroupType"] = state ? state.securityGroupType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as SecurityGroupArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["innerAccess"] = args ? args.innerAccess : undefined;
            resourceInputs["innerAccessPolicy"] = args ? args.innerAccessPolicy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["securityGroupName"] = args ? args.securityGroupName : undefined;
            resourceInputs["securityGroupType"] = args ? args.securityGroupType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityGroup resources.
 */
export interface SecurityGroupState {
    /**
     * (Available since v1.239.0) The time when the security group was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the security group. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     *
     * @deprecated Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     */
    innerAccess?: pulumi.Input<boolean>;
    /**
     * The internal access control policy of the security group. Valid values:
     * - `Accept`: The internal interconnectivity policy.
     * - `Drop`: The internal isolation policy.
     */
    innerAccessPolicy?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     *
     * @deprecated Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the security group belongs. **NOTE:** From version 1.115.0, `resourceGroupId` can be modified.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of the security group. The name must be `2` to `128` characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).
     */
    securityGroupName?: pulumi.Input<string>;
    /**
     * The type of the security group. Default value: `normal`. Valid values:
     */
    securityGroupType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the VPC in which you want to create the security group.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityGroup resource.
 */
export interface SecurityGroupArgs {
    /**
     * The description of the security group. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     *
     * @deprecated Field `innerAccess` has been deprecated from provider version 1.55.3. New field `innerAccessPolicy` instead.
     */
    innerAccess?: pulumi.Input<boolean>;
    /**
     * The internal access control policy of the security group. Valid values:
     * - `Accept`: The internal interconnectivity policy.
     * - `Drop`: The internal isolation policy.
     */
    innerAccessPolicy?: pulumi.Input<string>;
    /**
     * Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     *
     * @deprecated Field `name` has been deprecated from provider version 1.239.0. New field `securityGroupName` instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the security group belongs. **NOTE:** From version 1.115.0, `resourceGroupId` can be modified.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of the security group. The name must be `2` to `128` characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).
     */
    securityGroupName?: pulumi.Input<string>;
    /**
     * The type of the security group. Default value: `normal`. Valid values:
     */
    securityGroupType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the VPC in which you want to create the security group.
     */
    vpcId?: pulumi.Input<string>;
}
