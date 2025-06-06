// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apigateway.BackendArgs;
import com.pulumi.alicloud.apigateway.inputs.BackendState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Api Gateway Backend resource.
 * 
 * For information about Api Gateway Backend and how to use it, see [What is Backend](https://www.alibabacloud.com/help/en/api-gateway/developer-reference/api-cloudapi-2016-07-14-createbackend).
 * 
 * &gt; **NOTE:** Available since v1.181.0.
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
 * import com.pulumi.alicloud.apigateway.Backend;
 * import com.pulumi.alicloud.apigateway.BackendArgs;
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
 *         final var name = config.get("name").orElse("tf_example");
 *         var default_ = new Backend("default", BackendArgs.builder()
 *             .backendName(name)
 *             .description(name)
 *             .backendType("HTTP")
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
 * Api Gateway Backend can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:apigateway/backend:Backend example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:apigateway/backend:Backend")
public class Backend extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Backend.
     * 
     */
    @Export(name="backendName", refs={String.class}, tree="[0]")
    private Output<String> backendName;

    /**
     * @return The name of the Backend.
     * 
     */
    public Output<String> backendName() {
        return this.backendName;
    }
    /**
     * The type of the Backend. Valid values: `HTTP`, `VPC`, `FC_EVENT`, `FC_EVENT_V3`, `FC_HTTP`, `FC_HTTP_V3`, `OSS`, `MOCK`.
     * 
     */
    @Export(name="backendType", refs={String.class}, tree="[0]")
    private Output<String> backendType;

    /**
     * @return The type of the Backend. Valid values: `HTTP`, `VPC`, `FC_EVENT`, `FC_EVENT_V3`, `FC_HTTP`, `FC_HTTP_V3`, `OSS`, `MOCK`.
     * 
     */
    public Output<String> backendType() {
        return this.backendType;
    }
    /**
     * Whether to create an Event bus service association role.
     * 
     */
    @Export(name="createEventBridgeServiceLinkedRole", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> createEventBridgeServiceLinkedRole;

    /**
     * @return Whether to create an Event bus service association role.
     * 
     */
    public Output<Boolean> createEventBridgeServiceLinkedRole() {
        return this.createEventBridgeServiceLinkedRole;
    }
    /**
     * The description of the Backend.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Backend.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backend(java.lang.String name) {
        this(name, BackendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backend(java.lang.String name, BackendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backend(java.lang.String name, BackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/backend:Backend", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Backend(java.lang.String name, Output<java.lang.String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/backend:Backend", name, state, makeResourceOptions(options, id), false);
    }

    private static BackendArgs makeArgs(BackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BackendArgs.Empty : args;
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
    public static Backend get(java.lang.String name, Output<java.lang.String> id, @Nullable BackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Backend(name, id, state, options);
    }
}
