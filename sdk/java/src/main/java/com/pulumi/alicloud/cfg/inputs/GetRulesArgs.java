// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesArgs Empty = new GetRulesArgs();

    /**
     * Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
     * 
     * @deprecated
     * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
    @Import(name="configRuleState")
    private @Nullable Output<String> configRuleState;

    /**
     * @return Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
     * 
     * @deprecated
     * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
    public Optional<Output<String>> configRuleState() {
        return Optional.ofNullable(this.configRuleState);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Config Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Config Rule IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by rule name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
     * 
     */
    @Import(name="riskLevel")
    private @Nullable Output<Integer> riskLevel;

    /**
     * @return The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
     * 
     */
    public Optional<Output<Integer>> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }

    /**
     * The name of config rule.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return The name of config rule.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetRulesArgs() {}

    private GetRulesArgs(GetRulesArgs $) {
        this.configRuleState = $.configRuleState;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.riskLevel = $.riskLevel;
        this.ruleName = $.ruleName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesArgs $;

        public Builder() {
            $ = new GetRulesArgs();
        }

        public Builder(GetRulesArgs defaults) {
            $ = new GetRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configRuleState Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
         * 
         */
        @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
        public Builder configRuleState(@Nullable Output<String> configRuleState) {
            $.configRuleState = configRuleState;
            return this;
        }

        /**
         * @param configRuleState Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
         * 
         */
        @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
        public Builder configRuleState(String configRuleState) {
            return configRuleState(Output.of(configRuleState));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param riskLevel The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(@Nullable Output<Integer> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Integer riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        /**
         * @param ruleName The name of config rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName The name of config rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param status The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetRulesArgs build() {
            return $;
        }
    }

}
