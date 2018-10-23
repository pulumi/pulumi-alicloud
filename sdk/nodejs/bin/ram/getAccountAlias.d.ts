import * as pulumi from "@pulumi/pulumi";
export declare function getAccountAlias(args?: GetAccountAliasArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountAliasResult>;
/**
 * A collection of arguments for invoking getAccountAlias.
 */
export interface GetAccountAliasArgs {
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getAccountAlias.
 */
export interface GetAccountAliasResult {
    readonly accountAlias: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
