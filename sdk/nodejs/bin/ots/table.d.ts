import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an OTS table resource.
 *
 * ~> **NOTE:** From Provider version 1.10.0, the provider field 'ots_instance_name' has been deprecated and
 * you should use resource alicloud_ots_table's new field 'instance_name' and 'table_name' to re-import this resource.
 */
export declare class Table extends pulumi.CustomResource {
    /**
     * Get an existing Table resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableState): Table;
    /**
     * The name of the OTS instance in which table will located.
     */
    readonly instanceName: pulumi.Output<string>;
    /**
     * The maximum number of versions stored in this table. The valid value is 1-2147483647.
     */
    readonly maxVersion: pulumi.Output<number>;
    /**
     * The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four.
     */
    readonly primaryKeys: pulumi.Output<{
        name: string;
        type: string;
    }[]>;
    /**
     * The table name of the OTS instance. If changed, a new table would be created.
     */
    readonly tableName: pulumi.Output<string>;
    /**
     * The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
     */
    readonly timeToLive: pulumi.Output<number>;
    /**
     * Create a Table resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Table resources.
 */
export interface TableState {
    /**
     * The name of the OTS instance in which table will located.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * The maximum number of versions stored in this table. The valid value is 1-2147483647.
     */
    readonly maxVersion?: pulumi.Input<number>;
    /**
     * The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four.
     */
    readonly primaryKeys?: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>[]>;
    /**
     * The table name of the OTS instance. If changed, a new table would be created.
     */
    readonly tableName?: pulumi.Input<string>;
    /**
     * The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
     */
    readonly timeToLive?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    /**
     * The name of the OTS instance in which table will located.
     */
    readonly instanceName: pulumi.Input<string>;
    /**
     * The maximum number of versions stored in this table. The valid value is 1-2147483647.
     */
    readonly maxVersion: pulumi.Input<number>;
    /**
     * The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four.
     */
    readonly primaryKeys: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>[]>;
    /**
     * The table name of the OTS instance. If changed, a new table would be created.
     */
    readonly tableName: pulumi.Input<string>;
    /**
     * The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
     */
    readonly timeToLive: pulumi.Input<number>;
}
