// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesInstanceTypeLocalStorage {
    /**
     * @return The number of local storage devices that an instance has been attached to.
     * 
     */
    private String amount;
    /**
     * @return The capacity of a local storage in GB.
     * 
     */
    private String capacity;
    /**
     * @return The category of local storage that an instance has been attached to.
     * 
     */
    private String category;

    private GetInstanceTypesInstanceTypeLocalStorage() {}
    /**
     * @return The number of local storage devices that an instance has been attached to.
     * 
     */
    public String amount() {
        return this.amount;
    }
    /**
     * @return The capacity of a local storage in GB.
     * 
     */
    public String capacity() {
        return this.capacity;
    }
    /**
     * @return The category of local storage that an instance has been attached to.
     * 
     */
    public String category() {
        return this.category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesInstanceTypeLocalStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amount;
        private String capacity;
        private String category;
        public Builder() {}
        public Builder(GetInstanceTypesInstanceTypeLocalStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.capacity = defaults.capacity;
    	      this.category = defaults.category;
        }

        @CustomType.Setter
        public Builder amount(String amount) {
            if (amount == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceTypeLocalStorage", "amount");
            }
            this.amount = amount;
            return this;
        }
        @CustomType.Setter
        public Builder capacity(String capacity) {
            if (capacity == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceTypeLocalStorage", "capacity");
            }
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceTypeLocalStorage", "category");
            }
            this.category = category;
            return this;
        }
        public GetInstanceTypesInstanceTypeLocalStorage build() {
            final var _resultValue = new GetInstanceTypesInstanceTypeLocalStorage();
            _resultValue.amount = amount;
            _resultValue.capacity = capacity;
            _resultValue.category = category;
            return _resultValue;
        }
    }
}
