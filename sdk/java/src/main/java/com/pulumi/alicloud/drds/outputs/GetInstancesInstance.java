// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.drds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return (Available in 1.196.0+) The connection string of the DRDS instance.
     * 
     */
    private String connectionString;
    /**
     * @return Creation time of the instance.
     * 
     */
    private Integer createTime;
    /**
     * @return The DRDS instance description.
     * 
     */
    private String description;
    /**
     * @return The ID of the DRDS instance.
     * 
     */
    private String id;
    /**
     * @return `Classic` for public classic network or `VPC` for private network.
     * 
     */
    private String networkType;
    /**
     * @return (Available in 1.196.0+) The connection port of the DRDS instance.
     * 
     */
    private String port;
    /**
     * @return Status of the instance.
     * 
     */
    private String status;
    /**
     * @return The DRDS Instance type.
     * 
     */
    private String type;
    /**
     * @return The DRDS Instance version.
     * 
     */
    private Integer version;
    /**
     * @return Zone ID the instance belongs to.
     * 
     */
    private String zoneId;

    private GetInstancesInstance() {}
    /**
     * @return (Available in 1.196.0+) The connection string of the DRDS instance.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Creation time of the instance.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return The DRDS instance description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the DRDS instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `Classic` for public classic network or `VPC` for private network.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return (Available in 1.196.0+) The connection port of the DRDS instance.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return Status of the instance.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The DRDS Instance type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The DRDS Instance version.
     * 
     */
    public Integer version() {
        return this.version;
    }
    /**
     * @return Zone ID the instance belongs to.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionString;
        private Integer createTime;
        private String description;
        private String id;
        private String networkType;
        private String port;
        private String status;
        private String type;
        private Integer version;
        private String zoneId;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(Integer createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "createTime");
            }
            this.createTime = createTime;
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
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "port");
            }
            this.port = port;
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
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "version");
            }
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetInstancesInstance build() {
            final var _resultValue = new GetInstancesInstance();
            _resultValue.connectionString = connectionString;
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.networkType = networkType;
            _resultValue.port = port;
            _resultValue.status = status;
            _resultValue.type = type;
            _resultValue.version = version;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}