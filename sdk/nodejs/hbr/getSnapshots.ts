// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Snapshots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.hbr.getEcsBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const defaultGetOssBackupPlans = alicloud.hbr.getOssBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const defaultGetNasBackupPlans = alicloud.hbr.getNasBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const ecsSnapshots = Promise.all([_default, _default]).then(([_default, _default1]) => alicloud.hbr.getSnapshots({
 *     sourceType: "ECS_FILE",
 *     vaultId: _default.plans?.[0]?.vaultId,
 *     instanceId: _default1.plans?.[0]?.instanceId,
 * }));
 * const ossSnapshots = Promise.all([defaultGetOssBackupPlans, defaultGetOssBackupPlans]).then(([defaultGetOssBackupPlans, defaultGetOssBackupPlans1]) => alicloud.hbr.getSnapshots({
 *     sourceType: "OSS",
 *     vaultId: defaultGetOssBackupPlans.plans?.[0]?.vaultId,
 *     bucket: defaultGetOssBackupPlans1.plans?.[0]?.bucket,
 *     completeTime: "2021-07-20T14:17:15CST,2021-07-24T14:17:15CST",
 *     completeTimeChecker: "BETWEEN",
 * }));
 * const nasSnapshots = Promise.all([defaultGetNasBackupPlans, defaultGetNasBackupPlans, defaultGetNasBackupPlans]).then(([defaultGetNasBackupPlans, defaultGetNasBackupPlans1, defaultGetNasBackupPlans2]) => alicloud.hbr.getSnapshots({
 *     sourceType: "NAS",
 *     vaultId: defaultGetNasBackupPlans.plans?.[0]?.vaultId,
 *     fileSystemId: defaultGetNasBackupPlans1.plans?.[0]?.fileSystemId,
 *     createTime: defaultGetNasBackupPlans2.plans?.[0]?.createTime,
 *     completeTime: "2021-08-23T14:17:15CST",
 *     completeTimeChecker: "GREATER_THAN_OR_EQUAL",
 * }));
 * export const hbrSnapshotId1 = nasSnapshots.then(nasSnapshots => nasSnapshots.snapshots?.[0]?.id);
 * ```
 */
export function getSnapshots(args: GetSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:hbr/getSnapshots:getSnapshots", {
        "bucket": args.bucket,
        "completeTime": args.completeTime,
        "completeTimeChecker": args.completeTimeChecker,
        "createTime": args.createTime,
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "limit": args.limit,
        "outputFile": args.outputFile,
        "query": args.query,
        "sourceType": args.sourceType,
        "status": args.status,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsArgs {
    /**
     * The bucket name of OSS. While sourceType equals `OSS`, this parameter must be set.
     */
    bucket?: string;
    /**
     * Timestamp of Snapshot completion. Note The time format of the API adopts the ISO 8601 format, such as 2021-07-09T15:45:30CST or 2021-07-09T07:45:30Z. **Note**: While `completeTimeChecker` equals `BETWEEN`, this field should be formatted such as `"2021-08-20T14:17:15CST,2021-08-26T14:17:15CST"`, The first part of this string is the start time, the second part is the end time, and the two parts should be separated by commas.
     */
    completeTime?: string;
    /**
     * Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
     */
    completeTimeChecker?: string;
    /**
     * File system creation timestamp of Nas. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     */
    createTime?: string;
    /**
     * The File System ID of Nas. While sourceType equals `NAS`, this parameter must be set.
     */
    fileSystemId?: string;
    /**
     * A list of Snapshot IDs.
     */
    ids?: string[];
    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host. While sourceType equals `ECS_FILE`, this parameter must be set.
     */
    instanceId?: string;
    limit?: number;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    query?: string;
    /**
     * Data source type, valid values: `ECS_FILE`, `OSS`, `NAS`.
     */
    sourceType: string;
    /**
     * The status of snapshot, valid values: `COMPLETE`, `PARTIAL_COMPLETE`.
     */
    status?: string;
    /**
     * The ID of Vault.
     */
    vaultId: string;
}

/**
 * A collection of values returned by getSnapshots.
 */
export interface GetSnapshotsResult {
    readonly bucket?: string;
    readonly completeTime?: string;
    readonly completeTimeChecker?: string;
    readonly createTime?: string;
    readonly fileSystemId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId?: string;
    readonly limit?: number;
    readonly outputFile?: string;
    readonly query?: string;
    readonly snapshots: outputs.hbr.GetSnapshotsSnapshot[];
    readonly sourceType: string;
    readonly status?: string;
    readonly vaultId: string;
}
/**
 * This data source provides the Hbr Snapshots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.hbr.getEcsBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const defaultGetOssBackupPlans = alicloud.hbr.getOssBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const defaultGetNasBackupPlans = alicloud.hbr.getNasBackupPlans({
 *     nameRegex: "plan-tf-used-dont-delete",
 * });
 * const ecsSnapshots = Promise.all([_default, _default]).then(([_default, _default1]) => alicloud.hbr.getSnapshots({
 *     sourceType: "ECS_FILE",
 *     vaultId: _default.plans?.[0]?.vaultId,
 *     instanceId: _default1.plans?.[0]?.instanceId,
 * }));
 * const ossSnapshots = Promise.all([defaultGetOssBackupPlans, defaultGetOssBackupPlans]).then(([defaultGetOssBackupPlans, defaultGetOssBackupPlans1]) => alicloud.hbr.getSnapshots({
 *     sourceType: "OSS",
 *     vaultId: defaultGetOssBackupPlans.plans?.[0]?.vaultId,
 *     bucket: defaultGetOssBackupPlans1.plans?.[0]?.bucket,
 *     completeTime: "2021-07-20T14:17:15CST,2021-07-24T14:17:15CST",
 *     completeTimeChecker: "BETWEEN",
 * }));
 * const nasSnapshots = Promise.all([defaultGetNasBackupPlans, defaultGetNasBackupPlans, defaultGetNasBackupPlans]).then(([defaultGetNasBackupPlans, defaultGetNasBackupPlans1, defaultGetNasBackupPlans2]) => alicloud.hbr.getSnapshots({
 *     sourceType: "NAS",
 *     vaultId: defaultGetNasBackupPlans.plans?.[0]?.vaultId,
 *     fileSystemId: defaultGetNasBackupPlans1.plans?.[0]?.fileSystemId,
 *     createTime: defaultGetNasBackupPlans2.plans?.[0]?.createTime,
 *     completeTime: "2021-08-23T14:17:15CST",
 *     completeTimeChecker: "GREATER_THAN_OR_EQUAL",
 * }));
 * export const hbrSnapshotId1 = nasSnapshots.then(nasSnapshots => nasSnapshots.snapshots?.[0]?.id);
 * ```
 */
export function getSnapshotsOutput(args: GetSnapshotsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSnapshotsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:hbr/getSnapshots:getSnapshots", {
        "bucket": args.bucket,
        "completeTime": args.completeTime,
        "completeTimeChecker": args.completeTimeChecker,
        "createTime": args.createTime,
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "limit": args.limit,
        "outputFile": args.outputFile,
        "query": args.query,
        "sourceType": args.sourceType,
        "status": args.status,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshots.
 */
export interface GetSnapshotsOutputArgs {
    /**
     * The bucket name of OSS. While sourceType equals `OSS`, this parameter must be set.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Timestamp of Snapshot completion. Note The time format of the API adopts the ISO 8601 format, such as 2021-07-09T15:45:30CST or 2021-07-09T07:45:30Z. **Note**: While `completeTimeChecker` equals `BETWEEN`, this field should be formatted such as `"2021-08-20T14:17:15CST,2021-08-26T14:17:15CST"`, The first part of this string is the start time, the second part is the end time, and the two parts should be separated by commas.
     */
    completeTime?: pulumi.Input<string>;
    /**
     * Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
     */
    completeTimeChecker?: pulumi.Input<string>;
    /**
     * File system creation timestamp of Nas. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The File System ID of Nas. While sourceType equals `NAS`, this parameter must be set.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * A list of Snapshot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of ECS instance. The ecs backup client must have been installed on the host. While sourceType equals `ECS_FILE`, this parameter must be set.
     */
    instanceId?: pulumi.Input<string>;
    limit?: pulumi.Input<number>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    query?: pulumi.Input<string>;
    /**
     * Data source type, valid values: `ECS_FILE`, `OSS`, `NAS`.
     */
    sourceType: pulumi.Input<string>;
    /**
     * The status of snapshot, valid values: `COMPLETE`, `PARTIAL_COMPLETE`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of Vault.
     */
    vaultId: pulumi.Input<string>;
}
