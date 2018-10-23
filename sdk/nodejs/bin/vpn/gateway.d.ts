import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPN gateway resource.
 *
 * ~> **NOTE:** Terraform will auto build vpn instance  while it uses `alicloud_vpn_gateway` to build a vpn resource.
 */
export declare class Gateway extends pulumi.CustomResource {
    /**
     * Get an existing Gateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayState): Gateway;
    /**
     * The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
     * It can't be changed by terraform.
     */
    readonly bandwidth: pulumi.Output<number>;
    /**
     * The business status of the VPN gateway.
     */
    readonly businessStatus: pulumi.Output<string>;
    /**
     * The description of the VPN instance.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    readonly enableIpsec: pulumi.Output<boolean | undefined>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    readonly enableSsl: pulumi.Output<boolean | undefined>;
    /**
     * The charge type for instance.
     */
    readonly instanceChargeType: pulumi.Output<string | undefined>;
    /**
     * The internet ip of the VPN.
     */
    readonly internetIp: pulumi.Output<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The filed is only required while the InstanceChargeType is prepaid.
     */
    readonly period: pulumi.Output<number | undefined>;
    /**
     * The max connections of SSL VPN.
     */
    readonly sslConnections: pulumi.Output<number | undefined>;
    /**
     * The status of the VPN gateway.
     */
    readonly status: pulumi.Output<string>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * Create a Gateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Gateway resources.
 */
export interface GatewayState {
    /**
     * The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
     * It can't be changed by terraform.
     */
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * The business status of the VPN gateway.
     */
    readonly businessStatus?: pulumi.Input<string>;
    /**
     * The description of the VPN instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    readonly enableIpsec?: pulumi.Input<boolean>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    readonly enableSsl?: pulumi.Input<boolean>;
    /**
     * The charge type for instance.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The internet ip of the VPN.
     */
    readonly internetIp?: pulumi.Input<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The filed is only required while the InstanceChargeType is prepaid.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The max connections of SSL VPN.
     */
    readonly sslConnections?: pulumi.Input<number>;
    /**
     * The status of the VPN gateway.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    readonly vpcId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Gateway resource.
 */
export interface GatewayArgs {
    /**
     * The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
     * It can't be changed by terraform.
     */
    readonly bandwidth: pulumi.Input<number>;
    /**
     * The description of the VPN instance.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
     */
    readonly enableIpsec?: pulumi.Input<boolean>;
    /**
     * Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
     */
    readonly enableSsl?: pulumi.Input<boolean>;
    /**
     * The charge type for instance.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the VPN. Defaults to null.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The filed is only required while the InstanceChargeType is prepaid.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The max connections of SSL VPN.
     */
    readonly sslConnections?: pulumi.Input<number>;
    /**
     * The VPN belongs the vpc_id, the field can't be changed.
     */
    readonly vpcId: pulumi.Input<string>;
}
