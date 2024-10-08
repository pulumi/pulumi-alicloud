// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.servicecatalog.ProductPortfolioAssociationArgs;
import com.pulumi.alicloud.servicecatalog.inputs.ProductPortfolioAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Service Catalog Product Portfolio Association resource.
 * 
 * Product portfolio association.
 * 
 * For information about Service Catalog Product Portfolio Association and how to use it, see [What is Product Portfolio Association](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-associateproductwithportfolio).
 * 
 * &gt; **NOTE:** Available since v1.230.0.
 * 
 * ## Import
 * 
 * Service Catalog Product Portfolio Association can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example &lt;product_id&gt;:&lt;portfolio_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation")
public class ProductPortfolioAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Product Portfolio ID
     * 
     */
    @Export(name="portfolioId", refs={String.class}, tree="[0]")
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
    @Export(name="productId", refs={String.class}, tree="[0]")
    private Output<String> productId;

    /**
     * @return Product ID
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProductPortfolioAssociation(java.lang.String name) {
        this(name, ProductPortfolioAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProductPortfolioAssociation(java.lang.String name, ProductPortfolioAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductPortfolioAssociation(java.lang.String name, ProductPortfolioAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProductPortfolioAssociation(java.lang.String name, Output<java.lang.String> id, @Nullable ProductPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, state, makeResourceOptions(options, id), false);
    }

    private static ProductPortfolioAssociationArgs makeArgs(ProductPortfolioAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProductPortfolioAssociationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProductPortfolioAssociation get(java.lang.String name, Output<java.lang.String> id, @Nullable ProductPortfolioAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProductPortfolioAssociation(name, id, state, options);
    }
}
