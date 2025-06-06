// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Dfs Mount Points of the current Alibaba Cloud user.
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
 * const ids = alicloud.dfs.getMountPoints({
 *     fileSystemId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const dfsMountPointId1 = ids.then(ids => ids.points?.[0]?.id);
 * ```
 */
export function getMountPoints(args: GetMountPointsArgs, opts?: pulumi.InvokeOptions): Promise<GetMountPointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dfs/getMountPoints:getMountPoints", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getMountPoints.
 */
export interface GetMountPointsArgs {
    /**
     * The ID of the File System.
     */
    fileSystemId: string;
    /**
     * A list of Mount Point IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the Mount Point. Valid values: `Active`, `Inactive`.
     */
    status?: string;
}

/**
 * A collection of values returned by getMountPoints.
 */
export interface GetMountPointsResult {
    readonly fileSystemId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly points: outputs.dfs.GetMountPointsPoint[];
    readonly status?: string;
}
/**
 * This data source provides the Dfs Mount Points of the current Alibaba Cloud user.
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
 * const ids = alicloud.dfs.getMountPoints({
 *     fileSystemId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const dfsMountPointId1 = ids.then(ids => ids.points?.[0]?.id);
 * ```
 */
export function getMountPointsOutput(args: GetMountPointsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMountPointsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dfs/getMountPoints:getMountPoints", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getMountPoints.
 */
export interface GetMountPointsOutputArgs {
    /**
     * The ID of the File System.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * A list of Mount Point IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the Mount Point. Valid values: `Active`, `Inactive`.
     */
    status?: pulumi.Input<string>;
}
