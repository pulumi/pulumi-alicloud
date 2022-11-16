// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomPropertyPropertyValue {
    /**
     * @return The value of an attribute.
     * 
     */
    private final @Nullable String propertyValue;
    /**
     * @return The value of an attribute id.
     * 
     */
    private final @Nullable String propertyValueId;

    @CustomType.Constructor
    private CustomPropertyPropertyValue(
        @CustomType.Parameter("propertyValue") @Nullable String propertyValue,
        @CustomType.Parameter("propertyValueId") @Nullable String propertyValueId) {
        this.propertyValue = propertyValue;
        this.propertyValueId = propertyValueId;
    }

    /**
     * @return The value of an attribute.
     * 
     */
    public Optional<String> propertyValue() {
        return Optional.ofNullable(this.propertyValue);
    }
    /**
     * @return The value of an attribute id.
     * 
     */
    public Optional<String> propertyValueId() {
        return Optional.ofNullable(this.propertyValueId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPropertyPropertyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String propertyValue;
        private @Nullable String propertyValueId;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPropertyPropertyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyValue = defaults.propertyValue;
    	      this.propertyValueId = defaults.propertyValueId;
        }

        public Builder propertyValue(@Nullable String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public Builder propertyValueId(@Nullable String propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }        public CustomPropertyPropertyValue build() {
            return new CustomPropertyPropertyValue(propertyValue, propertyValueId);
        }
    }
}