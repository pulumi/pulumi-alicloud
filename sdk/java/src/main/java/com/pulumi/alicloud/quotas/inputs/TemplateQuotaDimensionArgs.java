// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateQuotaDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateQuotaDimensionArgs Empty = new TemplateQuotaDimensionArgs();

    /**
     * The Key of quota_dimensions.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The Key of quota_dimensions.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The Value of quota_dimensions.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The Value of quota_dimensions.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TemplateQuotaDimensionArgs() {}

    private TemplateQuotaDimensionArgs(TemplateQuotaDimensionArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateQuotaDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateQuotaDimensionArgs $;

        public Builder() {
            $ = new TemplateQuotaDimensionArgs();
        }

        public Builder(TemplateQuotaDimensionArgs defaults) {
            $ = new TemplateQuotaDimensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Key of quota_dimensions.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The Key of quota_dimensions.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The Value of quota_dimensions.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Value of quota_dimensions.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TemplateQuotaDimensionArgs build() {
            return $;
        }
    }

}