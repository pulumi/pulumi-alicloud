// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SolutionInstanceParameter {
    /**
     * @return Create parameter Key.
     * 
     */
    private String parameterKey;
    /**
     * @return Create parameter Value.
     * 
     */
    private String parameterValue;

    private SolutionInstanceParameter() {}
    /**
     * @return Create parameter Key.
     * 
     */
    public String parameterKey() {
        return this.parameterKey;
    }
    /**
     * @return Create parameter Value.
     * 
     */
    public String parameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionInstanceParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String parameterKey;
        private String parameterValue;
        public Builder() {}
        public Builder(SolutionInstanceParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        @CustomType.Setter
        public Builder parameterKey(String parameterKey) {
            if (parameterKey == null) {
              throw new MissingRequiredPropertyException("SolutionInstanceParameter", "parameterKey");
            }
            this.parameterKey = parameterKey;
            return this;
        }
        @CustomType.Setter
        public Builder parameterValue(String parameterValue) {
            if (parameterValue == null) {
              throw new MissingRequiredPropertyException("SolutionInstanceParameter", "parameterValue");
            }
            this.parameterValue = parameterValue;
            return this;
        }
        public SolutionInstanceParameter build() {
            final var _resultValue = new SolutionInstanceParameter();
            _resultValue.parameterKey = parameterKey;
            _resultValue.parameterValue = parameterValue;
            return _resultValue;
        }
    }
}
