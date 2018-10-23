import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the disks of the current Alibaba Cloud user.
 */
export declare function getDisks(args?: GetDisksArgs, opts?: pulumi.InvokeOptions): Promise<GetDisksResult>;
/**
 * A collection of arguments for invoking getDisks.
 */
export interface GetDisksArgs {
    /**
     * Disk category. Possible values: `cloud` (basic cloud disk), `cloud_efficiency` (ultra cloud disk), `cloud_ssd` (SSD cloud disk), `ephemeral_ssd` (ephemeral SSD) and `ephemeral` (ephemeral disk).
     */
    readonly category?: string;
    /**
     * Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     */
    readonly encrypted?: string;
    /**
     * A list of disks IDs.
     */
    readonly ids?: string[];
    /**
     * Filter the results by the specified ECS instance ID.
     */
    readonly instanceId?: string;
    /**
     * A regex string to filter results by disk name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * A map of tags assigned to the disks. It must be in the format:
     * ```
     * data "alicloud_disks" "disks_ds" {
     * tags = {
     * tagKey1 = "tagValue1",
     * tagKey2 = "tagValue2"
     * }
     * }
     * ```
     */
    readonly tags?: {
        [key: string]: any;
    };
    /**
     * Disk type. Possible values: `system` and `data`.
     */
    readonly type?: string;
}
/**
 * A collection of values returned by getDisks.
 */
export interface GetDisksResult {
    /**
     * A list of disks. Each element contains the following attributes:
     */
    readonly disks: {
        attachedTime: string;
        availabilityZone: string;
        category: string;
        creationTime: string;
        description: string;
        detachedTime: string;
        encrypted: string;
        expirationTime: string;
        id: string;
        imageId: string;
        instanceId: string;
        name: string;
        regionId: string;
        size: number;
        snapshotId: string;
        status: string;
        tags?: {
            [key: string]: any;
        };
        type: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
