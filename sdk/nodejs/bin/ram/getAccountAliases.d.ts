import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides an alias for the Alibaba Cloud account.
 */
export declare function getAccountAliases(args?: GetAccountAliasesArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountAliasesResult>;
/**
 * A collection of arguments for invoking getAccountAliases.
 */
export interface GetAccountAliasesArgs {
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getAccountAliases.
 */
export interface GetAccountAliasesResult {
    /**
     * Alias of the account.
     */
    readonly accountAlias: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
