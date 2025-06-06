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
    /// Provides a HBR Policy Binding resource.
    /// 
    /// For information about HBR Policy Binding and how to use it, see [What is Policy Binding](https://www.alibabacloud.com/help/en/cloud-backup/developer-reference/api-hbr-2017-09-08-createpolicybindings).
    /// 
    /// &gt; **NOTE:** Available since v1.221.0.
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
    ///         Max = 99999,
    ///         Min = 10000,
    ///     });
    /// 
    ///     var defaultyk84Hc = new AliCloud.Hbr.Vault("defaultyk84Hc", new()
    ///     {
    ///         VaultType = "STANDARD",
    ///         VaultName = $"example-value-{@default.Result}",
    ///     });
    /// 
    ///     var defaultoqWvHQ = new AliCloud.Hbr.Policy("defaultoqWvHQ", new()
    ///     {
    ///         PolicyName = $"example-value-{@default.Result}",
    ///         Rules = new[]
    ///         {
    ///             new AliCloud.Hbr.Inputs.PolicyRuleArgs
    ///             {
    ///                 RuleType = "BACKUP",
    ///                 BackupType = "COMPLETE",
    ///                 Schedule = "I|1631685600|P1D",
    ///                 Retention = 7,
    ///                 ArchiveDays = 0,
    ///                 VaultId = defaultyk84Hc.Id,
    ///             },
    ///         },
    ///         PolicyDescription = "policy example",
    ///     });
    /// 
    ///     var defaultKtt2XY = new AliCloud.Oss.Bucket("defaultKtt2XY", new()
    ///     {
    ///         StorageClass = "Standard",
    ///         BucketName = $"example-value-{@default.Result}",
    ///     });
    /// 
    ///     var defaultPolicyBinding = new AliCloud.Hbr.PolicyBinding("default", new()
    ///     {
    ///         SourceType = "OSS",
    ///         Disabled = false,
    ///         PolicyId = defaultoqWvHQ.Id,
    ///         DataSourceId = defaultKtt2XY.BucketName,
    ///         PolicyBindingDescription = "policy binding example (update)",
    ///         Source = "prefix-example-update/",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// HBR Policy Binding can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:hbr/policyBinding:PolicyBinding example &lt;policy_id&gt;:&lt;source_type&gt;:&lt;data_source_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/policyBinding:PolicyBinding")]
    public partial class PolicyBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Backup Advanced Options See `advanced_options` below.
        /// </summary>
        [Output("advancedOptions")]
        public Output<Outputs.PolicyBindingAdvancedOptions> AdvancedOptions { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the name of the cross-account authorization role of the data source, and the management account uses this role to access the data source.
        /// </summary>
        [Output("crossAccountRoleName")]
        public Output<string?> CrossAccountRoleName { get; private set; } = null!;

        /// <summary>
        /// Cross-account type, supported
        /// </summary>
        [Output("crossAccountType")]
        public Output<string> CrossAccountType { get; private set; } = null!;

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the ID of the actual account to which the data source belongs.
        /// </summary>
        [Output("crossAccountUserId")]
        public Output<int?> CrossAccountUserId { get; private set; } = null!;

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Output("dataSourceId")]
        public Output<string> DataSourceId { get; private set; } = null!;

        /// <summary>
        /// Whether the policy is effective for the data source.
        /// - true: Pause
        /// - false: not paused
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates a file type that does not need to be backed up. All files of this type are not backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Output("exclude")]
        public Output<string?> Exclude { get; private set; } = null!;

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates the file types to be backed up, and all files of these types are backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Output("include")]
        public Output<string?> Include { get; private set; } = null!;

        /// <summary>
        /// Resource Description
        /// </summary>
        [Output("policyBindingDescription")]
        public Output<string?> PolicyBindingDescription { get; private set; } = null!;

        /// <summary>
        /// The policy ID.
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// When SourceType is OSS, a prefix is specified to be backed up. If it is not specified, the entire root directory of the Bucket is backed up.
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// Data source type, value range:
        /// - `UDM_ECS`: indicates the ECS instance backup.
        /// - `OSS`: indicates an OSS backup.
        /// - `NAS`: indicates an Alibaba Cloud NAS Backup. When you bind a file system to a policy, Cloud Backup automatically creates a mount point for the file system. If you no longer need the mount point, delete it manually.
        /// - `ECS_FILE`: indicates that the ECS file is backed up.
        /// - `File`: indicates a local File backup.
        /// </summary>
        [Output("sourceType")]
        public Output<string> SourceType { get; private set; } = null!;

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates backup flow control. The format is {start}{end}{bandwidth}. Multiple flow control configurations use partitioning, and no overlap in configuration time is allowed. start: start hour. end: end of hour. bandwidth: limit rate, in KB/s.
        /// </summary>
        [Output("speedLimit")]
        public Output<string?> SpeedLimit { get; private set; } = null!;


        /// <summary>
        /// Create a PolicyBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PolicyBinding(string name, PolicyBindingArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/policyBinding:PolicyBinding", name, args ?? new PolicyBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PolicyBinding(string name, Input<string> id, PolicyBindingState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/policyBinding:PolicyBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PolicyBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PolicyBinding Get(string name, Input<string> id, PolicyBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new PolicyBinding(name, id, state, options);
        }
    }

    public sealed class PolicyBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup Advanced Options See `advanced_options` below.
        /// </summary>
        [Input("advancedOptions")]
        public Input<Inputs.PolicyBindingAdvancedOptionsArgs>? AdvancedOptions { get; set; }

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the name of the cross-account authorization role of the data source, and the management account uses this role to access the data source.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// Cross-account type, supported
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the ID of the actual account to which the data source belongs.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Whether the policy is effective for the data source.
        /// - true: Pause
        /// - false: not paused
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates a file type that does not need to be backed up. All files of this type are not backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates the file types to be backed up, and all files of these types are backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// Resource Description
        /// </summary>
        [Input("policyBindingDescription")]
        public Input<string>? PolicyBindingDescription { get; set; }

        /// <summary>
        /// The policy ID.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// When SourceType is OSS, a prefix is specified to be backed up. If it is not specified, the entire root directory of the Bucket is backed up.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Data source type, value range:
        /// - `UDM_ECS`: indicates the ECS instance backup.
        /// - `OSS`: indicates an OSS backup.
        /// - `NAS`: indicates an Alibaba Cloud NAS Backup. When you bind a file system to a policy, Cloud Backup automatically creates a mount point for the file system. If you no longer need the mount point, delete it manually.
        /// - `ECS_FILE`: indicates that the ECS file is backed up.
        /// - `File`: indicates a local File backup.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates backup flow control. The format is {start}{end}{bandwidth}. Multiple flow control configurations use partitioning, and no overlap in configuration time is allowed. start: start hour. end: end of hour. bandwidth: limit rate, in KB/s.
        /// </summary>
        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        public PolicyBindingArgs()
        {
        }
        public static new PolicyBindingArgs Empty => new PolicyBindingArgs();
    }

    public sealed class PolicyBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup Advanced Options See `advanced_options` below.
        /// </summary>
        [Input("advancedOptions")]
        public Input<Inputs.PolicyBindingAdvancedOptionsGetArgs>? AdvancedOptions { get; set; }

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the name of the cross-account authorization role of the data source, and the management account uses this role to access the data source.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// Cross-account type, supported
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// Valid only when CrossAccountType = CROSS_ACCOUNT, indicating the ID of the actual account to which the data source belongs.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        /// <summary>
        /// The data source ID.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// Whether the policy is effective for the data source.
        /// - true: Pause
        /// - false: not paused
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates a file type that does not need to be backed up. All files of this type are not backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates the file types to be backed up, and all files of these types are backed up. A maximum of 255 characters is supported.
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// Resource Description
        /// </summary>
        [Input("policyBindingDescription")]
        public Input<string>? PolicyBindingDescription { get; set; }

        /// <summary>
        /// The policy ID.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// When SourceType is OSS, a prefix is specified to be backed up. If it is not specified, the entire root directory of the Bucket is backed up.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Data source type, value range:
        /// - `UDM_ECS`: indicates the ECS instance backup.
        /// - `OSS`: indicates an OSS backup.
        /// - `NAS`: indicates an Alibaba Cloud NAS Backup. When you bind a file system to a policy, Cloud Backup automatically creates a mount point for the file system. If you no longer need the mount point, delete it manually.
        /// - `ECS_FILE`: indicates that the ECS file is backed up.
        /// - `File`: indicates a local File backup.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates backup flow control. The format is {start}{end}{bandwidth}. Multiple flow control configurations use partitioning, and no overlap in configuration time is allowed. start: start hour. end: end of hour. bandwidth: limit rate, in KB/s.
        /// </summary>
        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        public PolicyBindingState()
        {
        }
        public static new PolicyBindingState Empty => new PolicyBindingState();
    }
}
