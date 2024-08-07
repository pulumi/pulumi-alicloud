// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionRemoveHeaderConfig {
    private @Nullable String key;

    private RuleRuleActionRemoveHeaderConfig() {}
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionRemoveHeaderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        public Builder() {}
        public Builder(RuleRuleActionRemoveHeaderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        public RuleRuleActionRemoveHeaderConfig build() {
            final var _resultValue = new RuleRuleActionRemoveHeaderConfig();
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
