import * as pulumi from "@pulumi/pulumi";
/**
 * The `alicloud_db_instances` data source provides a collection of RDS instances available in Alibaba Cloud account.
 * Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.
 */
export declare function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult>;
/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * `Standard` for standard access mode and `Safe` for high security access mode.
     */
    readonly connectionMode?: string;
    /**
     * `Primary` for primary instance, `ReadOnly` for read-only instance, `Guard` for disaster recovery instance, and `Temp` for temporary instance.
     */
    readonly dbType?: string;
    /**
     * Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL` and `PPAS`. If no value is specified, all types are returned.
     */
    readonly engine?: string;
    /**
     * A regex string to filter results by instance name.
     */
    readonly nameRegex?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Status of the instance.
     */
    readonly status?: string;
    /**
     * Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
     */
    readonly tags?: string;
    /**
     * Used to retrieve instances belong to specified VPC.
     */
    readonly vpcId?: string;
    /**
     * Used to retrieve instances belong to specified `vswitch` resources.
     */
    readonly vswitchId?: string;
}
/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * A list of RDS instances. Each element contains the following attributes:
     */
    readonly instances: {
        availabilityZone: string;
        chargeType: string;
        connectionMode: string;
        createTime: string;
        dbType: string;
        engine: string;
        engineVersion: string;
        expireTime: string;
        guardInstanceId: string;
        id: string;
        instanceType: string;
        masterInstanceId: string;
        name: string;
        netType: string;
        readonlyInstanceIds: string[];
        regionId: string;
        status: string;
        tempInstanceId: string;
        vpcId: string;
        vswitchId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
