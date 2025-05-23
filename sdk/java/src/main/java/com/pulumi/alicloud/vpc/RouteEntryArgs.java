// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteEntryArgs Empty = new RouteEntryArgs();

    /**
     * The description of the Route Entry. The description must be `1` to `256` characters in length, and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Route Entry. The description must be `1` to `256` characters in length, and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination CIDR block of the custom route entry.
     * 
     */
    @Import(name="destinationCidrblock")
    private @Nullable Output<String> destinationCidrblock;

    /**
     * @return The destination CIDR block of the custom route entry.
     * 
     */
    public Optional<Output<String>> destinationCidrblock() {
        return Optional.ofNullable(this.destinationCidrblock);
    }

    /**
     * The name of the Route Entry. The name must be `1` to `128` characters in length, and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Route Entry. The name must be `1` to `128` characters in length, and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of Next Hop.
     * 
     */
    @Import(name="nexthopId")
    private @Nullable Output<String> nexthopId;

    /**
     * @return The ID of Next Hop.
     * 
     */
    public Optional<Output<String>> nexthopId() {
        return Optional.ofNullable(this.nexthopId);
    }

    /**
     * The type of Next Hop. Valid values:
     * - `Instance`: An Elastic Compute Service (ECS) instance.
     * - `HaVip`: A high-availability virtual IP address (HAVIP).
     * - `RouterInterface`: A router interface.
     * - `NetworkInterface`: An elastic network interface (ENI).
     * - `VpnGateway`: A VPN Gateway.
     * - `IPv6Gateway`: An IPv6 gateway.
     * - `NatGateway`: A Nat Gateway.
     * - `Attachment`: A transit router.
     * - `VpcPeer`: A VPC Peering Connection.
     * - `Ipv4Gateway`: An IPv4 gateway.
     * - `GatewayEndpoint`: A gateway endpoint.
     * - `Ecr`: A Express Connect Router (ECR).
     * 
     */
    @Import(name="nexthopType")
    private @Nullable Output<String> nexthopType;

    /**
     * @return The type of Next Hop. Valid values:
     * - `Instance`: An Elastic Compute Service (ECS) instance.
     * - `HaVip`: A high-availability virtual IP address (HAVIP).
     * - `RouterInterface`: A router interface.
     * - `NetworkInterface`: An elastic network interface (ENI).
     * - `VpnGateway`: A VPN Gateway.
     * - `IPv6Gateway`: An IPv6 gateway.
     * - `NatGateway`: A Nat Gateway.
     * - `Attachment`: A transit router.
     * - `VpcPeer`: A VPC Peering Connection.
     * - `Ipv4Gateway`: An IPv4 gateway.
     * - `GatewayEndpoint`: A gateway endpoint.
     * - `Ecr`: A Express Connect Router (ECR).
     * 
     */
    public Optional<Output<String>> nexthopType() {
        return Optional.ofNullable(this.nexthopType);
    }

    /**
     * The ID of the Route Table.
     * 
     */
    @Import(name="routeTableId", required=true)
    private Output<String> routeTableId;

    /**
     * @return The ID of the Route Table.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }

    private RouteEntryArgs() {}

    private RouteEntryArgs(RouteEntryArgs $) {
        this.description = $.description;
        this.destinationCidrblock = $.destinationCidrblock;
        this.name = $.name;
        this.nexthopId = $.nexthopId;
        this.nexthopType = $.nexthopType;
        this.routeTableId = $.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteEntryArgs $;

        public Builder() {
            $ = new RouteEntryArgs();
        }

        public Builder(RouteEntryArgs defaults) {
            $ = new RouteEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Route Entry. The description must be `1` to `256` characters in length, and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Route Entry. The description must be `1` to `256` characters in length, and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationCidrblock The destination CIDR block of the custom route entry.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrblock(@Nullable Output<String> destinationCidrblock) {
            $.destinationCidrblock = destinationCidrblock;
            return this;
        }

        /**
         * @param destinationCidrblock The destination CIDR block of the custom route entry.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrblock(String destinationCidrblock) {
            return destinationCidrblock(Output.of(destinationCidrblock));
        }

        /**
         * @param name The name of the Route Entry. The name must be `1` to `128` characters in length, and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Route Entry. The name must be `1` to `128` characters in length, and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nexthopId The ID of Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nexthopId(@Nullable Output<String> nexthopId) {
            $.nexthopId = nexthopId;
            return this;
        }

        /**
         * @param nexthopId The ID of Next Hop.
         * 
         * @return builder
         * 
         */
        public Builder nexthopId(String nexthopId) {
            return nexthopId(Output.of(nexthopId));
        }

        /**
         * @param nexthopType The type of Next Hop. Valid values:
         * - `Instance`: An Elastic Compute Service (ECS) instance.
         * - `HaVip`: A high-availability virtual IP address (HAVIP).
         * - `RouterInterface`: A router interface.
         * - `NetworkInterface`: An elastic network interface (ENI).
         * - `VpnGateway`: A VPN Gateway.
         * - `IPv6Gateway`: An IPv6 gateway.
         * - `NatGateway`: A Nat Gateway.
         * - `Attachment`: A transit router.
         * - `VpcPeer`: A VPC Peering Connection.
         * - `Ipv4Gateway`: An IPv4 gateway.
         * - `GatewayEndpoint`: A gateway endpoint.
         * - `Ecr`: A Express Connect Router (ECR).
         * 
         * @return builder
         * 
         */
        public Builder nexthopType(@Nullable Output<String> nexthopType) {
            $.nexthopType = nexthopType;
            return this;
        }

        /**
         * @param nexthopType The type of Next Hop. Valid values:
         * - `Instance`: An Elastic Compute Service (ECS) instance.
         * - `HaVip`: A high-availability virtual IP address (HAVIP).
         * - `RouterInterface`: A router interface.
         * - `NetworkInterface`: An elastic network interface (ENI).
         * - `VpnGateway`: A VPN Gateway.
         * - `IPv6Gateway`: An IPv6 gateway.
         * - `NatGateway`: A Nat Gateway.
         * - `Attachment`: A transit router.
         * - `VpcPeer`: A VPC Peering Connection.
         * - `Ipv4Gateway`: An IPv4 gateway.
         * - `GatewayEndpoint`: A gateway endpoint.
         * - `Ecr`: A Express Connect Router (ECR).
         * 
         * @return builder
         * 
         */
        public Builder nexthopType(String nexthopType) {
            return nexthopType(Output.of(nexthopType));
        }

        /**
         * @param routeTableId The ID of the Route Table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId The ID of the Route Table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        public RouteEntryArgs build() {
            if ($.routeTableId == null) {
                throw new MissingRequiredPropertyException("RouteEntryArgs", "routeTableId");
            }
            return $;
        }
    }

}
