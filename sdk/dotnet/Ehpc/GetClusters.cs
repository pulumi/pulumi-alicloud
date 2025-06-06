// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ehpc
{
    public static class GetClusters
    {
        /// <summary>
        /// This data source provides the Ehpc Clusters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.173.0.
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
        ///     var ids = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Cluster",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcClusterId1"] = ids.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///         ["ehpcClusterId2"] = nameRegex.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetClustersResult> InvokeAsync(GetClustersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClustersResult>("alicloud:ehpc/getClusters:getClusters", args ?? new GetClustersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ehpc Clusters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.173.0.
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
        ///     var ids = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Cluster",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcClusterId1"] = ids.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///         ["ehpcClusterId2"] = nameRegex.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClustersResult> Invoke(GetClustersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClustersResult>("alicloud:ehpc/getClusters:getClusters", args ?? new GetClustersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ehpc Clusters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.173.0.
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
        ///     var ids = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Ehpc.GetClusters.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Cluster",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ehpcClusterId1"] = ids.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///         ["ehpcClusterId2"] = nameRegex.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetClustersResult> Invoke(GetClustersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetClustersResult>("alicloud:ehpc/getClusters:getClusters", args ?? new GetClustersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClustersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Cluster IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Cluster name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values:
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetClustersArgs()
        {
        }
        public static new GetClustersArgs Empty => new GetClustersArgs();
    }

    public sealed class GetClustersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Cluster IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Cluster name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values:
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetClustersInvokeArgs()
        {
        }
        public static new GetClustersInvokeArgs Empty => new GetClustersInvokeArgs();
    }


    [OutputType]
    public sealed class GetClustersResult
    {
        /// <summary>
        /// A list of Ehpc Clusters. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterResult> Clusters;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Cluster names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetClustersResult(
            ImmutableArray<Outputs.GetClustersClusterResult> clusters,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            Clusters = clusters;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
