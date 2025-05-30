// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackParameter {
    /**
     * @return The parameter key.
     * 
     */
    private @Nullable String parameterKey;
    /**
     * @return The parameter value.
     * 
     */
    private String parameterValue;

    private StackParameter() {}
    /**
     * @return The parameter key.
     * 
     */
    public Optional<String> parameterKey() {
        return Optional.ofNullable(this.parameterKey);
    }
    /**
     * @return The parameter value.
     * 
     */
    public String parameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String parameterKey;
        private String parameterValue;
        public Builder() {}
        public Builder(StackParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        @CustomType.Setter
        public Builder parameterKey(@Nullable String parameterKey) {

            this.parameterKey = parameterKey;
            return this;
        }
        @CustomType.Setter
        public Builder parameterValue(String parameterValue) {
            if (parameterValue == null) {
              throw new MissingRequiredPropertyException("StackParameter", "parameterValue");
            }
            this.parameterValue = parameterValue;
            return this;
        }
        public StackParameter build() {
            final var _resultValue = new StackParameter();
            _resultValue.parameterKey = parameterKey;
            _resultValue.parameterValue = parameterValue;
            return _resultValue;
        }
    }
}
