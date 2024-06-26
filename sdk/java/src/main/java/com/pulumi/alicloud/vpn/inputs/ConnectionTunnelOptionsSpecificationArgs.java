// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs;
import com.pulumi.alicloud.vpn.inputs.ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionTunnelOptionsSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionTunnelOptionsSpecificationArgs Empty = new ConnectionTunnelOptionsSpecificationArgs();

    /**
     * The ID of the customer gateway in Tunnel.
     * 
     */
    @Import(name="customerGatewayId")
    private @Nullable Output<String> customerGatewayId;

    /**
     * @return The ID of the customer gateway in Tunnel.
     * 
     */
    public Optional<Output<String>> customerGatewayId() {
        return Optional.ofNullable(this.customerGatewayId);
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
     * The local internet IP in Tunnel.
     * 
     */
    @Import(name="internetIp")
    private @Nullable Output<String> internetIp;

    /**
     * @return The local internet IP in Tunnel.
     * 
     */
    public Optional<Output<String>> internetIp() {
        return Optional.ofNullable(this.internetIp);
    }

    /**
     * The role of Tunnel.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of Tunnel.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The state of Tunnel.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of Tunnel.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
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
     * The bgp config of Tunnel. See `tunnel_bgp_config` below.
     * 
     */
    @Import(name="tunnelBgpConfig")
    private @Nullable Output<ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs> tunnelBgpConfig;

    /**
     * @return The bgp config of Tunnel. See `tunnel_bgp_config` below.
     * 
     */
    public Optional<Output<ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs>> tunnelBgpConfig() {
        return Optional.ofNullable(this.tunnelBgpConfig);
    }

    /**
     * The tunnel ID of IPsec-VPN connection.
     * 
     */
    @Import(name="tunnelId")
    private @Nullable Output<String> tunnelId;

    /**
     * @return The tunnel ID of IPsec-VPN connection.
     * 
     */
    public Optional<Output<String>> tunnelId() {
        return Optional.ofNullable(this.tunnelId);
    }

    /**
     * The configuration of Phase 1 negotiations in Tunnel. See `tunnel_ike_config` below.
     * 
     */
    @Import(name="tunnelIkeConfig")
    private @Nullable Output<ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs> tunnelIkeConfig;

    /**
     * @return The configuration of Phase 1 negotiations in Tunnel. See `tunnel_ike_config` below.
     * 
     */
    public Optional<Output<ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs>> tunnelIkeConfig() {
        return Optional.ofNullable(this.tunnelIkeConfig);
    }

    /**
     * IPsec configuration in Tunnel. See `tunnel_ipsec_config` below.
     * 
     */
    @Import(name="tunnelIpsecConfig")
    private @Nullable Output<ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs> tunnelIpsecConfig;

    /**
     * @return IPsec configuration in Tunnel. See `tunnel_ipsec_config` below.
     * 
     */
    public Optional<Output<ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs>> tunnelIpsecConfig() {
        return Optional.ofNullable(this.tunnelIpsecConfig);
    }

    /**
     * The zoneNo of tunnel.
     * 
     */
    @Import(name="zoneNo")
    private @Nullable Output<String> zoneNo;

    /**
     * @return The zoneNo of tunnel.
     * 
     */
    public Optional<Output<String>> zoneNo() {
        return Optional.ofNullable(this.zoneNo);
    }

    private ConnectionTunnelOptionsSpecificationArgs() {}

    private ConnectionTunnelOptionsSpecificationArgs(ConnectionTunnelOptionsSpecificationArgs $) {
        this.customerGatewayId = $.customerGatewayId;
        this.enableDpd = $.enableDpd;
        this.enableNatTraversal = $.enableNatTraversal;
        this.internetIp = $.internetIp;
        this.role = $.role;
        this.state = $.state;
        this.status = $.status;
        this.tunnelBgpConfig = $.tunnelBgpConfig;
        this.tunnelId = $.tunnelId;
        this.tunnelIkeConfig = $.tunnelIkeConfig;
        this.tunnelIpsecConfig = $.tunnelIpsecConfig;
        this.zoneNo = $.zoneNo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionTunnelOptionsSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionTunnelOptionsSpecificationArgs $;

        public Builder() {
            $ = new ConnectionTunnelOptionsSpecificationArgs();
        }

        public Builder(ConnectionTunnelOptionsSpecificationArgs defaults) {
            $ = new ConnectionTunnelOptionsSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerGatewayId The ID of the customer gateway in Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayId(@Nullable Output<String> customerGatewayId) {
            $.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * @param customerGatewayId The ID of the customer gateway in Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayId(String customerGatewayId) {
            return customerGatewayId(Output.of(customerGatewayId));
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
         * @param internetIp The local internet IP in Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder internetIp(@Nullable Output<String> internetIp) {
            $.internetIp = internetIp;
            return this;
        }

        /**
         * @param internetIp The local internet IP in Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder internetIp(String internetIp) {
            return internetIp(Output.of(internetIp));
        }

        /**
         * @param role The role of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param state The state of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
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
         * @param tunnelBgpConfig The bgp config of Tunnel. See `tunnel_bgp_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelBgpConfig(@Nullable Output<ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs> tunnelBgpConfig) {
            $.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }

        /**
         * @param tunnelBgpConfig The bgp config of Tunnel. See `tunnel_bgp_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelBgpConfig(ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs tunnelBgpConfig) {
            return tunnelBgpConfig(Output.of(tunnelBgpConfig));
        }

        /**
         * @param tunnelId The tunnel ID of IPsec-VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(@Nullable Output<String> tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        /**
         * @param tunnelId The tunnel ID of IPsec-VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(String tunnelId) {
            return tunnelId(Output.of(tunnelId));
        }

        /**
         * @param tunnelIkeConfig The configuration of Phase 1 negotiations in Tunnel. See `tunnel_ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIkeConfig(@Nullable Output<ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs> tunnelIkeConfig) {
            $.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }

        /**
         * @param tunnelIkeConfig The configuration of Phase 1 negotiations in Tunnel. See `tunnel_ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIkeConfig(ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs tunnelIkeConfig) {
            return tunnelIkeConfig(Output.of(tunnelIkeConfig));
        }

        /**
         * @param tunnelIpsecConfig IPsec configuration in Tunnel. See `tunnel_ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIpsecConfig(@Nullable Output<ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs> tunnelIpsecConfig) {
            $.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }

        /**
         * @param tunnelIpsecConfig IPsec configuration in Tunnel. See `tunnel_ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIpsecConfig(ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs tunnelIpsecConfig) {
            return tunnelIpsecConfig(Output.of(tunnelIpsecConfig));
        }

        /**
         * @param zoneNo The zoneNo of tunnel.
         * 
         * @return builder
         * 
         */
        public Builder zoneNo(@Nullable Output<String> zoneNo) {
            $.zoneNo = zoneNo;
            return this;
        }

        /**
         * @param zoneNo The zoneNo of tunnel.
         * 
         * @return builder
         * 
         */
        public Builder zoneNo(String zoneNo) {
            return zoneNo(Output.of(zoneNo));
        }

        public ConnectionTunnelOptionsSpecificationArgs build() {
            return $;
        }
    }

}
