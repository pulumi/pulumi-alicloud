// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomRoutingEndpointGroupState extends com.pulumi.resources.ResourceArgs {

    public static final CustomRoutingEndpointGroupState Empty = new CustomRoutingEndpointGroupState();

    /**
     * The ID of the GA instance.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the GA instance.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
    }

    /**
     * The name of the endpoint group.
     * 
     */
    @Import(name="customRoutingEndpointGroupName")
    private @Nullable Output<String> customRoutingEndpointGroupName;

    /**
     * @return The name of the endpoint group.
     * 
     */
    public Optional<Output<String>> customRoutingEndpointGroupName() {
        return Optional.ofNullable(this.customRoutingEndpointGroupName);
    }

    /**
     * The description of the endpoint group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the endpoint group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the region in which to create the endpoint group.
     * 
     */
    @Import(name="endpointGroupRegion")
    private @Nullable Output<String> endpointGroupRegion;

    /**
     * @return The ID of the region in which to create the endpoint group.
     * 
     */
    public Optional<Output<String>> endpointGroupRegion() {
        return Optional.ofNullable(this.endpointGroupRegion);
    }

    /**
     * The ID of the custom routing listener.
     * 
     */
    @Import(name="listenerId")
    private @Nullable Output<String> listenerId;

    /**
     * @return The ID of the custom routing listener.
     * 
     */
    public Optional<Output<String>> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * The status of the Custom Routing Endpoint Group.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Custom Routing Endpoint Group.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomRoutingEndpointGroupState() {}

    private CustomRoutingEndpointGroupState(CustomRoutingEndpointGroupState $) {
        this.acceleratorId = $.acceleratorId;
        this.customRoutingEndpointGroupName = $.customRoutingEndpointGroupName;
        this.description = $.description;
        this.endpointGroupRegion = $.endpointGroupRegion;
        this.listenerId = $.listenerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomRoutingEndpointGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomRoutingEndpointGroupState $;

        public Builder() {
            $ = new CustomRoutingEndpointGroupState();
        }

        public Builder(CustomRoutingEndpointGroupState defaults) {
            $ = new CustomRoutingEndpointGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the GA instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param customRoutingEndpointGroupName The name of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder customRoutingEndpointGroupName(@Nullable Output<String> customRoutingEndpointGroupName) {
            $.customRoutingEndpointGroupName = customRoutingEndpointGroupName;
            return this;
        }

        /**
         * @param customRoutingEndpointGroupName The name of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder customRoutingEndpointGroupName(String customRoutingEndpointGroupName) {
            return customRoutingEndpointGroupName(Output.of(customRoutingEndpointGroupName));
        }

        /**
         * @param description The description of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpointGroupRegion The ID of the region in which to create the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(@Nullable Output<String> endpointGroupRegion) {
            $.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * @param endpointGroupRegion The ID of the region in which to create the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            return endpointGroupRegion(Output.of(endpointGroupRegion));
        }

        /**
         * @param listenerId The ID of the custom routing listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable Output<String> listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param listenerId The ID of the custom routing listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            return listenerId(Output.of(listenerId));
        }

        /**
         * @param status The status of the Custom Routing Endpoint Group.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Custom Routing Endpoint Group.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public CustomRoutingEndpointGroupState build() {
            return $;
        }
    }

}