// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    /// <summary>
    /// Provides a FCV3 Provision Config resource.
    /// 
    /// Function Reservation Configuration.
    /// 
    /// For information about FCV3 Provision Config and how to use it, see [What is Provision Config](https://www.alibabacloud.com/help/en/functioncompute/fc-3-0/developer-reference/api-fc-2023-03-30-putprovisionconfig).
    /// 
    /// &gt; **NOTE:** Available since v1.230.0.
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
    /// using Random = Pulumi.Random;
    /// using Time = Pulumi.Time;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultProject = new AliCloud.Log.Project("default", new()
    ///     {
    ///         ProjectName = $"{name}-{@default.Result}",
    ///         Description = name,
    ///     });
    /// 
    ///     var defaultStore = new AliCloud.Log.Store("default", new()
    ///     {
    ///         ProjectName = defaultProject.Name,
    ///         LogstoreName = $"{name}-{@default.Result}",
    ///         ShardCount = 3,
    ///         AutoSplit = true,
    ///         MaxSplitShardCount = 60,
    ///         AppendMeta = true,
    ///     });
    /// 
    ///     var wait10Minutes = new Time.Index.Sleep("wait_10_minutes", new()
    ///     {
    ///         CreateDuration = "10m",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             defaultStore,
    ///         },
    ///     });
    /// 
    ///     var function = new AliCloud.FC.V3Function("function", new()
    ///     {
    ///         MemorySize = 512,
    ///         Cpu = 0.5,
    ///         Handler = "index.handler",
    ///         FunctionName = name,
    ///         Runtime = "python3.10",
    ///         DiskSize = 512,
    ///         Code = new AliCloud.FC.Inputs.V3FunctionCodeArgs
    ///         {
    ///             ZipFile = "UEsDBBQACAAIAAAAAAAAAAAAAAAAAAAAAAAIAAAAaW5kZXgucHmEkEFKxEAQRfd9ig9ZTCJOooIwDMwNXLqXnnQlaalUhU5lRj2KZ/FOXkESGR114bJ/P/7jV4b1xRq1hijtFpM1682cuNgPmgysbRulPT0fRxXnMtwrSPyeCdYRokSLnuMLJTTkbUqEvDMbxm1VdcRD6Tk+T1LW2ldB66knsYdA5iNX17ebm6tN2VnPhcswMPmREPuBacb+CiapLarAj9gT6/H97dVlCNScY3mtYvRkxdZlwDKDEnanPWVLdrdkeXEGlFEazVdfPVHaVeHc3N15CUwppwOJXeK7HshAB8NuOU7J6sP4SRXuH/EvbUfMiqMmDqv5M5FNSfAj/wgAAP//UEsHCPl//NYAAQAArwEAAFBLAQIUABQACAAIAAAAAAD5f/zWAAEAAK8BAAAIAAAAAAAAAAAAAAAAAAAAAABpbmRleC5weVBLBQYAAAAAAQABADYAAAA2AQAAAAA=",
    ///         },
    ///         LogConfig = new AliCloud.FC.Inputs.V3FunctionLogConfigArgs
    ///         {
    ///             EnableInstanceMetrics = true,
    ///             EnableRequestMetrics = true,
    ///             Project = defaultProject.ProjectName,
    ///             Logstore = defaultStore.LogstoreName,
    ///             LogBeginRule = "None",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             wait10Minutes,
    ///         },
    ///     });
    /// 
    ///     var defaultV3ProvisionConfig = new AliCloud.FC.V3ProvisionConfig("default", new()
    ///     {
    ///         Target = 1,
    ///         TargetTrackingPolicies = new[]
    ///         {
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigTargetTrackingPolicyArgs
    ///             {
    ///                 Name = "t1",
    ///                 StartTime = "2030-10-10T10:10:10Z",
    ///                 EndTime = "2035-10-10T10:10:10Z",
    ///                 MinCapacity = 0,
    ///                 MaxCapacity = 1,
    ///                 MetricTarget = 1,
    ///                 MetricType = "ProvisionedConcurrencyUtilization",
    ///             },
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigTargetTrackingPolicyArgs
    ///             {
    ///                 MetricTarget = 1,
    ///                 MetricType = "ProvisionedConcurrencyUtilization",
    ///                 Name = "t2",
    ///                 StartTime = "2030-10-10T10:10:10Z",
    ///                 EndTime = "2035-10-10T10:10:10Z",
    ///                 MinCapacity = 0,
    ///                 MaxCapacity = 1,
    ///             },
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigTargetTrackingPolicyArgs
    ///             {
    ///                 MetricType = "ProvisionedConcurrencyUtilization",
    ///                 TimeZone = "Asia/Shanghai",
    ///                 Name = "t3",
    ///                 StartTime = "2030-10-10T10:10:10",
    ///                 EndTime = "2035-10-10T10:10:10",
    ///                 MinCapacity = 0,
    ///                 MaxCapacity = 1,
    ///                 MetricTarget = 1,
    ///             },
    ///         },
    ///         ScheduledActions = new[]
    ///         {
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigScheduledActionArgs
    ///             {
    ///                 Target = 0,
    ///                 Name = "s1",
    ///                 StartTime = "2030-10-10T10:10:10Z",
    ///                 EndTime = "2035-10-10T10:10:10Z",
    ///                 ScheduleExpression = "cron(0 0 4 * * *)",
    ///             },
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigScheduledActionArgs
    ///             {
    ///                 Name = "s2",
    ///                 StartTime = "2030-10-10T10:10:10Z",
    ///                 EndTime = "2035-10-10T10:10:10Z",
    ///                 ScheduleExpression = "cron(0 0 6 * * *)",
    ///                 Target = 1,
    ///             },
    ///             new AliCloud.FC.Inputs.V3ProvisionConfigScheduledActionArgs
    ///             {
    ///                 StartTime = "2030-10-10T10:10:10",
    ///                 EndTime = "2035-10-10T10:10:10",
    ///                 ScheduleExpression = "cron(0 0 7 * * *)",
    ///                 Target = 0,
    ///                 TimeZone = "Asia/Shanghai",
    ///                 Name = "s3",
    ///             },
    ///         },
    ///         Qualifier = "LATEST",
    ///         AlwaysAllocateGpu = true,
    ///         FunctionName = function.FunctionName,
    ///         AlwaysAllocateCpu = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// FCV3 Provision Config can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:fc/v3ProvisionConfig:V3ProvisionConfig example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:fc/v3ProvisionConfig:V3ProvisionConfig")]
    public partial class V3ProvisionConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the CPU is always allocated. The default value is true.
        /// </summary>
        [Output("alwaysAllocateCpu")]
        public Output<bool?> AlwaysAllocateCpu { get; private set; } = null!;

        /// <summary>
        /// Whether to always assign GPU to function instance
        /// </summary>
        [Output("alwaysAllocateGpu")]
        public Output<bool?> AlwaysAllocateGpu { get; private set; } = null!;

        /// <summary>
        /// The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// The function alias or LATEST.
        /// </summary>
        [Output("qualifier")]
        public Output<string?> Qualifier { get; private set; } = null!;

        /// <summary>
        /// Timing policy configuration See `scheduled_actions` below.
        /// </summary>
        [Output("scheduledActions")]
        public Output<ImmutableArray<Outputs.V3ProvisionConfigScheduledAction>> ScheduledActions { get; private set; } = null!;

        /// <summary>
        /// Number of reserved target resources. The value range is [0,10000].
        /// </summary>
        [Output("target")]
        public Output<int?> Target { get; private set; } = null!;

        /// <summary>
        /// Metric tracking scaling policy configuration See `target_tracking_policies` below.
        /// </summary>
        [Output("targetTrackingPolicies")]
        public Output<ImmutableArray<Outputs.V3ProvisionConfigTargetTrackingPolicy>> TargetTrackingPolicies { get; private set; } = null!;


        /// <summary>
        /// Create a V3ProvisionConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V3ProvisionConfig(string name, V3ProvisionConfigArgs args, CustomResourceOptions? options = null)
            : base("alicloud:fc/v3ProvisionConfig:V3ProvisionConfig", name, args ?? new V3ProvisionConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V3ProvisionConfig(string name, Input<string> id, V3ProvisionConfigState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/v3ProvisionConfig:V3ProvisionConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing V3ProvisionConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V3ProvisionConfig Get(string name, Input<string> id, V3ProvisionConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new V3ProvisionConfig(name, id, state, options);
        }
    }

    public sealed class V3ProvisionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the CPU is always allocated. The default value is true.
        /// </summary>
        [Input("alwaysAllocateCpu")]
        public Input<bool>? AlwaysAllocateCpu { get; set; }

        /// <summary>
        /// Whether to always assign GPU to function instance
        /// </summary>
        [Input("alwaysAllocateGpu")]
        public Input<bool>? AlwaysAllocateGpu { get; set; }

        /// <summary>
        /// The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// The function alias or LATEST.
        /// </summary>
        [Input("qualifier")]
        public Input<string>? Qualifier { get; set; }

        [Input("scheduledActions")]
        private InputList<Inputs.V3ProvisionConfigScheduledActionArgs>? _scheduledActions;

        /// <summary>
        /// Timing policy configuration See `scheduled_actions` below.
        /// </summary>
        public InputList<Inputs.V3ProvisionConfigScheduledActionArgs> ScheduledActions
        {
            get => _scheduledActions ?? (_scheduledActions = new InputList<Inputs.V3ProvisionConfigScheduledActionArgs>());
            set => _scheduledActions = value;
        }

        /// <summary>
        /// Number of reserved target resources. The value range is [0,10000].
        /// </summary>
        [Input("target")]
        public Input<int>? Target { get; set; }

        [Input("targetTrackingPolicies")]
        private InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyArgs>? _targetTrackingPolicies;

        /// <summary>
        /// Metric tracking scaling policy configuration See `target_tracking_policies` below.
        /// </summary>
        public InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyArgs> TargetTrackingPolicies
        {
            get => _targetTrackingPolicies ?? (_targetTrackingPolicies = new InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyArgs>());
            set => _targetTrackingPolicies = value;
        }

        public V3ProvisionConfigArgs()
        {
        }
        public static new V3ProvisionConfigArgs Empty => new V3ProvisionConfigArgs();
    }

    public sealed class V3ProvisionConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the CPU is always allocated. The default value is true.
        /// </summary>
        [Input("alwaysAllocateCpu")]
        public Input<bool>? AlwaysAllocateCpu { get; set; }

        /// <summary>
        /// Whether to always assign GPU to function instance
        /// </summary>
        [Input("alwaysAllocateGpu")]
        public Input<bool>? AlwaysAllocateGpu { get; set; }

        /// <summary>
        /// The name of the function. If this parameter is not specified, the provisioned configurations of all functions are listed.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The function alias or LATEST.
        /// </summary>
        [Input("qualifier")]
        public Input<string>? Qualifier { get; set; }

        [Input("scheduledActions")]
        private InputList<Inputs.V3ProvisionConfigScheduledActionGetArgs>? _scheduledActions;

        /// <summary>
        /// Timing policy configuration See `scheduled_actions` below.
        /// </summary>
        public InputList<Inputs.V3ProvisionConfigScheduledActionGetArgs> ScheduledActions
        {
            get => _scheduledActions ?? (_scheduledActions = new InputList<Inputs.V3ProvisionConfigScheduledActionGetArgs>());
            set => _scheduledActions = value;
        }

        /// <summary>
        /// Number of reserved target resources. The value range is [0,10000].
        /// </summary>
        [Input("target")]
        public Input<int>? Target { get; set; }

        [Input("targetTrackingPolicies")]
        private InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyGetArgs>? _targetTrackingPolicies;

        /// <summary>
        /// Metric tracking scaling policy configuration See `target_tracking_policies` below.
        /// </summary>
        public InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyGetArgs> TargetTrackingPolicies
        {
            get => _targetTrackingPolicies ?? (_targetTrackingPolicies = new InputList<Inputs.V3ProvisionConfigTargetTrackingPolicyGetArgs>());
            set => _targetTrackingPolicies = value;
        }

        public V3ProvisionConfigState()
        {
        }
        public static new V3ProvisionConfigState Empty => new V3ProvisionConfigState();
    }
}