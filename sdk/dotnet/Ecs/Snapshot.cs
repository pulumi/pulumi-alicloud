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
    /// Provides an ECS snapshot resource.
    /// 
    /// For information about snapshot and how to use it, see [Snapshot](https://www.alibabacloud.com/help/doc-detail/25460.html).
    /// 
    /// &gt; **NOTE:** Deprecated since v1.120.0.
    /// 
    /// &gt; **DEPRECATED:** This resource has been renamed to alicloud.ecs.EcsSnapshot from version 1.120.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var snapshot = new AliCloud.Ecs.Snapshot("snapshot", new()
    ///     {
    ///         DiskId = instance_attachment.DiskId,
    ///         Name = "test-snapshot",
    ///         Description = "this snapshot is created for testing",
    ///         Tags = 
    ///         {
    ///             { "version", "1.2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Snapshot can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/snapshot:Snapshot snapshot s-abc1234567890000
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/snapshot:Snapshot")]
    public partial class Snapshot : global::Pulumi.CustomResource
    {
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The source disk ID.
        /// </summary>
        [Output("diskId")]
        public Output<string> DiskId { get; private set; } = null!;

        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        [Output("instantAccess")]
        public Output<bool?> InstantAccess { get; private set; } = null!;

        [Output("instantAccessRetentionDays")]
        public Output<int?> InstantAccessRetentionDays { get; private set; } = null!;

        /// <summary>
        /// The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
        /// It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("regionId")]
        public Output<string> RegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;

        [Output("snapshotName")]
        public Output<string> SnapshotName { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Snapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Snapshot(string name, SnapshotArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/snapshot:Snapshot", name, args ?? new SnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Snapshot(string name, Input<string> id, SnapshotState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/snapshot:Snapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Snapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Snapshot Get(string name, Input<string> id, SnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new Snapshot(name, id, state, options);
        }
    }

    public sealed class SnapshotArgs : global::Pulumi.ResourceArgs
    {
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The source disk ID.
        /// </summary>
        [Input("diskId", required: true)]
        public Input<string> DiskId { get; set; } = null!;

        [Input("force")]
        public Input<bool>? Force { get; set; }

        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
        /// It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

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

        public SnapshotArgs()
        {
        }
        public static new SnapshotArgs Empty => new SnapshotArgs();
    }

    public sealed class SnapshotState : global::Pulumi.ResourceArgs
    {
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description of the snapshot. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The source disk ID.
        /// </summary>
        [Input("diskId")]
        public Input<string>? DiskId { get; set; }

        [Input("force")]
        public Input<bool>? Force { get; set; }

        [Input("instantAccess")]
        public Input<bool>? InstantAccess { get; set; }

        [Input("instantAccessRetentionDays")]
        public Input<int>? InstantAccessRetentionDays { get; set; }

        /// <summary>
        /// The name of the snapshot to be created. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
        /// It cannot start with auto, because snapshot names starting with auto are recognized as automatic snapshots.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

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

        public SnapshotState()
        {
        }
        public static new SnapshotState Empty => new SnapshotState();
    }
}
