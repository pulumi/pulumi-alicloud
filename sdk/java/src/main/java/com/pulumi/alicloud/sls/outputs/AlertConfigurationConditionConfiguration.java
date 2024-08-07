// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertConfigurationConditionConfiguration {
    /**
     * @return Data matching expression. When the data content does not need to be determined, set it to an empty string. In other cases, it needs to be set as an expression, for example, errCnt&gt; 10.
     * 
     */
    private @Nullable String condition;
    /**
     * @return The number of pieces of data to determine the number of pieces of data to indicate how many pieces of data meet the conditions. If data exists, it is satisfied. Set it to an empty string. In other cases, it needs to be set as an expression, such as__count__&gt; 3.
     * 
     */
    private @Nullable String countCondition;

    private AlertConfigurationConditionConfiguration() {}
    /**
     * @return Data matching expression. When the data content does not need to be determined, set it to an empty string. In other cases, it needs to be set as an expression, for example, errCnt&gt; 10.
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The number of pieces of data to determine the number of pieces of data to indicate how many pieces of data meet the conditions. If data exists, it is satisfied. Set it to an empty string. In other cases, it needs to be set as an expression, such as__count__&gt; 3.
     * 
     */
    public Optional<String> countCondition() {
        return Optional.ofNullable(this.countCondition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConfigurationConditionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        private @Nullable String countCondition;
        public Builder() {}
        public Builder(AlertConfigurationConditionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.countCondition = defaults.countCondition;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {

            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder countCondition(@Nullable String countCondition) {

            this.countCondition = countCondition;
            return this;
        }
        public AlertConfigurationConditionConfiguration build() {
            final var _resultValue = new AlertConfigurationConditionConfiguration();
            _resultValue.condition = condition;
            _resultValue.countCondition = countCondition;
            return _resultValue;
        }
    }
}
