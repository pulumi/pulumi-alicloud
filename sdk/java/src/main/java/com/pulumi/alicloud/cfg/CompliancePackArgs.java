// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg;

import com.pulumi.alicloud.cfg.inputs.CompliancePackConfigRuleArgs;
import com.pulumi.alicloud.cfg.inputs.CompliancePackConfigRuleIdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompliancePackArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompliancePackArgs Empty = new CompliancePackArgs();

    /**
     * The Compliance Package Name. **NOTE:** From version 1.146.0, `compliance_pack_name` can be modified.
     * 
     */
    @Import(name="compliancePackName", required=true)
    private Output<String> compliancePackName;

    /**
     * @return The Compliance Package Name. **NOTE:** From version 1.146.0, `compliance_pack_name` can be modified.
     * 
     */
    public Output<String> compliancePackName() {
        return this.compliancePackName;
    }

    /**
     * Compliance Package Template Id.
     * 
     */
    @Import(name="compliancePackTemplateId")
    private @Nullable Output<String> compliancePackTemplateId;

    /**
     * @return Compliance Package Template Id.
     * 
     */
    public Optional<Output<String>> compliancePackTemplateId() {
        return Optional.ofNullable(this.compliancePackTemplateId);
    }

    /**
     * A list of Config Rule IDs. See `config_rule_ids` below.
     * 
     */
    @Import(name="configRuleIds")
    private @Nullable Output<List<CompliancePackConfigRuleIdArgs>> configRuleIds;

    /**
     * @return A list of Config Rule IDs. See `config_rule_ids` below.
     * 
     */
    public Optional<Output<List<CompliancePackConfigRuleIdArgs>>> configRuleIds() {
        return Optional.ofNullable(this.configRuleIds);
    }

    /**
     * A list of Config Rules. See `config_rules` below. **NOTE:** Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
     * 
     * @deprecated
     * Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
     * 
     */
    @Deprecated /* Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead. */
    @Import(name="configRules")
    private @Nullable Output<List<CompliancePackConfigRuleArgs>> configRules;

    /**
     * @return A list of Config Rules. See `config_rules` below. **NOTE:** Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
     * 
     * @deprecated
     * Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
     * 
     */
    @Deprecated /* Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead. */
    public Optional<Output<List<CompliancePackConfigRuleArgs>>> configRules() {
        return Optional.ofNullable(this.configRules);
    }

    /**
     * The Description of compliance pack.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The Description of compliance pack.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The Risk Level. Valid values:
     * 
     */
    @Import(name="riskLevel", required=true)
    private Output<Integer> riskLevel;

    /**
     * @return The Risk Level. Valid values:
     * 
     */
    public Output<Integer> riskLevel() {
        return this.riskLevel;
    }

    private CompliancePackArgs() {}

    private CompliancePackArgs(CompliancePackArgs $) {
        this.compliancePackName = $.compliancePackName;
        this.compliancePackTemplateId = $.compliancePackTemplateId;
        this.configRuleIds = $.configRuleIds;
        this.configRules = $.configRules;
        this.description = $.description;
        this.riskLevel = $.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompliancePackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompliancePackArgs $;

        public Builder() {
            $ = new CompliancePackArgs();
        }

        public Builder(CompliancePackArgs defaults) {
            $ = new CompliancePackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compliancePackName The Compliance Package Name. **NOTE:** From version 1.146.0, `compliance_pack_name` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackName(Output<String> compliancePackName) {
            $.compliancePackName = compliancePackName;
            return this;
        }

        /**
         * @param compliancePackName The Compliance Package Name. **NOTE:** From version 1.146.0, `compliance_pack_name` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackName(String compliancePackName) {
            return compliancePackName(Output.of(compliancePackName));
        }

        /**
         * @param compliancePackTemplateId Compliance Package Template Id.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackTemplateId(@Nullable Output<String> compliancePackTemplateId) {
            $.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }

        /**
         * @param compliancePackTemplateId Compliance Package Template Id.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackTemplateId(String compliancePackTemplateId) {
            return compliancePackTemplateId(Output.of(compliancePackTemplateId));
        }

        /**
         * @param configRuleIds A list of Config Rule IDs. See `config_rule_ids` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(@Nullable Output<List<CompliancePackConfigRuleIdArgs>> configRuleIds) {
            $.configRuleIds = configRuleIds;
            return this;
        }

        /**
         * @param configRuleIds A list of Config Rule IDs. See `config_rule_ids` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(List<CompliancePackConfigRuleIdArgs> configRuleIds) {
            return configRuleIds(Output.of(configRuleIds));
        }

        /**
         * @param configRuleIds A list of Config Rule IDs. See `config_rule_ids` below.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(CompliancePackConfigRuleIdArgs... configRuleIds) {
            return configRuleIds(List.of(configRuleIds));
        }

        /**
         * @param configRules A list of Config Rules. See `config_rules` below. **NOTE:** Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         */
        @Deprecated /* Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead. */
        public Builder configRules(@Nullable Output<List<CompliancePackConfigRuleArgs>> configRules) {
            $.configRules = configRules;
            return this;
        }

        /**
         * @param configRules A list of Config Rules. See `config_rules` below. **NOTE:** Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         */
        @Deprecated /* Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead. */
        public Builder configRules(List<CompliancePackConfigRuleArgs> configRules) {
            return configRules(Output.of(configRules));
        }

        /**
         * @param configRules A list of Config Rules. See `config_rules` below. **NOTE:** Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead.
         * 
         */
        @Deprecated /* Field `config_rules` has been deprecated from provider version 1.141.0. New field `config_rule_ids` instead. */
        public Builder configRules(CompliancePackConfigRuleArgs... configRules) {
            return configRules(List.of(configRules));
        }

        /**
         * @param description The Description of compliance pack.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description of compliance pack.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param riskLevel The Risk Level. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Output<Integer> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel The Risk Level. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Integer riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        public CompliancePackArgs build() {
            if ($.compliancePackName == null) {
                throw new MissingRequiredPropertyException("CompliancePackArgs", "compliancePackName");
            }
            if ($.description == null) {
                throw new MissingRequiredPropertyException("CompliancePackArgs", "description");
            }
            if ($.riskLevel == null) {
                throw new MissingRequiredPropertyException("CompliancePackArgs", "riskLevel");
            }
            return $;
        }
    }

}