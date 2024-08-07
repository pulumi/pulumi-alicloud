// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Ipv6InternetBandwidthArgs extends com.pulumi.resources.ResourceArgs {

    public static final Ipv6InternetBandwidthArgs Empty = new Ipv6InternetBandwidthArgs();

    /**
     * The amount of Internet bandwidth resources of the IPv6 address, Unit: `Mbit/s`. Valid values: `1` to `5000`. **NOTE:** If `internet_charge_type` is set to `PayByTraffic`, the amount of Internet bandwidth resources of the IPv6 address is limited by the specification of the IPv6 gateway. `Small` (default): specifies the Free edition and the Internet bandwidth is from `1` to `500` Mbit/s. `Medium`: specifies the Medium edition and the Internet bandwidth is from `1` to `1000` Mbit/s. `Large`: specifies the Large edition and the Internet bandwidth is from `1` to `2000` Mbit/s.
     * 
     */
    @Import(name="bandwidth", required=true)
    private Output<Integer> bandwidth;

    /**
     * @return The amount of Internet bandwidth resources of the IPv6 address, Unit: `Mbit/s`. Valid values: `1` to `5000`. **NOTE:** If `internet_charge_type` is set to `PayByTraffic`, the amount of Internet bandwidth resources of the IPv6 address is limited by the specification of the IPv6 gateway. `Small` (default): specifies the Free edition and the Internet bandwidth is from `1` to `500` Mbit/s. `Medium`: specifies the Medium edition and the Internet bandwidth is from `1` to `1000` Mbit/s. `Large`: specifies the Large edition and the Internet bandwidth is from `1` to `2000` Mbit/s.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }

    /**
     * The metering method of the Internet bandwidth resources of the IPv6 gateway. Valid values: `PayByBandwidth`, `PayByTraffic`.
     * 
     */
    @Import(name="internetChargeType")
    private @Nullable Output<String> internetChargeType;

    /**
     * @return The metering method of the Internet bandwidth resources of the IPv6 gateway. Valid values: `PayByBandwidth`, `PayByTraffic`.
     * 
     */
    public Optional<Output<String>> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }

    /**
     * The ID of the IPv6 address instance.
     * 
     */
    @Import(name="ipv6AddressId", required=true)
    private Output<String> ipv6AddressId;

    /**
     * @return The ID of the IPv6 address instance.
     * 
     */
    public Output<String> ipv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * The ID of the IPv6 gateway to which the IPv6 address belongs.
     * 
     */
    @Import(name="ipv6GatewayId", required=true)
    private Output<String> ipv6GatewayId;

    /**
     * @return The ID of the IPv6 gateway to which the IPv6 address belongs.
     * 
     */
    public Output<String> ipv6GatewayId() {
        return this.ipv6GatewayId;
    }

    private Ipv6InternetBandwidthArgs() {}

    private Ipv6InternetBandwidthArgs(Ipv6InternetBandwidthArgs $) {
        this.bandwidth = $.bandwidth;
        this.internetChargeType = $.internetChargeType;
        this.ipv6AddressId = $.ipv6AddressId;
        this.ipv6GatewayId = $.ipv6GatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv6InternetBandwidthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv6InternetBandwidthArgs $;

        public Builder() {
            $ = new Ipv6InternetBandwidthArgs();
        }

        public Builder(Ipv6InternetBandwidthArgs defaults) {
            $ = new Ipv6InternetBandwidthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The amount of Internet bandwidth resources of the IPv6 address, Unit: `Mbit/s`. Valid values: `1` to `5000`. **NOTE:** If `internet_charge_type` is set to `PayByTraffic`, the amount of Internet bandwidth resources of the IPv6 address is limited by the specification of the IPv6 gateway. `Small` (default): specifies the Free edition and the Internet bandwidth is from `1` to `500` Mbit/s. `Medium`: specifies the Medium edition and the Internet bandwidth is from `1` to `1000` Mbit/s. `Large`: specifies the Large edition and the Internet bandwidth is from `1` to `2000` Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The amount of Internet bandwidth resources of the IPv6 address, Unit: `Mbit/s`. Valid values: `1` to `5000`. **NOTE:** If `internet_charge_type` is set to `PayByTraffic`, the amount of Internet bandwidth resources of the IPv6 address is limited by the specification of the IPv6 gateway. `Small` (default): specifies the Free edition and the Internet bandwidth is from `1` to `500` Mbit/s. `Medium`: specifies the Medium edition and the Internet bandwidth is from `1` to `1000` Mbit/s. `Large`: specifies the Large edition and the Internet bandwidth is from `1` to `2000` Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param internetChargeType The metering method of the Internet bandwidth resources of the IPv6 gateway. Valid values: `PayByBandwidth`, `PayByTraffic`.
         * 
         * @return builder
         * 
         */
        public Builder internetChargeType(@Nullable Output<String> internetChargeType) {
            $.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * @param internetChargeType The metering method of the Internet bandwidth resources of the IPv6 gateway. Valid values: `PayByBandwidth`, `PayByTraffic`.
         * 
         * @return builder
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            return internetChargeType(Output.of(internetChargeType));
        }

        /**
         * @param ipv6AddressId The ID of the IPv6 address instance.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressId(Output<String> ipv6AddressId) {
            $.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * @param ipv6AddressId The ID of the IPv6 address instance.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            return ipv6AddressId(Output.of(ipv6AddressId));
        }

        /**
         * @param ipv6GatewayId The ID of the IPv6 gateway to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder ipv6GatewayId(Output<String> ipv6GatewayId) {
            $.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * @param ipv6GatewayId The ID of the IPv6 gateway to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            return ipv6GatewayId(Output.of(ipv6GatewayId));
        }

        public Ipv6InternetBandwidthArgs build() {
            if ($.bandwidth == null) {
                throw new MissingRequiredPropertyException("Ipv6InternetBandwidthArgs", "bandwidth");
            }
            if ($.ipv6AddressId == null) {
                throw new MissingRequiredPropertyException("Ipv6InternetBandwidthArgs", "ipv6AddressId");
            }
            if ($.ipv6GatewayId == null) {
                throw new MissingRequiredPropertyException("Ipv6InternetBandwidthArgs", "ipv6GatewayId");
            }
            return $;
        }
    }

}
