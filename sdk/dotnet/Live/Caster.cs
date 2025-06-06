// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Live
{
    /// <summary>
    /// Provides a Live Caster resource.
    /// 
    /// Relying on Alibaba Cloud's powerful technologies such as live video broadcasting, media processing, and video AI, cloud guide integrates capabilities such as graphic packaging, real-time keying, multi-language translation, and multi-channel mixed streaming to innovate traditional guide services in the cloud. Provide easy-to-use cloud-based guide services for event performances, news reports, live events, off-site broadcasts and other scenes, without hardware, reduce user guide costs, and create a better live broadcast experience.
    /// 
    /// For information about Live Caster and how to use it, see [What is Caster](https://www.alibabacloud.com/help/en/live/developer-reference/api-live-2016-11-01-createcaster).
    /// 
    /// &gt; **NOTE:** Available since v1.238.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.Live.Caster("default", new()
    ///     {
    ///         CasterName = name,
    ///         PaymentType = "PayAsYouGo",
    ///         NormType = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Live Caster can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:live/caster:Caster example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:live/caster:Caster")]
    public partial class Caster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
        /// </summary>
        [Output("autoSwitchUrgentConfig")]
        public Output<string?> AutoSwitchUrgentConfig { get; private set; } = null!;

        /// <summary>
        /// Turn on the cut-off automatic switch for broadcast preparation.
        /// 
        /// true: open.
        /// 
        /// false: closed.
        /// </summary>
        [Output("autoSwitchUrgentOn")]
        public Output<bool?> AutoSwitchUrgentOn { get; private set; } = null!;

        /// <summary>
        /// The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
        /// </summary>
        [Output("callbackUrl")]
        public Output<string?> CallbackUrl { get; private set; } = null!;

        /// <summary>
        /// Guide station name.
        /// </summary>
        [Output("casterName")]
        public Output<string?> CasterName { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Delayed playback. Time unit: seconds.
        /// </summary>
        [Output("delay")]
        public Output<double?> Delay { get; private set; } = null!;

        /// <summary>
        /// Master play domain name.
        /// </summary>
        [Output("domainName")]
        public Output<string?> DomainName { get; private set; } = null!;

        /// <summary>
        /// Guide station specification type. Value:
        /// - 0: Broadcast single type.
        /// - 1: General purpose.
        /// </summary>
        [Output("normType")]
        public Output<int> NormType { get; private set; } = null!;

        /// <summary>
        /// The paymen type of the resource
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Carousel effective flag.
        /// 
        /// 0: Not in effect.
        /// 
        /// 1: Entry into force.
        /// </summary>
        [Output("programEffect")]
        public Output<int?> ProgramEffect { get; private set; } = null!;

        /// <summary>
        /// The carousel station name, which can be configured when using the carousel function.
        /// </summary>
        [Output("programName")]
        public Output<string?> ProgramName { get; private set; } = null!;

        /// <summary>
        /// Record configuration information. The format is JSON. The configuration element information is as follows:
        /// </summary>
        [Output("recordConfig")]
        public Output<string?> RecordConfig { get; private set; } = null!;

        /// <summary>
        /// Resource Group id
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// resource type
        /// </summary>
        [Output("resourceType")]
        public Output<string?> ResourceType { get; private set; } = null!;

        /// <summary>
        /// The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
        /// </summary>
        [Output("sideOutputUrl")]
        public Output<string?> SideOutputUrl { get; private set; } = null!;

        /// <summary>
        /// The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
        /// </summary>
        [Output("sideOutputUrlList")]
        public Output<string?> SideOutputUrlList { get; private set; } = null!;

        /// <summary>
        /// Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
        /// - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
        /// - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
        /// - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
        /// - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
        /// </summary>
        [Output("syncGroupsConfig")]
        public Output<string?> SyncGroupsConfig { get; private set; } = null!;

        /// <summary>
        /// The tag of the resource
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Transcoding configuration.
        /// 
        /// JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
        /// </summary>
        [Output("transcodeConfig")]
        public Output<string?> TranscodeConfig { get; private set; } = null!;

        /// <summary>
        /// The ID of the picture material of the media library.
        /// </summary>
        [Output("urgentImageId")]
        public Output<string?> UrgentImageId { get; private set; } = null!;

        /// <summary>
        /// Prepare the URL of the picture material.
        /// </summary>
        [Output("urgentImageUrl")]
        public Output<string?> UrgentImageUrl { get; private set; } = null!;

        /// <summary>
        /// The prepared live stream URL.
        /// </summary>
        [Output("urgentLiveStreamUrl")]
        public Output<string?> UrgentLiveStreamUrl { get; private set; } = null!;

        /// <summary>
        /// Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
        /// </summary>
        [Output("urgentMaterialId")]
        public Output<string?> UrgentMaterialId { get; private set; } = null!;


        /// <summary>
        /// Create a Caster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Caster(string name, CasterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:live/caster:Caster", name, args ?? new CasterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Caster(string name, Input<string> id, CasterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:live/caster:Caster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Caster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Caster Get(string name, Input<string> id, CasterState? state = null, CustomResourceOptions? options = null)
        {
            return new Caster(name, id, state, options);
        }
    }

    public sealed class CasterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
        /// </summary>
        [Input("autoSwitchUrgentConfig")]
        public Input<string>? AutoSwitchUrgentConfig { get; set; }

        /// <summary>
        /// Turn on the cut-off automatic switch for broadcast preparation.
        /// 
        /// true: open.
        /// 
        /// false: closed.
        /// </summary>
        [Input("autoSwitchUrgentOn")]
        public Input<bool>? AutoSwitchUrgentOn { get; set; }

        /// <summary>
        /// The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
        /// </summary>
        [Input("callbackUrl")]
        public Input<string>? CallbackUrl { get; set; }

        /// <summary>
        /// Guide station name.
        /// </summary>
        [Input("casterName")]
        public Input<string>? CasterName { get; set; }

        /// <summary>
        /// Delayed playback. Time unit: seconds.
        /// </summary>
        [Input("delay")]
        public Input<double>? Delay { get; set; }

        /// <summary>
        /// Master play domain name.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Guide station specification type. Value:
        /// - 0: Broadcast single type.
        /// - 1: General purpose.
        /// </summary>
        [Input("normType", required: true)]
        public Input<int> NormType { get; set; } = null!;

        /// <summary>
        /// The paymen type of the resource
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Carousel effective flag.
        /// 
        /// 0: Not in effect.
        /// 
        /// 1: Entry into force.
        /// </summary>
        [Input("programEffect")]
        public Input<int>? ProgramEffect { get; set; }

        /// <summary>
        /// The carousel station name, which can be configured when using the carousel function.
        /// </summary>
        [Input("programName")]
        public Input<string>? ProgramName { get; set; }

        /// <summary>
        /// Record configuration information. The format is JSON. The configuration element information is as follows:
        /// </summary>
        [Input("recordConfig")]
        public Input<string>? RecordConfig { get; set; }

        /// <summary>
        /// Resource Group id
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// resource type
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
        /// </summary>
        [Input("sideOutputUrl")]
        public Input<string>? SideOutputUrl { get; set; }

        /// <summary>
        /// The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
        /// </summary>
        [Input("sideOutputUrlList")]
        public Input<string>? SideOutputUrlList { get; set; }

        /// <summary>
        /// Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
        /// - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
        /// - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
        /// - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
        /// - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
        /// </summary>
        [Input("syncGroupsConfig")]
        public Input<string>? SyncGroupsConfig { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Transcoding configuration.
        /// 
        /// JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
        /// </summary>
        [Input("transcodeConfig")]
        public Input<string>? TranscodeConfig { get; set; }

        /// <summary>
        /// The ID of the picture material of the media library.
        /// </summary>
        [Input("urgentImageId")]
        public Input<string>? UrgentImageId { get; set; }

        /// <summary>
        /// Prepare the URL of the picture material.
        /// </summary>
        [Input("urgentImageUrl")]
        public Input<string>? UrgentImageUrl { get; set; }

        /// <summary>
        /// The prepared live stream URL.
        /// </summary>
        [Input("urgentLiveStreamUrl")]
        public Input<string>? UrgentLiveStreamUrl { get; set; }

        /// <summary>
        /// Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
        /// </summary>
        [Input("urgentMaterialId")]
        public Input<string>? UrgentMaterialId { get; set; }

        public CasterArgs()
        {
        }
        public static new CasterArgs Empty => new CasterArgs();
    }

    public sealed class CasterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatic standby broadcast configuration. eofThres: indicates that the broadcast is automatically cut and prepared after the flow interruption time, in seconds.
        /// </summary>
        [Input("autoSwitchUrgentConfig")]
        public Input<string>? AutoSwitchUrgentConfig { get; set; }

        /// <summary>
        /// Turn on the cut-off automatic switch for broadcast preparation.
        /// 
        /// true: open.
        /// 
        /// false: closed.
        /// </summary>
        [Input("autoSwitchUrgentOn")]
        public Input<bool>? AutoSwitchUrgentOn { get; set; }

        /// <summary>
        /// The callback address of the user. To receive Callback Notifications, enter an available address and accept the HTTP protocol. If this parameter is set to null, the callback notification from the director Station is canceled by default.
        /// </summary>
        [Input("callbackUrl")]
        public Input<string>? CallbackUrl { get; set; }

        /// <summary>
        /// Guide station name.
        /// </summary>
        [Input("casterName")]
        public Input<string>? CasterName { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Delayed playback. Time unit: seconds.
        /// </summary>
        [Input("delay")]
        public Input<double>? Delay { get; set; }

        /// <summary>
        /// Master play domain name.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Guide station specification type. Value:
        /// - 0: Broadcast single type.
        /// - 1: General purpose.
        /// </summary>
        [Input("normType")]
        public Input<int>? NormType { get; set; }

        /// <summary>
        /// The paymen type of the resource
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Carousel effective flag.
        /// 
        /// 0: Not in effect.
        /// 
        /// 1: Entry into force.
        /// </summary>
        [Input("programEffect")]
        public Input<int>? ProgramEffect { get; set; }

        /// <summary>
        /// The carousel station name, which can be configured when using the carousel function.
        /// </summary>
        [Input("programName")]
        public Input<string>? ProgramName { get; set; }

        /// <summary>
        /// Record configuration information. The format is JSON. The configuration element information is as follows:
        /// </summary>
        [Input("recordConfig")]
        public Input<string>? RecordConfig { get; set; }

        /// <summary>
        /// Resource Group id
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// resource type
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// The user-defined stream ingest address corresponding to the bypass output address of the guide station. If this parameter is left blank, the streaming address corresponding to the output address automatically generated by Alibaba Cloud is used by default.
        /// </summary>
        [Input("sideOutputUrl")]
        public Input<string>? SideOutputUrl { get; set; }

        /// <summary>
        /// The list of multiple forwarding stream addresses, which can be the CDN forwarding stream addresses of Alibaba Cloud or a third-party vendor. A guide can add up to 20 RTMP forwarding addresses.
        /// </summary>
        [Input("sideOutputUrlList")]
        public Input<string>? SideOutputUrlList { get; set; }

        /// <summary>
        /// Multi-View synchronization configuration to synchronize multiple video sources. Multi-View synchronization is divided into two modes:
        /// - `mode 0`: (In the anchor mode, multiple video sources are synchronized according to the specified mode.)
        /// - `mode 1`: (Conference mode, there is no concept of anchor video, all video sources are synchronized with each other.)
        /// - `Anchor mode`: hostResourceId: the video source of the anchor in Anchor mode.
        /// - `Conference mode`: no hostRsoureId field, only the resource ids in the resourceIds to be provided.
        /// </summary>
        [Input("syncGroupsConfig")]
        public Input<string>? SyncGroupsConfig { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tag of the resource
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Transcoding configuration.
        /// 
        /// JSON format string, Please capitalize the first letter of the internal field of the structure, hump format input. If this parameter is set to null, the transcoding configuration is cleared by default. If the transcoding template is null, an error is reported when the director starts.
        /// </summary>
        [Input("transcodeConfig")]
        public Input<string>? TranscodeConfig { get; set; }

        /// <summary>
        /// The ID of the picture material of the media library.
        /// </summary>
        [Input("urgentImageId")]
        public Input<string>? UrgentImageId { get; set; }

        /// <summary>
        /// Prepare the URL of the picture material.
        /// </summary>
        [Input("urgentImageUrl")]
        public Input<string>? UrgentImageUrl { get; set; }

        /// <summary>
        /// The prepared live stream URL.
        /// </summary>
        [Input("urgentLiveStreamUrl")]
        public Input<string>? UrgentLiveStreamUrl { get; set; }

        /// <summary>
        /// Prepared video, media library material ID. If this parameter is set to null, the standby configuration is cleared by default.
        /// </summary>
        [Input("urgentMaterialId")]
        public Input<string>? UrgentMaterialId { get; set; }

        public CasterState()
        {
        }
        public static new CasterState Empty => new CasterState();
    }
}
