// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.CustomScenePolicyArgs;
import com.pulumi.alicloud.esa.inputs.CustomScenePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a ESA Custom Scene Policy resource.
 * 
 * For information about ESA Custom Scene Policy and how to use it, see [What is Custom Scene Policy](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateCustomScenePolicy).
 * 
 * &gt; **NOTE:** Available since v1.253.0.
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
 * import com.pulumi.alicloud.esa.CustomScenePolicy;
 * import com.pulumi.alicloud.esa.CustomScenePolicyArgs;
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
 *         final var name = config.get("name").orElse("bcd58610.com");
 *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
 *             .planSubscribeType("enterpriseplan")
 *             .build());
 * 
 *         var defaultSite = new Site("defaultSite", SiteArgs.builder()
 *             .siteName(name)
 *             .instanceId(default_.sites()[0].instanceId())
 *             .coverage("overseas")
 *             .accessType("NS")
 *             .versionManagement(true)
 *             .build());
 * 
 *         var defaultCustomScenePolicy = new CustomScenePolicy("defaultCustomScenePolicy", CustomScenePolicyArgs.builder()
 *             .endTime("2025-08-07T17:00:00Z")
 *             .createTime("2025-07-07T17:00:00Z")
 *             .siteIds(defaultSite.id())
 *             .template("promotion")
 *             .customScenePolicyName("example-policy")
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
 * ESA Custom Scene Policy can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/customScenePolicy:CustomScenePolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/customScenePolicy:CustomScenePolicy")
public class CustomScenePolicy extends com.pulumi.resources.CustomResource {
    /**
     * The time when the policy takes effect.
     * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the policy takes effect.
     * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The policy name.
     * 
     */
    @Export(name="customScenePolicyName", refs={String.class}, tree="[0]")
    private Output<String> customScenePolicyName;

    /**
     * @return The policy name.
     * 
     */
    public Output<String> customScenePolicyName() {
        return this.customScenePolicyName;
    }
    /**
     * The time when the policy expires.
     * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return The time when the policy expires.
     * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The IDs of websites associated.
     * 
     */
    @Export(name="siteIds", refs={String.class}, tree="[0]")
    private Output<String> siteIds;

    /**
     * @return The IDs of websites associated.
     * 
     */
    public Output<String> siteIds() {
        return this.siteIds;
    }
    /**
     * Policy effective status. Valid values: `Disabled`, `Running`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Policy effective status. Valid values: `Disabled`, `Running`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of the policy template. Valid value:
     * 
     */
    @Export(name="template", refs={String.class}, tree="[0]")
    private Output<String> template;

    /**
     * @return The name of the policy template. Valid value:
     * 
     */
    public Output<String> template() {
        return this.template;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomScenePolicy(java.lang.String name) {
        this(name, CustomScenePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomScenePolicy(java.lang.String name, CustomScenePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomScenePolicy(java.lang.String name, CustomScenePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/customScenePolicy:CustomScenePolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CustomScenePolicy(java.lang.String name, Output<java.lang.String> id, @Nullable CustomScenePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/customScenePolicy:CustomScenePolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static CustomScenePolicyArgs makeArgs(CustomScenePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomScenePolicyArgs.Empty : args;
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
    public static CustomScenePolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable CustomScenePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomScenePolicy(name, id, state, options);
    }
}
