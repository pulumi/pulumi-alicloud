// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiJobTableMappingTransformationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiJobTableMappingTransformationRuleArgs Empty = new DiJobTableMappingTransformationRuleArgs();

    /**
     * Action type, optional enumeration value:
     * 
     * DefinePrimaryKey (defines the primary key)
     * 
     * Rename
     * 
     * AddColumn (increase column)
     * 
     * HandleDml(DML handling)
     * 
     * DefineIncrementalCondition
     * 
     */
    @Import(name="ruleActionType")
    private @Nullable Output<String> ruleActionType;

    /**
     * @return Action type, optional enumeration value:
     * 
     * DefinePrimaryKey (defines the primary key)
     * 
     * Rename
     * 
     * AddColumn (increase column)
     * 
     * HandleDml(DML handling)
     * 
     * DefineIncrementalCondition
     * 
     */
    public Optional<Output<String>> ruleActionType() {
        return Optional.ofNullable(this.ruleActionType);
    }

    /**
     * Rule Name
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule Name
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * Target type of action, optional enumeration value:
     * 
     * Table (Table)
     * 
     * Schema(schema)
     * 
     */
    @Import(name="ruleTargetType")
    private @Nullable Output<String> ruleTargetType;

    /**
     * @return Target type of action, optional enumeration value:
     * 
     * Table (Table)
     * 
     * Schema(schema)
     * 
     */
    public Optional<Output<String>> ruleTargetType() {
        return Optional.ofNullable(this.ruleTargetType);
    }

    private DiJobTableMappingTransformationRuleArgs() {}

    private DiJobTableMappingTransformationRuleArgs(DiJobTableMappingTransformationRuleArgs $) {
        this.ruleActionType = $.ruleActionType;
        this.ruleName = $.ruleName;
        this.ruleTargetType = $.ruleTargetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiJobTableMappingTransformationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiJobTableMappingTransformationRuleArgs $;

        public Builder() {
            $ = new DiJobTableMappingTransformationRuleArgs();
        }

        public Builder(DiJobTableMappingTransformationRuleArgs defaults) {
            $ = new DiJobTableMappingTransformationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleActionType Action type, optional enumeration value:
         * 
         * DefinePrimaryKey (defines the primary key)
         * 
         * Rename
         * 
         * AddColumn (increase column)
         * 
         * HandleDml(DML handling)
         * 
         * DefineIncrementalCondition
         * 
         * @return builder
         * 
         */
        public Builder ruleActionType(@Nullable Output<String> ruleActionType) {
            $.ruleActionType = ruleActionType;
            return this;
        }

        /**
         * @param ruleActionType Action type, optional enumeration value:
         * 
         * DefinePrimaryKey (defines the primary key)
         * 
         * Rename
         * 
         * AddColumn (increase column)
         * 
         * HandleDml(DML handling)
         * 
         * DefineIncrementalCondition
         * 
         * @return builder
         * 
         */
        public Builder ruleActionType(String ruleActionType) {
            return ruleActionType(Output.of(ruleActionType));
        }

        /**
         * @param ruleName Rule Name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule Name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param ruleTargetType Target type of action, optional enumeration value:
         * 
         * Table (Table)
         * 
         * Schema(schema)
         * 
         * @return builder
         * 
         */
        public Builder ruleTargetType(@Nullable Output<String> ruleTargetType) {
            $.ruleTargetType = ruleTargetType;
            return this;
        }

        /**
         * @param ruleTargetType Target type of action, optional enumeration value:
         * 
         * Table (Table)
         * 
         * Schema(schema)
         * 
         * @return builder
         * 
         */
        public Builder ruleTargetType(String ruleTargetType) {
            return ruleTargetType(Output.of(ruleTargetType));
        }

        public DiJobTableMappingTransformationRuleArgs build() {
            return $;
        }
    }

}
