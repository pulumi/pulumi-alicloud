// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Quotas Application Info resource.
 *
 * For information about Quotas Application Info and how to use it, see [What is Application Info](https://help.aliyun.com/document_detail/171289.html).
 *
 * > **NOTE:** Available in v1.115.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.quotas.ApplicationInfo("example", {
 *     desireValue: 100,
 *     dimensions: [{
 *         key: "regionId",
 *         value: "cn-hangzhou",
 *     }],
 *     noticeType: 0,
 *     productCode: "ess",
 *     quotaActionCode: "q_db_instance",
 *     reason: "For Terraform Test",
 * });
 * ```
 *
 * ## Import
 *
 * Quotas Application Info can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:quotas/applicationInfo:ApplicationInfo example <id>
 * ```
 */
export class ApplicationInfo extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationInfo resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationInfoState, opts?: pulumi.CustomResourceOptions): ApplicationInfo {
        return new ApplicationInfo(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:quotas/applicationInfo:ApplicationInfo';

    /**
     * Returns true if the given object is an instance of ApplicationInfo.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationInfo {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationInfo.__pulumiType;
    }

    /**
     * The approve value of the quota application.
     */
    public /*out*/ readonly approveValue!: pulumi.Output<string>;
    /**
     * The audit mode. Valid values: `Async`, `Sync`. Default to: `Async`.
     */
    public readonly auditMode!: pulumi.Output<string | undefined>;
    /**
     * The audit reason.
     */
    public /*out*/ readonly auditReason!: pulumi.Output<string>;
    /**
     * The desire value of the quota application.
     */
    public readonly desireValue!: pulumi.Output<number>;
    /**
     * The quota dimensions.
     */
    public readonly dimensions!: pulumi.Output<outputs.quotas.ApplicationInfoDimension[] | undefined>;
    /**
     * The effective time of the quota application.
     */
    public /*out*/ readonly effectiveTime!: pulumi.Output<string>;
    /**
     * The expire time of the quota application.
     */
    public /*out*/ readonly expireTime!: pulumi.Output<string>;
    /**
     * The notice type. Valid values: `0`, `1`, `2`, `3`.
     */
    public readonly noticeType!: pulumi.Output<number | undefined>;
    /**
     * The product code.
     */
    public readonly productCode!: pulumi.Output<string>;
    /**
     * The ID of quota action.
     */
    public readonly quotaActionCode!: pulumi.Output<string>;
    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`.
     */
    public readonly quotaCategory!: pulumi.Output<string | undefined>;
    /**
     * The description of the quota application.
     */
    public /*out*/ readonly quotaDescription!: pulumi.Output<string>;
    /**
     * The name of the quota application.
     */
    public /*out*/ readonly quotaName!: pulumi.Output<string>;
    /**
     * The unit of the quota application.
     */
    public /*out*/ readonly quotaUnit!: pulumi.Output<string>;
    /**
     * The reason of the quota application.
     */
    public readonly reason!: pulumi.Output<string>;
    /**
     * The status of the quota application.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ApplicationInfo resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationInfoArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationInfoArgs | ApplicationInfoState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationInfoState | undefined;
            inputs["approveValue"] = state ? state.approveValue : undefined;
            inputs["auditMode"] = state ? state.auditMode : undefined;
            inputs["auditReason"] = state ? state.auditReason : undefined;
            inputs["desireValue"] = state ? state.desireValue : undefined;
            inputs["dimensions"] = state ? state.dimensions : undefined;
            inputs["effectiveTime"] = state ? state.effectiveTime : undefined;
            inputs["expireTime"] = state ? state.expireTime : undefined;
            inputs["noticeType"] = state ? state.noticeType : undefined;
            inputs["productCode"] = state ? state.productCode : undefined;
            inputs["quotaActionCode"] = state ? state.quotaActionCode : undefined;
            inputs["quotaCategory"] = state ? state.quotaCategory : undefined;
            inputs["quotaDescription"] = state ? state.quotaDescription : undefined;
            inputs["quotaName"] = state ? state.quotaName : undefined;
            inputs["quotaUnit"] = state ? state.quotaUnit : undefined;
            inputs["reason"] = state ? state.reason : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ApplicationInfoArgs | undefined;
            if ((!args || args.desireValue === undefined) && !opts.urn) {
                throw new Error("Missing required property 'desireValue'");
            }
            if ((!args || args.productCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productCode'");
            }
            if ((!args || args.quotaActionCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quotaActionCode'");
            }
            if ((!args || args.reason === undefined) && !opts.urn) {
                throw new Error("Missing required property 'reason'");
            }
            inputs["auditMode"] = args ? args.auditMode : undefined;
            inputs["desireValue"] = args ? args.desireValue : undefined;
            inputs["dimensions"] = args ? args.dimensions : undefined;
            inputs["noticeType"] = args ? args.noticeType : undefined;
            inputs["productCode"] = args ? args.productCode : undefined;
            inputs["quotaActionCode"] = args ? args.quotaActionCode : undefined;
            inputs["quotaCategory"] = args ? args.quotaCategory : undefined;
            inputs["reason"] = args ? args.reason : undefined;
            inputs["approveValue"] = undefined /*out*/;
            inputs["auditReason"] = undefined /*out*/;
            inputs["effectiveTime"] = undefined /*out*/;
            inputs["expireTime"] = undefined /*out*/;
            inputs["quotaDescription"] = undefined /*out*/;
            inputs["quotaName"] = undefined /*out*/;
            inputs["quotaUnit"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ApplicationInfo.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationInfo resources.
 */
export interface ApplicationInfoState {
    /**
     * The approve value of the quota application.
     */
    readonly approveValue?: pulumi.Input<string>;
    /**
     * The audit mode. Valid values: `Async`, `Sync`. Default to: `Async`.
     */
    readonly auditMode?: pulumi.Input<string>;
    /**
     * The audit reason.
     */
    readonly auditReason?: pulumi.Input<string>;
    /**
     * The desire value of the quota application.
     */
    readonly desireValue?: pulumi.Input<number>;
    /**
     * The quota dimensions.
     */
    readonly dimensions?: pulumi.Input<pulumi.Input<inputs.quotas.ApplicationInfoDimension>[]>;
    /**
     * The effective time of the quota application.
     */
    readonly effectiveTime?: pulumi.Input<string>;
    /**
     * The expire time of the quota application.
     */
    readonly expireTime?: pulumi.Input<string>;
    /**
     * The notice type. Valid values: `0`, `1`, `2`, `3`.
     */
    readonly noticeType?: pulumi.Input<number>;
    /**
     * The product code.
     */
    readonly productCode?: pulumi.Input<string>;
    /**
     * The ID of quota action.
     */
    readonly quotaActionCode?: pulumi.Input<string>;
    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`.
     */
    readonly quotaCategory?: pulumi.Input<string>;
    /**
     * The description of the quota application.
     */
    readonly quotaDescription?: pulumi.Input<string>;
    /**
     * The name of the quota application.
     */
    readonly quotaName?: pulumi.Input<string>;
    /**
     * The unit of the quota application.
     */
    readonly quotaUnit?: pulumi.Input<string>;
    /**
     * The reason of the quota application.
     */
    readonly reason?: pulumi.Input<string>;
    /**
     * The status of the quota application.
     */
    readonly status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplicationInfo resource.
 */
export interface ApplicationInfoArgs {
    /**
     * The audit mode. Valid values: `Async`, `Sync`. Default to: `Async`.
     */
    readonly auditMode?: pulumi.Input<string>;
    /**
     * The desire value of the quota application.
     */
    readonly desireValue: pulumi.Input<number>;
    /**
     * The quota dimensions.
     */
    readonly dimensions?: pulumi.Input<pulumi.Input<inputs.quotas.ApplicationInfoDimension>[]>;
    /**
     * The notice type. Valid values: `0`, `1`, `2`, `3`.
     */
    readonly noticeType?: pulumi.Input<number>;
    /**
     * The product code.
     */
    readonly productCode: pulumi.Input<string>;
    /**
     * The ID of quota action.
     */
    readonly quotaActionCode: pulumi.Input<string>;
    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`.
     */
    readonly quotaCategory?: pulumi.Input<string>;
    /**
     * The reason of the quota application.
     */
    readonly reason: pulumi.Input<string>;
}