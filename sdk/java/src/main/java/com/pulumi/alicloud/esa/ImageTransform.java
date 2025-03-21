// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.ImageTransformArgs;
import com.pulumi.alicloud.esa.inputs.ImageTransformState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESA Image Transform resource.
 * 
 * For information about ESA Image Transform and how to use it, see [What is Image Transform](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateImageTransform).
 * 
 * &gt; **NOTE:** Available since v1.244.0.
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
 * import com.pulumi.alicloud.esa.EsaFunctions;
 * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
 * import com.pulumi.alicloud.esa.Site;
 * import com.pulumi.alicloud.esa.SiteArgs;
 * import com.pulumi.alicloud.esa.ImageTransform;
 * import com.pulumi.alicloud.esa.ImageTransformArgs;
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
 *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
 *             .planSubscribeType("enterpriseplan")
 *             .build());
 * 
 *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
 *             .siteName("imagetransform.tf.com")
 *             .instanceId(default_.sites()[0].instanceId())
 *             .coverage("domestic")
 *             .accessType("NS")
 *             .build());
 * 
 *         var defaultImageTransform = new ImageTransform("defaultImageTransform", ImageTransformArgs.builder()
 *             .rule("http.host eq \"video.example.com\"")
 *             .siteVersion("0")
 *             .ruleName("rule_example")
 *             .siteId(defaultSite.id())
 *             .ruleEnable("off")
 *             .enable("off")
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
 * ESA Image Transform can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/imageTransform:ImageTransform example &lt;site_id&gt;:&lt;config_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/imageTransform:ImageTransform")
public class ImageTransform extends com.pulumi.resources.CustomResource {
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
     * Indicates whether the image transformations feature is enabled. Valid values:
     * 
     */
    @Export(name="enable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enable;

    /**
     * @return Indicates whether the image transformations feature is enabled. Valid values:
     * 
     */
    public Output<Optional<String>> enable() {
        return Codegen.optional(this.enable);
    }
    /**
     * The rule content, which is a policy or conditional expression.
     * 
     */
    @Export(name="rule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rule;

    /**
     * @return The rule content, which is a policy or conditional expression.
     * 
     */
    public Output<Optional<String>> rule() {
        return Codegen.optional(this.rule);
    }
    /**
     * Indicates whether the rule is enabled. Valid values:
     * 
     */
    @Export(name="ruleEnable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleEnable;

    /**
     * @return Indicates whether the rule is enabled. Valid values:
     * 
     */
    public Output<Optional<String>> ruleEnable() {
        return Codegen.optional(this.ruleEnable);
    }
    /**
     * Rule name, you can find out the rule whose rule name is the passed field.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleName;

    /**
     * @return Rule name, you can find out the rule whose rule name is the passed field.
     * 
     */
    public Output<Optional<String>> ruleName() {
        return Codegen.optional(this.ruleName);
    }
    /**
     * The site ID, which can be obtained by calling the ListSites API.
     * 
     */
    @Export(name="siteId", refs={Integer.class}, tree="[0]")
    private Output<Integer> siteId;

    /**
     * @return The site ID, which can be obtained by calling the ListSites API.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }
    /**
     * The version number of the website.
     * 
     */
    @Export(name="siteVersion", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> siteVersion;

    /**
     * @return The version number of the website.
     * 
     */
    public Output<Optional<Integer>> siteVersion() {
        return Codegen.optional(this.siteVersion);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageTransform(java.lang.String name) {
        this(name, ImageTransformArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageTransform(java.lang.String name, ImageTransformArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageTransform(java.lang.String name, ImageTransformArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/imageTransform:ImageTransform", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ImageTransform(java.lang.String name, Output<java.lang.String> id, @Nullable ImageTransformState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/imageTransform:ImageTransform", name, state, makeResourceOptions(options, id), false);
    }

    private static ImageTransformArgs makeArgs(ImageTransformArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ImageTransformArgs.Empty : args;
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
    public static ImageTransform get(java.lang.String name, Output<java.lang.String> id, @Nullable ImageTransformState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImageTransform(name, id, state, options);
    }
}
