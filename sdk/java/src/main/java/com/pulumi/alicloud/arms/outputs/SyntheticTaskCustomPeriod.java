// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticTaskCustomPeriod {
    /**
     * @return End hours, 0-24.
     * 
     */
    private @Nullable Integer endHour;
    /**
     * @return Starting hours, 0-24.
     * 
     */
    private @Nullable Integer startHour;

    private SyntheticTaskCustomPeriod() {}
    /**
     * @return End hours, 0-24.
     * 
     */
    public Optional<Integer> endHour() {
        return Optional.ofNullable(this.endHour);
    }
    /**
     * @return Starting hours, 0-24.
     * 
     */
    public Optional<Integer> startHour() {
        return Optional.ofNullable(this.startHour);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticTaskCustomPeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer endHour;
        private @Nullable Integer startHour;
        public Builder() {}
        public Builder(SyntheticTaskCustomPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endHour = defaults.endHour;
    	      this.startHour = defaults.startHour;
        }

        @CustomType.Setter
        public Builder endHour(@Nullable Integer endHour) {

            this.endHour = endHour;
            return this;
        }
        @CustomType.Setter
        public Builder startHour(@Nullable Integer startHour) {

            this.startHour = startHour;
            return this;
        }
        public SyntheticTaskCustomPeriod build() {
            final var _resultValue = new SyntheticTaskCustomPeriod();
            _resultValue.endHour = endHour;
            _resultValue.startHour = startHour;
            return _resultValue;
        }
    }
}
