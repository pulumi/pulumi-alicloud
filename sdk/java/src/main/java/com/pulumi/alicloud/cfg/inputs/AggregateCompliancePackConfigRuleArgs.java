// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.alicloud.cfg.inputs.AggregateCompliancePackConfigRuleConfigRuleParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AggregateCompliancePackConfigRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AggregateCompliancePackConfigRuleArgs Empty = new AggregateCompliancePackConfigRuleArgs();

    /**
     * A list of parameter rules. See `config_rule_parameters` below.
     * 
     */
    @Import(name="configRuleParameters")
    private @Nullable Output<List<AggregateCompliancePackConfigRuleConfigRuleParameterArgs>> configRuleParameters;

    /**
     * @return A list of parameter rules. See `config_rule_parameters` below.
     * 
     */
    public Optional<Output<List<AggregateCompliancePackConfigRuleConfigRuleParameterArgs>>> configRuleParameters() {
        return Optional.ofNullable(this.configRuleParameters);
    }

    /**
     * The Managed Rule Identifier.
     * 
     */
    @Import(name="managedRuleIdentifier", required=true)
    private Output<String> managedRuleIdentifier;

    /**
     * @return The Managed Rule Identifier.
     * 
     */
    public Output<String> managedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

    private AggregateCompliancePackConfigRuleArgs() {}

    private AggregateCompliancePackConfigRuleArgs(AggregateCompliancePackConfigRuleArgs $) {
        this.configRuleParameters = $.configRuleParameters;
        this.managedRuleIdentifier = $.managedRuleIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AggregateCompliancePackConfigRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregateCompliancePackConfigRuleArgs $;

        public Builder() {
            $ = new AggregateCompliancePackConfigRuleArgs();
        }

        public Builder(AggregateCompliancePackConfigRuleArgs defaults) {
            $ = new AggregateCompliancePackConfigRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configRuleParameters A list of parameter rules. See `config_rule_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleParameters(@Nullable Output<List<AggregateCompliancePackConfigRuleConfigRuleParameterArgs>> configRuleParameters) {
            $.configRuleParameters = configRuleParameters;
            return this;
        }

        /**
         * @param configRuleParameters A list of parameter rules. See `config_rule_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleParameters(List<AggregateCompliancePackConfigRuleConfigRuleParameterArgs> configRuleParameters) {
            return configRuleParameters(Output.of(configRuleParameters));
        }

        /**
         * @param configRuleParameters A list of parameter rules. See `config_rule_parameters` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleParameters(AggregateCompliancePackConfigRuleConfigRuleParameterArgs... configRuleParameters) {
            return configRuleParameters(List.of(configRuleParameters));
        }

        /**
         * @param managedRuleIdentifier The Managed Rule Identifier.
         * 
         * @return builder
         * 
         */
        public Builder managedRuleIdentifier(Output<String> managedRuleIdentifier) {
            $.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }

        /**
         * @param managedRuleIdentifier The Managed Rule Identifier.
         * 
         * @return builder
         * 
         */
        public Builder managedRuleIdentifier(String managedRuleIdentifier) {
            return managedRuleIdentifier(Output.of(managedRuleIdentifier));
        }

        public AggregateCompliancePackConfigRuleArgs build() {
            if ($.managedRuleIdentifier == null) {
                throw new MissingRequiredPropertyException("AggregateCompliancePackConfigRuleArgs", "managedRuleIdentifier");
            }
            return $;
        }
    }

}