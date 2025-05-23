// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.HttpResponseHeaderModificationRuleArgs;
import com.pulumi.alicloud.esa.inputs.HttpResponseHeaderModificationRuleState;
import com.pulumi.alicloud.esa.outputs.HttpResponseHeaderModificationRuleResponseHeaderModification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESA Http Response Header Modification Rule resource.
 * 
 * For information about ESA Http Response Header Modification Rule and how to use it, see [What is Http Response Header Modification Rule](https://www.alibabacloud.com/help/en/edge-security-acceleration/esa/api-esa-2024-09-10-createhttpresponseheadermodificationrule).
 * 
 * &gt; **NOTE:** Available since v1.243.0.
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
 * import com.pulumi.alicloud.esa.RatePlanInstance;
 * import com.pulumi.alicloud.esa.RatePlanInstanceArgs;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.esa.Site;
 * import com.pulumi.alicloud.esa.SiteArgs;
 * import com.pulumi.alicloud.esa.HttpResponseHeaderModificationRule;
 * import com.pulumi.alicloud.esa.HttpResponseHeaderModificationRuleArgs;
 * import com.pulumi.alicloud.esa.inputs.HttpResponseHeaderModificationRuleResponseHeaderModificationArgs;
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
 *         var resourceHttpResponseHeaderModificationRuleExample = new RatePlanInstance("resourceHttpResponseHeaderModificationRuleExample", RatePlanInstanceArgs.builder()
 *             .type("NS")
 *             .autoRenew(false)
 *             .period(1)
 *             .paymentType("Subscription")
 *             .coverage("overseas")
 *             .autoPay(true)
 *             .planName("high")
 *             .build());
 * 
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var resourceSiteHttpResponseHeaderModificationRuleExample = new Site("resourceSiteHttpResponseHeaderModificationRuleExample", SiteArgs.builder()
 *             .siteName(String.format("gositecdn-%s.cn", default_.result()))
 *             .instanceId(resourceHttpResponseHeaderModificationRuleExample.id())
 *             .coverage("overseas")
 *             .accessType("NS")
 *             .build());
 * 
 *         var defaultHttpResponseHeaderModificationRule = new HttpResponseHeaderModificationRule("defaultHttpResponseHeaderModificationRule", HttpResponseHeaderModificationRuleArgs.builder()
 *             .ruleEnable("on")
 *             .responseHeaderModifications(            
 *                 HttpResponseHeaderModificationRuleResponseHeaderModificationArgs.builder()
 *                     .value("add")
 *                     .operation("add")
 *                     .name("exampleadd")
 *                     .build(),
 *                 HttpResponseHeaderModificationRuleResponseHeaderModificationArgs.builder()
 *                     .operation("del")
 *                     .name("exampledel")
 *                     .build(),
 *                 HttpResponseHeaderModificationRuleResponseHeaderModificationArgs.builder()
 *                     .operation("modify")
 *                     .name("examplemodify")
 *                     .value("modify")
 *                     .build())
 *             .rule("(http.host eq \"video.example.com\")")
 *             .siteVersion(0)
 *             .ruleName("exampleResponseHeader")
 *             .siteId(resourceSiteHttpResponseHeaderModificationRuleExample.id())
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
 * ESA Http Response Header Modification Rule can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule example &lt;site_id&gt;:&lt;config_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule")
public class HttpResponseHeaderModificationRule extends com.pulumi.resources.CustomResource {
    /**
     * Config Id
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Config Id
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
     * 
     */
    @Export(name="responseHeaderModifications", refs={List.class,HttpResponseHeaderModificationRuleResponseHeaderModification.class}, tree="[0,1]")
    private Output<List<HttpResponseHeaderModificationRuleResponseHeaderModification>> responseHeaderModifications;

    /**
     * @return Modify response headers, supporting add, delete, and modify operations. See `response_header_modification` below.
     * 
     */
    public Output<List<HttpResponseHeaderModificationRuleResponseHeaderModification>> responseHeaderModifications() {
        return this.responseHeaderModifications;
    }
    /**
     * Rule content.
     * 
     */
    @Export(name="rule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rule;

    /**
     * @return Rule content.
     * 
     */
    public Output<Optional<String>> rule() {
        return Codegen.optional(this.rule);
    }
    /**
     * Rule switch. Possible values:
     * 
     */
    @Export(name="ruleEnable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleEnable;

    /**
     * @return Rule switch. Possible values:
     * 
     */
    public Output<Optional<String>> ruleEnable() {
        return Codegen.optional(this.ruleEnable);
    }
    /**
     * Rule name.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleName;

    /**
     * @return Rule name.
     * 
     */
    public Output<Optional<String>> ruleName() {
        return Codegen.optional(this.ruleName);
    }
    /**
     * The site ID.
     * 
     */
    @Export(name="siteId", refs={Integer.class}, tree="[0]")
    private Output<Integer> siteId;

    /**
     * @return The site ID.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }
    /**
     * The version number of the website configurations.
     * 
     */
    @Export(name="siteVersion", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> siteVersion;

    /**
     * @return The version number of the website configurations.
     * 
     */
    public Output<Optional<Integer>> siteVersion() {
        return Codegen.optional(this.siteVersion);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpResponseHeaderModificationRule(java.lang.String name) {
        this(name, HttpResponseHeaderModificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpResponseHeaderModificationRule(java.lang.String name, HttpResponseHeaderModificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpResponseHeaderModificationRule(java.lang.String name, HttpResponseHeaderModificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HttpResponseHeaderModificationRule(java.lang.String name, Output<java.lang.String> id, @Nullable HttpResponseHeaderModificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/httpResponseHeaderModificationRule:HttpResponseHeaderModificationRule", name, state, makeResourceOptions(options, id), false);
    }

    private static HttpResponseHeaderModificationRuleArgs makeArgs(HttpResponseHeaderModificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HttpResponseHeaderModificationRuleArgs.Empty : args;
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
    public static HttpResponseHeaderModificationRule get(java.lang.String name, Output<java.lang.String> id, @Nullable HttpResponseHeaderModificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpResponseHeaderModificationRule(name, id, state, options);
    }
}
