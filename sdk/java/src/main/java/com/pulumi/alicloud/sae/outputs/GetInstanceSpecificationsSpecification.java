// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceSpecificationsSpecification {
    /**
     * @return CPU Size, Specifications for Micronucleus.
     * 
     */
    private Integer cpu;
    /**
     * @return Whether the instance is available. The value description is as follows:
     * 
     */
    private Boolean enable;
    /**
     * @return The ID of the Instance Specification.
     * 
     */
    private String id;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String instanceSpecificationId;
    /**
     * @return The Memory specifications for the MB.
     * 
     */
    private Integer memory;
    /**
     * @return The specification configuration name.
     * 
     */
    private String specInfo;
    /**
     * @return The specification configuration version.
     * 
     */
    private Integer version;

    private GetInstanceSpecificationsSpecification() {}
    /**
     * @return CPU Size, Specifications for Micronucleus.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }
    /**
     * @return Whether the instance is available. The value description is as follows:
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The ID of the Instance Specification.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String instanceSpecificationId() {
        return this.instanceSpecificationId;
    }
    /**
     * @return The Memory specifications for the MB.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return The specification configuration name.
     * 
     */
    public String specInfo() {
        return this.specInfo;
    }
    /**
     * @return The specification configuration version.
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceSpecificationsSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpu;
        private Boolean enable;
        private String id;
        private String instanceSpecificationId;
        private Integer memory;
        private String specInfo;
        private Integer version;
        public Builder() {}
        public Builder(GetInstanceSpecificationsSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.enable = defaults.enable;
    	      this.id = defaults.id;
    	      this.instanceSpecificationId = defaults.instanceSpecificationId;
    	      this.memory = defaults.memory;
    	      this.specInfo = defaults.specInfo;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder cpu(Integer cpu) {
            if (cpu == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "cpu");
            }
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "enable");
            }
            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceSpecificationId(String instanceSpecificationId) {
            if (instanceSpecificationId == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "instanceSpecificationId");
            }
            this.instanceSpecificationId = instanceSpecificationId;
            return this;
        }
        @CustomType.Setter
        public Builder memory(Integer memory) {
            if (memory == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "memory");
            }
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder specInfo(String specInfo) {
            if (specInfo == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "specInfo");
            }
            this.specInfo = specInfo;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetInstanceSpecificationsSpecification", "version");
            }
            this.version = version;
            return this;
        }
        public GetInstanceSpecificationsSpecification build() {
            final var _resultValue = new GetInstanceSpecificationsSpecification();
            _resultValue.cpu = cpu;
            _resultValue.enable = enable;
            _resultValue.id = id;
            _resultValue.instanceSpecificationId = instanceSpecificationId;
            _resultValue.memory = memory;
            _resultValue.specInfo = specInfo;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}