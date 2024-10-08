// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.AclArgs;
import com.pulumi.alicloud.ga.inputs.AclState;
import com.pulumi.alicloud.ga.outputs.AclAclEntry;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Acl resource.
 * 
 * For information about Global Accelerator (GA) Acl and how to use it, see [What is Acl](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createacl).
 * 
 * &gt; **NOTE:** Available since v1.150.0.
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
 * import com.pulumi.alicloud.ga.Acl;
 * import com.pulumi.alicloud.ga.AclArgs;
 * import com.pulumi.alicloud.ga.AclEntryAttachment;
 * import com.pulumi.alicloud.ga.AclEntryAttachmentArgs;
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
 *         var default_ = new Acl("default", AclArgs.builder()
 *             .aclName("terraform-example")
 *             .addressIpVersion("IPv4")
 *             .build());
 * 
 *         var defaultAclEntryAttachment = new AclEntryAttachment("defaultAclEntryAttachment", AclEntryAttachmentArgs.builder()
 *             .aclId(default_.id())
 *             .entry("192.168.1.1/32")
 *             .entryDescription("terraform-example")
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
 * Global Accelerator (GA) Acl can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ga/acl:Acl example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/acl:Acl")
public class Acl extends com.pulumi.resources.CustomResource {
    /**
     * The entries of the Acl. See `acl_entries` below. **NOTE:** &#34;Field `acl_entries` has been deprecated from provider version 1.190.0 and it will be removed in the future version. Please use the new resource `alicloud.ga.AclEntryAttachment`.&#34;
     * 
     * @deprecated
     * Field `acl_entries` has been deprecated from provider version 1.190.0 and it will be removed in the future version. Please use the new resource `alicloud.ga.AclEntryAttachment`.
     * 
     */
    @Deprecated /* Field `acl_entries` has been deprecated from provider version 1.190.0 and it will be removed in the future version. Please use the new resource `alicloud.ga.AclEntryAttachment`. */
    @Export(name="aclEntries", refs={List.class,AclAclEntry.class}, tree="[0,1]")
    private Output<List<AclAclEntry>> aclEntries;

    /**
     * @return The entries of the Acl. See `acl_entries` below. **NOTE:** &#34;Field `acl_entries` has been deprecated from provider version 1.190.0 and it will be removed in the future version. Please use the new resource `alicloud.ga.AclEntryAttachment`.&#34;
     * 
     */
    public Output<List<AclAclEntry>> aclEntries() {
        return this.aclEntries;
    }
    /**
     * The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, periods (.), hyphens (-) and underscores (_). It must start with a letter.
     * 
     */
    @Export(name="aclName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aclName;

    /**
     * @return The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, periods (.), hyphens (-) and underscores (_). It must start with a letter.
     * 
     */
    public Output<Optional<String>> aclName() {
        return Codegen.optional(this.aclName);
    }
    /**
     * The IP version. Valid values: `IPv4` and `IPv6`.
     * 
     */
    @Export(name="addressIpVersion", refs={String.class}, tree="[0]")
    private Output<String> addressIpVersion;

    /**
     * @return The IP version. Valid values: `IPv4` and `IPv6`.
     * 
     */
    public Output<String> addressIpVersion() {
        return this.addressIpVersion;
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
    public Acl(java.lang.String name) {
        this(name, AclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Acl(java.lang.String name, AclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Acl(java.lang.String name, AclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/acl:Acl", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Acl(java.lang.String name, Output<java.lang.String> id, @Nullable AclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/acl:Acl", name, state, makeResourceOptions(options, id), false);
    }

    private static AclArgs makeArgs(AclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AclArgs.Empty : args;
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
    public static Acl get(java.lang.String name, Output<java.lang.String> id, @Nullable AclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Acl(name, id, state, options);
    }
}
