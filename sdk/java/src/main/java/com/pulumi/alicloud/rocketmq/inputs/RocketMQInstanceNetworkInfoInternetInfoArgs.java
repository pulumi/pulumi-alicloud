// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQInstanceNetworkInfoInternetInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQInstanceNetworkInfoInternetInfoArgs Empty = new RocketMQInstanceNetworkInfoInternetInfoArgs();

    @Import(name="flowOutBandwidth")
    private @Nullable Output<Integer> flowOutBandwidth;

    public Optional<Output<Integer>> flowOutBandwidth() {
        return Optional.ofNullable(this.flowOutBandwidth);
    }

    @Import(name="flowOutType", required=true)
    private Output<String> flowOutType;

    public Output<String> flowOutType() {
        return this.flowOutType;
    }

    @Import(name="internetSpec", required=true)
    private Output<String> internetSpec;

    public Output<String> internetSpec() {
        return this.internetSpec;
    }

    @Import(name="ipWhitelists")
    private @Nullable Output<List<String>> ipWhitelists;

    public Optional<Output<List<String>>> ipWhitelists() {
        return Optional.ofNullable(this.ipWhitelists);
    }

    private RocketMQInstanceNetworkInfoInternetInfoArgs() {}

    private RocketMQInstanceNetworkInfoInternetInfoArgs(RocketMQInstanceNetworkInfoInternetInfoArgs $) {
        this.flowOutBandwidth = $.flowOutBandwidth;
        this.flowOutType = $.flowOutType;
        this.internetSpec = $.internetSpec;
        this.ipWhitelists = $.ipWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQInstanceNetworkInfoInternetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQInstanceNetworkInfoInternetInfoArgs $;

        public Builder() {
            $ = new RocketMQInstanceNetworkInfoInternetInfoArgs();
        }

        public Builder(RocketMQInstanceNetworkInfoInternetInfoArgs defaults) {
            $ = new RocketMQInstanceNetworkInfoInternetInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder flowOutBandwidth(@Nullable Output<Integer> flowOutBandwidth) {
            $.flowOutBandwidth = flowOutBandwidth;
            return this;
        }

        public Builder flowOutBandwidth(Integer flowOutBandwidth) {
            return flowOutBandwidth(Output.of(flowOutBandwidth));
        }

        public Builder flowOutType(Output<String> flowOutType) {
            $.flowOutType = flowOutType;
            return this;
        }

        public Builder flowOutType(String flowOutType) {
            return flowOutType(Output.of(flowOutType));
        }

        public Builder internetSpec(Output<String> internetSpec) {
            $.internetSpec = internetSpec;
            return this;
        }

        public Builder internetSpec(String internetSpec) {
            return internetSpec(Output.of(internetSpec));
        }

        public Builder ipWhitelists(@Nullable Output<List<String>> ipWhitelists) {
            $.ipWhitelists = ipWhitelists;
            return this;
        }

        public Builder ipWhitelists(List<String> ipWhitelists) {
            return ipWhitelists(Output.of(ipWhitelists));
        }

        public Builder ipWhitelists(String... ipWhitelists) {
            return ipWhitelists(List.of(ipWhitelists));
        }

        public RocketMQInstanceNetworkInfoInternetInfoArgs build() {
            if ($.flowOutType == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoInternetInfoArgs", "flowOutType");
            }
            if ($.internetSpec == null) {
                throw new MissingRequiredPropertyException("RocketMQInstanceNetworkInfoInternetInfoArgs", "internetSpec");
            }
            return $;
        }
    }

}