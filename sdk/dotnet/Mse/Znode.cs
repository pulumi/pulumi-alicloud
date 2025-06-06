// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mse
{
    /// <summary>
    /// Provides a Microservice Engine (MSE) Znode resource.
    /// 
    /// For information about Microservice Engine (MSE) Znode and how to use it, see [What is Znode](https://help.aliyun.com/document_detail/393622.html).
    /// 
    /// &gt; **NOTE:** Available since v1.162.0.
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
    ///         ClusterType = "ZooKeeper",
    ///         ClusterVersion = "ZooKeeper_3_8_0",
    ///         InstanceCount = 1,
    ///         NetType = "privatenet",
    ///         PubNetworkFlow = "1",
    ///         AclEntryLists = new[]
    ///         {
    ///             "127.0.0.1/32",
    ///         },
    ///         ClusterAliasName = "terraform-example",
    ///         MseVersion = "mse_dev",
    ///         VswitchId = exampleSwitch.Id,
    ///         VpcId = exampleNetwork.Id,
    ///     });
    /// 
    ///     var exampleZnode = new AliCloud.Mse.Znode("example", new()
    ///     {
    ///         ClusterId = exampleCluster.ClusterId,
    ///         Data = "terraform-example",
    ///         Path = "/example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Microservice Engine (MSE) Znode can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:mse/znode:Znode example &lt;cluster_id&gt;:&lt;path&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mse/znode:Znode")]
    public partial class Znode : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh` or `en`.
        /// </summary>
        [Output("acceptLanguage")]
        public Output<string?> AcceptLanguage { get; private set; } = null!;

        /// <summary>
        /// The ID of the Cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The Node data.
        /// </summary>
        [Output("data")]
        public Output<string?> Data { get; private set; } = null!;

        /// <summary>
        /// The Node path. The value must start with a forward slash (/).
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;


        /// <summary>
        /// Create a Znode resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Znode(string name, ZnodeArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mse/znode:Znode", name, args ?? new ZnodeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Znode(string name, Input<string> id, ZnodeState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mse/znode:Znode", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Znode resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Znode Get(string name, Input<string> id, ZnodeState? state = null, CustomResourceOptions? options = null)
        {
            return new Znode(name, id, state, options);
        }
    }

    public sealed class ZnodeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh` or `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the Cluster.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The Node data.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// The Node path. The value must start with a forward slash (/).
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public ZnodeArgs()
        {
        }
        public static new ZnodeArgs Empty => new ZnodeArgs();
    }

    public sealed class ZnodeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The language type of the returned information. Valid values: `zh` or `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// The ID of the Cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The Node data.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// The Node path. The value must start with a forward slash (/).
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        public ZnodeState()
        {
        }
        public static new ZnodeState Empty => new ZnodeState();
    }
}
