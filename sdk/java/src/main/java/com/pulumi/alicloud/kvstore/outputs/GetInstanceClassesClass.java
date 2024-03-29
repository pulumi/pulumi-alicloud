// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceClassesClass {
    /**
     * @return KVStore available instance class.
     * 
     */
    private String instanceClass;
    private String price;

    private GetInstanceClassesClass() {}
    /**
     * @return KVStore available instance class.
     * 
     */
    public String instanceClass() {
        return this.instanceClass;
    }
    public String price() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceClassesClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceClass;
        private String price;
        public Builder() {}
        public Builder(GetInstanceClassesClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceClass = defaults.instanceClass;
    	      this.price = defaults.price;
        }

        @CustomType.Setter
        public Builder instanceClass(String instanceClass) {
            if (instanceClass == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesClass", "instanceClass");
            }
            this.instanceClass = instanceClass;
            return this;
        }
        @CustomType.Setter
        public Builder price(String price) {
            if (price == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesClass", "price");
            }
            this.price = price;
            return this;
        }
        public GetInstanceClassesClass build() {
            final var _resultValue = new GetInstanceClassesClass();
            _resultValue.instanceClass = instanceClass;
            _resultValue.price = price;
            return _resultValue;
        }
    }
}
