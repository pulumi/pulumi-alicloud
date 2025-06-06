// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the DFS Zones And Configurations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.dfs.getZones({});
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dfs/getZones:getZones", {
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly zones: outputs.dfs.GetZonesZone[];
}
/**
 * This data source provides the DFS Zones And Configurations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.dfs.getZones({});
 * ```
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetZonesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dfs/getZones:getZones", {
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
