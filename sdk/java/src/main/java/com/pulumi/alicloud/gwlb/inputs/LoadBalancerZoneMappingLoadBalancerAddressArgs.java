// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerZoneMappingLoadBalancerAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerZoneMappingLoadBalancerAddressArgs Empty = new LoadBalancerZoneMappingLoadBalancerAddressArgs();

    /**
     * The ID of the ENI.
     * 
     */
    @Import(name="eniId")
    private @Nullable Output<String> eniId;

    /**
     * @return The ID of the ENI.
     * 
     */
    public Optional<Output<String>> eniId() {
        return Optional.ofNullable(this.eniId);
    }

    /**
     * IPv4 private network address.
     * 
     */
    @Import(name="privateIpv4Address")
    private @Nullable Output<String> privateIpv4Address;

    /**
     * @return IPv4 private network address.
     * 
     */
    public Optional<Output<String>> privateIpv4Address() {
        return Optional.ofNullable(this.privateIpv4Address);
    }

    private LoadBalancerZoneMappingLoadBalancerAddressArgs() {}

    private LoadBalancerZoneMappingLoadBalancerAddressArgs(LoadBalancerZoneMappingLoadBalancerAddressArgs $) {
        this.eniId = $.eniId;
        this.privateIpv4Address = $.privateIpv4Address;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerZoneMappingLoadBalancerAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerZoneMappingLoadBalancerAddressArgs $;

        public Builder() {
            $ = new LoadBalancerZoneMappingLoadBalancerAddressArgs();
        }

        public Builder(LoadBalancerZoneMappingLoadBalancerAddressArgs defaults) {
            $ = new LoadBalancerZoneMappingLoadBalancerAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eniId The ID of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder eniId(@Nullable Output<String> eniId) {
            $.eniId = eniId;
            return this;
        }

        /**
         * @param eniId The ID of the ENI.
         * 
         * @return builder
         * 
         */
        public Builder eniId(String eniId) {
            return eniId(Output.of(eniId));
        }

        /**
         * @param privateIpv4Address IPv4 private network address.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4Address(@Nullable Output<String> privateIpv4Address) {
            $.privateIpv4Address = privateIpv4Address;
            return this;
        }

        /**
         * @param privateIpv4Address IPv4 private network address.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv4Address(String privateIpv4Address) {
            return privateIpv4Address(Output.of(privateIpv4Address));
        }

        public LoadBalancerZoneMappingLoadBalancerAddressArgs build() {
            return $;
        }
    }

}