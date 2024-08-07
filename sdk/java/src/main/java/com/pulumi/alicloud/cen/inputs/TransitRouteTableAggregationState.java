// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouteTableAggregationState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouteTableAggregationState Empty = new TransitRouteTableAggregationState();

    /**
     * The status of the Transit Route Table Aggregation.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Transit Route Table Aggregation.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
     * 
     */
    @Import(name="transitRouteTableAggregationCidr")
    private @Nullable Output<String> transitRouteTableAggregationCidr;

    /**
     * @return The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
     * 
     */
    public Optional<Output<String>> transitRouteTableAggregationCidr() {
        return Optional.ofNullable(this.transitRouteTableAggregationCidr);
    }

    /**
     * The description of the aggregate route.
     * 
     */
    @Import(name="transitRouteTableAggregationDescription")
    private @Nullable Output<String> transitRouteTableAggregationDescription;

    /**
     * @return The description of the aggregate route.
     * 
     */
    public Optional<Output<String>> transitRouteTableAggregationDescription() {
        return Optional.ofNullable(this.transitRouteTableAggregationDescription);
    }

    /**
     * The name of the aggregate route.
     * 
     */
    @Import(name="transitRouteTableAggregationName")
    private @Nullable Output<String> transitRouteTableAggregationName;

    /**
     * @return The name of the aggregate route.
     * 
     */
    public Optional<Output<String>> transitRouteTableAggregationName() {
        return Optional.ofNullable(this.transitRouteTableAggregationName);
    }

    /**
     * The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
     * 
     */
    @Import(name="transitRouteTableAggregationScope")
    private @Nullable Output<String> transitRouteTableAggregationScope;

    /**
     * @return The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
     * 
     */
    public Optional<Output<String>> transitRouteTableAggregationScope() {
        return Optional.ofNullable(this.transitRouteTableAggregationScope);
    }

    /**
     * The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    @Import(name="transitRouteTableId")
    private @Nullable Output<String> transitRouteTableId;

    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public Optional<Output<String>> transitRouteTableId() {
        return Optional.ofNullable(this.transitRouteTableId);
    }

    private TransitRouteTableAggregationState() {}

    private TransitRouteTableAggregationState(TransitRouteTableAggregationState $) {
        this.status = $.status;
        this.transitRouteTableAggregationCidr = $.transitRouteTableAggregationCidr;
        this.transitRouteTableAggregationDescription = $.transitRouteTableAggregationDescription;
        this.transitRouteTableAggregationName = $.transitRouteTableAggregationName;
        this.transitRouteTableAggregationScope = $.transitRouteTableAggregationScope;
        this.transitRouteTableId = $.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouteTableAggregationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouteTableAggregationState $;

        public Builder() {
            $ = new TransitRouteTableAggregationState();
        }

        public Builder(TransitRouteTableAggregationState defaults) {
            $ = new TransitRouteTableAggregationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The status of the Transit Route Table Aggregation.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Transit Route Table Aggregation.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouteTableAggregationCidr The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationCidr(@Nullable Output<String> transitRouteTableAggregationCidr) {
            $.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * @param transitRouteTableAggregationCidr The destination CIDR block of the aggregate route. CIDR blocks that start with `0` or `100.64`. Multicast CIDR blocks, including `224.0.0.1` to `239.255.255.254`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            return transitRouteTableAggregationCidr(Output.of(transitRouteTableAggregationCidr));
        }

        /**
         * @param transitRouteTableAggregationDescription The description of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationDescription(@Nullable Output<String> transitRouteTableAggregationDescription) {
            $.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
            return this;
        }

        /**
         * @param transitRouteTableAggregationDescription The description of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
            return transitRouteTableAggregationDescription(Output.of(transitRouteTableAggregationDescription));
        }

        /**
         * @param transitRouteTableAggregationName The name of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationName(@Nullable Output<String> transitRouteTableAggregationName) {
            $.transitRouteTableAggregationName = transitRouteTableAggregationName;
            return this;
        }

        /**
         * @param transitRouteTableAggregationName The name of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationName(String transitRouteTableAggregationName) {
            return transitRouteTableAggregationName(Output.of(transitRouteTableAggregationName));
        }

        /**
         * @param transitRouteTableAggregationScope The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationScope(@Nullable Output<String> transitRouteTableAggregationScope) {
            $.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
            return this;
        }

        /**
         * @param transitRouteTableAggregationScope The scope of networks that you want to advertise the aggregate route. Valid Value: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
            return transitRouteTableAggregationScope(Output.of(transitRouteTableAggregationScope));
        }

        /**
         * @param transitRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableId(@Nullable Output<String> transitRouteTableId) {
            $.transitRouteTableId = transitRouteTableId;
            return this;
        }

        /**
         * @param transitRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            return transitRouteTableId(Output.of(transitRouteTableId));
        }

        public TransitRouteTableAggregationState build() {
            return $;
        }
    }

}
