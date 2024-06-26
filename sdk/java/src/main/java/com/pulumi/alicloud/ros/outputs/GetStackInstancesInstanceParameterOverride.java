// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStackInstancesInstanceParameterOverride {
    /**
     * @return The key of override parameter.
     * 
     */
    private String parameterKey;
    /**
     * @return The value of override parameter.
     * 
     */
    private String parameterValue;

    private GetStackInstancesInstanceParameterOverride() {}
    /**
     * @return The key of override parameter.
     * 
     */
    public String parameterKey() {
        return this.parameterKey;
    }
    /**
     * @return The value of override parameter.
     * 
     */
    public String parameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackInstancesInstanceParameterOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String parameterKey;
        private String parameterValue;
        public Builder() {}
        public Builder(GetStackInstancesInstanceParameterOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        @CustomType.Setter
        public Builder parameterKey(String parameterKey) {
            if (parameterKey == null) {
              throw new MissingRequiredPropertyException("GetStackInstancesInstanceParameterOverride", "parameterKey");
            }
            this.parameterKey = parameterKey;
            return this;
        }
        @CustomType.Setter
        public Builder parameterValue(String parameterValue) {
            if (parameterValue == null) {
              throw new MissingRequiredPropertyException("GetStackInstancesInstanceParameterOverride", "parameterValue");
            }
            this.parameterValue = parameterValue;
            return this;
        }
        public GetStackInstancesInstanceParameterOverride build() {
            final var _resultValue = new GetStackInstancesInstanceParameterOverride();
            _resultValue.parameterKey = parameterKey;
            _resultValue.parameterValue = parameterValue;
            return _resultValue;
        }
    }
}
