import * as pulumi from "@pulumi/pulumi";
/**
 * The `alicloud_mongo_instances` data source provides a collection of MongoDB instances available in Alicloud account.
 * Filters support regular expression for the instance name, engine or instance type.
 */
export declare function getMongoInstances(args?: GetMongoInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetMongoInstancesResult>;
/**
 * A collection of arguments for invoking getMongoInstances.
 */
export interface GetMongoInstancesArgs {
    /**
     * Instance availability zone.
     */
    readonly availabilityZone?: string;
    /**
     * Sizing of the instance to be queried.
     */
    readonly instanceClass?: string;
    /**
     * Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
     */
    readonly instanceType?: string;
    /**
     * A regex string to apply to the instance name.
     */
    readonly nameRegex?: string;
    /**
     * The name of file that can save the collection of instances after running `terraform plan`.
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getMongoInstances.
 */
export interface GetMongoInstancesResult {
    /**
     * A list of MongoDB instances. Its every element contains the following attributes:
     */
    readonly instances: {
        availabilityZone: string;
        chargeType: string;
        creationTime: string;
        engine: string;
        engineVersion: string;
        expirationTime: string;
        id: string;
        instanceClass: string;
        instanceType: string;
        lockMode: string;
        mongos: {
            class: string;
            description: string;
            nodeId: string;
        }[];
        name: string;
        networkType: string;
        regionId: string;
        replication: string;
        shards: {
            class: string;
            description: string;
            nodeId: string;
            storage: number;
        }[];
        status: string;
        storage: number;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
