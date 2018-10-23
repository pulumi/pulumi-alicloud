import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Alicloud Route Table Attachment resource for associating Route Table to VSwitch Instance.
 *
 * ~> **NOTE:** Terraform will auto build route table attachment while it uses `alicloud_route_table_attachment` to build a route table attachment resource.
 *
 * For information about route table and how to use it, see [What is Route Table](https://www.alibabacloud.com/help/doc-detail/87057.htm).
 */
export declare class RouteTableAttachment extends pulumi.CustomResource {
    /**
     * Get an existing RouteTableAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteTableAttachmentState): RouteTableAttachment;
    /**
     * The route_table_id of the route table attachment, the field can't be changed.
     */
    readonly routeTableId: pulumi.Output<string>;
    /**
     * The vswitch_id of the route table attachment, the field can't be changed.
     */
    readonly vswitchId: pulumi.Output<string>;
    /**
     * Create a RouteTableAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteTableAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouteTableAttachment resources.
 */
export interface RouteTableAttachmentState {
    /**
     * The route_table_id of the route table attachment, the field can't be changed.
     */
    readonly routeTableId?: pulumi.Input<string>;
    /**
     * The vswitch_id of the route table attachment, the field can't be changed.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouteTableAttachment resource.
 */
export interface RouteTableAttachmentArgs {
    /**
     * The route_table_id of the route table attachment, the field can't be changed.
     */
    readonly routeTableId: pulumi.Input<string>;
    /**
     * The vswitch_id of the route table attachment, the field can't be changed.
     */
    readonly vswitchId: pulumi.Input<string>;
}
