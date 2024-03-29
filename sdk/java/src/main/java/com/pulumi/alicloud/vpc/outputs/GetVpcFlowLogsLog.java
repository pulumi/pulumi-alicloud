// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcFlowLogsLog {
    /**
     * @return The Description of flow log.
     * 
     */
    private String description;
    /**
     * @return The flow log ID.
     * 
     */
    private String flowLogId;
    /**
     * @return The flow log name.
     * 
     */
    private String flowLogName;
    /**
     * @return The ID of the Flow Log.
     * 
     */
    private String id;
    /**
     * @return The log store name.
     * 
     */
    private String logStoreName;
    /**
     * @return The project name.
     * 
     */
    private String projectName;
    /**
     * @return The resource id.
     * 
     */
    private String resourceId;
    /**
     * @return The resource type.
     * 
     */
    private String resourceType;
    /**
     * @return The status of flow log.
     * 
     */
    private String status;
    /**
     * @return The traffic type.
     * 
     */
    private String trafficType;

    private GetVpcFlowLogsLog() {}
    /**
     * @return The Description of flow log.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The flow log ID.
     * 
     */
    public String flowLogId() {
        return this.flowLogId;
    }
    /**
     * @return The flow log name.
     * 
     */
    public String flowLogName() {
        return this.flowLogName;
    }
    /**
     * @return The ID of the Flow Log.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The log store name.
     * 
     */
    public String logStoreName() {
        return this.logStoreName;
    }
    /**
     * @return The project name.
     * 
     */
    public String projectName() {
        return this.projectName;
    }
    /**
     * @return The resource id.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The resource type.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of flow log.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The traffic type.
     * 
     */
    public String trafficType() {
        return this.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcFlowLogsLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String flowLogId;
        private String flowLogName;
        private String id;
        private String logStoreName;
        private String projectName;
        private String resourceId;
        private String resourceType;
        private String status;
        private String trafficType;
        public Builder() {}
        public Builder(GetVpcFlowLogsLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.flowLogId = defaults.flowLogId;
    	      this.flowLogName = defaults.flowLogName;
    	      this.id = defaults.id;
    	      this.logStoreName = defaults.logStoreName;
    	      this.projectName = defaults.projectName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.trafficType = defaults.trafficType;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder flowLogId(String flowLogId) {
            if (flowLogId == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "flowLogId");
            }
            this.flowLogId = flowLogId;
            return this;
        }
        @CustomType.Setter
        public Builder flowLogName(String flowLogName) {
            if (flowLogName == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "flowLogName");
            }
            this.flowLogName = flowLogName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logStoreName(String logStoreName) {
            if (logStoreName == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "logStoreName");
            }
            this.logStoreName = logStoreName;
            return this;
        }
        @CustomType.Setter
        public Builder projectName(String projectName) {
            if (projectName == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "projectName");
            }
            this.projectName = projectName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            if (resourceId == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "resourceId");
            }
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder trafficType(String trafficType) {
            if (trafficType == null) {
              throw new MissingRequiredPropertyException("GetVpcFlowLogsLog", "trafficType");
            }
            this.trafficType = trafficType;
            return this;
        }
        public GetVpcFlowLogsLog build() {
            final var _resultValue = new GetVpcFlowLogsLog();
            _resultValue.description = description;
            _resultValue.flowLogId = flowLogId;
            _resultValue.flowLogName = flowLogName;
            _resultValue.id = id;
            _resultValue.logStoreName = logStoreName;
            _resultValue.projectName = projectName;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            _resultValue.trafficType = trafficType;
            return _resultValue;
        }
    }
}
