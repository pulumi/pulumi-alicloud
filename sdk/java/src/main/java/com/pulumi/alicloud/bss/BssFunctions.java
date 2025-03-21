// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bss;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesPlainArgs;
import com.pulumi.alicloud.bss.inputs.GetOpenApiProductsArgs;
import com.pulumi.alicloud.bss.inputs.GetOpenApiProductsPlainArgs;
import com.pulumi.alicloud.bss.outputs.GetOpenApiPricingModulesResult;
import com.pulumi.alicloud.bss.outputs.GetOpenApiProductsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class BssFunctions {
    /**
     * This data source provides Bss Open Api Pricing Module available to the user.[What is Pricing Module](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-describepricingmodule)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
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
     * import com.pulumi.alicloud.bss.BssFunctions;
     * import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
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
     *         final var default = BssFunctions.getOpenApiPricingModules(GetOpenApiPricingModulesArgs.builder()
     *             .nameRegex("国内月均日峰值带宽")
     *             .productCode("cdn")
     *             .productType("CDN")
     *             .subscriptionType("PayAsYouGo")
     *             .build());
     * 
     *         ctx.export("alicloudBssOpenapiPricingModuleExampleId", default_.modules()[0].code());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOpenApiPricingModulesResult> getOpenApiPricingModules(GetOpenApiPricingModulesArgs args) {
        return getOpenApiPricingModules(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Pricing Module available to the user.[What is Pricing Module](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-describepricingmodule)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
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
     * import com.pulumi.alicloud.bss.BssFunctions;
     * import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
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
     *         final var default = BssFunctions.getOpenApiPricingModules(GetOpenApiPricingModulesArgs.builder()
     *             .nameRegex("国内月均日峰值带宽")
     *             .productCode("cdn")
     *             .productType("CDN")
     *             .subscriptionType("PayAsYouGo")
     *             .build());
     * 
     *         ctx.export("alicloudBssOpenapiPricingModuleExampleId", default_.modules()[0].code());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOpenApiPricingModulesResult> getOpenApiPricingModulesPlain(GetOpenApiPricingModulesPlainArgs args) {
        return getOpenApiPricingModulesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Pricing Module available to the user.[What is Pricing Module](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-describepricingmodule)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
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
     * import com.pulumi.alicloud.bss.BssFunctions;
     * import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
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
     *         final var default = BssFunctions.getOpenApiPricingModules(GetOpenApiPricingModulesArgs.builder()
     *             .nameRegex("国内月均日峰值带宽")
     *             .productCode("cdn")
     *             .productType("CDN")
     *             .subscriptionType("PayAsYouGo")
     *             .build());
     * 
     *         ctx.export("alicloudBssOpenapiPricingModuleExampleId", default_.modules()[0].code());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOpenApiPricingModulesResult> getOpenApiPricingModules(GetOpenApiPricingModulesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:bss/getOpenApiPricingModules:getOpenApiPricingModules", TypeShape.of(GetOpenApiPricingModulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Bss Open Api Pricing Module available to the user.[What is Pricing Module](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-describepricingmodule)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
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
     * import com.pulumi.alicloud.bss.BssFunctions;
     * import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
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
     *         final var default = BssFunctions.getOpenApiPricingModules(GetOpenApiPricingModulesArgs.builder()
     *             .nameRegex("国内月均日峰值带宽")
     *             .productCode("cdn")
     *             .productType("CDN")
     *             .subscriptionType("PayAsYouGo")
     *             .build());
     * 
     *         ctx.export("alicloudBssOpenapiPricingModuleExampleId", default_.modules()[0].code());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOpenApiPricingModulesResult> getOpenApiPricingModules(GetOpenApiPricingModulesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:bss/getOpenApiPricingModules:getOpenApiPricingModules", TypeShape.of(GetOpenApiPricingModulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Bss Open Api Pricing Module available to the user.[What is Pricing Module](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-describepricingmodule)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
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
     * import com.pulumi.alicloud.bss.BssFunctions;
     * import com.pulumi.alicloud.bss.inputs.GetOpenApiPricingModulesArgs;
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
     *         final var default = BssFunctions.getOpenApiPricingModules(GetOpenApiPricingModulesArgs.builder()
     *             .nameRegex("国内月均日峰值带宽")
     *             .productCode("cdn")
     *             .productType("CDN")
     *             .subscriptionType("PayAsYouGo")
     *             .build());
     * 
     *         ctx.export("alicloudBssOpenapiPricingModuleExampleId", default_.modules()[0].code());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOpenApiPricingModulesResult> getOpenApiPricingModulesPlain(GetOpenApiPricingModulesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:bss/getOpenApiPricingModules:getOpenApiPricingModules", TypeShape.of(GetOpenApiPricingModulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static Output<GetOpenApiProductsResult> getOpenApiProducts() {
        return getOpenApiProducts(GetOpenApiProductsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static CompletableFuture<GetOpenApiProductsResult> getOpenApiProductsPlain() {
        return getOpenApiProductsPlain(GetOpenApiProductsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static Output<GetOpenApiProductsResult> getOpenApiProducts(GetOpenApiProductsArgs args) {
        return getOpenApiProducts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static CompletableFuture<GetOpenApiProductsResult> getOpenApiProductsPlain(GetOpenApiProductsPlainArgs args) {
        return getOpenApiProductsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static Output<GetOpenApiProductsResult> getOpenApiProducts(GetOpenApiProductsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:bss/getOpenApiProducts:getOpenApiProducts", TypeShape.of(GetOpenApiProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static Output<GetOpenApiProductsResult> getOpenApiProducts(GetOpenApiProductsArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:bss/getOpenApiProducts:getOpenApiProducts", TypeShape.of(GetOpenApiProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
     * 
     * &gt; **NOTE:** Available since v1.195.0.
     * 
     */
    public static CompletableFuture<GetOpenApiProductsResult> getOpenApiProductsPlain(GetOpenApiProductsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:bss/getOpenApiProducts:getOpenApiProducts", TypeShape.of(GetOpenApiProductsResult.class), args, Utilities.withVersion(options));
    }
}
