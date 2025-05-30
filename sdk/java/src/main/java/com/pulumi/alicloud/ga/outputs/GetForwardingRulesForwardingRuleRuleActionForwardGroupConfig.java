// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig {
    /**
     * @return Terminal node group configuration.
     * 
     */
    private List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

    private GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig() {}
    /**
     * @return Terminal node group configuration.
     * 
     */
    public List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;
        public Builder() {}
        public Builder(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupTuples = defaults.serverGroupTuples;
        }

        @CustomType.Setter
        public Builder serverGroupTuples(List<GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {
            if (serverGroupTuples == null) {
              throw new MissingRequiredPropertyException("GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig", "serverGroupTuples");
            }
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public Builder serverGroupTuples(GetForwardingRulesForwardingRuleRuleActionForwardGroupConfigServerGroupTuple... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }
        public GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig build() {
            final var _resultValue = new GetForwardingRulesForwardingRuleRuleActionForwardGroupConfig();
            _resultValue.serverGroupTuples = serverGroupTuples;
            return _resultValue;
        }
    }
}
