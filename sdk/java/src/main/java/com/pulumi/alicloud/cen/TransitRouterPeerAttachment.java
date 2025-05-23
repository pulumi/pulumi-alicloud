// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterPeerAttachmentArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterPeerAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Peer Attachment resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Router Peer Attachment and how to use it, see [What is Transit Router Peer Attachment](https://next.api.alibabacloud.com/document/Cbn/2017-09-12/CreateTransitRouterPeerAttachment).
 * 
 * &gt; **NOTE:** Available since v1.128.0.
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
 * import com.pulumi.alicloud.cen.BandwidthPackage;
 * import com.pulumi.alicloud.cen.BandwidthPackageArgs;
 * import com.pulumi.alicloud.cen.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.cen.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
 * import com.pulumi.alicloud.cen.TransitRouterPeerAttachment;
 * import com.pulumi.alicloud.cen.TransitRouterPeerAttachmentArgs;
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
 *         final var region = config.get("region").orElse("cn-hangzhou");
 *         final var peerRegion = config.get("peerRegion").orElse("cn-beijing");
 *         var example = new Instance("example", InstanceArgs.builder()
 *             .cenInstanceName(name)
 *             .protectionLevel("REDUCED")
 *             .build());
 * 
 *         var exampleBandwidthPackage = new BandwidthPackage("exampleBandwidthPackage", BandwidthPackageArgs.builder()
 *             .bandwidth(5)
 *             .cenBandwidthPackageName("tf_example")
 *             .geographicRegionAId("China")
 *             .geographicRegionBId("China")
 *             .build());
 * 
 *         var exampleBandwidthPackageAttachment = new BandwidthPackageAttachment("exampleBandwidthPackageAttachment", BandwidthPackageAttachmentArgs.builder()
 *             .instanceId(example.id())
 *             .bandwidthPackageId(exampleBandwidthPackage.id())
 *             .build());
 * 
 *         var exampleTransitRouter = new TransitRouter("exampleTransitRouter", TransitRouterArgs.builder()
 *             .cenId(exampleBandwidthPackageAttachment.instanceId())
 *             .build());
 * 
 *         var peer = new TransitRouter("peer", TransitRouterArgs.builder()
 *             .cenId(exampleTransitRouter.cenId())
 *             .build());
 * 
 *         var exampleTransitRouterPeerAttachment = new TransitRouterPeerAttachment("exampleTransitRouterPeerAttachment", TransitRouterPeerAttachmentArgs.builder()
 *             .cenId(example.id())
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .peerTransitRouterRegionId(peerRegion)
 *             .peerTransitRouterId(peer.transitRouterId())
 *             .cenBandwidthPackageId(exampleBandwidthPackageAttachment.bandwidthPackageId())
 *             .bandwidth(5)
 *             .transitRouterAttachmentDescription(name)
 *             .transitRouterAttachmentName(name)
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
 * Cloud Enterprise Network (CEN) Transit Router Peer Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment example &lt;cen_id&gt;:&lt;transit_router_attachment_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment")
public class TransitRouterPeerAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:
     * 
     */
    @Export(name="autoPublishRouteEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPublishRouteEnabled;

    /**
     * @return Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:
     * 
     */
    public Output<Optional<Boolean>> autoPublishRouteEnabled() {
        return Codegen.optional(this.autoPublishRouteEnabled);
    }
    /**
     * The bandwidth value of the inter-region connection. Unit: Mbit/s.
     * 
     * - This parameter specifies the maximum bandwidth value for the inter-region connection if you set `BandwidthType` to `BandwidthPackage`.
     * - This parameter specifies the bandwidth throttling threshold for the inter-region connection if you set `BandwidthType` to `DataTransfer`.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bandwidth;

    /**
     * @return The bandwidth value of the inter-region connection. Unit: Mbit/s.
     * 
     * - This parameter specifies the maximum bandwidth value for the inter-region connection if you set `BandwidthType` to `BandwidthPackage`.
     * - This parameter specifies the bandwidth throttling threshold for the inter-region connection if you set `BandwidthType` to `DataTransfer`.
     * 
     */
    public Output<Optional<Integer>> bandwidth() {
        return Codegen.optional(this.bandwidth);
    }
    /**
     * The method that is used to allocate bandwidth to the inter-region connection. Valid values:
     * 
     * - `BandwidthPackage`: allocates bandwidth from a bandwidth plan.
     * - `DataTransfer`: bandwidth is billed based on the pay-by-data-transfer metering method.
     * 
     */
    @Export(name="bandwidthType", refs={String.class}, tree="[0]")
    private Output<String> bandwidthType;

    /**
     * @return The method that is used to allocate bandwidth to the inter-region connection. Valid values:
     * 
     * - `BandwidthPackage`: allocates bandwidth from a bandwidth plan.
     * - `DataTransfer`: bandwidth is billed based on the pay-by-data-transfer metering method.
     * 
     */
    public Output<String> bandwidthType() {
        return this.bandwidthType;
    }
    /**
     * The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.
     * 
     * &gt; **NOTE:**   If you set `BandwidthType` to `DataTransfer`, you do not need to set this parameter.
     * 
     */
    @Export(name="cenBandwidthPackageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cenBandwidthPackageId;

    /**
     * @return The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.
     * 
     * &gt; **NOTE:**   If you set `BandwidthType` to `DataTransfer`, you do not need to set this parameter.
     * 
     */
    public Output<Optional<String>> cenBandwidthPackageId() {
        return Codegen.optional(this.cenBandwidthPackageId);
    }
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cenId;

    /**
     * @return The ID of the Cloud Enterprise Network (CEN) instance.
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
     * The default line type.
     * Valid values: Platinum and Gold.
     * Platinum is supported only when BandwidthType is set to DataTransfer.
     * 
     */
    @Export(name="defaultLinkType", refs={String.class}, tree="[0]")
    private Output<String> defaultLinkType;

    /**
     * @return The default line type.
     * Valid values: Platinum and Gold.
     * Platinum is supported only when BandwidthType is set to DataTransfer.
     * 
     */
    public Output<String> defaultLinkType() {
        return this.defaultLinkType;
    }
    /**
     * Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The ID of the peer transit router.
     * 
     */
    @Export(name="peerTransitRouterId", refs={String.class}, tree="[0]")
    private Output<String> peerTransitRouterId;

    /**
     * @return The ID of the peer transit router.
     * 
     */
    public Output<String> peerTransitRouterId() {
        return this.peerTransitRouterId;
    }
    /**
     * The ID of the region where the peer transit router is deployed.
     * 
     */
    @Export(name="peerTransitRouterRegionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peerTransitRouterRegionId;

    /**
     * @return The ID of the region where the peer transit router is deployed.
     * 
     */
    public Output<Optional<String>> peerTransitRouterRegionId() {
        return Codegen.optional(this.peerTransitRouterRegionId);
    }
    /**
     * The ID of the region where the local Enterprise Edition transit router is deployed.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The ID of the region where the local Enterprise Edition transit router is deployed.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The resource type to attachment. Only support `VR` and default value is `VR`.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceType;

    /**
     * @return The resource type to attachment. Only support `VR` and default value is `VR`.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<Optional<String>> resourceType() {
        return Codegen.optional(this.resourceType);
    }
    /**
     * Field `route_table_association_enabled` has been deprecated from provider version 1.230.0.
     * 
     * @deprecated
     * Field `route_table_association_enabled` has been deprecated from provider version 1.230.0.
     * 
     */
    @Deprecated /* Field `route_table_association_enabled` has been deprecated from provider version 1.230.0. */
    @Export(name="routeTableAssociationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> routeTableAssociationEnabled;

    /**
     * @return Field `route_table_association_enabled` has been deprecated from provider version 1.230.0.
     * 
     */
    public Output<Optional<Boolean>> routeTableAssociationEnabled() {
        return Codegen.optional(this.routeTableAssociationEnabled);
    }
    /**
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.230.0.
     * 
     * @deprecated
     * Field `route_table_propagation_enabled` has been deprecated from provider version 1.230.0.
     * 
     */
    @Deprecated /* Field `route_table_propagation_enabled` has been deprecated from provider version 1.230.0. */
    @Export(name="routeTablePropagationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> routeTablePropagationEnabled;

    /**
     * @return Field `route_table_propagation_enabled` has been deprecated from provider version 1.230.0.
     * 
     */
    public Output<Optional<Boolean>> routeTablePropagationEnabled() {
        return Codegen.optional(this.routeTablePropagationEnabled);
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
     * The new description of the inter-region connection.
     * This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.
     * 
     */
    @Export(name="transitRouterAttachmentDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterAttachmentDescription;

    /**
     * @return The new description of the inter-region connection.
     * This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> transitRouterAttachmentDescription() {
        return Codegen.optional(this.transitRouterAttachmentDescription);
    }
    /**
     * The ID of the inter-region connection.
     * 
     */
    @Export(name="transitRouterAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the inter-region connection.
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.247.0. New field &#39;transit_router_peer_attachment_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;transit_router_attachment_name&#39; has been deprecated since provider version 1.247.0. New field &#39;transit_router_peer_attachment_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'transit_router_attachment_name' has been deprecated since provider version 1.247.0. New field 'transit_router_peer_attachment_name' instead. */
    @Export(name="transitRouterAttachmentName", refs={String.class}, tree="[0]")
    private Output<String> transitRouterAttachmentName;

    /**
     * @return . Field &#39;transit_router_attachment_name&#39; has been deprecated from provider version 1.247.0. New field &#39;transit_router_peer_attachment_name&#39; instead.
     * 
     */
    public Output<String> transitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }
    /**
     * The ID of the local Enterprise Edition transit router.
     * 
     */
    @Export(name="transitRouterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterId;

    /**
     * @return The ID of the local Enterprise Edition transit router.
     * 
     */
    public Output<Optional<String>> transitRouterId() {
        return Codegen.optional(this.transitRouterId);
    }
    /**
     * The new name of the inter-region connection.
     * The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
     * 
     */
    @Export(name="transitRouterPeerAttachmentName", refs={String.class}, tree="[0]")
    private Output<String> transitRouterPeerAttachmentName;

    /**
     * @return The new name of the inter-region connection.
     * The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
     * 
     */
    public Output<String> transitRouterPeerAttachmentName() {
        return this.transitRouterPeerAttachmentName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterPeerAttachment(java.lang.String name) {
        this(name, TransitRouterPeerAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterPeerAttachment(java.lang.String name, TransitRouterPeerAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterPeerAttachment(java.lang.String name, TransitRouterPeerAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TransitRouterPeerAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterPeerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static TransitRouterPeerAttachmentArgs makeArgs(TransitRouterPeerAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TransitRouterPeerAttachmentArgs.Empty : args;
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
    public static TransitRouterPeerAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterPeerAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterPeerAttachment(name, id, state, options);
    }
}
