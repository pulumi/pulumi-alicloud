// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.IpaDomainArgs;
import com.pulumi.alicloud.dcdn.inputs.IpaDomainState;
import com.pulumi.alicloud.dcdn.outputs.IpaDomainSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a DCDN Ipa Domain resource.
 * 
 * For information about DCDN Ipa Domain and how to use it, see [What is Ipa Domain](https://www.alibabacloud.com/help/en/doc-detail/130634.html).
 * 
 * &gt; **NOTE:** Available since v1.158.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.dcdn.IpaDomain;
 * import com.pulumi.alicloud.dcdn.IpaDomainArgs;
 * import com.pulumi.alicloud.dcdn.inputs.IpaDomainSourceArgs;
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
 *         var defaultInteger = new Integer("defaultInteger", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         final var default = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .build());
 * 
 *         var example = new IpaDomain("example", IpaDomainArgs.builder()
 *             .domainName(String.format("example-%s.com", defaultInteger.result()))
 *             .resourceGroupId(default_.groups()[0].id())
 *             .scope("overseas")
 *             .status("online")
 *             .sources(IpaDomainSourceArgs.builder()
 *                 .content("www.alicloud-provider.cn")
 *                 .port(8898)
 *                 .priority("20")
 *                 .type("domain")
 *                 .weight(10)
 *                 .build())
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
 * DCDN Ipa Domain can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:dcdn/ipaDomain:IpaDomain example &lt;domain_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dcdn/ipaDomain:IpaDomain")
public class IpaDomain extends com.pulumi.resources.CustomResource {
    /**
     * The domain name to be added to IPA. Wildcard domain names are supported. A wildcard domain name must start with a period (.).
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The domain name to be added to IPA. Wildcard domain names are supported. A wildcard domain name must start with a period (.).
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The ID of the resource group. If you do not set this parameter, the system automatically assigns the ID of the default resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group. If you do not set this parameter, the system automatically assigns the ID of the default resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The accelerated region. Valid values: `domestic`, `global`, `overseas`.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The accelerated region. Valid values: `domestic`, `global`, `overseas`.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Sources. See `sources` below.
     * 
     */
    @Export(name="sources", refs={List.class,IpaDomainSource.class}, tree="[0,1]")
    private Output<List<IpaDomainSource>> sources;

    /**
     * @return Sources. See `sources` below.
     * 
     */
    public Output<List<IpaDomainSource>> sources() {
        return this.sources;
    }
    /**
     * The status of DCDN Ipa Domain. Valid values: `online`, `offline`. Default to `online`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of DCDN Ipa Domain. Valid values: `online`, `offline`. Default to `online`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpaDomain(java.lang.String name) {
        this(name, IpaDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpaDomain(java.lang.String name, IpaDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpaDomain(java.lang.String name, IpaDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/ipaDomain:IpaDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IpaDomain(java.lang.String name, Output<java.lang.String> id, @Nullable IpaDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/ipaDomain:IpaDomain", name, state, makeResourceOptions(options, id), false);
    }

    private static IpaDomainArgs makeArgs(IpaDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IpaDomainArgs.Empty : args;
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
    public static IpaDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable IpaDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpaDomain(name, id, state, options);
    }
}
