// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class PbrRouteEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PbrRouteEntryArgs Empty = new PbrRouteEntryArgs();

    /**
     * The next hop of the policy-based route.
     * 
     */
    @Import(name="nextHop", required=true)
    private Output<String> nextHop;

    /**
     * @return The next hop of the policy-based route.
     * 
     */
    public Output<String> nextHop() {
        return this.nextHop;
    }

    /**
     * Whether to issue the destination route to the VPC.
     * 
     */
    @Import(name="publishVpc", required=true)
    private Output<Boolean> publishVpc;

    /**
     * @return Whether to issue the destination route to the VPC.
     * 
     */
    public Output<Boolean> publishVpc() {
        return this.publishVpc;
    }

    /**
     * The destination CIDR block of the policy-based route.
     * 
     */
    @Import(name="routeDest", required=true)
    private Output<String> routeDest;

    /**
     * @return The destination CIDR block of the policy-based route.
     * 
     */
    public Output<String> routeDest() {
        return this.routeDest;
    }

    /**
     * The source CIDR block of the policy-based route.
     * 
     */
    @Import(name="routeSource", required=true)
    private Output<String> routeSource;

    /**
     * @return The source CIDR block of the policy-based route.
     * 
     */
    public Output<String> routeSource() {
        return this.routeSource;
    }

    /**
     * The ID of the vpn gateway.
     * 
     */
    @Import(name="vpnGatewayId", required=true)
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the vpn gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * The weight of the policy-based route. Valid values: 0 and 100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return The weight of the policy-based route. Valid values: 0 and 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private PbrRouteEntryArgs() {}

    private PbrRouteEntryArgs(PbrRouteEntryArgs $) {
        this.nextHop = $.nextHop;
        this.publishVpc = $.publishVpc;
        this.routeDest = $.routeDest;
        this.routeSource = $.routeSource;
        this.vpnGatewayId = $.vpnGatewayId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PbrRouteEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PbrRouteEntryArgs $;

        public Builder() {
            $ = new PbrRouteEntryArgs();
        }

        public Builder(PbrRouteEntryArgs defaults) {
            $ = new PbrRouteEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextHop The next hop of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(Output<String> nextHop) {
            $.nextHop = nextHop;
            return this;
        }

        /**
         * @param nextHop The next hop of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder nextHop(String nextHop) {
            return nextHop(Output.of(nextHop));
        }

        /**
         * @param publishVpc Whether to issue the destination route to the VPC.
         * 
         * @return builder
         * 
         */
        public Builder publishVpc(Output<Boolean> publishVpc) {
            $.publishVpc = publishVpc;
            return this;
        }

        /**
         * @param publishVpc Whether to issue the destination route to the VPC.
         * 
         * @return builder
         * 
         */
        public Builder publishVpc(Boolean publishVpc) {
            return publishVpc(Output.of(publishVpc));
        }

        /**
         * @param routeDest The destination CIDR block of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder routeDest(Output<String> routeDest) {
            $.routeDest = routeDest;
            return this;
        }

        /**
         * @param routeDest The destination CIDR block of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder routeDest(String routeDest) {
            return routeDest(Output.of(routeDest));
        }

        /**
         * @param routeSource The source CIDR block of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder routeSource(Output<String> routeSource) {
            $.routeSource = routeSource;
            return this;
        }

        /**
         * @param routeSource The source CIDR block of the policy-based route.
         * 
         * @return builder
         * 
         */
        public Builder routeSource(String routeSource) {
            return routeSource(Output.of(routeSource));
        }

        /**
         * @param vpnGatewayId The ID of the vpn gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(Output<String> vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * @param vpnGatewayId The ID of the vpn gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            return vpnGatewayId(Output.of(vpnGatewayId));
        }

        /**
         * @param weight The weight of the policy-based route. Valid values: 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of the policy-based route. Valid values: 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public PbrRouteEntryArgs build() {
            if ($.nextHop == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "nextHop");
            }
            if ($.publishVpc == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "publishVpc");
            }
            if ($.routeDest == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "routeDest");
            }
            if ($.routeSource == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "routeSource");
            }
            if ($.vpnGatewayId == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "vpnGatewayId");
            }
            if ($.weight == null) {
                throw new MissingRequiredPropertyException("PbrRouteEntryArgs", "weight");
            }
            return $;
        }
    }

}
