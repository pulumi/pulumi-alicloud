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
    /// Provides a HBR Ots Backup Plan resource.
    /// 
    /// For information about HBR Ots Backup Plan and how to use it, see [What is Ots Backup Plan](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/overview).
    /// 
    /// &gt; **NOTE:** Available since v1.163.0.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultInteger = new Random.Index.Integer("default", new()
    ///     {
    ///         Max = 99999,
    ///         Min = 10000,
    ///     });
    /// 
    ///     var defaultVault = new AliCloud.Hbr.Vault("default", new()
    ///     {
    ///         VaultName = $"terraform-example-{defaultInteger.Result}",
    ///         VaultType = "STANDARD",
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ots.Instance("default", new()
    ///     {
    ///         Name = $"Example-{defaultInteger.Result}",
    ///         Description = "terraform-example",
    ///         AccessedBy = "Any",
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "example" },
    ///         },
    ///     });
    /// 
    ///     var defaultTable = new AliCloud.Ots.Table("default", new()
    ///     {
    ///         InstanceName = defaultInstance.Name,
    ///         TableName = "terraform_example",
    ///         PrimaryKeys = new[]
    ///         {
    ///             new AliCloud.Ots.Inputs.TablePrimaryKeyArgs
    ///             {
    ///                 Name = "pk1",
    ///                 Type = "Integer",
    ///             },
    ///         },
    ///         TimeToLive = -1,
    ///         MaxVersion = 1,
    ///         DeviationCellVersionInSec = "1",
    ///     });
    /// 
    ///     var defaultRole = new AliCloud.Ram.Role("default", new()
    ///     {
    ///         Name = "hbrexamplerole",
    ///         Document = @"		{
    /// 			""Statement"": [
    /// 			{
    /// 				""Action"": ""sts:AssumeRole"",
    /// 				""Effect"": ""Allow"",
    /// 				""Principal"": {
    /// 					""Service"": [
    /// 						""crossbackup.hbr.aliyuncs.com""
    /// 					]
    /// 				}
    /// 			}
    /// 			],
    ///   			""Version"": ""1""
    /// 		}
    /// ",
    ///         Force = true,
    ///     });
    /// 
    ///     var @default = AliCloud.GetAccount.Invoke();
    /// 
    ///     var example = new AliCloud.Hbr.OtsBackupPlan("example", new()
    ///     {
    ///         OtsBackupPlanName = $"terraform-example-{defaultInteger.Result}",
    ///         VaultId = defaultVault.Id,
    ///         BackupType = "COMPLETE",
    ///         Retention = "1",
    ///         InstanceName = defaultInstance.Name,
    ///         CrossAccountType = "SELF_ACCOUNT",
    ///         CrossAccountUserId = @default.Apply(@default =&gt; @default.Apply(getAccountResult =&gt; getAccountResult.Id)),
    ///         CrossAccountRoleName = defaultRole.Id,
    ///         OtsDetails = new[]
    ///         {
    ///             new AliCloud.Hbr.Inputs.OtsBackupPlanOtsDetailArgs
    ///             {
    ///                 TableNames = new[]
    ///                 {
    ///                     defaultTable.TableName,
    ///                 },
    ///             },
    ///         },
    ///         Rules = new[]
    ///         {
    ///             new AliCloud.Hbr.Inputs.OtsBackupPlanRuleArgs
    ///             {
    ///                 Schedule = "I|1602673264|PT2H",
    ///                 Retention = "1",
    ///                 Disabled = false,
    ///                 RuleName = "terraform-example",
    ///                 BackupType = "COMPLETE",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// HBR Ots Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:hbr/otsBackupPlan:OtsBackupPlan example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/otsBackupPlan:OtsBackupPlan")]
    public partial class OtsBackupPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

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
        /// Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("instanceName")]
        public Output<string?> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Output("otsBackupPlanName")]
        public Output<string> OtsBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("otsDetails")]
        public Output<ImmutableArray<Outputs.OtsBackupPlanOtsDetail>> OtsDetails { get; private set; } = null!;

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Output("retention")]
        public Output<string> Retention { get; private set; } = null!;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.OtsBackupPlanRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// - `startTime` Backup start time, UNIX time seconds.
        /// </summary>
        [Output("schedule")]
        public Output<string?> Schedule { get; private set; } = null!;

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string?> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a OtsBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OtsBackupPlan(string name, OtsBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, args ?? new OtsBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OtsBackupPlan(string name, Input<string> id, OtsBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OtsBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OtsBackupPlan Get(string name, Input<string> id, OtsBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new OtsBackupPlan(name, id, state, options);
        }
    }

    public sealed class OtsBackupPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType", required: true)]
        public Input<string> BackupType { get; set; } = null!;

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

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("otsBackupPlanName", required: true)]
        public Input<string> OtsBackupPlanName { get; set; } = null!;

        [Input("otsDetails")]
        private InputList<Inputs.OtsBackupPlanOtsDetailArgs>? _otsDetails;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanOtsDetailArgs> OtsDetails
        {
            get => _otsDetails ?? (_otsDetails = new InputList<Inputs.OtsBackupPlanOtsDetailArgs>());
            set => _otsDetails = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention", required: true)]
        public Input<string> Retention { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.OtsBackupPlanRuleArgs>? _rules;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.OtsBackupPlanRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// - `startTime` Backup start time, UNIX time seconds.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public OtsBackupPlanArgs()
        {
        }
        public static new OtsBackupPlanArgs Empty => new OtsBackupPlanArgs();
    }

    public sealed class OtsBackupPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

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

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("otsBackupPlanName")]
        public Input<string>? OtsBackupPlanName { get; set; }

        [Input("otsDetails")]
        private InputList<Inputs.OtsBackupPlanOtsDetailGetArgs>? _otsDetails;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanOtsDetailGetArgs> OtsDetails
        {
            get => _otsDetails ?? (_otsDetails = new InputList<Inputs.OtsBackupPlanOtsDetailGetArgs>());
            set => _otsDetails = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention")]
        public Input<string>? Retention { get; set; }

        [Input("rules")]
        private InputList<Inputs.OtsBackupPlanRuleGetArgs>? _rules;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.OtsBackupPlanRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// - `startTime` Backup start time, UNIX time seconds.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public OtsBackupPlanState()
        {
        }
        public static new OtsBackupPlanState Empty => new OtsBackupPlanState();
    }
}
