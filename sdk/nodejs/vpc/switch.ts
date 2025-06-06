// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a VPC Vswitch resource. ## Module Support
 *
 * You can use to the existing vpc module  to create a VPC and several VSwitches one-click.
 *
 * For information about VPC Vswitch and how to use it, see [What is Vswitch](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/work-with-vswitches).
 *
 * > **NOTE:** Available since v1.0.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const fooNetwork = new alicloud.vpc.Network("foo", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const fooSwitch = new alicloud.vpc.Switch("foo", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.16.0.0/21",
 *     vpcId: fooNetwork.id,
 *     zoneId: foo.then(foo => foo.zones?.[0]?.id),
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const cidrBlocks = new alicloud.vpc.Ipv4CidrBlock("cidr_blocks", {
 *     vpcId: vpc.id,
 *     secondaryCidrBlock: "192.163.0.0/16",
 * });
 * const island_nat = new alicloud.vpc.Switch("island-nat", {
 *     vpcId: cidrBlocks.vpcId,
 *     cidrBlock: "172.16.0.0/21",
 *     zoneId: foo.then(foo => foo.zones?.[0]?.id),
 *     vswitchName: "terraform-example",
 *     tags: {
 *         BuiltBy: "example_value",
 *         cnm_version: "example_value",
 *         Environment: "example_value",
 *         ManagedBy: "example_value",
 *     },
 * });
 * ```
 *
 * Create a switch associated with the additional network segment
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const fooNetwork = new alicloud.vpc.Network("foo", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const fooIpv4CidrBlock = new alicloud.vpc.Ipv4CidrBlock("foo", {
 *     vpcId: fooNetwork.id,
 *     secondaryCidrBlock: "192.163.0.0/16",
 * });
 * const fooSwitch = new alicloud.vpc.Switch("foo", {
 *     vpcId: fooIpv4CidrBlock.vpcId,
 *     cidrBlock: "192.163.0.0/24",
 *     zoneId: foo.then(foo => foo.zones?.[0]?.id),
 * });
 * ```
 *
 * ## Import
 *
 * VPC Vswitch can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/switch:Switch example <id>
 * ```
 */
export class Switch extends pulumi.CustomResource {
    /**
     * Get an existing Switch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SwitchState, opts?: pulumi.CustomResourceOptions): Switch {
        return new Switch(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/switch:Switch';

    /**
     * Returns true if the given object is an instance of Switch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Switch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Switch.__pulumiType;
    }

    /**
     * Field `availabilityZone` has been deprecated from provider version 1.119.0. New field `zoneId` instead.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead.
     */
    public readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The IPv4 CIDR block of the VSwitch. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `cidrBlock` is required.
     */
    public readonly cidrBlock!: pulumi.Output<string>;
    /**
     * The creation time of the VSwitch.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of VSwitch.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the IPv6 function is enabled in the switch. Value:
     */
    public readonly enableIpv6!: pulumi.Output<boolean | undefined>;
    /**
     * The IPv6 CIDR block of the VSwitch.
     */
    public /*out*/ readonly ipv6CidrBlock!: pulumi.Output<string>;
    /**
     * The IPv6 CIDR block of the VSwitch.
     */
    public readonly ipv6CidrBlockMask!: pulumi.Output<number>;
    /**
     * Specifies whether to create the default VSwitch. Default value: `false`. Valid values:
     */
    public readonly isDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Field `name` has been deprecated from provider version 1.119.0. New field `vswitchName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of VSwitch.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The VPC ID. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `vpcId` is required.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The name of the VSwitch.
     */
    public readonly vswitchName!: pulumi.Output<string>;
    /**
     * The AZ for the VSwitch. **Note:** Required for a VPC VSwitch.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Switch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SwitchArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SwitchArgs | SwitchState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SwitchState | undefined;
            resourceInputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            resourceInputs["cidrBlock"] = state ? state.cidrBlock : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableIpv6"] = state ? state.enableIpv6 : undefined;
            resourceInputs["ipv6CidrBlock"] = state ? state.ipv6CidrBlock : undefined;
            resourceInputs["ipv6CidrBlockMask"] = state ? state.ipv6CidrBlockMask : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchName"] = state ? state.vswitchName : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as SwitchArgs | undefined;
            resourceInputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            resourceInputs["cidrBlock"] = args ? args.cidrBlock : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableIpv6"] = args ? args.enableIpv6 : undefined;
            resourceInputs["ipv6CidrBlockMask"] = args ? args.ipv6CidrBlockMask : undefined;
            resourceInputs["isDefault"] = args ? args.isDefault : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchName"] = args ? args.vswitchName : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["ipv6CidrBlock"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Switch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Switch resources.
 */
export interface SwitchState {
    /**
     * Field `availabilityZone` has been deprecated from provider version 1.119.0. New field `zoneId` instead.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead.
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * The IPv4 CIDR block of the VSwitch. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `cidrBlock` is required.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * The creation time of the VSwitch.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of VSwitch.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the IPv6 function is enabled in the switch. Value:
     */
    enableIpv6?: pulumi.Input<boolean>;
    /**
     * The IPv6 CIDR block of the VSwitch.
     */
    ipv6CidrBlock?: pulumi.Input<string>;
    /**
     * The IPv6 CIDR block of the VSwitch.
     */
    ipv6CidrBlockMask?: pulumi.Input<number>;
    /**
     * Specifies whether to create the default VSwitch. Default value: `false`. Valid values:
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Field `name` has been deprecated from provider version 1.119.0. New field `vswitchName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of VSwitch.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC ID. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `vpcId` is required.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The name of the VSwitch.
     */
    vswitchName?: pulumi.Input<string>;
    /**
     * The AZ for the VSwitch. **Note:** Required for a VPC VSwitch.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Switch resource.
 */
export interface SwitchArgs {
    /**
     * Field `availabilityZone` has been deprecated from provider version 1.119.0. New field `zoneId` instead.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.119.0. New field 'zone_id' instead.
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * The IPv4 CIDR block of the VSwitch. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `cidrBlock` is required.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * The description of VSwitch.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the IPv6 function is enabled in the switch. Value:
     */
    enableIpv6?: pulumi.Input<boolean>;
    /**
     * The IPv6 CIDR block of the VSwitch.
     */
    ipv6CidrBlockMask?: pulumi.Input<number>;
    /**
     * Specifies whether to create the default VSwitch. Default value: `false`. Valid values:
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Field `name` has been deprecated from provider version 1.119.0. New field `vswitchName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.119.0. New field 'vswitch_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The tags of VSwitch.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC ID. **NOTE:** From version 1.233.0, if you do not set `isDefault`, or set `isDefault` to `false`, `vpcId` is required.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The name of the VSwitch.
     */
    vswitchName?: pulumi.Input<string>;
    /**
     * The AZ for the VSwitch. **Note:** Required for a VPC VSwitch.
     */
    zoneId?: pulumi.Input<string>;
}
