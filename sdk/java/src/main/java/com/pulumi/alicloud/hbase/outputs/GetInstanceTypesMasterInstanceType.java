// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesMasterInstanceType {
    /**
     * @return Cpu size of the instance type.
     * 
     */
    private Integer cpuSize;
    /**
     * @return The hbase instance type of create hbase cluster instance.
     * 
     */
    private String instanceType;
    /**
     * @return Mem size of the instance type.
     * 
     */
    private Integer memSize;

    private GetInstanceTypesMasterInstanceType() {}
    /**
     * @return Cpu size of the instance type.
     * 
     */
    public Integer cpuSize() {
        return this.cpuSize;
    }
    /**
     * @return The hbase instance type of create hbase cluster instance.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Mem size of the instance type.
     * 
     */
    public Integer memSize() {
        return this.memSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesMasterInstanceType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpuSize;
        private String instanceType;
        private Integer memSize;
        public Builder() {}
        public Builder(GetInstanceTypesMasterInstanceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuSize = defaults.cpuSize;
    	      this.instanceType = defaults.instanceType;
    	      this.memSize = defaults.memSize;
        }

        @CustomType.Setter
        public Builder cpuSize(Integer cpuSize) {
            if (cpuSize == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesMasterInstanceType", "cpuSize");
            }
            this.cpuSize = cpuSize;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesMasterInstanceType", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder memSize(Integer memSize) {
            if (memSize == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesMasterInstanceType", "memSize");
            }
            this.memSize = memSize;
            return this;
        }
        public GetInstanceTypesMasterInstanceType build() {
            final var _resultValue = new GetInstanceTypesMasterInstanceType();
            _resultValue.cpuSize = cpuSize;
            _resultValue.instanceType = instanceType;
            _resultValue.memSize = memSize;
            return _resultValue;
        }
    }
}