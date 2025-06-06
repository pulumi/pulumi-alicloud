// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Alidns Access Strategies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.152.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dns.getAccessStrategies({
 *     instanceId: "example_value",
 *     strategyMode: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 *     nameRegex: "the_resource_name",
 * });
 * export const alidnsAccessStrategyId1 = ids.then(ids => ids.strategies?.[0]?.id);
 * ```
 */
export function getAccessStrategies(args: GetAccessStrategiesArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessStrategiesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dns/getAccessStrategies:getAccessStrategies", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "strategyMode": args.strategyMode,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessStrategies.
 */
export interface GetAccessStrategiesArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Access Strategy IDs.
     */
    ids?: string[];
    /**
     * The Id of the associated instance.
     */
    instanceId: string;
    /**
     * The lang.
     */
    lang?: string;
    /**
     * A regex string to filter results by Access Strategy name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The type of the access policy. Valid values:
     * - `GEO`: based on geographic location.
     * - `LATENCY`: Based on delay.
     */
    strategyMode: string;
}

/**
 * A collection of values returned by getAccessStrategies.
 */
export interface GetAccessStrategiesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly lang?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly strategies: outputs.dns.GetAccessStrategiesStrategy[];
    readonly strategyMode: string;
}
/**
 * This data source provides the Alidns Access Strategies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.152.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.dns.getAccessStrategies({
 *     instanceId: "example_value",
 *     strategyMode: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 *     nameRegex: "the_resource_name",
 * });
 * export const alidnsAccessStrategyId1 = ids.then(ids => ids.strategies?.[0]?.id);
 * ```
 */
export function getAccessStrategiesOutput(args: GetAccessStrategiesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccessStrategiesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dns/getAccessStrategies:getAccessStrategies", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "strategyMode": args.strategyMode,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessStrategies.
 */
export interface GetAccessStrategiesOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Access Strategy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of the associated instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The lang.
     */
    lang?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Access Strategy name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The type of the access policy. Valid values:
     * - `GEO`: based on geographic location.
     * - `LATENCY`: Based on delay.
     */
    strategyMode: pulumi.Input<string>;
}
