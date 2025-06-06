// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator (GA) Basic Accelerator resource.
 *
 * For information about Global Accelerator (GA) Basic Accelerator and how to use it, see [What is Basic Accelerator](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createbasicaccelerator).
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
 * const _default = new alicloud.ga.BasicAccelerator("default", {
 *     duration: 1,
 *     pricingCycle: "Month",
 *     basicAcceleratorName: "tf-example-value",
 *     description: "tf-example-value",
 *     bandwidthBillingType: "BandwidthPackage",
 *     autoPay: true,
 *     autoUseCoupon: "true",
 * });
 * ```
 *
 * ## Import
 *
 * Global Accelerator (GA) Basic Accelerator can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ga/basicAccelerator:BasicAccelerator example <id>
 * ```
 */
export class BasicAccelerator extends pulumi.CustomResource {
    /**
     * Get an existing BasicAccelerator resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BasicAcceleratorState, opts?: pulumi.CustomResourceOptions): BasicAccelerator {
        return new BasicAccelerator(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ga/basicAccelerator:BasicAccelerator';

    /**
     * Returns true if the given object is an instance of BasicAccelerator.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BasicAccelerator {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BasicAccelerator.__pulumiType;
    }

    /**
     * Specifies whether to enable automatic payment. Default value: `false`. Valid values:
     */
    public readonly autoPay!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The auto-renewal period. Unit: months. Default value: `1`. Valid values: `1` to `12`. **NOTE:** This parameter is required only if `autoRenew` is set to `true`.
     */
    public readonly autoRenewDuration!: pulumi.Output<number | undefined>;
    /**
     * Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `autoPay` is set to `true`.
     */
    public readonly autoUseCoupon!: pulumi.Output<string | undefined>;
    /**
     * The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
     */
    public readonly bandwidthBillingType!: pulumi.Output<string | undefined>;
    /**
     * The name of the Global Accelerator Basic Accelerator instance.
     */
    public readonly basicAcceleratorName!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether cross-border acceleration is enabled. Default value: `false`. Valid values:
     */
    public readonly crossBorderStatus!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the Global Accelerator Basic Accelerator instance.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The subscription duration. Default value: `1`.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
     */
    public readonly duration!: pulumi.Output<number | undefined>;
    /**
     * The payment type. Default value: `Subscription`. Valid values: `PayAsYouGo`, `Subscription`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
     */
    public readonly pricingCycle!: pulumi.Output<string | undefined>;
    /**
     * The code of the coupon. **NOTE:** The `promotionOptionNo` takes effect only for accounts registered on the international site (alibabacloud.com).
     */
    public readonly promotionOptionNo!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of the Basic Accelerator instance.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a BasicAccelerator resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BasicAcceleratorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BasicAcceleratorArgs | BasicAcceleratorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BasicAcceleratorState | undefined;
            resourceInputs["autoPay"] = state ? state.autoPay : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["autoRenewDuration"] = state ? state.autoRenewDuration : undefined;
            resourceInputs["autoUseCoupon"] = state ? state.autoUseCoupon : undefined;
            resourceInputs["bandwidthBillingType"] = state ? state.bandwidthBillingType : undefined;
            resourceInputs["basicAcceleratorName"] = state ? state.basicAcceleratorName : undefined;
            resourceInputs["crossBorderStatus"] = state ? state.crossBorderStatus : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["duration"] = state ? state.duration : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["pricingCycle"] = state ? state.pricingCycle : undefined;
            resourceInputs["promotionOptionNo"] = state ? state.promotionOptionNo : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as BasicAcceleratorArgs | undefined;
            resourceInputs["autoPay"] = args ? args.autoPay : undefined;
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["autoRenewDuration"] = args ? args.autoRenewDuration : undefined;
            resourceInputs["autoUseCoupon"] = args ? args.autoUseCoupon : undefined;
            resourceInputs["bandwidthBillingType"] = args ? args.bandwidthBillingType : undefined;
            resourceInputs["basicAcceleratorName"] = args ? args.basicAcceleratorName : undefined;
            resourceInputs["crossBorderStatus"] = args ? args.crossBorderStatus : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["duration"] = args ? args.duration : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["pricingCycle"] = args ? args.pricingCycle : undefined;
            resourceInputs["promotionOptionNo"] = args ? args.promotionOptionNo : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BasicAccelerator.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BasicAccelerator resources.
 */
export interface BasicAcceleratorState {
    /**
     * Specifies whether to enable automatic payment. Default value: `false`. Valid values:
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The auto-renewal period. Unit: months. Default value: `1`. Valid values: `1` to `12`. **NOTE:** This parameter is required only if `autoRenew` is set to `true`.
     */
    autoRenewDuration?: pulumi.Input<number>;
    /**
     * Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `autoPay` is set to `true`.
     */
    autoUseCoupon?: pulumi.Input<string>;
    /**
     * The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
     */
    bandwidthBillingType?: pulumi.Input<string>;
    /**
     * The name of the Global Accelerator Basic Accelerator instance.
     */
    basicAcceleratorName?: pulumi.Input<string>;
    /**
     * Indicates whether cross-border acceleration is enabled. Default value: `false`. Valid values:
     */
    crossBorderStatus?: pulumi.Input<boolean>;
    /**
     * The description of the Global Accelerator Basic Accelerator instance.
     */
    description?: pulumi.Input<string>;
    /**
     * The subscription duration. Default value: `1`.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
     */
    duration?: pulumi.Input<number>;
    /**
     * The payment type. Default value: `Subscription`. Valid values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * The code of the coupon. **NOTE:** The `promotionOptionNo` takes effect only for accounts registered on the international site (alibabacloud.com).
     */
    promotionOptionNo?: pulumi.Input<string>;
    /**
     * The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the Basic Accelerator instance.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a BasicAccelerator resource.
 */
export interface BasicAcceleratorArgs {
    /**
     * Specifies whether to enable automatic payment. Default value: `false`. Valid values:
     */
    autoPay?: pulumi.Input<boolean>;
    /**
     * Specifies whether to enable auto-renewal for the GA Basic Accelerator instance. Default value: `false`. Valid values:
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The auto-renewal period. Unit: months. Default value: `1`. Valid values: `1` to `12`. **NOTE:** This parameter is required only if `autoRenew` is set to `true`.
     */
    autoRenewDuration?: pulumi.Input<number>;
    /**
     * Specifies whether to automatically pay bills by using coupons. Default value: `false`. **NOTE:** This parameter is required only if `autoPay` is set to `true`.
     */
    autoUseCoupon?: pulumi.Input<string>;
    /**
     * The bandwidth billing method. Valid values: `BandwidthPackage`, `CDT`, `CDT95`.
     */
    bandwidthBillingType?: pulumi.Input<string>;
    /**
     * The name of the Global Accelerator Basic Accelerator instance.
     */
    basicAcceleratorName?: pulumi.Input<string>;
    /**
     * Indicates whether cross-border acceleration is enabled. Default value: `false`. Valid values:
     */
    crossBorderStatus?: pulumi.Input<boolean>;
    /**
     * The description of the Global Accelerator Basic Accelerator instance.
     */
    description?: pulumi.Input<string>;
    /**
     * The subscription duration. Default value: `1`.
     * * If the `pricingCycle` parameter is set to `Month`, the valid values for the `duration` parameter are `1` to `9`.
     * * If the `pricingCycle` parameter is set to `Year`, the valid values for the `duration` parameter are `1` to `3`.
     */
    duration?: pulumi.Input<number>;
    /**
     * The payment type. Default value: `Subscription`. Valid values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The billing cycle. Default value: `Month`. Valid values: `Month`, `Year`.
     */
    pricingCycle?: pulumi.Input<string>;
    /**
     * The code of the coupon. **NOTE:** The `promotionOptionNo` takes effect only for accounts registered on the international site (alibabacloud.com).
     */
    promotionOptionNo?: pulumi.Input<string>;
    /**
     * The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
