// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRuleRuleConditionPathConfig {
    /**
     * @return Add one or more IP addresses or IP address segments.
     * 
     */
    private List<String> values;

    private GetRulesRuleRuleConditionPathConfig() {}
    /**
     * @return Add one or more IP addresses or IP address segments.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleRuleConditionPathConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> values;
        public Builder() {}
        public Builder(GetRulesRuleRuleConditionPathConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetRulesRuleRuleConditionPathConfig", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetRulesRuleRuleConditionPathConfig build() {
            final var _resultValue = new GetRulesRuleRuleConditionPathConfig();
            _resultValue.values = values;
            return _resultValue;
        }
    }
}