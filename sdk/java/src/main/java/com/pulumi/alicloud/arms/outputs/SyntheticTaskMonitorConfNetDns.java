// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticTaskMonitorConfNetDns {
    /**
     * @return The IP address type of the DNS server.
     * - 0 (default):ipv4
     * - 1:ipv6
     *   2: Automatic.
     * 
     */
    private @Nullable Integer dnsServerIpType;
    /**
     * @return The IP address of the NS server. The default value is 114.114.114.114.
     * 
     */
    private @Nullable String nsServer;
    /**
     * @return DNS query method.
     * - 0 (default): Recursive
     * - 1: Iteration.
     * 
     */
    private @Nullable Integer queryMethod;
    /**
     * @return The target URL.
     * 
     */
    private String targetUrl;
    /**
     * @return TCP dial test timeout. The unit is milliseconds (ms), the minimum value is 1000, the maximum value is 300000, and the default value is 20000.
     * 
     */
    private @Nullable Integer timeout;

    private SyntheticTaskMonitorConfNetDns() {}
    /**
     * @return The IP address type of the DNS server.
     * - 0 (default):ipv4
     * - 1:ipv6
     *   2: Automatic.
     * 
     */
    public Optional<Integer> dnsServerIpType() {
        return Optional.ofNullable(this.dnsServerIpType);
    }
    /**
     * @return The IP address of the NS server. The default value is 114.114.114.114.
     * 
     */
    public Optional<String> nsServer() {
        return Optional.ofNullable(this.nsServer);
    }
    /**
     * @return DNS query method.
     * - 0 (default): Recursive
     * - 1: Iteration.
     * 
     */
    public Optional<Integer> queryMethod() {
        return Optional.ofNullable(this.queryMethod);
    }
    /**
     * @return The target URL.
     * 
     */
    public String targetUrl() {
        return this.targetUrl;
    }
    /**
     * @return TCP dial test timeout. The unit is milliseconds (ms), the minimum value is 1000, the maximum value is 300000, and the default value is 20000.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticTaskMonitorConfNetDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dnsServerIpType;
        private @Nullable String nsServer;
        private @Nullable Integer queryMethod;
        private String targetUrl;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(SyntheticTaskMonitorConfNetDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServerIpType = defaults.dnsServerIpType;
    	      this.nsServer = defaults.nsServer;
    	      this.queryMethod = defaults.queryMethod;
    	      this.targetUrl = defaults.targetUrl;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder dnsServerIpType(@Nullable Integer dnsServerIpType) {

            this.dnsServerIpType = dnsServerIpType;
            return this;
        }
        @CustomType.Setter
        public Builder nsServer(@Nullable String nsServer) {

            this.nsServer = nsServer;
            return this;
        }
        @CustomType.Setter
        public Builder queryMethod(@Nullable Integer queryMethod) {

            this.queryMethod = queryMethod;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(String targetUrl) {
            if (targetUrl == null) {
              throw new MissingRequiredPropertyException("SyntheticTaskMonitorConfNetDns", "targetUrl");
            }
            this.targetUrl = targetUrl;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public SyntheticTaskMonitorConfNetDns build() {
            final var _resultValue = new SyntheticTaskMonitorConfNetDns();
            _resultValue.dnsServerIpType = dnsServerIpType;
            _resultValue.nsServer = nsServer;
            _resultValue.queryMethod = queryMethod;
            _resultValue.targetUrl = targetUrl;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}