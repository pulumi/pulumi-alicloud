import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an api group resource.To create an API, you must firstly create a group which is a basic attribute of the API.
 *
 * For information about Api Gateway Group and how to use it, see [Create An Api Group](https://www.alibabacloud.com/help/doc-detail/43611.html)
 *
 * ~> **NOTE:** Terraform will auto build api group while it uses `alicloud_api_gateway_group` to build api group.
 */
export declare class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState): Group;
    /**
     * The description of the api gateway group. Defaults to null.
     */
    readonly description: pulumi.Output<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * The description of the api gateway group. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * The description of the api gateway group. Defaults to null.
     */
    readonly description: pulumi.Input<string>;
    /**
     * The name of the api gateway group. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
}
