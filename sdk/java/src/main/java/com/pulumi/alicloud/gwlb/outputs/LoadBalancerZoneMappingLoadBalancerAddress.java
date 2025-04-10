// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerZoneMappingLoadBalancerAddress {
    /**
     * @return The ID of the elastic network interface (ENI) used by the GWLB instance.
     * 
     */
    private @Nullable String eniId;
    /**
     * @return The private IPv4 address.
     * 
     */
    private @Nullable String privateIpv4Address;

    private LoadBalancerZoneMappingLoadBalancerAddress() {}
    /**
     * @return The ID of the elastic network interface (ENI) used by the GWLB instance.
     * 
     */
    public Optional<String> eniId() {
        return Optional.ofNullable(this.eniId);
    }
    /**
     * @return The private IPv4 address.
     * 
     */
    public Optional<String> privateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerZoneMappingLoadBalancerAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eniId;
        private @Nullable String privateIpv4Address;
        public Builder() {}
        public Builder(LoadBalancerZoneMappingLoadBalancerAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eniId = defaults.eniId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
        }

        @CustomType.Setter
        public Builder eniId(@Nullable String eniId) {

            this.eniId = eniId;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpv4Address(@Nullable String privateIpv4Address) {

            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public LoadBalancerZoneMappingLoadBalancerAddress build() {
            final var _resultValue = new LoadBalancerZoneMappingLoadBalancerAddress();
            _resultValue.eniId = eniId;
            _resultValue.privateIpv4Address = privateIpv4Address;
            return _resultValue;
        }
    }
}
