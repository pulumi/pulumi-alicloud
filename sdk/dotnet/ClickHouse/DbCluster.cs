// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    /// <summary>
    /// Provides a Click House DBCluster resource.
    /// 
    /// For information about Click House DBCluster and how to use it, see [What is DBCluster](https://www.alibabacloud.com/product/clickhouse).
    /// 
    /// &gt; **NOTE:** Available in v1.134.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new AliCloud.ClickHouse.DbCluster("default", new AliCloud.ClickHouse.DbClusterArgs
    ///         {
    ///             Category = "Basic",
    ///             DbClusterAccessWhiteLists = 
    ///             {
    ///                 new AliCloud.ClickHouse.Inputs.DbClusterDbClusterAccessWhiteListArgs
    ///                 {
    ///                     DbClusterIpArrayAttribute = "test",
    ///                     DbClusterIpArrayName = "test",
    ///                     SecurityIpList = "192.168.0.1",
    ///                 },
    ///             },
    ///             DbClusterClass = "S8",
    ///             DbClusterNetworkType = "vpc",
    ///             DbClusterVersion = "20.3.10.75",
    ///             DbNodeGroupCount = 1,
    ///             DbNodeStorage = "500",
    ///             PaymentType = "PayAsYouGo",
    ///             StorageType = "cloud_essd",
    ///             VswitchId = "your_vswitch_id",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Click House DBCluster can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:clickhouse/dbCluster:DbCluster example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:clickhouse/dbCluster:DbCluster")]
    public partial class DbCluster : Pulumi.CustomResource
    {
        /// <summary>
        /// The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// The db cluster access white list.
        /// </summary>
        [Output("dbClusterAccessWhiteLists")]
        public Output<ImmutableArray<Outputs.DbClusterDbClusterAccessWhiteList>> DbClusterAccessWhiteLists { get; private set; } = null!;

        /// <summary>
        /// The DBCluster class. According to the category, db_cluster_class has two value ranges:
        /// * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
        /// * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
        /// </summary>
        [Output("dbClusterClass")]
        public Output<string> DbClusterClass { get; private set; } = null!;

        /// <summary>
        /// The DBCluster description.
        /// </summary>
        [Output("dbClusterDescription")]
        public Output<string> DbClusterDescription { get; private set; } = null!;

        /// <summary>
        /// The DBCluster network type. Valid values: `vpc`.
        /// </summary>
        [Output("dbClusterNetworkType")]
        public Output<string> DbClusterNetworkType { get; private set; } = null!;

        /// <summary>
        /// The DBCluster version. Valid values: `19.15.2.2`, `20.3.10.75`, `20.8.7.15`.
        /// </summary>
        [Output("dbClusterVersion")]
        public Output<string> DbClusterVersion { get; private set; } = null!;

        /// <summary>
        /// The db node group count. The number should between 1 and 48.
        /// </summary>
        [Output("dbNodeGroupCount")]
        public Output<int> DbNodeGroupCount { get; private set; } = null!;

        /// <summary>
        /// The db node storage.
        /// </summary>
        [Output("dbNodeStorage")]
        public Output<string> DbNodeStorage { get; private set; } = null!;

        /// <summary>
        /// Key management service KMS key ID.
        /// </summary>
        [Output("encryptionKey")]
        public Output<string?> EncryptionKey { get; private set; } = null!;

        /// <summary>
        /// Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
        /// </summary>
        [Output("encryptionType")]
        public Output<string?> EncryptionType { get; private set; } = null!;

        /// <summary>
        /// The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
        /// </summary>
        [Output("maintainTime")]
        public Output<string> MaintainTime { get; private set; } = null!;

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
        /// </summary>
        [Output("period")]
        public Output<string?> Period { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`,.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
        /// </summary>
        [Output("storageType")]
        public Output<string> StorageType { get; private set; } = null!;

        /// <summary>
        /// The used time of DBCluster.
        /// </summary>
        [Output("usedTime")]
        public Output<string?> UsedTime { get; private set; } = null!;

        /// <summary>
        /// The vswitch id of DBCluster.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a DbCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DbCluster(string name, DbClusterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/dbCluster:DbCluster", name, args ?? new DbClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DbCluster(string name, Input<string> id, DbClusterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/dbCluster:DbCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DbCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DbCluster Get(string name, Input<string> id, DbClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new DbCluster(name, id, state, options);
        }
    }

    public sealed class DbClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
        /// </summary>
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        [Input("dbClusterAccessWhiteLists")]
        private InputList<Inputs.DbClusterDbClusterAccessWhiteListArgs>? _dbClusterAccessWhiteLists;

        /// <summary>
        /// The db cluster access white list.
        /// </summary>
        public InputList<Inputs.DbClusterDbClusterAccessWhiteListArgs> DbClusterAccessWhiteLists
        {
            get => _dbClusterAccessWhiteLists ?? (_dbClusterAccessWhiteLists = new InputList<Inputs.DbClusterDbClusterAccessWhiteListArgs>());
            set => _dbClusterAccessWhiteLists = value;
        }

        /// <summary>
        /// The DBCluster class. According to the category, db_cluster_class has two value ranges:
        /// * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
        /// * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
        /// </summary>
        [Input("dbClusterClass", required: true)]
        public Input<string> DbClusterClass { get; set; } = null!;

        /// <summary>
        /// The DBCluster description.
        /// </summary>
        [Input("dbClusterDescription")]
        public Input<string>? DbClusterDescription { get; set; }

        /// <summary>
        /// The DBCluster network type. Valid values: `vpc`.
        /// </summary>
        [Input("dbClusterNetworkType", required: true)]
        public Input<string> DbClusterNetworkType { get; set; } = null!;

        /// <summary>
        /// The DBCluster version. Valid values: `19.15.2.2`, `20.3.10.75`, `20.8.7.15`.
        /// </summary>
        [Input("dbClusterVersion", required: true)]
        public Input<string> DbClusterVersion { get; set; } = null!;

        /// <summary>
        /// The db node group count. The number should between 1 and 48.
        /// </summary>
        [Input("dbNodeGroupCount", required: true)]
        public Input<int> DbNodeGroupCount { get; set; } = null!;

        /// <summary>
        /// The db node storage.
        /// </summary>
        [Input("dbNodeStorage", required: true)]
        public Input<string> DbNodeStorage { get; set; } = null!;

        /// <summary>
        /// Key management service KMS key ID.
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        /// <summary>
        /// Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
        /// </summary>
        [Input("maintainTime")]
        public Input<string>? MaintainTime { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`,.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
        /// </summary>
        [Input("storageType", required: true)]
        public Input<string> StorageType { get; set; } = null!;

        /// <summary>
        /// The used time of DBCluster.
        /// </summary>
        [Input("usedTime")]
        public Input<string>? UsedTime { get; set; }

        /// <summary>
        /// The vswitch id of DBCluster.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public DbClusterArgs()
        {
        }
    }

    public sealed class DbClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Category of DBCluster. Valid values: `Basic`,`HighAvailability`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("dbClusterAccessWhiteLists")]
        private InputList<Inputs.DbClusterDbClusterAccessWhiteListGetArgs>? _dbClusterAccessWhiteLists;

        /// <summary>
        /// The db cluster access white list.
        /// </summary>
        public InputList<Inputs.DbClusterDbClusterAccessWhiteListGetArgs> DbClusterAccessWhiteLists
        {
            get => _dbClusterAccessWhiteLists ?? (_dbClusterAccessWhiteLists = new InputList<Inputs.DbClusterDbClusterAccessWhiteListGetArgs>());
            set => _dbClusterAccessWhiteLists = value;
        }

        /// <summary>
        /// The DBCluster class. According to the category, db_cluster_class has two value ranges:
        /// * Under the condition that the category is the `Basic`, Valid values: `S4-NEW`, `S8`, `S16`, `S32`, `S64`, `S104`.
        /// * Under the condition that the category is the `HighAvailability`, Valid values: `C4-NEW`, `C8`, `C16`, `C32`, `C64`, `C104`.
        /// </summary>
        [Input("dbClusterClass")]
        public Input<string>? DbClusterClass { get; set; }

        /// <summary>
        /// The DBCluster description.
        /// </summary>
        [Input("dbClusterDescription")]
        public Input<string>? DbClusterDescription { get; set; }

        /// <summary>
        /// The DBCluster network type. Valid values: `vpc`.
        /// </summary>
        [Input("dbClusterNetworkType")]
        public Input<string>? DbClusterNetworkType { get; set; }

        /// <summary>
        /// The DBCluster version. Valid values: `19.15.2.2`, `20.3.10.75`, `20.8.7.15`.
        /// </summary>
        [Input("dbClusterVersion")]
        public Input<string>? DbClusterVersion { get; set; }

        /// <summary>
        /// The db node group count. The number should between 1 and 48.
        /// </summary>
        [Input("dbNodeGroupCount")]
        public Input<int>? DbNodeGroupCount { get; set; }

        /// <summary>
        /// The db node storage.
        /// </summary>
        [Input("dbNodeStorage")]
        public Input<string>? DbNodeStorage { get; set; }

        /// <summary>
        /// Key management service KMS key ID.
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        /// <summary>
        /// Currently only supports ECS disk encryption, with a value of CloudDisk, not encrypted when empty.
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        /// <summary>
        /// The maintenance window of DBCluster. Valid format: `hh:mmZ-hh:mm Z`.
        /// </summary>
        [Input("maintainTime")]
        public Input<string>? MaintainTime { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Pre-paid cluster of the pay-as-you-go cycle. Valid values: `Month`, `Year`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`,.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Storage type of DBCluster. Valid values: `cloud_essd`, `cloud_efficiency`, `cloud_essd_pl2`, `cloud_essd_pl3`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// The used time of DBCluster.
        /// </summary>
        [Input("usedTime")]
        public Input<string>? UsedTime { get; set; }

        /// <summary>
        /// The vswitch id of DBCluster.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public DbClusterState()
        {
        }
    }
}