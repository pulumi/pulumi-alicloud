// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.servicecatalog.ProductVersionArgs;
import com.pulumi.alicloud.servicecatalog.inputs.ProductVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Service Catalog Product Version resource.
 * 
 * There can be one or more versions of the product.
 * 
 * For information about Service Catalog Product Version and how to use it, see [What is Product Version](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-createproductversion).
 * 
 * &gt; **NOTE:** Available since v1.230.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.servicecatalog.Product;
 * import com.pulumi.alicloud.servicecatalog.ProductArgs;
 * import com.pulumi.alicloud.servicecatalog.ProductVersion;
 * import com.pulumi.alicloud.servicecatalog.ProductVersionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("terraform-example");
 *         var defaultmaeTcE = new Product("defaultmaeTcE", ProductArgs.builder()
 *             .providerName(name)
 *             .productName(name)
 *             .productType("Ros")
 *             .build());
 * 
 *         var default_ = new ProductVersion("default", ProductVersionArgs.builder()
 *             .guidance("Default")
 *             .templateUrl("oss://servicecatalog-cn-hangzhou/1466115886172051/terraform/template/tpl-bp1x4v3r44u7u7/template.json")
 *             .active(true)
 *             .description("产品版本测试")
 *             .productVersionName(name)
 *             .productId(defaultmaeTcE.id())
 *             .templateType("RosTerraformTemplate")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Service Catalog Product Version can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:servicecatalog/productVersion:ProductVersion example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:servicecatalog/productVersion:ProductVersion")
public class ProductVersion extends com.pulumi.resources.CustomResource {
    /**
     * Whether the version is activated
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Whether the version is activated
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Version description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Version description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Administrator guidance
     * 
     */
    @Export(name="guidance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> guidance;

    /**
     * @return Administrator guidance
     * 
     */
    public Output<Optional<String>> guidance() {
        return Codegen.optional(this.guidance);
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
     * The name of the resource
     * 
     */
    @Export(name="productVersionName", refs={String.class}, tree="[0]")
    private Output<String> productVersionName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> productVersionName() {
        return this.productVersionName;
    }
    /**
     * Template Type
     * 
     */
    @Export(name="templateType", refs={String.class}, tree="[0]")
    private Output<String> templateType;

    /**
     * @return Template Type
     * 
     */
    public Output<String> templateType() {
        return this.templateType;
    }
    /**
     * Template URL
     * 
     */
    @Export(name="templateUrl", refs={String.class}, tree="[0]")
    private Output<String> templateUrl;

    /**
     * @return Template URL
     * 
     */
    public Output<String> templateUrl() {
        return this.templateUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProductVersion(java.lang.String name) {
        this(name, ProductVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProductVersion(java.lang.String name, ProductVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductVersion(java.lang.String name, ProductVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/productVersion:ProductVersion", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProductVersion(java.lang.String name, Output<java.lang.String> id, @Nullable ProductVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/productVersion:ProductVersion", name, state, makeResourceOptions(options, id), false);
    }

    private static ProductVersionArgs makeArgs(ProductVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProductVersionArgs.Empty : args;
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
    public static ProductVersion get(java.lang.String name, Output<java.lang.String> id, @Nullable ProductVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProductVersion(name, id, state, options);
    }
}
