// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AScriptExtAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AScriptExtAttributeArgs Empty = new AScriptExtAttributeArgs();

    /**
     * The key of the extended attribute.
     * 
     */
    @Import(name="attributeKey")
    private @Nullable Output<String> attributeKey;

    /**
     * @return The key of the extended attribute.
     * 
     */
    public Optional<Output<String>> attributeKey() {
        return Optional.ofNullable(this.attributeKey);
    }

    /**
     * The value of the extended attribute.
     * 
     */
    @Import(name="attributeValue")
    private @Nullable Output<String> attributeValue;

    /**
     * @return The value of the extended attribute.
     * 
     */
    public Optional<Output<String>> attributeValue() {
        return Optional.ofNullable(this.attributeValue);
    }

    private AScriptExtAttributeArgs() {}

    private AScriptExtAttributeArgs(AScriptExtAttributeArgs $) {
        this.attributeKey = $.attributeKey;
        this.attributeValue = $.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AScriptExtAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AScriptExtAttributeArgs $;

        public Builder() {
            $ = new AScriptExtAttributeArgs();
        }

        public Builder(AScriptExtAttributeArgs defaults) {
            $ = new AScriptExtAttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributeKey The key of the extended attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeKey(@Nullable Output<String> attributeKey) {
            $.attributeKey = attributeKey;
            return this;
        }

        /**
         * @param attributeKey The key of the extended attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeKey(String attributeKey) {
            return attributeKey(Output.of(attributeKey));
        }

        /**
         * @param attributeValue The value of the extended attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(@Nullable Output<String> attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        /**
         * @param attributeValue The value of the extended attribute.
         * 
         * @return builder
         * 
         */
        public Builder attributeValue(String attributeValue) {
            return attributeValue(Output.of(attributeValue));
        }

        public AScriptExtAttributeArgs build() {
            return $;
        }
    }

}