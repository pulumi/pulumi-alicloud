// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.live;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.live.CasterArgs;
import com.pulumi.alicloud.live.inputs.CasterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Live Caster resource.
 * 
 * Relying on Alibaba Cloud&#39;s powerful technologies such as live video broadcasting, media processing, and video AI, cloud guide integrates capabilities such as graphic packaging, real-time keying, multi-language translation, and multi-channel mixed streaming to innovate traditional guide services in the cloud. Provide easy-to-use cloud-based guide services for event performances, news reports, live events, off-site broadcasts and other scenes, without hardware, reduce user guide costs, and create a better live broadcast experience.
 * 
 * For information about Live Caster and how to use it, see [What is Caster](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.238.0.
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
 * import com.pulumi.alicloud.live.Caster;
 * import com.pulumi.alicloud.live.CasterArgs;
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
 *         var default_ = new Caster("default", CasterArgs.builder()
 *             .casterName(name)
 *             .paymentType("PayAsYouGo")
 *             .normType("1")
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
 * Live Caster can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:live/caster:Caster example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:live/caster:Caster")
public class Caster extends com.pulumi.resources.CustomResource {
    /**
     * Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
     * 
     */
    @Export(name="autoSwitchUrgentConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoSwitchUrgentConfig;

    /**
     * @return Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
     * 
     */
    public Output<Optional<String>> autoSwitchUrgentConfig() {
        return Codegen.optional(this.autoSwitchUrgentConfig);
    }
    /**
     * Turn on the cut-off automatic switch for broadcast preparation.
     * 
     * true: open.
     * 
     * false: closed.
     * 
     */
    @Export(name="autoSwitchUrgentOn", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoSwitchUrgentOn;

    /**
     * @return Turn on the cut-off automatic switch for broadcast preparation.
     * 
     * true: open.
     * 
     * false: closed.
     * 
     */
    public Output<Optional<Boolean>> autoSwitchUrgentOn() {
        return Codegen.optional(this.autoSwitchUrgentOn);
    }
    /**
     * The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
     * 
     */
    @Export(name="callbackUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> callbackUrl;

    /**
     * @return The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
     * 
     */
    public Output<Optional<String>> callbackUrl() {
        return Codegen.optional(this.callbackUrl);
    }
    /**
     * Guide station name.
     * 
     */
    @Export(name="casterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> casterName;

    /**
     * @return Guide station name.
     * 
     */
    public Output<Optional<String>> casterName() {
        return Codegen.optional(this.casterName);
    }
    /**
     * Creation time.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Delayed playback. Time unit: seconds.
     * 
     */
    @Export(name="delay", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> delay;

    /**
     * @return Delayed playback. Time unit: seconds.
     * 
     */
    public Output<Optional<Double>> delay() {
        return Codegen.optional(this.delay);
    }
    /**
     * Master play domain name.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domainName;

    /**
     * @return Master play domain name.
     * 
     */
    public Output<Optional<String>> domainName() {
        return Codegen.optional(this.domainName);
    }
    /**
     * Guide station specification type. Value:
     * - 0: Broadcast single type.
     * - 1: General purpose.
     * 
     */
    @Export(name="normType", refs={Integer.class}, tree="[0]")
    private Output<Integer> normType;

    /**
     * @return Guide station specification type. Value:
     * - 0: Broadcast single type.
     * - 1: General purpose.
     * 
     */
    public Output<Integer> normType() {
        return this.normType;
    }
    /**
     * The paymen type of the resource
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The paymen type of the resource
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * Carousel effective flag.
     * 
     * 0: Not in effect.
     * 
     * 1: Entry into force.
     * 
     */
    @Export(name="programEffect", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> programEffect;

    /**
     * @return Carousel effective flag.
     * 
     * 0: Not in effect.
     * 
     * 1: Entry into force.
     * 
     */
    public Output<Optional<Integer>> programEffect() {
        return Codegen.optional(this.programEffect);
    }
    /**
     * The carousel station name, which can be configured when using the carousel function.
     * 
     */
    @Export(name="programName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> programName;

    /**
     * @return The carousel station name, which can be configured when using the carousel function.
     * 
     */
    public Output<Optional<String>> programName() {
        return Codegen.optional(this.programName);
    }
    /**
     * Record configuration information. The format is JSON. The configuration element information is as follows:
     * 
     */
    @Export(name="recordConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> recordConfig;

    /**
     * @return Record configuration information. The format is JSON. The configuration element information is as follows:
     * 
     */
    public Output<Optional<String>> recordConfig() {
        return Codegen.optional(this.recordConfig);
    }
    /**
     * Resource Group id
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return Resource Group id
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * resource type
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceType;

    /**
     * @return resource type
     * 
     */
    public Output<Optional<String>> resourceType() {
        return Codegen.optional(this.resourceType);
    }
    /**
     * The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
     * 
     */
    @Export(name="sideOutputUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sideOutputUrl;

    /**
     * @return The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
     * 
     */
    public Output<Optional<String>> sideOutputUrl() {
        return Codegen.optional(this.sideOutputUrl);
    }
    /**
     * The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
     * 
     */
    @Export(name="sideOutputUrlList", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sideOutputUrlList;

    /**
     * @return The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
     * 
     */
    public Output<Optional<String>> sideOutputUrlList() {
        return Codegen.optional(this.sideOutputUrlList);
    }
    /**
     * Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
     * - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
     * - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
     * - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
     * - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
     * 
     */
    @Export(name="syncGroupsConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> syncGroupsConfig;

    /**
     * @return Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
     * - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
     * - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
     * - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
     * - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
     * 
     */
    public Output<Optional<String>> syncGroupsConfig() {
        return Codegen.optional(this.syncGroupsConfig);
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
     * Transcoding configuration.
     * 
     * JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
     * 
     */
    @Export(name="transcodeConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transcodeConfig;

    /**
     * @return Transcoding configuration.
     * 
     * JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
     * 
     */
    public Output<Optional<String>> transcodeConfig() {
        return Codegen.optional(this.transcodeConfig);
    }
    /**
     * The ID of the picture material of the media library.
     * 
     */
    @Export(name="urgentImageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> urgentImageId;

    /**
     * @return The ID of the picture material of the media library.
     * 
     */
    public Output<Optional<String>> urgentImageId() {
        return Codegen.optional(this.urgentImageId);
    }
    /**
     * Prepare the URL of the picture material.
     * 
     */
    @Export(name="urgentImageUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> urgentImageUrl;

    /**
     * @return Prepare the URL of the picture material.
     * 
     */
    public Output<Optional<String>> urgentImageUrl() {
        return Codegen.optional(this.urgentImageUrl);
    }
    /**
     * The prepared live stream URL.
     * 
     */
    @Export(name="urgentLiveStreamUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> urgentLiveStreamUrl;

    /**
     * @return The prepared live stream URL.
     * 
     */
    public Output<Optional<String>> urgentLiveStreamUrl() {
        return Codegen.optional(this.urgentLiveStreamUrl);
    }
    /**
     * Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
     * 
     */
    @Export(name="urgentMaterialId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> urgentMaterialId;

    /**
     * @return Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
     * 
     */
    public Output<Optional<String>> urgentMaterialId() {
        return Codegen.optional(this.urgentMaterialId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Caster(java.lang.String name) {
        this(name, CasterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Caster(java.lang.String name, CasterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Caster(java.lang.String name, CasterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:live/caster:Caster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Caster(java.lang.String name, Output<java.lang.String> id, @Nullable CasterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:live/caster:Caster", name, state, makeResourceOptions(options, id), false);
    }

    private static CasterArgs makeArgs(CasterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CasterArgs.Empty : args;
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
    public static Caster get(java.lang.String name, Output<java.lang.String> id, @Nullable CasterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Caster(name, id, state, options);
    }
}