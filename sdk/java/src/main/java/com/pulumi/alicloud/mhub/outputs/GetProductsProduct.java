// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mhub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductsProduct {
    /**
     * @return The ID of the Product.
     * 
     */
    private String id;
    /**
     * @return The ID of the Product.
     * 
     */
    private String productId;
    /**
     * @return The name of the Product.
     * 
     */
    private String productName;

    private GetProductsProduct() {}
    /**
     * @return The ID of the Product.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Product.
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return The name of the Product.
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
        private String productId;
        private String productName;
        public Builder() {}
        public Builder(GetProductsProduct defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.productId = defaults.productId;
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
        public Builder productId(String productId) {
            if (productId == null) {
              throw new MissingRequiredPropertyException("GetProductsProduct", "productId");
            }
            this.productId = productId;
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
            _resultValue.productId = productId;
            _resultValue.productName = productName;
            return _resultValue;
        }
    }
}