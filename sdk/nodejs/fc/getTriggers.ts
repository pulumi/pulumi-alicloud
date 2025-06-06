// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Function Compute triggers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcTriggersDs = alicloud.fc.getTriggers({
 *     serviceName: "sample_service",
 *     functionName: "sample_function",
 *     nameRegex: "sample_fc_trigger",
 * });
 * export const firstFcTriggerName = fcTriggersDs.then(fcTriggersDs => fcTriggersDs.triggers?.[0]?.name);
 * ```
 */
export function getTriggers(args: GetTriggersArgs, opts?: pulumi.InvokeOptions): Promise<GetTriggersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:fc/getTriggers:getTriggers", {
        "functionName": args.functionName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTriggers.
 */
export interface GetTriggersArgs {
    /**
     * FC function name.
     */
    functionName: string;
    /**
     * A list of FC triggers ids.
     */
    ids?: string[];
    /**
     * A regex string to filter results by FC trigger name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * FC service name.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getTriggers.
 */
export interface GetTriggersResult {
    readonly functionName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of FC triggers ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of FC triggers names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly serviceName: string;
    /**
     * A list of FC triggers. Each element contains the following attributes:
     */
    readonly triggers: outputs.fc.GetTriggersTrigger[];
}
/**
 * This data source provides the Function Compute triggers of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcTriggersDs = alicloud.fc.getTriggers({
 *     serviceName: "sample_service",
 *     functionName: "sample_function",
 *     nameRegex: "sample_fc_trigger",
 * });
 * export const firstFcTriggerName = fcTriggersDs.then(fcTriggersDs => fcTriggersDs.triggers?.[0]?.name);
 * ```
 */
export function getTriggersOutput(args: GetTriggersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTriggersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:fc/getTriggers:getTriggers", {
        "functionName": args.functionName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTriggers.
 */
export interface GetTriggersOutputArgs {
    /**
     * FC function name.
     */
    functionName: pulumi.Input<string>;
    /**
     * A list of FC triggers ids.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by FC trigger name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * FC service name.
     */
    serviceName: pulumi.Input<string>;
}
