// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActivationsActivation {
    /**
     * @return The ID of the activation code.
     * 
     */
    private String activationId;
    /**
     * @return The time when the activation code was created.
     * 
     */
    private String createTime;
    /**
     * @return The number of instances that have been logged out.
     * 
     */
    private Integer deregisteredCount;
    /**
     * @return Description of the corresponding activation code.
     * 
     */
    private String description;
    /**
     * @return Indicates whether the activation code is disabled.
     * 
     */
    private Boolean disabled;
    /**
     * @return The ID of the Activation.
     * 
     */
    private String id;
    /**
     * @return The maximum number of times the activation code is used to register a managed instance.
     * 
     */
    private Integer instanceCount;
    /**
     * @return The default prefix of the instance name.
     * 
     */
    private String instanceName;
    /**
     * @return The IP address of the host that allows the activation code to be used.
     * 
     */
    private String ipAddressRange;
    /**
     * @return The number of instances that were registered.
     * 
     */
    private Integer registeredCount;
    /**
     * @return The validity period of the activation code. Unit: hours.
     * 
     */
    private Integer timeToLiveInHours;

    private GetActivationsActivation() {}
    /**
     * @return The ID of the activation code.
     * 
     */
    public String activationId() {
        return this.activationId;
    }
    /**
     * @return The time when the activation code was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The number of instances that have been logged out.
     * 
     */
    public Integer deregisteredCount() {
        return this.deregisteredCount;
    }
    /**
     * @return Description of the corresponding activation code.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Indicates whether the activation code is disabled.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The ID of the Activation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum number of times the activation code is used to register a managed instance.
     * 
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }
    /**
     * @return The default prefix of the instance name.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The IP address of the host that allows the activation code to be used.
     * 
     */
    public String ipAddressRange() {
        return this.ipAddressRange;
    }
    /**
     * @return The number of instances that were registered.
     * 
     */
    public Integer registeredCount() {
        return this.registeredCount;
    }
    /**
     * @return The validity period of the activation code. Unit: hours.
     * 
     */
    public Integer timeToLiveInHours() {
        return this.timeToLiveInHours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivationsActivation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationId;
        private String createTime;
        private Integer deregisteredCount;
        private String description;
        private Boolean disabled;
        private String id;
        private Integer instanceCount;
        private String instanceName;
        private String ipAddressRange;
        private Integer registeredCount;
        private Integer timeToLiveInHours;
        public Builder() {}
        public Builder(GetActivationsActivation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationId = defaults.activationId;
    	      this.createTime = defaults.createTime;
    	      this.deregisteredCount = defaults.deregisteredCount;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceName = defaults.instanceName;
    	      this.ipAddressRange = defaults.ipAddressRange;
    	      this.registeredCount = defaults.registeredCount;
    	      this.timeToLiveInHours = defaults.timeToLiveInHours;
        }

        @CustomType.Setter
        public Builder activationId(String activationId) {
            if (activationId == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "activationId");
            }
            this.activationId = activationId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder deregisteredCount(Integer deregisteredCount) {
            if (deregisteredCount == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "deregisteredCount");
            }
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceCount(Integer instanceCount) {
            if (instanceCount == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "instanceCount");
            }
            this.instanceCount = instanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressRange(String ipAddressRange) {
            if (ipAddressRange == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "ipAddressRange");
            }
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        @CustomType.Setter
        public Builder registeredCount(Integer registeredCount) {
            if (registeredCount == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "registeredCount");
            }
            this.registeredCount = registeredCount;
            return this;
        }
        @CustomType.Setter
        public Builder timeToLiveInHours(Integer timeToLiveInHours) {
            if (timeToLiveInHours == null) {
              throw new MissingRequiredPropertyException("GetActivationsActivation", "timeToLiveInHours");
            }
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public GetActivationsActivation build() {
            final var _resultValue = new GetActivationsActivation();
            _resultValue.activationId = activationId;
            _resultValue.createTime = createTime;
            _resultValue.deregisteredCount = deregisteredCount;
            _resultValue.description = description;
            _resultValue.disabled = disabled;
            _resultValue.id = id;
            _resultValue.instanceCount = instanceCount;
            _resultValue.instanceName = instanceName;
            _resultValue.ipAddressRange = ipAddressRange;
            _resultValue.registeredCount = registeredCount;
            _resultValue.timeToLiveInHours = timeToLiveInHours;
            return _resultValue;
        }
    }
}