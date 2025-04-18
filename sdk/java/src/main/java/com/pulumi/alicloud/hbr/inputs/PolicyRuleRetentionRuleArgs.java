// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyRuleRetentionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyRuleRetentionRuleArgs Empty = new PolicyRuleRetentionRuleArgs();

    /**
     * Valid values: `annually`, `MONTHLY`, and `WEEKLY`:- `annually`: the first backup of each year. - `MONTHLY`: The first backup of the month. - `WEEKLY`: The first backup of the week. - `DAILY`: The first backup of the day.
     * 
     */
    @Import(name="advancedRetentionType")
    private @Nullable Output<String> advancedRetentionType;

    /**
     * @return Valid values: `annually`, `MONTHLY`, and `WEEKLY`:- `annually`: the first backup of each year. - `MONTHLY`: The first backup of the month. - `WEEKLY`: The first backup of the week. - `DAILY`: The first backup of the day.
     * 
     */
    public Optional<Output<String>> advancedRetentionType() {
        return Optional.ofNullable(this.advancedRetentionType);
    }

    /**
     * Retention time, in days.
     * 
     */
    @Import(name="retention")
    private @Nullable Output<Integer> retention;

    /**
     * @return Retention time, in days.
     * 
     */
    public Optional<Output<Integer>> retention() {
        return Optional.ofNullable(this.retention);
    }

    private PolicyRuleRetentionRuleArgs() {}

    private PolicyRuleRetentionRuleArgs(PolicyRuleRetentionRuleArgs $) {
        this.advancedRetentionType = $.advancedRetentionType;
        this.retention = $.retention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyRuleRetentionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyRuleRetentionRuleArgs $;

        public Builder() {
            $ = new PolicyRuleRetentionRuleArgs();
        }

        public Builder(PolicyRuleRetentionRuleArgs defaults) {
            $ = new PolicyRuleRetentionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedRetentionType Valid values: `annually`, `MONTHLY`, and `WEEKLY`:- `annually`: the first backup of each year. - `MONTHLY`: The first backup of the month. - `WEEKLY`: The first backup of the week. - `DAILY`: The first backup of the day.
         * 
         * @return builder
         * 
         */
        public Builder advancedRetentionType(@Nullable Output<String> advancedRetentionType) {
            $.advancedRetentionType = advancedRetentionType;
            return this;
        }

        /**
         * @param advancedRetentionType Valid values: `annually`, `MONTHLY`, and `WEEKLY`:- `annually`: the first backup of each year. - `MONTHLY`: The first backup of the month. - `WEEKLY`: The first backup of the week. - `DAILY`: The first backup of the day.
         * 
         * @return builder
         * 
         */
        public Builder advancedRetentionType(String advancedRetentionType) {
            return advancedRetentionType(Output.of(advancedRetentionType));
        }

        /**
         * @param retention Retention time, in days.
         * 
         * @return builder
         * 
         */
        public Builder retention(@Nullable Output<Integer> retention) {
            $.retention = retention;
            return this;
        }

        /**
         * @param retention Retention time, in days.
         * 
         * @return builder
         * 
         */
        public Builder retention(Integer retention) {
            return retention(Output.of(retention));
        }

        public PolicyRuleRetentionRuleArgs build() {
            return $;
        }
    }

}
