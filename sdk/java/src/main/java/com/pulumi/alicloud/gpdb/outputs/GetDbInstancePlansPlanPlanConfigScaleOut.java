// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDbInstancePlansPlanPlanConfigScaleOut {
    /**
     * @return The executed time of the Plan.
     * 
     */
    private String executeTime;
    /**
     * @return The Cron Time of the plan.
     * 
     */
    private String planCronTime;
    /**
     * @return The Status of the plan Task.
     * 
     */
    private String planTaskStatus;
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    private String segmentNodeNum;

    private GetDbInstancePlansPlanPlanConfigScaleOut() {}
    /**
     * @return The executed time of the Plan.
     * 
     */
    public String executeTime() {
        return this.executeTime;
    }
    /**
     * @return The Cron Time of the plan.
     * 
     */
    public String planCronTime() {
        return this.planCronTime;
    }
    /**
     * @return The Status of the plan Task.
     * 
     */
    public String planTaskStatus() {
        return this.planTaskStatus;
    }
    /**
     * @return The segment Node Num of the Plan.
     * 
     */
    public String segmentNodeNum() {
        return this.segmentNodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancePlansPlanPlanConfigScaleOut defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String executeTime;
        private String planCronTime;
        private String planTaskStatus;
        private String segmentNodeNum;
        public Builder() {}
        public Builder(GetDbInstancePlansPlanPlanConfigScaleOut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
    	      this.planCronTime = defaults.planCronTime;
    	      this.planTaskStatus = defaults.planTaskStatus;
    	      this.segmentNodeNum = defaults.segmentNodeNum;
        }

        @CustomType.Setter
        public Builder executeTime(String executeTime) {
            if (executeTime == null) {
              throw new MissingRequiredPropertyException("GetDbInstancePlansPlanPlanConfigScaleOut", "executeTime");
            }
            this.executeTime = executeTime;
            return this;
        }
        @CustomType.Setter
        public Builder planCronTime(String planCronTime) {
            if (planCronTime == null) {
              throw new MissingRequiredPropertyException("GetDbInstancePlansPlanPlanConfigScaleOut", "planCronTime");
            }
            this.planCronTime = planCronTime;
            return this;
        }
        @CustomType.Setter
        public Builder planTaskStatus(String planTaskStatus) {
            if (planTaskStatus == null) {
              throw new MissingRequiredPropertyException("GetDbInstancePlansPlanPlanConfigScaleOut", "planTaskStatus");
            }
            this.planTaskStatus = planTaskStatus;
            return this;
        }
        @CustomType.Setter
        public Builder segmentNodeNum(String segmentNodeNum) {
            if (segmentNodeNum == null) {
              throw new MissingRequiredPropertyException("GetDbInstancePlansPlanPlanConfigScaleOut", "segmentNodeNum");
            }
            this.segmentNodeNum = segmentNodeNum;
            return this;
        }
        public GetDbInstancePlansPlanPlanConfigScaleOut build() {
            final var _resultValue = new GetDbInstancePlansPlanPlanConfigScaleOut();
            _resultValue.executeTime = executeTime;
            _resultValue.planCronTime = planCronTime;
            _resultValue.planTaskStatus = planTaskStatus;
            _resultValue.segmentNodeNum = segmentNodeNum;
            return _resultValue;
        }
    }
}