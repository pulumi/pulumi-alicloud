import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides information about the current account.
 */
export declare function getAccount(opts?: pulumi.InvokeOptions): Promise<GetAccountResult>;
/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * Account ID (e.g. "1239306421830812"). It can be used to construct an ARN.
     */
    readonly id: string;
}
