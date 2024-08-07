// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionIkeConfig {
    /**
     * @return IKE auth Algorithm.
     * 
     */
    private @Nullable String ikeAuthAlg;
    /**
     * @return IKE encript algorithm.
     * 
     */
    private @Nullable String ikeEncAlg;
    /**
     * @return IKE lifetime.
     * 
     */
    private @Nullable Integer ikeLifetime;
    /**
     * @return The local ID, which supports the FQDN and IP formats, and defaults to the IP address of the selected VPN gateway.
     * 
     */
    private @Nullable String ikeLocalId;
    /**
     * @return IKE mode, supports main and aggressive mode. The main mode is highly secure. If NAT traversal is enabled, we recommend that you use the aggressive mode.
     * 
     */
    private @Nullable String ikeMode;
    /**
     * @return DH group.
     * 
     */
    private @Nullable String ikePfs;
    /**
     * @return The peer ID. The FQDN and IP address formats are supported. The default value is the IP address of the selected customer gateway.
     * 
     */
    private @Nullable String ikeRemoteId;
    /**
     * @return IKE version.
     * 
     */
    private @Nullable String ikeVersion;
    /**
     * @return Preshared secret key.
     * 
     */
    private @Nullable String psk;

    private ConnectionIkeConfig() {}
    /**
     * @return IKE auth Algorithm.
     * 
     */
    public Optional<String> ikeAuthAlg() {
        return Optional.ofNullable(this.ikeAuthAlg);
    }
    /**
     * @return IKE encript algorithm.
     * 
     */
    public Optional<String> ikeEncAlg() {
        return Optional.ofNullable(this.ikeEncAlg);
    }
    /**
     * @return IKE lifetime.
     * 
     */
    public Optional<Integer> ikeLifetime() {
        return Optional.ofNullable(this.ikeLifetime);
    }
    /**
     * @return The local ID, which supports the FQDN and IP formats, and defaults to the IP address of the selected VPN gateway.
     * 
     */
    public Optional<String> ikeLocalId() {
        return Optional.ofNullable(this.ikeLocalId);
    }
    /**
     * @return IKE mode, supports main and aggressive mode. The main mode is highly secure. If NAT traversal is enabled, we recommend that you use the aggressive mode.
     * 
     */
    public Optional<String> ikeMode() {
        return Optional.ofNullable(this.ikeMode);
    }
    /**
     * @return DH group.
     * 
     */
    public Optional<String> ikePfs() {
        return Optional.ofNullable(this.ikePfs);
    }
    /**
     * @return The peer ID. The FQDN and IP address formats are supported. The default value is the IP address of the selected customer gateway.
     * 
     */
    public Optional<String> ikeRemoteId() {
        return Optional.ofNullable(this.ikeRemoteId);
    }
    /**
     * @return IKE version.
     * 
     */
    public Optional<String> ikeVersion() {
        return Optional.ofNullable(this.ikeVersion);
    }
    /**
     * @return Preshared secret key.
     * 
     */
    public Optional<String> psk() {
        return Optional.ofNullable(this.psk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionIkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ikeAuthAlg;
        private @Nullable String ikeEncAlg;
        private @Nullable Integer ikeLifetime;
        private @Nullable String ikeLocalId;
        private @Nullable String ikeMode;
        private @Nullable String ikePfs;
        private @Nullable String ikeRemoteId;
        private @Nullable String ikeVersion;
        private @Nullable String psk;
        public Builder() {}
        public Builder(ConnectionIkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ikeAuthAlg = defaults.ikeAuthAlg;
    	      this.ikeEncAlg = defaults.ikeEncAlg;
    	      this.ikeLifetime = defaults.ikeLifetime;
    	      this.ikeLocalId = defaults.ikeLocalId;
    	      this.ikeMode = defaults.ikeMode;
    	      this.ikePfs = defaults.ikePfs;
    	      this.ikeRemoteId = defaults.ikeRemoteId;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.psk = defaults.psk;
        }

        @CustomType.Setter
        public Builder ikeAuthAlg(@Nullable String ikeAuthAlg) {

            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeEncAlg(@Nullable String ikeEncAlg) {

            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLifetime(@Nullable Integer ikeLifetime) {

            this.ikeLifetime = ikeLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLocalId(@Nullable String ikeLocalId) {

            this.ikeLocalId = ikeLocalId;
            return this;
        }
        @CustomType.Setter
        public Builder ikeMode(@Nullable String ikeMode) {

            this.ikeMode = ikeMode;
            return this;
        }
        @CustomType.Setter
        public Builder ikePfs(@Nullable String ikePfs) {

            this.ikePfs = ikePfs;
            return this;
        }
        @CustomType.Setter
        public Builder ikeRemoteId(@Nullable String ikeRemoteId) {

            this.ikeRemoteId = ikeRemoteId;
            return this;
        }
        @CustomType.Setter
        public Builder ikeVersion(@Nullable String ikeVersion) {

            this.ikeVersion = ikeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder psk(@Nullable String psk) {

            this.psk = psk;
            return this;
        }
        public ConnectionIkeConfig build() {
            final var _resultValue = new ConnectionIkeConfig();
            _resultValue.ikeAuthAlg = ikeAuthAlg;
            _resultValue.ikeEncAlg = ikeEncAlg;
            _resultValue.ikeLifetime = ikeLifetime;
            _resultValue.ikeLocalId = ikeLocalId;
            _resultValue.ikeMode = ikeMode;
            _resultValue.ikePfs = ikePfs;
            _resultValue.ikeRemoteId = ikeRemoteId;
            _resultValue.ikeVersion = ikeVersion;
            _resultValue.psk = psk;
            return _resultValue;
        }
    }
}
