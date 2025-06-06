// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Sae Application Scaling Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.159.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.sae.getApplicationScalingRules({
 *     appId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const saeApplicationScalingRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * ```
 */
export function getApplicationScalingRules(args: GetApplicationScalingRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationScalingRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:sae/getApplicationScalingRules:getApplicationScalingRules", {
        "appId": args.appId,
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationScalingRules.
 */
export interface GetApplicationScalingRulesArgs {
    /**
     * The ID of the Application.
     */
    appId: string;
    /**
     * A list of Application Scaling Rule IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getApplicationScalingRules.
 */
export interface GetApplicationScalingRulesResult {
    readonly appId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly rules: outputs.sae.GetApplicationScalingRulesRule[];
}
/**
 * This data source provides the Sae Application Scaling Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.159.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.sae.getApplicationScalingRules({
 *     appId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const saeApplicationScalingRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * ```
 */
export function getApplicationScalingRulesOutput(args: GetApplicationScalingRulesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetApplicationScalingRulesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:sae/getApplicationScalingRules:getApplicationScalingRules", {
        "appId": args.appId,
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationScalingRules.
 */
export interface GetApplicationScalingRulesOutputArgs {
    /**
     * The ID of the Application.
     */
    appId: pulumi.Input<string>;
    /**
     * A list of Application Scaling Rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
