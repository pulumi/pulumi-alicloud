// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbInstancePlanPlanConfigScaleUp {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private @Nullable String executeTime;
    /**
     * @return The specification of segment nodes of the Plan.
     * 
     */
    private @Nullable String instanceSpec;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private @Nullable String planCronTime;
    /**
     * @return (Available since v1.231.0) The status of the plan task.
     * 
     */
    private @Nullable String planTaskStatus;

    private DbInstancePlanPlanConfigScaleUp() {}
    /**
     * @return The executed time of the Plan.
     * 
     */
    public Optional<String> executeTime() {
        return Optional.ofNullable(this.executeTime);
    }
    /**
     * @return The specification of segment nodes of the Plan.
     * 
     */
    public Optional<String> instanceSpec() {
        return Optional.ofNullable(this.instanceSpec);
    }
    /**
     * @return The Cron Time of the plan.
     * 
     */
    public Optional<String> planCronTime() {
        return Optional.ofNullable(this.planCronTime);
    }
    /**
     * @return (Available since v1.231.0) The status of the plan task.
     * 
     */
    public Optional<String> planTaskStatus() {
        return Optional.ofNullable(this.planTaskStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbInstancePlanPlanConfigScaleUp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String executeTime;
        private @Nullable String instanceSpec;
        private @Nullable String planCronTime;
        private @Nullable String planTaskStatus;
        public Builder() {}
        public Builder(DbInstancePlanPlanConfigScaleUp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.instanceSpec = defaults.instanceSpec;
    	      this.planCronTime = defaults.planCronTime;
    	      this.planTaskStatus = defaults.planTaskStatus;
        }

        @CustomType.Setter
        public Builder executeTime(@Nullable String executeTime) {

            this.executeTime = executeTime;
            return this;
        }
        @CustomType.Setter
        public Builder instanceSpec(@Nullable String instanceSpec) {

            this.instanceSpec = instanceSpec;
            return this;
        }
        @CustomType.Setter
        public Builder planCronTime(@Nullable String planCronTime) {

            this.planCronTime = planCronTime;
            return this;
        }
        @CustomType.Setter
        public Builder planTaskStatus(@Nullable String planTaskStatus) {

            this.planTaskStatus = planTaskStatus;
            return this;
        }
        public DbInstancePlanPlanConfigScaleUp build() {
            final var _resultValue = new DbInstancePlanPlanConfigScaleUp();
            _resultValue.executeTime = executeTime;
            _resultValue.instanceSpec = instanceSpec;
            _resultValue.planCronTime = planCronTime;
            _resultValue.planTaskStatus = planTaskStatus;
            return _resultValue;
        }
    }
}
