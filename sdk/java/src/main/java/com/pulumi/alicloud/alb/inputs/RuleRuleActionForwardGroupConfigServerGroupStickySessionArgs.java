// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs Empty = new RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs();

    /**
     * Whether to enable session persistence.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable session persistence.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs() {}

    private RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs(RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs $) {
        this.enabled = $.enabled;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs $;

        public Builder() {
            $ = new RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs();
        }

        public Builder(RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs defaults) {
            $ = new RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable session persistence.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable session persistence.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param timeout The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout period. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public RuleRuleActionForwardGroupConfigServerGroupStickySessionArgs build() {
            return $;
        }
    }

}
