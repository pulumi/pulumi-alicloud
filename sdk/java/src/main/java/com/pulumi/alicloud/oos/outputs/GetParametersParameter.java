// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetParametersParameter {
    /**
     * @return The constraints of the common parameter.
     * 
     */
    private String constraints;
    /**
     * @return The time when the common parameter was created.
     * 
     */
    private String createTime;
    /**
     * @return The user who created the common parameter.
     * 
     */
    private String createdBy;
    /**
     * @return The description of the common parameter.
     * 
     */
    private String description;
    /**
     * @return The ID of the Parameter. Its value is same as `parameter_name`.
     * 
     */
    private String id;
    /**
     * @return The ID of the common parameter.
     * 
     */
    private String parameterId;
    /**
     * @return The name of the common parameter.
     * 
     */
    private String parameterName;
    /**
     * @return The version number of the common parameter.
     * 
     */
    private Integer parameterVersion;
    /**
     * @return The ID of the Resource Group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The share type of the common parameter.
     * 
     */
    private String shareType;
    /**
     * @return The tag of the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The data type of the common parameter.
     * 
     */
    private String type;
    /**
     * @return The user who updated the common parameter.
     * 
     */
    private String updatedBy;
    /**
     * @return The time when the common parameter was updated.
     * 
     */
    private String updatedDate;
    /**
     * @return The value of the common parameter.
     * 
     */
    private String value;

    private GetParametersParameter() {}
    /**
     * @return The constraints of the common parameter.
     * 
     */
    public String constraints() {
        return this.constraints;
    }
    /**
     * @return The time when the common parameter was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The user who created the common parameter.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The description of the common parameter.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Parameter. Its value is same as `parameter_name`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the common parameter.
     * 
     */
    public String parameterId() {
        return this.parameterId;
    }
    /**
     * @return The name of the common parameter.
     * 
     */
    public String parameterName() {
        return this.parameterName;
    }
    /**
     * @return The version number of the common parameter.
     * 
     */
    public Integer parameterVersion() {
        return this.parameterVersion;
    }
    /**
     * @return The ID of the Resource Group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The share type of the common parameter.
     * 
     */
    public String shareType() {
        return this.shareType;
    }
    /**
     * @return The tag of the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The data type of the common parameter.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user who updated the common parameter.
     * 
     */
    public String updatedBy() {
        return this.updatedBy;
    }
    /**
     * @return The time when the common parameter was updated.
     * 
     */
    public String updatedDate() {
        return this.updatedDate;
    }
    /**
     * @return The value of the common parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParametersParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String constraints;
        private String createTime;
        private String createdBy;
        private String description;
        private String id;
        private String parameterId;
        private String parameterName;
        private Integer parameterVersion;
        private String resourceGroupId;
        private String shareType;
        private Map<String,Object> tags;
        private String type;
        private String updatedBy;
        private String updatedDate;
        private String value;
        public Builder() {}
        public Builder(GetParametersParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.createTime = defaults.createTime;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.parameterId = defaults.parameterId;
    	      this.parameterName = defaults.parameterName;
    	      this.parameterVersion = defaults.parameterVersion;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.shareType = defaults.shareType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedDate = defaults.updatedDate;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder constraints(String constraints) {
            if (constraints == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "constraints");
            }
            this.constraints = constraints;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder parameterId(String parameterId) {
            if (parameterId == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "parameterId");
            }
            this.parameterId = parameterId;
            return this;
        }
        @CustomType.Setter
        public Builder parameterName(String parameterName) {
            if (parameterName == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "parameterName");
            }
            this.parameterName = parameterName;
            return this;
        }
        @CustomType.Setter
        public Builder parameterVersion(Integer parameterVersion) {
            if (parameterVersion == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "parameterVersion");
            }
            this.parameterVersion = parameterVersion;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder shareType(String shareType) {
            if (shareType == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "shareType");
            }
            this.shareType = shareType;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(String updatedBy) {
            if (updatedBy == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "updatedBy");
            }
            this.updatedBy = updatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder updatedDate(String updatedDate) {
            if (updatedDate == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "updatedDate");
            }
            this.updatedDate = updatedDate;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetParametersParameter", "value");
            }
            this.value = value;
            return this;
        }
        public GetParametersParameter build() {
            final var _resultValue = new GetParametersParameter();
            _resultValue.constraints = constraints;
            _resultValue.createTime = createTime;
            _resultValue.createdBy = createdBy;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.parameterId = parameterId;
            _resultValue.parameterName = parameterName;
            _resultValue.parameterVersion = parameterVersion;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.shareType = shareType;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.updatedBy = updatedBy;
            _resultValue.updatedDate = updatedDate;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}