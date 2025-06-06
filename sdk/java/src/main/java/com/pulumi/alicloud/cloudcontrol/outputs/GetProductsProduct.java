// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudcontrol.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductsProduct {
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    private String id;
    /**
     * @return The first ID of the resource
     * 
     */
    private String productCode;
    /**
     * @return The name of the resource
     * 
     */
    private String productName;

    private GetProductsProduct() {}
    /**
     * @return The ID of the resource supplied above.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The first ID of the resource
     * 
     */
    public String productCode() {
        return this.productCode;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String productName() {
        return this.productName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductsProduct defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String productCode;
        private String productName;
        public Builder() {}
        public Builder(GetProductsProduct defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.productCode = defaults.productCode;
    	      this.productName = defaults.productName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetProductsProduct", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder productCode(String productCode) {
            if (productCode == null) {
              throw new MissingRequiredPropertyException("GetProductsProduct", "productCode");
            }
            this.productCode = productCode;
            return this;
        }
        @CustomType.Setter
        public Builder productName(String productName) {
            if (productName == null) {
              throw new MissingRequiredPropertyException("GetProductsProduct", "productName");
            }
            this.productName = productName;
            return this;
        }
        public GetProductsProduct build() {
            final var _resultValue = new GetProductsProduct();
            _resultValue.id = id;
            _resultValue.productCode = productCode;
            _resultValue.productName = productName;
            return _resultValue;
        }
    }
}
