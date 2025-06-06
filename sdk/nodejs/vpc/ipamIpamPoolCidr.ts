// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Vpc Ipam Ipam Pool Cidr resource.
 *
 * Ipam address pool preset CIDR.
 *
 * For information about Vpc Ipam Ipam Pool Cidr and how to use it, see [What is Ipam Pool Cidr](https://next.api.alibabacloud.com/document/VpcIpam/2023-02-28/AddIpamPoolCidr).
 *
 * > **NOTE:** Available since v1.234.0.
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
 * const defaultIpam = new alicloud.vpc.IpamIpam("defaultIpam", {operatingRegionLists: ["cn-hangzhou"]});
 * const defaultIpamPool = new alicloud.vpc.IpamIpamPool("defaultIpamPool", {
 *     ipamScopeId: defaultIpam.privateDefaultScopeId,
 *     poolRegionId: defaultIpam.regionId,
 *     ipVersion: "IPv4",
 * });
 * const _default = new alicloud.vpc.IpamIpamPoolCidr("default", {
 *     cidr: "10.0.0.0/8",
 *     ipamPoolId: defaultIpamPool.id,
 * });
 * ```
 *
 * ## Import
 *
 * Vpc Ipam Ipam Pool Cidr can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/ipamIpamPoolCidr:IpamIpamPoolCidr example <ipam_pool_id>:<cidr>
 * ```
 */
export class IpamIpamPoolCidr extends pulumi.CustomResource {
    /**
     * Get an existing IpamIpamPoolCidr resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpamIpamPoolCidrState, opts?: pulumi.CustomResourceOptions): IpamIpamPoolCidr {
        return new IpamIpamPoolCidr(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/ipamIpamPoolCidr:IpamIpamPoolCidr';

    /**
     * Returns true if the given object is an instance of IpamIpamPoolCidr.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpamIpamPoolCidr {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpamIpamPoolCidr.__pulumiType;
    }

    /**
     * The CIDR address segment to be preset.
     *
     * > **NOTE:**  currently, only IPv4 address segments are supported.
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * The ID of the IPAM pool instance.
     */
    public readonly ipamPoolId!: pulumi.Output<string>;
    /**
     * The status of the resource
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a IpamIpamPoolCidr resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpamIpamPoolCidrArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpamIpamPoolCidrArgs | IpamIpamPoolCidrState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpamIpamPoolCidrState | undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["ipamPoolId"] = state ? state.ipamPoolId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as IpamIpamPoolCidrArgs | undefined;
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            if ((!args || args.ipamPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipamPoolId'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["ipamPoolId"] = args ? args.ipamPoolId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpamIpamPoolCidr.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpamIpamPoolCidr resources.
 */
export interface IpamIpamPoolCidrState {
    /**
     * The CIDR address segment to be preset.
     *
     * > **NOTE:**  currently, only IPv4 address segments are supported.
     */
    cidr?: pulumi.Input<string>;
    /**
     * The ID of the IPAM pool instance.
     */
    ipamPoolId?: pulumi.Input<string>;
    /**
     * The status of the resource
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpamIpamPoolCidr resource.
 */
export interface IpamIpamPoolCidrArgs {
    /**
     * The CIDR address segment to be preset.
     *
     * > **NOTE:**  currently, only IPv4 address segments are supported.
     */
    cidr: pulumi.Input<string>;
    /**
     * The ID of the IPAM pool instance.
     */
    ipamPoolId: pulumi.Input<string>;
}
