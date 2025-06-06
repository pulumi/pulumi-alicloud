// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Live Caster resource.
 *
 * Relying on Alibaba Cloud's powerful technologies such as live video broadcasting, media processing, and video AI, cloud guide integrates capabilities such as graphic packaging, real-time keying, multi-language translation, and multi-channel mixed streaming to innovate traditional guide services in the cloud. Provide easy-to-use cloud-based guide services for event performances, news reports, live events, off-site broadcasts and other scenes, without hardware, reduce user guide costs, and create a better live broadcast experience.
 *
 * For information about Live Caster and how to use it, see [What is Caster](https://www.alibabacloud.com/help/en/live/developer-reference/api-live-2016-11-01-createcaster).
 *
 * > **NOTE:** Available since v1.238.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.live.Caster("default", {
 *     casterName: name,
 *     paymentType: "PayAsYouGo",
 *     normType: 1,
 * });
 * ```
 *
 * ## Import
 *
 * Live Caster can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:live/caster:Caster example <id>
 * ```
 */
export class Caster extends pulumi.CustomResource {
    /**
     * Get an existing Caster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CasterState, opts?: pulumi.CustomResourceOptions): Caster {
        return new Caster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:live/caster:Caster';

    /**
     * Returns true if the given object is an instance of Caster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Caster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Caster.__pulumiType;
    }

    /**
     * Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
     */
    public readonly autoSwitchUrgentConfig!: pulumi.Output<string | undefined>;
    /**
     * Turn on the cut-off automatic switch for broadcast preparation.
     *
     * true: open.
     *
     * false: closed.
     */
    public readonly autoSwitchUrgentOn!: pulumi.Output<boolean | undefined>;
    /**
     * The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
     */
    public readonly callbackUrl!: pulumi.Output<string | undefined>;
    /**
     * Guide station name.
     */
    public readonly casterName!: pulumi.Output<string | undefined>;
    /**
     * Creation time.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Delayed playback. Time unit: seconds.
     */
    public readonly delay!: pulumi.Output<number | undefined>;
    /**
     * Master play domain name.
     */
    public readonly domainName!: pulumi.Output<string | undefined>;
    /**
     * Guide station specification type. Value:
     * - 0: Broadcast single type.
     * - 1: General purpose.
     */
    public readonly normType!: pulumi.Output<number>;
    /**
     * The paymen type of the resource
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * Carousel effective flag.
     *
     * 0: Not in effect.
     *
     * 1: Entry into force.
     */
    public readonly programEffect!: pulumi.Output<number | undefined>;
    /**
     * The carousel station name, which can be configured when using the carousel function.
     */
    public readonly programName!: pulumi.Output<string | undefined>;
    /**
     * Record configuration information. The format is JSON. The configuration element information is as follows:
     */
    public readonly recordConfig!: pulumi.Output<string | undefined>;
    /**
     * Resource Group id
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * resource type
     */
    public readonly resourceType!: pulumi.Output<string | undefined>;
    /**
     * The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
     */
    public readonly sideOutputUrl!: pulumi.Output<string | undefined>;
    /**
     * The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
     */
    public readonly sideOutputUrlList!: pulumi.Output<string | undefined>;
    /**
     * Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
     * - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
     * - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
     * - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
     * - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
     */
    public readonly syncGroupsConfig!: pulumi.Output<string | undefined>;
    /**
     * The tag of the resource
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Transcoding configuration.
     *
     * JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
     */
    public readonly transcodeConfig!: pulumi.Output<string | undefined>;
    /**
     * The ID of the picture material of the media library.
     */
    public readonly urgentImageId!: pulumi.Output<string | undefined>;
    /**
     * Prepare the URL of the picture material.
     */
    public readonly urgentImageUrl!: pulumi.Output<string | undefined>;
    /**
     * The prepared live stream URL.
     */
    public readonly urgentLiveStreamUrl!: pulumi.Output<string | undefined>;
    /**
     * Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
     */
    public readonly urgentMaterialId!: pulumi.Output<string | undefined>;

    /**
     * Create a Caster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CasterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CasterArgs | CasterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CasterState | undefined;
            resourceInputs["autoSwitchUrgentConfig"] = state ? state.autoSwitchUrgentConfig : undefined;
            resourceInputs["autoSwitchUrgentOn"] = state ? state.autoSwitchUrgentOn : undefined;
            resourceInputs["callbackUrl"] = state ? state.callbackUrl : undefined;
            resourceInputs["casterName"] = state ? state.casterName : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["delay"] = state ? state.delay : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["normType"] = state ? state.normType : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["programEffect"] = state ? state.programEffect : undefined;
            resourceInputs["programName"] = state ? state.programName : undefined;
            resourceInputs["recordConfig"] = state ? state.recordConfig : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["sideOutputUrl"] = state ? state.sideOutputUrl : undefined;
            resourceInputs["sideOutputUrlList"] = state ? state.sideOutputUrlList : undefined;
            resourceInputs["syncGroupsConfig"] = state ? state.syncGroupsConfig : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["transcodeConfig"] = state ? state.transcodeConfig : undefined;
            resourceInputs["urgentImageId"] = state ? state.urgentImageId : undefined;
            resourceInputs["urgentImageUrl"] = state ? state.urgentImageUrl : undefined;
            resourceInputs["urgentLiveStreamUrl"] = state ? state.urgentLiveStreamUrl : undefined;
            resourceInputs["urgentMaterialId"] = state ? state.urgentMaterialId : undefined;
        } else {
            const args = argsOrState as CasterArgs | undefined;
            if ((!args || args.normType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'normType'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            resourceInputs["autoSwitchUrgentConfig"] = args ? args.autoSwitchUrgentConfig : undefined;
            resourceInputs["autoSwitchUrgentOn"] = args ? args.autoSwitchUrgentOn : undefined;
            resourceInputs["callbackUrl"] = args ? args.callbackUrl : undefined;
            resourceInputs["casterName"] = args ? args.casterName : undefined;
            resourceInputs["delay"] = args ? args.delay : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["normType"] = args ? args.normType : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["programEffect"] = args ? args.programEffect : undefined;
            resourceInputs["programName"] = args ? args.programName : undefined;
            resourceInputs["recordConfig"] = args ? args.recordConfig : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["sideOutputUrl"] = args ? args.sideOutputUrl : undefined;
            resourceInputs["sideOutputUrlList"] = args ? args.sideOutputUrlList : undefined;
            resourceInputs["syncGroupsConfig"] = args ? args.syncGroupsConfig : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transcodeConfig"] = args ? args.transcodeConfig : undefined;
            resourceInputs["urgentImageId"] = args ? args.urgentImageId : undefined;
            resourceInputs["urgentImageUrl"] = args ? args.urgentImageUrl : undefined;
            resourceInputs["urgentLiveStreamUrl"] = args ? args.urgentLiveStreamUrl : undefined;
            resourceInputs["urgentMaterialId"] = args ? args.urgentMaterialId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Caster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Caster resources.
 */
export interface CasterState {
    /**
     * Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
     */
    autoSwitchUrgentConfig?: pulumi.Input<string>;
    /**
     * Turn on the cut-off automatic switch for broadcast preparation.
     *
     * true: open.
     *
     * false: closed.
     */
    autoSwitchUrgentOn?: pulumi.Input<boolean>;
    /**
     * The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
     */
    callbackUrl?: pulumi.Input<string>;
    /**
     * Guide station name.
     */
    casterName?: pulumi.Input<string>;
    /**
     * Creation time.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Delayed playback. Time unit: seconds.
     */
    delay?: pulumi.Input<number>;
    /**
     * Master play domain name.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Guide station specification type. Value:
     * - 0: Broadcast single type.
     * - 1: General purpose.
     */
    normType?: pulumi.Input<number>;
    /**
     * The paymen type of the resource
     */
    paymentType?: pulumi.Input<string>;
    /**
     * Carousel effective flag.
     *
     * 0: Not in effect.
     *
     * 1: Entry into force.
     */
    programEffect?: pulumi.Input<number>;
    /**
     * The carousel station name, which can be configured when using the carousel function.
     */
    programName?: pulumi.Input<string>;
    /**
     * Record configuration information. The format is JSON. The configuration element information is as follows:
     */
    recordConfig?: pulumi.Input<string>;
    /**
     * Resource Group id
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * resource type
     */
    resourceType?: pulumi.Input<string>;
    /**
     * The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
     */
    sideOutputUrl?: pulumi.Input<string>;
    /**
     * The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
     */
    sideOutputUrlList?: pulumi.Input<string>;
    /**
     * Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
     * - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
     * - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
     * - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
     * - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
     */
    syncGroupsConfig?: pulumi.Input<string>;
    /**
     * The tag of the resource
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Transcoding configuration.
     *
     * JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
     */
    transcodeConfig?: pulumi.Input<string>;
    /**
     * The ID of the picture material of the media library.
     */
    urgentImageId?: pulumi.Input<string>;
    /**
     * Prepare the URL of the picture material.
     */
    urgentImageUrl?: pulumi.Input<string>;
    /**
     * The prepared live stream URL.
     */
    urgentLiveStreamUrl?: pulumi.Input<string>;
    /**
     * Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
     */
    urgentMaterialId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Caster resource.
 */
export interface CasterArgs {
    /**
     * Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
     */
    autoSwitchUrgentConfig?: pulumi.Input<string>;
    /**
     * Turn on the cut-off automatic switch for broadcast preparation.
     *
     * true: open.
     *
     * false: closed.
     */
    autoSwitchUrgentOn?: pulumi.Input<boolean>;
    /**
     * The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
     */
    callbackUrl?: pulumi.Input<string>;
    /**
     * Guide station name.
     */
    casterName?: pulumi.Input<string>;
    /**
     * Delayed playback. Time unit: seconds.
     */
    delay?: pulumi.Input<number>;
    /**
     * Master play domain name.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Guide station specification type. Value:
     * - 0: Broadcast single type.
     * - 1: General purpose.
     */
    normType: pulumi.Input<number>;
    /**
     * The paymen type of the resource
     */
    paymentType: pulumi.Input<string>;
    /**
     * Carousel effective flag.
     *
     * 0: Not in effect.
     *
     * 1: Entry into force.
     */
    programEffect?: pulumi.Input<number>;
    /**
     * The carousel station name, which can be configured when using the carousel function.
     */
    programName?: pulumi.Input<string>;
    /**
     * Record configuration information. The format is JSON. The configuration element information is as follows:
     */
    recordConfig?: pulumi.Input<string>;
    /**
     * Resource Group id
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * resource type
     */
    resourceType?: pulumi.Input<string>;
    /**
     * The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
     */
    sideOutputUrl?: pulumi.Input<string>;
    /**
     * The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
     */
    sideOutputUrlList?: pulumi.Input<string>;
    /**
     * Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
     * - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
     * - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
     * - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
     * - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
     */
    syncGroupsConfig?: pulumi.Input<string>;
    /**
     * The tag of the resource
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Transcoding configuration.
     *
     * JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
     */
    transcodeConfig?: pulumi.Input<string>;
    /**
     * The ID of the picture material of the media library.
     */
    urgentImageId?: pulumi.Input<string>;
    /**
     * Prepare the URL of the picture material.
     */
    urgentImageUrl?: pulumi.Input<string>;
    /**
     * The prepared live stream URL.
     */
    urgentLiveStreamUrl?: pulumi.Input<string>;
    /**
     * Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
     */
    urgentMaterialId?: pulumi.Input<string>;
}
