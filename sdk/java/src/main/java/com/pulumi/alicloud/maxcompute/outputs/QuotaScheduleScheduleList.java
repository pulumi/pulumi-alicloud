// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.alicloud.maxcompute.outputs.QuotaScheduleScheduleListCondition;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuotaScheduleScheduleList {
    /**
     * @return The value of effective condition. See `condition` below.
     * 
     */
    private @Nullable QuotaScheduleScheduleListCondition condition;
    /**
     * @return The name of the quota plan.
     * 
     */
    private String plan;
    /**
     * @return The type of the quota plan. Valid values: daily
     * 
     * &gt; **NOTE:** Currently, only daily is supported.
     * 
     */
    private String type;

    private QuotaScheduleScheduleList() {}
    /**
     * @return The value of effective condition. See `condition` below.
     * 
     */
    public Optional<QuotaScheduleScheduleListCondition> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The name of the quota plan.
     * 
     */
    public String plan() {
        return this.plan;
    }
    /**
     * @return The type of the quota plan. Valid values: daily
     * 
     * &gt; **NOTE:** Currently, only daily is supported.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaScheduleScheduleList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable QuotaScheduleScheduleListCondition condition;
        private String plan;
        private String type;
        public Builder() {}
        public Builder(QuotaScheduleScheduleList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.plan = defaults.plan;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder condition(@Nullable QuotaScheduleScheduleListCondition condition) {

            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder plan(String plan) {
            if (plan == null) {
              throw new MissingRequiredPropertyException("QuotaScheduleScheduleList", "plan");
            }
            this.plan = plan;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("QuotaScheduleScheduleList", "type");
            }
            this.type = type;
            return this;
        }
        public QuotaScheduleScheduleList build() {
            final var _resultValue = new QuotaScheduleScheduleList();
            _resultValue.condition = condition;
            _resultValue.plan = plan;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
