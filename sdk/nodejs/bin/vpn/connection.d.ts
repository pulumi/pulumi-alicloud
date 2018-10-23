import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a VPN connection resource.
 *
 * ~> **NOTE:** Terraform will auto build vpn connection while it uses `alicloud_vpn_connection` to build a vpn connection resource.
 *              The vpn connection depends on VPN and VPN customer gateway.
 */
export declare class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState): Connection;
    /**
     * The ID of the customer gateway.
     */
    readonly customerGatewayId: pulumi.Output<string>;
    /**
     * Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
     */
    readonly effectImmediately: pulumi.Output<boolean | undefined>;
    /**
     * The configurations of phase-one negotiation.
     */
    readonly ikeConfigs: pulumi.Output<{
        ikeAuthAlg?: string;
        ikeEncAlg?: string;
        ikeLifetime?: number;
        ikeLocalId?: string;
        ikeMode?: string;
        ikePfs?: string;
        ikeRemoteId?: string;
        ikeVersion?: string;
        psk?: string;
    }[] | undefined>;
    /**
     * The configurations of phase-two negotiation.
     */
    readonly ipsecConfigs: pulumi.Output<{
        ipsecAuthAlg?: string;
        ipsecEncAlg?: string;
        ipsecLifetime?: number;
        ipsecPfs?: string;
    }[] | undefined>;
    /**
     * The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     */
    readonly localSubnets: pulumi.Output<string[]>;
    /**
     * The name of the IPsec connection.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     */
    readonly remoteSubnets: pulumi.Output<string[]>;
    /**
     * The status of VPN connection.
     */
    readonly status: pulumi.Output<string>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId: pulumi.Output<string>;
    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The ID of the customer gateway.
     */
    readonly customerGatewayId?: pulumi.Input<string>;
    /**
     * Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
     */
    readonly effectImmediately?: pulumi.Input<boolean>;
    /**
     * The configurations of phase-one negotiation.
     */
    readonly ikeConfigs?: pulumi.Input<pulumi.Input<{
        ikeAuthAlg?: pulumi.Input<string>;
        ikeEncAlg?: pulumi.Input<string>;
        ikeLifetime?: pulumi.Input<number>;
        ikeLocalId?: pulumi.Input<string>;
        ikeMode?: pulumi.Input<string>;
        ikePfs?: pulumi.Input<string>;
        ikeRemoteId?: pulumi.Input<string>;
        ikeVersion?: pulumi.Input<string>;
        psk?: pulumi.Input<string>;
    }>[]>;
    /**
     * The configurations of phase-two negotiation.
     */
    readonly ipsecConfigs?: pulumi.Input<pulumi.Input<{
        ipsecAuthAlg?: pulumi.Input<string>;
        ipsecEncAlg?: pulumi.Input<string>;
        ipsecLifetime?: pulumi.Input<number>;
        ipsecPfs?: pulumi.Input<string>;
    }>[]>;
    /**
     * The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     */
    readonly localSubnets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the IPsec connection.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     */
    readonly remoteSubnets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of VPN connection.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The ID of the customer gateway.
     */
    readonly customerGatewayId: pulumi.Input<string>;
    /**
     * Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
     */
    readonly effectImmediately?: pulumi.Input<boolean>;
    /**
     * The configurations of phase-one negotiation.
     */
    readonly ikeConfigs?: pulumi.Input<pulumi.Input<{
        ikeAuthAlg?: pulumi.Input<string>;
        ikeEncAlg?: pulumi.Input<string>;
        ikeLifetime?: pulumi.Input<number>;
        ikeLocalId?: pulumi.Input<string>;
        ikeMode?: pulumi.Input<string>;
        ikePfs?: pulumi.Input<string>;
        ikeRemoteId?: pulumi.Input<string>;
        ikeVersion?: pulumi.Input<string>;
        psk?: pulumi.Input<string>;
    }>[]>;
    /**
     * The configurations of phase-two negotiation.
     */
    readonly ipsecConfigs?: pulumi.Input<pulumi.Input<{
        ipsecAuthAlg?: pulumi.Input<string>;
        ipsecEncAlg?: pulumi.Input<string>;
        ipsecLifetime?: pulumi.Input<number>;
        ipsecPfs?: pulumi.Input<string>;
    }>[]>;
    /**
     * The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     */
    readonly localSubnets: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the IPsec connection.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     */
    readonly remoteSubnets: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId: pulumi.Input<string>;
}
