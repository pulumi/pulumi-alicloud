// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides DCDN kv account available to the user.[What is DCDN Kv Account](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-describedcdnkvaccount)
 *
 * > **NOTE:** Available since v1.198.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const status = alicloud.dcdn.getKvAccount({
 *     status: "online",
 * });
 * ```
 */
export function getKvAccount(args?: GetKvAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetKvAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:dcdn/getKvAccount:getKvAccount", {
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getKvAccount.
 */
export interface GetKvAccountArgs {
    /**
     * The status of the KV feature for your account. Valid values: `online`, `offline`.
     */
    status?: string;
}

/**
 * A collection of values returned by getKvAccount.
 */
export interface GetKvAccountResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The current kv account enable status.
     */
    readonly status: string;
}
/**
 * This data source provides DCDN kv account available to the user.[What is DCDN Kv Account](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-describedcdnkvaccount)
 *
 * > **NOTE:** Available since v1.198.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const status = alicloud.dcdn.getKvAccount({
 *     status: "online",
 * });
 * ```
 */
export function getKvAccountOutput(args?: GetKvAccountOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKvAccountResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:dcdn/getKvAccount:getKvAccount", {
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getKvAccount.
 */
export interface GetKvAccountOutputArgs {
    /**
     * The status of the KV feature for your account. Valid values: `online`, `offline`.
     */
    status?: pulumi.Input<string>;
}
