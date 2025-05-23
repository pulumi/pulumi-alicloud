// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fc.V3AliasArgs;
import com.pulumi.alicloud.fc.inputs.V3AliasState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a FCV3 Alias resource.
 * 
 * Alias for functions.
 * 
 * For information about FCV3 Alias and how to use it, see [What is Alias](https://www.alibabacloud.com/help/en/functioncompute/developer-reference/api-fc-2023-03-30-createalias).
 * 
 * &gt; **NOTE:** Available since v1.228.0.
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
 * import com.pulumi.alicloud.fc.V3Alias;
 * import com.pulumi.alicloud.fc.V3AliasArgs;
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
 *         final var functionName = config.get("functionName").orElse("flask-3xdg");
 *         var default_ = new V3Alias("default", V3AliasArgs.builder()
 *             .versionId("1")
 *             .functionName(functionName)
 *             .description("create alias")
 *             .aliasName(name)
 *             .additionalVersionWeight(Map.of("2", 0.5))
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
 * FCV3 Alias can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:fc/v3Alias:V3Alias example &lt;function_name&gt;:&lt;alias_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:fc/v3Alias:V3Alias")
public class V3Alias extends com.pulumi.resources.CustomResource {
    /**
     * Grayscale version
     * 
     */
    @Export(name="additionalVersionWeight", refs={Map.class,String.class,Double.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Double>> additionalVersionWeight;

    /**
     * @return Grayscale version
     * 
     */
    public Output<Optional<Map<String,Double>>> additionalVersionWeight() {
        return Codegen.optional(this.additionalVersionWeight);
    }
    /**
     * Function Alias
     * 
     */
    @Export(name="aliasName", refs={String.class}, tree="[0]")
    private Output<String> aliasName;

    /**
     * @return Function Alias
     * 
     */
    public Output<String> aliasName() {
        return this.aliasName;
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
     * Description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Function Name
     * 
     */
    @Export(name="functionName", refs={String.class}, tree="[0]")
    private Output<String> functionName;

    /**
     * @return Function Name
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * (Available since v1.234.0) Last modification time
     * 
     */
    @Export(name="lastModifiedTime", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedTime;

    /**
     * @return (Available since v1.234.0) Last modification time
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The version that the alias points
     * 
     */
    @Export(name="versionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> versionId;

    /**
     * @return The version that the alias points
     * 
     */
    public Output<Optional<String>> versionId() {
        return Codegen.optional(this.versionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public V3Alias(java.lang.String name) {
        this(name, V3AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public V3Alias(java.lang.String name, V3AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public V3Alias(java.lang.String name, V3AliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/v3Alias:V3Alias", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private V3Alias(java.lang.String name, Output<java.lang.String> id, @Nullable V3AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/v3Alias:V3Alias", name, state, makeResourceOptions(options, id), false);
    }

    private static V3AliasArgs makeArgs(V3AliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? V3AliasArgs.Empty : args;
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
    public static V3Alias get(java.lang.String name, Output<java.lang.String> id, @Nullable V3AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new V3Alias(name, id, state, options);
    }
}
