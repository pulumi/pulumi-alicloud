// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.InstanceArgs;
import com.pulumi.alicloud.cen.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Instance resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcen).
 * 
 * &gt; **NOTE:** Available since v1.15.0.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
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
 *         var default_ = new Instance("default", InstanceArgs.builder()
 *             .cenInstanceName(name)
 *             .description(name)
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
 * Cloud Enterprise Network (CEN) Instance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The name of the CEN Instance. The name can be empty or `1` to `128` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="cenInstanceName", refs={String.class}, tree="[0]")
    private Output<String> cenInstanceName;

    /**
     * @return The name of the CEN Instance. The name can be empty or `1` to `128` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Output<String> cenInstanceName() {
        return this.cenInstanceName;
    }
    /**
     * The description of the CEN Instance. The description can be empty or `1` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the CEN Instance. The description can be empty or `1` to `256` characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Field `name` has been deprecated from provider version 1.98.0. New field `cen_instance_name` instead.
     * 
     * @deprecated
     * Field `name` has been deprecated from provider version 1.98.0. New field `cen_instance_name` instead.
     * 
     */
    @Deprecated /* Field `name` has been deprecated from provider version 1.98.0. New field `cen_instance_name` instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.98.0. New field `cen_instance_name` instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The level of CIDR block overlapping. Default value: `REDUCE`.
     * 
     */
    @Export(name="protectionLevel", refs={String.class}, tree="[0]")
    private Output<String> protectionLevel;

    /**
     * @return The level of CIDR block overlapping. Default value: `REDUCE`.
     * 
     */
    public Output<String> protectionLevel() {
        return this.protectionLevel;
    }
    /**
     * The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of the Instance.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Instance.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(java.lang.String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(java.lang.String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(java.lang.String name, @Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/instance:Instance", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceArgs makeArgs(@Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceArgs.Empty : args;
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
    public static Instance get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
