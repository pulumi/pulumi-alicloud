// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    /// <summary>
    /// Provides a File Storage (NAS) Lifecycle Policy resource.
    /// 
    /// For information about File Storage (NAS) Lifecycle Policy and how to use it, see [What is Lifecycle Policy](https://www.alibabacloud.com/help/en/doc-detail/169362.html).
    /// 
    /// &gt; **NOTE:** Available in v1.153.0+.
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
    ///     var example = new AliCloud.Nas.FileSystem("example", new()
    ///     {
    ///         ProtocolType = "NFS",
    ///         StorageType = "Capacity",
    ///     });
    /// 
    ///     var exampleLifecyclePolicy = new AliCloud.Nas.LifecyclePolicy("example", new()
    ///     {
    ///         FileSystemId = example.Id,
    ///         LifecyclePolicyName = "terraform-example",
    ///         LifecycleRuleName = "DEFAULT_ATIME_14",
    ///         StorageType = "InfrequentAccess",
    ///         Paths = new[]
    ///         {
    ///             "/",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// File Storage (NAS) Lifecycle Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:nas/lifecyclePolicy:LifecyclePolicy example &lt;file_system_id&gt;:&lt;lifecycle_policy_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:nas/lifecyclePolicy:LifecyclePolicy")]
    public partial class LifecyclePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Output("fileSystemId")]
        public Output<string> FileSystemId { get; private set; } = null!;

        /// <summary>
        /// The name of the lifecycle management policy.
        /// </summary>
        [Output("lifecyclePolicyName")]
        public Output<string> LifecyclePolicyName { get; private set; } = null!;

        /// <summary>
        /// The rules in the lifecycle management policy. Valid values: `DEFAULT_ATIME_14`, `DEFAULT_ATIME_30`, `DEFAULT_ATIME_60`, `DEFAULT_ATIME_90`.
        /// </summary>
        [Output("lifecycleRuleName")]
        public Output<string> LifecycleRuleName { get; private set; } = null!;

        /// <summary>
        /// The absolute path of the directory for which the lifecycle management policy is configured. Set a maximum of `10` path. The path value must be prefixed by a forward slash (/) and must be an existing path in the mount target.
        /// </summary>
        [Output("paths")]
        public Output<ImmutableArray<string>> Paths { get; private set; } = null!;

        /// <summary>
        /// The storage type of the data that is dumped to the IA storage medium. Valid values: `InfrequentAccess`.
        /// </summary>
        [Output("storageType")]
        public Output<string> StorageType { get; private set; } = null!;


        /// <summary>
        /// Create a LifecyclePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LifecyclePolicy(string name, LifecyclePolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:nas/lifecyclePolicy:LifecyclePolicy", name, args ?? new LifecyclePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LifecyclePolicy(string name, Input<string> id, LifecyclePolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:nas/lifecyclePolicy:LifecyclePolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LifecyclePolicy Get(string name, Input<string> id, LifecyclePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new LifecyclePolicy(name, id, state, options);
        }
    }

    public sealed class LifecyclePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        /// <summary>
        /// The name of the lifecycle management policy.
        /// </summary>
        [Input("lifecyclePolicyName", required: true)]
        public Input<string> LifecyclePolicyName { get; set; } = null!;

        /// <summary>
        /// The rules in the lifecycle management policy. Valid values: `DEFAULT_ATIME_14`, `DEFAULT_ATIME_30`, `DEFAULT_ATIME_60`, `DEFAULT_ATIME_90`.
        /// </summary>
        [Input("lifecycleRuleName", required: true)]
        public Input<string> LifecycleRuleName { get; set; } = null!;

        [Input("paths", required: true)]
        private InputList<string>? _paths;

        /// <summary>
        /// The absolute path of the directory for which the lifecycle management policy is configured. Set a maximum of `10` path. The path value must be prefixed by a forward slash (/) and must be an existing path in the mount target.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// The storage type of the data that is dumped to the IA storage medium. Valid values: `InfrequentAccess`.
        /// </summary>
        [Input("storageType", required: true)]
        public Input<string> StorageType { get; set; } = null!;

        public LifecyclePolicyArgs()
        {
        }
        public static new LifecyclePolicyArgs Empty => new LifecyclePolicyArgs();
    }

    public sealed class LifecyclePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// The name of the lifecycle management policy.
        /// </summary>
        [Input("lifecyclePolicyName")]
        public Input<string>? LifecyclePolicyName { get; set; }

        /// <summary>
        /// The rules in the lifecycle management policy. Valid values: `DEFAULT_ATIME_14`, `DEFAULT_ATIME_30`, `DEFAULT_ATIME_60`, `DEFAULT_ATIME_90`.
        /// </summary>
        [Input("lifecycleRuleName")]
        public Input<string>? LifecycleRuleName { get; set; }

        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// The absolute path of the directory for which the lifecycle management policy is configured. Set a maximum of `10` path. The path value must be prefixed by a forward slash (/) and must be an existing path in the mount target.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// The storage type of the data that is dumped to the IA storage medium. Valid values: `InfrequentAccess`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        public LifecyclePolicyState()
        {
        }
        public static new LifecyclePolicyState Empty => new LifecyclePolicyState();
    }
}
