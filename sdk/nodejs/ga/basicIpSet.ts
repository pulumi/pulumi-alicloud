// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator (GA) Basic Ip Set resource.
 *
 * For information about Global Accelerator (GA) Basic Ip Set and how to use it, see [What is Basic Ip Set](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createbasicipset).
 *
 * > **NOTE:** Available since v1.194.0.
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
 * const region = config.get("region") || "cn-hangzhou";
 * const _default = new alicloud.ga.BasicAccelerator("default", {
 *     duration: 1,
 *     pricingCycle: "Month",
 *     bandwidthBillingType: "CDT",
 *     autoPay: true,
 *     autoUseCoupon: "true",
 *     autoRenew: false,
 *     autoRenewDuration: 1,
 * });
 * const defaultBasicIpSet = new alicloud.ga.BasicIpSet("default", {
 *     acceleratorId: _default.id,
 *     accelerateRegionId: region,
 *     ispType: "BGP",
 *     bandwidth: 5,
 * });
 * ```
 *
 * ## Import
 *
 * Global Accelerator (GA) Basic Ip Set can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ga/basicIpSet:BasicIpSet example <id>
 * ```
 */
export class BasicIpSet extends pulumi.CustomResource {
    /**
     * Get an existing BasicIpSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BasicIpSetState, opts?: pulumi.CustomResourceOptions): BasicIpSet {
        return new BasicIpSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ga/basicIpSet:BasicIpSet';

    /**
     * Returns true if the given object is an instance of BasicIpSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BasicIpSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BasicIpSet.__pulumiType;
    }

    /**
     * The ID of the acceleration region.
     */
    public readonly accelerateRegionId!: pulumi.Output<string>;
    /**
     * The ID of the basic GA instance.
     */
    public readonly acceleratorId!: pulumi.Output<string>;
    /**
     * The bandwidth of the acceleration region. Unit: Mbit/s.
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     */
    public readonly ispType!: pulumi.Output<string>;
    /**
     * The status of the Basic Ip Set instance.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a BasicIpSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BasicIpSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BasicIpSetArgs | BasicIpSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BasicIpSetState | undefined;
            resourceInputs["accelerateRegionId"] = state ? state.accelerateRegionId : undefined;
            resourceInputs["acceleratorId"] = state ? state.acceleratorId : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["ispType"] = state ? state.ispType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as BasicIpSetArgs | undefined;
            if ((!args || args.accelerateRegionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accelerateRegionId'");
            }
            if ((!args || args.acceleratorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceleratorId'");
            }
            resourceInputs["accelerateRegionId"] = args ? args.accelerateRegionId : undefined;
            resourceInputs["acceleratorId"] = args ? args.acceleratorId : undefined;
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["ispType"] = args ? args.ispType : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BasicIpSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BasicIpSet resources.
 */
export interface BasicIpSetState {
    /**
     * The ID of the acceleration region.
     */
    accelerateRegionId?: pulumi.Input<string>;
    /**
     * The ID of the basic GA instance.
     */
    acceleratorId?: pulumi.Input<string>;
    /**
     * The bandwidth of the acceleration region. Unit: Mbit/s.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     */
    ispType?: pulumi.Input<string>;
    /**
     * The status of the Basic Ip Set instance.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BasicIpSet resource.
 */
export interface BasicIpSetArgs {
    /**
     * The ID of the acceleration region.
     */
    accelerateRegionId: pulumi.Input<string>;
    /**
     * The ID of the basic GA instance.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The bandwidth of the acceleration region. Unit: Mbit/s.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Default value: `BGP`. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`.
     */
    ispType?: pulumi.Input<string>;
}
