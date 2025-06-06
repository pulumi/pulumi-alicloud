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
    /// Provides a SLS Scheduled SQL resource. Scheduled SQL task.
    /// 
    /// For information about SLS Scheduled SQL and how to use it, see [What is Scheduled SQL](https://www.alibabacloud.com/help/zh/sls/developer-reference/api-sls-2020-12-30-createscheduledsql).
    /// 
    /// &gt; **NOTE:** Available since v1.224.0.
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
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultKIe4KV = new AliCloud.Log.Project("defaultKIe4KV", new()
    ///     {
    ///         Description = $"{name}-{@default.Result}",
    ///         ProjectName = $"{name}-{@default.Result}",
    ///     });
    /// 
    ///     var default1LI9we = new AliCloud.Log.Store("default1LI9we", new()
    ///     {
    ///         HotTtl = 8,
    ///         RetentionPeriod = 30,
    ///         ShardCount = 2,
    ///         ProjectName = defaultKIe4KV.ProjectName,
    ///         LogstoreName = $"{name}-{@default.Result}",
    ///     });
    /// 
    ///     var defaultScheduledSql = new AliCloud.Sls.ScheduledSql("default", new()
    ///     {
    ///         Description = "example-tf-scheduled-sql-0006",
    ///         Schedule = new AliCloud.Sls.Inputs.ScheduledSqlScheduleArgs
    ///         {
    ///             Type = "Cron",
    ///             TimeZone = "+0700",
    ///             Delay = 20,
    ///             CronExpression = "0 0/1 * * *",
    ///         },
    ///         DisplayName = "example-tf-scheduled-sql-0006",
    ///         ScheduledSqlConfiguration = new AliCloud.Sls.Inputs.ScheduledSqlScheduledSqlConfigurationArgs
    ///         {
    ///             Script = "* | select * from log",
    ///             SqlType = "searchQuery",
    ///             DestEndpoint = "ap-northeast-1.log.aliyuncs.com",
    ///             DestProject = "job-e2e-project-jj78kur-ap-southeast-1",
    ///             SourceLogstore = default1LI9we.LogstoreName,
    ///             DestLogstore = "example-open-api02",
    ///             RoleArn = "acs:ram::1395894005868720:role/aliyunlogetlrole",
    ///             DestRoleArn = "acs:ram::1395894005868720:role/aliyunlogetlrole",
    ///             FromTimeExpr = "@m-1m",
    ///             ToTimeExpr = "@m",
    ///             MaxRunTimeInSeconds = 1800,
    ///             ResourcePool = "enhanced",
    ///             MaxRetries = 5,
    ///             FromTime = 1713196800,
    ///             ToTime = 0,
    ///             DataFormat = "log2log",
    ///         },
    ///         ScheduledSqlName = name,
    ///         Project = defaultKIe4KV.ProjectName,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SLS Scheduled SQL can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:sls/scheduledSql:ScheduledSql example &lt;project&gt;:&lt;scheduled_sql_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sls/scheduledSql:ScheduledSql")]
    public partial class ScheduledSql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Task Description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Task Display Name.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Log project.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o'clock, cron can be used. See `schedule` below.
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.ScheduledSqlSchedule> Schedule { get; private set; } = null!;

        /// <summary>
        /// Task Configuration. See `scheduled_sql_configuration` below.
        /// </summary>
        [Output("scheduledSqlConfiguration")]
        public Output<Outputs.ScheduledSqlScheduledSqlConfiguration> ScheduledSqlConfiguration { get; private set; } = null!;

        /// <summary>
        /// Timed SQL name.
        /// </summary>
        [Output("scheduledSqlName")]
        public Output<string> ScheduledSqlName { get; private set; } = null!;


        /// <summary>
        /// Create a ScheduledSql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScheduledSql(string name, ScheduledSqlArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sls/scheduledSql:ScheduledSql", name, args ?? new ScheduledSqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScheduledSql(string name, Input<string> id, ScheduledSqlState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sls/scheduledSql:ScheduledSql", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScheduledSql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScheduledSql Get(string name, Input<string> id, ScheduledSqlState? state = null, CustomResourceOptions? options = null)
        {
            return new ScheduledSql(name, id, state, options);
        }
    }

    public sealed class ScheduledSqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Task Description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Task Display Name.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Log project.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o'clock, cron can be used. See `schedule` below.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<Inputs.ScheduledSqlScheduleArgs> Schedule { get; set; } = null!;

        /// <summary>
        /// Task Configuration. See `scheduled_sql_configuration` below.
        /// </summary>
        [Input("scheduledSqlConfiguration", required: true)]
        public Input<Inputs.ScheduledSqlScheduledSqlConfigurationArgs> ScheduledSqlConfiguration { get; set; } = null!;

        /// <summary>
        /// Timed SQL name.
        /// </summary>
        [Input("scheduledSqlName", required: true)]
        public Input<string> ScheduledSqlName { get; set; } = null!;

        public ScheduledSqlArgs()
        {
        }
        public static new ScheduledSqlArgs Empty => new ScheduledSqlArgs();
    }

    public sealed class ScheduledSqlState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Task Description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Task Display Name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Log project.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The scheduling type is generally not required by default. If there is a strong timing requirement, if it must be imported every Monday at 8 o'clock, cron can be used. See `schedule` below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.ScheduledSqlScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// Task Configuration. See `scheduled_sql_configuration` below.
        /// </summary>
        [Input("scheduledSqlConfiguration")]
        public Input<Inputs.ScheduledSqlScheduledSqlConfigurationGetArgs>? ScheduledSqlConfiguration { get; set; }

        /// <summary>
        /// Timed SQL name.
        /// </summary>
        [Input("scheduledSqlName")]
        public Input<string>? ScheduledSqlName { get; set; }

        public ScheduledSqlState()
        {
        }
        public static new ScheduledSqlState Empty => new ScheduledSqlState();
    }
}
