// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.15.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.kvstore.getInstances({
 *     nameRegex: "testname",
 * });
 * export const firstInstanceName = _default.then(_default => _default.instances?.[0]?.name);
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kvstore/getInstances:getInstances", {
        "architectureType": args.architectureType,
        "editionType": args.editionType,
        "enableDetails": args.enableDetails,
        "engineVersion": args.engineVersion,
        "expired": args.expired,
        "globalInstance": args.globalInstance,
        "ids": args.ids,
        "instanceClass": args.instanceClass,
        "instanceType": args.instanceType,
        "nameRegex": args.nameRegex,
        "networkType": args.networkType,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "searchKey": args.searchKey,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * The type of the architecture. Valid values: `cluster`, `standard` and `SplitRW`.
     */
    architectureType?: string;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.  Valid values: `Enterprise`, `Community`.
     */
    editionType?: string;
    /**
     * Default to `false`. Set it to true can output more details.
     */
    enableDetails?: boolean;
    /**
     * The engine version. Valid values: `2.8`, `4.0`, `5.0`, `6.0`, `7.0`.
     */
    engineVersion?: string;
    /**
     * The expiration status of the instance.
     */
    expired?: string;
    /**
     * Whether to create a distributed cache.
     */
    globalInstance?: boolean;
    /**
     * A list of KVStore DBInstance IDs.
     */
    ids?: string[];
    /**
     * Type of the applied Tair (Redis OSS-Compatible) And Memcache (KVStore) Classic Instance. For more information, see [Instance type table](https://help.aliyun.com/zh/redis/developer-reference/instance-types).
     */
    instanceClass?: string;
    /**
     * The engine type of the KVStore DBInstance. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     */
    instanceType?: string;
    /**
     * A regex string to apply to the instance name.
     */
    nameRegex?: string;
    /**
     * The type of the network. Valid values: `CLASSIC`, `VPC`.
     */
    networkType?: string;
    /**
     * The name of file that can save the collection of instances after running `pulumi preview`.
     */
    outputFile?: string;
    /**
     * The payment type. Valid values: `PostPaid`, `PrePaid`.
     */
    paymentType?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The name of the instance.
     */
    searchKey?: string;
    /**
     * The status of the KVStore DBInstance. Valid values: `Changing`, `CleaningUpExpiredData`, `Creating`, `Flushing`, `HASwitching`, `Inactive`, `MajorVersionUpgrading`, `Migrating`, `NetworkModifying`, `Normal`, `Rebooting`, `SSLModifying`, `Transforming`, `ZoneMigrating`.
     */
    status?: string;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    tags?: {[key: string]: string};
    /**
     * Used to retrieve instances belong to specified VPC.
     */
    vpcId?: string;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.
     */
    vswitchId?: string;
    /**
     * The ID of the zone.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * The architecture type of the instance.
     */
    readonly architectureType?: string;
    readonly editionType?: string;
    readonly enableDetails?: boolean;
    /**
     * The engine version of the instance.
     */
    readonly engineVersion?: string;
    readonly expired?: string;
    readonly globalInstance?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of KVStore Instance IDs.
     */
    readonly ids: string[];
    /**
     * Type of the applied Tair (Redis OSS-Compatible) And Memcached (KVStore) Classic Instance. For more information, see [Instance type table](https://www.alibabacloud.com/help/en/redis/product-overview/overview-4).
     */
    readonly instanceClass?: string;
    /**
     * Database type. Valid Values: `Memcache`, `Redis`. If no value is specified, all types are returned.
     */
    readonly instanceType?: string;
    /**
     * A list of KVStore Instances. Its every element contains the following attributes:
     */
    readonly instances: outputs.kvstore.GetInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of KVStore Instance names.
     */
    readonly names: string[];
    /**
     * The network type of the instance.
     */
    readonly networkType?: string;
    readonly outputFile?: string;
    /**
     * Billing method. Valid Values: `PostPaid` for  Pay-As-You-Go and `PrePaid` for subscription.
     */
    readonly paymentType?: string;
    /**
     * The ID of the resource group to which the instance belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * The keyword used for fuzzy search. The keyword can be based on an instance name or an instance ID.
     */
    readonly searchKey?: string;
    /**
     * Status of the instance.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: string};
    /**
     * VPC ID the instance belongs to.
     */
    readonly vpcId?: string;
    /**
     * VSwitch ID the instance belongs to.
     */
    readonly vswitchId?: string;
    /**
     * The ID of zone.
     */
    readonly zoneId?: string;
}
/**
 * This data source provides the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.15.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = alicloud.kvstore.getInstances({
 *     nameRegex: "testname",
 * });
 * export const firstInstanceName = _default.then(_default => _default.instances?.[0]?.name);
 * ```
 */
export function getInstancesOutput(args?: GetInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:kvstore/getInstances:getInstances", {
        "architectureType": args.architectureType,
        "editionType": args.editionType,
        "enableDetails": args.enableDetails,
        "engineVersion": args.engineVersion,
        "expired": args.expired,
        "globalInstance": args.globalInstance,
        "ids": args.ids,
        "instanceClass": args.instanceClass,
        "instanceType": args.instanceType,
        "nameRegex": args.nameRegex,
        "networkType": args.networkType,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "searchKey": args.searchKey,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesOutputArgs {
    /**
     * The type of the architecture. Valid values: `cluster`, `standard` and `SplitRW`.
     */
    architectureType?: pulumi.Input<string>;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.  Valid values: `Enterprise`, `Community`.
     */
    editionType?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to true can output more details.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * The engine version. Valid values: `2.8`, `4.0`, `5.0`, `6.0`, `7.0`.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * The expiration status of the instance.
     */
    expired?: pulumi.Input<string>;
    /**
     * Whether to create a distributed cache.
     */
    globalInstance?: pulumi.Input<boolean>;
    /**
     * A list of KVStore DBInstance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of the applied Tair (Redis OSS-Compatible) And Memcache (KVStore) Classic Instance. For more information, see [Instance type table](https://help.aliyun.com/zh/redis/developer-reference/instance-types).
     */
    instanceClass?: pulumi.Input<string>;
    /**
     * The engine type of the KVStore DBInstance. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * A regex string to apply to the instance name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The type of the network. Valid values: `CLASSIC`, `VPC`.
     */
    networkType?: pulumi.Input<string>;
    /**
     * The name of file that can save the collection of instances after running `pulumi preview`.
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The payment type. Valid values: `PostPaid`, `PrePaid`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of the instance.
     */
    searchKey?: pulumi.Input<string>;
    /**
     * The status of the KVStore DBInstance. Valid values: `Changing`, `CleaningUpExpiredData`, `Creating`, `Flushing`, `HASwitching`, `Inactive`, `MajorVersionUpgrading`, `Migrating`, `NetworkModifying`, `Normal`, `Rebooting`, `SSLModifying`, `Transforming`, `ZoneMigrating`.
     */
    status?: pulumi.Input<string>;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Used to retrieve instances belong to specified VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The ID of the zone.
     */
    zoneId?: pulumi.Input<string>;
}
