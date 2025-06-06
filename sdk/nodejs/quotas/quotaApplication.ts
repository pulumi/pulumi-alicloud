// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Quotas Quota Application can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:quotas/quotaApplication:QuotaApplication example <id>
 * ```
 */
export class QuotaApplication extends pulumi.CustomResource {
    /**
     * Get an existing QuotaApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QuotaApplicationState, opts?: pulumi.CustomResourceOptions): QuotaApplication {
        return new QuotaApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:quotas/quotaApplication:QuotaApplication';

    /**
     * Returns true if the given object is an instance of QuotaApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QuotaApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QuotaApplication.__pulumiType;
    }

    /**
     * The approve value of the quota application.
     */
    public /*out*/ readonly approveValue!: pulumi.Output<string>;
    /**
     * This parameter is discontinued and is not recommended. The mode in which you want the application to be reviewed. Valid values:
     * - Sync: The application is reviewed in a synchronous manner. Quota Center automatically reviews the application. The result is returned immediately after you submit the application. However, the chance of an approval for an application that is reviewed in Sync mode is lower than the chance of an approval for an application that is reviewed in Async mode. The validity period of the new quota value is 1 hour.
     * - Async: The application is reviewed in an asynchronous manner. An Alibaba Cloud support engineer reviews the application. The chance of an approval for an application that is reviewed in Async mode is higher than the chance of an approval for an application that is reviewed in Sync mode. The validity period of the new quota value is one month.
     */
    public readonly auditMode!: pulumi.Output<string>;
    /**
     * The audit reason.
     */
    public /*out*/ readonly auditReason!: pulumi.Output<string>;
    /**
     * Resource attribute field representing creation time.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The desire value of the quota application.
     */
    public readonly desireValue!: pulumi.Output<number>;
    /**
     * QuotaDimensions. See `dimensions` below.
     */
    public readonly dimensions!: pulumi.Output<outputs.quotas.QuotaApplicationDimension[] | undefined>;
    /**
     * The effective time of the quota application.
     */
    public readonly effectiveTime!: pulumi.Output<string | undefined>;
    /**
     * The language of the quota alert notification. Value:
     * - zh (default): Chinese.
     * - en: English.
     */
    public readonly envLanguage!: pulumi.Output<string | undefined>;
    /**
     * The expired time of the quota application.
     */
    public readonly expireTime!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to send a notification about the application result. Valid values:0: sends a notification about the application result.3: A notification about the application result is sent.
     */
    public readonly noticeType!: pulumi.Output<number>;
    /**
     * The product code.
     */
    public readonly productCode!: pulumi.Output<string>;
    /**
     * The ID of quota action.
     */
    public readonly quotaActionCode!: pulumi.Output<string>;
    /**
     * The quota type.
     * - CommonQuota (default): Generic quota.
     * - FlowControl:API rate quota.
     * - WhiteListLabel: Equity quota.
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
     * Application Status:
     * - Disagree: reject.
     * - Agree: Approved.
     * - Process: under review.
     * - Cancel: Closed.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a QuotaApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QuotaApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QuotaApplicationArgs | QuotaApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QuotaApplicationState | undefined;
            resourceInputs["approveValue"] = state ? state.approveValue : undefined;
            resourceInputs["auditMode"] = state ? state.auditMode : undefined;
            resourceInputs["auditReason"] = state ? state.auditReason : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["desireValue"] = state ? state.desireValue : undefined;
            resourceInputs["dimensions"] = state ? state.dimensions : undefined;
            resourceInputs["effectiveTime"] = state ? state.effectiveTime : undefined;
            resourceInputs["envLanguage"] = state ? state.envLanguage : undefined;
            resourceInputs["expireTime"] = state ? state.expireTime : undefined;
            resourceInputs["noticeType"] = state ? state.noticeType : undefined;
            resourceInputs["productCode"] = state ? state.productCode : undefined;
            resourceInputs["quotaActionCode"] = state ? state.quotaActionCode : undefined;
            resourceInputs["quotaCategory"] = state ? state.quotaCategory : undefined;
            resourceInputs["quotaDescription"] = state ? state.quotaDescription : undefined;
            resourceInputs["quotaName"] = state ? state.quotaName : undefined;
            resourceInputs["quotaUnit"] = state ? state.quotaUnit : undefined;
            resourceInputs["reason"] = state ? state.reason : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as QuotaApplicationArgs | undefined;
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
            resourceInputs["auditMode"] = args ? args.auditMode : undefined;
            resourceInputs["desireValue"] = args ? args.desireValue : undefined;
            resourceInputs["dimensions"] = args ? args.dimensions : undefined;
            resourceInputs["effectiveTime"] = args ? args.effectiveTime : undefined;
            resourceInputs["envLanguage"] = args ? args.envLanguage : undefined;
            resourceInputs["expireTime"] = args ? args.expireTime : undefined;
            resourceInputs["noticeType"] = args ? args.noticeType : undefined;
            resourceInputs["productCode"] = args ? args.productCode : undefined;
            resourceInputs["quotaActionCode"] = args ? args.quotaActionCode : undefined;
            resourceInputs["quotaCategory"] = args ? args.quotaCategory : undefined;
            resourceInputs["reason"] = args ? args.reason : undefined;
            resourceInputs["approveValue"] = undefined /*out*/;
            resourceInputs["auditReason"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["quotaDescription"] = undefined /*out*/;
            resourceInputs["quotaName"] = undefined /*out*/;
            resourceInputs["quotaUnit"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QuotaApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QuotaApplication resources.
 */
export interface QuotaApplicationState {
    /**
     * The approve value of the quota application.
     */
    approveValue?: pulumi.Input<string>;
    /**
     * This parameter is discontinued and is not recommended. The mode in which you want the application to be reviewed. Valid values:
     * - Sync: The application is reviewed in a synchronous manner. Quota Center automatically reviews the application. The result is returned immediately after you submit the application. However, the chance of an approval for an application that is reviewed in Sync mode is lower than the chance of an approval for an application that is reviewed in Async mode. The validity period of the new quota value is 1 hour.
     * - Async: The application is reviewed in an asynchronous manner. An Alibaba Cloud support engineer reviews the application. The chance of an approval for an application that is reviewed in Async mode is higher than the chance of an approval for an application that is reviewed in Sync mode. The validity period of the new quota value is one month.
     */
    auditMode?: pulumi.Input<string>;
    /**
     * The audit reason.
     */
    auditReason?: pulumi.Input<string>;
    /**
     * Resource attribute field representing creation time.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The desire value of the quota application.
     */
    desireValue?: pulumi.Input<number>;
    /**
     * QuotaDimensions. See `dimensions` below.
     */
    dimensions?: pulumi.Input<pulumi.Input<inputs.quotas.QuotaApplicationDimension>[]>;
    /**
     * The effective time of the quota application.
     */
    effectiveTime?: pulumi.Input<string>;
    /**
     * The language of the quota alert notification. Value:
     * - zh (default): Chinese.
     * - en: English.
     */
    envLanguage?: pulumi.Input<string>;
    /**
     * The expired time of the quota application.
     */
    expireTime?: pulumi.Input<string>;
    /**
     * Specifies whether to send a notification about the application result. Valid values:0: sends a notification about the application result.3: A notification about the application result is sent.
     */
    noticeType?: pulumi.Input<number>;
    /**
     * The product code.
     */
    productCode?: pulumi.Input<string>;
    /**
     * The ID of quota action.
     */
    quotaActionCode?: pulumi.Input<string>;
    /**
     * The quota type.
     * - CommonQuota (default): Generic quota.
     * - FlowControl:API rate quota.
     * - WhiteListLabel: Equity quota.
     */
    quotaCategory?: pulumi.Input<string>;
    /**
     * The description of the quota application.
     */
    quotaDescription?: pulumi.Input<string>;
    /**
     * The name of the quota application.
     */
    quotaName?: pulumi.Input<string>;
    /**
     * The unit of the quota application.
     */
    quotaUnit?: pulumi.Input<string>;
    /**
     * The reason of the quota application.
     */
    reason?: pulumi.Input<string>;
    /**
     * Application Status:
     * - Disagree: reject.
     * - Agree: Approved.
     * - Process: under review.
     * - Cancel: Closed.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QuotaApplication resource.
 */
export interface QuotaApplicationArgs {
    /**
     * This parameter is discontinued and is not recommended. The mode in which you want the application to be reviewed. Valid values:
     * - Sync: The application is reviewed in a synchronous manner. Quota Center automatically reviews the application. The result is returned immediately after you submit the application. However, the chance of an approval for an application that is reviewed in Sync mode is lower than the chance of an approval for an application that is reviewed in Async mode. The validity period of the new quota value is 1 hour.
     * - Async: The application is reviewed in an asynchronous manner. An Alibaba Cloud support engineer reviews the application. The chance of an approval for an application that is reviewed in Async mode is higher than the chance of an approval for an application that is reviewed in Sync mode. The validity period of the new quota value is one month.
     */
    auditMode?: pulumi.Input<string>;
    /**
     * The desire value of the quota application.
     */
    desireValue: pulumi.Input<number>;
    /**
     * QuotaDimensions. See `dimensions` below.
     */
    dimensions?: pulumi.Input<pulumi.Input<inputs.quotas.QuotaApplicationDimension>[]>;
    /**
     * The effective time of the quota application.
     */
    effectiveTime?: pulumi.Input<string>;
    /**
     * The language of the quota alert notification. Value:
     * - zh (default): Chinese.
     * - en: English.
     */
    envLanguage?: pulumi.Input<string>;
    /**
     * The expired time of the quota application.
     */
    expireTime?: pulumi.Input<string>;
    /**
     * Specifies whether to send a notification about the application result. Valid values:0: sends a notification about the application result.3: A notification about the application result is sent.
     */
    noticeType?: pulumi.Input<number>;
    /**
     * The product code.
     */
    productCode: pulumi.Input<string>;
    /**
     * The ID of quota action.
     */
    quotaActionCode: pulumi.Input<string>;
    /**
     * The quota type.
     * - CommonQuota (default): Generic quota.
     * - FlowControl:API rate quota.
     * - WhiteListLabel: Equity quota.
     */
    quotaCategory?: pulumi.Input<string>;
    /**
     * The reason of the quota application.
     */
    reason: pulumi.Input<string>;
}
