// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationScalingRulesRuleScalingRuleTimerSchedule {
    /**
     * @return Time point. Format: `hours:minutes`.
     * 
     */
    private final String atTime;
    /**
     * @return The maximum number of instances.
     * 
     */
    private final Integer maxReplicas;
    /**
     * @return The minimum number of instances.
     * 
     */
    private final Integer minReplicas;
    /**
     * @return The number of target instances.
     * 
     */
    private final Integer targetReplicas;

    @CustomType.Constructor
    private GetApplicationScalingRulesRuleScalingRuleTimerSchedule(
        @CustomType.Parameter("atTime") String atTime,
        @CustomType.Parameter("maxReplicas") Integer maxReplicas,
        @CustomType.Parameter("minReplicas") Integer minReplicas,
        @CustomType.Parameter("targetReplicas") Integer targetReplicas) {
        this.atTime = atTime;
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.targetReplicas = targetReplicas;
    }

    /**
     * @return Time point. Format: `hours:minutes`.
     * 
     */
    public String atTime() {
        return this.atTime;
    }
    /**
     * @return The maximum number of instances.
     * 
     */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }
    /**
     * @return The minimum number of instances.
     * 
     */
    public Integer minReplicas() {
        return this.minReplicas;
    }
    /**
     * @return The number of target instances.
     * 
     */
    public Integer targetReplicas() {
        return this.targetReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesRuleScalingRuleTimerSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String atTime;
        private Integer maxReplicas;
        private Integer minReplicas;
        private Integer targetReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScalingRulesRuleScalingRuleTimerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atTime = defaults.atTime;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.targetReplicas = defaults.targetReplicas;
        }

        public Builder atTime(String atTime) {
            this.atTime = Objects.requireNonNull(atTime);
            return this;
        }
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }
        public Builder targetReplicas(Integer targetReplicas) {
            this.targetReplicas = Objects.requireNonNull(targetReplicas);
            return this;
        }        public GetApplicationScalingRulesRuleScalingRuleTimerSchedule build() {
            return new GetApplicationScalingRulesRuleScalingRuleTimerSchedule(atTime, maxReplicas, minReplicas, targetReplicas);
        }
    }
}