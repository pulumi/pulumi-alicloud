// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cassandra
{
    /// <summary>
    /// Provides a Cassandra Backup Plan resource.
    /// 
    /// For information about Cassandra Backup Plan and how to use it, see [What is Backup Plan](https://www.alibabacloud.com/help/doc-detail/157522.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.128.0+.
    /// 
    /// &gt; **DEPRECATED:**  This resource has been [deprecated](https://www.alibabacloud.com/help/en/apsaradb-for-cassandra/latest/cassandra-delisting-notice) from version `1.220.0`.
    /// 
    /// ## Import
    /// 
    /// Cassandra Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cassandra/backupPlan:BackupPlan example &lt;cluster_id&gt;:&lt;data_center_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cassandra/backupPlan:BackupPlan")]
    public partial class BackupPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        /// </summary>
        [Output("backupPeriod")]
        public Output<string> BackupPeriod { get; private set; } = null!;

        /// <summary>
        /// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        /// </summary>
        [Output("backupTime")]
        public Output<string> BackupTime { get; private set; } = null!;

        /// <summary>
        /// The ID of the cluster for the backup.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The ID of the data center for the backup in the cluster.
        /// </summary>
        [Output("dataCenterId")]
        public Output<string> DataCenterId { get; private set; } = null!;

        /// <summary>
        /// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        /// </summary>
        [Output("retentionPeriod")]
        public Output<int> RetentionPeriod { get; private set; } = null!;


        /// <summary>
        /// Create a BackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupPlan(string name, BackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cassandra/backupPlan:BackupPlan", name, args ?? new BackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupPlan(string name, Input<string> id, BackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cassandra/backupPlan:BackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackupPlan Get(string name, Input<string> id, BackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new BackupPlan(name, id, state, options);
        }
    }

    public sealed class BackupPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        /// </summary>
        [Input("backupPeriod")]
        public Input<string>? BackupPeriod { get; set; }

        /// <summary>
        /// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        /// </summary>
        [Input("backupTime", required: true)]
        public Input<string> BackupTime { get; set; } = null!;

        /// <summary>
        /// The ID of the cluster for the backup.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The ID of the data center for the backup in the cluster.
        /// </summary>
        [Input("dataCenterId", required: true)]
        public Input<string> DataCenterId { get; set; } = null!;

        /// <summary>
        /// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        public BackupPlanArgs()
        {
        }
        public static new BackupPlanArgs Empty => new BackupPlanArgs();
    }

    public sealed class BackupPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to activate the backup plan. Valid values: `True`, `False`. Default value: `True`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The backup cycle. Valid values: `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday`, `Wednesday`.
        /// </summary>
        [Input("backupPeriod")]
        public Input<string>? BackupPeriod { get; set; }

        /// <summary>
        /// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        /// </summary>
        [Input("backupTime")]
        public Input<string>? BackupTime { get; set; }

        /// <summary>
        /// The ID of the cluster for the backup.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The ID of the data center for the backup in the cluster.
        /// </summary>
        [Input("dataCenterId")]
        public Input<string>? DataCenterId { get; set; }

        /// <summary>
        /// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days. Default value: `30`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        public BackupPlanState()
        {
        }
        public static new BackupPlanState Empty => new BackupPlanState();
    }
}