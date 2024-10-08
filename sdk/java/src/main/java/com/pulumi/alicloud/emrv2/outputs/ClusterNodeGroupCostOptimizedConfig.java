// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ClusterNodeGroupCostOptimizedConfig {
    /**
     * @return The cost optimized configuration which on demand based capacity.
     * 
     */
    private Integer onDemandBaseCapacity;
    /**
     * @return The cost optimized configuration which on demand percentage above based capacity.
     * 
     */
    private Integer onDemandPercentageAboveBaseCapacity;
    /**
     * @return The cost optimized configuration with spot instance pools.
     * 
     */
    private Integer spotInstancePools;

    private ClusterNodeGroupCostOptimizedConfig() {}
    /**
     * @return The cost optimized configuration which on demand based capacity.
     * 
     */
    public Integer onDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }
    /**
     * @return The cost optimized configuration which on demand percentage above based capacity.
     * 
     */
    public Integer onDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }
    /**
     * @return The cost optimized configuration with spot instance pools.
     * 
     */
    public Integer spotInstancePools() {
        return this.spotInstancePools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupCostOptimizedConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer onDemandBaseCapacity;
        private Integer onDemandPercentageAboveBaseCapacity;
        private Integer spotInstancePools;
        public Builder() {}
        public Builder(ClusterNodeGroupCostOptimizedConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandBaseCapacity = defaults.onDemandBaseCapacity;
    	      this.onDemandPercentageAboveBaseCapacity = defaults.onDemandPercentageAboveBaseCapacity;
    	      this.spotInstancePools = defaults.spotInstancePools;
        }

        @CustomType.Setter
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            if (onDemandBaseCapacity == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupCostOptimizedConfig", "onDemandBaseCapacity");
            }
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            if (onDemandPercentageAboveBaseCapacity == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupCostOptimizedConfig", "onDemandPercentageAboveBaseCapacity");
            }
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder spotInstancePools(Integer spotInstancePools) {
            if (spotInstancePools == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupCostOptimizedConfig", "spotInstancePools");
            }
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public ClusterNodeGroupCostOptimizedConfig build() {
            final var _resultValue = new ClusterNodeGroupCostOptimizedConfig();
            _resultValue.onDemandBaseCapacity = onDemandBaseCapacity;
            _resultValue.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            _resultValue.spotInstancePools = spotInstancePools;
            return _resultValue;
        }
    }
}
