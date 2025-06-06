// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a ECS Invocation resource.
    /// 
    /// For information about ECS Invocation and how to use it, see [What is Invocation](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/invokecommand#t9958.html).
    /// 
    /// &gt; **NOTE:** Available since v1.168.0.
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
    ///         AvailableDiskCategory = "cloud_efficiency",
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 2,
    ///         MemorySize = 8,
    ///         InstanceTypeFamily = "ecs.g6",
    ///     });
    /// 
    ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/24",
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         VswitchName = name,
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         SecurityGroupName = name,
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultSecurityGroupRule = new AliCloud.Ecs.SecurityGroupRule("default", new()
    ///     {
    ///         Type = "ingress",
    ///         IpProtocol = "tcp",
    ///         NicType = "intranet",
    ///         Policy = "accept",
    ///         PortRange = "22/22",
    ///         Priority = 1,
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         CidrIp = "172.16.0.0/24",
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ecs.Instance("default", new()
    ///     {
    ///         VswitchId = defaultSwitch.Id,
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         SystemDiskCategory = "cloud_efficiency",
    ///         InternetChargeType = "PayByTraffic",
    ///         InternetMaxBandwidthOut = 5,
    ///         SecurityGroups = new[]
    ///         {
    ///             defaultSecurityGroup.Id,
    ///         },
    ///         InstanceName = name,
    ///     });
    /// 
    ///     var defaultCommand = new AliCloud.Ecs.Command("default", new()
    ///     {
    ///         Name = name,
    ///         CommandContent = "ZWNobyBoZWxsbyx7e25hbWV9fQ==",
    ///         Description = "For Terraform Test",
    ///         Type = "RunShellScript",
    ///         WorkingDir = "/root",
    ///         EnableParameter = true,
    ///     });
    /// 
    ///     var defaultEcsInvocation = new AliCloud.Ecs.EcsInvocation("default", new()
    ///     {
    ///         CommandId = defaultCommand.Id,
    ///         InstanceIds = new[]
    ///         {
    ///             defaultInstance.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Invocation can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/ecsInvocation:EcsInvocation example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsInvocation:EcsInvocation")]
    public partial class EcsInvocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the command.
        /// </summary>
        [Output("commandId")]
        public Output<string> CommandId { get; private set; } = null!;

        /// <summary>
        /// The schedule on which the recurring execution of the command takes place. Take note of the following items:
        /// * The interval between two consecutive executions must be 10 seconds or longer. The minimum interval cannot be less than the timeout period of the execution.
        /// * When you set Timed to true, you must specify Frequency.
        /// * The value of the Frequency parameter is a cron expression. For more information, see [Cron expression](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/cron-expression).
        /// </summary>
        [Output("frequency")]
        public Output<string?> Frequency { get; private set; } = null!;

        /// <summary>
        /// The list of instances to execute the command. You can specify up to 50 instance IDs.
        /// </summary>
        [Output("instanceIds")]
        public Output<ImmutableArray<string>> InstanceIds { get; private set; } = null!;

        /// <summary>
        /// The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled.  Number of custom parameters: 0 to 10.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// Specifies how to run the command. Valid values: `Once`, `Period`, `NextRebootOnly`, `EveryReboot`. Default value: When `timed` is set to false and Frequency is not specified, the default value of `repeat_mode` is `Once`. When `Timed` is set to true and Frequency is specified, `period` is used as the value of RepeatMode regardless of whether `repeat_mode` is specified.
        /// </summary>
        [Output("repeatMode")]
        public Output<string> RepeatMode { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to periodically run the command. Default value: `false`.
        /// </summary>
        [Output("timed")]
        public Output<bool> Timed { get; private set; } = null!;

        /// <summary>
        /// The username that is used to run the command on the ECS instance. 
        /// * For Linux instances, the root username is used.
        /// * For Windows instances, the System username is used.
        /// * You can also specify other usernames that already exist in the ECS instance to run the command. It is more secure to run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/run-cloud-assistant-commands-as-a-regular-user).
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// The name of the password used to run the command on a Windows instance.
        /// </summary>
        [Output("windowsPasswordName")]
        public Output<string?> WindowsPasswordName { get; private set; } = null!;


        /// <summary>
        /// Create a EcsInvocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsInvocation(string name, EcsInvocationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsInvocation:EcsInvocation", name, args ?? new EcsInvocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsInvocation(string name, Input<string> id, EcsInvocationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsInvocation:EcsInvocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsInvocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsInvocation Get(string name, Input<string> id, EcsInvocationState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsInvocation(name, id, state, options);
        }
    }

    public sealed class EcsInvocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the command.
        /// </summary>
        [Input("commandId", required: true)]
        public Input<string> CommandId { get; set; } = null!;

        /// <summary>
        /// The schedule on which the recurring execution of the command takes place. Take note of the following items:
        /// * The interval between two consecutive executions must be 10 seconds or longer. The minimum interval cannot be less than the timeout period of the execution.
        /// * When you set Timed to true, you must specify Frequency.
        /// * The value of the Frequency parameter is a cron expression. For more information, see [Cron expression](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/cron-expression).
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        [Input("instanceIds", required: true)]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// The list of instances to execute the command. You can specify up to 50 instance IDs.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled.  Number of custom parameters: 0 to 10.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Specifies how to run the command. Valid values: `Once`, `Period`, `NextRebootOnly`, `EveryReboot`. Default value: When `timed` is set to false and Frequency is not specified, the default value of `repeat_mode` is `Once`. When `Timed` is set to true and Frequency is specified, `period` is used as the value of RepeatMode regardless of whether `repeat_mode` is specified.
        /// </summary>
        [Input("repeatMode")]
        public Input<string>? RepeatMode { get; set; }

        /// <summary>
        /// Specifies whether to periodically run the command. Default value: `false`.
        /// </summary>
        [Input("timed")]
        public Input<bool>? Timed { get; set; }

        /// <summary>
        /// The username that is used to run the command on the ECS instance. 
        /// * For Linux instances, the root username is used.
        /// * For Windows instances, the System username is used.
        /// * You can also specify other usernames that already exist in the ECS instance to run the command. It is more secure to run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/run-cloud-assistant-commands-as-a-regular-user).
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// The name of the password used to run the command on a Windows instance.
        /// </summary>
        [Input("windowsPasswordName")]
        public Input<string>? WindowsPasswordName { get; set; }

        public EcsInvocationArgs()
        {
        }
        public static new EcsInvocationArgs Empty => new EcsInvocationArgs();
    }

    public sealed class EcsInvocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the command.
        /// </summary>
        [Input("commandId")]
        public Input<string>? CommandId { get; set; }

        /// <summary>
        /// The schedule on which the recurring execution of the command takes place. Take note of the following items:
        /// * The interval between two consecutive executions must be 10 seconds or longer. The minimum interval cannot be less than the timeout period of the execution.
        /// * When you set Timed to true, you must specify Frequency.
        /// * The value of the Frequency parameter is a cron expression. For more information, see [Cron expression](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/cron-expression).
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// The list of instances to execute the command. You can specify up to 50 instance IDs.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// The key-value pairs of custom parameters to be passed in when the custom parameter feature is enabled.  Number of custom parameters: 0 to 10.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Specifies how to run the command. Valid values: `Once`, `Period`, `NextRebootOnly`, `EveryReboot`. Default value: When `timed` is set to false and Frequency is not specified, the default value of `repeat_mode` is `Once`. When `Timed` is set to true and Frequency is specified, `period` is used as the value of RepeatMode regardless of whether `repeat_mode` is specified.
        /// </summary>
        [Input("repeatMode")]
        public Input<string>? RepeatMode { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Specifies whether to periodically run the command. Default value: `false`.
        /// </summary>
        [Input("timed")]
        public Input<bool>? Timed { get; set; }

        /// <summary>
        /// The username that is used to run the command on the ECS instance. 
        /// * For Linux instances, the root username is used.
        /// * For Windows instances, the System username is used.
        /// * You can also specify other usernames that already exist in the ECS instance to run the command. It is more secure to run Cloud Assistant commands as a regular user. For more information, see [Configure a regular user to run Cloud Assistant commands](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/run-cloud-assistant-commands-as-a-regular-user).
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// The name of the password used to run the command on a Windows instance.
        /// </summary>
        [Input("windowsPasswordName")]
        public Input<string>? WindowsPasswordName { get; set; }

        public EcsInvocationState()
        {
        }
        public static new EcsInvocationState Empty => new EcsInvocationState();
    }
}
