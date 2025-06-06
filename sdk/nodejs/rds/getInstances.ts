// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The `alicloud.rds.getInstances` data source provides a collection of RDS instances available in Alibaba Cloud account.
 * Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.
 *
 * > **NOTE:** Available since v1.7.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const dbInstancesDs = alicloud.rds.getInstances({
 *     nameRegex: "data-\\d+",
 *     status: "Running",
 *     tags: {
 *         type: "database",
 *         size: "tiny",
 *     },
 * });
 * export const firstDbInstanceId = dbInstancesDs.then(dbInstancesDs => dbInstancesDs.instances?.[0]?.id);
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:rds/getInstances:getInstances", {
        "connectionMode": args.connectionMode,
        "dbType": args.dbType,
        "enableDetails": args.enableDetails,
        "engine": args.engine,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * `Standard` for standard access mode and `Safe` for high security access mode.
     */
    connectionMode?: string;
    /**
     * `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     */
    dbType?: string;
    /**
     * Default to `false`. Set it to `true` can output parameter template about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`. If no value is specified, all types are returned.
     */
    engine?: string;
    /**
     * A list of RDS instance IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by instance name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * Status of the instance.
     */
    status?: string;
    /**
     * A map of tags assigned to the DB instances. 
     * Note: Before 1.60.0, the value's format is a `json` string which including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `"{\"key1\":\"value1\"}"`
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
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * `Standard` for standard access mode and `Safe` for high security access mode.
     */
    readonly connectionMode?: string;
    /**
     * `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     */
    readonly dbType?: string;
    readonly enableDetails?: boolean;
    /**
     * Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`. If no value is specified, all types are returned.
     */
    readonly engine?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of RDS instance IDs.
     */
    readonly ids: string[];
    /**
     * A list of RDS instances. Each element contains the following attributes:
     */
    readonly instances: outputs.rds.GetInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of RDS instance names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * Status of the instance.
     */
    readonly status?: string;
    readonly tags?: {[key: string]: string};
    readonly totalCount: number;
    /**
     * ID of the VPC the instance belongs to.
     */
    readonly vpcId?: string;
    /**
     * ID of the vSwitch the instance belongs to.
     */
    readonly vswitchId?: string;
}
/**
 * The `alicloud.rds.getInstances` data source provides a collection of RDS instances available in Alibaba Cloud account.
 * Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.
 *
 * > **NOTE:** Available since v1.7.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const dbInstancesDs = alicloud.rds.getInstances({
 *     nameRegex: "data-\\d+",
 *     status: "Running",
 *     tags: {
 *         type: "database",
 *         size: "tiny",
 *     },
 * });
 * export const firstDbInstanceId = dbInstancesDs.then(dbInstancesDs => dbInstancesDs.instances?.[0]?.id);
 * ```
 */
export function getInstancesOutput(args?: GetInstancesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstancesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:rds/getInstances:getInstances", {
        "connectionMode": args.connectionMode,
        "dbType": args.dbType,
        "enableDetails": args.enableDetails,
        "engine": args.engine,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesOutputArgs {
    /**
     * `Standard` for standard access mode and `Safe` for high security access mode.
     */
    connectionMode?: pulumi.Input<string>;
    /**
     * `Primary` for primary instance, `Readonly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     */
    dbType?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output parameter template about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`. If no value is specified, all types are returned.
     */
    engine?: pulumi.Input<string>;
    /**
     * A list of RDS instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by instance name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * Status of the instance.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the DB instances. 
     * Note: Before 1.60.0, the value's format is a `json` string which including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `"{\"key1\":\"value1\"}"`
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
}
