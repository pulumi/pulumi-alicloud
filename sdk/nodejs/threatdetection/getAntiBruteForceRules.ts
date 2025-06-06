// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Threat Detection Anti Brute Force Rule available to the user.[What is Anti Brute Force Rule](https://www.alibabacloud.com/help/en/security-center/latest/api-sas-2018-12-03-createantibruteforcerule)
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "example_value";
 * const defaultAntiBruteForceRule = new alicloud.threatdetection.AntiBruteForceRule("default", {
 *     antiBruteForceRuleName: name,
 *     forbiddenTime: 360,
 *     uuidLists: ["7567806c-4ec5-4597-9543-7c9543381a13"],
 *     failCount: 80,
 *     span: 10,
 * });
 * const _default = defaultAntiBruteForceRule.id.apply(id => alicloud.threatdetection.getAntiBruteForceRulesOutput({
 *     ids: [id],
 *     nameRegex: defaultAntiBruteForceRule.name,
 * }));
 * export const alicloudThreatDetectionAntiBruteForceRuleExampleId = _default.apply(_default => _default.rules?.[0]?.id);
 * ```
 */
export function getAntiBruteForceRules(args?: GetAntiBruteForceRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetAntiBruteForceRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:threatdetection/getAntiBruteForceRules:getAntiBruteForceRules", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAntiBruteForceRules.
 */
export interface GetAntiBruteForceRulesArgs {
    /**
     * A list of Anti-Brute Force Rule IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by the name of the defense rule.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAntiBruteForceRules.
 */
export interface GetAntiBruteForceRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Anti Brute Force Rule IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Anti Brute Force Rules.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of Anti Brute Force Rule Entries. Each element contains the following attributes:
     */
    readonly rules: outputs.threatdetection.GetAntiBruteForceRulesRule[];
}
/**
 * This data source provides Threat Detection Anti Brute Force Rule available to the user.[What is Anti Brute Force Rule](https://www.alibabacloud.com/help/en/security-center/latest/api-sas-2018-12-03-createantibruteforcerule)
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "example_value";
 * const defaultAntiBruteForceRule = new alicloud.threatdetection.AntiBruteForceRule("default", {
 *     antiBruteForceRuleName: name,
 *     forbiddenTime: 360,
 *     uuidLists: ["7567806c-4ec5-4597-9543-7c9543381a13"],
 *     failCount: 80,
 *     span: 10,
 * });
 * const _default = defaultAntiBruteForceRule.id.apply(id => alicloud.threatdetection.getAntiBruteForceRulesOutput({
 *     ids: [id],
 *     nameRegex: defaultAntiBruteForceRule.name,
 * }));
 * export const alicloudThreatDetectionAntiBruteForceRuleExampleId = _default.apply(_default => _default.rules?.[0]?.id);
 * ```
 */
export function getAntiBruteForceRulesOutput(args?: GetAntiBruteForceRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAntiBruteForceRulesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:threatdetection/getAntiBruteForceRules:getAntiBruteForceRules", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAntiBruteForceRules.
 */
export interface GetAntiBruteForceRulesOutputArgs {
    /**
     * A list of Anti-Brute Force Rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by the name of the defense rule.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
