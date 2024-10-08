// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomRoutingEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final CustomRoutingEndpointState Empty = new CustomRoutingEndpointState();

    /**
     * The ID of the GA instance with which the endpoint is associated.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the GA instance with which the endpoint is associated.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
    }

    /**
     * The ID of the Custom Routing Endpoint.
     * 
     */
    @Import(name="customRoutingEndpointId")
    private @Nullable Output<String> customRoutingEndpointId;

    /**
     * @return The ID of the Custom Routing Endpoint.
     * 
     */
    public Optional<Output<String>> customRoutingEndpointId() {
        return Optional.ofNullable(this.customRoutingEndpointId);
    }

    /**
     * The ID of the endpoint (vSwitch).
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The ID of the endpoint (vSwitch).
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The ID of the endpoint group in which to create endpoints.
     * 
     */
    @Import(name="endpointGroupId")
    private @Nullable Output<String> endpointGroupId;

    /**
     * @return The ID of the endpoint group in which to create endpoints.
     * 
     */
    public Optional<Output<String>> endpointGroupId() {
        return Optional.ofNullable(this.endpointGroupId);
    }

    /**
     * The ID of the listener with which the endpoint is associated.
     * 
     */
    @Import(name="listenerId")
    private @Nullable Output<String> listenerId;

    /**
     * @return The ID of the listener with which the endpoint is associated.
     * 
     */
    public Optional<Output<String>> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * The status of the Custom Routing Endpoint.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Custom Routing Endpoint.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
     * - `DenyAll`: denies all traffic to the endpoint.
     * - `AllowAll`: allows all traffic to the endpoint.
     * - `AllowCustom`: allows traffic only to specified destinations in the endpoint.
     * 
     */
    @Import(name="trafficToEndpointPolicy")
    private @Nullable Output<String> trafficToEndpointPolicy;

    /**
     * @return The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
     * - `DenyAll`: denies all traffic to the endpoint.
     * - `AllowAll`: allows all traffic to the endpoint.
     * - `AllowCustom`: allows traffic only to specified destinations in the endpoint.
     * 
     */
    public Optional<Output<String>> trafficToEndpointPolicy() {
        return Optional.ofNullable(this.trafficToEndpointPolicy);
    }

    /**
     * The backend service type of the endpoint. Valid values: `PrivateSubNet`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The backend service type of the endpoint. Valid values: `PrivateSubNet`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CustomRoutingEndpointState() {}

    private CustomRoutingEndpointState(CustomRoutingEndpointState $) {
        this.acceleratorId = $.acceleratorId;
        this.customRoutingEndpointId = $.customRoutingEndpointId;
        this.endpoint = $.endpoint;
        this.endpointGroupId = $.endpointGroupId;
        this.listenerId = $.listenerId;
        this.status = $.status;
        this.trafficToEndpointPolicy = $.trafficToEndpointPolicy;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomRoutingEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomRoutingEndpointState $;

        public Builder() {
            $ = new CustomRoutingEndpointState();
        }

        public Builder(CustomRoutingEndpointState defaults) {
            $ = new CustomRoutingEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the GA instance with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the GA instance with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param customRoutingEndpointId The ID of the Custom Routing Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder customRoutingEndpointId(@Nullable Output<String> customRoutingEndpointId) {
            $.customRoutingEndpointId = customRoutingEndpointId;
            return this;
        }

        /**
         * @param customRoutingEndpointId The ID of the Custom Routing Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder customRoutingEndpointId(String customRoutingEndpointId) {
            return customRoutingEndpointId(Output.of(customRoutingEndpointId));
        }

        /**
         * @param endpoint The ID of the endpoint (vSwitch).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The ID of the endpoint (vSwitch).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param endpointGroupId The ID of the endpoint group in which to create endpoints.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupId(@Nullable Output<String> endpointGroupId) {
            $.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * @param endpointGroupId The ID of the endpoint group in which to create endpoints.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupId(String endpointGroupId) {
            return endpointGroupId(Output.of(endpointGroupId));
        }

        /**
         * @param listenerId The ID of the listener with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable Output<String> listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param listenerId The ID of the listener with which the endpoint is associated.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            return listenerId(Output.of(listenerId));
        }

        /**
         * @param status The status of the Custom Routing Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Custom Routing Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param trafficToEndpointPolicy The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
         * - `DenyAll`: denies all traffic to the endpoint.
         * - `AllowAll`: allows all traffic to the endpoint.
         * - `AllowCustom`: allows traffic only to specified destinations in the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder trafficToEndpointPolicy(@Nullable Output<String> trafficToEndpointPolicy) {
            $.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }

        /**
         * @param trafficToEndpointPolicy The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
         * - `DenyAll`: denies all traffic to the endpoint.
         * - `AllowAll`: allows all traffic to the endpoint.
         * - `AllowCustom`: allows traffic only to specified destinations in the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder trafficToEndpointPolicy(String trafficToEndpointPolicy) {
            return trafficToEndpointPolicy(Output.of(trafficToEndpointPolicy));
        }

        /**
         * @param type The backend service type of the endpoint. Valid values: `PrivateSubNet`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The backend service type of the endpoint. Valid values: `PrivateSubNet`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomRoutingEndpointState build() {
            return $;
        }
    }

}
