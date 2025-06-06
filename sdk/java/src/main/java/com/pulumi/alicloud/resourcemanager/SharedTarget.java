// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.SharedTargetArgs;
import com.pulumi.alicloud.resourcemanager.inputs.SharedTargetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Shared Target resource.
 * 
 * For information about Resource Manager Shared Target and how to use it, see [What is Shared Target](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).
 * 
 * &gt; **NOTE:** Available since v1.111.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetAccountsArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourceShare;
 * import com.pulumi.alicloud.resourcemanager.ResourceShareArgs;
 * import com.pulumi.alicloud.resourcemanager.SharedTarget;
 * import com.pulumi.alicloud.resourcemanager.SharedTargetArgs;
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
 *         final var name = config.get("name").orElse("tfexample");
 *         final var default = ResourcemanagerFunctions.getAccounts(GetAccountsArgs.builder()
 *             .build());
 * 
 *         var example = new ResourceShare("example", ResourceShareArgs.builder()
 *             .resourceShareName(name)
 *             .build());
 * 
 *         var exampleSharedTarget = new SharedTarget("exampleSharedTarget", SharedTargetArgs.builder()
 *             .resourceShareId(example.id())
 *             .targetId(default_.ids()[0])
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
 * Resource Manager Shared Target can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:resourcemanager/sharedTarget:SharedTarget example &lt;resource_share_id&gt;:&lt;target_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/sharedTarget:SharedTarget")
public class SharedTarget extends com.pulumi.resources.CustomResource {
    /**
     * The resource share ID of resource manager.
     * 
     */
    @Export(name="resourceShareId", refs={String.class}, tree="[0]")
    private Output<String> resourceShareId;

    /**
     * @return The resource share ID of resource manager.
     * 
     */
    public Output<String> resourceShareId() {
        return this.resourceShareId;
    }
    /**
     * The status of shared target.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of shared target.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The member account ID in resource directory.
     * 
     */
    @Export(name="targetId", refs={String.class}, tree="[0]")
    private Output<String> targetId;

    /**
     * @return The member account ID in resource directory.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedTarget(java.lang.String name) {
        this(name, SharedTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedTarget(java.lang.String name, SharedTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedTarget(java.lang.String name, SharedTargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/sharedTarget:SharedTarget", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SharedTarget(java.lang.String name, Output<java.lang.String> id, @Nullable SharedTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/sharedTarget:SharedTarget", name, state, makeResourceOptions(options, id), false);
    }

    private static SharedTargetArgs makeArgs(SharedTargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SharedTargetArgs.Empty : args;
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
    public static SharedTarget get(java.lang.String name, Output<java.lang.String> id, @Nullable SharedTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedTarget(name, id, state, options);
    }
}
