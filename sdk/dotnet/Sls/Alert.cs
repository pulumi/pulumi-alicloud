// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls
{
    /// <summary>
    /// Provides a SLS Alert resource.
    /// 
    /// For information about SLS Alert and how to use it, see [What is Alert](https://www.alibabacloud.com/help/en/doc-detail/209202.html).
    /// 
    /// &gt; **NOTE:** Available since v1.223.0.
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
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var alertName = config.Get("alertName") ?? "openapi-terraform-alert";
    ///     var projectName = config.Get("projectName") ?? "terraform-alert-example";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultINsMgl = new AliCloud.Log.Project("defaultINsMgl", new()
    ///     {
    ///         Description = $"{projectName}-{@default.Result}",
    ///         ProjectName = $"{projectName}-{@default.Result}",
    ///     });
    /// 
    ///     var defaultAlert = new AliCloud.Sls.Alert("default", new()
    ///     {
    ///         Schedule = new AliCloud.Sls.Inputs.AlertScheduleArgs
    ///         {
    ///             Type = "FixedRate",
    ///             RunImmdiately = true,
    ///             Interval = "1m",
    ///             TimeZone = "+0800",
    ///             Delay = 10,
    ///         },
    ///         DisplayName = "openapi-terraform",
    ///         Description = "create alert",
    ///         Status = "ENABLED",
    ///         Configuration = new AliCloud.Sls.Inputs.AlertConfigurationArgs
    ///         {
    ///             GroupConfiguration = new AliCloud.Sls.Inputs.AlertConfigurationGroupConfigurationArgs
    ///             {
    ///                 Fields = new[]
    ///                 {
    ///                     "a",
    ///                     "b",
    ///                 },
    ///                 Type = "no_group",
    ///             },
    ///             NoDataFire = false,
    ///             Version = "2",
    ///             SeverityConfigurations = new[]
    ///             {
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationSeverityConfigurationArgs
    ///                 {
    ///                     Severity = 6,
    ///                     EvalCondition = new AliCloud.Sls.Inputs.AlertConfigurationSeverityConfigurationEvalConditionArgs
    ///                     {
    ///                         CountCondition = "cnt &gt; 0",
    ///                         Condition = "__count__ &gt; 1",
    ///                     },
    ///                 },
    ///             },
    ///             Labels = new[]
    ///             {
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationLabelArgs
    ///                 {
    ///                     Key = "a",
    ///                     Value = "b",
    ///                 },
    ///             },
    ///             AutoAnnotation = true,
    ///             TemplateConfiguration = new AliCloud.Sls.Inputs.AlertConfigurationTemplateConfigurationArgs
    ///             {
    ///                 Lang = "cn",
    ///                 Tokens = 
    ///                 {
    ///                     { "a", "b" },
    ///                 },
    ///                 Annotations = 
    ///                 {
    ///                     { "x", "y" },
    ///                 },
    ///                 TemplateId = "sls.app.ack.autoscaler.cluster_unhealthy",
    ///                 Type = "sys",
    ///                 Version = "1.0",
    ///             },
    ///             MuteUntil = 0,
    ///             Annotations = new[]
    ///             {
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationAnnotationArgs
    ///                 {
    ///                     Key = "x",
    ///                     Value = "y",
    ///                 },
    ///             },
    ///             SendResolved = false,
    ///             Threshold = 1,
    ///             SinkCms = new AliCloud.Sls.Inputs.AlertConfigurationSinkCmsArgs
    ///             {
    ///                 Enabled = false,
    ///             },
    ///             ConditionConfiguration = new AliCloud.Sls.Inputs.AlertConfigurationConditionConfigurationArgs
    ///             {
    ///                 Condition = "cnt &gt; 3",
    ///                 CountCondition = "__count__ &lt; 3",
    ///             },
    ///             PolicyConfiguration = new AliCloud.Sls.Inputs.AlertConfigurationPolicyConfigurationArgs
    ///             {
    ///                 AlertPolicyId = "sls.builtin.dynamic",
    ///                 ActionPolicyId = "wkb-action",
    ///                 RepeatInterval = "1m",
    ///             },
    ///             Dashboard = "internal-alert",
    ///             Type = "tpl",
    ///             QueryLists = new[]
    ///             {
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationQueryListArgs
    ///                 {
    ///                     Ui = "{}",
    ///                     RoleArn = "acs:ram::1654218965343050:role/aliyunslsalertmonitorrole",
    ///                     Query = "* | select *",
    ///                     TimeSpanType = "Relative",
    ///                     Project = defaultINsMgl.ProjectName,
    ///                     PowerSqlMode = "disable",
    ///                     DashboardId = "wkb-dashboard",
    ///                     ChartTitle = "wkb-chart",
    ///                     Start = "-15m",
    ///                     End = "now",
    ///                     StoreType = "log",
    ///                     Store = "alert",
    ///                     Region = "cn-shanghai",
    ///                 },
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationQueryListArgs
    ///                 {
    ///                     StoreType = "meta",
    ///                     Store = "user.rds_ip_whitelist",
    ///                 },
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationQueryListArgs
    ///                 {
    ///                     StoreType = "meta",
    ///                     Store = "myexample1",
    ///                 },
    ///             },
    ///             JoinConfigurations = new[]
    ///             {
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationJoinConfigurationArgs
    ///                 {
    ///                     Type = "no_join",
    ///                     Condition = "aa",
    ///                 },
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationJoinConfigurationArgs
    ///                 {
    ///                     Type = "cross_join",
    ///                     Condition = "qqq",
    ///                 },
    ///                 new AliCloud.Sls.Inputs.AlertConfigurationJoinConfigurationArgs
    ///                 {
    ///                     Type = "inner_join",
    ///                     Condition = "fefefe",
    ///                 },
    ///             },
    ///             SinkEventStore = new AliCloud.Sls.Inputs.AlertConfigurationSinkEventStoreArgs
    ///             {
    ///                 Enabled = true,
    ///                 Endpoint = "cn-shanghai-intranet.log.aliyuncs.com",
    ///                 Project = "wkb-wangren",
    ///                 EventStore = "alert",
    ///                 RoleArn = "acs:ram::1654218965343050:role/aliyunlogetlrole",
    ///             },
    ///             SinkAlerthub = new AliCloud.Sls.Inputs.AlertConfigurationSinkAlerthubArgs
    ///             {
    ///                 Enabled = false,
    ///             },
    ///             NoDataSeverity = 6,
    ///             Tags = new[]
    ///             {
    ///                 "wkb",
    ///                 "wangren",
    ///                 "sls",
    ///             },
    ///         },
    ///         AlertName = alertName,
    ///         ProjectName = defaultINsMgl.ProjectName,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SLS Alert can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:sls/alert:Alert example &lt;project_name&gt;:&lt;alert_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sls/alert:Alert")]
    public partial class Alert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Alert rule ID, unique under Project.
        /// </summary>
        [Output("alertName")]
        public Output<string> AlertName { get; private set; } = null!;

        /// <summary>
        /// Detailed configuration of alarm monitoring rules. See `configuration` below.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.AlertConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// Alarm rule creation time.
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Compatible fields, set to empty strings.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Display name of the alarm rule.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Project Name.
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// Check the frequency-dependent configuration. See `schedule` below.
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.AlertSchedule> Schedule { get; private set; } = null!;

        /// <summary>
        /// Resource attribute field representing alarm status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Alert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alert(string name, AlertArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sls/alert:Alert", name, args ?? new AlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alert(string name, Input<string> id, AlertState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sls/alert:Alert", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alert Get(string name, Input<string> id, AlertState? state = null, CustomResourceOptions? options = null)
        {
            return new Alert(name, id, state, options);
        }
    }

    public sealed class AlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert rule ID, unique under Project.
        /// </summary>
        [Input("alertName", required: true)]
        public Input<string> AlertName { get; set; } = null!;

        /// <summary>
        /// Detailed configuration of alarm monitoring rules. See `configuration` below.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.AlertConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// Compatible fields, set to empty strings.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Display name of the alarm rule.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Project Name.
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        /// <summary>
        /// Check the frequency-dependent configuration. See `schedule` below.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<Inputs.AlertScheduleArgs> Schedule { get; set; } = null!;

        /// <summary>
        /// Resource attribute field representing alarm status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AlertArgs()
        {
        }
        public static new AlertArgs Empty => new AlertArgs();
    }

    public sealed class AlertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert rule ID, unique under Project.
        /// </summary>
        [Input("alertName")]
        public Input<string>? AlertName { get; set; }

        /// <summary>
        /// Detailed configuration of alarm monitoring rules. See `configuration` below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AlertConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Alarm rule creation time.
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// Compatible fields, set to empty strings.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Display name of the alarm rule.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Project Name.
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// Check the frequency-dependent configuration. See `schedule` below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.AlertScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// Resource attribute field representing alarm status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AlertState()
        {
        }
        public static new AlertState Empty => new AlertState();
    }
}
