// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric {
    /**
     * @return The current value.
     * 
     */
    private final Integer currentValue;
    /**
     * @return The name of the trigger condition.
     * 
     */
    private final String name;
    /**
     * @return The metric type. Associated with monitoring indicators.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric(
        @CustomType.Parameter("currentValue") Integer currentValue,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.currentValue = currentValue;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The current value.
     * 
     */
    public Integer currentValue() {
        return this.currentValue;
    }
    /**
     * @return The name of the trigger condition.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The metric type. Associated with monitoring indicators.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer currentValue;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentValue = defaults.currentValue;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder currentValue(Integer currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric build() {
            return new GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric(currentValue, name, type);
        }
    }
}