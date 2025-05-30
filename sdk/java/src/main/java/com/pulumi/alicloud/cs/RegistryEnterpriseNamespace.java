// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cs.RegistryEnterpriseNamespaceArgs;
import com.pulumi.alicloud.cs.inputs.RegistryEnterpriseNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Container Registry Enterprise Edition Namespace resource.
 * 
 * For information about Container Registry Enterprise Edition Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createnamespace)
 * 
 * &gt; **NOTE:** Available since v1.86.0.
 * 
 * &gt; **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
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
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstance;
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstanceArgs;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseNamespace;
 * import com.pulumi.alicloud.cs.RegistryEnterpriseNamespaceArgs;
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
 *         var defaultRegistryEnterpriseInstance = new RegistryEnterpriseInstance("defaultRegistryEnterpriseInstance", RegistryEnterpriseInstanceArgs.builder()
 *             .paymentType("Subscription")
 *             .period(1)
 *             .renewPeriod(0)
 *             .renewalStatus("ManualRenewal")
 *             .instanceType("Advanced")
 *             .instanceName(String.format("%s-%s", name,default_.result()))
 *             .build());
 * 
 *         var defaultRegistryEnterpriseNamespace = new RegistryEnterpriseNamespace("defaultRegistryEnterpriseNamespace", RegistryEnterpriseNamespaceArgs.builder()
 *             .instanceId(defaultRegistryEnterpriseInstance.id())
 *             .name(String.format("%s-%s", name,default_.result()))
 *             .autoCreate(false)
 *             .defaultVisibility("PUBLIC")
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
 * Container Registry Enterprise Edition Namespace can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace example &lt;instance_id&gt;:&lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace")
public class RegistryEnterpriseNamespace extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to automatically create an image repository in the namespace. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="autoCreate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoCreate;

    /**
     * @return Specifies whether to automatically create an image repository in the namespace. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> autoCreate() {
        return Codegen.optional(this.autoCreate);
    }
    /**
     * The default type of the repository that is automatically created. Valid values:
     * - `PUBLIC`: A public repository.
     * - `PRIVATE`: A private repository.
     * 
     */
    @Export(name="defaultVisibility", refs={String.class}, tree="[0]")
    private Output<String> defaultVisibility;

    /**
     * @return The default type of the repository that is automatically created. Valid values:
     * - `PUBLIC`: A public repository.
     * - `PRIVATE`: A private repository.
     * 
     */
    public Output<String> defaultVisibility() {
        return this.defaultVisibility;
    }
    /**
     * The ID of the Container Registry Enterprise Edition instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the Container Registry Enterprise Edition instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the Container Registry Enterprise Edition Name. It must be `2` to `120` characters in length, and can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). It cannot start or end with a delimiter.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Container Registry Enterprise Edition Name. It must be `2` to `120` characters in length, and can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). It cannot start or end with a delimiter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryEnterpriseNamespace(java.lang.String name) {
        this(name, RegistryEnterpriseNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryEnterpriseNamespace(java.lang.String name, RegistryEnterpriseNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryEnterpriseNamespace(java.lang.String name, RegistryEnterpriseNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegistryEnterpriseNamespace(java.lang.String name, Output<java.lang.String> id, @Nullable RegistryEnterpriseNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace", name, state, makeResourceOptions(options, id), false);
    }

    private static RegistryEnterpriseNamespaceArgs makeArgs(RegistryEnterpriseNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegistryEnterpriseNamespaceArgs.Empty : args;
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
    public static RegistryEnterpriseNamespace get(java.lang.String name, Output<java.lang.String> id, @Nullable RegistryEnterpriseNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryEnterpriseNamespace(name, id, state, options);
    }
}
