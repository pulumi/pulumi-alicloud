// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpn.ConnectionArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionState;
import com.pulumi.alicloud.vpn.outputs.ConnectionBgpConfig;
import com.pulumi.alicloud.vpn.outputs.ConnectionHealthCheckConfig;
import com.pulumi.alicloud.vpn.outputs.ConnectionIkeConfig;
import com.pulumi.alicloud.vpn.outputs.ConnectionIpsecConfig;
import com.pulumi.alicloud.vpn.outputs.ConnectionTunnelOptionsSpecification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * [IPsec-VPN connections support the dual-tunnel mode](https://www.alibabacloud.com/help/en/vpn/product-overview/ipsec-vpn-connections-support-the-dual-tunnel-mode)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpn.VpnFunctions;
 * import com.pulumi.alicloud.vpn.inputs.GetGatewayZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.vpn.Gateway;
 * import com.pulumi.alicloud.vpn.GatewayArgs;
 * import com.pulumi.alicloud.vpn.CustomerGateway;
 * import com.pulumi.alicloud.vpn.CustomerGatewayArgs;
 * import com.pulumi.alicloud.vpn.Connection;
 * import com.pulumi.alicloud.vpn.ConnectionArgs;
 * import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationArgs;
 * import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs;
 * import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs;
 * import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("terraform-example");
 *         final var spec = config.get("spec").orElse("5");
 *         final var default = VpnFunctions.getGatewayZones(GetGatewayZonesArgs.builder()
 *             .spec("5M")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .cidrBlock("172.16.0.0/16")
 *             .vpcName(name)
 *             .build());
 * 
 *         var default0 = new Switch("default0", SwitchArgs.builder()
 *             .cidrBlock("172.16.0.0/24")
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(default_.ids()[0])
 *             .build());
 * 
 *         var default1 = new Switch("default1", SwitchArgs.builder()
 *             .cidrBlock("172.16.1.0/24")
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(default_.ids()[1])
 *             .build());
 * 
 *         var hA_VPN = new Gateway("HA-VPN", GatewayArgs.builder()
 *             .vpnType("Normal")
 *             .disasterRecoveryVswitchId(default1.id())
 *             .vpnGatewayName(name)
 *             .vswitchId(default0.id())
 *             .autoPay(true)
 *             .vpcId(defaultNetwork.id())
 *             .networkType("public")
 *             .paymentType("Subscription")
 *             .enableIpsec(true)
 *             .bandwidth(spec)
 *             .build());
 * 
 *         var defaultCustomerGateway = new CustomerGateway("defaultCustomerGateway", CustomerGatewayArgs.builder()
 *             .description("defaultCustomerGateway")
 *             .ipAddress("2.2.2.5")
 *             .asn("2224")
 *             .customerGatewayName(name)
 *             .build());
 * 
 *         var changeCustomerGateway = new CustomerGateway("changeCustomerGateway", CustomerGatewayArgs.builder()
 *             .description("changeCustomerGateway")
 *             .ipAddress("2.2.2.6")
 *             .asn("2225")
 *             .customerGatewayName(name)
 *             .build());
 * 
 *         var defaultConnection = new Connection("defaultConnection", ConnectionArgs.builder()
 *             .vpnGatewayId(HA_VPN.id())
 *             .vpnConnectionName(name)
 *             .localSubnets("3.0.0.0/24")
 *             .remoteSubnets(            
 *                 "10.0.0.0/24",
 *                 "10.0.1.0/24")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "example")
 *             ))
 *             .enableTunnelsBgp(true)
 *             .tunnelOptionsSpecifications(            
 *                 ConnectionTunnelOptionsSpecificationArgs.builder()
 *                     .tunnelIpsecConfig(ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs.builder()
 *                         .ipsecAuthAlg("md5")
 *                         .ipsecEncAlg("aes256")
 *                         .ipsecLifetime(16400)
 *                         .ipsecPfs("group5")
 *                         .build())
 *                     .customerGatewayId(defaultCustomerGateway.id())
 *                     .role("master")
 *                     .tunnelBgpConfig(ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs.builder()
 *                         .localAsn("1219002")
 *                         .tunnelCidr("169.254.30.0/30")
 *                         .localBgpIp("169.254.30.1")
 *                         .build())
 *                     .tunnelIkeConfig(ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs.builder()
 *                         .ikeMode("aggressive")
 *                         .ikeVersion("ikev2")
 *                         .localId("localid_tunnel2")
 *                         .psk("12345678")
 *                         .remoteId("remote2")
 *                         .ikeAuthAlg("md5")
 *                         .ikeEncAlg("aes256")
 *                         .ikeLifetime(3600)
 *                         .ikePfs("group14")
 *                         .build())
 *                     .build(),
 *                 ConnectionTunnelOptionsSpecificationArgs.builder()
 *                     .tunnelIkeConfig(ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs.builder()
 *                         .remoteId("remote24")
 *                         .ikeEncAlg("aes256")
 *                         .ikeLifetime(27000)
 *                         .ikeMode("aggressive")
 *                         .ikePfs("group5")
 *                         .ikeAuthAlg("md5")
 *                         .ikeVersion("ikev2")
 *                         .localId("localid_tunnel2")
 *                         .psk("12345678")
 *                         .build())
 *                     .tunnelIpsecConfig(ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs.builder()
 *                         .ipsecLifetime(2700)
 *                         .ipsecPfs("group14")
 *                         .ipsecAuthAlg("md5")
 *                         .ipsecEncAlg("aes256")
 *                         .build())
 *                     .customerGatewayId(defaultCustomerGateway.id())
 *                     .role("slave")
 *                     .tunnelBgpConfig(ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs.builder()
 *                         .localAsn("1219002")
 *                         .localBgpIp("169.254.40.1")
 *                         .tunnelCidr("169.254.40.0/30")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * VPN connection can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpn/connection:Connection example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpn/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Whether to configure routing automatically. Value:
     * - **true**: Automatically configure routes.
     * - **false**: does not automatically configure routes.
     * 
     */
    @Export(name="autoConfigRoute", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoConfigRoute;

    /**
     * @return Whether to configure routing automatically. Value:
     * - **true**: Automatically configure routes.
     * - **false**: does not automatically configure routes.
     * 
     */
    public Output<Optional<Boolean>> autoConfigRoute() {
        return Codegen.optional(this.autoConfigRoute);
    }
    /**
     * vpnBgp configuration. See `bgp_config` below.
     * 
     */
    @Export(name="bgpConfig", refs={ConnectionBgpConfig.class}, tree="[0]")
    private Output<ConnectionBgpConfig> bgpConfig;

    /**
     * @return vpnBgp configuration. See `bgp_config` below.
     * 
     */
    public Output<ConnectionBgpConfig> bgpConfig() {
        return this.bgpConfig;
    }
    /**
     * The time when the IPsec-VPN connection was created.
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return The time when the IPsec-VPN connection was created.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * The ID of the customer gateway.
     * 
     */
    @Export(name="customerGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerGatewayId;

    /**
     * @return The ID of the customer gateway.
     * 
     */
    public Output<Optional<String>> customerGatewayId() {
        return Codegen.optional(this.customerGatewayId);
    }
    /**
     * Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    @Export(name="effectImmediately", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> effectImmediately;

    /**
     * @return Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    public Output<Optional<Boolean>> effectImmediately() {
        return Codegen.optional(this.effectImmediately);
    }
    /**
     * Wether enable Dpd detection.
     * 
     */
    @Export(name="enableDpd", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableDpd;

    /**
     * @return Wether enable Dpd detection.
     * 
     */
    public Output<Boolean> enableDpd() {
        return this.enableDpd;
    }
    /**
     * enable nat traversal.
     * 
     */
    @Export(name="enableNatTraversal", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableNatTraversal;

    /**
     * @return enable nat traversal.
     * 
     */
    public Output<Boolean> enableNatTraversal() {
        return this.enableNatTraversal;
    }
    /**
     * Enable tunnel bgp.
     * 
     */
    @Export(name="enableTunnelsBgp", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableTunnelsBgp;

    /**
     * @return Enable tunnel bgp.
     * 
     */
    public Output<Boolean> enableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }
    /**
     * Health Check information. See `health_check_config` below.
     * 
     */
    @Export(name="healthCheckConfig", refs={ConnectionHealthCheckConfig.class}, tree="[0]")
    private Output<ConnectionHealthCheckConfig> healthCheckConfig;

    /**
     * @return Health Check information. See `health_check_config` below.
     * 
     */
    public Output<ConnectionHealthCheckConfig> healthCheckConfig() {
        return this.healthCheckConfig;
    }
    /**
     * The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    @Export(name="ikeConfig", refs={ConnectionIkeConfig.class}, tree="[0]")
    private Output<ConnectionIkeConfig> ikeConfig;

    /**
     * @return The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    public Output<ConnectionIkeConfig> ikeConfig() {
        return this.ikeConfig;
    }
    /**
     * IPsec configuration. See `ipsec_config` below.
     * 
     */
    @Export(name="ipsecConfig", refs={ConnectionIpsecConfig.class}, tree="[0]")
    private Output<ConnectionIpsecConfig> ipsecConfig;

    /**
     * @return IPsec configuration. See `ipsec_config` below.
     * 
     */
    public Output<ConnectionIpsecConfig> ipsecConfig() {
        return this.ipsecConfig;
    }
    /**
     * The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    @Export(name="localSubnets", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> localSubnets;

    /**
     * @return The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    public Output<List<String>> localSubnets() {
        return this.localSubnets;
    }
    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network type of the IPsec connection. Value:
     * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
     * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
     * 
     */
    @Export(name="networkType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkType;

    /**
     * @return The network type of the IPsec connection. Value:
     * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
     * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
     * 
     */
    public Output<Optional<String>> networkType() {
        return Codegen.optional(this.networkType);
    }
    /**
     * The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    @Export(name="remoteSubnets", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> remoteSubnets;

    /**
     * @return The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    public Output<List<String>> remoteSubnets() {
        return this.remoteSubnets;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The negotiation status of Tunnel.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The negotiation status of Tunnel.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Tags.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The tunnel options of IPsec. See `tunnel_options_specification` below.
     * 
     */
    @Export(name="tunnelOptionsSpecifications", refs={List.class,ConnectionTunnelOptionsSpecification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConnectionTunnelOptionsSpecification>> tunnelOptionsSpecifications;

    /**
     * @return The tunnel options of IPsec. See `tunnel_options_specification` below.
     * 
     */
    public Output<Optional<List<ConnectionTunnelOptionsSpecification>>> tunnelOptionsSpecifications() {
        return Codegen.optional(this.tunnelOptionsSpecifications);
    }
    /**
     * The name of the IPsec-VPN connection.
     * 
     */
    @Export(name="vpnConnectionName", refs={String.class}, tree="[0]")
    private Output<String> vpnConnectionName;

    /**
     * @return The name of the IPsec-VPN connection.
     * 
     */
    public Output<String> vpnConnectionName() {
        return this.vpnConnectionName;
    }
    /**
     * The ID of the VPN gateway.
     * 
     */
    @Export(name="vpnGatewayId", refs={String.class}, tree="[0]")
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(java.lang.String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(java.lang.String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(java.lang.String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/connection:Connection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Connection(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpn/connection:Connection", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionArgs makeArgs(ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Connection get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
