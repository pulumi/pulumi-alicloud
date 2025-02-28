// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.alicloud.vpn.inputs.IpsecServerIkeConfigArgs;
import com.pulumi.alicloud.vpn.inputs.IpsecServerIpsecConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecServerArgs Empty = new IpsecServerArgs();

    /**
     * The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
     * 
     */
    @Import(name="clientIpPool", required=true)
    private Output<String> clientIpPool;

    /**
     * @return The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
     * 
     */
    public Output<String> clientIpPool() {
        return this.clientIpPool;
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Specifies whether you want the configuration to immediately take effect.
     * 
     */
    @Import(name="effectImmediately")
    private @Nullable Output<Boolean> effectImmediately;

    /**
     * @return Specifies whether you want the configuration to immediately take effect.
     * 
     */
    public Optional<Output<Boolean>> effectImmediately() {
        return Optional.ofNullable(this.effectImmediately);
    }

    /**
     * The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    @Import(name="ikeConfigs")
    private @Nullable Output<List<IpsecServerIkeConfigArgs>> ikeConfigs;

    /**
     * @return The configuration of Phase 1 negotiations. See `ike_config` below.
     * 
     */
    public Optional<Output<List<IpsecServerIkeConfigArgs>>> ikeConfigs() {
        return Optional.ofNullable(this.ikeConfigs);
    }

    /**
     * The configuration of Phase 2 negotiations. See `ipsec_config` below.
     * 
     */
    @Import(name="ipsecConfigs")
    private @Nullable Output<List<IpsecServerIpsecConfigArgs>> ipsecConfigs;

    /**
     * @return The configuration of Phase 2 negotiations. See `ipsec_config` below.
     * 
     */
    public Optional<Output<List<IpsecServerIpsecConfigArgs>>> ipsecConfigs() {
        return Optional.ofNullable(this.ipsecConfigs);
    }

    /**
     * The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
     * 
     */
    @Import(name="ipsecServerName")
    private @Nullable Output<String> ipsecServerName;

    /**
     * @return The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
     * 
     */
    public Optional<Output<String>> ipsecServerName() {
        return Optional.ofNullable(this.ipsecServerName);
    }

    /**
     * The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
     * 
     */
    @Import(name="localSubnet", required=true)
    private Output<String> localSubnet;

    /**
     * @return The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
     * 
     */
    public Output<String> localSubnet() {
        return this.localSubnet;
    }

    /**
     * The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
     * 
     */
    @Import(name="psk")
    private @Nullable Output<String> psk;

    /**
     * @return The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
     * 
     */
    public Optional<Output<String>> psk() {
        return Optional.ofNullable(this.psk);
    }

    /**
     * Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
     * 
     */
    @Import(name="pskEnabled")
    private @Nullable Output<Boolean> pskEnabled;

    /**
     * @return Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
     * 
     */
    public Optional<Output<Boolean>> pskEnabled() {
        return Optional.ofNullable(this.pskEnabled);
    }

    /**
     * The ID of the VPN gateway.
     * 
     */
    @Import(name="vpnGatewayId", required=true)
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    private IpsecServerArgs() {}

    private IpsecServerArgs(IpsecServerArgs $) {
        this.clientIpPool = $.clientIpPool;
        this.dryRun = $.dryRun;
        this.effectImmediately = $.effectImmediately;
        this.ikeConfigs = $.ikeConfigs;
        this.ipsecConfigs = $.ipsecConfigs;
        this.ipsecServerName = $.ipsecServerName;
        this.localSubnet = $.localSubnet;
        this.psk = $.psk;
        this.pskEnabled = $.pskEnabled;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecServerArgs $;

        public Builder() {
            $ = new IpsecServerArgs();
        }

        public Builder(IpsecServerArgs defaults) {
            $ = new IpsecServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientIpPool The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
         * 
         * @return builder
         * 
         */
        public Builder clientIpPool(Output<String> clientIpPool) {
            $.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * @param clientIpPool The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
         * 
         * @return builder
         * 
         */
        public Builder clientIpPool(String clientIpPool) {
            return clientIpPool(Output.of(clientIpPool));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param effectImmediately Specifies whether you want the configuration to immediately take effect.
         * 
         * @return builder
         * 
         */
        public Builder effectImmediately(@Nullable Output<Boolean> effectImmediately) {
            $.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * @param effectImmediately Specifies whether you want the configuration to immediately take effect.
         * 
         * @return builder
         * 
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            return effectImmediately(Output.of(effectImmediately));
        }

        /**
         * @param ikeConfigs The configuration of Phase 1 negotiations. See `ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ikeConfigs(@Nullable Output<List<IpsecServerIkeConfigArgs>> ikeConfigs) {
            $.ikeConfigs = ikeConfigs;
            return this;
        }

        /**
         * @param ikeConfigs The configuration of Phase 1 negotiations. See `ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ikeConfigs(List<IpsecServerIkeConfigArgs> ikeConfigs) {
            return ikeConfigs(Output.of(ikeConfigs));
        }

        /**
         * @param ikeConfigs The configuration of Phase 1 negotiations. See `ike_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ikeConfigs(IpsecServerIkeConfigArgs... ikeConfigs) {
            return ikeConfigs(List.of(ikeConfigs));
        }

        /**
         * @param ipsecConfigs The configuration of Phase 2 negotiations. See `ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConfigs(@Nullable Output<List<IpsecServerIpsecConfigArgs>> ipsecConfigs) {
            $.ipsecConfigs = ipsecConfigs;
            return this;
        }

        /**
         * @param ipsecConfigs The configuration of Phase 2 negotiations. See `ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConfigs(List<IpsecServerIpsecConfigArgs> ipsecConfigs) {
            return ipsecConfigs(Output.of(ipsecConfigs));
        }

        /**
         * @param ipsecConfigs The configuration of Phase 2 negotiations. See `ipsec_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConfigs(IpsecServerIpsecConfigArgs... ipsecConfigs) {
            return ipsecConfigs(List.of(ipsecConfigs));
        }

        /**
         * @param ipsecServerName The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder ipsecServerName(@Nullable Output<String> ipsecServerName) {
            $.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * @param ipsecServerName The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder ipsecServerName(String ipsecServerName) {
            return ipsecServerName(Output.of(ipsecServerName));
        }

        /**
         * @param localSubnet The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
         * 
         * @return builder
         * 
         */
        public Builder localSubnet(Output<String> localSubnet) {
            $.localSubnet = localSubnet;
            return this;
        }

        /**
         * @param localSubnet The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
         * 
         * @return builder
         * 
         */
        public Builder localSubnet(String localSubnet) {
            return localSubnet(Output.of(localSubnet));
        }

        /**
         * @param psk The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder psk(@Nullable Output<String> psk) {
            $.psk = psk;
            return this;
        }

        /**
         * @param psk The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder psk(String psk) {
            return psk(Output.of(psk));
        }

        /**
         * @param pskEnabled Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
         * 
         * @return builder
         * 
         */
        public Builder pskEnabled(@Nullable Output<Boolean> pskEnabled) {
            $.pskEnabled = pskEnabled;
            return this;
        }

        /**
         * @param pskEnabled Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
         * 
         * @return builder
         * 
         */
        public Builder pskEnabled(Boolean pskEnabled) {
            return pskEnabled(Output.of(pskEnabled));
        }

        /**
         * @param vpnGatewayId The ID of the VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(Output<String> vpnGatewayId) {
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

        public IpsecServerArgs build() {
            if ($.clientIpPool == null) {
                throw new MissingRequiredPropertyException("IpsecServerArgs", "clientIpPool");
            }
            if ($.localSubnet == null) {
                throw new MissingRequiredPropertyException("IpsecServerArgs", "localSubnet");
            }
            if ($.vpnGatewayId == null) {
                throw new MissingRequiredPropertyException("IpsecServerArgs", "vpnGatewayId");
            }
            return $;
        }
    }

}
