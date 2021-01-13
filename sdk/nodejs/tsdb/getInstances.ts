// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Time Series Database (TSDB) Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.112.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.tsdb.getInstances({
 *     ids: ["example_value"],
 * });
 * export const firstTsdbInstanceId = example.then(example => example.instances[0].id);
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:tsdb/getInstances:getInstances", {
        "appKey": args.appKey,
        "enableDetails": args.enableDetails,
        "engineType": args.engineType,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "queryStr": args.queryStr,
        "status": args.status,
        "statusList": args.statusList,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * The app key.
     */
    readonly appKey?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * The engine type of instance. Enumerative: `tsdbTsdb` refers to TSDB, `tsdbInfluxdb` refers to TSDB for InfluxDB️.
     */
    readonly engineType?: string;
    /**
     * A list of Instance IDs.
     */
    readonly ids?: string[];
    readonly outputFile?: string;
    /**
     * The query str.
     */
    readonly queryStr?: string;
    /**
     * Instance status, enumerative: ACTIVATION,DELETED, CREATING,CLASS_CHANGING,LOCKED.
     */
    readonly status?: string;
    /**
     * The status list.
     */
    readonly statusList?: string;
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    readonly appKey?: string;
    readonly enableDetails?: boolean;
    readonly engineType?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instances: outputs.tsdb.GetInstancesInstance[];
    readonly outputFile?: string;
    readonly queryStr?: string;
    readonly status?: string;
    readonly statusList?: string;
}