// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Vaults of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.129.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getVaults({
 *     nameRegex: "^my-Vault",
 * });
 * export const hbrVaultId1 = ids.then(ids => ids.vaults?[0]?.id);
 * ```
 */
export function getVaults(args?: GetVaultsArgs, opts?: pulumi.InvokeOptions): Promise<GetVaultsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbr/getVaults:getVaults", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "vaultType": args.vaultType,
    }, opts);
}

/**
 * A collection of arguments for invoking getVaults.
 */
export interface GetVaultsArgs {
    /**
     * A list of Vault IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Vault name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of Vault. Valid values: `INITIALIZING`, `CREATED`, `ERROR`, `UNKNOWN`.
     */
    status?: string;
    /**
     * The type of Vault. Valid values: `STANDARD`.
     */
    vaultType?: string;
}

/**
 * A collection of values returned by getVaults.
 */
export interface GetVaultsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
    readonly vaultType?: string;
    readonly vaults: outputs.hbr.GetVaultsVault[];
}

export function getVaultsOutput(args?: GetVaultsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVaultsResult> {
    return pulumi.output(args).apply(a => getVaults(a, opts))
}

/**
 * A collection of arguments for invoking getVaults.
 */
export interface GetVaultsOutputArgs {
    /**
     * A list of Vault IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Vault name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of Vault. Valid values: `INITIALIZING`, `CREATED`, `ERROR`, `UNKNOWN`.
     */
    status?: pulumi.Input<string>;
    /**
     * The type of Vault. Valid values: `STANDARD`.
     */
    vaultType?: pulumi.Input<string>;
}