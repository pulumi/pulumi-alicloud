// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance classes resource available info of Alibaba Cloud.
 *
 * > **NOTE:** Available since v1.49.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const resources = alicloud.getZones({
 *     availableResourceCreation: "KVStore",
 * });
 * const resourcesGetInstanceClasses = resources.then(resources => alicloud.kvstore.getInstanceClasses({
 *     zoneId: resources.zones?.[0]?.id,
 *     instanceChargeType: "PrePaid",
 *     engine: "Redis",
 *     engineVersion: "5.0",
 *     outputFile: "./classes.txt",
 * }));
 * export const firstKvstoreInstanceClass = resourcesGetInstanceClasses.then(resourcesGetInstanceClasses => resourcesGetInstanceClasses.instanceClasses);
 * ```
 */
export function getInstanceClasses(args: GetInstanceClassesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceClassesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kvstore/getInstanceClasses:getInstanceClasses", {
        "architecture": args.architecture,
        "editionType": args.editionType,
        "engine": args.engine,
        "engineVersion": args.engineVersion,
        "instanceChargeType": args.instanceChargeType,
        "nodeType": args.nodeType,
        "outputFile": args.outputFile,
        "packageType": args.packageType,
        "performanceType": args.performanceType,
        "productType": args.productType,
        "seriesType": args.seriesType,
        "shardNumber": args.shardNumber,
        "sortedBy": args.sortedBy,
        "storageType": args.storageType,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceClasses.
 */
export interface GetInstanceClassesArgs {
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     */
    architecture?: string;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     */
    editionType?: string;
    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     */
    engine?: string;
    /**
     * Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
     */
    engineVersion?: string;
    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     */
    instanceChargeType?: string;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     */
    nodeType?: string;
    /**
     * File name where to save data source results (after running `pulumi up`).
     */
    outputFile?: string;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'package_type' has been deprecated from 1.68.0.
     */
    packageType?: string;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'performance_type' has been deprecated from 1.68.0.
     */
    performanceType?: string;
    /**
     * The type of the service. Valid values:
     * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
     * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     */
    productType?: string;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhancedPerformanceType` and `hybridStorage`.
     */
    seriesType?: string;
    /**
     * The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     */
    shardNumber?: number;
    sortedBy?: string;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'storage_type' has been deprecated from 1.68.0.
     */
    storageType?: string;
    /**
     * The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getInstanceClasses.
 */
export interface GetInstanceClassesResult {
    readonly architecture?: string;
    /**
     * A list of KVStore available instance classes when the `sortedBy` is "Price". include:
     */
    readonly classes: outputs.kvstore.GetInstanceClassesClass[];
    readonly editionType?: string;
    readonly engine?: string;
    readonly engineVersion?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceChargeType?: string;
    /**
     * A list of KVStore available instance classes.
     */
    readonly instanceClasses: string[];
    readonly nodeType?: string;
    readonly outputFile?: string;
    /**
     * @deprecated The parameter 'package_type' has been deprecated from 1.68.0.
     */
    readonly packageType?: string;
    /**
     * @deprecated The parameter 'performance_type' has been deprecated from 1.68.0.
     */
    readonly performanceType?: string;
    readonly productType?: string;
    readonly seriesType?: string;
    readonly shardNumber?: number;
    readonly sortedBy?: string;
    /**
     * @deprecated The parameter 'storage_type' has been deprecated from 1.68.0.
     */
    readonly storageType?: string;
    readonly zoneId: string;
}
/**
 * This data source provides the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance classes resource available info of Alibaba Cloud.
 *
 * > **NOTE:** Available since v1.49.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const resources = alicloud.getZones({
 *     availableResourceCreation: "KVStore",
 * });
 * const resourcesGetInstanceClasses = resources.then(resources => alicloud.kvstore.getInstanceClasses({
 *     zoneId: resources.zones?.[0]?.id,
 *     instanceChargeType: "PrePaid",
 *     engine: "Redis",
 *     engineVersion: "5.0",
 *     outputFile: "./classes.txt",
 * }));
 * export const firstKvstoreInstanceClass = resourcesGetInstanceClasses.then(resourcesGetInstanceClasses => resourcesGetInstanceClasses.instanceClasses);
 * ```
 */
export function getInstanceClassesOutput(args: GetInstanceClassesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstanceClassesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:kvstore/getInstanceClasses:getInstanceClasses", {
        "architecture": args.architecture,
        "editionType": args.editionType,
        "engine": args.engine,
        "engineVersion": args.engineVersion,
        "instanceChargeType": args.instanceChargeType,
        "nodeType": args.nodeType,
        "outputFile": args.outputFile,
        "packageType": args.packageType,
        "performanceType": args.performanceType,
        "productType": args.productType,
        "seriesType": args.seriesType,
        "shardNumber": args.shardNumber,
        "sortedBy": args.sortedBy,
        "storageType": args.storageType,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceClasses.
 */
export interface GetInstanceClassesOutputArgs {
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     */
    architecture?: pulumi.Input<string>;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     */
    editionType?: pulumi.Input<string>;
    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     */
    engine?: pulumi.Input<string>;
    /**
     * Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     */
    nodeType?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi up`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'package_type' has been deprecated from 1.68.0.
     */
    packageType?: pulumi.Input<string>;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'performance_type' has been deprecated from 1.68.0.
     */
    performanceType?: pulumi.Input<string>;
    /**
     * The type of the service. Valid values:
     * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
     * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     */
    productType?: pulumi.Input<string>;
    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhancedPerformanceType` and `hybridStorage`.
     */
    seriesType?: pulumi.Input<string>;
    /**
     * The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     */
    shardNumber?: pulumi.Input<number>;
    sortedBy?: pulumi.Input<string>;
    /**
     * It has been deprecated from 1.68.0.
     *
     * @deprecated The parameter 'storage_type' has been deprecated from 1.68.0.
     */
    storageType?: pulumi.Input<string>;
    /**
     * The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     */
    zoneId: pulumi.Input<string>;
}
