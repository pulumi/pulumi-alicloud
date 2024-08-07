// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodeGroupSpotBidPrice {
    /**
     * @return The spot bid price of a PayAsYouGo instance.
     * 
     */
    private Integer bidPrice;
    /**
     * @return Host Ecs instance type.
     * 
     */
    private String instanceType;

    private ClusterNodeGroupSpotBidPrice() {}
    /**
     * @return The spot bid price of a PayAsYouGo instance.
     * 
     */
    public Integer bidPrice() {
        return this.bidPrice;
    }
    /**
     * @return Host Ecs instance type.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupSpotBidPrice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bidPrice;
        private String instanceType;
        public Builder() {}
        public Builder(ClusterNodeGroupSpotBidPrice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.instanceType = defaults.instanceType;
        }

        @CustomType.Setter
        public Builder bidPrice(Integer bidPrice) {
            if (bidPrice == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupSpotBidPrice", "bidPrice");
            }
            this.bidPrice = bidPrice;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupSpotBidPrice", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        public ClusterNodeGroupSpotBidPrice build() {
            final var _resultValue = new ClusterNodeGroupSpotBidPrice();
            _resultValue.bidPrice = bidPrice;
            _resultValue.instanceType = instanceType;
            return _resultValue;
        }
    }
}
