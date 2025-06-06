// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsSnapshots from version 1.120.0.
 *
 * Use this data source to get a list of snapshot according to the specified filters in an Alibaba Cloud account.
 *
 * For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
 *
 * > **NOTE:**  Available in 1.40.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const snapshots = alicloud.ecs.getSnapshots({
 *     ids: ["s-123456890abcdef"],
 *     nameRegex: "tf-testAcc-snapshot",
 * });
 * ```
 *
 * ## Argument Reference
 *
 * The following arguments are supported:
 *
 * * `instanceId` - (Optional) The specified instance ID.
 * * `diskId` - (Optional) The specified disk ID.
 * * `encrypted` - (Optional) Queries the encrypted snapshots. Optional values: `true`: Encrypted snapshots. `false`: No encryption attribute limit. Default value: `false`.
 * * `ids` - (Optional)  A list of snapshot IDs.
 * * `nameRegex` - (Optional) A regex string to filter results by snapshot name.
 * * `status` - (Optional) The specified snapshot status. Default value: `all`. Optional values:
 *   * progressing: The snapshots are being created.
 *   * accomplished: The snapshots are ready to use.
 *   * failed: The snapshot creation failed.
 *   * all: All status.
 * * `type` - (Optional) The snapshot category. Default value: `all`. Optional values:
 *   * auto: Auto snapshots.
 *   * user: Manual snapshots.
 *   * all: Auto and manual snapshots.
 * * `sourceDiskType` - (Optional) The type of source disk:
 *   * System: The snapshots are created for system disks.
 *   * Data: The snapshots are created for data disks.
 * * `usage` - (Optional) The usage of the snapshot:
 *   * image: The snapshots are used to create custom images.
 *   * disk: The snapshots are used to CreateDisk.
 *   * mage_disk: The snapshots are used to create custom images and data disks.
 *   * none: The snapshots are not used yet.
 * * `tags` - (Optional) A map of tags assigned to snapshots.
 * * `outputFile` - (Optional) The name of output file that saves the filter results.
 */
export function getSnapshots(args?: GetSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetSnapshotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getSnapshots:getSnapshots", {
        "category": args.category,
        "dryRun": args.dryRun,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "snapshotLinkId": args.snapshotLinkId,
        "snapshotName": args.snapshotName,
        "snapshotType": args.snapshotType,
        "sourceDiskType": args.sourceDiskType,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "usage": args.usage,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsArgs {
    category?: string;
    dryRun?: boolean;
    /**
     * Whether the snapshot is encrypted or not.
     */
    encrypted?: boolean;
    /**
     * A list of snapshot IDs.
     */
    ids?: string[];
    kmsKeyId?: string;
    nameRegex?: string;
    outputFile?: string;
    resourceGroupId?: string;
    snapshotLinkId?: string;
    snapshotName?: string;
    snapshotType?: string;
    /**
     * Source disk attribute. Value range: `System`,`Data`.
     */
    sourceDiskType?: string;
    /**
     * The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
     */
    status?: string;
    /**
     * A map of tags assigned to the snapshot.
     */
    tags?: {[key: string]: string};
    type?: string;
    /**
     * Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
     */
    usage?: string;
}

/**
 * A collection of values returned by getSnapshots.
 */
export interface GetSnapshotsResult {
    readonly category?: string;
    readonly dryRun?: boolean;
    /**
     * Whether the snapshot is encrypted or not.
     */
    readonly encrypted?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of snapshot IDs.
     */
    readonly ids: string[];
    readonly kmsKeyId?: string;
    readonly nameRegex?: string;
    /**
     * A list of snapshots names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly snapshotLinkId?: string;
    readonly snapshotName?: string;
    readonly snapshotType?: string;
    /**
     * A list of snapshots. Each element contains the following attributes:
     */
    readonly snapshots: outputs.ecs.GetSnapshotsSnapshot[];
    /**
     * Source disk attribute. Value range: `System`,`Data`.
     */
    readonly sourceDiskType?: string;
    /**
     * The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the snapshot.
     */
    readonly tags?: {[key: string]: string};
    readonly type?: string;
    /**
     * Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
     */
    readonly usage?: string;
}
/**
 * > **DEPRECATED:** This datasource has been renamed to alicloud.ecs.getEcsSnapshots from version 1.120.0.
 *
 * Use this data source to get a list of snapshot according to the specified filters in an Alibaba Cloud account.
 *
 * For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
 *
 * > **NOTE:**  Available in 1.40.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const snapshots = alicloud.ecs.getSnapshots({
 *     ids: ["s-123456890abcdef"],
 *     nameRegex: "tf-testAcc-snapshot",
 * });
 * ```
 *
 * ## Argument Reference
 *
 * The following arguments are supported:
 *
 * * `instanceId` - (Optional) The specified instance ID.
 * * `diskId` - (Optional) The specified disk ID.
 * * `encrypted` - (Optional) Queries the encrypted snapshots. Optional values: `true`: Encrypted snapshots. `false`: No encryption attribute limit. Default value: `false`.
 * * `ids` - (Optional)  A list of snapshot IDs.
 * * `nameRegex` - (Optional) A regex string to filter results by snapshot name.
 * * `status` - (Optional) The specified snapshot status. Default value: `all`. Optional values:
 *   * progressing: The snapshots are being created.
 *   * accomplished: The snapshots are ready to use.
 *   * failed: The snapshot creation failed.
 *   * all: All status.
 * * `type` - (Optional) The snapshot category. Default value: `all`. Optional values:
 *   * auto: Auto snapshots.
 *   * user: Manual snapshots.
 *   * all: Auto and manual snapshots.
 * * `sourceDiskType` - (Optional) The type of source disk:
 *   * System: The snapshots are created for system disks.
 *   * Data: The snapshots are created for data disks.
 * * `usage` - (Optional) The usage of the snapshot:
 *   * image: The snapshots are used to create custom images.
 *   * disk: The snapshots are used to CreateDisk.
 *   * mage_disk: The snapshots are used to create custom images and data disks.
 *   * none: The snapshots are not used yet.
 * * `tags` - (Optional) A map of tags assigned to snapshots.
 * * `outputFile` - (Optional) The name of output file that saves the filter results.
 */
export function getSnapshotsOutput(args?: GetSnapshotsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSnapshotsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecs/getSnapshots:getSnapshots", {
        "category": args.category,
        "dryRun": args.dryRun,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "snapshotLinkId": args.snapshotLinkId,
        "snapshotName": args.snapshotName,
        "snapshotType": args.snapshotType,
        "sourceDiskType": args.sourceDiskType,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "usage": args.usage,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsOutputArgs {
    category?: pulumi.Input<string>;
    dryRun?: pulumi.Input<boolean>;
    /**
     * Whether the snapshot is encrypted or not.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * A list of snapshot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    kmsKeyId?: pulumi.Input<string>;
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    resourceGroupId?: pulumi.Input<string>;
    snapshotLinkId?: pulumi.Input<string>;
    snapshotName?: pulumi.Input<string>;
    snapshotType?: pulumi.Input<string>;
    /**
     * Source disk attribute. Value range: `System`,`Data`.
     */
    sourceDiskType?: pulumi.Input<string>;
    /**
     * The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the snapshot.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    type?: pulumi.Input<string>;
    /**
     * Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
     */
    usage?: pulumi.Input<string>;
}
