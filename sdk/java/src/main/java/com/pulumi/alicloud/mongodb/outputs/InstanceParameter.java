// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceParameter {
    /**
     * @return The name of the parameter.
     * 
     */
    private String name;
    /**
     * @return The value of the parameter.
     * 
     */
    private String value;

    private InstanceParameter() {}
    /**
     * @return The name of the parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(InstanceParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("InstanceParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("InstanceParameter", "value");
            }
            this.value = value;
            return this;
        }
        public InstanceParameter build() {
            final var _resultValue = new InstanceParameter();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}