// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    /// <summary>
    /// Provides a Hybrid Backup Recovery (HBR) Ecs Backup Client resource.
    /// 
    /// For information about Hybrid Backup Recovery (HBR) Ecs Backup Client and how to use it, see [What is Ecs Backup Client](https://www.alibabacloud.com/help/doc-detail/186570.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.132.0+.
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
    ///         AvailableResourceCreation = "Instance",
    ///     });
    /// 
    ///     var exampleGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 1,
    ///         MemorySize = 2,
    ///     });
    /// 
    ///     var exampleGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         Owners = "system",
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
    ///     var exampleSecurityGroup = new AliCloud.Ecs.SecurityGroup("example", new()
    ///     {
    ///         Name = "terraform-example",
    ///         VpcId = exampleNetwork.Id,
    ///     });
    /// 
    ///     var exampleInstance = new AliCloud.Ecs.Instance("example", new()
    ///     {
    ///         ImageId = exampleGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = exampleGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         AvailabilityZone = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         SecurityGroups = new[]
    ///         {
    ///             exampleSecurityGroup.Id,
    ///         },
    ///         InstanceName = "terraform-example",
    ///         InternetChargeType = "PayByBandwidth",
    ///         VswitchId = exampleSwitch.Id,
    ///     });
    /// 
    ///     var exampleEcsBackupClient = new AliCloud.Hbr.EcsBackupClient("example", new()
    ///     {
    ///         InstanceId = exampleInstance.Id,
    ///         UseHttps = false,
    ///         DataNetworkType = "VPC",
    ///         MaxCpuCore = "2",
    ///         MaxWorker = "4",
    ///         DataProxySetting = "USE_CONTROL_PROXY",
    ///         ProxyHost = "192.168.11.101",
    ///         ProxyPort = "80",
    ///         ProxyUser = "user",
    ///         ProxyPassword = "password",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Notice
    /// 
    /// &gt; **Note:** Please read the following precautions carefully before deleting a client:
    /// 1. You cannot delete active clients that have received heartbeat packets within one hour.
    /// 2. You can make the client inactive by change the status of client to `STOPPED`.
    /// 3. The resources bound to the client will be deleted in cascade, including:
    ///     - Backup plan
    ///     - Backup task (Running in the background)
    ///     - Snapshot
    /// 
    /// ## Import
    /// 
    /// Hybrid Backup Recovery (HBR) Ecs Backup Client can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:hbr/ecsBackupClient:EcsBackupClient example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/ecsBackupClient:EcsBackupClient")]
    public partial class EcsBackupClient : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
        /// </summary>
        [Output("dataNetworkType")]
        public Output<string> DataNetworkType { get; private set; } = null!;

        /// <summary>
        /// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
        /// </summary>
        [Output("dataProxySetting")]
        public Output<string> DataProxySetting { get; private set; } = null!;

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The number of CPU cores used by a single backup task, 0 means no restrictions.
        /// </summary>
        [Output("maxCpuCore")]
        public Output<string> MaxCpuCore { get; private set; } = null!;

        /// <summary>
        /// The number of concurrent jobs for a single backup task, 0 means no restrictions.
        /// </summary>
        [Output("maxWorker")]
        public Output<string> MaxWorker { get; private set; } = null!;

        /// <summary>
        /// Custom data plane proxy server host address.
        /// </summary>
        [Output("proxyHost")]
        public Output<string> ProxyHost { get; private set; } = null!;

        /// <summary>
        /// The password of custom data plane proxy server.
        /// </summary>
        [Output("proxyPassword")]
        public Output<string> ProxyPassword { get; private set; } = null!;

        /// <summary>
        /// Custom data plane proxy server host port.
        /// </summary>
        [Output("proxyPort")]
        public Output<string> ProxyPort { get; private set; } = null!;

        /// <summary>
        /// The username of custom data plane proxy server.
        /// </summary>
        [Output("proxyUser")]
        public Output<string> ProxyUser { get; private set; } = null!;

        /// <summary>
        /// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
        /// </summary>
        [Output("useHttps")]
        public Output<bool> UseHttps { get; private set; } = null!;


        /// <summary>
        /// Create a EcsBackupClient resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsBackupClient(string name, EcsBackupClientArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/ecsBackupClient:EcsBackupClient", name, args ?? new EcsBackupClientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsBackupClient(string name, Input<string> id, EcsBackupClientState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/ecsBackupClient:EcsBackupClient", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsBackupClient resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsBackupClient Get(string name, Input<string> id, EcsBackupClientState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsBackupClient(name, id, state, options);
        }
    }

    public sealed class EcsBackupClientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
        /// </summary>
        [Input("dataNetworkType")]
        public Input<string>? DataNetworkType { get; set; }

        /// <summary>
        /// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
        /// </summary>
        [Input("dataProxySetting")]
        public Input<string>? DataProxySetting { get; set; }

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The number of CPU cores used by a single backup task, 0 means no restrictions.
        /// </summary>
        [Input("maxCpuCore")]
        public Input<string>? MaxCpuCore { get; set; }

        /// <summary>
        /// The number of concurrent jobs for a single backup task, 0 means no restrictions.
        /// </summary>
        [Input("maxWorker")]
        public Input<string>? MaxWorker { get; set; }

        /// <summary>
        /// Custom data plane proxy server host address.
        /// </summary>
        [Input("proxyHost")]
        public Input<string>? ProxyHost { get; set; }

        /// <summary>
        /// The password of custom data plane proxy server.
        /// </summary>
        [Input("proxyPassword")]
        public Input<string>? ProxyPassword { get; set; }

        /// <summary>
        /// Custom data plane proxy server host port.
        /// </summary>
        [Input("proxyPort")]
        public Input<string>? ProxyPort { get; set; }

        /// <summary>
        /// The username of custom data plane proxy server.
        /// </summary>
        [Input("proxyUser")]
        public Input<string>? ProxyUser { get; set; }

        /// <summary>
        /// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
        /// </summary>
        [Input("useHttps")]
        public Input<bool>? UseHttps { get; set; }

        public EcsBackupClientArgs()
        {
        }
        public static new EcsBackupClientArgs Empty => new EcsBackupClientArgs();
    }

    public sealed class EcsBackupClientState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
        /// </summary>
        [Input("dataNetworkType")]
        public Input<string>? DataNetworkType { get; set; }

        /// <summary>
        /// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
        /// </summary>
        [Input("dataProxySetting")]
        public Input<string>? DataProxySetting { get; set; }

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The number of CPU cores used by a single backup task, 0 means no restrictions.
        /// </summary>
        [Input("maxCpuCore")]
        public Input<string>? MaxCpuCore { get; set; }

        /// <summary>
        /// The number of concurrent jobs for a single backup task, 0 means no restrictions.
        /// </summary>
        [Input("maxWorker")]
        public Input<string>? MaxWorker { get; set; }

        /// <summary>
        /// Custom data plane proxy server host address.
        /// </summary>
        [Input("proxyHost")]
        public Input<string>? ProxyHost { get; set; }

        /// <summary>
        /// The password of custom data plane proxy server.
        /// </summary>
        [Input("proxyPassword")]
        public Input<string>? ProxyPassword { get; set; }

        /// <summary>
        /// Custom data plane proxy server host port.
        /// </summary>
        [Input("proxyPort")]
        public Input<string>? ProxyPort { get; set; }

        /// <summary>
        /// The username of custom data plane proxy server.
        /// </summary>
        [Input("proxyUser")]
        public Input<string>? ProxyUser { get; set; }

        /// <summary>
        /// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
        /// </summary>
        [Input("useHttps")]
        public Input<bool>? UseHttps { get; set; }

        public EcsBackupClientState()
        {
        }
        public static new EcsBackupClientState Empty => new EcsBackupClientState();
    }
}
