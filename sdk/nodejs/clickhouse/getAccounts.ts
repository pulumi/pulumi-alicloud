// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Click House Accounts of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.134.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "testaccountname";
 * const pwd = config.get("pwd") || "Tf-testpwd";
 * const defaultDbCluster = new alicloud.clickhouse.DbCluster("defaultDbCluster", {
 *     dbClusterVersion: "20.3.10.75",
 *     category: "Basic",
 *     dbClusterClass: "S8",
 *     dbClusterNetworkType: "vpc",
 *     dbClusterDescription: name,
 *     dbNodeGroupCount: "1",
 *     paymentType: "PayAsYouGo",
 *     dbNodeStorage: "500",
 *     storageType: "cloud_essd",
 *     vswitchId: "your_vswitch_id",
 * });
 * const defaultAccount = new alicloud.clickhouse.Account("defaultAccount", {
 *     dbClusterId: defaultDbCluster.id,
 *     accountDescription: "your_description",
 *     accountName: name,
 *     accountPassword: pwd,
 * });
 * const defaultAccounts = alicloud.clickhouse.getAccountsOutput({
 *     ids: [defaultAccount.id],
 *     dbClusterId: defaultDbCluster.id,
 * });
 * export const accountId = defaultAccounts.apply(defaultAccounts => defaultAccounts.ids?[0]);
 * ```
 */
export function getAccounts(args: GetAccountsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:clickhouse/getAccounts:getAccounts", {
        "dbClusterId": args.dbClusterId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsArgs {
    /**
     * The DBCluster id.
     */
    dbClusterId: string;
    /**
     * A list of Account IDs. Its element value is same as Account Name.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Account name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of the resource.
     */
    status?: string;
}

/**
 * A collection of values returned by getAccounts.
 */
export interface GetAccountsResult {
    readonly accounts: outputs.clickhouse.GetAccountsAccount[];
    readonly dbClusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}

export function getAccountsOutput(args: GetAccountsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountsResult> {
    return pulumi.output(args).apply(a => getAccounts(a, opts))
}

/**
 * A collection of arguments for invoking getAccounts.
 */
export interface GetAccountsOutputArgs {
    /**
     * The DBCluster id.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * A list of Account IDs. Its element value is same as Account Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Account name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}