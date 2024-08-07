// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetIpsecServersServerIkeConfig;
import com.pulumi.alicloud.vpc.outputs.GetIpsecServersServerIpsecConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpsecServersServer {
    /**
     * @return The CIDR block of the client, which is assigned an access address to the virtual NIC of the client.
     * 
     */
    private String clientIpPool;
    /**
     * @return The creation time of the IPsec server. T represents the delimiter, and Z represents UTC, which is World Standard Time.
     * 
     */
    private String createTime;
    /**
     * @return Indicates whether the current IPsec tunnel is deleted and negotiations are reinitiated.
     * 
     */
    private Boolean effectImmediately;
    /**
     * @return The ID of the Ipsec Server.
     * 
     */
    private String id;
    /**
     * @return The ID of the Identity as a Service (IDaaS) instance.
     * 
     */
    private String idaasInstanceId;
    /**
     * @return The configurations of Phase 1 negotiations.
     * 
     */
    private List<GetIpsecServersServerIkeConfig> ikeConfigs;
    /**
     * @return The public IP address of the VPN gateway.
     * 
     */
    private String internetIp;
    /**
     * @return The configuration of Phase 2 negotiations.
     * 
     */
    private List<GetIpsecServersServerIpsecConfig> ipsecConfigs;
    /**
     * @return The ID of the IPsec server.
     * 
     */
    private String ipsecServerId;
    /**
     * @return The name of the IPsec server.
     * 
     */
    private String ipsecServerName;
    /**
     * @return Local network segment: the network segment on The VPC side that needs to be interconnected with the client network segment.
     * 
     */
    private String localSubnet;
    /**
     * @return The number of SSL connections of the VPN gateway. SSL-VPN the number of SSL connections shared with the IPsec server. For example, if the number of SSL connections is 5 and you have three SSL clients connected to the SSL-VPN, you can also use two clients to connect to the IPsec server.
     * 
     */
    private Integer maxConnections;
    /**
     * @return Whether the two-factor authentication function has been turned on.
     * 
     */
    private Boolean multiFactorAuthEnabled;
    /**
     * @return The number of clients that have connected to the IPsec server.
     * 
     */
    private Integer onlineClientCount;
    /**
     * @return The pre-shared key.
     * 
     */
    private String psk;
    /**
     * @return Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
     * 
     */
    private Boolean pskEnabled;
    /**
     * @return The ID of the VPN gateway.
     * 
     */
    private String vpnGatewayId;

    private GetIpsecServersServer() {}
    /**
     * @return The CIDR block of the client, which is assigned an access address to the virtual NIC of the client.
     * 
     */
    public String clientIpPool() {
        return this.clientIpPool;
    }
    /**
     * @return The creation time of the IPsec server. T represents the delimiter, and Z represents UTC, which is World Standard Time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Indicates whether the current IPsec tunnel is deleted and negotiations are reinitiated.
     * 
     */
    public Boolean effectImmediately() {
        return this.effectImmediately;
    }
    /**
     * @return The ID of the Ipsec Server.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Identity as a Service (IDaaS) instance.
     * 
     */
    public String idaasInstanceId() {
        return this.idaasInstanceId;
    }
    /**
     * @return The configurations of Phase 1 negotiations.
     * 
     */
    public List<GetIpsecServersServerIkeConfig> ikeConfigs() {
        return this.ikeConfigs;
    }
    /**
     * @return The public IP address of the VPN gateway.
     * 
     */
    public String internetIp() {
        return this.internetIp;
    }
    /**
     * @return The configuration of Phase 2 negotiations.
     * 
     */
    public List<GetIpsecServersServerIpsecConfig> ipsecConfigs() {
        return this.ipsecConfigs;
    }
    /**
     * @return The ID of the IPsec server.
     * 
     */
    public String ipsecServerId() {
        return this.ipsecServerId;
    }
    /**
     * @return The name of the IPsec server.
     * 
     */
    public String ipsecServerName() {
        return this.ipsecServerName;
    }
    /**
     * @return Local network segment: the network segment on The VPC side that needs to be interconnected with the client network segment.
     * 
     */
    public String localSubnet() {
        return this.localSubnet;
    }
    /**
     * @return The number of SSL connections of the VPN gateway. SSL-VPN the number of SSL connections shared with the IPsec server. For example, if the number of SSL connections is 5 and you have three SSL clients connected to the SSL-VPN, you can also use two clients to connect to the IPsec server.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return Whether the two-factor authentication function has been turned on.
     * 
     */
    public Boolean multiFactorAuthEnabled() {
        return this.multiFactorAuthEnabled;
    }
    /**
     * @return The number of clients that have connected to the IPsec server.
     * 
     */
    public Integer onlineClientCount() {
        return this.onlineClientCount;
    }
    /**
     * @return The pre-shared key.
     * 
     */
    public String psk() {
        return this.psk;
    }
    /**
     * @return Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
     * 
     */
    public Boolean pskEnabled() {
        return this.pskEnabled;
    }
    /**
     * @return The ID of the VPN gateway.
     * 
     */
    public String vpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecServersServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientIpPool;
        private String createTime;
        private Boolean effectImmediately;
        private String id;
        private String idaasInstanceId;
        private List<GetIpsecServersServerIkeConfig> ikeConfigs;
        private String internetIp;
        private List<GetIpsecServersServerIpsecConfig> ipsecConfigs;
        private String ipsecServerId;
        private String ipsecServerName;
        private String localSubnet;
        private Integer maxConnections;
        private Boolean multiFactorAuthEnabled;
        private Integer onlineClientCount;
        private String psk;
        private Boolean pskEnabled;
        private String vpnGatewayId;
        public Builder() {}
        public Builder(GetIpsecServersServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIpPool = defaults.clientIpPool;
    	      this.createTime = defaults.createTime;
    	      this.effectImmediately = defaults.effectImmediately;
    	      this.id = defaults.id;
    	      this.idaasInstanceId = defaults.idaasInstanceId;
    	      this.ikeConfigs = defaults.ikeConfigs;
    	      this.internetIp = defaults.internetIp;
    	      this.ipsecConfigs = defaults.ipsecConfigs;
    	      this.ipsecServerId = defaults.ipsecServerId;
    	      this.ipsecServerName = defaults.ipsecServerName;
    	      this.localSubnet = defaults.localSubnet;
    	      this.maxConnections = defaults.maxConnections;
    	      this.multiFactorAuthEnabled = defaults.multiFactorAuthEnabled;
    	      this.onlineClientCount = defaults.onlineClientCount;
    	      this.psk = defaults.psk;
    	      this.pskEnabled = defaults.pskEnabled;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        @CustomType.Setter
        public Builder clientIpPool(String clientIpPool) {
            if (clientIpPool == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "clientIpPool");
            }
            this.clientIpPool = clientIpPool;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder effectImmediately(Boolean effectImmediately) {
            if (effectImmediately == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "effectImmediately");
            }
            this.effectImmediately = effectImmediately;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder idaasInstanceId(String idaasInstanceId) {
            if (idaasInstanceId == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "idaasInstanceId");
            }
            this.idaasInstanceId = idaasInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder ikeConfigs(List<GetIpsecServersServerIkeConfig> ikeConfigs) {
            if (ikeConfigs == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "ikeConfigs");
            }
            this.ikeConfigs = ikeConfigs;
            return this;
        }
        public Builder ikeConfigs(GetIpsecServersServerIkeConfig... ikeConfigs) {
            return ikeConfigs(List.of(ikeConfigs));
        }
        @CustomType.Setter
        public Builder internetIp(String internetIp) {
            if (internetIp == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "internetIp");
            }
            this.internetIp = internetIp;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecConfigs(List<GetIpsecServersServerIpsecConfig> ipsecConfigs) {
            if (ipsecConfigs == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "ipsecConfigs");
            }
            this.ipsecConfigs = ipsecConfigs;
            return this;
        }
        public Builder ipsecConfigs(GetIpsecServersServerIpsecConfig... ipsecConfigs) {
            return ipsecConfigs(List.of(ipsecConfigs));
        }
        @CustomType.Setter
        public Builder ipsecServerId(String ipsecServerId) {
            if (ipsecServerId == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "ipsecServerId");
            }
            this.ipsecServerId = ipsecServerId;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecServerName(String ipsecServerName) {
            if (ipsecServerName == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "ipsecServerName");
            }
            this.ipsecServerName = ipsecServerName;
            return this;
        }
        @CustomType.Setter
        public Builder localSubnet(String localSubnet) {
            if (localSubnet == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "localSubnet");
            }
            this.localSubnet = localSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(Integer maxConnections) {
            if (maxConnections == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "maxConnections");
            }
            this.maxConnections = maxConnections;
            return this;
        }
        @CustomType.Setter
        public Builder multiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
            if (multiFactorAuthEnabled == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "multiFactorAuthEnabled");
            }
            this.multiFactorAuthEnabled = multiFactorAuthEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder onlineClientCount(Integer onlineClientCount) {
            if (onlineClientCount == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "onlineClientCount");
            }
            this.onlineClientCount = onlineClientCount;
            return this;
        }
        @CustomType.Setter
        public Builder psk(String psk) {
            if (psk == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "psk");
            }
            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder pskEnabled(Boolean pskEnabled) {
            if (pskEnabled == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "pskEnabled");
            }
            this.pskEnabled = pskEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder vpnGatewayId(String vpnGatewayId) {
            if (vpnGatewayId == null) {
              throw new MissingRequiredPropertyException("GetIpsecServersServer", "vpnGatewayId");
            }
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public GetIpsecServersServer build() {
            final var _resultValue = new GetIpsecServersServer();
            _resultValue.clientIpPool = clientIpPool;
            _resultValue.createTime = createTime;
            _resultValue.effectImmediately = effectImmediately;
            _resultValue.id = id;
            _resultValue.idaasInstanceId = idaasInstanceId;
            _resultValue.ikeConfigs = ikeConfigs;
            _resultValue.internetIp = internetIp;
            _resultValue.ipsecConfigs = ipsecConfigs;
            _resultValue.ipsecServerId = ipsecServerId;
            _resultValue.ipsecServerName = ipsecServerName;
            _resultValue.localSubnet = localSubnet;
            _resultValue.maxConnections = maxConnections;
            _resultValue.multiFactorAuthEnabled = multiFactorAuthEnabled;
            _resultValue.onlineClientCount = onlineClientCount;
            _resultValue.psk = psk;
            _resultValue.pskEnabled = pskEnabled;
            _resultValue.vpnGatewayId = vpnGatewayId;
            return _resultValue;
        }
    }
}
