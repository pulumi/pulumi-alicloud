// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    public static class GetEndpoints
    {
        /// <summary>
        /// The `alicloud.polardb.getEndpoints` data source provides a collection of PolarDB endpoints available in Alibaba Cloud account.
        /// Filters support regular expression for the cluster name, searches by clusterId, and other filters which are listed below.
        /// 
        /// &gt; **NOTE:** Available since v1.68.0+.
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
        ///     var @this = AliCloud.PolarDB.GetNodeClasses.Invoke(new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         Category = "Normal",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.ZoneId)),
        ///         VswitchName = "terraform-example",
        ///     });
        /// 
        ///     var cluster = new AliCloud.PolarDB.Cluster("cluster", new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         DbNodeCount = 2,
        ///         DbNodeClass = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.SupportedEngines[0]?.AvailableResources[0]?.DbNodeClass)),
        ///         VswitchId = defaultSwitch.Id,
        ///     });
        /// 
        ///     var polardbClustersDs = AliCloud.PolarDB.GetClusters.Invoke(new()
        ///     {
        ///         DescriptionRegex = cluster.Description,
        ///         Status = "Running",
        ///     });
        /// 
        ///     var @default = AliCloud.PolarDB.GetEndpoints.Invoke(new()
        ///     {
        ///         DbClusterId = polardbClustersDs.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = @default.Apply(@default =&gt; @default.Apply(getEndpointsResult =&gt; getEndpointsResult.Endpoints[0]?.DbEndpointId)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEndpointsResult> InvokeAsync(GetEndpointsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointsResult>("alicloud:polardb/getEndpoints:getEndpoints", args ?? new GetEndpointsArgs(), options.WithDefaults());

        /// <summary>
        /// The `alicloud.polardb.getEndpoints` data source provides a collection of PolarDB endpoints available in Alibaba Cloud account.
        /// Filters support regular expression for the cluster name, searches by clusterId, and other filters which are listed below.
        /// 
        /// &gt; **NOTE:** Available since v1.68.0+.
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
        ///     var @this = AliCloud.PolarDB.GetNodeClasses.Invoke(new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         Category = "Normal",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.ZoneId)),
        ///         VswitchName = "terraform-example",
        ///     });
        /// 
        ///     var cluster = new AliCloud.PolarDB.Cluster("cluster", new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         DbNodeCount = 2,
        ///         DbNodeClass = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.SupportedEngines[0]?.AvailableResources[0]?.DbNodeClass)),
        ///         VswitchId = defaultSwitch.Id,
        ///     });
        /// 
        ///     var polardbClustersDs = AliCloud.PolarDB.GetClusters.Invoke(new()
        ///     {
        ///         DescriptionRegex = cluster.Description,
        ///         Status = "Running",
        ///     });
        /// 
        ///     var @default = AliCloud.PolarDB.GetEndpoints.Invoke(new()
        ///     {
        ///         DbClusterId = polardbClustersDs.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = @default.Apply(@default =&gt; @default.Apply(getEndpointsResult =&gt; getEndpointsResult.Endpoints[0]?.DbEndpointId)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEndpointsResult> Invoke(GetEndpointsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointsResult>("alicloud:polardb/getEndpoints:getEndpoints", args ?? new GetEndpointsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// The `alicloud.polardb.getEndpoints` data source provides a collection of PolarDB endpoints available in Alibaba Cloud account.
        /// Filters support regular expression for the cluster name, searches by clusterId, and other filters which are listed below.
        /// 
        /// &gt; **NOTE:** Available since v1.68.0+.
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
        ///     var @this = AliCloud.PolarDB.GetNodeClasses.Invoke(new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         Category = "Normal",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.ZoneId)),
        ///         VswitchName = "terraform-example",
        ///     });
        /// 
        ///     var cluster = new AliCloud.PolarDB.Cluster("cluster", new()
        ///     {
        ///         DbType = "MySQL",
        ///         DbVersion = "8.0",
        ///         PayType = "PostPaid",
        ///         DbNodeCount = 2,
        ///         DbNodeClass = @this.Apply(@this =&gt; @this.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.SupportedEngines[0]?.AvailableResources[0]?.DbNodeClass)),
        ///         VswitchId = defaultSwitch.Id,
        ///     });
        /// 
        ///     var polardbClustersDs = AliCloud.PolarDB.GetClusters.Invoke(new()
        ///     {
        ///         DescriptionRegex = cluster.Description,
        ///         Status = "Running",
        ///     });
        /// 
        ///     var @default = AliCloud.PolarDB.GetEndpoints.Invoke(new()
        ///     {
        ///         DbClusterId = polardbClustersDs.Apply(getClustersResult =&gt; getClustersResult.Clusters[0]?.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = @default.Apply(@default =&gt; @default.Apply(getEndpointsResult =&gt; getEndpointsResult.Endpoints[0]?.DbEndpointId)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEndpointsResult> Invoke(GetEndpointsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointsResult>("alicloud:polardb/getEndpoints:getEndpoints", args ?? new GetEndpointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// PolarDB cluster ID.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public string DbClusterId { get; set; } = null!;

        /// <summary>
        /// endpoint of the cluster.
        /// </summary>
        [Input("dbEndpointId")]
        public string? DbEndpointId { get; set; }

        public GetEndpointsArgs()
        {
        }
        public static new GetEndpointsArgs Empty => new GetEndpointsArgs();
    }

    public sealed class GetEndpointsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// PolarDB cluster ID.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// endpoint of the cluster.
        /// </summary>
        [Input("dbEndpointId")]
        public Input<string>? DbEndpointId { get; set; }

        public GetEndpointsInvokeArgs()
        {
        }
        public static new GetEndpointsInvokeArgs Empty => new GetEndpointsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointsResult
    {
        public readonly string DbClusterId;
        /// <summary>
        /// The endpoint ID.
        /// </summary>
        public readonly string? DbEndpointId;
        /// <summary>
        /// A list of PolarDB cluster endpoints. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointsEndpointResult> Endpoints;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetEndpointsResult(
            string dbClusterId,

            string? dbEndpointId,

            ImmutableArray<Outputs.GetEndpointsEndpointResult> endpoints,

            string id)
        {
            DbClusterId = dbClusterId;
            DbEndpointId = dbEndpointId;
            Endpoints = endpoints;
            Id = id;
        }
    }
}
