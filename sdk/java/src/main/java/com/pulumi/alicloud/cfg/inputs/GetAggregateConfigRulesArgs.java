// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAggregateConfigRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAggregateConfigRulesArgs Empty = new GetAggregateConfigRulesArgs();

    /**
     * The config rule name.
     * 
     */
    @Import(name="aggregateConfigRuleName")
    private @Nullable Output<String> aggregateConfigRuleName;

    /**
     * @return The config rule name.
     * 
     */
    public Optional<Output<String>> aggregateConfigRuleName() {
        return Optional.ofNullable(this.aggregateConfigRuleName);
    }

    /**
     * The ID of aggregator.
     * 
     */
    @Import(name="aggregatorId", required=true)
    private Output<String> aggregatorId;

    /**
     * @return The ID of aggregator.
     * 
     */
    public Output<String> aggregatorId() {
        return this.aggregatorId;
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
     * A list of Aggregate Config Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Aggregate Config Rule IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Aggregate Config Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Aggregate Config Rule name.
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
     * Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
     * 
     */
    @Import(name="riskLevel")
    private @Nullable Output<Integer> riskLevel;

    /**
     * @return Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
     * 
     */
    public Optional<Output<Integer>> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }

    /**
     * The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAggregateConfigRulesArgs() {}

    private GetAggregateConfigRulesArgs(GetAggregateConfigRulesArgs $) {
        this.aggregateConfigRuleName = $.aggregateConfigRuleName;
        this.aggregatorId = $.aggregatorId;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.riskLevel = $.riskLevel;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAggregateConfigRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAggregateConfigRulesArgs $;

        public Builder() {
            $ = new GetAggregateConfigRulesArgs();
        }

        public Builder(GetAggregateConfigRulesArgs defaults) {
            $ = new GetAggregateConfigRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregateConfigRuleName The config rule name.
         * 
         * @return builder
         * 
         */
        public Builder aggregateConfigRuleName(@Nullable Output<String> aggregateConfigRuleName) {
            $.aggregateConfigRuleName = aggregateConfigRuleName;
            return this;
        }

        /**
         * @param aggregateConfigRuleName The config rule name.
         * 
         * @return builder
         * 
         */
        public Builder aggregateConfigRuleName(String aggregateConfigRuleName) {
            return aggregateConfigRuleName(Output.of(aggregateConfigRuleName));
        }

        /**
         * @param aggregatorId The ID of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorId(Output<String> aggregatorId) {
            $.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * @param aggregatorId The ID of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorId(String aggregatorId) {
            return aggregatorId(Output.of(aggregatorId));
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
         * @param ids A list of Aggregate Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Aggregate Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Aggregate Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Aggregate Config Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Aggregate Config Rule name.
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
         * @param riskLevel Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(@Nullable Output<Integer> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Integer riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        /**
         * @param status The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetAggregateConfigRulesArgs build() {
            if ($.aggregatorId == null) {
                throw new MissingRequiredPropertyException("GetAggregateConfigRulesArgs", "aggregatorId");
            }
            return $;
        }
    }

}