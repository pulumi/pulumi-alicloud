// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig {
    /**
     * @return IKE auth Algorithm.
     * 
     */
    private String ikeAuthAlg;
    /**
     * @return IKE encript algorithm.
     * 
     */
    private String ikeEncAlg;
    /**
     * @return IKE lifetime.
     * 
     */
    private Integer ikeLifetime;
    /**
     * @return IKE Mode.
     * 
     */
    private String ikeMode;
    /**
     * @return DH Group.
     * 
     */
    private String ikePfs;
    /**
     * @return IKE Version.
     * 
     */
    private String ikeVersion;
    /**
     * @return The local Id.
     * 
     */
    private String localId;
    /**
     * @return Preshared secret key.
     * 
     */
    private String psk;
    /**
     * @return Remote ID.
     * 
     */
    private String remoteId;

    private GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig() {}
    /**
     * @return IKE auth Algorithm.
     * 
     */
    public String ikeAuthAlg() {
        return this.ikeAuthAlg;
    }
    /**
     * @return IKE encript algorithm.
     * 
     */
    public String ikeEncAlg() {
        return this.ikeEncAlg;
    }
    /**
     * @return IKE lifetime.
     * 
     */
    public Integer ikeLifetime() {
        return this.ikeLifetime;
    }
    /**
     * @return IKE Mode.
     * 
     */
    public String ikeMode() {
        return this.ikeMode;
    }
    /**
     * @return DH Group.
     * 
     */
    public String ikePfs() {
        return this.ikePfs;
    }
    /**
     * @return IKE Version.
     * 
     */
    public String ikeVersion() {
        return this.ikeVersion;
    }
    /**
     * @return The local Id.
     * 
     */
    public String localId() {
        return this.localId;
    }
    /**
     * @return Preshared secret key.
     * 
     */
    public String psk() {
        return this.psk;
    }
    /**
     * @return Remote ID.
     * 
     */
    public String remoteId() {
        return this.remoteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ikeAuthAlg;
        private String ikeEncAlg;
        private Integer ikeLifetime;
        private String ikeMode;
        private String ikePfs;
        private String ikeVersion;
        private String localId;
        private String psk;
        private String remoteId;
        public Builder() {}
        public Builder(GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig defaults) {
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
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikeAuthAlg");
            }
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeEncAlg(String ikeEncAlg) {
            if (ikeEncAlg == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikeEncAlg");
            }
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLifetime(Integer ikeLifetime) {
            if (ikeLifetime == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikeLifetime");
            }
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ikeMode(String ikeMode) {
            if (ikeMode == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikeMode");
            }
            this.ikeMode = ikeMode;
            return this;
        }
        @CustomType.Setter
        public Builder ikePfs(String ikePfs) {
            if (ikePfs == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikePfs");
            }
            this.ikePfs = ikePfs;
            return this;
        }
        @CustomType.Setter
        public Builder ikeVersion(String ikeVersion) {
            if (ikeVersion == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "ikeVersion");
            }
            this.ikeVersion = ikeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder localId(String localId) {
            if (localId == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "localId");
            }
            this.localId = localId;
            return this;
        }
        @CustomType.Setter
        public Builder psk(String psk) {
            if (psk == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "psk");
            }
            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder remoteId(String remoteId) {
            if (remoteId == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig", "remoteId");
            }
            this.remoteId = remoteId;
            return this;
        }
        public GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig build() {
            final var _resultValue = new GetConnectionsConnectionTunnelOptionsSpecificationTunnelIkeConfig();
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
