// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbInstancePlanPlanConfigScaleUpArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbInstancePlanPlanConfigScaleUpArgs Empty = new DbInstancePlanPlanConfigScaleUpArgs();

    /**
     * The executed time of the Plan.
     * 
     */
    @Import(name="executeTime")
    private @Nullable Output<String> executeTime;

    /**
     * @return The executed time of the Plan.
     * 
     */
    public Optional<Output<String>> executeTime() {
        return Optional.ofNullable(this.executeTime);
    }

    /**
     * The specification of segment nodes of the Plan.
     * 
     */
    @Import(name="instanceSpec")
    private @Nullable Output<String> instanceSpec;

    /**
     * @return The specification of segment nodes of the Plan.
     * 
     */
    public Optional<Output<String>> instanceSpec() {
        return Optional.ofNullable(this.instanceSpec);
    }

    /**
     * The Cron Time of the plan.
     * 
     */
    @Import(name="planCronTime")
    private @Nullable Output<String> planCronTime;

    /**
     * @return The Cron Time of the plan.
     * 
     */
    public Optional<Output<String>> planCronTime() {
        return Optional.ofNullable(this.planCronTime);
    }

    /**
     * (Available since v1.231.0) The status of the plan task.
     * 
     */
    @Import(name="planTaskStatus")
    private @Nullable Output<String> planTaskStatus;

    /**
     * @return (Available since v1.231.0) The status of the plan task.
     * 
     */
    public Optional<Output<String>> planTaskStatus() {
        return Optional.ofNullable(this.planTaskStatus);
    }

    private DbInstancePlanPlanConfigScaleUpArgs() {}

    private DbInstancePlanPlanConfigScaleUpArgs(DbInstancePlanPlanConfigScaleUpArgs $) {
        this.executeTime = $.executeTime;
        this.instanceSpec = $.instanceSpec;
        this.planCronTime = $.planCronTime;
        this.planTaskStatus = $.planTaskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbInstancePlanPlanConfigScaleUpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbInstancePlanPlanConfigScaleUpArgs $;

        public Builder() {
            $ = new DbInstancePlanPlanConfigScaleUpArgs();
        }

        public Builder(DbInstancePlanPlanConfigScaleUpArgs defaults) {
            $ = new DbInstancePlanPlanConfigScaleUpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executeTime The executed time of the Plan.
         * 
         * @return builder
         * 
         */
        public Builder executeTime(@Nullable Output<String> executeTime) {
            $.executeTime = executeTime;
            return this;
        }

        /**
         * @param executeTime The executed time of the Plan.
         * 
         * @return builder
         * 
         */
        public Builder executeTime(String executeTime) {
            return executeTime(Output.of(executeTime));
        }

        /**
         * @param instanceSpec The specification of segment nodes of the Plan.
         * 
         * @return builder
         * 
         */
        public Builder instanceSpec(@Nullable Output<String> instanceSpec) {
            $.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * @param instanceSpec The specification of segment nodes of the Plan.
         * 
         * @return builder
         * 
         */
        public Builder instanceSpec(String instanceSpec) {
            return instanceSpec(Output.of(instanceSpec));
        }

        /**
         * @param planCronTime The Cron Time of the plan.
         * 
         * @return builder
         * 
         */
        public Builder planCronTime(@Nullable Output<String> planCronTime) {
            $.planCronTime = planCronTime;
            return this;
        }

        /**
         * @param planCronTime The Cron Time of the plan.
         * 
         * @return builder
         * 
         */
        public Builder planCronTime(String planCronTime) {
            return planCronTime(Output.of(planCronTime));
        }

        /**
         * @param planTaskStatus (Available since v1.231.0) The status of the plan task.
         * 
         * @return builder
         * 
         */
        public Builder planTaskStatus(@Nullable Output<String> planTaskStatus) {
            $.planTaskStatus = planTaskStatus;
            return this;
        }

        /**
         * @param planTaskStatus (Available since v1.231.0) The status of the plan task.
         * 
         * @return builder
         * 
         */
        public Builder planTaskStatus(String planTaskStatus) {
            return planTaskStatus(Output.of(planTaskStatus));
        }

        public DbInstancePlanPlanConfigScaleUpArgs build() {
            return $;
        }
    }

}
