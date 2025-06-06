// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ProductPortfolioAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductPortfolioAssociationArgs Empty = new ProductPortfolioAssociationArgs();

    /**
     * Product Portfolio ID
     * 
     */
    @Import(name="portfolioId", required=true)
    private Output<String> portfolioId;

    /**
     * @return Product Portfolio ID
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }

    /**
     * Product ID
     * 
     */
    @Import(name="productId", required=true)
    private Output<String> productId;

    /**
     * @return Product ID
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }

    private ProductPortfolioAssociationArgs() {}

    private ProductPortfolioAssociationArgs(ProductPortfolioAssociationArgs $) {
        this.portfolioId = $.portfolioId;
        this.productId = $.productId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductPortfolioAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductPortfolioAssociationArgs $;

        public Builder() {
            $ = new ProductPortfolioAssociationArgs();
        }

        public Builder(ProductPortfolioAssociationArgs defaults) {
            $ = new ProductPortfolioAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param portfolioId Product Portfolio ID
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(Output<String> portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        /**
         * @param portfolioId Product Portfolio ID
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(String portfolioId) {
            return portfolioId(Output.of(portfolioId));
        }

        /**
         * @param productId Product ID
         * 
         * @return builder
         * 
         */
        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product ID
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public ProductPortfolioAssociationArgs build() {
            if ($.portfolioId == null) {
                throw new MissingRequiredPropertyException("ProductPortfolioAssociationArgs", "portfolioId");
            }
            if ($.productId == null) {
                throw new MissingRequiredPropertyException("ProductPortfolioAssociationArgs", "productId");
            }
            return $;
        }
    }

}
