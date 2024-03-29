// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.alicloud.rocketmq.outputs.RocketMQInstanceNetworkInfoEndpoint;
import com.pulumi.alicloud.rocketmq.outputs.RocketMQInstanceNetworkInfoInternetInfo;
import com.pulumi.alicloud.rocketmq.outputs.RocketMQInstanceNetworkInfoVpcInfo;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RocketMQInstanceNetworkInfo {
    /**
     * @return Access point list.
     * 
     */
    private @Nullable List<RocketMQInstanceNetworkInfoEndpoint> endpoints;
    /**
     * @return instance internet info. See `internet_info` below.
     * 
     */
    private RocketMQInstanceNetworkInfoInternetInfo internetInfo;
    /**
     * @return Proprietary network information. See `vpc_info` below.
     * 
     */
    private RocketMQInstanceNetworkInfoVpcInfo vpcInfo;

    private RocketMQInstanceNetworkInfo() {}
    /**
     * @return Access point list.
     * 
     */
    public List<RocketMQInstanceNetworkInfoEndpoint> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * @return instance internet info. See `internet_info` below.
     * 
     */
    public RocketMQInstanceNetworkInfoInternetInfo internetInfo() {
        return this.internetInfo;
    }
    /**
     * @return Proprietary network information. See `vpc_info` below.
     * 
     */
    public RocketMQInstanceNetworkInfoVpcInfo vpcInfo() {
        return this.vpcInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocketMQInstanceNetworkInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RocketMQInstanceNetworkInfoEndpoint> endpoints;
        private RocketMQInstanceNetworkInfoInternetInfo internetInfo;
        private RocketMQInstanceNetworkInfoVpcInfo vpcInfo;
        public Builder() {}
        public Builder(RocketMQInstanceNetworkInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.internetInfo = defaults.internetInfo;
    	      this.vpcInfo = defaults.vpcInfo;
        }

        @CustomType.Setter
        public Builder endpoints(@Nullable List<RocketMQInstanceNetworkInfoEndpoint> endpoints) {

            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(RocketMQInstanceNetworkInfoEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder internetInfo(RocketMQInstanceNetworkInfoInternetInfo internetInfo) {
            if (internetInfo == null) {
              throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfo", "internetInfo");
            }
            this.internetInfo = internetInfo;
            return this;
        }
        @CustomType.Setter
        public Builder vpcInfo(RocketMQInstanceNetworkInfoVpcInfo vpcInfo) {
            if (vpcInfo == null) {
              throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfo", "vpcInfo");
            }
            this.vpcInfo = vpcInfo;
            return this;
        }
        public RocketMQInstanceNetworkInfo build() {
            final var _resultValue = new RocketMQInstanceNetworkInfo();
            _resultValue.endpoints = endpoints;
            _resultValue.internetInfo = internetInfo;
            _resultValue.vpcInfo = vpcInfo;
            return _resultValue;
        }
    }
}
