// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.alicloud.emrv2.outputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTrigger;
import com.pulumi.alicloud.emrv2.outputs.ClusterNodeGroupAutoScalingPolicyScalingRuleTimeTrigger;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeGroupAutoScalingPolicyScalingRule {
    /**
     * @return The activity type of auto scaling policy. Valid values: `SCALE_OUT` and `SCALE_IN`.
     * 
     */
    private String activityType;
    /**
     * @return The adjustment type of auto scaling policy. Valid values: `CHANGE_IN_CAPACITY` and `EXACT_CAPACITY`.
     * 
     */
    private @Nullable String adjustmentType;
    /**
     * @return The adjustment value of auto scaling policy. The value should between 1 and 5000.
     * 
     */
    private Integer adjustmentValue;
    /**
     * @return The trigger metrics of scaling rules for emr node group auto scaling policy. See `metrics_trigger` below.
     * 
     */
    private @Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTrigger metricsTrigger;
    /**
     * @return The minimum adjustment value of auto scaling policy.
     * 
     */
    private @Nullable Integer minAdjustmentValue;
    /**
     * @return The rule name of auto scaling policy.
     * 
     */
    private String ruleName;
    /**
     * @return The trigger time of scaling rules for emr node group auto scaling policy. See `time_trigger` below.
     * 
     */
    private @Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleTimeTrigger timeTrigger;
    /**
     * @return The trigger type of auto scaling policy. Valid values: `TIME_TRIGGER` and `METRICS_TRIGGER`.
     * 
     */
    private String triggerType;

    private ClusterNodeGroupAutoScalingPolicyScalingRule() {}
    /**
     * @return The activity type of auto scaling policy. Valid values: `SCALE_OUT` and `SCALE_IN`.
     * 
     */
    public String activityType() {
        return this.activityType;
    }
    /**
     * @return The adjustment type of auto scaling policy. Valid values: `CHANGE_IN_CAPACITY` and `EXACT_CAPACITY`.
     * 
     */
    public Optional<String> adjustmentType() {
        return Optional.ofNullable(this.adjustmentType);
    }
    /**
     * @return The adjustment value of auto scaling policy. The value should between 1 and 5000.
     * 
     */
    public Integer adjustmentValue() {
        return this.adjustmentValue;
    }
    /**
     * @return The trigger metrics of scaling rules for emr node group auto scaling policy. See `metrics_trigger` below.
     * 
     */
    public Optional<ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTrigger> metricsTrigger() {
        return Optional.ofNullable(this.metricsTrigger);
    }
    /**
     * @return The minimum adjustment value of auto scaling policy.
     * 
     */
    public Optional<Integer> minAdjustmentValue() {
        return Optional.ofNullable(this.minAdjustmentValue);
    }
    /**
     * @return The rule name of auto scaling policy.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }
    /**
     * @return The trigger time of scaling rules for emr node group auto scaling policy. See `time_trigger` below.
     * 
     */
    public Optional<ClusterNodeGroupAutoScalingPolicyScalingRuleTimeTrigger> timeTrigger() {
        return Optional.ofNullable(this.timeTrigger);
    }
    /**
     * @return The trigger type of auto scaling policy. Valid values: `TIME_TRIGGER` and `METRICS_TRIGGER`.
     * 
     */
    public String triggerType() {
        return this.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupAutoScalingPolicyScalingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activityType;
        private @Nullable String adjustmentType;
        private Integer adjustmentValue;
        private @Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTrigger metricsTrigger;
        private @Nullable Integer minAdjustmentValue;
        private String ruleName;
        private @Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleTimeTrigger timeTrigger;
        private String triggerType;
        public Builder() {}
        public Builder(ClusterNodeGroupAutoScalingPolicyScalingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityType = defaults.activityType;
    	      this.adjustmentType = defaults.adjustmentType;
    	      this.adjustmentValue = defaults.adjustmentValue;
    	      this.metricsTrigger = defaults.metricsTrigger;
    	      this.minAdjustmentValue = defaults.minAdjustmentValue;
    	      this.ruleName = defaults.ruleName;
    	      this.timeTrigger = defaults.timeTrigger;
    	      this.triggerType = defaults.triggerType;
        }

        @CustomType.Setter
        public Builder activityType(String activityType) {
            if (activityType == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAutoScalingPolicyScalingRule", "activityType");
            }
            this.activityType = activityType;
            return this;
        }
        @CustomType.Setter
        public Builder adjustmentType(@Nullable String adjustmentType) {

            this.adjustmentType = adjustmentType;
            return this;
        }
        @CustomType.Setter
        public Builder adjustmentValue(Integer adjustmentValue) {
            if (adjustmentValue == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAutoScalingPolicyScalingRule", "adjustmentValue");
            }
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        @CustomType.Setter
        public Builder metricsTrigger(@Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTrigger metricsTrigger) {

            this.metricsTrigger = metricsTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder minAdjustmentValue(@Nullable Integer minAdjustmentValue) {

            this.minAdjustmentValue = minAdjustmentValue;
            return this;
        }
        @CustomType.Setter
        public Builder ruleName(String ruleName) {
            if (ruleName == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAutoScalingPolicyScalingRule", "ruleName");
            }
            this.ruleName = ruleName;
            return this;
        }
        @CustomType.Setter
        public Builder timeTrigger(@Nullable ClusterNodeGroupAutoScalingPolicyScalingRuleTimeTrigger timeTrigger) {

            this.timeTrigger = timeTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder triggerType(String triggerType) {
            if (triggerType == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAutoScalingPolicyScalingRule", "triggerType");
            }
            this.triggerType = triggerType;
            return this;
        }
        public ClusterNodeGroupAutoScalingPolicyScalingRule build() {
            final var _resultValue = new ClusterNodeGroupAutoScalingPolicyScalingRule();
            _resultValue.activityType = activityType;
            _resultValue.adjustmentType = adjustmentType;
            _resultValue.adjustmentValue = adjustmentValue;
            _resultValue.metricsTrigger = metricsTrigger;
            _resultValue.minAdjustmentValue = minAdjustmentValue;
            _resultValue.ruleName = ruleName;
            _resultValue.timeTrigger = timeTrigger;
            _resultValue.triggerType = triggerType;
            return _resultValue;
        }
    }
}