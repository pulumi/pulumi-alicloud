// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Create an DNS Instance resource.
 *
 * > **DEPRECATED:** This resource has been renamed to alicloud.dns.AlidnsInstance from version 1.95.0.
 *
 * > **NOTE:** Available in v1.80.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _this = new alicloud.dns.Instance("this", {
 *     dnsSecurity: "no",
 *     domainNumbers: "2",
 *     period: 1,
 *     renewPeriod: 1,
 *     renewalStatus: "ManualRenewal",
 *     versionCode: "version_personal",
 * });
 * ```
 *
 * ## Import
 *
 * DNS instance be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:dns/instance:Instance example dns-cn-v0h1ldjhfff
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * DNS security level. Valid values: `no`, `basic`, `advanced`.
     */
    public readonly dnsSecurity!: pulumi.Output<string>;
    /**
     * Number of domain names bound.
     */
    public readonly domainNumbers!: pulumi.Output<string>;
    public readonly paymentType!: pulumi.Output<string | undefined>;
    /**
     * Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
     */
    public readonly renewPeriod!: pulumi.Output<number | undefined>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
     */
    public readonly renewalStatus!: pulumi.Output<string>;
    /**
     * Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
     */
    public readonly versionCode!: pulumi.Output<string>;
    /**
     * Paid package version name.
     */
    public /*out*/ readonly versionName!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["dnsSecurity"] = state ? state.dnsSecurity : undefined;
            resourceInputs["domainNumbers"] = state ? state.domainNumbers : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["renewPeriod"] = state ? state.renewPeriod : undefined;
            resourceInputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            resourceInputs["versionCode"] = state ? state.versionCode : undefined;
            resourceInputs["versionName"] = state ? state.versionName : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.dnsSecurity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dnsSecurity'");
            }
            if ((!args || args.domainNumbers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainNumbers'");
            }
            if ((!args || args.versionCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'versionCode'");
            }
            resourceInputs["dnsSecurity"] = args ? args.dnsSecurity : undefined;
            resourceInputs["domainNumbers"] = args ? args.domainNumbers : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["renewPeriod"] = args ? args.renewPeriod : undefined;
            resourceInputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            resourceInputs["versionCode"] = args ? args.versionCode : undefined;
            resourceInputs["versionName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * DNS security level. Valid values: `no`, `basic`, `advanced`.
     */
    dnsSecurity?: pulumi.Input<string>;
    /**
     * Number of domain names bound.
     */
    domainNumbers?: pulumi.Input<string>;
    paymentType?: pulumi.Input<string>;
    /**
     * Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     */
    period?: pulumi.Input<number>;
    /**
     * Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
     */
    renewPeriod?: pulumi.Input<number>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
     */
    versionCode?: pulumi.Input<string>;
    /**
     * Paid package version name.
     */
    versionName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * DNS security level. Valid values: `no`, `basic`, `advanced`.
     */
    dnsSecurity: pulumi.Input<string>;
    /**
     * Number of domain names bound.
     */
    domainNumbers: pulumi.Input<string>;
    paymentType?: pulumi.Input<string>;
    /**
     * Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
     */
    period?: pulumi.Input<number>;
    /**
     * Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
     */
    renewPeriod?: pulumi.Input<number>;
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
     */
    renewalStatus?: pulumi.Input<string>;
    /**
     * Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
     */
    versionCode: pulumi.Input<string>;
}
