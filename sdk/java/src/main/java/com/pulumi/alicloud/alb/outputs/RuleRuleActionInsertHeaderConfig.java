// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionInsertHeaderConfig {
    private @Nullable String key;
    private @Nullable String value;
    /**
     * @return The value type of the inserted header field. Valid values:
     * - `UserDefined`: a custom value
     * - `ReferenceHeader`: uses a field of the user request header.
     * - `SystemDefined`: a system value.
     * 
     */
    private @Nullable String valueType;

    private RuleRuleActionInsertHeaderConfig() {}
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return The value type of the inserted header field. Valid values:
     * - `UserDefined`: a custom value
     * - `ReferenceHeader`: uses a field of the user request header.
     * - `SystemDefined`: a system value.
     * 
     */
    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionInsertHeaderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;
        private @Nullable String valueType;
        public Builder() {}
        public Builder(RuleRuleActionInsertHeaderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueType(@Nullable String valueType) {

            this.valueType = valueType;
            return this;
        }
        public RuleRuleActionInsertHeaderConfig build() {
            final var _resultValue = new RuleRuleActionInsertHeaderConfig();
            _resultValue.key = key;
            _resultValue.value = value;
            _resultValue.valueType = valueType;
            return _resultValue;
        }
    }
}
