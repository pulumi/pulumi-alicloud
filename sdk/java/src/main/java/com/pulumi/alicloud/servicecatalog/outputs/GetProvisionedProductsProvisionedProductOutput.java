// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProvisionedProductsProvisionedProductOutput {
    private String description;
    private String outputKey;
    private String outputValue;

    private GetProvisionedProductsProvisionedProductOutput() {}
    public String description() {
        return this.description;
    }
    public String outputKey() {
        return this.outputKey;
    }
    public String outputValue() {
        return this.outputValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProvisionedProductsProvisionedProductOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String outputKey;
        private String outputValue;
        public Builder() {}
        public Builder(GetProvisionedProductsProvisionedProductOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.outputKey = defaults.outputKey;
    	      this.outputValue = defaults.outputValue;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder outputKey(String outputKey) {
            this.outputKey = Objects.requireNonNull(outputKey);
            return this;
        }
        @CustomType.Setter
        public Builder outputValue(String outputValue) {
            this.outputValue = Objects.requireNonNull(outputValue);
            return this;
        }
        public GetProvisionedProductsProvisionedProductOutput build() {
            final var o = new GetProvisionedProductsProvisionedProductOutput();
            o.description = description;
            o.outputKey = outputKey;
            o.outputValue = outputValue;
            return o;
        }
    }
}