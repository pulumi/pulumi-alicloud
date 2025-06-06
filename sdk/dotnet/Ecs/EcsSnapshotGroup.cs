// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a ECS Snapshot Group resource.
    /// 
    /// For information about ECS Snapshot Group and how to use it, see [What is Snapshot Group](https://www.alibabacloud.com/help/en/doc-detail/210939.html).
    /// 
    /// &gt; **NOTE:** Available since v1.160.0.
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
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "Instance",
    ///         AvailableDiskCategory = "cloud_essd",
    ///     });
    /// 
    ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         SystemDiskCategory = "cloud_essd",
    ///     });
    /// 
    ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         Owners = "system",
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = "terraform-example",
    ///         CidrBlock = "172.17.3.0/24",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VswitchName = "terraform-example",
    ///         CidrBlock = "172.17.3.0/24",
    ///         VpcId = defaultNetwork.Id,
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         Name = "terraform-example",
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ecs.Instance("default", new()
    ///     {
    ///         AvailabilityZone = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         InstanceName = "terraform-example",
    ///         SecurityGroups = new[]
    ///         {
    ///             defaultSecurityGroup.Id,
    ///         },
    ///         VswitchId = defaultSwitch.Id,
    ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InternetMaxBandwidthOut = 10,
    ///     });
    /// 
    ///     var defaultEcsDisk = new AliCloud.Ecs.EcsDisk("default", new()
    ///     {
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         DiskName = "terraform-example",
    ///         Description = "terraform-example",
    ///         Category = "cloud_essd",
    ///         Size = 30,
    ///     });
    /// 
    ///     var defaultDiskAttachment = new AliCloud.Ecs.DiskAttachment("default", new()
    ///     {
    ///         DiskId = defaultEcsDisk.Id,
    ///         InstanceId = defaultInstance.Id,
    ///     });
    /// 
    ///     var defaultEcsSnapshotGroup = new AliCloud.Ecs.EcsSnapshotGroup("default", new()
    ///     {
    ///         Description = "terraform-example",
    ///         DiskIds = new[]
    ///         {
    ///             defaultDiskAttachment.DiskId,
    ///         },
    ///         SnapshotGroupName = "terraform-example",
    ///         InstanceId = defaultInstance.Id,
    ///         InstantAccess = true,
    ///         InstantAccessRetentionDays = 1,
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "Acceptance" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Snapshot Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/ecsSnapshotGroup:EcsSnapshotGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsSnapshotGroup:EcsSnapshotGroup")]
    public partial class EcsSnapshotGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID of disk for which to create snapshots. You can specify multiple disk IDs across instances with the same zone.
        /// </summary>
        [Output("diskIds")]
        public Output<ImmutableArray<string>> DiskIds { get; private set; } = null!;

        /// <summary>
        /// The ID of disk N for which you do not need to create snapshots. After this parameter is specified, the created snapshot-consistent group does not contain snapshots of the disk.
        /// </summary>
        [Output("excludeDiskIds")]
        public Output<ImmutableArray<string>> ExcludeDiskIds { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string?> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable the instant access feature.
        /// </summary>
        [Output("instantAccess")]
        public Output<bool?> InstantAccess { get; private set; } = null!;

        /// <summary>
        /// Specify the number of days for which the instant access feature is available. Unit: days. Valid values: `1` to `65535`.
        /// </summary>
        [Output("instantAccessRetentionDays")]
        public Output<int?> InstantAccessRetentionDays { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group to which the snapshot consistency group belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The name of the snapshot-consistent group. The name must be `2` to `128` characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). It must start with a letter or a digit and cannot start with `http://` or `https://`.
        /// </summary>
        [Output("snapshotGroupName")]
        public Output<string?> SnapshotGroupName { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the snapshot group.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a EcsSnapshotGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsSnapshotGroup(string name, EcsSnapshotGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsSnapshotGroup:EcsSnapshotGroup", name, args ?? new EcsSnapshotGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsSnapshotGroup(string name, Input<string> id, EcsSnapshotGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsSnapshotGroup:EcsSnapshotGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsSnapshotGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsSnapshotGroup Get(string name, Input<string> id, EcsSnapshotGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsSnapshotGroup(name, id, state, options);
        }
    }

    public sealed class EcsSnapshotGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("diskIds")]
        private InputList<string>? _diskIds;

        /// <summary>
        /// The ID of disk for which to create snapshots. You can specify multiple disk IDs across instances with the same zone.
        /// </summary>
        public InputList<string> DiskIds
        {
            get => _diskIds ?? (_diskIds = new InputList<string>());
            set => _diskIds = value;
        }

        [Input("excludeDiskIds")]
        private InputList<string>? _excludeDiskIds;

        /// <summary>
        /// The ID of disk N for which you do not need to create snapshots. After this parameter is specified, the created snapshot-consistent group does not contain snapshots of the disk.
        /// </summary>
        public InputList<string> ExcludeDiskIds
        {
            get => _excludeDiskIds ?? (_excludeDiskIds = new InputList<string>());
            set => _excludeDiskIds = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Specifies whether to enable the instant access feature.
        /// </summary>
        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        /// <summary>
        /// Specify the number of days for which the instant access feature is available. Unit: days. Valid values: `1` to `65535`.
        /// </summary>
        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// The ID of the resource group to which the snapshot consistency group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The name of the snapshot-consistent group. The name must be `2` to `128` characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). It must start with a letter or a digit and cannot start with `http://` or `https://`.
        /// </summary>
        [Input("snapshotGroupName")]
        public Input<string>? SnapshotGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the snapshot group.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EcsSnapshotGroupArgs()
        {
        }
        public static new EcsSnapshotGroupArgs Empty => new EcsSnapshotGroupArgs();
    }

    public sealed class EcsSnapshotGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the snapshot-consistent group. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("diskIds")]
        private InputList<string>? _diskIds;

        /// <summary>
        /// The ID of disk for which to create snapshots. You can specify multiple disk IDs across instances with the same zone.
        /// </summary>
        public InputList<string> DiskIds
        {
            get => _diskIds ?? (_diskIds = new InputList<string>());
            set => _diskIds = value;
        }

        [Input("excludeDiskIds")]
        private InputList<string>? _excludeDiskIds;

        /// <summary>
        /// The ID of disk N for which you do not need to create snapshots. After this parameter is specified, the created snapshot-consistent group does not contain snapshots of the disk.
        /// </summary>
        public InputList<string> ExcludeDiskIds
        {
            get => _excludeDiskIds ?? (_excludeDiskIds = new InputList<string>());
            set => _excludeDiskIds = value;
        }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Specifies whether to enable the instant access feature.
        /// </summary>
        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        /// <summary>
        /// Specify the number of days for which the instant access feature is available. Unit: days. Valid values: `1` to `65535`.
        /// </summary>
        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// The ID of the resource group to which the snapshot consistency group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The name of the snapshot-consistent group. The name must be `2` to `128` characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:). It must start with a letter or a digit and cannot start with `http://` or `https://`.
        /// </summary>
        [Input("snapshotGroupName")]
        public Input<string>? SnapshotGroupName { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the snapshot group.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EcsSnapshotGroupState()
        {
        }
        public static new EcsSnapshotGroupState Empty => new EcsSnapshotGroupState();
    }
}
