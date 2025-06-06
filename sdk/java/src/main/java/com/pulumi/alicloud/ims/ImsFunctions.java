// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ims;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
import com.pulumi.alicloud.ims.inputs.GetOidcProvidersPlainArgs;
import com.pulumi.alicloud.ims.outputs.GetOidcProvidersResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class ImsFunctions {
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOidcProvidersResult> getOidcProviders() {
        return getOidcProviders(GetOidcProvidersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOidcProvidersResult> getOidcProvidersPlain() {
        return getOidcProvidersPlain(GetOidcProvidersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOidcProvidersResult> getOidcProviders(GetOidcProvidersArgs args) {
        return getOidcProviders(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOidcProvidersResult> getOidcProvidersPlain(GetOidcProvidersPlainArgs args) {
        return getOidcProvidersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOidcProvidersResult> getOidcProviders(GetOidcProvidersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ims/getOidcProviders:getOidcProviders", TypeShape.of(GetOidcProvidersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOidcProvidersResult> getOidcProviders(GetOidcProvidersArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:ims/getOidcProviders:getOidcProviders", TypeShape.of(GetOidcProvidersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Ims Oidc Provider available to the user.[What is Oidc Provider](https://next.api.alibabacloud.com/document/Ims/2019-08-15/CreateOIDCProvider)
     * 
     * &gt; **NOTE:** Available since v1.248.0.
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
     * import com.pulumi.alicloud.ims.OidcProvider;
     * import com.pulumi.alicloud.ims.OidcProviderArgs;
     * import com.pulumi.alicloud.ims.ImsFunctions;
     * import com.pulumi.alicloud.ims.inputs.GetOidcProvidersArgs;
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
     *         final var oidcProviderName = config.get("oidcProviderName").orElse("amp-resource-example-oidc-provider");
     *         var defaultOidcProvider = new OidcProvider("defaultOidcProvider", OidcProviderArgs.builder()
     *             .description(oidcProviderName)
     *             .issuerUrl("https://oauth.aliyun.com")
     *             .fingerprints("0BBFAB97059595E8D1EC48E89EB8657C0E5AAE71")
     *             .issuanceLimitTime(12)
     *             .oidcProviderName(oidcProviderName)
     *             .clientIds(            
     *                 "123",
     *                 "456")
     *             .build());
     * 
     *         final var default = ImsFunctions.getOidcProviders(GetOidcProvidersArgs.builder()
     *             .ids(defaultOidcProvider.id())
     *             .build());
     * 
     *         ctx.export("alicloudImsOidcProviderExampleId", default_.applyValue(_default_ -> _default_.providers()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOidcProvidersResult> getOidcProvidersPlain(GetOidcProvidersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ims/getOidcProviders:getOidcProviders", TypeShape.of(GetOidcProvidersResult.class), args, Utilities.withVersion(options));
    }
}
