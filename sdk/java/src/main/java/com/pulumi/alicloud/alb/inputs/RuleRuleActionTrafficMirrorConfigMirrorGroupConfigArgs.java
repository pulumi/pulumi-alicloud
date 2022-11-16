// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.alicloud.alb.inputs.RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs Empty = new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs();

    /**
     * The destination server group to which requests are forwarded.
     * 
     */
    @Import(name="serverGroupTuples")
    private @Nullable Output<List<RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs>> serverGroupTuples;

    /**
     * @return The destination server group to which requests are forwarded.
     * 
     */
    public Optional<Output<List<RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs>>> serverGroupTuples() {
        return Optional.ofNullable(this.serverGroupTuples);
    }

    private RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs() {}

    private RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs $) {
        this.serverGroupTuples = $.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs $;

        public Builder() {
            $ = new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs();
        }

        public Builder(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs defaults) {
            $ = new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverGroupTuples The destination server group to which requests are forwarded.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(@Nullable Output<List<RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs>> serverGroupTuples) {
            $.serverGroupTuples = serverGroupTuples;
            return this;
        }

        /**
         * @param serverGroupTuples The destination server group to which requests are forwarded.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(List<RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs> serverGroupTuples) {
            return serverGroupTuples(Output.of(serverGroupTuples));
        }

        /**
         * @param serverGroupTuples The destination server group to which requests are forwarded.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }

        public RuleRuleActionTrafficMirrorConfigMirrorGroupConfigArgs build() {
            return $;
        }
    }

}