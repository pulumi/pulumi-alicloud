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
    /// Provides a ECS Snapshot resource.
    /// 
    /// For information about ECS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/doc-detail/25524.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.120.0.
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
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableDiskCategory = "cloud_essd",
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         SystemDiskCategory = "cloud_essd",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "192.168.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VswitchName = name,
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "192.168.192.0/24",
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         SecurityGroupName = name,
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ecs.Instance("default", new()
    ///     {
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         SecurityGroups = new[]
    ///         {
    ///             defaultSecurityGroup,
    ///         }.Select(__item =&gt; __item.Id).ToList(),
    ///         InternetChargeType = "PayByTraffic",
    ///         InternetMaxBandwidthOut = 10,
    ///         AvailabilityZone = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.AvailabilityZones[0]),
    ///         InstanceChargeType = "PostPaid",
    ///         SystemDiskCategory = "cloud_essd",
    ///         VswitchId = defaultSwitch.Id,
    ///         InstanceName = name,
    ///         DataDisks = new[]
    ///         {
    ///             new AliCloud.Ecs.Inputs.InstanceDataDiskArgs
    ///             {
    ///                 Category = "cloud_essd",
    ///                 Size = 20,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultEcsDisk = new AliCloud.Ecs.EcsDisk("default", new()
    ///     {
    ///         DiskName = name,
    ///         ZoneId = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.AvailabilityZones[0]),
    ///         Category = "cloud_essd",
    ///         Size = 500,
    ///     });
    /// 
    ///     var defaultEcsDiskAttachment = new AliCloud.Ecs.EcsDiskAttachment("default", new()
    ///     {
    ///         DiskId = defaultEcsDisk.Id,
    ///         InstanceId = defaultInstance.Id,
    ///     });
    /// 
    ///     var defaultEcsSnapshot = new AliCloud.Ecs.EcsSnapshot("default", new()
    ///     {
    ///         DiskId = defaultEcsDiskAttachment.DiskId,
    ///         Category = "standard",
    ///         RetentionDays = 20,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Snapshot can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/ecsSnapshot:EcsSnapshot example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsSnapshot:EcsSnapshot")]
    public partial class EcsSnapshot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The category of the snapshot. Valid values:
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.239.0) The time when the snapshot was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the snapshot.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID of the disk.
        /// </summary>
        [Output("diskId")]
        public Output<string> DiskId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to force delete the snapshot that has been used to create disks. Valid values:
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// Field `instant_access` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Output("instantAccess")]
        public Output<bool?> InstantAccess { get; private set; } = null!;

        /// <summary>
        /// Field `instant_access_retention_days` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Output("instantAccessRetentionDays")]
        public Output<int?> InstantAccessRetentionDays { get; private set; } = null!;

        /// <summary>
        /// Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.239.0) The region ID of the snapshot.
        /// </summary>
        [Output("regionId")]
        public Output<string> RegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group. **NOTE:** From version 1.239.0, `resource_group_id` can be modified.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The retention period of the snapshot. Valid values: `1` to `65536`. **NOTE:** From version 1.231.0, `retention_days` can be modified.
        /// </summary>
        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Output("snapshotName")]
        public Output<string> SnapshotName { get; private set; } = null!;

        /// <summary>
        /// The status of the Snapshot.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a EcsSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsSnapshot(string name, EcsSnapshotArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsSnapshot:EcsSnapshot", name, args ?? new EcsSnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsSnapshot(string name, Input<string> id, EcsSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsSnapshot:EcsSnapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsSnapshot Get(string name, Input<string> id, EcsSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsSnapshot(name, id, state, options);
        }
    }

    public sealed class EcsSnapshotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the snapshot. Valid values:
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The description of the snapshot.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the disk.
        /// </summary>
        [Input("diskId", required: true)]
        public Input<string> DiskId { get; set; } = null!;

        /// <summary>
        /// Specifies whether to force delete the snapshot that has been used to create disks. Valid values:
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// Field `instant_access` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        /// <summary>
        /// Field `instant_access_retention_days` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the resource group. **NOTE:** From version 1.239.0, `resource_group_id` can be modified.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The retention period of the snapshot. Valid values: `1` to `65536`. **NOTE:** From version 1.231.0, `retention_days` can be modified.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EcsSnapshotArgs()
        {
        }
        public static new EcsSnapshotArgs Empty => new EcsSnapshotArgs();
    }

    public sealed class EcsSnapshotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the snapshot. Valid values:
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// (Available since v1.239.0) The time when the snapshot was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the snapshot.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the disk.
        /// </summary>
        [Input("diskId")]
        public Input<string>? DiskId { get; set; }

        /// <summary>
        /// Specifies whether to force delete the snapshot that has been used to create disks. Valid values:
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// Field `instant_access` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        /// <summary>
        /// Field `instant_access_retention_days` has been deprecated from provider version 1.231.0.
        /// </summary>
        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// Field `name` has been deprecated from provider version 1.120.0. New field `snapshot_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Available since v1.239.0) The region ID of the snapshot.
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The ID of the resource group. **NOTE:** From version 1.239.0, `resource_group_id` can be modified.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The retention period of the snapshot. Valid values: `1` to `65536`. **NOTE:** From version 1.231.0, `retention_days` can be modified.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// The status of the Snapshot.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EcsSnapshotState()
        {
        }
        public static new EcsSnapshotState Empty => new EcsSnapshotState();
    }
}
