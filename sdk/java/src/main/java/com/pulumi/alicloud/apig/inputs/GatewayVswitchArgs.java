// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayVswitchArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayVswitchArgs Empty = new GatewayVswitchArgs();

    /**
     * The name of the VPC gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the VPC gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the virtual switch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the virtual switch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GatewayVswitchArgs() {}

    private GatewayVswitchArgs(GatewayVswitchArgs $) {
        this.name = $.name;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayVswitchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayVswitchArgs $;

        public Builder() {
            $ = new GatewayVswitchArgs();
        }

        public Builder(GatewayVswitchArgs defaults) {
            $ = new GatewayVswitchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the VPC gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the VPC gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vswitchId The ID of the virtual switch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the virtual switch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GatewayVswitchArgs build() {
            return $;
        }
    }

}