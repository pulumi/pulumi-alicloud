// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source provides information about the current account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const current = alicloud.getAccount({});
 * export const currentAccountId = current.then(current => current.id);
 * ```
 */
export function getAccount(opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:index/getAccount:getAccount", {
    }, opts);
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * Account ID (e.g. "1239306421830812"). It can be used to construct an ARN.
     */
    readonly id: string;
}
/**
 * This data source provides information about the current account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const current = alicloud.getAccount({});
 * export const currentAccountId = current.then(current => current.id);
 * ```
 */
export function getAccountOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:index/getAccount:getAccount", {
    }, opts);
}
