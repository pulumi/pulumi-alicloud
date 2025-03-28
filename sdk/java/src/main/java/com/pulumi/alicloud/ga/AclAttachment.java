// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.AclAttachmentArgs;
import com.pulumi.alicloud.ga.inputs.AclAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator (GA) Acl Attachment resource.
 * 
 * For information about Global Accelerator (GA) Acl Attachment and how to use it, see [What is Acl Attachment](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-associateaclswithlistener).
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
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.Listener;
 * import com.pulumi.alicloud.ga.ListenerArgs;
 * import com.pulumi.alicloud.ga.inputs.ListenerPortRangeArgs;
 * import com.pulumi.alicloud.ga.Acl;
 * import com.pulumi.alicloud.ga.AclArgs;
 * import com.pulumi.alicloud.ga.AclEntryAttachment;
 * import com.pulumi.alicloud.ga.AclEntryAttachmentArgs;
 * import com.pulumi.alicloud.ga.AclAttachment;
 * import com.pulumi.alicloud.ga.AclAttachmentArgs;
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
 *         var default_ = new Accelerator("default", AcceleratorArgs.builder()
 *             .duration(1)
 *             .autoUseCoupon(true)
 *             .spec("1")
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage("defaultBandwidthPackage", BandwidthPackageArgs.builder()
 *             .bandwidth(100)
 *             .type("Basic")
 *             .bandwidthType("Basic")
 *             .paymentType("PayAsYouGo")
 *             .billingType("PayBy95")
 *             .ratio(30)
 *             .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment("defaultBandwidthPackageAttachment", BandwidthPackageAttachmentArgs.builder()
 *             .acceleratorId(default_.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var defaultListener = new Listener("defaultListener", ListenerArgs.builder()
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(80)
 *                 .toPort(80)
 *                 .build())
 *             .build());
 * 
 *         var defaultAcl = new Acl("defaultAcl", AclArgs.builder()
 *             .aclName("terraform-example")
 *             .addressIpVersion("IPv4")
 *             .build());
 * 
 *         var defaultAclEntryAttachment = new AclEntryAttachment("defaultAclEntryAttachment", AclEntryAttachmentArgs.builder()
 *             .aclId(defaultAcl.id())
 *             .entry("192.168.1.1/32")
 *             .entryDescription("terraform-example")
 *             .build());
 * 
 *         var defaultAclAttachment = new AclAttachment("defaultAclAttachment", AclAttachmentArgs.builder()
 *             .listenerId(defaultListener.id())
 *             .aclId(defaultAcl.id())
 *             .aclType("white")
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
 * Global Accelerator (GA) Acl Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ga/aclAttachment:AclAttachment example &lt;listener_id&gt;:&lt;acl_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/aclAttachment:AclAttachment")
public class AclAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of an ACL.
     * 
     */
    @Export(name="aclId", refs={String.class}, tree="[0]")
    private Output<String> aclId;

    /**
     * @return The ID of an ACL.
     * 
     */
    public Output<String> aclId() {
        return this.aclId;
    }
    /**
     * The type of the ACL. Valid values:
     * 
     */
    @Export(name="aclType", refs={String.class}, tree="[0]")
    private Output<String> aclType;

    /**
     * @return The type of the ACL. Valid values:
     * 
     */
    public Output<String> aclType() {
        return this.aclType;
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
     * The ID of the listener.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * The status of the Acl Attachment.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Acl Attachment.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AclAttachment(java.lang.String name) {
        this(name, AclAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AclAttachment(java.lang.String name, AclAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AclAttachment(java.lang.String name, AclAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/aclAttachment:AclAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AclAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable AclAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/aclAttachment:AclAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static AclAttachmentArgs makeArgs(AclAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AclAttachmentArgs.Empty : args;
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
    public static AclAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable AclAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AclAttachment(name, id, state, options);
    }
}
