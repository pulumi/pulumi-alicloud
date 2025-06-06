// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Disks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.122.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultEcsDisk = new alicloud.ecs.EcsDisk("default", {
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     diskName: "terraform-example",
 *     description: "terraform-example",
 *     category: "cloud_efficiency",
 *     size: 30,
 *     tags: {
 *         Name: "terraform-example",
 *     },
 * });
 * const ids = alicloud.ecs.getEcsDisksOutput({
 *     ids: [defaultEcsDisk.id],
 * });
 * export const ecsDiskId0 = ids.apply(ids => ids.disks?.[0]?.id);
 * ```
 */
export function getEcsDisks(args?: GetEcsDisksArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsDisksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEcsDisks:getEcsDisks", {
        "additionalAttributes": args.additionalAttributes,
        "autoSnapshotPolicyId": args.autoSnapshotPolicyId,
        "availabilityZone": args.availabilityZone,
        "category": args.category,
        "deleteAutoSnapshot": args.deleteAutoSnapshot,
        "deleteWithInstance": args.deleteWithInstance,
        "diskName": args.diskName,
        "diskType": args.diskType,
        "dryRun": args.dryRun,
        "enableAutoSnapshot": args.enableAutoSnapshot,
        "enableAutomatedSnapshotPolicy": args.enableAutomatedSnapshotPolicy,
        "enableShared": args.enableShared,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "operationLocks": args.operationLocks,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "paymentType": args.paymentType,
        "portable": args.portable,
        "resourceGroupId": args.resourceGroupId,
        "snapshotId": args.snapshotId,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsDisks.
 */
export interface GetEcsDisksArgs {
    /**
     * Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
     */
    additionalAttributes?: string[];
    /**
     * Query cloud disks based on the automatic snapshot policy ID.
     */
    autoSnapshotPolicyId?: string;
    /**
     * Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
     */
    availabilityZone?: string;
    /**
     * Disk category. Valid values: `cloud`, `cloudEfficiency`, `cloudEssd`, `cloudSsd`, `ephemeralSsd`, `cloudAuto`, `cloudEssdEntry`.
     */
    category?: string;
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released.
     */
    deleteAutoSnapshot?: boolean;
    /**
     * Indicates whether the disk is released together with the instance.
     */
    deleteWithInstance?: boolean;
    /**
     * The disk name.
     */
    diskName?: string;
    /**
     * The disk type. Valid values: `system`, `data`, `all`.
     */
    diskType?: string;
    /**
     * Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
     */
    dryRun?: boolean;
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released.
     */
    enableAutoSnapshot?: boolean;
    /**
     * Whether the cloud disk has an automatic snapshot policy
     */
    enableAutomatedSnapshotPolicy?: boolean;
    /**
     * Whether it is shared block storage.
     */
    enableShared?: boolean;
    /**
     * Indicate whether the disk is encrypted or not. Valid values: `on` and `off`.
     */
    encrypted?: string;
    /**
     * A list of Disk IDs.
     */
    ids?: string[];
    /**
     * Filter the results by the specified ECS instance ID.
     */
    instanceId?: string;
    /**
     * The kms key id.
     */
    kmsKeyId?: string;
    /**
     * A regex string to filter results by Disk name.
     */
    nameRegex?: string;
    /**
     * The reasons why the disk was locked. See `operationLocks` below for details.
     */
    operationLocks?: inputs.ecs.GetEcsDisksOperationLock[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * Payment method for disk. Valid Values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: string;
    /**
     * Whether the cloud disk or local disk supports uninstallation.
     */
    portable?: boolean;
    /**
     * The Id of resource group which the disk belongs.
     */
    resourceGroupId?: string;
    /**
     * The source snapshot id.
     */
    snapshotId?: string;
    /**
     * The status of disk. Valid Values: `Attaching`, `Available`, `Creating`, `Detaching`, `In_use`, `Migrating`, `ReIniting`, `Transferring`.
     */
    status?: string;
    /**
     * A map of tags assigned to the disks.
     */
    tags?: {[key: string]: string};
    /**
     * Field `type` has been deprecated from provider version 1.122.0. New field `diskType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
     */
    type?: string;
    /**
     * ID of the free zone to which the disk belongs.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getEcsDisks.
 */
export interface GetEcsDisksResult {
    readonly additionalAttributes?: string[];
    /**
     * Query cloud disks based on the automatic snapshot policy ID.
     */
    readonly autoSnapshotPolicyId?: string;
    /**
     * Availability zone of the disk.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
     */
    readonly availabilityZone?: string;
    /**
     * Disk category.
     */
    readonly category?: string;
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released.
     */
    readonly deleteAutoSnapshot?: boolean;
    /**
     * Indicates whether the disk is released together with the instance.
     */
    readonly deleteWithInstance?: boolean;
    /**
     * The disk name.
     */
    readonly diskName?: string;
    /**
     * The type of the disk.
     */
    readonly diskType?: string;
    /**
     * A list of Ecs Disks. Each element contains the following attributes:
     */
    readonly disks: outputs.ecs.GetEcsDisksDisk[];
    readonly dryRun?: boolean;
    /**
     * Whether the disk implements an automatic snapshot policy.
     */
    readonly enableAutoSnapshot?: boolean;
    /**
     * Whether the disk implements an automatic snapshot policy.
     */
    readonly enableAutomatedSnapshotPolicy?: boolean;
    readonly enableShared?: boolean;
    /**
     * Indicate whether the disk is encrypted or not.
     */
    readonly encrypted?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * The instance ID of the disk mount.
     */
    readonly instanceId?: string;
    /**
     * The ID of the KMS key that is used for the cloud disk.
     */
    readonly kmsKeyId?: string;
    readonly nameRegex?: string;
    /**
     * A list of Disk names.
     */
    readonly names: string[];
    /**
     * The reasons why the disk was locked.
     */
    readonly operationLocks?: outputs.ecs.GetEcsDisksOperationLock[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * Payment method for disk.
     */
    readonly paymentType?: string;
    /**
     * Whether the disk is unmountable.
     */
    readonly portable?: boolean;
    /**
     * The Id of resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     */
    readonly snapshotId?: string;
    /**
     * Current status.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the disk.
     */
    readonly tags?: {[key: string]: string};
    readonly totalCount: number;
    /**
     * The type of the disk.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
     */
    readonly type?: string;
    /**
     * The zone id.
     */
    readonly zoneId?: string;
}
/**
 * This data source provides the Ecs Disks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.122.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultEcsDisk = new alicloud.ecs.EcsDisk("default", {
 *     zoneId: _default.then(_default => _default.zones?.[0]?.id),
 *     diskName: "terraform-example",
 *     description: "terraform-example",
 *     category: "cloud_efficiency",
 *     size: 30,
 *     tags: {
 *         Name: "terraform-example",
 *     },
 * });
 * const ids = alicloud.ecs.getEcsDisksOutput({
 *     ids: [defaultEcsDisk.id],
 * });
 * export const ecsDiskId0 = ids.apply(ids => ids.disks?.[0]?.id);
 * ```
 */
export function getEcsDisksOutput(args?: GetEcsDisksOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEcsDisksResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:ecs/getEcsDisks:getEcsDisks", {
        "additionalAttributes": args.additionalAttributes,
        "autoSnapshotPolicyId": args.autoSnapshotPolicyId,
        "availabilityZone": args.availabilityZone,
        "category": args.category,
        "deleteAutoSnapshot": args.deleteAutoSnapshot,
        "deleteWithInstance": args.deleteWithInstance,
        "diskName": args.diskName,
        "diskType": args.diskType,
        "dryRun": args.dryRun,
        "enableAutoSnapshot": args.enableAutoSnapshot,
        "enableAutomatedSnapshotPolicy": args.enableAutomatedSnapshotPolicy,
        "enableShared": args.enableShared,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "operationLocks": args.operationLocks,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "paymentType": args.paymentType,
        "portable": args.portable,
        "resourceGroupId": args.resourceGroupId,
        "snapshotId": args.snapshotId,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsDisks.
 */
export interface GetEcsDisksOutputArgs {
    /**
     * Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
     */
    additionalAttributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Query cloud disks based on the automatic snapshot policy ID.
     */
    autoSnapshotPolicyId?: pulumi.Input<string>;
    /**
     * Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * Disk category. Valid values: `cloud`, `cloudEfficiency`, `cloudEssd`, `cloudSsd`, `ephemeralSsd`, `cloudAuto`, `cloudEssdEntry`.
     */
    category?: pulumi.Input<string>;
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released.
     */
    deleteAutoSnapshot?: pulumi.Input<boolean>;
    /**
     * Indicates whether the disk is released together with the instance.
     */
    deleteWithInstance?: pulumi.Input<boolean>;
    /**
     * The disk name.
     */
    diskName?: pulumi.Input<string>;
    /**
     * The disk type. Valid values: `system`, `data`, `all`.
     */
    diskType?: pulumi.Input<string>;
    /**
     * Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * Indicates whether the automatic snapshot is deleted when the disk is released.
     */
    enableAutoSnapshot?: pulumi.Input<boolean>;
    /**
     * Whether the cloud disk has an automatic snapshot policy
     */
    enableAutomatedSnapshotPolicy?: pulumi.Input<boolean>;
    /**
     * Whether it is shared block storage.
     */
    enableShared?: pulumi.Input<boolean>;
    /**
     * Indicate whether the disk is encrypted or not. Valid values: `on` and `off`.
     */
    encrypted?: pulumi.Input<string>;
    /**
     * A list of Disk IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Filter the results by the specified ECS instance ID.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The kms key id.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Disk name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The reasons why the disk was locked. See `operationLocks` below for details.
     */
    operationLocks?: pulumi.Input<pulumi.Input<inputs.ecs.GetEcsDisksOperationLockArgs>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * Payment method for disk. Valid Values: `PayAsYouGo`, `Subscription`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Whether the cloud disk or local disk supports uninstallation.
     */
    portable?: pulumi.Input<boolean>;
    /**
     * The Id of resource group which the disk belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The source snapshot id.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * The status of disk. Valid Values: `Attaching`, `Available`, `Creating`, `Detaching`, `In_use`, `Migrating`, `ReIniting`, `Transferring`.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the disks.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Field `type` has been deprecated from provider version 1.122.0. New field `diskType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
     */
    type?: pulumi.Input<string>;
    /**
     * ID of the free zone to which the disk belongs.
     */
    zoneId?: pulumi.Input<string>;
}
