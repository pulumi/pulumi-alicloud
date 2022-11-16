// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetIpsecServersServerIkeConfig;
import com.pulumi.alicloud.vpc.outputs.GetIpsecServersServerIpsecConfig;
import com.pulumi.core.annotations.CustomType;
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
    private final String clientIpPool;
    /**
     * @return The creation time of the IPsec server. T represents the delimiter, and Z represents UTC, which is World Standard Time.
     * 
     */
    private final String createTime;
    /**
     * @return Indicates whether the current IPsec tunnel is deleted and negotiations are reinitiated.
     * 
     */
    private final Boolean effectImmediately;
    /**
     * @return The ID of the Ipsec Server.
     * 
     */
    private final String id;
    /**
     * @return The ID of the Identity as a Service (IDaaS) instance.
     * 
     */
    private final String idaasInstanceId;
    /**
     * @return The configurations of Phase 1 negotiations.
     * 
     */
    private final List<GetIpsecServersServerIkeConfig> ikeConfigs;
    /**
     * @return The public IP address of the VPN gateway.
     * 
     */
    private final String internetIp;
    /**
     * @return The configuration of Phase 2 negotiations.
     * 
     */
    private final List<GetIpsecServersServerIpsecConfig> ipsecConfigs;
    /**
     * @return The ID of the IPsec server.
     * 
     */
    private final String ipsecServerId;
    /**
     * @return The name of the IPsec server.
     * 
     */
    private final String ipsecServerName;
    /**
     * @return Local network segment: the network segment on The VPC side that needs to be interconnected with the client network segment.
     * 
     */
    private final String localSubnet;
    /**
     * @return The number of SSL connections of the VPN gateway. SSL-VPN the number of SSL connections shared with the IPsec server. For example, if the number of SSL connections is 5 and you have three SSL clients connected to the SSL-VPN, you can also use two clients to connect to the IPsec server.
     * 
     */
    private final Integer maxConnections;
    /**
     * @return Whether the two-factor authentication function has been turned on.
     * 
     */
    private final Boolean multiFactorAuthEnabled;
    /**
     * @return The number of clients that have connected to the IPsec server.
     * 
     */
    private final Integer onlineClientCount;
    /**
     * @return The pre-shared key.
     * 
     */
    private final String psk;
    /**
     * @return Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
     * 
     */
    private final Boolean pskEnabled;
    /**
     * @return The ID of the VPN gateway.
     * 
     */
    private final String vpnGatewayId;

    @CustomType.Constructor
    private GetIpsecServersServer(
        @CustomType.Parameter("clientIpPool") String clientIpPool,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("effectImmediately") Boolean effectImmediately,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idaasInstanceId") String idaasInstanceId,
        @CustomType.Parameter("ikeConfigs") List<GetIpsecServersServerIkeConfig> ikeConfigs,
        @CustomType.Parameter("internetIp") String internetIp,
        @CustomType.Parameter("ipsecConfigs") List<GetIpsecServersServerIpsecConfig> ipsecConfigs,
        @CustomType.Parameter("ipsecServerId") String ipsecServerId,
        @CustomType.Parameter("ipsecServerName") String ipsecServerName,
        @CustomType.Parameter("localSubnet") String localSubnet,
        @CustomType.Parameter("maxConnections") Integer maxConnections,
        @CustomType.Parameter("multiFactorAuthEnabled") Boolean multiFactorAuthEnabled,
        @CustomType.Parameter("onlineClientCount") Integer onlineClientCount,
        @CustomType.Parameter("psk") String psk,
        @CustomType.Parameter("pskEnabled") Boolean pskEnabled,
        @CustomType.Parameter("vpnGatewayId") String vpnGatewayId) {
        this.clientIpPool = clientIpPool;
        this.createTime = createTime;
        this.effectImmediately = effectImmediately;
        this.id = id;
        this.idaasInstanceId = idaasInstanceId;
        this.ikeConfigs = ikeConfigs;
        this.internetIp = internetIp;
        this.ipsecConfigs = ipsecConfigs;
        this.ipsecServerId = ipsecServerId;
        this.ipsecServerName = ipsecServerName;
        this.localSubnet = localSubnet;
        this.maxConnections = maxConnections;
        this.multiFactorAuthEnabled = multiFactorAuthEnabled;
        this.onlineClientCount = onlineClientCount;
        this.psk = psk;
        this.pskEnabled = pskEnabled;
        this.vpnGatewayId = vpnGatewayId;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder clientIpPool(String clientIpPool) {
            this.clientIpPool = Objects.requireNonNull(clientIpPool);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder effectImmediately(Boolean effectImmediately) {
            this.effectImmediately = Objects.requireNonNull(effectImmediately);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idaasInstanceId(String idaasInstanceId) {
            this.idaasInstanceId = Objects.requireNonNull(idaasInstanceId);
            return this;
        }
        public Builder ikeConfigs(List<GetIpsecServersServerIkeConfig> ikeConfigs) {
            this.ikeConfigs = Objects.requireNonNull(ikeConfigs);
            return this;
        }
        public Builder ikeConfigs(GetIpsecServersServerIkeConfig... ikeConfigs) {
            return ikeConfigs(List.of(ikeConfigs));
        }
        public Builder internetIp(String internetIp) {
            this.internetIp = Objects.requireNonNull(internetIp);
            return this;
        }
        public Builder ipsecConfigs(List<GetIpsecServersServerIpsecConfig> ipsecConfigs) {
            this.ipsecConfigs = Objects.requireNonNull(ipsecConfigs);
            return this;
        }
        public Builder ipsecConfigs(GetIpsecServersServerIpsecConfig... ipsecConfigs) {
            return ipsecConfigs(List.of(ipsecConfigs));
        }
        public Builder ipsecServerId(String ipsecServerId) {
            this.ipsecServerId = Objects.requireNonNull(ipsecServerId);
            return this;
        }
        public Builder ipsecServerName(String ipsecServerName) {
            this.ipsecServerName = Objects.requireNonNull(ipsecServerName);
            return this;
        }
        public Builder localSubnet(String localSubnet) {
            this.localSubnet = Objects.requireNonNull(localSubnet);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder multiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
            this.multiFactorAuthEnabled = Objects.requireNonNull(multiFactorAuthEnabled);
            return this;
        }
        public Builder onlineClientCount(Integer onlineClientCount) {
            this.onlineClientCount = Objects.requireNonNull(onlineClientCount);
            return this;
        }
        public Builder psk(String psk) {
            this.psk = Objects.requireNonNull(psk);
            return this;
        }
        public Builder pskEnabled(Boolean pskEnabled) {
            this.pskEnabled = Objects.requireNonNull(pskEnabled);
            return this;
        }
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = Objects.requireNonNull(vpnGatewayId);
            return this;
        }        public GetIpsecServersServer build() {
            return new GetIpsecServersServer(clientIpPool, createTime, effectImmediately, id, idaasInstanceId, ikeConfigs, internetIp, ipsecConfigs, ipsecServerId, ipsecServerName, localSubnet, maxConnections, multiFactorAuthEnabled, onlineClientCount, psk, pskEnabled, vpnGatewayId);
        }
    }
}