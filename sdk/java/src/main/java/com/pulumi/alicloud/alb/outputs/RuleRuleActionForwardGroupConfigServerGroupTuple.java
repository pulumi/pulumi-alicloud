// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionForwardGroupConfigServerGroupTuple {
    /**
     * @return The ID of the destination server group to which requests are forwarded.
     * 
     */
    private final @Nullable String serverGroupId;
    /**
     * @return The Weight of server group.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private RuleRuleActionForwardGroupConfigServerGroupTuple(
        @CustomType.Parameter("serverGroupId") @Nullable String serverGroupId,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.serverGroupId = serverGroupId;
        this.weight = weight;
    }

    /**
     * @return The ID of the destination server group to which requests are forwarded.
     * 
     */
    public Optional<String> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }
    /**
     * @return The Weight of server group.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionForwardGroupConfigServerGroupTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverGroupId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleRuleActionForwardGroupConfigServerGroupTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupId = defaults.serverGroupId;
    	      this.weight = defaults.weight;
        }

        public Builder serverGroupId(@Nullable String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public RuleRuleActionForwardGroupConfigServerGroupTuple build() {
            return new RuleRuleActionForwardGroupConfigServerGroupTuple(serverGroupId, weight);
        }
    }
}