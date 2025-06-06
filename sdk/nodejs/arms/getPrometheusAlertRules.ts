// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Arms Prometheus Alert Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.arms.getPrometheusAlertRules({
 *     clusterId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const armsPrometheusAlertRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * const nameRegex = alicloud.arms.getPrometheusAlertRules({
 *     clusterId: "example_value",
 *     nameRegex: "^my-PrometheusAlertRule",
 * });
 * export const armsPrometheusAlertRuleId2 = nameRegex.then(nameRegex => nameRegex.rules?.[0]?.id);
 * ```
 */
export function getPrometheusAlertRules(args: GetPrometheusAlertRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetPrometheusAlertRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:arms/getPrometheusAlertRules:getPrometheusAlertRules", {
        "clusterId": args.clusterId,
        "ids": args.ids,
        "matchExpressions": args.matchExpressions,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrometheusAlertRules.
 */
export interface GetPrometheusAlertRulesArgs {
    /**
     * The ID of the cluster.
     */
    clusterId: string;
    /**
     * A list of Prometheus Alert Rule IDs.
     */
    ids?: string[];
    matchExpressions?: string;
    /**
     * A regex string to filter results by Prometheus Alert Rule name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the resource. Valid values: `0`, `1`.
     */
    status?: number;
    /**
     * The type of the alert rule.
     */
    type?: string;
}

/**
 * A collection of values returned by getPrometheusAlertRules.
 */
export interface GetPrometheusAlertRulesResult {
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly matchExpressions?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly rules: outputs.arms.GetPrometheusAlertRulesRule[];
    readonly status?: number;
    readonly type?: string;
}
/**
 * This data source provides the Arms Prometheus Alert Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.arms.getPrometheusAlertRules({
 *     clusterId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const armsPrometheusAlertRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * const nameRegex = alicloud.arms.getPrometheusAlertRules({
 *     clusterId: "example_value",
 *     nameRegex: "^my-PrometheusAlertRule",
 * });
 * export const armsPrometheusAlertRuleId2 = nameRegex.then(nameRegex => nameRegex.rules?.[0]?.id);
 * ```
 */
export function getPrometheusAlertRulesOutput(args: GetPrometheusAlertRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrometheusAlertRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:arms/getPrometheusAlertRules:getPrometheusAlertRules", {
        "clusterId": args.clusterId,
        "ids": args.ids,
        "matchExpressions": args.matchExpressions,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrometheusAlertRules.
 */
export interface GetPrometheusAlertRulesOutputArgs {
    /**
     * The ID of the cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A list of Prometheus Alert Rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    matchExpressions?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Prometheus Alert Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `0`, `1`.
     */
    status?: pulumi.Input<number>;
    /**
     * The type of the alert rule.
     */
    type?: pulumi.Input<string>;
}
