// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cloud Monitor Service Site Monitor available to the user.[What is Site Monitor](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor)
 *
 * > **NOTE:** Available since v1.224.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf_example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultSiteMonitor = new alicloud.cms.SiteMonitor("default", {
 *     address: "http://www.alibabacloud.com",
 *     taskName: `terraform-example-${defaultInteger.result}`,
 *     taskType: "HTTP",
 *     interval: 5,
 *     ispCities: [{
 *         city: "546",
 *         isp: "465",
 *     }],
 *     optionsJson: `{
 *     "http_method": "get",
 *     "waitTime_after_completion": null,
 *     "ipv6_task": false,
 *     "diagnosis_ping": false,
 *     "diagnosis_mtr": false,
 *     "assertions": [
 *         {
 *             "operator": "lessThan",
 *             "type": "response_time",
 *             "target": 1000
 *         }
 *     ],
 *     "time_out": 30000
 * }
 * `,
 * });
 * const _default = alicloud.cms.getSiteMonitorsOutput({
 *     ids: [defaultSiteMonitor.id],
 *     taskType: "HTTP",
 * });
 * export const alicloudCmsSiteMonitorExampleId = _default.apply(_default => _default.monitors?.[0]?.taskId);
 * ```
 */
export function getSiteMonitors(args?: GetSiteMonitorsArgs, opts?: pulumi.InvokeOptions): Promise<GetSiteMonitorsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cms/getSiteMonitors:getSiteMonitors", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "taskId": args.taskId,
        "taskType": args.taskType,
    }, opts);
}

/**
 * A collection of arguments for invoking getSiteMonitors.
 */
export interface GetSiteMonitorsArgs {
    /**
     * A list of Site Monitor IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Task ID.
     */
    taskId?: string;
    /**
     * Task Type.
     */
    taskType?: string;
}

/**
 * A collection of values returned by getSiteMonitors.
 */
export interface GetSiteMonitorsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Site Monitor IDs.
     */
    readonly ids: string[];
    /**
     * A list of Site Monitor Entries. Each element contains the following attributes:
     */
    readonly monitors: outputs.cms.GetSiteMonitorsMonitor[];
    readonly outputFile?: string;
    /**
     * Task Id.
     */
    readonly taskId?: string;
    /**
     * Task Type.
     */
    readonly taskType?: string;
}
/**
 * This data source provides Cloud Monitor Service Site Monitor available to the user.[What is Site Monitor](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor)
 *
 * > **NOTE:** Available since v1.224.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf_example";
 * const defaultInteger = new random.index.Integer("default", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultSiteMonitor = new alicloud.cms.SiteMonitor("default", {
 *     address: "http://www.alibabacloud.com",
 *     taskName: `terraform-example-${defaultInteger.result}`,
 *     taskType: "HTTP",
 *     interval: 5,
 *     ispCities: [{
 *         city: "546",
 *         isp: "465",
 *     }],
 *     optionsJson: `{
 *     "http_method": "get",
 *     "waitTime_after_completion": null,
 *     "ipv6_task": false,
 *     "diagnosis_ping": false,
 *     "diagnosis_mtr": false,
 *     "assertions": [
 *         {
 *             "operator": "lessThan",
 *             "type": "response_time",
 *             "target": 1000
 *         }
 *     ],
 *     "time_out": 30000
 * }
 * `,
 * });
 * const _default = alicloud.cms.getSiteMonitorsOutput({
 *     ids: [defaultSiteMonitor.id],
 *     taskType: "HTTP",
 * });
 * export const alicloudCmsSiteMonitorExampleId = _default.apply(_default => _default.monitors?.[0]?.taskId);
 * ```
 */
export function getSiteMonitorsOutput(args?: GetSiteMonitorsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSiteMonitorsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cms/getSiteMonitors:getSiteMonitors", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "taskId": args.taskId,
        "taskType": args.taskType,
    }, opts);
}

/**
 * A collection of arguments for invoking getSiteMonitors.
 */
export interface GetSiteMonitorsOutputArgs {
    /**
     * A list of Site Monitor IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Task ID.
     */
    taskId?: pulumi.Input<string>;
    /**
     * Task Type.
     */
    taskType?: pulumi.Input<string>;
}
