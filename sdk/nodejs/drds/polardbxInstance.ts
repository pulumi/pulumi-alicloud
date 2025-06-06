// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a DRDS Polardb X Instance resource.
 *
 * For information about DRDS Polardb X Instance and how to use it, see [What is Polardb X Instance](https://www.alibabacloud.com/help/en/polardb/polardb-for-xscale/api-createdbinstance-1).
 *
 * > **NOTE:** Available since v1.211.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const example = new alicloud.vpc.Network("example", {vpcName: name});
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     vpcId: example.id,
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     cidrBlock: "172.16.0.0/24",
 *     vswitchName: name,
 * });
 * const defaultPolardbxInstance = new alicloud.drds.PolardbxInstance("default", {
 *     topologyType: "3azones",
 *     vswitchId: exampleSwitch.id,
 *     primaryZone: "ap-southeast-1a",
 *     cnNodeCount: 2,
 *     dnClass: "mysql.n4.medium.25",
 *     cnClass: "polarx.x4.medium.2e",
 *     dnNodeCount: 2,
 *     secondaryZone: "ap-southeast-1b",
 *     tertiaryZone: "ap-southeast-1c",
 *     vpcId: example.id,
 * });
 * ```
 *
 * ## Import
 *
 * DRDS Polardb X Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:drds/polardbxInstance:PolardbxInstance example <id>
 * ```
 */
export class PolardbxInstance extends pulumi.CustomResource {
    /**
     * Get an existing PolardbxInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolardbxInstanceState, opts?: pulumi.CustomResourceOptions): PolardbxInstance {
        return new PolardbxInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:drds/polardbxInstance:PolardbxInstance';

    /**
     * Returns true if the given object is an instance of PolardbxInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolardbxInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolardbxInstance.__pulumiType;
    }

    /**
     * Compute node specifications.
     */
    public readonly cnClass!: pulumi.Output<string>;
    /**
     * Number of computing nodes.
     */
    public readonly cnNodeCount!: pulumi.Output<number>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Storage node specifications.
     */
    public readonly dnClass!: pulumi.Output<string>;
    /**
     * The number of storage nodes.
     */
    public readonly dnNodeCount!: pulumi.Output<number>;
    /**
     * Primary Availability Zone.
     */
    public readonly primaryZone!: pulumi.Output<string>;
    /**
     * The resource group ID can be empty. This parameter is not supported for the time being.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Secondary availability zone.
     */
    public readonly secondaryZone!: pulumi.Output<string | undefined>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Third Availability Zone.
     */
    public readonly tertiaryZone!: pulumi.Output<string | undefined>;
    /**
     * Topology type:
     * - **3azones**: three available areas;
     * - **1azone**: Single zone.
     */
    public readonly topologyType!: pulumi.Output<string>;
    /**
     * The VPC ID.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The ID of the virtual switch.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a PolardbxInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolardbxInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolardbxInstanceArgs | PolardbxInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolardbxInstanceState | undefined;
            resourceInputs["cnClass"] = state ? state.cnClass : undefined;
            resourceInputs["cnNodeCount"] = state ? state.cnNodeCount : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["dnClass"] = state ? state.dnClass : undefined;
            resourceInputs["dnNodeCount"] = state ? state.dnNodeCount : undefined;
            resourceInputs["primaryZone"] = state ? state.primaryZone : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["secondaryZone"] = state ? state.secondaryZone : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tertiaryZone"] = state ? state.tertiaryZone : undefined;
            resourceInputs["topologyType"] = state ? state.topologyType : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as PolardbxInstanceArgs | undefined;
            if ((!args || args.cnClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cnClass'");
            }
            if ((!args || args.cnNodeCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cnNodeCount'");
            }
            if ((!args || args.dnClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dnClass'");
            }
            if ((!args || args.dnNodeCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dnNodeCount'");
            }
            if ((!args || args.primaryZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryZone'");
            }
            if ((!args || args.topologyType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topologyType'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["cnClass"] = args ? args.cnClass : undefined;
            resourceInputs["cnNodeCount"] = args ? args.cnNodeCount : undefined;
            resourceInputs["dnClass"] = args ? args.dnClass : undefined;
            resourceInputs["dnNodeCount"] = args ? args.dnNodeCount : undefined;
            resourceInputs["primaryZone"] = args ? args.primaryZone : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["secondaryZone"] = args ? args.secondaryZone : undefined;
            resourceInputs["tertiaryZone"] = args ? args.tertiaryZone : undefined;
            resourceInputs["topologyType"] = args ? args.topologyType : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolardbxInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolardbxInstance resources.
 */
export interface PolardbxInstanceState {
    /**
     * Compute node specifications.
     */
    cnClass?: pulumi.Input<string>;
    /**
     * Number of computing nodes.
     */
    cnNodeCount?: pulumi.Input<number>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Storage node specifications.
     */
    dnClass?: pulumi.Input<string>;
    /**
     * The number of storage nodes.
     */
    dnNodeCount?: pulumi.Input<number>;
    /**
     * Primary Availability Zone.
     */
    primaryZone?: pulumi.Input<string>;
    /**
     * The resource group ID can be empty. This parameter is not supported for the time being.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Secondary availability zone.
     */
    secondaryZone?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Third Availability Zone.
     */
    tertiaryZone?: pulumi.Input<string>;
    /**
     * Topology type:
     * - **3azones**: three available areas;
     * - **1azone**: Single zone.
     */
    topologyType?: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The ID of the virtual switch.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolardbxInstance resource.
 */
export interface PolardbxInstanceArgs {
    /**
     * Compute node specifications.
     */
    cnClass: pulumi.Input<string>;
    /**
     * Number of computing nodes.
     */
    cnNodeCount: pulumi.Input<number>;
    /**
     * Storage node specifications.
     */
    dnClass: pulumi.Input<string>;
    /**
     * The number of storage nodes.
     */
    dnNodeCount: pulumi.Input<number>;
    /**
     * Primary Availability Zone.
     */
    primaryZone: pulumi.Input<string>;
    /**
     * The resource group ID can be empty. This parameter is not supported for the time being.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Secondary availability zone.
     */
    secondaryZone?: pulumi.Input<string>;
    /**
     * Third Availability Zone.
     */
    tertiaryZone?: pulumi.Input<string>;
    /**
     * Topology type:
     * - **3azones**: three available areas;
     * - **1azone**: Single zone.
     */
    topologyType: pulumi.Input<string>;
    /**
     * The VPC ID.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The ID of the virtual switch.
     */
    vswitchId: pulumi.Input<string>;
}
