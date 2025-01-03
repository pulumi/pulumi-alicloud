// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataLimitsLimit {
    /**
     * @return Whether to enable the log auditing feature.
     * 
     */
    private Integer auditStatus;
    /**
     * @return The status of the connectivity test between the data asset and SDDP.
     * 
     */
    private Integer checkStatus;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String dataLimitId;
    /**
     * @return The type of the database.
     * 
     */
    private String engineType;
    /**
     * @return The ID of the Data Limit.
     * 
     */
    private String id;
    /**
     * @return The name of the service to which the data asset belongs.
     * 
     */
    private String localName;
    /**
     * @return The retention period of raw logs after you enable the log auditing feature.
     * 
     */
    private Integer logStoreDay;
    /**
     * @return The parent asset ID of the data asset.
     * 
     */
    private String parentId;
    /**
     * @return The port that is used to connect to the database.
     * 
     */
    private Integer port;
    /**
     * @return The type of the service to which the data asset belongs. Valid values: `MaxCompute`, `OSS`, `RDS`.
     * 
     */
    private String resourceType;
    /**
     * @return The name of the user who owns the data asset.
     * 
     */
    private String userName;

    private GetDataLimitsLimit() {}
    /**
     * @return Whether to enable the log auditing feature.
     * 
     */
    public Integer auditStatus() {
        return this.auditStatus;
    }
    /**
     * @return The status of the connectivity test between the data asset and SDDP.
     * 
     */
    public Integer checkStatus() {
        return this.checkStatus;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String dataLimitId() {
        return this.dataLimitId;
    }
    /**
     * @return The type of the database.
     * 
     */
    public String engineType() {
        return this.engineType;
    }
    /**
     * @return The ID of the Data Limit.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the service to which the data asset belongs.
     * 
     */
    public String localName() {
        return this.localName;
    }
    /**
     * @return The retention period of raw logs after you enable the log auditing feature.
     * 
     */
    public Integer logStoreDay() {
        return this.logStoreDay;
    }
    /**
     * @return The parent asset ID of the data asset.
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    /**
     * @return The port that is used to connect to the database.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The type of the service to which the data asset belongs. Valid values: `MaxCompute`, `OSS`, `RDS`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The name of the user who owns the data asset.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLimitsLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer auditStatus;
        private Integer checkStatus;
        private String dataLimitId;
        private String engineType;
        private String id;
        private String localName;
        private Integer logStoreDay;
        private String parentId;
        private Integer port;
        private String resourceType;
        private String userName;
        public Builder() {}
        public Builder(GetDataLimitsLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditStatus = defaults.auditStatus;
    	      this.checkStatus = defaults.checkStatus;
    	      this.dataLimitId = defaults.dataLimitId;
    	      this.engineType = defaults.engineType;
    	      this.id = defaults.id;
    	      this.localName = defaults.localName;
    	      this.logStoreDay = defaults.logStoreDay;
    	      this.parentId = defaults.parentId;
    	      this.port = defaults.port;
    	      this.resourceType = defaults.resourceType;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder auditStatus(Integer auditStatus) {
            if (auditStatus == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "auditStatus");
            }
            this.auditStatus = auditStatus;
            return this;
        }
        @CustomType.Setter
        public Builder checkStatus(Integer checkStatus) {
            if (checkStatus == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "checkStatus");
            }
            this.checkStatus = checkStatus;
            return this;
        }
        @CustomType.Setter
        public Builder dataLimitId(String dataLimitId) {
            if (dataLimitId == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "dataLimitId");
            }
            this.dataLimitId = dataLimitId;
            return this;
        }
        @CustomType.Setter
        public Builder engineType(String engineType) {
            if (engineType == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "engineType");
            }
            this.engineType = engineType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder localName(String localName) {
            if (localName == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "localName");
            }
            this.localName = localName;
            return this;
        }
        @CustomType.Setter
        public Builder logStoreDay(Integer logStoreDay) {
            if (logStoreDay == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "logStoreDay");
            }
            this.logStoreDay = logStoreDay;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            if (parentId == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "parentId");
            }
            this.parentId = parentId;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            if (userName == null) {
              throw new MissingRequiredPropertyException("GetDataLimitsLimit", "userName");
            }
            this.userName = userName;
            return this;
        }
        public GetDataLimitsLimit build() {
            final var _resultValue = new GetDataLimitsLimit();
            _resultValue.auditStatus = auditStatus;
            _resultValue.checkStatus = checkStatus;
            _resultValue.dataLimitId = dataLimitId;
            _resultValue.engineType = engineType;
            _resultValue.id = id;
            _resultValue.localName = localName;
            _resultValue.logStoreDay = logStoreDay;
            _resultValue.parentId = parentId;
            _resultValue.port = port;
            _resultValue.resourceType = resourceType;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
