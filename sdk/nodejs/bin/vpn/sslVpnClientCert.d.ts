import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a SSL VPN client cert resource.
 *
 * ~> **NOTE:** Terraform will auto build SSL VPN client certs  while it uses `alicloud_ssl_vpn_client_cert` to build a ssl vpn client certs resource.
 *              It depends on VPN instance and SSL VPN Server.
 */
export declare class SslVpnClientCert extends pulumi.CustomResource {
    /**
     * Get an existing SslVpnClientCert resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SslVpnClientCertState): SslVpnClientCert;
    /**
     * The name of the client certificate.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the SSL-VPN server.
     */
    readonly sslVpnServerId: pulumi.Output<string>;
    /**
     * The status of the client certificate.
     */
    readonly status: pulumi.Output<string>;
    /**
     * Create a SslVpnClientCert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SslVpnClientCertArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SslVpnClientCert resources.
 */
export interface SslVpnClientCertState {
    /**
     * The name of the client certificate.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the SSL-VPN server.
     */
    readonly sslVpnServerId?: pulumi.Input<string>;
    /**
     * The status of the client certificate.
     */
    readonly status?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SslVpnClientCert resource.
 */
export interface SslVpnClientCertArgs {
    /**
     * The name of the client certificate.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the SSL-VPN server.
     */
    readonly sslVpnServerId: pulumi.Input<string>;
}
