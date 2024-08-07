// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficQosAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficQosAssociationArgs Empty = new TrafficQosAssociationArgs();

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
    @Import(name="qosId", required=true)
    private Output<String> qosId;

    /**
     * @return The QoS policy ID.
     * 
     */
    public Output<String> qosId() {
        return this.qosId;
    }

    private TrafficQosAssociationArgs() {}

    private TrafficQosAssociationArgs(TrafficQosAssociationArgs $) {
        this.instanceId = $.instanceId;
        this.instanceType = $.instanceType;
        this.qosId = $.qosId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficQosAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficQosAssociationArgs $;

        public Builder() {
            $ = new TrafficQosAssociationArgs();
        }

        public Builder(TrafficQosAssociationArgs defaults) {
            $ = new TrafficQosAssociationArgs(Objects.requireNonNull(defaults));
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
        public Builder qosId(Output<String> qosId) {
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

        public TrafficQosAssociationArgs build() {
            if ($.qosId == null) {
                throw new MissingRequiredPropertyException("TrafficQosAssociationArgs", "qosId");
            }
            return $;
        }
    }

}
