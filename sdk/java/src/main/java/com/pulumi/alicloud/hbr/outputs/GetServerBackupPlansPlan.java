// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetServerBackupPlansPlanDetail;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerBackupPlansPlan {
    /**
     * @return The creation time of backup plan.
     * 
     */
    private String createTime;
    /**
     * @return ECS server backup plan details.
     * 
     */
    private List<GetServerBackupPlansPlanDetail> details;
    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`.
     * 
     */
    private Boolean disabled;
    /**
     * @return The ID of the server backup plan.
     * 
     */
    private String ecsServerBackupPlanId;
    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    private String ecsServerBackupPlanName;
    /**
     * @return The ID of the server backup plan.
     * 
     */
    private String id;
    /**
     * @return The ID of ECS Instance.
     * 
     */
    private String instanceId;
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    private String retention;
    /**
     * @return Backup strategy.
     * 
     */
    private String schedule;

    private GetServerBackupPlansPlan() {}
    /**
     * @return The creation time of backup plan.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return ECS server backup plan details.
     * 
     */
    public List<GetServerBackupPlansPlanDetail> details() {
        return this.details;
    }
    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The ID of the server backup plan.
     * 
     */
    public String ecsServerBackupPlanId() {
        return this.ecsServerBackupPlanId;
    }
    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    public String ecsServerBackupPlanName() {
        return this.ecsServerBackupPlanName;
    }
    /**
     * @return The ID of the server backup plan.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of ECS Instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    public String retention() {
        return this.retention;
    }
    /**
     * @return Backup strategy.
     * 
     */
    public String schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerBackupPlansPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private List<GetServerBackupPlansPlanDetail> details;
        private Boolean disabled;
        private String ecsServerBackupPlanId;
        private String ecsServerBackupPlanName;
        private String id;
        private String instanceId;
        private String retention;
        private String schedule;
        public Builder() {}
        public Builder(GetServerBackupPlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.details = defaults.details;
    	      this.disabled = defaults.disabled;
    	      this.ecsServerBackupPlanId = defaults.ecsServerBackupPlanId;
    	      this.ecsServerBackupPlanName = defaults.ecsServerBackupPlanName;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.retention = defaults.retention;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder details(List<GetServerBackupPlansPlanDetail> details) {
            if (details == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "details");
            }
            this.details = details;
            return this;
        }
        public Builder details(GetServerBackupPlansPlanDetail... details) {
            return details(List.of(details));
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder ecsServerBackupPlanId(String ecsServerBackupPlanId) {
            if (ecsServerBackupPlanId == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "ecsServerBackupPlanId");
            }
            this.ecsServerBackupPlanId = ecsServerBackupPlanId;
            return this;
        }
        @CustomType.Setter
        public Builder ecsServerBackupPlanName(String ecsServerBackupPlanName) {
            if (ecsServerBackupPlanName == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "ecsServerBackupPlanName");
            }
            this.ecsServerBackupPlanName = ecsServerBackupPlanName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            if (retention == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "retention");
            }
            this.retention = retention;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetServerBackupPlansPlan", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        public GetServerBackupPlansPlan build() {
            final var _resultValue = new GetServerBackupPlansPlan();
            _resultValue.createTime = createTime;
            _resultValue.details = details;
            _resultValue.disabled = disabled;
            _resultValue.ecsServerBackupPlanId = ecsServerBackupPlanId;
            _resultValue.ecsServerBackupPlanName = ecsServerBackupPlanName;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.retention = retention;
            _resultValue.schedule = schedule;
            return _resultValue;
        }
    }
}