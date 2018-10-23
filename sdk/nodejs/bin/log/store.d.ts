import * as pulumi from "@pulumi/pulumi";
/**
 * The log store is a unit in Log Service to collect, store, and query the log data. Each log store belongs to a project,
 * and each project can create multiple Logstores. [Refer to details](https://www.alibabacloud.com/help/doc-detail/48874.htm)
 */
export declare class Store extends pulumi.CustomResource {
    /**
     * Get an existing Store resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoreState): Store;
    /**
     * The log store, which is unique in the same project.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    readonly retentionPeriod: pulumi.Output<number | undefined>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    readonly shardCount: pulumi.Output<number | undefined>;
    readonly shards: pulumi.Output<{
        beginKey: string;
        endKey: string;
        id: number;
        status: string;
    }[]>;
    /**
     * Create a Store resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoreArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Store resources.
 */
export interface StoreState {
    /**
     * The log store, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    readonly retentionPeriod?: pulumi.Input<number>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    readonly shardCount?: pulumi.Input<number>;
    readonly shards?: pulumi.Input<pulumi.Input<{
        beginKey?: pulumi.Input<string>;
        endKey?: pulumi.Input<string>;
        id?: pulumi.Input<number>;
        status?: pulumi.Input<string>;
    }>[]>;
}
/**
 * The set of arguments for constructing a Store resource.
 */
export interface StoreArgs {
    /**
     * The log store, which is unique in the same project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project name to the log store belongs.
     */
    readonly project: pulumi.Input<string>;
    /**
     * The data retention time (in days). Valid values: [1-3650]. Default to 30. Log store data will be stored permanently when the value is "3650".
     */
    readonly retentionPeriod?: pulumi.Input<number>;
    /**
     * The number of shards in this log store. Default to 2. You can modify it by "Split" or "Merge" operations. [Refer to details](https://www.alibabacloud.com/help/doc-detail/28976.htm)
     */
    readonly shardCount?: pulumi.Input<number>;
}
