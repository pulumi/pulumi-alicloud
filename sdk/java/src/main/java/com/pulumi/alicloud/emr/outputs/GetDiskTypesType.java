// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDiskTypesType {
    /**
     * @return The maximum value of the data disk to supported the specific instance type
     * 
     */
    private final Integer max;
    /**
     * @return The mininum value of the data disk to supported the specific instance type
     * 
     */
    private final Integer min;
    /**
     * @return The value of the data disk or system disk
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetDiskTypesType(
        @CustomType.Parameter("max") Integer max,
        @CustomType.Parameter("min") Integer min,
        @CustomType.Parameter("value") String value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }

    /**
     * @return The maximum value of the data disk to supported the specific instance type
     * 
     */
    public Integer max() {
        return this.max;
    }
    /**
     * @return The mininum value of the data disk to supported the specific instance type
     * 
     */
    public Integer min() {
        return this.min;
    }
    /**
     * @return The value of the data disk or system disk
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskTypesType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer max;
        private Integer min;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskTypesType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.value = defaults.value;
        }

        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetDiskTypesType build() {
            return new GetDiskTypesType(max, min, value);
        }
    }
}