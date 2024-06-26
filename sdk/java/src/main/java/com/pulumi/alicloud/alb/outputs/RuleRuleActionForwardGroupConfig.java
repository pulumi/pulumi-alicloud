// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.RuleRuleActionForwardGroupConfigServerGroupStickySession;
import com.pulumi.alicloud.alb.outputs.RuleRuleActionForwardGroupConfigServerGroupTuple;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionForwardGroupConfig {
    private @Nullable RuleRuleActionForwardGroupConfigServerGroupStickySession serverGroupStickySession;
    private @Nullable List<RuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

    private RuleRuleActionForwardGroupConfig() {}
    public Optional<RuleRuleActionForwardGroupConfigServerGroupStickySession> serverGroupStickySession() {
        return Optional.ofNullable(this.serverGroupStickySession);
    }
    public List<RuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples() {
        return this.serverGroupTuples == null ? List.of() : this.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionForwardGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleRuleActionForwardGroupConfigServerGroupStickySession serverGroupStickySession;
        private @Nullable List<RuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples;
        public Builder() {}
        public Builder(RuleRuleActionForwardGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupStickySession = defaults.serverGroupStickySession;
    	      this.serverGroupTuples = defaults.serverGroupTuples;
        }

        @CustomType.Setter
        public Builder serverGroupStickySession(@Nullable RuleRuleActionForwardGroupConfigServerGroupStickySession serverGroupStickySession) {

            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        @CustomType.Setter
        public Builder serverGroupTuples(@Nullable List<RuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {

            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public Builder serverGroupTuples(RuleRuleActionForwardGroupConfigServerGroupTuple... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }
        public RuleRuleActionForwardGroupConfig build() {
            final var _resultValue = new RuleRuleActionForwardGroupConfig();
            _resultValue.serverGroupStickySession = serverGroupStickySession;
            _resultValue.serverGroupTuples = serverGroupTuples;
            return _resultValue;
        }
    }
}
