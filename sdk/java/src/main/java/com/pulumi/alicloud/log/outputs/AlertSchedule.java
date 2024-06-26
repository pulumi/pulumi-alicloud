// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertSchedule {
    /**
     * @return Cron expression when type is Cron.
     * 
     */
    private @Nullable String cronExpression;
    /**
     * @return Day of week when type is Weekly, including 0,1,2,3,4,5,6, 0 for Sunday, 1 for Monday
     * 
     */
    private @Nullable Integer dayOfWeek;
    private @Nullable Integer delay;
    /**
     * @return Hour of day when type is Weekly/Daily.
     * 
     */
    private @Nullable Integer hour;
    /**
     * @return Execution interval. 60 seconds minimum, such as 60s, 1h. used when type is FixedRate.
     * 
     */
    private @Nullable String interval;
    private @Nullable Boolean runImmediately;
    /**
     * @return Time zone for schedule.
     * 
     */
    private @Nullable String timeZone;
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    private String type;

    private AlertSchedule() {}
    /**
     * @return Cron expression when type is Cron.
     * 
     */
    public Optional<String> cronExpression() {
        return Optional.ofNullable(this.cronExpression);
    }
    /**
     * @return Day of week when type is Weekly, including 0,1,2,3,4,5,6, 0 for Sunday, 1 for Monday
     * 
     */
    public Optional<Integer> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    public Optional<Integer> delay() {
        return Optional.ofNullable(this.delay);
    }
    /**
     * @return Hour of day when type is Weekly/Daily.
     * 
     */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * @return Execution interval. 60 seconds minimum, such as 60s, 1h. used when type is FixedRate.
     * 
     */
    public Optional<String> interval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<Boolean> runImmediately() {
        return Optional.ofNullable(this.runImmediately);
    }
    /**
     * @return Time zone for schedule.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cronExpression;
        private @Nullable Integer dayOfWeek;
        private @Nullable Integer delay;
        private @Nullable Integer hour;
        private @Nullable String interval;
        private @Nullable Boolean runImmediately;
        private @Nullable String timeZone;
        private String type;
        public Builder() {}
        public Builder(AlertSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpression = defaults.cronExpression;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.delay = defaults.delay;
    	      this.hour = defaults.hour;
    	      this.interval = defaults.interval;
    	      this.runImmediately = defaults.runImmediately;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cronExpression(@Nullable String cronExpression) {

            this.cronExpression = cronExpression;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfWeek(@Nullable Integer dayOfWeek) {

            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder delay(@Nullable Integer delay) {

            this.delay = delay;
            return this;
        }
        @CustomType.Setter
        public Builder hour(@Nullable Integer hour) {

            this.hour = hour;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable String interval) {

            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder runImmediately(@Nullable Boolean runImmediately) {

            this.runImmediately = runImmediately;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(@Nullable String timeZone) {

            this.timeZone = timeZone;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("AlertSchedule", "type");
            }
            this.type = type;
            return this;
        }
        public AlertSchedule build() {
            final var _resultValue = new AlertSchedule();
            _resultValue.cronExpression = cronExpression;
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.delay = delay;
            _resultValue.hour = hour;
            _resultValue.interval = interval;
            _resultValue.runImmediately = runImmediately;
            _resultValue.timeZone = timeZone;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
