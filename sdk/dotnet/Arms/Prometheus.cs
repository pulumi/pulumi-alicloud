// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a Application Real-Time Monitoring Service (ARMS) Prometheus resource.
    /// 
    /// For information about Application Real-Time Monitoring Service (ARMS) Prometheus and how to use it, see [What is Prometheus](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createprometheusinstance).
    /// 
    /// &gt; **NOTE:** Available since v1.203.0.
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
    ///     var name = config.Get("name") ?? "tf_example";
    ///     var @default = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VswitchName = name,
    ///         CidrBlock = "10.4.0.0/24",
    ///         VpcId = defaultNetwork.Id,
    ///         ZoneId = Output.Tuple(@default, @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones)).Length).Apply(values =&gt;
    ///         {
    ///             var @default = values.Item1;
    ///             var length = values.Item2;
    ///             return @default.Apply(getZonesResult =&gt; getZonesResult.Zones)[length - 1].Id;
    ///         }),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         Name = name,
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultGetResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke();
    /// 
    ///     var defaultPrometheus = new AliCloud.Arms.Prometheus("default", new()
    ///     {
    ///         ClusterType = "ecs",
    ///         GrafanaInstanceId = "free",
    ///         VpcId = defaultNetwork.Id,
    ///         VswitchId = defaultSwitch.Id,
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         ClusterName = defaultNetwork.Id.Apply(id =&gt; $"{name}-{id}"),
    ///         ResourceGroupId = defaultGetResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "Prometheus" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Application Real-Time Monitoring Service (ARMS) Prometheus can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/prometheus:Prometheus example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/prometheus:Prometheus")]
    public partial class Prometheus : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        /// </summary>
        [Output("clusterType")]
        public Output<string> ClusterType { get; private set; } = null!;

        /// <summary>
        /// The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        /// </summary>
        [Output("grafanaInstanceId")]
        public Output<string> GrafanaInstanceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Output("securityGroupId")]
        public Output<string?> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The child instance json string of the globalView instance.
        /// </summary>
        [Output("subClustersJson")]
        public Output<string?> SubClustersJson { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Prometheus resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Prometheus(string name, PrometheusArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/prometheus:Prometheus", name, args ?? new PrometheusArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Prometheus(string name, Input<string> id, PrometheusState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/prometheus:Prometheus", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Prometheus resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Prometheus Get(string name, Input<string> id, PrometheusState? state = null, CustomResourceOptions? options = null)
        {
            return new Prometheus(name, id, state, options);
        }
    }

    public sealed class PrometheusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        /// </summary>
        [Input("clusterType", required: true)]
        public Input<string> ClusterType { get; set; } = null!;

        /// <summary>
        /// The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        /// </summary>
        [Input("grafanaInstanceId", required: true)]
        public Input<string> GrafanaInstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The child instance json string of the globalView instance.
        /// </summary>
        [Input("subClustersJson")]
        public Input<string>? SubClustersJson { get; set; }

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

        /// <summary>
        /// The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public PrometheusArgs()
        {
        }
        public static new PrometheusArgs Empty => new PrometheusArgs();
    }

    public sealed class PrometheusState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Kubernetes cluster. This parameter is required, if you set `cluster_type` to `aliyun-cs`.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name of the created cluster. This parameter is required, if you set `cluster_type` to `remote-write`, `ecs` or `global-view`.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// The type of the Prometheus instance. Valid values: `remote-write`, `ecs`, `global-view`, `aliyun-cs`.
        /// </summary>
        [Input("clusterType")]
        public Input<string>? ClusterType { get; set; }

        /// <summary>
        /// The ID of the Grafana dedicated instance. When using the shared version of Grafana, you can set `grafana_instance_id` to `free`.
        /// </summary>
        [Input("grafanaInstanceId")]
        public Input<string>? GrafanaInstanceId { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The ID of the security group. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The child instance json string of the globalView instance.
        /// </summary>
        [Input("subClustersJson")]
        public Input<string>? SubClustersJson { get; set; }

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

        /// <summary>
        /// The ID of the VPC. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the VSwitch. This parameter is required, if you set `cluster_type` to `ecs` or `aliyun-cs`(ASK instance).
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public PrometheusState()
        {
        }
        public static new PrometheusState Empty => new PrometheusState();
    }
}
