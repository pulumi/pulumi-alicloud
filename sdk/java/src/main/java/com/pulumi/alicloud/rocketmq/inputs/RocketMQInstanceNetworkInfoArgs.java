// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.alicloud.rocketmq.inputs.RocketMQInstanceNetworkInfoEndpointArgs;
import com.pulumi.alicloud.rocketmq.inputs.RocketMQInstanceNetworkInfoInternetInfoArgs;
import com.pulumi.alicloud.rocketmq.inputs.RocketMQInstanceNetworkInfoVpcInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQInstanceNetworkInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQInstanceNetworkInfoArgs Empty = new RocketMQInstanceNetworkInfoArgs();

    /**
     * Access point list.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<RocketMQInstanceNetworkInfoEndpointArgs>> endpoints;

    /**
     * @return Access point list.
     * 
     */
    public Optional<Output<List<RocketMQInstanceNetworkInfoEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * instance internet info. See `internet_info` below.
     * 
     */
    @Import(name="internetInfo", required=true)
    private Output<RocketMQInstanceNetworkInfoInternetInfoArgs> internetInfo;

    /**
     * @return instance internet info. See `internet_info` below.
     * 
     */
    public Output<RocketMQInstanceNetworkInfoInternetInfoArgs> internetInfo() {
        return this.internetInfo;
    }

    /**
     * Proprietary network information. See `vpc_info` below.
     * 
     */
    @Import(name="vpcInfo", required=true)
    private Output<RocketMQInstanceNetworkInfoVpcInfoArgs> vpcInfo;

    /**
     * @return Proprietary network information. See `vpc_info` below.
     * 
     */
    public Output<RocketMQInstanceNetworkInfoVpcInfoArgs> vpcInfo() {
        return this.vpcInfo;
    }

    private RocketMQInstanceNetworkInfoArgs() {}

    private RocketMQInstanceNetworkInfoArgs(RocketMQInstanceNetworkInfoArgs $) {
        this.endpoints = $.endpoints;
        this.internetInfo = $.internetInfo;
        this.vpcInfo = $.vpcInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQInstanceNetworkInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQInstanceNetworkInfoArgs $;

        public Builder() {
            $ = new RocketMQInstanceNetworkInfoArgs();
        }

        public Builder(RocketMQInstanceNetworkInfoArgs defaults) {
            $ = new RocketMQInstanceNetworkInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints Access point list.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<RocketMQInstanceNetworkInfoEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Access point list.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<RocketMQInstanceNetworkInfoEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints Access point list.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(RocketMQInstanceNetworkInfoEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param internetInfo instance internet info. See `internet_info` below.
         * 
         * @return builder
         * 
         */
        public Builder internetInfo(Output<RocketMQInstanceNetworkInfoInternetInfoArgs> internetInfo) {
            $.internetInfo = internetInfo;
            return this;
        }

        /**
         * @param internetInfo instance internet info. See `internet_info` below.
         * 
         * @return builder
         * 
         */
        public Builder internetInfo(RocketMQInstanceNetworkInfoInternetInfoArgs internetInfo) {
            return internetInfo(Output.of(internetInfo));
        }

        /**
         * @param vpcInfo Proprietary network information. See `vpc_info` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcInfo(Output<RocketMQInstanceNetworkInfoVpcInfoArgs> vpcInfo) {
            $.vpcInfo = vpcInfo;
            return this;
        }

        /**
         * @param vpcInfo Proprietary network information. See `vpc_info` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcInfo(RocketMQInstanceNetworkInfoVpcInfoArgs vpcInfo) {
            return vpcInfo(Output.of(vpcInfo));
        }

        public RocketMQInstanceNetworkInfoArgs build() {
            if ($.internetInfo == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoArgs", "internetInfo");
            }
            if ($.vpcInfo == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoArgs", "vpcInfo");
            }
            return $;
        }
    }

}
