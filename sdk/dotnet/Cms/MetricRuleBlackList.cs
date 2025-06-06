// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    /// <summary>
    /// Provides a Cloud Monitor Service Metric Rule Black List resource.
    /// 
    /// For information about Cloud Monitor Service Metric Rule Black List and how to use it, see [What is Metric Rule Black List](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruleblacklist).
    /// 
    /// &gt; **NOTE:** Available since v1.194.0.
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
    ///         AvailableResourceCreation = "Instance",
    ///     });
    /// 
    ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 1,
    ///         MemorySize = 2,
    ///     });
    /// 
    ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         Owners = "system",
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
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         Name = name,
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ecs.Instance("default", new()
    ///     {
    ///         AvailabilityZone = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         InstanceName = name,
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         SecurityGroups = new[]
    ///         {
    ///             defaultSecurityGroup.Id,
    ///         },
    ///         VswitchId = defaultSwitch.Id,
    ///     });
    /// 
    ///     var defaultMetricRuleBlackList = new AliCloud.Cms.MetricRuleBlackList("default", new()
    ///     {
    ///         Instances = new[]
    ///         {
    ///             defaultInstance.Id.Apply(id =&gt; $"{{\"instancceId\":\"{id}\"}}"),
    ///         },
    ///         Metrics = new[]
    ///         {
    ///             new AliCloud.Cms.Inputs.MetricRuleBlackListMetricArgs
    ///             {
    ///                 MetricName = "disk_utilization",
    ///             },
    ///         },
    ///         Category = "ecs",
    ///         EnableEndTime = "1799443209000",
    ///         Namespace = "acs_ecs_dashboard",
    ///         EnableStartTime = "1689243209000",
    ///         MetricRuleBlackListName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Monitor Service Metric Rule Black List can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cms/metricRuleBlackList:MetricRuleBlackList example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cms/metricRuleBlackList:MetricRuleBlackList")]
    public partial class MetricRuleBlackList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The effective time range of the alert blacklist policy.
        /// </summary>
        [Output("effectiveTime")]
        public Output<string?> EffectiveTime { get; private set; } = null!;

        /// <summary>
        /// The start timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Output("enableEndTime")]
        public Output<string?> EnableEndTime { get; private set; } = null!;

        /// <summary>
        /// The end timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Output("enableStartTime")]
        public Output<string?> EnableStartTime { get; private set; } = null!;

        /// <summary>
        /// The list of instances of cloud services specified in the alert blacklist policy.
        /// </summary>
        [Output("instances")]
        public Output<ImmutableArray<string>> Instances { get; private set; } = null!;

        /// <summary>
        /// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
        /// </summary>
        [Output("isEnable")]
        public Output<bool> IsEnable { get; private set; } = null!;

        /// <summary>
        /// The ID of the blacklist policy.
        /// </summary>
        [Output("metricRuleBlackListId")]
        public Output<string> MetricRuleBlackListId { get; private set; } = null!;

        /// <summary>
        /// The name of the alert blacklist policy.
        /// </summary>
        [Output("metricRuleBlackListName")]
        public Output<string> MetricRuleBlackListName { get; private set; } = null!;

        /// <summary>
        /// Monitoring metrics in the instance. See `metrics` below.
        /// </summary>
        [Output("metrics")]
        public Output<ImmutableArray<Outputs.MetricRuleBlackListMetric>> Metrics { get; private set; } = null!;

        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
        /// </summary>
        [Output("scopeType")]
        public Output<string> ScopeType { get; private set; } = null!;

        /// <summary>
        /// Application Group ID list. The format is JSON Array.&gt; This parameter is displayed only when 'ScopeType' is 'GROUP.
        /// </summary>
        [Output("scopeValues")]
        public Output<ImmutableArray<string>> ScopeValues { get; private set; } = null!;

        /// <summary>
        /// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a MetricRuleBlackList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetricRuleBlackList(string name, MetricRuleBlackListArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cms/metricRuleBlackList:MetricRuleBlackList", name, args ?? new MetricRuleBlackListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetricRuleBlackList(string name, Input<string> id, MetricRuleBlackListState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cms/metricRuleBlackList:MetricRuleBlackList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetricRuleBlackList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetricRuleBlackList Get(string name, Input<string> id, MetricRuleBlackListState? state = null, CustomResourceOptions? options = null)
        {
            return new MetricRuleBlackList(name, id, state, options);
        }
    }

    public sealed class MetricRuleBlackListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        /// <summary>
        /// The effective time range of the alert blacklist policy.
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// The start timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("enableEndTime")]
        public Input<string>? EnableEndTime { get; set; }

        /// <summary>
        /// The end timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("enableStartTime")]
        public Input<string>? EnableStartTime { get; set; }

        [Input("instances", required: true)]
        private InputList<string>? _instances;

        /// <summary>
        /// The list of instances of cloud services specified in the alert blacklist policy.
        /// </summary>
        public InputList<string> Instances
        {
            get => _instances ?? (_instances = new InputList<string>());
            set => _instances = value;
        }

        /// <summary>
        /// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
        /// </summary>
        [Input("isEnable")]
        public Input<bool>? IsEnable { get; set; }

        /// <summary>
        /// The name of the alert blacklist policy.
        /// </summary>
        [Input("metricRuleBlackListName", required: true)]
        public Input<string> MetricRuleBlackListName { get; set; } = null!;

        [Input("metrics")]
        private InputList<Inputs.MetricRuleBlackListMetricArgs>? _metrics;

        /// <summary>
        /// Monitoring metrics in the instance. See `metrics` below.
        /// </summary>
        public InputList<Inputs.MetricRuleBlackListMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.MetricRuleBlackListMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
        /// </summary>
        [Input("scopeType")]
        public Input<string>? ScopeType { get; set; }

        [Input("scopeValues")]
        private InputList<string>? _scopeValues;

        /// <summary>
        /// Application Group ID list. The format is JSON Array.&gt; This parameter is displayed only when 'ScopeType' is 'GROUP.
        /// </summary>
        public InputList<string> ScopeValues
        {
            get => _scopeValues ?? (_scopeValues = new InputList<string>());
            set => _scopeValues = value;
        }

        public MetricRuleBlackListArgs()
        {
        }
        public static new MetricRuleBlackListArgs Empty => new MetricRuleBlackListArgs();
    }

    public sealed class MetricRuleBlackListState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The effective time range of the alert blacklist policy.
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// The start timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("enableEndTime")]
        public Input<string>? EnableEndTime { get; set; }

        /// <summary>
        /// The end timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("enableStartTime")]
        public Input<string>? EnableStartTime { get; set; }

        [Input("instances")]
        private InputList<string>? _instances;

        /// <summary>
        /// The list of instances of cloud services specified in the alert blacklist policy.
        /// </summary>
        public InputList<string> Instances
        {
            get => _instances ?? (_instances = new InputList<string>());
            set => _instances = value;
        }

        /// <summary>
        /// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
        /// </summary>
        [Input("isEnable")]
        public Input<bool>? IsEnable { get; set; }

        /// <summary>
        /// The ID of the blacklist policy.
        /// </summary>
        [Input("metricRuleBlackListId")]
        public Input<string>? MetricRuleBlackListId { get; set; }

        /// <summary>
        /// The name of the alert blacklist policy.
        /// </summary>
        [Input("metricRuleBlackListName")]
        public Input<string>? MetricRuleBlackListName { get; set; }

        [Input("metrics")]
        private InputList<Inputs.MetricRuleBlackListMetricGetArgs>? _metrics;

        /// <summary>
        /// Monitoring metrics in the instance. See `metrics` below.
        /// </summary>
        public InputList<Inputs.MetricRuleBlackListMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.MetricRuleBlackListMetricGetArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// The data namespace of the cloud service.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
        /// </summary>
        [Input("scopeType")]
        public Input<string>? ScopeType { get; set; }

        [Input("scopeValues")]
        private InputList<string>? _scopeValues;

        /// <summary>
        /// Application Group ID list. The format is JSON Array.&gt; This parameter is displayed only when 'ScopeType' is 'GROUP.
        /// </summary>
        public InputList<string> ScopeValues
        {
            get => _scopeValues ?? (_scopeValues = new InputList<string>());
            set => _scopeValues = value;
        }

        /// <summary>
        /// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public MetricRuleBlackListState()
        {
        }
        public static new MetricRuleBlackListState Empty => new MetricRuleBlackListState();
    }
}
