// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetForwardingRulesForwardingRuleRuleConditionHostConfig;
import com.pulumi.alicloud.ga.outputs.GetForwardingRulesForwardingRuleRuleConditionPathConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetForwardingRulesForwardingRuleRuleCondition {
    private List<GetForwardingRulesForwardingRuleRuleConditionHostConfig> hostConfigs;
    private List<GetForwardingRulesForwardingRuleRuleConditionPathConfig> pathConfigs;
    private String ruleConditionType;

    private GetForwardingRulesForwardingRuleRuleCondition() {}
    public List<GetForwardingRulesForwardingRuleRuleConditionHostConfig> hostConfigs() {
        return this.hostConfigs;
    }
    public List<GetForwardingRulesForwardingRuleRuleConditionPathConfig> pathConfigs() {
        return this.pathConfigs;
    }
    public String ruleConditionType() {
        return this.ruleConditionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRulesForwardingRuleRuleCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetForwardingRulesForwardingRuleRuleConditionHostConfig> hostConfigs;
        private List<GetForwardingRulesForwardingRuleRuleConditionPathConfig> pathConfigs;
        private String ruleConditionType;
        public Builder() {}
        public Builder(GetForwardingRulesForwardingRuleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostConfigs = defaults.hostConfigs;
    	      this.pathConfigs = defaults.pathConfigs;
    	      this.ruleConditionType = defaults.ruleConditionType;
        }

        @CustomType.Setter
        public Builder hostConfigs(List<GetForwardingRulesForwardingRuleRuleConditionHostConfig> hostConfigs) {
            if (hostConfigs == null) {
              throw new MissingRequiredPropertyException("GetForwardingRulesForwardingRuleRuleCondition", "hostConfigs");
            }
            this.hostConfigs = hostConfigs;
            return this;
        }
        public Builder hostConfigs(GetForwardingRulesForwardingRuleRuleConditionHostConfig... hostConfigs) {
            return hostConfigs(List.of(hostConfigs));
        }
        @CustomType.Setter
        public Builder pathConfigs(List<GetForwardingRulesForwardingRuleRuleConditionPathConfig> pathConfigs) {
            if (pathConfigs == null) {
              throw new MissingRequiredPropertyException("GetForwardingRulesForwardingRuleRuleCondition", "pathConfigs");
            }
            this.pathConfigs = pathConfigs;
            return this;
        }
        public Builder pathConfigs(GetForwardingRulesForwardingRuleRuleConditionPathConfig... pathConfigs) {
            return pathConfigs(List.of(pathConfigs));
        }
        @CustomType.Setter
        public Builder ruleConditionType(String ruleConditionType) {
            if (ruleConditionType == null) {
              throw new MissingRequiredPropertyException("GetForwardingRulesForwardingRuleRuleCondition", "ruleConditionType");
            }
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public GetForwardingRulesForwardingRuleRuleCondition build() {
            final var _resultValue = new GetForwardingRulesForwardingRuleRuleCondition();
            _resultValue.hostConfigs = hostConfigs;
            _resultValue.pathConfigs = pathConfigs;
            _resultValue.ruleConditionType = ruleConditionType;
            return _resultValue;
        }
    }
}