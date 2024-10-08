// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationAnnotationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationAnnotationArgs Empty = new AlertConfigurationAnnotationArgs();

    /**
     * Field name.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Field name.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Field value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Field value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AlertConfigurationAnnotationArgs() {}

    private AlertConfigurationAnnotationArgs(AlertConfigurationAnnotationArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConfigurationAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConfigurationAnnotationArgs $;

        public Builder() {
            $ = new AlertConfigurationAnnotationArgs();
        }

        public Builder(AlertConfigurationAnnotationArgs defaults) {
            $ = new AlertConfigurationAnnotationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Field name.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Field name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Field value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Field value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AlertConfigurationAnnotationArgs build() {
            return $;
        }
    }

}
