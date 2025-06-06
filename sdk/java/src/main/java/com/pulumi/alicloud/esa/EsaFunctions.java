// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
import com.pulumi.alicloud.esa.inputs.GetSitesPlainArgs;
import com.pulumi.alicloud.esa.outputs.GetSitesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class EsaFunctions {
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSitesResult> getSites() {
        return getSites(GetSitesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain() {
        return getSitesPlain(GetSitesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSitesResult> getSites(GetSitesArgs args) {
        return getSites(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain(GetSitesPlainArgs args) {
        return getSitesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSitesResult> getSites(GetSitesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:esa/getSites:getSites", TypeShape.of(GetSitesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSitesResult> getSites(GetSitesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:esa/getSites:getSites", TypeShape.of(GetSitesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Esa Site available to the user.[What is Site](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateSite)
     * 
     * &gt; **NOTE:** Available since v1.244.0.
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
     * import com.pulumi.alicloud.esa.RatePlanInstance;
     * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
     * import com.pulumi.alicloud.esa.Site;
     * import com.pulumi.alicloud.esa.SiteArgs;
     * import com.pulumi.alicloud.esa.EsaFunctions;
     * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
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
     *         var defaultIEoDfU = new RatePlanInstance("defaultIEoDfU", RatePlanInstanceArgs.builder()
     *             .type("NS")
     *             .autoRenew(true)
     *             .period(1)
     *             .paymentType("Subscription")
     *             .coverage("overseas")
     *             .autoPay(true)
     *             .planName("basic")
     *             .build());
     * 
     *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
     *             .siteName("bcd.com")
     *             .coverage("overseas")
     *             .accessType("NS")
     *             .instanceId(defaultIEoDfU.id())
     *             .build());
     * 
     *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
     *             .ids(defaultSite.id())
     *             .nameRegex(defaultSite.siteName())
     *             .siteName("bcd.com")
     *             .build());
     * 
     *         ctx.export("alicloudEsaSiteExampleId", default_.applyValue(_default_ -> _default_.sites()[0].id()));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSitesResult> getSitesPlain(GetSitesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:esa/getSites:getSites", TypeShape.of(GetSitesResult.class), args, Utilities.withVersion(options));
    }
}
