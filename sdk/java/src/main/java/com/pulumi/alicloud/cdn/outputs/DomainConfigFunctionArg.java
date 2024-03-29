// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainConfigFunctionArg {
    /**
     * @return The name of arg.
     * 
     */
    private String argName;
    /**
     * @return The value of arg.
     * 
     */
    private String argValue;

    private DomainConfigFunctionArg() {}
    /**
     * @return The name of arg.
     * 
     */
    public String argName() {
        return this.argName;
    }
    /**
     * @return The value of arg.
     * 
     */
    public String argValue() {
        return this.argValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigFunctionArg defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String argName;
        private String argValue;
        public Builder() {}
        public Builder(DomainConfigFunctionArg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argName = defaults.argName;
    	      this.argValue = defaults.argValue;
        }

        @CustomType.Setter
        public Builder argName(String argName) {
            if (argName == null) {
              throw new MissingRequiredPropertyException("DomainConfigFunctionArg", "argName");
            }
            this.argName = argName;
            return this;
        }
        @CustomType.Setter
        public Builder argValue(String argValue) {
            if (argValue == null) {
              throw new MissingRequiredPropertyException("DomainConfigFunctionArg", "argValue");
            }
            this.argValue = argValue;
            return this;
        }
        public DomainConfigFunctionArg build() {
            final var _resultValue = new DomainConfigFunctionArg();
            _resultValue.argName = argName;
            _resultValue.argValue = argValue;
            return _resultValue;
        }
    }
}
