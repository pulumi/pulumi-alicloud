// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.IpamIpamScopeArgs;
import com.pulumi.alicloud.vpc.inputs.IpamIpamScopeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Vpc Ipam Ipam Scope resource.
 * 
 * IP Address Management Scope.
 * 
 * For information about Vpc Ipam Ipam Scope and how to use it, see [What is Ipam Scope](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.234.0.
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
 * import com.pulumi.alicloud.vpc.IpamIpam;
 * import com.pulumi.alicloud.vpc.IpamIpamArgs;
 * import com.pulumi.alicloud.vpc.IpamIpamScope;
 * import com.pulumi.alicloud.vpc.IpamIpamScopeArgs;
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
 *         var defaultIpam = new IpamIpam("defaultIpam", IpamIpamArgs.builder()
 *             .operatingRegionLists("cn-hangzhou")
 *             .ipamName(name)
 *             .build());
 * 
 *         var default_ = new IpamIpamScope("default", IpamIpamScopeArgs.builder()
 *             .ipamScopeName(name)
 *             .ipamId(defaultIpam.id())
 *             .ipamScopeDescription("This is a ipam scope.")
 *             .ipamScopeType("private")
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
 * Vpc Ipam Ipam Scope can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/ipamIpamScope:IpamIpamScope example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/ipamIpamScope:IpamIpamScope")
public class IpamIpamScope extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The id of the Ipam instance.
     * 
     */
    @Export(name="ipamId", refs={String.class}, tree="[0]")
    private Output<String> ipamId;

    /**
     * @return The id of the Ipam instance.
     * 
     */
    public Output<String> ipamId() {
        return this.ipamId;
    }
    /**
     * The description of the IPAM&#39;s scope of action.
     * 
     * It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with &#39;http:// &#39;or &#39;https. If it is not filled in, it is empty. The default value is empty.
     * 
     */
    @Export(name="ipamScopeDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipamScopeDescription;

    /**
     * @return The description of the IPAM&#39;s scope of action.
     * 
     * It must be 2 to 256 characters in length and must start with a lowercase letter, but cannot start with &#39;http:// &#39;or &#39;https. If it is not filled in, it is empty. The default value is empty.
     * 
     */
    public Output<Optional<String>> ipamScopeDescription() {
        return Codegen.optional(this.ipamScopeDescription);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="ipamScopeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipamScopeName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<Optional<String>> ipamScopeName() {
        return Codegen.optional(this.ipamScopeName);
    }
    /**
     * IPAM scope of action type:
     * `private`.
     * 
     * &gt; **NOTE:**  Currently, only the role scope of the private network is supported.
     * 
     */
    @Export(name="ipamScopeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipamScopeType;

    /**
     * @return IPAM scope of action type:
     * `private`.
     * 
     * &gt; **NOTE:**  Currently, only the role scope of the private network is supported.
     * 
     */
    public Output<Optional<String>> ipamScopeType() {
        return Codegen.optional(this.ipamScopeType);
    }
    /**
     * The region ID of the resource.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The region ID of the resource.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tag of the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpamIpamScope(java.lang.String name) {
        this(name, IpamIpamScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpamIpamScope(java.lang.String name, IpamIpamScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpamIpamScope(java.lang.String name, IpamIpamScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipamIpamScope:IpamIpamScope", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IpamIpamScope(java.lang.String name, Output<java.lang.String> id, @Nullable IpamIpamScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipamIpamScope:IpamIpamScope", name, state, makeResourceOptions(options, id), false);
    }

    private static IpamIpamScopeArgs makeArgs(IpamIpamScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IpamIpamScopeArgs.Empty : args;
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
    public static IpamIpamScope get(java.lang.String name, Output<java.lang.String> id, @Nullable IpamIpamScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpamIpamScope(name, id, state, options);
    }
}