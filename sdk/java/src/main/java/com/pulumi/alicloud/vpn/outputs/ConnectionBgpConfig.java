// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionBgpConfig {
    /**
     * @return Bgp enable.
     * 
     */
    private @Nullable Boolean enable;
    /**
     * @return Local asn.
     * 
     */
    private @Nullable String localAsn;
    /**
     * @return Local bgp IP.
     * 
     */
    private @Nullable String localBgpIp;
    /**
     * @return The negotiation status of Tunnel.
     * 
     */
    private @Nullable String status;
    /**
     * @return IPSec tunnel Cidr.
     * 
     */
    private @Nullable String tunnelCidr;

    private ConnectionBgpConfig() {}
    /**
     * @return Bgp enable.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return Local asn.
     * 
     */
    public Optional<String> localAsn() {
        return Optional.ofNullable(this.localAsn);
    }
    /**
     * @return Local bgp IP.
     * 
     */
    public Optional<String> localBgpIp() {
        return Optional.ofNullable(this.localBgpIp);
    }
    /**
     * @return The negotiation status of Tunnel.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return IPSec tunnel Cidr.
     * 
     */
    public Optional<String> tunnelCidr() {
        return Optional.ofNullable(this.tunnelCidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionBgpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enable;
        private @Nullable String localAsn;
        private @Nullable String localBgpIp;
        private @Nullable String status;
        private @Nullable String tunnelCidr;
        public Builder() {}
        public Builder(ConnectionBgpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.localAsn = defaults.localAsn;
    	      this.localBgpIp = defaults.localBgpIp;
    	      this.status = defaults.status;
    	      this.tunnelCidr = defaults.tunnelCidr;
        }

        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder localAsn(@Nullable String localAsn) {

            this.localAsn = localAsn;
            return this;
        }
        @CustomType.Setter
        public Builder localBgpIp(@Nullable String localBgpIp) {

            this.localBgpIp = localBgpIp;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelCidr(@Nullable String tunnelCidr) {

            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public ConnectionBgpConfig build() {
            final var _resultValue = new ConnectionBgpConfig();
            _resultValue.enable = enable;
            _resultValue.localAsn = localAsn;
            _resultValue.localBgpIp = localBgpIp;
            _resultValue.status = status;
            _resultValue.tunnelCidr = tunnelCidr;
            return _resultValue;
        }
    }
}
