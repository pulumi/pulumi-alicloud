import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPN customer gateway resource.
 *
 * ~> **NOTE:** Terraform will auto build vpn customer gateway instance  while it uses `alicloud_vpn_customer_gateway` to build a vpn customer gateway resource.
 */
export declare class CustomerGateway extends pulumi.CustomResource {
    /**
     * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomerGatewayState): CustomerGateway;
    /**
     * The description of the VPN customer gateway instance.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The IP address of the customer gateway.
     */
    readonly ipAddress: pulumi.Output<string>;
    /**
     * The name of the VPN customer gateway. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a CustomerGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomerGatewayArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering CustomerGateway resources.
 */
export interface CustomerGatewayState {
    /**
     * The description of the VPN customer gateway instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The IP address of the customer gateway.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * The name of the VPN customer gateway. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a CustomerGateway resource.
 */
export interface CustomerGatewayArgs {
    /**
     * The description of the VPN customer gateway instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The IP address of the customer gateway.
     */
    readonly ipAddress: pulumi.Input<string>;
    /**
     * The name of the VPN customer gateway. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
}
