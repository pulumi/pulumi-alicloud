// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eais.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The ID of the ECS instance to be bound.
     * 
     */
    private String clientInstanceId;
    /**
     * @return The name of the ECS instance bound to the EAIS instance.
     * 
     */
    private String clientInstanceName;
    /**
     * @return The type of the ECS instance bound to the EAIS instance.
     * 
     */
    private String clientInstanceType;
    /**
     * @return The ID of the Instance.
     * 
     */
    private String id;
    /**
     * @return The ID of the resource.
     * 
     */
    private String instanceId;
    /**
     * @return The name of the resource.
     * 
     */
    private String instanceName;
    /**
     * @return The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     * 
     */
    private String instanceType;
    /**
     * @return The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     * 
     */
    private String status;
    /**
     * @return The ID of the region to which the EAIS instance belongs.
     * 
     */
    private String zoneId;

    private GetInstancesInstance() {}
    /**
     * @return The ID of the ECS instance to be bound.
     * 
     */
    public String clientInstanceId() {
        return this.clientInstanceId;
    }
    /**
     * @return The name of the ECS instance bound to the EAIS instance.
     * 
     */
    public String clientInstanceName() {
        return this.clientInstanceName;
    }
    /**
     * @return The type of the ECS instance bound to the EAIS instance.
     * 
     */
    public String clientInstanceType() {
        return this.clientInstanceType;
    }
    /**
     * @return The ID of the Instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the resource.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The type of the resource. Valid values: `eais.ei-a6.4xlarge`, `eais.ei-a6.2xlarge`, `eais.ei-a6.xlarge`, `eais.ei-a6.large`, `eais.ei-a6.medium`.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The status of the resource. Valid values: `Attaching`, `Available`, `Detaching`, `InUse`, `Starting`, `Unavailable`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the region to which the EAIS instance belongs.
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
        private String clientInstanceId;
        private String clientInstanceName;
        private String clientInstanceType;
        private String id;
        private String instanceId;
        private String instanceName;
        private String instanceType;
        private String status;
        private String zoneId;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientInstanceId = defaults.clientInstanceId;
    	      this.clientInstanceName = defaults.clientInstanceName;
    	      this.clientInstanceType = defaults.clientInstanceType;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceType = defaults.instanceType;
    	      this.status = defaults.status;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder clientInstanceId(String clientInstanceId) {
            if (clientInstanceId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "clientInstanceId");
            }
            this.clientInstanceId = clientInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder clientInstanceName(String clientInstanceName) {
            if (clientInstanceName == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "clientInstanceName");
            }
            this.clientInstanceName = clientInstanceName;
            return this;
        }
        @CustomType.Setter
        public Builder clientInstanceType(String clientInstanceType) {
            if (clientInstanceType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "clientInstanceType");
            }
            this.clientInstanceType = clientInstanceType;
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
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceType");
            }
            this.instanceType = instanceType;
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
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetInstancesInstance build() {
            final var _resultValue = new GetInstancesInstance();
            _resultValue.clientInstanceId = clientInstanceId;
            _resultValue.clientInstanceName = clientInstanceName;
            _resultValue.clientInstanceType = clientInstanceType;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceName = instanceName;
            _resultValue.instanceType = instanceType;
            _resultValue.status = status;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}