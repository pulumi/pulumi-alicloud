// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsDedicatedHostClusterArgs;
import com.pulumi.alicloud.ecs.inputs.EcsDedicatedHostClusterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Dedicated Host Cluster resource.
 * 
 * For information about ECS Dedicated Host Cluster and how to use it, see [What is Dedicated Host Cluster](https://www.alibabacloud.com/help/en/doc-detail/184667.html).
 * 
 * &gt; **NOTE:** Available since v1.146.0+.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.ecs.EcsDedicatedHostCluster;
 * import com.pulumi.alicloud.ecs.EcsDedicatedHostClusterArgs;
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
 *         final var example = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .build());
 * 
 *         var exampleEcsDedicatedHostCluster = new EcsDedicatedHostCluster("exampleEcsDedicatedHostCluster", EcsDedicatedHostClusterArgs.builder()
 *             .dedicatedHostClusterName("example_value")
 *             .description("example_value")
 *             .zoneId(example.zones()[0].id())
 *             .tags(Map.ofEntries(
 *                 Map.entry("Create", "TF"),
 *                 Map.entry("For", "DDH_Cluster_Test")
 *             ))
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
 * ECS Dedicated Host Cluster can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster")
public class EcsDedicatedHostCluster extends com.pulumi.resources.CustomResource {
    /**
     * The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     * 
     */
    @Export(name="dedicatedHostClusterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dedicatedHostClusterName;

    /**
     * @return The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> dedicatedHostClusterName() {
        return Codegen.optional(this.dedicatedHostClusterName);
    }
    /**
     * The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the zone in which to create the dedicated host cluster.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The ID of the zone in which to create the dedicated host cluster.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsDedicatedHostCluster(java.lang.String name) {
        this(name, EcsDedicatedHostClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsDedicatedHostCluster(java.lang.String name, EcsDedicatedHostClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsDedicatedHostCluster(java.lang.String name, EcsDedicatedHostClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EcsDedicatedHostCluster(java.lang.String name, Output<java.lang.String> id, @Nullable EcsDedicatedHostClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster", name, state, makeResourceOptions(options, id), false);
    }

    private static EcsDedicatedHostClusterArgs makeArgs(EcsDedicatedHostClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EcsDedicatedHostClusterArgs.Empty : args;
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
    public static EcsDedicatedHostCluster get(java.lang.String name, Output<java.lang.String> id, @Nullable EcsDedicatedHostClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsDedicatedHostCluster(name, id, state, options);
    }
}
