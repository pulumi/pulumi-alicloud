// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.RoutineArgs;
import com.pulumi.alicloud.esa.inputs.RoutineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESA Routine resource.
 * 
 * For information about ESA Routine and how to use it, see [What is Routine](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateRoutine).
 * 
 * &gt; **NOTE:** Available since v1.251.0.
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
 * import com.pulumi.alicloud.esa.Routine;
 * import com.pulumi.alicloud.esa.RoutineArgs;
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
 *         var default_ = new Routine("default", RoutineArgs.builder()
 *             .description(name)
 *             .name(name)
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
 * ESA Routine can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/routine:Routine example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/routine:Routine")
public class Routine extends com.pulumi.resources.CustomResource {
    /**
     * The time when the routine was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the routine was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The routine name, which must be unique in the same account.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The routine name, which must be unique in the same account.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Routine Name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Routine Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Routine(java.lang.String name) {
        this(name, RoutineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Routine(java.lang.String name, @Nullable RoutineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Routine(java.lang.String name, @Nullable RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/routine:Routine", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Routine(java.lang.String name, Output<java.lang.String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/routine:Routine", name, state, makeResourceOptions(options, id), false);
    }

    private static RoutineArgs makeArgs(@Nullable RoutineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RoutineArgs.Empty : args;
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
    public static Routine get(java.lang.String name, Output<java.lang.String> id, @Nullable RoutineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Routine(name, id, state, options);
    }
}
