// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig {
    /**
     * @return BGP status.
     * 
     */
    private String bgpStatus;
    /**
     * @return The number of the local (Alibaba Cloud) autonomous system of the tunnel. The value range of the autonomous system number is **1** to **4294967295**. Default value: **45104**.&gt; We recommend that you use the private number of the autonomous system number to establish a BGP connection with Alibaba Cloud. The private number range of the autonomous system number please consult the document yourself.
     * 
     */
    private Integer localAsn;
    /**
     * @return The local BGP address of the tunnel (on the Alibaba Cloud side). This address is an IP address in the BGP network segment.
     * 
     */
    private String localBgpIp;
    /**
     * @return Peer asn.
     * 
     */
    private String peerAsn;
    /**
     * @return Peer bgp ip.
     * 
     */
    private String peerBgpIp;
    /**
     * @return The BGP network segment of the tunnel. The network segment must be a network segment with a mask length of 30 in 169.254.0.0/16, and cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, and 169.254.169.252/30.&gt; the network segments of two tunnels under an IPsec connection cannot be the same.
     * 
     */
    private String tunnelCidr;

    private GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig() {}
    /**
     * @return BGP status.
     * 
     */
    public String bgpStatus() {
        return this.bgpStatus;
    }
    /**
     * @return The number of the local (Alibaba Cloud) autonomous system of the tunnel. The value range of the autonomous system number is **1** to **4294967295**. Default value: **45104**.&gt; We recommend that you use the private number of the autonomous system number to establish a BGP connection with Alibaba Cloud. The private number range of the autonomous system number please consult the document yourself.
     * 
     */
    public Integer localAsn() {
        return this.localAsn;
    }
    /**
     * @return The local BGP address of the tunnel (on the Alibaba Cloud side). This address is an IP address in the BGP network segment.
     * 
     */
    public String localBgpIp() {
        return this.localBgpIp;
    }
    /**
     * @return Peer asn.
     * 
     */
    public String peerAsn() {
        return this.peerAsn;
    }
    /**
     * @return Peer bgp ip.
     * 
     */
    public String peerBgpIp() {
        return this.peerBgpIp;
    }
    /**
     * @return The BGP network segment of the tunnel. The network segment must be a network segment with a mask length of 30 in 169.254.0.0/16, and cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, and 169.254.169.252/30.&gt; the network segments of two tunnels under an IPsec connection cannot be the same.
     * 
     */
    public String tunnelCidr() {
        return this.tunnelCidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bgpStatus;
        private Integer localAsn;
        private String localBgpIp;
        private String peerAsn;
        private String peerBgpIp;
        private String tunnelCidr;
        public Builder() {}
        public Builder(GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpStatus = defaults.bgpStatus;
    	      this.localAsn = defaults.localAsn;
    	      this.localBgpIp = defaults.localBgpIp;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerBgpIp = defaults.peerBgpIp;
    	      this.tunnelCidr = defaults.tunnelCidr;
        }

        @CustomType.Setter
        public Builder bgpStatus(String bgpStatus) {
            if (bgpStatus == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "bgpStatus");
            }
            this.bgpStatus = bgpStatus;
            return this;
        }
        @CustomType.Setter
        public Builder localAsn(Integer localAsn) {
            if (localAsn == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "localAsn");
            }
            this.localAsn = localAsn;
            return this;
        }
        @CustomType.Setter
        public Builder localBgpIp(String localBgpIp) {
            if (localBgpIp == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "localBgpIp");
            }
            this.localBgpIp = localBgpIp;
            return this;
        }
        @CustomType.Setter
        public Builder peerAsn(String peerAsn) {
            if (peerAsn == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "peerAsn");
            }
            this.peerAsn = peerAsn;
            return this;
        }
        @CustomType.Setter
        public Builder peerBgpIp(String peerBgpIp) {
            if (peerBgpIp == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "peerBgpIp");
            }
            this.peerBgpIp = peerBgpIp;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelCidr(String tunnelCidr) {
            if (tunnelCidr == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig", "tunnelCidr");
            }
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig build() {
            final var _resultValue = new GetGatewayVpnAttachmentsAttachmentTunnelOptionsSpecificationTunnelBgpConfig();
            _resultValue.bgpStatus = bgpStatus;
            _resultValue.localAsn = localAsn;
            _resultValue.localBgpIp = localBgpIp;
            _resultValue.peerAsn = peerAsn;
            _resultValue.peerBgpIp = peerBgpIp;
            _resultValue.tunnelCidr = tunnelCidr;
            return _resultValue;
        }
    }
}
