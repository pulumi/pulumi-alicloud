// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiConstantParameter {
    /**
     * @return The description of Constant parameter.
     * 
     */
    private @Nullable String description;
    /**
     * @return Constant parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
     * 
     */
    private String in;
    /**
     * @return Constant parameter name.
     * 
     */
    private String name;
    /**
     * @return Constant parameter value.
     * 
     */
    private String value;

    private ApiConstantParameter() {}
    /**
     * @return The description of Constant parameter.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Constant parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
     * 
     */
    public String in() {
        return this.in;
    }
    /**
     * @return Constant parameter name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Constant parameter value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConstantParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String in;
        private String name;
        private String value;
        public Builder() {}
        public Builder(ApiConstantParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder in(String in) {
            if (in == null) {
              throw new MissingRequiredPropertyException("ApiConstantParameter", "in");
            }
            this.in = in;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ApiConstantParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("ApiConstantParameter", "value");
            }
            this.value = value;
            return this;
        }
        public ApiConstantParameter build() {
            final var _resultValue = new ApiConstantParameter();
            _resultValue.description = description;
            _resultValue.in = in;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
