// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.elasticsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    private String createdAt;
    private Integer dataNodeAmount;
    private Integer dataNodeDiskSize;
    private String dataNodeDiskType;
    private String dataNodeSpec;
    private String description;
    private String id;
    private String instanceChargeType;
    private String status;
    private Map<String,Object> tags;
    private String updatedAt;
    private String version;
    private String vswitchId;

    private GetInstancesInstance() {}
    public String createdAt() {
        return this.createdAt;
    }
    public Integer dataNodeAmount() {
        return this.dataNodeAmount;
    }
    public Integer dataNodeDiskSize() {
        return this.dataNodeDiskSize;
    }
    public String dataNodeDiskType() {
        return this.dataNodeDiskType;
    }
    public String dataNodeSpec() {
        return this.dataNodeSpec;
    }
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    public String instanceChargeType() {
        return this.instanceChargeType;
    }
    public String status() {
        return this.status;
    }
    public Map<String,Object> tags() {
        return this.tags;
    }
    public String updatedAt() {
        return this.updatedAt;
    }
    public String version() {
        return this.version;
    }
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private Integer dataNodeAmount;
        private Integer dataNodeDiskSize;
        private String dataNodeDiskType;
        private String dataNodeSpec;
        private String description;
        private String id;
        private String instanceChargeType;
        private String status;
        private Map<String,Object> tags;
        private String updatedAt;
        private String version;
        private String vswitchId;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.dataNodeAmount = defaults.dataNodeAmount;
    	      this.dataNodeDiskSize = defaults.dataNodeDiskSize;
    	      this.dataNodeDiskType = defaults.dataNodeDiskType;
    	      this.dataNodeSpec = defaults.dataNodeSpec;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updatedAt = defaults.updatedAt;
    	      this.version = defaults.version;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder dataNodeAmount(Integer dataNodeAmount) {
            if (dataNodeAmount == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "dataNodeAmount");
            }
            this.dataNodeAmount = dataNodeAmount;
            return this;
        }
        @CustomType.Setter
        public Builder dataNodeDiskSize(Integer dataNodeDiskSize) {
            if (dataNodeDiskSize == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "dataNodeDiskSize");
            }
            this.dataNodeDiskSize = dataNodeDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder dataNodeDiskType(String dataNodeDiskType) {
            if (dataNodeDiskType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "dataNodeDiskType");
            }
            this.dataNodeDiskType = dataNodeDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder dataNodeSpec(String dataNodeSpec) {
            if (dataNodeSpec == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "dataNodeSpec");
            }
            this.dataNodeSpec = dataNodeSpec;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceChargeType(String instanceChargeType) {
            if (instanceChargeType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceChargeType");
            }
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetInstancesInstance build() {
            final var _resultValue = new GetInstancesInstance();
            _resultValue.createdAt = createdAt;
            _resultValue.dataNodeAmount = dataNodeAmount;
            _resultValue.dataNodeDiskSize = dataNodeDiskSize;
            _resultValue.dataNodeDiskType = dataNodeDiskType;
            _resultValue.dataNodeSpec = dataNodeSpec;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.instanceChargeType = instanceChargeType;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.updatedAt = updatedAt;
            _resultValue.version = version;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}