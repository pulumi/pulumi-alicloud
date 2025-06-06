// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs
{
    /// <summary>
    /// Provides a EBS Replica Pair Drill resource.
    /// 
    /// For information about Elastic Block Storage(EBS) Replica Pair Drill and how to use it, see [What is Replica Pair Drill](https://next.api.alibabacloud.com/document/ebs/2021-07-30/StartPairDrill).
    /// 
    /// &gt; **NOTE:** Available since v1.215.0.
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
    ///     var @default = new AliCloud.Ebs.ReplicaPairDrill("default", new()
    ///     {
    ///         PairId = "pair-cn-wwo3kjfq5001",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// EBS Replica Pair Drill can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ebs/replicaPairDrill:ReplicaPairDrill example &lt;pair_id&gt;:&lt;replica_pair_drill_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ebs/replicaPairDrill:ReplicaPairDrill")]
    public partial class ReplicaPairDrill : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Copy the ID of the pair. You can call DescribeDiskReplicaPairs to query the list of asynchronous replication pairs to obtain the replication pair ID.
        /// </summary>
        [Output("pairId")]
        public Output<string> PairId { get; private set; } = null!;

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Output("replicaPairDrillId")]
        public Output<string> ReplicaPairDrillId { get; private set; } = null!;

        /// <summary>
        /// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ReplicaPairDrill resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReplicaPairDrill(string name, ReplicaPairDrillArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ebs/replicaPairDrill:ReplicaPairDrill", name, args ?? new ReplicaPairDrillArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReplicaPairDrill(string name, Input<string> id, ReplicaPairDrillState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ebs/replicaPairDrill:ReplicaPairDrill", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ReplicaPairDrill resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReplicaPairDrill Get(string name, Input<string> id, ReplicaPairDrillState? state = null, CustomResourceOptions? options = null)
        {
            return new ReplicaPairDrill(name, id, state, options);
        }
    }

    public sealed class ReplicaPairDrillArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Copy the ID of the pair. You can call DescribeDiskReplicaPairs to query the list of asynchronous replication pairs to obtain the replication pair ID.
        /// </summary>
        [Input("pairId", required: true)]
        public Input<string> PairId { get; set; } = null!;

        public ReplicaPairDrillArgs()
        {
        }
        public static new ReplicaPairDrillArgs Empty => new ReplicaPairDrillArgs();
    }

    public sealed class ReplicaPairDrillState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Copy the ID of the pair. You can call DescribeDiskReplicaPairs to query the list of asynchronous replication pairs to obtain the replication pair ID.
        /// </summary>
        [Input("pairId")]
        public Input<string>? PairId { get; set; }

        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        [Input("replicaPairDrillId")]
        public Input<string>? ReplicaPairDrillId { get; set; }

        /// <summary>
        /// Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ReplicaPairDrillState()
        {
        }
        public static new ReplicaPairDrillState Empty => new ReplicaPairDrillState();
    }
}
