// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fnf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleState extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleState Empty = new ScheduleState();

    /**
     * The CRON expression of the time-based schedule to be created.
     * 
     */
    @Import(name="cronExpression")
    private @Nullable Output<String> cronExpression;

    /**
     * @return The CRON expression of the time-based schedule to be created.
     * 
     */
    public Optional<Output<String>> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }

    /**
     * The description of the time-based schedule to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the time-based schedule to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * The name of the flow bound to the time-based schedule you want to create.
     * 
     */
    @Import(name="flowName")
    private @Nullable Output<String> flowName;

    /**
     * @return The name of the flow bound to the time-based schedule you want to create.
     * 
     */
    public Optional<Output<String>> flowName() {
        return Optional.ofNullable(this.flowName);
    }

    /**
     * The time when the time-based schedule was last updated.
     * 
     */
    @Import(name="lastModifiedTime")
    private @Nullable Output<String> lastModifiedTime;

    /**
     * @return The time when the time-based schedule was last updated.
     * 
     */
    public Optional<Output<String>> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    /**
     * The trigger message of the time-based schedule to be created. It must be in JSON object format.
     * 
     */
    @Import(name="payload")
    private @Nullable Output<String> payload;

    /**
     * @return The trigger message of the time-based schedule to be created. It must be in JSON object format.
     * 
     */
    public Optional<Output<String>> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * The ID of the time-based schedule.
     * 
     */
    @Import(name="scheduleId")
    private @Nullable Output<String> scheduleId;

    /**
     * @return The ID of the time-based schedule.
     * 
     */
    public Optional<Output<String>> scheduleId() {
        return Optional.ofNullable(this.scheduleId);
    }

    /**
     * The name of the time-based schedule to be created.
     * 
     */
    @Import(name="scheduleName")
    private @Nullable Output<String> scheduleName;

    /**
     * @return The name of the time-based schedule to be created.
     * 
     */
    public Optional<Output<String>> scheduleName() {
        return Optional.ofNullable(this.scheduleName);
    }

    private ScheduleState() {}

    private ScheduleState(ScheduleState $) {
        this.cronExpression = $.cronExpression;
        this.description = $.description;
        this.enable = $.enable;
        this.flowName = $.flowName;
        this.lastModifiedTime = $.lastModifiedTime;
        this.payload = $.payload;
        this.scheduleId = $.scheduleId;
        this.scheduleName = $.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleState $;

        public Builder() {
            $ = new ScheduleState();
        }

        public Builder(ScheduleState defaults) {
            $ = new ScheduleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronExpression The CRON expression of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(@Nullable Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression The CRON expression of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        /**
         * @param description The description of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enable Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Specifies whether to enable the time-based schedule you want to create. Valid values: `false`, `true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param flowName The name of the flow bound to the time-based schedule you want to create.
         * 
         * @return builder
         * 
         */
        public Builder flowName(@Nullable Output<String> flowName) {
            $.flowName = flowName;
            return this;
        }

        /**
         * @param flowName The name of the flow bound to the time-based schedule you want to create.
         * 
         * @return builder
         * 
         */
        public Builder flowName(String flowName) {
            return flowName(Output.of(flowName));
        }

        /**
         * @param lastModifiedTime The time when the time-based schedule was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(@Nullable Output<String> lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param lastModifiedTime The time when the time-based schedule was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            return lastModifiedTime(Output.of(lastModifiedTime));
        }

        /**
         * @param payload The trigger message of the time-based schedule to be created. It must be in JSON object format.
         * 
         * @return builder
         * 
         */
        public Builder payload(@Nullable Output<String> payload) {
            $.payload = payload;
            return this;
        }

        /**
         * @param payload The trigger message of the time-based schedule to be created. It must be in JSON object format.
         * 
         * @return builder
         * 
         */
        public Builder payload(String payload) {
            return payload(Output.of(payload));
        }

        /**
         * @param scheduleId The ID of the time-based schedule.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(@Nullable Output<String> scheduleId) {
            $.scheduleId = scheduleId;
            return this;
        }

        /**
         * @param scheduleId The ID of the time-based schedule.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(String scheduleId) {
            return scheduleId(Output.of(scheduleId));
        }

        /**
         * @param scheduleName The name of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(@Nullable Output<String> scheduleName) {
            $.scheduleName = scheduleName;
            return this;
        }

        /**
         * @param scheduleName The name of the time-based schedule to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(String scheduleName) {
            return scheduleName(Output.of(scheduleName));
        }

        public ScheduleState build() {
            return $;
        }
    }

}