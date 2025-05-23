// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterEcrAttachmentArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterEcrAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN Transit Router Ecr Attachment resource.
 * 
 * For information about CEN Transit Router Ecr Attachment and how to use it, see [What is Transit Router Ecr Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterecrattachment).
 * 
 * &gt; **NOTE:** Available since v1.235.0.
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
 * import com.pulumi.alicloud.expressconnect.RouterExpressConnectRouter;
 * import com.pulumi.alicloud.expressconnect.RouterExpressConnectRouterArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.expressconnect.RouterTrAssociation;
 * import com.pulumi.alicloud.expressconnect.RouterTrAssociationArgs;
 * import com.pulumi.alicloud.cen.TransitRouterEcrAttachment;
 * import com.pulumi.alicloud.cen.TransitRouterEcrAttachmentArgs;
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
 *         final var asn = config.get("asn").orElse("4200000667");
 *         var defaultO8Hcfx = new RouterExpressConnectRouter("defaultO8Hcfx", RouterExpressConnectRouterArgs.builder()
 *             .alibabaSideAsn(asn)
 *             .ecrName(name)
 *             .build());
 * 
 *         var defaultQKBiay = new Instance("defaultQKBiay", InstanceArgs.builder()
 *             .cenInstanceName(name)
 *             .build());
 * 
 *         var defaultQa94Y1 = new TransitRouter("defaultQa94Y1", TransitRouterArgs.builder()
 *             .cenId(defaultQKBiay.id())
 *             .transitRouterName(name)
 *             .build());
 * 
 *         final var current = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var defaultedPu6c = new RouterTrAssociation("defaultedPu6c", RouterTrAssociationArgs.builder()
 *             .associationRegionId("cn-hangzhou")
 *             .ecrId(defaultO8Hcfx.id())
 *             .cenId(defaultQKBiay.id())
 *             .transitRouterId(defaultQa94Y1.transitRouterId())
 *             .transitRouterOwnerId(current.id())
 *             .build());
 * 
 *         var default_ = new TransitRouterEcrAttachment("default", TransitRouterEcrAttachmentArgs.builder()
 *             .ecrId(defaultO8Hcfx.id())
 *             .cenId(defaultedPu6c.cenId())
 *             .transitRouterEcrAttachmentName(name)
 *             .transitRouterAttachmentDescription(name)
 *             .transitRouterId(defaultQa94Y1.transitRouterId())
 *             .ecrOwnerId(current.id())
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
 * CEN Transit Router Ecr Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment")
public class TransitRouterEcrAttachment extends com.pulumi.resources.CustomResource {
    /**
     * CenId
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cenId;

    /**
     * @return CenId
     * 
     */
    public Output<Optional<String>> cenId() {
        return Codegen.optional(this.cenId);
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * EcrId
     * 
     */
    @Export(name="ecrId", refs={String.class}, tree="[0]")
    private Output<String> ecrId;

    /**
     * @return EcrId
     * 
     */
    public Output<String> ecrId() {
        return this.ecrId;
    }
    /**
     * EcrOwnerId
     * 
     */
    @Export(name="ecrOwnerId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ecrOwnerId;

    /**
     * @return EcrOwnerId
     * 
     */
    public Output<Optional<Integer>> ecrOwnerId() {
        return Codegen.optional(this.ecrOwnerId);
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tag of the resource
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * TransitRouterAttachmentDescription
     * 
     */
    @Export(name="transitRouterAttachmentDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterAttachmentDescription;

    /**
     * @return TransitRouterAttachmentDescription
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentDescription() {
        return Codegen.optional(this.transitRouterAttachmentDescription);
    }
    /**
     * TransitRouterAttachmentName
     * 
     */
    @Export(name="transitRouterEcrAttachmentName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterEcrAttachmentName;

    /**
     * @return TransitRouterAttachmentName
     * 
     */
    public Output<Optional<String>> transitRouterEcrAttachmentName() {
        return Codegen.optional(this.transitRouterEcrAttachmentName);
    }
    /**
     * TransitRouterId
     * 
     */
    @Export(name="transitRouterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterId;

    /**
     * @return TransitRouterId
     * 
     */
    public Output<Optional<String>> transitRouterId() {
        return Codegen.optional(this.transitRouterId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterEcrAttachment(java.lang.String name) {
        this(name, TransitRouterEcrAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterEcrAttachment(java.lang.String name, TransitRouterEcrAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterEcrAttachment(java.lang.String name, TransitRouterEcrAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TransitRouterEcrAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterEcrAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterEcrAttachment:TransitRouterEcrAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static TransitRouterEcrAttachmentArgs makeArgs(TransitRouterEcrAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TransitRouterEcrAttachmentArgs.Empty : args;
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
    public static TransitRouterEcrAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterEcrAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterEcrAttachment(name, id, state, options);
    }
}
