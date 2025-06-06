// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nas Snapshots of the current Alibaba Cloud user.
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
 * const ids = alicloud.nas.getSnapshots({});
 * export const nasSnapshotId1 = ids.then(ids => ids.snapshots?.[0]?.id);
 * const nameRegex = alicloud.nas.getSnapshots({
 *     nameRegex: "^my-Snapshot",
 * });
 * export const nasSnapshotId2 = nameRegex.then(nameRegex => nameRegex.snapshots?.[0]?.id);
 * ```
 */
export function getSnapshots(args?: GetSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetSnapshotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nas/getSnapshots:getSnapshots", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "snapshotName": args.snapshotName,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId?: string;
    /**
     * A list of Snapshot IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The name of the snapshot.
     */
    snapshotName?: string;
    /**
     * Status. Valid values: `accomplished`, `failed`, `progressing`.
     */
    status?: string;
}

/**
 * A collection of values returned by getSnapshots.
 */
export interface GetSnapshotsResult {
    readonly fileSystemId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly snapshotName?: string;
    readonly snapshots: outputs.nas.GetSnapshotsSnapshot[];
    readonly status?: string;
}
/**
 * This data source provides the Nas Snapshots of the current Alibaba Cloud user.
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
 * const ids = alicloud.nas.getSnapshots({});
 * export const nasSnapshotId1 = ids.then(ids => ids.snapshots?.[0]?.id);
 * const nameRegex = alicloud.nas.getSnapshots({
 *     nameRegex: "^my-Snapshot",
 * });
 * export const nasSnapshotId2 = nameRegex.then(nameRegex => nameRegex.snapshots?.[0]?.id);
 * ```
 */
export function getSnapshotsOutput(args?: GetSnapshotsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSnapshotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:nas/getSnapshots:getSnapshots", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "snapshotName": args.snapshotName,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsOutputArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * A list of Snapshot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The name of the snapshot.
     */
    snapshotName?: pulumi.Input<string>;
    /**
     * Status. Valid values: `accomplished`, `failed`, `progressing`.
     */
    status?: pulumi.Input<string>;
}
