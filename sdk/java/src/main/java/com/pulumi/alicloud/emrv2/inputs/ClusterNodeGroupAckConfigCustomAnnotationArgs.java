// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodeGroupAckConfigCustomAnnotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeGroupAckConfigCustomAnnotationArgs Empty = new ClusterNodeGroupAckConfigCustomAnnotationArgs();

    /**
     * The tag key for this scaling rule specific metrics trigger.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The tag key for this scaling rule specific metrics trigger.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The tag value for this scaling rule specific metrics trigger.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The tag value for this scaling rule specific metrics trigger.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClusterNodeGroupAckConfigCustomAnnotationArgs() {}

    private ClusterNodeGroupAckConfigCustomAnnotationArgs(ClusterNodeGroupAckConfigCustomAnnotationArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeGroupAckConfigCustomAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeGroupAckConfigCustomAnnotationArgs $;

        public Builder() {
            $ = new ClusterNodeGroupAckConfigCustomAnnotationArgs();
        }

        public Builder(ClusterNodeGroupAckConfigCustomAnnotationArgs defaults) {
            $ = new ClusterNodeGroupAckConfigCustomAnnotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The tag key for this scaling rule specific metrics trigger.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The tag key for this scaling rule specific metrics trigger.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The tag value for this scaling rule specific metrics trigger.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The tag value for this scaling rule specific metrics trigger.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterNodeGroupAckConfigCustomAnnotationArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ClusterNodeGroupAckConfigCustomAnnotationArgs", "key");
            }
            return $;
        }
    }

}
