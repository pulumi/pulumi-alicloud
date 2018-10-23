import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a SSL VPN server resource. [Refer to details](https://www.alibabacloud.com/help/doc-detail/64960.htm)
 *
 * ~> **NOTE:** Terraform will auto build ssl vpn server while it uses `alicloud_ssl_vpn_server` to build a ssl vpn server resource.
 */
export declare class SslVpnServer extends pulumi.CustomResource {
    /**
     * Get an existing SslVpnServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SslVpnServerState): SslVpnServer;
    /**
     * The encryption algorithm used by the SSL-VPN server. Valid value: AES-128-CBC (default)| AES-192-CBC | AES-256-CBC | none
     */
    readonly cipher: pulumi.Output<string | undefined>;
    /**
     * The CIDR block from which access addresses are allocated to the virtual network interface card of the client.
     */
    readonly clientIpPool: pulumi.Output<string>;
    /**
     * Specify whether to compress the communication. Valid value: true (default) | false
     */
    readonly compress: pulumi.Output<boolean | undefined>;
    /**
     * The number of current connections.
     */
    readonly connections: pulumi.Output<number>;
    /**
     * The internet IP of the SSL-VPN server.
     */
    readonly internetIp: pulumi.Output<string>;
    /**
     * The CIDR block to be accessed by the client through the SSL-VPN connection.
     */
    readonly localSubnet: pulumi.Output<string>;
    /**
     * The maximum number of connections.
     */
    readonly maxConnections: pulumi.Output<number>;
    /**
     * The name of the SSL-VPN server.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The port used by the SSL-VPN server. The default value is 1194.The following ports cannot be used: [22, 2222, 22222, 9000, 9001, 9002, 7505, 80, 443, 53, 68, 123, 4510, 4560, 500, 4500].
     */
    readonly port: pulumi.Output<number | undefined>;
    /**
     * The protocol used by the SSL-VPN server. Valid value: UDP(default) |TCP
     */
    readonly protocol: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId: pulumi.Output<string>;
    /**
     * Create a SslVpnServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SslVpnServerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SslVpnServer resources.
 */
export interface SslVpnServerState {
    /**
     * The encryption algorithm used by the SSL-VPN server. Valid value: AES-128-CBC (default)| AES-192-CBC | AES-256-CBC | none
     */
    readonly cipher?: pulumi.Input<string>;
    /**
     * The CIDR block from which access addresses are allocated to the virtual network interface card of the client.
     */
    readonly clientIpPool?: pulumi.Input<string>;
    /**
     * Specify whether to compress the communication. Valid value: true (default) | false
     */
    readonly compress?: pulumi.Input<boolean>;
    /**
     * The number of current connections.
     */
    readonly connections?: pulumi.Input<number>;
    /**
     * The internet IP of the SSL-VPN server.
     */
    readonly internetIp?: pulumi.Input<string>;
    /**
     * The CIDR block to be accessed by the client through the SSL-VPN connection.
     */
    readonly localSubnet?: pulumi.Input<string>;
    /**
     * The maximum number of connections.
     */
    readonly maxConnections?: pulumi.Input<number>;
    /**
     * The name of the SSL-VPN server.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The port used by the SSL-VPN server. The default value is 1194.The following ports cannot be used: [22, 2222, 22222, 9000, 9001, 9002, 7505, 80, 443, 53, 68, 123, 4510, 4560, 500, 4500].
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol used by the SSL-VPN server. Valid value: UDP(default) |TCP
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SslVpnServer resource.
 */
export interface SslVpnServerArgs {
    /**
     * The encryption algorithm used by the SSL-VPN server. Valid value: AES-128-CBC (default)| AES-192-CBC | AES-256-CBC | none
     */
    readonly cipher?: pulumi.Input<string>;
    /**
     * The CIDR block from which access addresses are allocated to the virtual network interface card of the client.
     */
    readonly clientIpPool: pulumi.Input<string>;
    /**
     * Specify whether to compress the communication. Valid value: true (default) | false
     */
    readonly compress?: pulumi.Input<boolean>;
    /**
     * The CIDR block to be accessed by the client through the SSL-VPN connection.
     */
    readonly localSubnet: pulumi.Input<string>;
    /**
     * The name of the SSL-VPN server.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The port used by the SSL-VPN server. The default value is 1194.The following ports cannot be used: [22, 2222, 22222, 9000, 9001, 9002, 7505, 80, 443, 53, 68, 123, 4510, 4560, 500, 4500].
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol used by the SSL-VPN server. Valid value: UDP(default) |TCP
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * The ID of the VPN gateway.
     */
    readonly vpnGatewayId: pulumi.Input<string>;
}
