// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainResourceProxyType {
    /**
     * @return the port number. This field is required and must be an integer.
     * 
     */
    private final @Nullable List<Integer> proxyPorts;
    /**
     * @return the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
     * 
     */
    private final @Nullable String proxyType;

    @CustomType.Constructor
    private DomainResourceProxyType(
        @CustomType.Parameter("proxyPorts") @Nullable List<Integer> proxyPorts,
        @CustomType.Parameter("proxyType") @Nullable String proxyType) {
        this.proxyPorts = proxyPorts;
        this.proxyType = proxyType;
    }

    /**
     * @return the port number. This field is required and must be an integer.
     * 
     */
    public List<Integer> proxyPorts() {
        return this.proxyPorts == null ? List.of() : this.proxyPorts;
    }
    /**
     * @return the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
     * 
     */
    public Optional<String> proxyType() {
        return Optional.ofNullable(this.proxyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainResourceProxyType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> proxyPorts;
        private @Nullable String proxyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainResourceProxyType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyPorts = defaults.proxyPorts;
    	      this.proxyType = defaults.proxyType;
        }

        public Builder proxyPorts(@Nullable List<Integer> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public Builder proxyPorts(Integer... proxyPorts) {
            return proxyPorts(List.of(proxyPorts));
        }
        public Builder proxyType(@Nullable String proxyType) {
            this.proxyType = proxyType;
            return this;
        }        public DomainResourceProxyType build() {
            return new DomainResourceProxyType(proxyPorts, proxyType);
        }
    }
}