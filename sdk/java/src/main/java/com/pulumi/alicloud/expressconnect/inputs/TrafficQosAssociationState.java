// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficQosAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final TrafficQosAssociationState Empty = new TrafficQosAssociationState();

    /**
     * The ID of the associated instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the associated instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The type of the associated instance. Value: **physical connection** physical connection.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The type of the associated instance. Value: **physical connection** physical connection.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The QoS policy ID.
     * 
     */
    @Import(name="qosId")
    private @Nullable Output<String> qosId;

    /**
     * @return The QoS policy ID.
     * 
     */
    public Optional<Output<String>> qosId() {
        return Optional.ofNullable(this.qosId);
    }

    /**
     * The status of the associated instance. Value:
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the associated instance. Value:
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private TrafficQosAssociationState() {}

    private TrafficQosAssociationState(TrafficQosAssociationState $) {
        this.instanceId = $.instanceId;
        this.instanceType = $.instanceType;
        this.qosId = $.qosId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficQosAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficQosAssociationState $;

        public Builder() {
            $ = new TrafficQosAssociationState();
        }

        public Builder(TrafficQosAssociationState defaults) {
            $ = new TrafficQosAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The ID of the associated instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the associated instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceType The type of the associated instance. Value: **physical connection** physical connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The type of the associated instance. Value: **physical connection** physical connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param qosId The QoS policy ID.
         * 
         * @return builder
         * 
         */
        public Builder qosId(@Nullable Output<String> qosId) {
            $.qosId = qosId;
            return this;
        }

        /**
         * @param qosId The QoS policy ID.
         * 
         * @return builder
         * 
         */
        public Builder qosId(String qosId) {
            return qosId(Output.of(qosId));
        }

        /**
         * @param status The status of the associated instance. Value:
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the associated instance. Value:
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public TrafficQosAssociationState build() {
            return $;
        }
    }

}