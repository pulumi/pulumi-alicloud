// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage {
    /**
     * @return The bandwidth value of the cross-region acceleration bandwidth plan. Unit: Mbit/s.
     * 
     */
    private Integer bandwidth;
    /**
     * @return The ID of the cross-region acceleration bandwidth plan.
     * 
     */
    private String instanceId;

    private GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage() {}
    /**
     * @return The bandwidth value of the cross-region acceleration bandwidth plan. Unit: Mbit/s.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The ID of the cross-region acceleration bandwidth plan.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bandwidth;
        private String instanceId;
        public Builder() {}
        public Builder(GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.instanceId = defaults.instanceId;
        }

        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        public GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage build() {
            final var _resultValue = new GetBasicAcceleratorsAcceleratorCrossDomainBandwidthPackage();
            _resultValue.bandwidth = bandwidth;
            _resultValue.instanceId = instanceId;
            return _resultValue;
        }
    }
}
