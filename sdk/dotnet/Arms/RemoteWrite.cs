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
    /// Provides a Application Real-Time Monitoring Service (ARMS) Remote Write resource.
    /// 
    /// For information about Application Real-Time Monitoring Service (ARMS) Remote Write and how to use it, see [What is Remote Write](https://next.api.aliyun.com/api/ARMS/2019-08-08/AddPrometheusInstance).
    /// 
    /// &gt; **NOTE:** Available since v1.204.0.
    /// 
    /// &gt; **DEPRECATED:** This resource has been deprecated since v1.228.0.
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
    ///     var name = config.Get("name") ?? "tf-example";
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
    ///     var defaultRemoteWrite = new AliCloud.Arms.RemoteWrite("default", new()
    ///     {
    ///         ClusterId = defaultPrometheus.Id,
    ///         RemoteWriteYaml = @"remote_write:
    /// - name: ArmsRemoteWrite
    ///   url: http://47.96.227.137:8080/prometheus/xxx/yyy/cn-hangzhou/api/v3/write
    ///   basic_auth: {username: 666, password: '******'}
    ///   write_relabel_configs:
    ///   - source_labels: [instance_id]
    ///     separator: ;
    ///     regex: si-6e2ca86444db4e55a7c1
    ///     replacement: $1
    ///     action: keep
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Application Real-Time Monitoring Service (ARMS) Remote Write can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/remoteWrite:RemoteWrite example &lt;cluster_id&gt;:&lt;remote_write_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/remoteWrite:RemoteWrite")]
    public partial class RemoteWrite : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The name of the Remote Write configuration item.
        /// </summary>
        [Output("remoteWriteName")]
        public Output<string> RemoteWriteName { get; private set; } = null!;

        /// <summary>
        /// The details of the Remote Write configuration item. Specify the value in the YAML format.
        /// </summary>
        [Output("remoteWriteYaml")]
        public Output<string> RemoteWriteYaml { get; private set; } = null!;


        /// <summary>
        /// Create a RemoteWrite resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RemoteWrite(string name, RemoteWriteArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/remoteWrite:RemoteWrite", name, args ?? new RemoteWriteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RemoteWrite(string name, Input<string> id, RemoteWriteState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/remoteWrite:RemoteWrite", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RemoteWrite resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RemoteWrite Get(string name, Input<string> id, RemoteWriteState? state = null, CustomResourceOptions? options = null)
        {
            return new RemoteWrite(name, id, state, options);
        }
    }

    public sealed class RemoteWriteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The details of the Remote Write configuration item. Specify the value in the YAML format.
        /// </summary>
        [Input("remoteWriteYaml", required: true)]
        public Input<string> RemoteWriteYaml { get; set; } = null!;

        public RemoteWriteArgs()
        {
        }
        public static new RemoteWriteArgs Empty => new RemoteWriteArgs();
    }

    public sealed class RemoteWriteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name of the Remote Write configuration item.
        /// </summary>
        [Input("remoteWriteName")]
        public Input<string>? RemoteWriteName { get; set; }

        /// <summary>
        /// The details of the Remote Write configuration item. Specify the value in the YAML format.
        /// </summary>
        [Input("remoteWriteYaml")]
        public Input<string>? RemoteWriteYaml { get; set; }

        public RemoteWriteState()
        {
        }
        public static new RemoteWriteState Empty => new RemoteWriteState();
    }
}
