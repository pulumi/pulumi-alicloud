// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.alicloud.hbr.inputs.PolicyRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The policy description.
     * 
     */
    @Import(name="policyDescription")
    private @Nullable Output<String> policyDescription;

    /**
     * @return The policy description.
     * 
     */
    public Optional<Output<String>> policyDescription() {
        return Optional.ofNullable(this.policyDescription);
    }

    /**
     * Policy Name
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Policy Name
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * A list of policy rules See `rules` below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<PolicyRuleArgs>> rules;

    /**
     * @return A list of policy rules See `rules` below.
     * 
     */
    public Optional<Output<List<PolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.policyDescription = $.policyDescription;
        this.policyName = $.policyName;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyDescription The policy description.
         * 
         * @return builder
         * 
         */
        public Builder policyDescription(@Nullable Output<String> policyDescription) {
            $.policyDescription = policyDescription;
            return this;
        }

        /**
         * @param policyDescription The policy description.
         * 
         * @return builder
         * 
         */
        public Builder policyDescription(String policyDescription) {
            return policyDescription(Output.of(policyDescription));
        }

        /**
         * @param policyName Policy Name
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Policy Name
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param rules A list of policy rules See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<PolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of policy rules See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<PolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of policy rules See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(PolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public PolicyArgs build() {
            return $;
        }
    }

}
