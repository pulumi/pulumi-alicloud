// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Hybrid Backup Recovery (HBR) Hana Backup Clients of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in 1.198.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getHanaBackupClients({
 *     ids: ["example_id"],
 *     vaultId: "your_vault_id",
 * });
 * export const hbrHanaBackupClientsId1 = ids.then(ids => ids.hanaBackupClients?.[0]?.id);
 * ```
 */
export function getHanaBackupClients(args: GetHanaBackupClientsArgs, opts?: pulumi.InvokeOptions): Promise<GetHanaBackupClientsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:hbr/getHanaBackupClients:getHanaBackupClients", {
        "clientId": args.clientId,
        "clusterId": args.clusterId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHanaBackupClients.
 */
export interface GetHanaBackupClientsArgs {
    /**
     * The ID of the backup client.
     */
    clientId?: string;
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId?: string;
    /**
     * A list of Hana Backup Client IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
     */
    status?: string;
    /**
     * The ID of the backup vault.
     */
    vaultId: string;
}

/**
 * A collection of values returned by getHanaBackupClients.
 */
export interface GetHanaBackupClientsResult {
    /**
     * The ID of the backup client.
     */
    readonly clientId?: string;
    /**
     * The ID of the SAP HANA instance.
     */
    readonly clusterId?: string;
    /**
     * A list of Hana Backup Clients. Each element contains the following attributes:
     */
    readonly hanaBackupClients: outputs.hbr.GetHanaBackupClientsHanaBackupClient[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The status of the backup client.
     */
    readonly status?: string;
    /**
     * The ID of the backup vault.
     */
    readonly vaultId: string;
}
/**
 * This data source provides the Hybrid Backup Recovery (HBR) Hana Backup Clients of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in 1.198.0+
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getHanaBackupClients({
 *     ids: ["example_id"],
 *     vaultId: "your_vault_id",
 * });
 * export const hbrHanaBackupClientsId1 = ids.then(ids => ids.hanaBackupClients?.[0]?.id);
 * ```
 */
export function getHanaBackupClientsOutput(args: GetHanaBackupClientsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHanaBackupClientsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:hbr/getHanaBackupClients:getHanaBackupClients", {
        "clientId": args.clientId,
        "clusterId": args.clusterId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHanaBackupClients.
 */
export interface GetHanaBackupClientsOutputArgs {
    /**
     * The ID of the backup client.
     */
    clientId?: pulumi.Input<string>;
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * A list of Hana Backup Client IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the backup vault.
     */
    vaultId: pulumi.Input<string>;
}
