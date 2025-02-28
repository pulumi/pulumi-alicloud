// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.marketplace;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
import com.pulumi.alicloud.marketplace.inputs.GetProductPlainArgs;
import com.pulumi.alicloud.marketplace.inputs.GetProductsArgs;
import com.pulumi.alicloud.marketplace.inputs.GetProductsPlainArgs;
import com.pulumi.alicloud.marketplace.outputs.GetProductResult;
import com.pulumi.alicloud.marketplace.outputs.GetProductsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class MarketplaceFunctions {
    /**
     * This data source provides the Market product item details of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.69.0+
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.marketplace.MarketplaceFunctions;
     * import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
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
     *         final var default = MarketplaceFunctions.getProduct(GetProductArgs.builder()
     *             .productCode("cmapi022206")
     *             .build());
     * 
     *         ctx.export("productName", default_.products()[0].name());
     *         ctx.export("firstProductSkuCode", default_.products()[0].skuses()[0].skuCode());
     *         ctx.export("firstProductPackageVersion", default_.products()[0].skuses()[0].packageVersions()[0].packageVersion());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product item details of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.69.0+
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.marketplace.MarketplaceFunctions;
     * import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
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
     *         final var default = MarketplaceFunctions.getProduct(GetProductArgs.builder()
     *             .productCode("cmapi022206")
     *             .build());
     * 
     *         ctx.export("productName", default_.products()[0].name());
     *         ctx.export("firstProductSkuCode", default_.products()[0].skuses()[0].skuCode());
     *         ctx.export("firstProductPackageVersion", default_.products()[0].skuses()[0].packageVersions()[0].packageVersion());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args) {
        return getProductPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product item details of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.69.0+
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.marketplace.MarketplaceFunctions;
     * import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
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
     *         final var default = MarketplaceFunctions.getProduct(GetProductArgs.builder()
     *             .productCode("cmapi022206")
     *             .build());
     * 
     *         ctx.export("productName", default_.products()[0].name());
     *         ctx.export("firstProductSkuCode", default_.products()[0].skuses()[0].skuCode());
     *         ctx.export("firstProductPackageVersion", default_.products()[0].skuses()[0].packageVersions()[0].packageVersion());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:marketplace/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Market product item details of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.69.0+
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.marketplace.MarketplaceFunctions;
     * import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
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
     *         final var default = MarketplaceFunctions.getProduct(GetProductArgs.builder()
     *             .productCode("cmapi022206")
     *             .build());
     * 
     *         ctx.export("productName", default_.products()[0].name());
     *         ctx.export("firstProductSkuCode", default_.products()[0].skuses()[0].skuCode());
     *         ctx.export("firstProductPackageVersion", default_.products()[0].skuses()[0].packageVersions()[0].packageVersion());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:marketplace/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Market product item details of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.69.0+
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.marketplace.MarketplaceFunctions;
     * import com.pulumi.alicloud.marketplace.inputs.GetProductArgs;
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
     *         final var default = MarketplaceFunctions.getProduct(GetProductArgs.builder()
     *             .productCode("cmapi022206")
     *             .build());
     * 
     *         ctx.export("productName", default_.products()[0].name());
     *         ctx.export("firstProductSkuCode", default_.products()[0].skuses()[0].skuCode());
     *         ctx.export("firstProductPackageVersion", default_.products()[0].skuses()[0].packageVersions()[0].packageVersion());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:marketplace/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static Output<GetProductsResult> getProducts() {
        return getProducts(GetProductsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain() {
        return getProductsPlain(GetProductsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static Output<GetProductsResult> getProducts(GetProductsArgs args) {
        return getProducts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain(GetProductsPlainArgs args) {
        return getProductsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static Output<GetProductsResult> getProducts(GetProductsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:marketplace/getProducts:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static Output<GetProductsResult> getProducts(GetProductsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:marketplace/getProducts:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Market product items of Alibaba Cloud.
     * 
     * &gt; **NOTE:** Available in 1.64.0+
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain(GetProductsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:marketplace/getProducts:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
}
