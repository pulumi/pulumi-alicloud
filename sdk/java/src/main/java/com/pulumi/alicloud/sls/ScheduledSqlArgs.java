// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls;

import com.pulumi.alicloud.sls.inputs.ScheduledSqlScheduleArgs;
import com.pulumi.alicloud.sls.inputs.ScheduledSqlScheduledSqlConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledSqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledSqlArgs Empty = new ScheduledSqlArgs();

    /**
     * Task Description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Task Description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Task Display Name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Task Display Name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Log project.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Log project.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o&#39;clock, cron can be used. See `schedule` below.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<ScheduledSqlScheduleArgs> schedule;

    /**
     * @return The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o&#39;clock, cron can be used. See `schedule` below.
     * 
     */
    public Output<ScheduledSqlScheduleArgs> schedule() {
        return this.schedule;
    }

    /**
     * Task Configuration. See `scheduled_sql_configuration` below.
     * 
     */
    @Import(name="scheduledSqlConfiguration", required=true)
    private Output<ScheduledSqlScheduledSqlConfigurationArgs> scheduledSqlConfiguration;

    /**
     * @return Task Configuration. See `scheduled_sql_configuration` below.
     * 
     */
    public Output<ScheduledSqlScheduledSqlConfigurationArgs> scheduledSqlConfiguration() {
        return this.scheduledSqlConfiguration;
    }

    /**
     * Timed SQL name.
     * 
     */
    @Import(name="scheduledSqlName", required=true)
    private Output<String> scheduledSqlName;

    /**
     * @return Timed SQL name.
     * 
     */
    public Output<String> scheduledSqlName() {
        return this.scheduledSqlName;
    }

    private ScheduledSqlArgs() {}

    private ScheduledSqlArgs(ScheduledSqlArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.project = $.project;
        this.schedule = $.schedule;
        this.scheduledSqlConfiguration = $.scheduledSqlConfiguration;
        this.scheduledSqlName = $.scheduledSqlName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledSqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledSqlArgs $;

        public Builder() {
            $ = new ScheduledSqlArgs();
        }

        public Builder(ScheduledSqlArgs defaults) {
            $ = new ScheduledSqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Task Description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Task Description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Task Display Name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Task Display Name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param project Log project.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Log project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schedule The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o&#39;clock, cron can be used. See `schedule` below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<ScheduledSqlScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o&#39;clock, cron can be used. See `schedule` below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(ScheduledSqlScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param scheduledSqlConfiguration Task Configuration. See `scheduled_sql_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder scheduledSqlConfiguration(Output<ScheduledSqlScheduledSqlConfigurationArgs> scheduledSqlConfiguration) {
            $.scheduledSqlConfiguration = scheduledSqlConfiguration;
            return this;
        }

        /**
         * @param scheduledSqlConfiguration Task Configuration. See `scheduled_sql_configuration` below.
         * 
         * @return builder
         * 
         */
        public Builder scheduledSqlConfiguration(ScheduledSqlScheduledSqlConfigurationArgs scheduledSqlConfiguration) {
            return scheduledSqlConfiguration(Output.of(scheduledSqlConfiguration));
        }

        /**
         * @param scheduledSqlName Timed SQL name.
         * 
         * @return builder
         * 
         */
        public Builder scheduledSqlName(Output<String> scheduledSqlName) {
            $.scheduledSqlName = scheduledSqlName;
            return this;
        }

        /**
         * @param scheduledSqlName Timed SQL name.
         * 
         * @return builder
         * 
         */
        public Builder scheduledSqlName(String scheduledSqlName) {
            return scheduledSqlName(Output.of(scheduledSqlName));
        }

        public ScheduledSqlArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("ScheduledSqlArgs", "displayName");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("ScheduledSqlArgs", "project");
            }
            if ($.schedule == null) {
                throw new MissingRequiredPropertyException("ScheduledSqlArgs", "schedule");
            }
            if ($.scheduledSqlConfiguration == null) {
                throw new MissingRequiredPropertyException("ScheduledSqlArgs", "scheduledSqlConfiguration");
            }
            if ($.scheduledSqlName == null) {
                throw new MissingRequiredPropertyException("ScheduledSqlArgs", "scheduledSqlName");
            }
            return $;
        }
    }

}
