import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a route table resource.
 *
 * ~> **NOTE:** Terraform will auto build route table instance while it uses `alicloud_route_table` to build a route table resource.
 *
 * For information about route table and how to use it, see [What is Route Table](https://www.alibabacloud.com/help/doc-detail/87057.htm).
 */
export declare class RouteTable extends pulumi.CustomResource {
    /**
     * Get an existing RouteTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteTableState): RouteTable;
    /**
     * The description of the route table instance.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The name of the route table.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The vpc_id of the route table, the field can't be changed.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * Create a RouteTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteTableArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouteTable resources.
 */
export interface RouteTableState {
    /**
     * The description of the route table instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the route table.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The vpc_id of the route table, the field can't be changed.
     */
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouteTable resource.
 */
export interface RouteTableArgs {
    /**
     * The description of the route table instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the route table.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The vpc_id of the route table, the field can't be changed.
     */
    readonly vpcId: pulumi.Input<string>;
}
