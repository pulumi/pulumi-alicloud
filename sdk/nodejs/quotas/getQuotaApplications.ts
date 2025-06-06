// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Quotas Quota Applications of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.117.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultQuotaApplication = new alicloud.quotas.QuotaApplication("default", {
 *     productCode: "vpc",
 *     noticeType: 3,
 *     effectiveTime: "2023-05-22T16:00:00Z",
 *     expireTime: "2024-09-15T00:08:32Z",
 *     desireValue: 1,
 *     reason: "",
 *     quotaActionCode: "vpc_whitelist/ha_vip_whitelist",
 *     auditMode: "Sync",
 *     envLanguage: "zh",
 *     quotaCategory: "WhiteListLabel",
 * });
 * const _default = pulumi.all([defaultQuotaApplication.quotaCategory, defaultQuotaApplication.id]).apply(([quotaCategory, id]) => alicloud.quotas.getQuotaApplicationsOutput({
 *     productCode: "vpc",
 *     enableDetails: true,
 *     quotaCategory: quotaCategory,
 *     ids: [id],
 * }));
 * ```
 */
export function getQuotaApplications(args: GetQuotaApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetQuotaApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:quotas/getQuotaApplications:getQuotaApplications", {
        "dimensions": args.dimensions,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyWord": args.keyWord,
        "outputFile": args.outputFile,
        "productCode": args.productCode,
        "quotaActionCode": args.quotaActionCode,
        "quotaCategory": args.quotaCategory,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuotaApplications.
 */
export interface GetQuotaApplicationsArgs {
    /**
     * The quota dimensions.
     */
    dimensions?: inputs.quotas.GetQuotaApplicationsDimension[];
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Application Info IDs.
     */
    ids?: string[];
    keyWord?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The product code.
     */
    productCode: string;
    /**
     * The ID of quota action.
     */
    quotaActionCode?: string;
    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`, `WhiteListLabel`.
     */
    quotaCategory?: string;
    /**
     * The status of the quota application. Valid Values: `Agree`, `Disagree` and `Process`.
     */
    status?: string;
}

/**
 * A collection of values returned by getQuotaApplications.
 */
export interface GetQuotaApplicationsResult {
    readonly applications: outputs.quotas.GetQuotaApplicationsApplication[];
    readonly dimensions?: outputs.quotas.GetQuotaApplicationsDimension[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly keyWord?: string;
    readonly outputFile?: string;
    readonly productCode: string;
    readonly quotaActionCode?: string;
    readonly quotaCategory?: string;
    readonly status?: string;
}
/**
 * This data source provides the Quotas Quota Applications of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.117.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultQuotaApplication = new alicloud.quotas.QuotaApplication("default", {
 *     productCode: "vpc",
 *     noticeType: 3,
 *     effectiveTime: "2023-05-22T16:00:00Z",
 *     expireTime: "2024-09-15T00:08:32Z",
 *     desireValue: 1,
 *     reason: "",
 *     quotaActionCode: "vpc_whitelist/ha_vip_whitelist",
 *     auditMode: "Sync",
 *     envLanguage: "zh",
 *     quotaCategory: "WhiteListLabel",
 * });
 * const _default = pulumi.all([defaultQuotaApplication.quotaCategory, defaultQuotaApplication.id]).apply(([quotaCategory, id]) => alicloud.quotas.getQuotaApplicationsOutput({
 *     productCode: "vpc",
 *     enableDetails: true,
 *     quotaCategory: quotaCategory,
 *     ids: [id],
 * }));
 * ```
 */
export function getQuotaApplicationsOutput(args: GetQuotaApplicationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetQuotaApplicationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:quotas/getQuotaApplications:getQuotaApplications", {
        "dimensions": args.dimensions,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyWord": args.keyWord,
        "outputFile": args.outputFile,
        "productCode": args.productCode,
        "quotaActionCode": args.quotaActionCode,
        "quotaCategory": args.quotaCategory,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuotaApplications.
 */
export interface GetQuotaApplicationsOutputArgs {
    /**
     * The quota dimensions.
     */
    dimensions?: pulumi.Input<pulumi.Input<inputs.quotas.GetQuotaApplicationsDimensionArgs>[]>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Application Info IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    keyWord?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The product code.
     */
    productCode: pulumi.Input<string>;
    /**
     * The ID of quota action.
     */
    quotaActionCode?: pulumi.Input<string>;
    /**
     * The quota category. Valid values: `CommonQuota`, `FlowControl`, `WhiteListLabel`.
     */
    quotaCategory?: pulumi.Input<string>;
    /**
     * The status of the quota application. Valid Values: `Agree`, `Disagree` and `Process`.
     */
    status?: pulumi.Input<string>;
}
