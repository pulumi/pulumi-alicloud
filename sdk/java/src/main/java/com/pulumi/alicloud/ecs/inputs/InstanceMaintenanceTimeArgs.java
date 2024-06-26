// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMaintenanceTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenanceTimeArgs Empty = new InstanceMaintenanceTimeArgs();

    /**
     * The end time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The start time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private InstanceMaintenanceTimeArgs() {}

    private InstanceMaintenanceTimeArgs(InstanceMaintenanceTimeArgs $) {
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMaintenanceTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMaintenanceTimeArgs $;

        public Builder() {
            $ = new InstanceMaintenanceTimeArgs();
        }

        public Builder(InstanceMaintenanceTimeArgs defaults) {
            $ = new InstanceMaintenanceTimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime The end time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime The start time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public InstanceMaintenanceTimeArgs build() {
            return $;
        }
    }

}
