import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPC resource.
 *
 * ~> **NOTE:** Terraform will auto build a router and a route table while it uses `alicloud_vpc` to build a vpc resource.
 */
export declare class Network extends pulumi.CustomResource {
    /**
     * Get an existing Network resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkState): Network;
    /**
     * The CIDR block for the VPC.
     */
    readonly cidrBlock: pulumi.Output<string>;
    /**
     * The VPC description. Defaults to null.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The name of the VPC. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The route table ID of the router created by default on VPC creation.
     */
    readonly routeTableId: pulumi.Output<string>;
    /**
     * The ID of the router created by default on VPC creation.
     */
    readonly routerId: pulumi.Output<string>;
    readonly routerTableId: pulumi.Output<string>;
    /**
     * Create a Network resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Network resources.
 */
export interface NetworkState {
    /**
     * The CIDR block for the VPC.
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * The VPC description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the VPC. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The route table ID of the router created by default on VPC creation.
     */
    readonly routeTableId?: pulumi.Input<string>;
    /**
     * The ID of the router created by default on VPC creation.
     */
    readonly routerId?: pulumi.Input<string>;
    readonly routerTableId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Network resource.
 */
export interface NetworkArgs {
    /**
     * The CIDR block for the VPC.
     */
    readonly cidrBlock: pulumi.Input<string>;
    /**
     * The VPC description. Defaults to null.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the VPC. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
}
