// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerZoneMappingLoadBalancerAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerZoneMappingLoadBalancerAddressArgs Empty = new LoadBalancerZoneMappingLoadBalancerAddressArgs();

    /**
     * IP Address. The Public IP Address, and Private IP Address from the Address Type
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IP Address. The Public IP Address, and Private IP Address from the Address Type
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The ID of the EIP instance.
     * 
     */
    @Import(name="allocationId")
    private @Nullable Output<String> allocationId;

    /**
     * @return The ID of the EIP instance.
     * 
     */
    public Optional<Output<String>> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }

    /**
     * The type of the EIP instance.
     * 
     */
    @Import(name="eipType")
    private @Nullable Output<String> eipType;

    /**
     * @return The type of the EIP instance.
     * 
     */
    public Optional<Output<String>> eipType() {
        return Optional.ofNullable(this.eipType);
    }

    /**
     * Ipv6 address
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return Ipv6 address
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    private LoadBalancerZoneMappingLoadBalancerAddressArgs() {}

    private LoadBalancerZoneMappingLoadBalancerAddressArgs(LoadBalancerZoneMappingLoadBalancerAddressArgs $) {
        this.address = $.address;
        this.allocationId = $.allocationId;
        this.eipType = $.eipType;
        this.ipv6Address = $.ipv6Address;
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
         * @param address IP Address. The Public IP Address, and Private IP Address from the Address Type
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IP Address. The Public IP Address, and Private IP Address from the Address Type
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param allocationId The ID of the EIP instance.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(@Nullable Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        /**
         * @param allocationId The ID of the EIP instance.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        /**
         * @param eipType The type of the EIP instance.
         * 
         * @return builder
         * 
         */
        public Builder eipType(@Nullable Output<String> eipType) {
            $.eipType = eipType;
            return this;
        }

        /**
         * @param eipType The type of the EIP instance.
         * 
         * @return builder
         * 
         */
        public Builder eipType(String eipType) {
            return eipType(Output.of(eipType));
        }

        /**
         * @param ipv6Address Ipv6 address
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address Ipv6 address
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        public LoadBalancerZoneMappingLoadBalancerAddressArgs build() {
            return $;
        }
    }

}
