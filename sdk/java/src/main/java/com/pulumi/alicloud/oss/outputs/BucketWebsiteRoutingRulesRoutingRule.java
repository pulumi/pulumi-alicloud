// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.BucketWebsiteRoutingRulesRoutingRuleCondition;
import com.pulumi.alicloud.oss.outputs.BucketWebsiteRoutingRulesRoutingRuleLuaConfig;
import com.pulumi.alicloud.oss.outputs.BucketWebsiteRoutingRulesRoutingRuleRedirect;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsiteRoutingRulesRoutingRule {
    /**
     * @return Save the criteria that the rule needs to match. See `condition` below.
     * 
     */
    private @Nullable BucketWebsiteRoutingRulesRoutingRuleCondition condition;
    /**
     * @return The Lua script configuration to be executed. See `lua_config` below.
     * 
     */
    private @Nullable BucketWebsiteRoutingRulesRoutingRuleLuaConfig luaConfig;
    /**
     * @return Specifies the action to perform after this rule is matched. See `redirect` below.
     * 
     */
    private @Nullable BucketWebsiteRoutingRulesRoutingRuleRedirect redirect;
    /**
     * @return The sequence number of the matching and executing jump rules. OSS matches rules according to this sequence number. If the match is successful, the rule is executed and subsequent rules are not executed.
     * 
     */
    private @Nullable Integer ruleNumber;

    private BucketWebsiteRoutingRulesRoutingRule() {}
    /**
     * @return Save the criteria that the rule needs to match. See `condition` below.
     * 
     */
    public Optional<BucketWebsiteRoutingRulesRoutingRuleCondition> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The Lua script configuration to be executed. See `lua_config` below.
     * 
     */
    public Optional<BucketWebsiteRoutingRulesRoutingRuleLuaConfig> luaConfig() {
        return Optional.ofNullable(this.luaConfig);
    }
    /**
     * @return Specifies the action to perform after this rule is matched. See `redirect` below.
     * 
     */
    public Optional<BucketWebsiteRoutingRulesRoutingRuleRedirect> redirect() {
        return Optional.ofNullable(this.redirect);
    }
    /**
     * @return The sequence number of the matching and executing jump rules. OSS matches rules according to this sequence number. If the match is successful, the rule is executed and subsequent rules are not executed.
     * 
     */
    public Optional<Integer> ruleNumber() {
        return Optional.ofNullable(this.ruleNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteRoutingRulesRoutingRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BucketWebsiteRoutingRulesRoutingRuleCondition condition;
        private @Nullable BucketWebsiteRoutingRulesRoutingRuleLuaConfig luaConfig;
        private @Nullable BucketWebsiteRoutingRulesRoutingRuleRedirect redirect;
        private @Nullable Integer ruleNumber;
        public Builder() {}
        public Builder(BucketWebsiteRoutingRulesRoutingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.luaConfig = defaults.luaConfig;
    	      this.redirect = defaults.redirect;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        @CustomType.Setter
        public Builder condition(@Nullable BucketWebsiteRoutingRulesRoutingRuleCondition condition) {

            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder luaConfig(@Nullable BucketWebsiteRoutingRulesRoutingRuleLuaConfig luaConfig) {

            this.luaConfig = luaConfig;
            return this;
        }
        @CustomType.Setter
        public Builder redirect(@Nullable BucketWebsiteRoutingRulesRoutingRuleRedirect redirect) {

            this.redirect = redirect;
            return this;
        }
        @CustomType.Setter
        public Builder ruleNumber(@Nullable Integer ruleNumber) {

            this.ruleNumber = ruleNumber;
            return this;
        }
        public BucketWebsiteRoutingRulesRoutingRule build() {
            final var _resultValue = new BucketWebsiteRoutingRulesRoutingRule();
            _resultValue.condition = condition;
            _resultValue.luaConfig = luaConfig;
            _resultValue.redirect = redirect;
            _resultValue.ruleNumber = ruleNumber;
            return _resultValue;
        }
    }
}