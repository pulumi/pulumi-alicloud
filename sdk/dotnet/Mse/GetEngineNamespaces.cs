// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mse
{
    public static class GetEngineNamespaces
    {
        /// <summary>
        /// This data source provides the Mse Engine Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.166.0.
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
        ///     var example = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var exampleNetwork = new AliCloud.Vpc.Network("example", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var exampleSwitch = new AliCloud.Vpc.Switch("example", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = exampleNetwork.Id,
        ///         ZoneId = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var exampleCluster = new AliCloud.Mse.Cluster("example", new()
        ///     {
        ///         ClusterSpecification = "MSE_SC_1_2_60_c",
        ///         ClusterType = "Nacos-Ans",
        ///         ClusterVersion = "NACOS_2_0_0",
        ///         InstanceCount = 3,
        ///         NetType = "privatenet",
        ///         PubNetworkFlow = "1",
        ///         ConnectionType = "slb",
        ///         ClusterAliasName = "terraform-example",
        ///         MseVersion = "mse_pro",
        ///         VswitchId = exampleSwitch.Id,
        ///         VpcId = exampleNetwork.Id,
        ///     });
        /// 
        ///     var exampleEngineNamespace = new AliCloud.Mse.EngineNamespace("example", new()
        ///     {
        ///         InstanceId = exampleCluster.Id,
        ///         NamespaceShowName = "terraform-example",
        ///         NamespaceId = "terraform-example",
        ///         NamespaceDesc = "description",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var exampleGetEngineNamespaces = AliCloud.Mse.GetEngineNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = exampleEngineNamespace.InstanceId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mseEngineNamespaceIdPublic"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[0]?.Id),
        ///         ["mseEngineNamespaceIdExample"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[1]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEngineNamespacesResult> InvokeAsync(GetEngineNamespacesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEngineNamespacesResult>("alicloud:mse/getEngineNamespaces:getEngineNamespaces", args ?? new GetEngineNamespacesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mse Engine Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.166.0.
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
        ///     var example = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var exampleNetwork = new AliCloud.Vpc.Network("example", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var exampleSwitch = new AliCloud.Vpc.Switch("example", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = exampleNetwork.Id,
        ///         ZoneId = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var exampleCluster = new AliCloud.Mse.Cluster("example", new()
        ///     {
        ///         ClusterSpecification = "MSE_SC_1_2_60_c",
        ///         ClusterType = "Nacos-Ans",
        ///         ClusterVersion = "NACOS_2_0_0",
        ///         InstanceCount = 3,
        ///         NetType = "privatenet",
        ///         PubNetworkFlow = "1",
        ///         ConnectionType = "slb",
        ///         ClusterAliasName = "terraform-example",
        ///         MseVersion = "mse_pro",
        ///         VswitchId = exampleSwitch.Id,
        ///         VpcId = exampleNetwork.Id,
        ///     });
        /// 
        ///     var exampleEngineNamespace = new AliCloud.Mse.EngineNamespace("example", new()
        ///     {
        ///         InstanceId = exampleCluster.Id,
        ///         NamespaceShowName = "terraform-example",
        ///         NamespaceId = "terraform-example",
        ///         NamespaceDesc = "description",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var exampleGetEngineNamespaces = AliCloud.Mse.GetEngineNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = exampleEngineNamespace.InstanceId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mseEngineNamespaceIdPublic"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[0]?.Id),
        ///         ["mseEngineNamespaceIdExample"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[1]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEngineNamespacesResult> Invoke(GetEngineNamespacesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEngineNamespacesResult>("alicloud:mse/getEngineNamespaces:getEngineNamespaces", args ?? new GetEngineNamespacesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mse Engine Namespaces of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.166.0.
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
        ///     var example = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var exampleNetwork = new AliCloud.Vpc.Network("example", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var exampleSwitch = new AliCloud.Vpc.Switch("example", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = exampleNetwork.Id,
        ///         ZoneId = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var exampleCluster = new AliCloud.Mse.Cluster("example", new()
        ///     {
        ///         ClusterSpecification = "MSE_SC_1_2_60_c",
        ///         ClusterType = "Nacos-Ans",
        ///         ClusterVersion = "NACOS_2_0_0",
        ///         InstanceCount = 3,
        ///         NetType = "privatenet",
        ///         PubNetworkFlow = "1",
        ///         ConnectionType = "slb",
        ///         ClusterAliasName = "terraform-example",
        ///         MseVersion = "mse_pro",
        ///         VswitchId = exampleSwitch.Id,
        ///         VpcId = exampleNetwork.Id,
        ///     });
        /// 
        ///     var exampleEngineNamespace = new AliCloud.Mse.EngineNamespace("example", new()
        ///     {
        ///         InstanceId = exampleCluster.Id,
        ///         NamespaceShowName = "terraform-example",
        ///         NamespaceId = "terraform-example",
        ///         NamespaceDesc = "description",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var exampleGetEngineNamespaces = AliCloud.Mse.GetEngineNamespaces.Invoke(new()
        ///     {
        ///         InstanceId = exampleEngineNamespace.InstanceId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mseEngineNamespaceIdPublic"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[0]?.Id),
        ///         ["mseEngineNamespaceIdExample"] = exampleGetEngineNamespaces.Apply(getEngineNamespacesResult =&gt; getEngineNamespacesResult.Namespaces[1]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEngineNamespacesResult> Invoke(GetEngineNamespacesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEngineNamespacesResult>("alicloud:mse/getEngineNamespaces:getEngineNamespaces", args ?? new GetEngineNamespacesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEngineNamespacesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh`, `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public string? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the cluster.
        /// </summary>
        [Input("clusterId")]
        public string? ClusterId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Engine Namespace IDs. It is formatted to `&lt;instance_id&gt;:&lt;namespace_id&gt;`.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the MSE Cluster Instance.It is formatted to `mse-cn-xxxxxxxxxxx`.Available since v1.232.0
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// 
        /// **NOTE:** You must set `cluster_id` or `instance_id` or both.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetEngineNamespacesArgs()
        {
        }
        public static new GetEngineNamespacesArgs Empty => new GetEngineNamespacesArgs();
    }

    public sealed class GetEngineNamespacesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh`, `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Engine Namespace IDs. It is formatted to `&lt;instance_id&gt;:&lt;namespace_id&gt;`.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the MSE Cluster Instance.It is formatted to `mse-cn-xxxxxxxxxxx`.Available since v1.232.0
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// 
        /// **NOTE:** You must set `cluster_id` or `instance_id` or both.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetEngineNamespacesInvokeArgs()
        {
        }
        public static new GetEngineNamespacesInvokeArgs Empty => new GetEngineNamespacesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEngineNamespacesResult
    {
        public readonly string? AcceptLanguage;
        public readonly string? ClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceId;
        /// <summary>
        /// A list of Mse Engine Namespaces. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEngineNamespacesNamespaceResult> Namespaces;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetEngineNamespacesResult(
            string? acceptLanguage,

            string? clusterId,

            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            ImmutableArray<Outputs.GetEngineNamespacesNamespaceResult> namespaces,

            string? outputFile)
        {
            AcceptLanguage = acceptLanguage;
            ClusterId = clusterId;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            Namespaces = namespaces;
            OutputFile = outputFile;
        }
    }
}
