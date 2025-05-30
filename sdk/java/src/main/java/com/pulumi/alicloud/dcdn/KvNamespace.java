// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.KvNamespaceArgs;
import com.pulumi.alicloud.dcdn.inputs.KvNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Dcdn Kv Namespace resource.
 * 
 * For information about Dcdn Kv Namespace and how to use it, see [What is Kv Namespace](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-putdcdnkvnamespace).
 * 
 * &gt; **NOTE:** Available since v1.198.0.
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
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.dcdn.KvNamespace;
 * import com.pulumi.alicloud.dcdn.KvNamespaceArgs;
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
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var defaultKvNamespace = new KvNamespace("defaultKvNamespace", KvNamespaceArgs.builder()
 *             .description(name)
 *             .namespace(String.format("%s-%s", name,default_.result()))
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
 * Dcdn Kv Namespace can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:dcdn/kvNamespace:KvNamespace example 
 * ```
 * 
 */
@ResourceType(type="alicloud:dcdn/kvNamespace:KvNamespace")
public class KvNamespace extends com.pulumi.resources.CustomResource {
    /**
     * Namespace description information
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Namespace description information
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Namespace name. The name can contain letters, digits, hyphens (-), and underscores (_).
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Namespace name. The name can contain letters, digits, hyphens (-), and underscores (_).
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KvNamespace(java.lang.String name) {
        this(name, KvNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KvNamespace(java.lang.String name, KvNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KvNamespace(java.lang.String name, KvNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/kvNamespace:KvNamespace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KvNamespace(java.lang.String name, Output<java.lang.String> id, @Nullable KvNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/kvNamespace:KvNamespace", name, state, makeResourceOptions(options, id), false);
    }

    private static KvNamespaceArgs makeArgs(KvNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KvNamespaceArgs.Empty : args;
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
    public static KvNamespace get(java.lang.String name, Output<java.lang.String> id, @Nullable KvNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KvNamespace(name, id, state, options);
    }
}
