// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Vpc Ipam Ipam Pool resource.
 *
 * IP Address Management Pool.
 *
 * For information about Vpc Ipam Ipam Pool and how to use it, see [What is Ipam Pool](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/CreateIpamPool).
 *
 * > **NOTE:** Available since v1.234.0.
 *
 * ## Import
 *
 * Vpc Ipam Ipam Pool can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/ipamIpamPool:IpamIpamPool example <id>
 * ```
 */
export class IpamIpamPool extends pulumi.CustomResource {
    /**
     * Get an existing IpamIpamPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpamIpamPoolState, opts?: pulumi.CustomResourceOptions): IpamIpamPool {
        return new IpamIpamPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/ipamIpamPool:IpamIpamPool';

    /**
     * Returns true if the given object is an instance of IpamIpamPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpamIpamPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpamIpamPool.__pulumiType;
    }

    /**
     * The default network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    public readonly allocationDefaultCidrMask!: pulumi.Output<number | undefined>;
    /**
     * The maximum network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    public readonly allocationMaxCidrMask!: pulumi.Output<number>;
    /**
     * The minimum Network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    public readonly allocationMinCidrMask!: pulumi.Output<number | undefined>;
    /**
     * Whether the automatic import function is enabled for the address pool.
     */
    public readonly autoImport!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to clear the default network mask of the IPAM address pool. Value:
     */
    public readonly clearAllocationDefaultCidrMask!: pulumi.Output<boolean | undefined>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The IP protocol version. Currently, only `IPv4` is supported * *.
     */
    public readonly ipVersion!: pulumi.Output<string>;
    /**
     * The description of the IPAM address pool.
     * It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    public readonly ipamPoolDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource.
     */
    public readonly ipamPoolName!: pulumi.Output<string>;
    /**
     * Ipam scope id.
     */
    public readonly ipamScopeId!: pulumi.Output<string>;
    /**
     * The effective region of the IPAM address pool.
     */
    public readonly poolRegionId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the IPAM hosting region.
     */
    public /*out*/ readonly regionId!: pulumi.Output<string>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The instance ID of the source IPAM address pool.
     *
     * > **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
     */
    public readonly sourceIpamPoolId!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tag of the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a IpamIpamPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpamIpamPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpamIpamPoolArgs | IpamIpamPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpamIpamPoolState | undefined;
            resourceInputs["allocationDefaultCidrMask"] = state ? state.allocationDefaultCidrMask : undefined;
            resourceInputs["allocationMaxCidrMask"] = state ? state.allocationMaxCidrMask : undefined;
            resourceInputs["allocationMinCidrMask"] = state ? state.allocationMinCidrMask : undefined;
            resourceInputs["autoImport"] = state ? state.autoImport : undefined;
            resourceInputs["clearAllocationDefaultCidrMask"] = state ? state.clearAllocationDefaultCidrMask : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["ipVersion"] = state ? state.ipVersion : undefined;
            resourceInputs["ipamPoolDescription"] = state ? state.ipamPoolDescription : undefined;
            resourceInputs["ipamPoolName"] = state ? state.ipamPoolName : undefined;
            resourceInputs["ipamScopeId"] = state ? state.ipamScopeId : undefined;
            resourceInputs["poolRegionId"] = state ? state.poolRegionId : undefined;
            resourceInputs["regionId"] = state ? state.regionId : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["sourceIpamPoolId"] = state ? state.sourceIpamPoolId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IpamIpamPoolArgs | undefined;
            if ((!args || args.ipamScopeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipamScopeId'");
            }
            resourceInputs["allocationDefaultCidrMask"] = args ? args.allocationDefaultCidrMask : undefined;
            resourceInputs["allocationMaxCidrMask"] = args ? args.allocationMaxCidrMask : undefined;
            resourceInputs["allocationMinCidrMask"] = args ? args.allocationMinCidrMask : undefined;
            resourceInputs["autoImport"] = args ? args.autoImport : undefined;
            resourceInputs["clearAllocationDefaultCidrMask"] = args ? args.clearAllocationDefaultCidrMask : undefined;
            resourceInputs["ipVersion"] = args ? args.ipVersion : undefined;
            resourceInputs["ipamPoolDescription"] = args ? args.ipamPoolDescription : undefined;
            resourceInputs["ipamPoolName"] = args ? args.ipamPoolName : undefined;
            resourceInputs["ipamScopeId"] = args ? args.ipamScopeId : undefined;
            resourceInputs["poolRegionId"] = args ? args.poolRegionId : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["sourceIpamPoolId"] = args ? args.sourceIpamPoolId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["regionId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpamIpamPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpamIpamPool resources.
 */
export interface IpamIpamPoolState {
    /**
     * The default network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationDefaultCidrMask?: pulumi.Input<number>;
    /**
     * The maximum network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationMaxCidrMask?: pulumi.Input<number>;
    /**
     * The minimum Network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationMinCidrMask?: pulumi.Input<number>;
    /**
     * Whether the automatic import function is enabled for the address pool.
     */
    autoImport?: pulumi.Input<boolean>;
    /**
     * Whether to clear the default network mask of the IPAM address pool. Value:
     */
    clearAllocationDefaultCidrMask?: pulumi.Input<boolean>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The IP protocol version. Currently, only `IPv4` is supported * *.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The description of the IPAM address pool.
     * It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    ipamPoolDescription?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    ipamPoolName?: pulumi.Input<string>;
    /**
     * Ipam scope id.
     */
    ipamScopeId?: pulumi.Input<string>;
    /**
     * The effective region of the IPAM address pool.
     */
    poolRegionId?: pulumi.Input<string>;
    /**
     * The ID of the IPAM hosting region.
     */
    regionId?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The instance ID of the source IPAM address pool.
     *
     * > **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
     */
    sourceIpamPoolId?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IpamIpamPool resource.
 */
export interface IpamIpamPoolArgs {
    /**
     * The default network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationDefaultCidrMask?: pulumi.Input<number>;
    /**
     * The maximum network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationMaxCidrMask?: pulumi.Input<number>;
    /**
     * The minimum Network mask assigned by the IPAM address pool.
     * IPv4 network mask value range: **0 to 32** bits.
     */
    allocationMinCidrMask?: pulumi.Input<number>;
    /**
     * Whether the automatic import function is enabled for the address pool.
     */
    autoImport?: pulumi.Input<boolean>;
    /**
     * Whether to clear the default network mask of the IPAM address pool. Value:
     */
    clearAllocationDefaultCidrMask?: pulumi.Input<boolean>;
    /**
     * The IP protocol version. Currently, only `IPv4` is supported * *.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The description of the IPAM address pool.
     * It must be 2 to 256 characters in length and must start with an English letter or a Chinese character, but cannot start with 'http:// 'or 'https. If it is not filled in, it is empty. The default value is empty.
     */
    ipamPoolDescription?: pulumi.Input<string>;
    /**
     * The name of the resource.
     */
    ipamPoolName?: pulumi.Input<string>;
    /**
     * Ipam scope id.
     */
    ipamScopeId: pulumi.Input<string>;
    /**
     * The effective region of the IPAM address pool.
     */
    poolRegionId?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The instance ID of the source IPAM address pool.
     *
     * > **NOTE:**  If this parameter is not entered, the created address pool is the parent address pool.
     */
    sourceIpamPoolId?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
