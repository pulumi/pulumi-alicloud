// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersBalancerZoneMappingLoadBalancerAddress {
    private String address;

    private GetLoadBalancersBalancerZoneMappingLoadBalancerAddress() {}
    public String address() {
        return this.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersBalancerZoneMappingLoadBalancerAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        public Builder() {}
        public Builder(GetLoadBalancersBalancerZoneMappingLoadBalancerAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersBalancerZoneMappingLoadBalancerAddress", "address");
            }
            this.address = address;
            return this;
        }
        public GetLoadBalancersBalancerZoneMappingLoadBalancerAddress build() {
            final var _resultValue = new GetLoadBalancersBalancerZoneMappingLoadBalancerAddress();
            _resultValue.address = address;
            return _resultValue;
        }
    }
}