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
    /// Provides a Hybrid Backup Recovery (HBR) Server Backup Plan resource.
    /// 
    /// For information about Hybrid Backup Recovery (HBR) Server Backup Plan and how to use it, see [What is Server Backup Plan](https://www.alibabacloud.com/help/doc-detail/211140.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.142.0.
    /// 
    /// &gt; **NOTE:** Deprecated since v1.249.0.
    /// 
    /// &gt; **DEPRECATED:** This resource has been deprecated from version `1.249.0`. Please use new resource alicloud.hbr.Policy and alicloud_hbr_policy_binding.
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
    ///     var exampleServerBackupPlan = new AliCloud.Hbr.ServerBackupPlan("example", new()
    ///     {
    ///         EcsServerBackupPlanName = "terraform-example",
    ///         InstanceId = exampleInstance.Id,
    ///         Schedule = "I|1602673264|PT2H",
    ///         Retention = 1,
    ///         Details = new[]
    ///         {
    ///             new AliCloud.Hbr.Inputs.ServerBackupPlanDetailArgs
    ///             {
    ///                 AppConsistent = true,
    ///                 SnapshotGroup = true,
    ///             },
    ///         },
    ///         Disabled = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Hybrid Backup Recovery (HBR) Server Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:hbr/serverBackupPlan:ServerBackupPlan example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/serverBackupPlan:ServerBackupPlan")]
    public partial class ServerBackupPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Output("crossAccountRoleName")]
        public Output<string?> CrossAccountRoleName { get; private set; } = null!;

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Output("crossAccountType")]
        public Output<string> CrossAccountType { get; private set; } = null!;

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Output("crossAccountUserId")]
        public Output<int?> CrossAccountUserId { get; private set; } = null!;

        /// <summary>
        /// ECS server backup plan details.
        /// </summary>
        [Output("details")]
        public Output<ImmutableArray<Outputs.ServerBackupPlanDetail>> Details { get; private set; } = null!;

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Output("ecsServerBackupPlanName")]
        public Output<string> EcsServerBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Output("retention")]
        public Output<int> Retention { get; private set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`
        /// * `startTime` Backup start time, UNIX time, in seconds.
        /// </summary>
        [Output("schedule")]
        public Output<string> Schedule { get; private set; } = null!;


        /// <summary>
        /// Create a ServerBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerBackupPlan(string name, ServerBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/serverBackupPlan:ServerBackupPlan", name, args ?? new ServerBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerBackupPlan(string name, Input<string> id, ServerBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/serverBackupPlan:ServerBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerBackupPlan Get(string name, Input<string> id, ServerBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerBackupPlan(name, id, state, options);
        }
    }

    public sealed class ServerBackupPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        [Input("details", required: true)]
        private InputList<Inputs.ServerBackupPlanDetailArgs>? _details;

        /// <summary>
        /// ECS server backup plan details.
        /// </summary>
        public InputList<Inputs.ServerBackupPlanDetailArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.ServerBackupPlanDetailArgs>());
            set => _details = value;
        }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("ecsServerBackupPlanName", required: true)]
        public Input<string> EcsServerBackupPlanName { get; set; } = null!;

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention", required: true)]
        public Input<int> Retention { get; set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`
        /// * `startTime` Backup start time, UNIX time, in seconds.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        public ServerBackupPlanArgs()
        {
        }
        public static new ServerBackupPlanArgs Empty => new ServerBackupPlanArgs();
    }

    public sealed class ServerBackupPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        [Input("details")]
        private InputList<Inputs.ServerBackupPlanDetailGetArgs>? _details;

        /// <summary>
        /// ECS server backup plan details.
        /// </summary>
        public InputList<Inputs.ServerBackupPlanDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.ServerBackupPlanDetailGetArgs>());
            set => _details = value;
        }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("ecsServerBackupPlanName")]
        public Input<string>? EcsServerBackupPlanName { get; set; }

        /// <summary>
        /// The ID of ECS instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention")]
        public Input<int>? Retention { get; set; }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`
        /// * `startTime` Backup start time, UNIX time, in seconds.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        public ServerBackupPlanState()
        {
        }
        public static new ServerBackupPlanState Empty => new ServerBackupPlanState();
    }
}
