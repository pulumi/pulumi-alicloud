// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pai
{
    /// <summary>
    /// Provides a PAI Workspace Run resource.
    /// 
    /// For information about PAI Workspace Run and how to use it, see [What is Run](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.236.0.
    /// 
    /// ## Import
    /// 
    /// PAI Workspace Run can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:pai/workspaceRun:WorkspaceRun example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pai/workspaceRun:WorkspaceRun")]
    public partial class WorkspaceRun : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Resource attribute field of the experiment ID to which Run belongs
        /// </summary>
        [Output("experimentId")]
        public Output<string> ExperimentId { get; private set; } = null!;

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Output("runName")]
        public Output<string?> RunName { get; private set; } = null!;

        /// <summary>
        /// Attribute Resource field representing the source task ID
        /// </summary>
        [Output("sourceId")]
        public Output<string?> SourceId { get; private set; } = null!;

        /// <summary>
        /// Resource attribute fields representing the source type
        /// </summary>
        [Output("sourceType")]
        public Output<string?> SourceType { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceRun resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceRun(string name, WorkspaceRunArgs args, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceRun:WorkspaceRun", name, args ?? new WorkspaceRunArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceRun(string name, Input<string> id, WorkspaceRunState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pai/workspaceRun:WorkspaceRun", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkspaceRun resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceRun Get(string name, Input<string> id, WorkspaceRunState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceRun(name, id, state, options);
        }
    }

    public sealed class WorkspaceRunArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource attribute field of the experiment ID to which Run belongs
        /// </summary>
        [Input("experimentId", required: true)]
        public Input<string> ExperimentId { get; set; } = null!;

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("runName")]
        public Input<string>? RunName { get; set; }

        /// <summary>
        /// Attribute Resource field representing the source task ID
        /// </summary>
        [Input("sourceId")]
        public Input<string>? SourceId { get; set; }

        /// <summary>
        /// Resource attribute fields representing the source type
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        public WorkspaceRunArgs()
        {
        }
        public static new WorkspaceRunArgs Empty => new WorkspaceRunArgs();
    }

    public sealed class WorkspaceRunState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Resource attribute field of the experiment ID to which Run belongs
        /// </summary>
        [Input("experimentId")]
        public Input<string>? ExperimentId { get; set; }

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("runName")]
        public Input<string>? RunName { get; set; }

        /// <summary>
        /// Attribute Resource field representing the source task ID
        /// </summary>
        [Input("sourceId")]
        public Input<string>? SourceId { get; set; }

        /// <summary>
        /// Resource attribute fields representing the source type
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        public WorkspaceRunState()
        {
        }
        public static new WorkspaceRunState Empty => new WorkspaceRunState();
    }
}