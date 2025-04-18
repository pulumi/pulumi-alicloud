// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.alicloud.vpn.inputs.ConnectionBgpConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionHealthCheckConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionIkeConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionIpsecConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Whether to configure routing automatically. Value:
     * - **true**: Automatically configure routes.
     * - **false**: does not automatically configure routes.
     * 
     */
    @Import(name="autoConfigRoute")
    private @Nullable Output<Boolean> autoConfigRoute;

    /**
     * @return Whether to configure routing automatically. Value:
     * - **true**: Automatically configure routes.
     * - **false**: does not automatically configure routes.
     * 
     */
    public Optional<Output<Boolean>> autoConfigRoute() {
        return Optional.ofNullable(this.autoConfigRoute);
    }

    /**
     * vpnBgp configuration. See `bgp_config` below.
     * 
     */
    @Import(name="bgpConfig")
    private @Nullable Output<ConnectionBgpConfigArgs> bgpConfig;

    /**
     * @return vpnBgp configuration. See `bgp_config` below.
     * 
     */
    public Optional<Output<ConnectionBgpConfigArgs>> bgpConfig() {
        return Optional.ofNullable(this.bgpConfig);
    }

    /**
     * The time when the IPsec-VPN connection was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<Integer> createTime;

    /**
     * @return The time when the IPsec-VPN connection was created.
     * 
     */
    public Optional<Output<Integer>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The ID of the customer gateway.
     * 
     */
    @Import(name="customerGatewayId")
    private @Nullable Output<String> customerGatewayId;

    /**
     * @return The ID of the customer gateway.
     * 
     */
    public Optional<Output<String>> customerGatewayId() {
        return Optional.ofNullable(this.customerGatewayId);
    }

    /**
     * Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    @Import(name="effectImmediately")
    private @Nullable Output<Boolean> effectImmediately;

    /**
     * @return Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    public Optional<Output<Boolean>> effectImmediately() {
        return Optional.ofNullable(this.effectImmediately);
    }

    /**
     * Wether enable Dpd detection.
     * 
     */
    @Import(name="enableDpd")
    private @Nullable Output<Boolean> enableDpd;

    /**
     * @return Wether enable Dpd detection.
     * 
     */
    public Optional<Output<Boolean>> enableDpd() {
        return Optional.ofNullable(this.enableDpd);
    }

    /**
     * enable nat traversal.
     * 
     */
    @Import(name="enableNatTraversal")
    private @Nullable Output<Boolean> enableNatTraversal;

    /**
     * @return enable nat traversal.
     * 
     */
    public Optional<Output<Boolean>> enableNatTraversal() {
        return Optional.ofNullable(this.enableNatTraversal);
    }

    /**
     * Enable tunnel bgp.
     * 
     */
    @Import(name="enableTunnelsBgp")
    private @Nullable Output<Boolean> enableTunnelsBgp;

    /**
     * @return Enable tunnel bgp.
     * 
     */
    public Optional<Output<Boolean>> enableTunnelsBgp() {
        return Optional.ofNullable(this.enableTunnelsBgp);
    }

    /**
     * Health Check information. See `health_check_config` below.
     * 
     */
    @Import(name="healthCheckConfig")
    private @Nullable Output<ConnectionHealthCheckConfigArgs> healthCheckConfig;

    /**
     * @return Health Check information. See `health_check_config` below.
     * 
     */
    public Optional<Output<ConnectionHealthCheckConfigArgs>> healthCheckConfig() {
        return Optional.ofNullable(this.healthCheckConfig);
    }

    /**
     * The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    @Import(name="ikeConfig")
    private @Nullable Output<ConnectionIkeConfigArgs> ikeConfig;

    /**
     * @return The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    public Optional<Output<ConnectionIkeConfigArgs>> ikeConfig() {
        return Optional.ofNullable(this.ikeConfig);
    }

    /**
     * IPsec configuration. See `ipsec_config` below.
     * 
     */
    @Import(name="ipsecConfig")
    private @Nullable Output<ConnectionIpsecConfigArgs> ipsecConfig;

    /**
     * @return IPsec configuration. See `ipsec_config` below.
     * 
     */
    public Optional<Output<ConnectionIpsecConfigArgs>> ipsecConfig() {
        return Optional.ofNullable(this.ipsecConfig);
    }

    /**
     * The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    @Import(name="localSubnets")
    private @Nullable Output<List<String>> localSubnets;

    /**
     * @return The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    public Optional<Output<List<String>>> localSubnets() {
        return Optional.ofNullable(this.localSubnets);
    }

    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network type of the IPsec connection. Value:
     * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
     * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
     * 
     */
    @Import(name="networkType")
    private @Nullable Output<String> networkType;

    /**
     * @return The network type of the IPsec connection. Value:
     * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
     * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
     * 
     */
    public Optional<Output<String>> networkType() {
        return Optional.ofNullable(this.networkType);
    }

    /**
     * The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    @Import(name="remoteSubnets")
    private @Nullable Output<List<String>> remoteSubnets;

    /**
     * @return The CIDR block of the local data center. This parameter is used for phase-two negotiation.
     * 
     */
    public Optional<Output<List<String>>> remoteSubnets() {
        return Optional.ofNullable(this.remoteSubnets);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The negotiation status of Tunnel.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The negotiation status of Tunnel.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The tunnel options of IPsec. See `tunnel_options_specification` below.
     * 
     */
    @Import(name="tunnelOptionsSpecifications")
    private @Nullable Output<List<ConnectionTunnelOptionsSpecificationArgs>> tunnelOptionsSpecifications;

    /**
     * @return The tunnel options of IPsec. See `tunnel_options_specification` below.
     * 
     */
    public Optional<Output<List<ConnectionTunnelOptionsSpecificationArgs>>> tunnelOptionsSpecifications() {
        return Optional.ofNullable(this.tunnelOptionsSpecifications);
    }

    /**
     * The name of the IPsec-VPN connection.
     * 
     */
    @Import(name="vpnConnectionName")
    private @Nullable Output<String> vpnConnectionName;

    /**
     * @return The name of the IPsec-VPN connection.
     * 
     */
    public Optional<Output<String>> vpnConnectionName() {
        return Optional.ofNullable(this.vpnConnectionName);
    }

    /**
     * The ID of the VPN gateway.
     * 
     */
    @Import(name="vpnGatewayId")
    private @Nullable Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN gateway.
     * 
     */
    public Optional<Output<String>> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.autoConfigRoute = $.autoConfigRoute;
        this.bgpConfig = $.bgpConfig;
        this.createTime = $.createTime;
        this.customerGatewayId = $.customerGatewayId;
        this.effectImmediately = $.effectImmediately;
        this.enableDpd = $.enableDpd;
        this.enableNatTraversal = $.enableNatTraversal;
        this.enableTunnelsBgp = $.enableTunnelsBgp;
        this.healthCheckConfig = $.healthCheckConfig;
        this.ikeConfig = $.ikeConfig;
        this.ipsecConfig = $.ipsecConfig;
        this.localSubnets = $.localSubnets;
        this.name = $.name;
        this.networkType = $.networkType;
        this.remoteSubnets = $.remoteSubnets;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.tunnelOptionsSpecifications = $.tunnelOptionsSpecifications;
        this.vpnConnectionName = $.vpnConnectionName;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoConfigRoute Whether to configure routing automatically. Value:
         * - **true**: Automatically configure routes.
         * - **false**: does not automatically configure routes.
         * 
         * @return builder
         * 
         */
        public Builder autoConfigRoute(@Nullable Output<Boolean> autoConfigRoute) {
            $.autoConfigRoute = autoConfigRoute;
            return this;
        }

        /**
         * @param autoConfigRoute Whether to configure routing automatically. Value:
         * - **true**: Automatically configure routes.
         * - **false**: does not automatically configure routes.
         * 
         * @return builder
         * 
         */
        public Builder autoConfigRoute(Boolean autoConfigRoute) {
            return autoConfigRoute(Output.of(autoConfigRoute));
        }

        /**
         * @param bgpConfig vpnBgp configuration. See `bgp_config` below.
         * 
         * @return builder
         * 
         */
        public Builder bgpConfig(@Nullable Output<ConnectionBgpConfigArgs> bgpConfig) {
            $.bgpConfig = bgpConfig;
            return this;
        }

        /**
         * @param bgpConfig vpnBgp configuration. See `bgp_config` below.
         * 
         * @return builder
         * 
         */
        public Builder bgpConfig(ConnectionBgpConfigArgs bgpConfig) {
            return bgpConfig(Output.of(bgpConfig));
        }

        /**
         * @param createTime The time when the IPsec-VPN connection was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<Integer> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the IPsec-VPN connection was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(Integer createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param customerGatewayId The ID of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayId(@Nullable Output<String> customerGatewayId) {
            $.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * @param customerGatewayId The ID of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayId(String customerGatewayId) {
            return customerGatewayId(Output.of(customerGatewayId));
        }

        /**
         * @param effectImmediately Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
         * 
         * @return builder
         * 
         */
        public Builder effectImmediately(@Nullable Output<Boolean> effectImmediately) {
            $.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * @param effectImmediately Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
         * 
         * @return builder
         * 
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            return effectImmediately(Output.of(effectImmediately));
        }

        /**
         * @param enableDpd Wether enable Dpd detection.
         * 
         * @return builder
         * 
         */
        public Builder enableDpd(@Nullable Output<Boolean> enableDpd) {
            $.enableDpd = enableDpd;
            return this;
        }

        /**
         * @param enableDpd Wether enable Dpd detection.
         * 
         * @return builder
         * 
         */
        public Builder enableDpd(Boolean enableDpd) {
            return enableDpd(Output.of(enableDpd));
        }

        /**
         * @param enableNatTraversal enable nat traversal.
         * 
         * @return builder
         * 
         */
        public Builder enableNatTraversal(@Nullable Output<Boolean> enableNatTraversal) {
            $.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * @param enableNatTraversal enable nat traversal.
         * 
         * @return builder
         * 
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            return enableNatTraversal(Output.of(enableNatTraversal));
        }

        /**
         * @param enableTunnelsBgp Enable tunnel bgp.
         * 
         * @return builder
         * 
         */
        public Builder enableTunnelsBgp(@Nullable Output<Boolean> enableTunnelsBgp) {
            $.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * @param enableTunnelsBgp Enable tunnel bgp.
         * 
         * @return builder
         * 
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            return enableTunnelsBgp(Output.of(enableTunnelsBgp));
        }

        /**
         * @param healthCheckConfig Health Check information. See `health_check_config` below.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(@Nullable Output<ConnectionHealthCheckConfigArgs> healthCheckConfig) {
            $.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * @param healthCheckConfig Health Check information. See `health_check_config` below.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckConfig(ConnectionHealthCheckConfigArgs healthCheckConfig) {
            return healthCheckConfig(Output.of(healthCheckConfig));
        }

        /**
         * @param ikeConfig The configuration of Phase 1 negotiations. See `ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ikeConfig(@Nullable Output<ConnectionIkeConfigArgs> ikeConfig) {
            $.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * @param ikeConfig The configuration of Phase 1 negotiations. See `ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ikeConfig(ConnectionIkeConfigArgs ikeConfig) {
            return ikeConfig(Output.of(ikeConfig));
        }

        /**
         * @param ipsecConfig IPsec configuration. See `ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConfig(@Nullable Output<ConnectionIpsecConfigArgs> ipsecConfig) {
            $.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * @param ipsecConfig IPsec configuration. See `ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConfig(ConnectionIpsecConfigArgs ipsecConfig) {
            return ipsecConfig(Output.of(ipsecConfig));
        }

        /**
         * @param localSubnets The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder localSubnets(@Nullable Output<List<String>> localSubnets) {
            $.localSubnets = localSubnets;
            return this;
        }

        /**
         * @param localSubnets The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder localSubnets(List<String> localSubnets) {
            return localSubnets(Output.of(localSubnets));
        }

        /**
         * @param localSubnets The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder localSubnets(String... localSubnets) {
            return localSubnets(List.of(localSubnets));
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.216.0. New field &#39;vpn_connection_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkType The network type of the IPsec connection. Value:
         * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
         * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
         * 
         * @return builder
         * 
         */
        public Builder networkType(@Nullable Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType The network type of the IPsec connection. Value:
         * - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
         * - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        /**
         * @param remoteSubnets The CIDR block of the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder remoteSubnets(@Nullable Output<List<String>> remoteSubnets) {
            $.remoteSubnets = remoteSubnets;
            return this;
        }

        /**
         * @param remoteSubnets The CIDR block of the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder remoteSubnets(List<String> remoteSubnets) {
            return remoteSubnets(Output.of(remoteSubnets));
        }

        /**
         * @param remoteSubnets The CIDR block of the local data center. This parameter is used for phase-two negotiation.
         * 
         * @return builder
         * 
         */
        public Builder remoteSubnets(String... remoteSubnets) {
            return remoteSubnets(List.of(remoteSubnets));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The negotiation status of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The negotiation status of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags Tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tunnelOptionsSpecifications The tunnel options of IPsec. See `tunnel_options_specification` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelOptionsSpecifications(@Nullable Output<List<ConnectionTunnelOptionsSpecificationArgs>> tunnelOptionsSpecifications) {
            $.tunnelOptionsSpecifications = tunnelOptionsSpecifications;
            return this;
        }

        /**
         * @param tunnelOptionsSpecifications The tunnel options of IPsec. See `tunnel_options_specification` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelOptionsSpecifications(List<ConnectionTunnelOptionsSpecificationArgs> tunnelOptionsSpecifications) {
            return tunnelOptionsSpecifications(Output.of(tunnelOptionsSpecifications));
        }

        /**
         * @param tunnelOptionsSpecifications The tunnel options of IPsec. See `tunnel_options_specification` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelOptionsSpecifications(ConnectionTunnelOptionsSpecificationArgs... tunnelOptionsSpecifications) {
            return tunnelOptionsSpecifications(List.of(tunnelOptionsSpecifications));
        }

        /**
         * @param vpnConnectionName The name of the IPsec-VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionName(@Nullable Output<String> vpnConnectionName) {
            $.vpnConnectionName = vpnConnectionName;
            return this;
        }

        /**
         * @param vpnConnectionName The name of the IPsec-VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionName(String vpnConnectionName) {
            return vpnConnectionName(Output.of(vpnConnectionName));
        }

        /**
         * @param vpnGatewayId The ID of the VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(@Nullable Output<String> vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * @param vpnGatewayId The ID of the VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            return vpnGatewayId(Output.of(vpnGatewayId));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
