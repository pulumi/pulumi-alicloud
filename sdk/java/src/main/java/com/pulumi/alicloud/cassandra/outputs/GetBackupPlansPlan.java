// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cassandra.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackupPlansPlan {
    /**
     * @return Specifies whether to activate the backup plan.
     * 
     */
    private Boolean active;
    /**
     * @return The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
     * 
     */
    private String backupPeriod;
    /**
     * @return The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
     * 
     */
    private String backupTime;
    /**
     * @return The ID of the cluster for the backup.
     * 
     */
    private String clusterId;
    /**
     * @return The time when the backup plan was created.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the data center for the backup in the cluster.
     * 
     */
    private String dataCenterId;
    /**
     * @return The ID of the Backup Plan.
     * 
     */
    private String id;
    /**
     * @return The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
     * 
     */
    private Integer retentionPeriod;

    private GetBackupPlansPlan() {}
    /**
     * @return Specifies whether to activate the backup plan.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
     * 
     */
    public String backupPeriod() {
        return this.backupPeriod;
    }
    /**
     * @return The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
     * 
     */
    public String backupTime() {
        return this.backupTime;
    }
    /**
     * @return The ID of the cluster for the backup.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The time when the backup plan was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the data center for the backup in the cluster.
     * 
     */
    public String dataCenterId() {
        return this.dataCenterId;
    }
    /**
     * @return The ID of the Backup Plan.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
     * 
     */
    public Integer retentionPeriod() {
        return this.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlansPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String backupPeriod;
        private String backupTime;
        private String clusterId;
        private String createTime;
        private String dataCenterId;
        private String id;
        private Integer retentionPeriod;
        public Builder() {}
        public Builder(GetBackupPlansPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.backupPeriod = defaults.backupPeriod;
    	      this.backupTime = defaults.backupTime;
    	      this.clusterId = defaults.clusterId;
    	      this.createTime = defaults.createTime;
    	      this.dataCenterId = defaults.dataCenterId;
    	      this.id = defaults.id;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder backupPeriod(String backupPeriod) {
            if (backupPeriod == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "backupPeriod");
            }
            this.backupPeriod = backupPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder backupTime(String backupTime) {
            if (backupTime == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "backupTime");
            }
            this.backupTime = backupTime;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dataCenterId(String dataCenterId) {
            if (dataCenterId == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "dataCenterId");
            }
            this.dataCenterId = dataCenterId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder retentionPeriod(Integer retentionPeriod) {
            if (retentionPeriod == null) {
              throw new MissingRequiredPropertyException("GetBackupPlansPlan", "retentionPeriod");
            }
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public GetBackupPlansPlan build() {
            final var _resultValue = new GetBackupPlansPlan();
            _resultValue.active = active;
            _resultValue.backupPeriod = backupPeriod;
            _resultValue.backupTime = backupTime;
            _resultValue.clusterId = clusterId;
            _resultValue.createTime = createTime;
            _resultValue.dataCenterId = dataCenterId;
            _resultValue.id = id;
            _resultValue.retentionPeriod = retentionPeriod;
            return _resultValue;
        }
    }
}