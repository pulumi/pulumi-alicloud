// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayVpnAttachmentsAttachmentIkeConfig {
    /**
     * @return The IKE authentication algorithm.
     * 
     */
    private String ikeAuthAlg;
    /**
     * @return The IKE encryption algorithm.
     * 
     */
    private String ikeEncAlg;
    /**
     * @return The IKE lifetime. Unit: seconds.
     * 
     */
    private String ikeLifetime;
    /**
     * @return The IKE negotiation mode.
     * 
     */
    private String ikeMode;
    /**
     * @return The DH group.
     * 
     */
    private String ikePfs;
    /**
     * @return The version of the IKE protocol.
     * 
     */
    private String ikeVersion;
    /**
     * @return The local ID, which supports the FQDN and IP formats. The current VPN gateway IP address is selected by default. The alicloud.cen.TransitRouterVpnAttachment resource will not have a value until after it is created.
     * 
     */
    private String localId;
    /**
     * @return The pre-shared key.
     * 
     */
    private String psk;
    /**
     * @return The identifier of the peer. The default value is the IP address of the VPN gateway. The value can be a fully qualified domain name (FQDN) or an IP address.
     * 
     */
    private String remoteId;

    private GetGatewayVpnAttachmentsAttachmentIkeConfig() {}
    /**
     * @return The IKE authentication algorithm.
     * 
     */
    public String ikeAuthAlg() {
        return this.ikeAuthAlg;
    }
    /**
     * @return The IKE encryption algorithm.
     * 
     */
    public String ikeEncAlg() {
        return this.ikeEncAlg;
    }
    /**
     * @return The IKE lifetime. Unit: seconds.
     * 
     */
    public String ikeLifetime() {
        return this.ikeLifetime;
    }
    /**
     * @return The IKE negotiation mode.
     * 
     */
    public String ikeMode() {
        return this.ikeMode;
    }
    /**
     * @return The DH group.
     * 
     */
    public String ikePfs() {
        return this.ikePfs;
    }
    /**
     * @return The version of the IKE protocol.
     * 
     */
    public String ikeVersion() {
        return this.ikeVersion;
    }
    /**
     * @return The local ID, which supports the FQDN and IP formats. The current VPN gateway IP address is selected by default. The alicloud.cen.TransitRouterVpnAttachment resource will not have a value until after it is created.
     * 
     */
    public String localId() {
        return this.localId;
    }
    /**
     * @return The pre-shared key.
     * 
     */
    public String psk() {
        return this.psk;
    }
    /**
     * @return The identifier of the peer. The default value is the IP address of the VPN gateway. The value can be a fully qualified domain name (FQDN) or an IP address.
     * 
     */
    public String remoteId() {
        return this.remoteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayVpnAttachmentsAttachmentIkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ikeAuthAlg;
        private String ikeEncAlg;
        private String ikeLifetime;
        private String ikeMode;
        private String ikePfs;
        private String ikeVersion;
        private String localId;
        private String psk;
        private String remoteId;
        public Builder() {}
        public Builder(GetGatewayVpnAttachmentsAttachmentIkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ikeAuthAlg = defaults.ikeAuthAlg;
    	      this.ikeEncAlg = defaults.ikeEncAlg;
    	      this.ikeLifetime = defaults.ikeLifetime;
    	      this.ikeMode = defaults.ikeMode;
    	      this.ikePfs = defaults.ikePfs;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.localId = defaults.localId;
    	      this.psk = defaults.psk;
    	      this.remoteId = defaults.remoteId;
        }

        @CustomType.Setter
        public Builder ikeAuthAlg(String ikeAuthAlg) {
            if (ikeAuthAlg == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikeAuthAlg");
            }
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeEncAlg(String ikeEncAlg) {
            if (ikeEncAlg == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikeEncAlg");
            }
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLifetime(String ikeLifetime) {
            if (ikeLifetime == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikeLifetime");
            }
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ikeMode(String ikeMode) {
            if (ikeMode == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikeMode");
            }
            this.ikeMode = ikeMode;
            return this;
        }
        @CustomType.Setter
        public Builder ikePfs(String ikePfs) {
            if (ikePfs == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikePfs");
            }
            this.ikePfs = ikePfs;
            return this;
        }
        @CustomType.Setter
        public Builder ikeVersion(String ikeVersion) {
            if (ikeVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "ikeVersion");
            }
            this.ikeVersion = ikeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder localId(String localId) {
            if (localId == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "localId");
            }
            this.localId = localId;
            return this;
        }
        @CustomType.Setter
        public Builder psk(String psk) {
            if (psk == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "psk");
            }
            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder remoteId(String remoteId) {
            if (remoteId == null) {
              throw new MissingRequiredPropertyException("GetGatewayVpnAttachmentsAttachmentIkeConfig", "remoteId");
            }
            this.remoteId = remoteId;
            return this;
        }
        public GetGatewayVpnAttachmentsAttachmentIkeConfig build() {
            final var _resultValue = new GetGatewayVpnAttachmentsAttachmentIkeConfig();
            _resultValue.ikeAuthAlg = ikeAuthAlg;
            _resultValue.ikeEncAlg = ikeEncAlg;
            _resultValue.ikeLifetime = ikeLifetime;
            _resultValue.ikeMode = ikeMode;
            _resultValue.ikePfs = ikePfs;
            _resultValue.ikeVersion = ikeVersion;
            _resultValue.localId = localId;
            _resultValue.psk = psk;
            _resultValue.remoteId = remoteId;
            return _resultValue;
        }
    }
}