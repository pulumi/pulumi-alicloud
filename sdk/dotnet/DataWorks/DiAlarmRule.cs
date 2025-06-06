// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DataWorks
{
    /// <summary>
    /// Provides a Data Works Di Alarm Rule resource.
    /// 
    /// Data Integration alarm rules.
    /// 
    /// For information about Data Works Di Alarm Rule and how to use it, see [What is Di Alarm Rule](https://www.alibabacloud.com/help/en/dataworks/developer-reference/api-dataworks-public-2024-05-18-createdialarmrule).
    /// 
    /// &gt; **NOTE:** Available since v1.241.0.
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
    ///     var name = config.Get("name") ?? "terraform_example";
    ///     var defaulteNv8bu = new AliCloud.DataWorks.Project("defaulteNv8bu", new()
    ///     {
    ///         ProjectName = name,
    ///         DisplayName = name,
    ///         Description = name,
    ///         PaiTaskEnabled = true,
    ///     });
    /// 
    ///     var defaultUW8inp = new AliCloud.DataWorks.DiJob("defaultUW8inp", new()
    ///     {
    ///         Description = "xxxx",
    ///         ProjectId = defaulteNv8bu.Id,
    ///         JobName = "xxx",
    ///         MigrationType = "api_xxx",
    ///         SourceDataSourceType = "xxx",
    ///         ResourceSettings = new AliCloud.DataWorks.Inputs.DiJobResourceSettingsArgs
    ///         {
    ///             OfflineResourceSettings = new AliCloud.DataWorks.Inputs.DiJobResourceSettingsOfflineResourceSettingsArgs
    ///             {
    ///                 RequestedCu = 2,
    ///                 ResourceGroupIdentifier = "xx",
    ///             },
    ///             RealtimeResourceSettings = new AliCloud.DataWorks.Inputs.DiJobResourceSettingsRealtimeResourceSettingsArgs
    ///             {
    ///                 RequestedCu = 2,
    ///                 ResourceGroupIdentifier = "xx",
    ///             },
    ///             ScheduleResourceSettings = new AliCloud.DataWorks.Inputs.DiJobResourceSettingsScheduleResourceSettingsArgs
    ///             {
    ///                 RequestedCu = 2,
    ///                 ResourceGroupIdentifier = "xx",
    ///             },
    ///         },
    ///         JobSettings = new AliCloud.DataWorks.Inputs.DiJobJobSettingsArgs
    ///         {
    ///             ChannelSettings = "xxxx",
    ///             ColumnDataTypeSettings = new[]
    ///             {
    ///                 new AliCloud.DataWorks.Inputs.DiJobJobSettingsColumnDataTypeSettingArgs
    ///                 {
    ///                     DestinationDataType = "xxxx",
    ///                     SourceDataType = "xxxx",
    ///                 },
    ///             },
    ///             CycleScheduleSettings = new AliCloud.DataWorks.Inputs.DiJobJobSettingsCycleScheduleSettingsArgs
    ///             {
    ///                 CycleMigrationType = "xxxx",
    ///                 ScheduleParameters = "xxxx",
    ///             },
    ///         },
    ///         SourceDataSourceSettings = new[]
    ///         {
    ///             new AliCloud.DataWorks.Inputs.DiJobSourceDataSourceSettingArgs
    ///             {
    ///                 DataSourceName = "xxxx",
    ///                 DataSourceProperties = new AliCloud.DataWorks.Inputs.DiJobSourceDataSourceSettingDataSourcePropertiesArgs
    ///                 {
    ///                     Encoding = "xxxx",
    ///                     Timezone = "xxxx",
    ///                 },
    ///             },
    ///         },
    ///         DestinationDataSourceType = "xxxx",
    ///         TableMappings = new[]
    ///         {
    ///             new AliCloud.DataWorks.Inputs.DiJobTableMappingArgs
    ///             {
    ///                 SourceObjectSelectionRules = new[]
    ///                 {
    ///                     new AliCloud.DataWorks.Inputs.DiJobTableMappingSourceObjectSelectionRuleArgs
    ///                     {
    ///                         Action = "Include",
    ///                         Expression = "xxxx",
    ///                         ExpressionType = "Exact",
    ///                         ObjectType = "xxxx",
    ///                     },
    ///                     new AliCloud.DataWorks.Inputs.DiJobTableMappingSourceObjectSelectionRuleArgs
    ///                     {
    ///                         Action = "Include",
    ///                         Expression = "xxxx",
    ///                         ExpressionType = "Exact",
    ///                         ObjectType = "xxxx",
    ///                     },
    ///                 },
    ///                 TransformationRules = new[]
    ///                 {
    ///                     new AliCloud.DataWorks.Inputs.DiJobTableMappingTransformationRuleArgs
    ///                     {
    ///                         RuleName = "xxxx",
    ///                         RuleActionType = "xxxx",
    ///                         RuleTargetType = "xxxx",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         TransformationRules = new[]
    ///         {
    ///             new AliCloud.DataWorks.Inputs.DiJobTransformationRuleArgs
    ///             {
    ///                 RuleActionType = "xxxx",
    ///                 RuleExpression = "xxxx",
    ///                 RuleName = "xxxx",
    ///                 RuleTargetType = "xxxx",
    ///             },
    ///         },
    ///         DestinationDataSourceSettings = new[]
    ///         {
    ///             new AliCloud.DataWorks.Inputs.DiJobDestinationDataSourceSettingArgs
    ///             {
    ///                 DataSourceName = "xxx",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var @default = new AliCloud.DataWorks.DiAlarmRule("default", new()
    ///     {
    ///         Description = "Description",
    ///         TriggerConditions = new[]
    ///         {
    ///             new AliCloud.DataWorks.Inputs.DiAlarmRuleTriggerConditionArgs
    ///             {
    ///                 DdlReportTags = new[]
    ///                 {
    ///                     "ALTERADDCOLUMN",
    ///                 },
    ///                 Threshold = 20,
    ///                 Duration = 10,
    ///                 Severity = "Warning",
    ///             },
    ///         },
    ///         MetricType = "DdlReport",
    ///         NotificationSettings = new AliCloud.DataWorks.Inputs.DiAlarmRuleNotificationSettingsArgs
    ///         {
    ///             NotificationChannels = new[]
    ///             {
    ///                 new AliCloud.DataWorks.Inputs.DiAlarmRuleNotificationSettingsNotificationChannelArgs
    ///                 {
    ///                     Severity = "Warning",
    ///                     Channels = new[]
    ///                     {
    ///                         "Ding",
    ///                     },
    ///                 },
    ///             },
    ///             NotificationReceivers = new[]
    ///             {
    ///                 new AliCloud.DataWorks.Inputs.DiAlarmRuleNotificationSettingsNotificationReceiverArgs
    ///                 {
    ///                     ReceiverType = "DingToken",
    ///                     ReceiverValues = new[]
    ///                     {
    ///                         "1107550004253538",
    ///                     },
    ///                 },
    ///             },
    ///             InhibitionInterval = 10,
    ///         },
    ///         DiJobId = defaultUW8inp.DiJobId,
    ///         DiAlarmRuleName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Works Di Alarm Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dataworks/diAlarmRule:DiAlarmRule example &lt;di_job_id&gt;:&lt;di_alarm_rule_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dataworks/diAlarmRule:DiAlarmRule")]
    public partial class DiAlarmRule : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Resource attribute field representing resource level ID
        /// </summary>
        [Output("diAlarmRuleId")]
        public Output<int> DiAlarmRuleId { get; private set; } = null!;

        /// <summary>
        /// Data Integration alarm rule name
        /// </summary>
        [Output("diAlarmRuleName")]
        public Output<string> DiAlarmRuleName { get; private set; } = null!;

        /// <summary>
        /// Task ID: the ID of the task associated with the alert rule.
        /// </summary>
        [Output("diJobId")]
        public Output<int> DiJobId { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Alarm indicator type. Optional enumerated values:
        /// - Heartbeat (task status alarm)
        /// - FailoverCount(failover times alarm)
        /// - Delay (task Delay alarm)
        /// </summary>
        [Output("metricType")]
        public Output<string> MetricType { get; private set; } = null!;

        /// <summary>
        /// Alarm notification settings See `notification_settings` below.
        /// </summary>
        [Output("notificationSettings")]
        public Output<Outputs.DiAlarmRuleNotificationSettings> NotificationSettings { get; private set; } = null!;

        /// <summary>
        /// Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
        /// </summary>
        [Output("triggerConditions")]
        public Output<ImmutableArray<Outputs.DiAlarmRuleTriggerCondition>> TriggerConditions { get; private set; } = null!;


        /// <summary>
        /// Create a DiAlarmRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DiAlarmRule(string name, DiAlarmRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dataworks/diAlarmRule:DiAlarmRule", name, args ?? new DiAlarmRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DiAlarmRule(string name, Input<string> id, DiAlarmRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dataworks/diAlarmRule:DiAlarmRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DiAlarmRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DiAlarmRule Get(string name, Input<string> id, DiAlarmRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new DiAlarmRule(name, id, state, options);
        }
    }

    public sealed class DiAlarmRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Data Integration alarm rule name
        /// </summary>
        [Input("diAlarmRuleName", required: true)]
        public Input<string> DiAlarmRuleName { get; set; } = null!;

        /// <summary>
        /// Task ID: the ID of the task associated with the alert rule.
        /// </summary>
        [Input("diJobId", required: true)]
        public Input<int> DiJobId { get; set; } = null!;

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Alarm indicator type. Optional enumerated values:
        /// - Heartbeat (task status alarm)
        /// - FailoverCount(failover times alarm)
        /// - Delay (task Delay alarm)
        /// </summary>
        [Input("metricType", required: true)]
        public Input<string> MetricType { get; set; } = null!;

        /// <summary>
        /// Alarm notification settings See `notification_settings` below.
        /// </summary>
        [Input("notificationSettings", required: true)]
        public Input<Inputs.DiAlarmRuleNotificationSettingsArgs> NotificationSettings { get; set; } = null!;

        [Input("triggerConditions", required: true)]
        private InputList<Inputs.DiAlarmRuleTriggerConditionArgs>? _triggerConditions;

        /// <summary>
        /// Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
        /// </summary>
        public InputList<Inputs.DiAlarmRuleTriggerConditionArgs> TriggerConditions
        {
            get => _triggerConditions ?? (_triggerConditions = new InputList<Inputs.DiAlarmRuleTriggerConditionArgs>());
            set => _triggerConditions = value;
        }

        public DiAlarmRuleArgs()
        {
        }
        public static new DiAlarmRuleArgs Empty => new DiAlarmRuleArgs();
    }

    public sealed class DiAlarmRuleState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Resource attribute field representing resource level ID
        /// </summary>
        [Input("diAlarmRuleId")]
        public Input<int>? DiAlarmRuleId { get; set; }

        /// <summary>
        /// Data Integration alarm rule name
        /// </summary>
        [Input("diAlarmRuleName")]
        public Input<string>? DiAlarmRuleName { get; set; }

        /// <summary>
        /// Task ID: the ID of the task associated with the alert rule.
        /// </summary>
        [Input("diJobId")]
        public Input<int>? DiJobId { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Alarm indicator type. Optional enumerated values:
        /// - Heartbeat (task status alarm)
        /// - FailoverCount(failover times alarm)
        /// - Delay (task Delay alarm)
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// Alarm notification settings See `notification_settings` below.
        /// </summary>
        [Input("notificationSettings")]
        public Input<Inputs.DiAlarmRuleNotificationSettingsGetArgs>? NotificationSettings { get; set; }

        [Input("triggerConditions")]
        private InputList<Inputs.DiAlarmRuleTriggerConditionGetArgs>? _triggerConditions;

        /// <summary>
        /// Alarm trigger condition list, supporting multiple conditions See `trigger_conditions` below.
        /// </summary>
        public InputList<Inputs.DiAlarmRuleTriggerConditionGetArgs> TriggerConditions
        {
            get => _triggerConditions ?? (_triggerConditions = new InputList<Inputs.DiAlarmRuleTriggerConditionGetArgs>());
            set => _triggerConditions = value;
        }

        public DiAlarmRuleState()
        {
        }
        public static new DiAlarmRuleState Empty => new DiAlarmRuleState();
    }
}
