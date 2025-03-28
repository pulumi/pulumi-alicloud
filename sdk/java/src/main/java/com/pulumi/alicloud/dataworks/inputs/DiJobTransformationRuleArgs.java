// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiJobTransformationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiJobTransformationRuleArgs Empty = new DiJobTransformationRuleArgs();

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
     * Regular expression, in json string format.
     * 
     * Example renaming rule (Rename): {&#34;expression&#34;:&#34;${srcDatasourceName}_${srcDatabaseName}_0922&#34;,&#34;variables&#34;:[{&#34;variableName&#34;:&#34;srcDatabaseName&#34;,&#34;variableRules&#34;:[{&#34;from&#34;:&#34;fromdb&#34;,&#34;to&#34;:&#34;todb&#34;}]}]}
     * 
     */
    @Import(name="ruleExpression")
    private @Nullable Output<String> ruleExpression;

    /**
     * @return Regular expression, in json string format.
     * 
     * Example renaming rule (Rename): {&#34;expression&#34;:&#34;${srcDatasourceName}_${srcDatabaseName}_0922&#34;,&#34;variables&#34;:[{&#34;variableName&#34;:&#34;srcDatabaseName&#34;,&#34;variableRules&#34;:[{&#34;from&#34;:&#34;fromdb&#34;,&#34;to&#34;:&#34;todb&#34;}]}]}
     * 
     */
    public Optional<Output<String>> ruleExpression() {
        return Optional.ofNullable(this.ruleExpression);
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

    private DiJobTransformationRuleArgs() {}

    private DiJobTransformationRuleArgs(DiJobTransformationRuleArgs $) {
        this.ruleActionType = $.ruleActionType;
        this.ruleExpression = $.ruleExpression;
        this.ruleName = $.ruleName;
        this.ruleTargetType = $.ruleTargetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiJobTransformationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiJobTransformationRuleArgs $;

        public Builder() {
            $ = new DiJobTransformationRuleArgs();
        }

        public Builder(DiJobTransformationRuleArgs defaults) {
            $ = new DiJobTransformationRuleArgs(Objects.requireNonNull(defaults));
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
         * @param ruleExpression Regular expression, in json string format.
         * 
         * Example renaming rule (Rename): {&#34;expression&#34;:&#34;${srcDatasourceName}_${srcDatabaseName}_0922&#34;,&#34;variables&#34;:[{&#34;variableName&#34;:&#34;srcDatabaseName&#34;,&#34;variableRules&#34;:[{&#34;from&#34;:&#34;fromdb&#34;,&#34;to&#34;:&#34;todb&#34;}]}]}
         * 
         * @return builder
         * 
         */
        public Builder ruleExpression(@Nullable Output<String> ruleExpression) {
            $.ruleExpression = ruleExpression;
            return this;
        }

        /**
         * @param ruleExpression Regular expression, in json string format.
         * 
         * Example renaming rule (Rename): {&#34;expression&#34;:&#34;${srcDatasourceName}_${srcDatabaseName}_0922&#34;,&#34;variables&#34;:[{&#34;variableName&#34;:&#34;srcDatabaseName&#34;,&#34;variableRules&#34;:[{&#34;from&#34;:&#34;fromdb&#34;,&#34;to&#34;:&#34;todb&#34;}]}]}
         * 
         * @return builder
         * 
         */
        public Builder ruleExpression(String ruleExpression) {
            return ruleExpression(Output.of(ruleExpression));
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

        public DiJobTransformationRuleArgs build() {
            return $;
        }
    }

}
