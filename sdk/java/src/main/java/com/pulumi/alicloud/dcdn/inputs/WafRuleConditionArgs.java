// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WafRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WafRuleConditionArgs Empty = new WafRuleConditionArgs();

    /**
     * The match field.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The match field.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The logical symbol.
     * 
     */
    @Import(name="opValue", required=true)
    private Output<String> opValue;

    /**
     * @return The logical symbol.
     * 
     */
    public Output<String> opValue() {
        return this.opValue;
    }

    /**
     * The match subfield.
     * 
     */
    @Import(name="subKey")
    private @Nullable Output<String> subKey;

    /**
     * @return The match subfield.
     * 
     */
    public Optional<Output<String>> subKey() {
        return Optional.ofNullable(this.subKey);
    }

    /**
     * The match content. Separate multiple values with commas (,).
     * 
     */
    @Import(name="values")
    private @Nullable Output<String> values;

    /**
     * @return The match content. Separate multiple values with commas (,).
     * 
     */
    public Optional<Output<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private WafRuleConditionArgs() {}

    private WafRuleConditionArgs(WafRuleConditionArgs $) {
        this.key = $.key;
        this.opValue = $.opValue;
        this.subKey = $.subKey;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WafRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WafRuleConditionArgs $;

        public Builder() {
            $ = new WafRuleConditionArgs();
        }

        public Builder(WafRuleConditionArgs defaults) {
            $ = new WafRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The match field.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The match field.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param opValue The logical symbol.
         * 
         * @return builder
         * 
         */
        public Builder opValue(Output<String> opValue) {
            $.opValue = opValue;
            return this;
        }

        /**
         * @param opValue The logical symbol.
         * 
         * @return builder
         * 
         */
        public Builder opValue(String opValue) {
            return opValue(Output.of(opValue));
        }

        /**
         * @param subKey The match subfield.
         * 
         * @return builder
         * 
         */
        public Builder subKey(@Nullable Output<String> subKey) {
            $.subKey = subKey;
            return this;
        }

        /**
         * @param subKey The match subfield.
         * 
         * @return builder
         * 
         */
        public Builder subKey(String subKey) {
            return subKey(Output.of(subKey));
        }

        /**
         * @param values The match content. Separate multiple values with commas (,).
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The match content. Separate multiple values with commas (,).
         * 
         * @return builder
         * 
         */
        public Builder values(String values) {
            return values(Output.of(values));
        }

        public WafRuleConditionArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("WafRuleConditionArgs", "key");
            }
            if ($.opValue == null) {
                throw new MissingRequiredPropertyException("WafRuleConditionArgs", "opValue");
            }
            return $;
        }
    }

}