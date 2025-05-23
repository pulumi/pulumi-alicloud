// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ots.InstanceArgs;
import com.pulumi.alicloud.ots.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource will help you to manager a [Table Store](https://www.alibabacloud.com/help/doc-detail/27280.htm) Instance.
 * It is foundation of creating data table.
 * 
 * &gt; **NOTE:** Available since v1.10.0.
 * 
 * ## Example Usage
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
 * import com.pulumi.alicloud.ots.Instance;
 * import com.pulumi.alicloud.ots.InstanceArgs;
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
 *         final var name = config.get("name").orElse("tf-example");
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .name(String.format("%s-%s", name,default_.result()))
 *             .description(name)
 *             .accessedBy("Vpc")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "Building table")
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
 * OTS instance can be imported using instance id or name, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ots/instance:Instance foo &#34;my-ots-instance&#34;
 * ```
 * 
 */
@ResourceType(type="alicloud:ots/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The network limitation of accessing instance. Valid values:
     * * `Any` - Allow all network to access the instance.
     * * `Vpc` - Only can the attached VPC allow to access the instance.
     * * `ConsoleOrVpc` - Allow web console or the attached VPC to access the instance.
     * 
     * Default to &#34;Any&#34;.
     * 
     */
    @Export(name="accessedBy", refs={String.class}, tree="[0]")
    private Output<String> accessedBy;

    /**
     * @return The network limitation of accessing instance. Valid values:
     * * `Any` - Allow all network to access the instance.
     * * `Vpc` - Only can the attached VPC allow to access the instance.
     * * `ConsoleOrVpc` - Allow web console or the attached VPC to access the instance.
     * 
     * Default to &#34;Any&#34;.
     * 
     */
    public Output<String> accessedBy() {
        return this.accessedBy;
    }
    /**
     * The description of the instance. Currently, it does not support modifying.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the instance. Currently, it does not support modifying.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The type of instance. Valid values are &#34;Capacity&#34; and &#34;HighPerformance&#34;. Default to &#34;HighPerformance&#34;.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The type of instance. Valid values are &#34;Capacity&#34; and &#34;HighPerformance&#34;. Default to &#34;HighPerformance&#34;.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * The name of the instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The set of request sources that are allowed access. Valid optional values:
     * * `TRUST_PROXY` - Trusted proxy, usually the Alibaba Cloud console.
     * 
     * Default to [&#34;TRUST_PROXY&#34;].
     * 
     */
    @Export(name="networkSourceAcls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkSourceAcls;

    /**
     * @return The set of request sources that are allowed access. Valid optional values:
     * * `TRUST_PROXY` - Trusted proxy, usually the Alibaba Cloud console.
     * 
     * Default to [&#34;TRUST_PROXY&#34;].
     * 
     */
    public Output<List<String>> networkSourceAcls() {
        return this.networkSourceAcls;
    }
    /**
     * The set of network types that are allowed access. Valid optional values:
     * * `CLASSIC` - Classic network.
     * * `VPC` - VPC network.
     * * `INTERNET` - Public internet.
     * 
     * Default to [&#34;VPC&#34;, &#34;CLASSIC&#34;, &#34;INTERNET&#34;].
     * 
     */
    @Export(name="networkTypeAcls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkTypeAcls;

    /**
     * @return The set of network types that are allowed access. Valid optional values:
     * * `CLASSIC` - Classic network.
     * * `VPC` - VPC network.
     * * `INTERNET` - Public internet.
     * 
     * Default to [&#34;VPC&#34;, &#34;CLASSIC&#34;, &#34;INTERNET&#34;].
     * 
     */
    public Output<List<String>> networkTypeAcls() {
        return this.networkTypeAcls;
    }
    /**
     * The resource group the instance belongs to.
     * Default to Alibaba Cloud default resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The resource group the instance belongs to.
     * Default to Alibaba Cloud default resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * A mapping of tags to assign to the instance.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the instance.
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
        super("alicloud:ots/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ots/instance:Instance", name, state, makeResourceOptions(options, id), false);
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
