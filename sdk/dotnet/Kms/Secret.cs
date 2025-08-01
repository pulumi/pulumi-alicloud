// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    /// <summary>
    /// Provides a KMS Secret resource.
    /// 
    /// For information about KMS Secret and how to use it, see [What is Secret](https://www.alibabacloud.com/help/en/kms/developer-reference/api-createsecret).
    /// 
    /// &gt; **NOTE:** Available since v1.76.0.
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
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.Kms.Secret("default", new()
    ///     {
    ///         SecretName = name,
    ///         SecretData = "Secret data",
    ///         VersionId = "v1",
    ///         ForceDeleteWithoutRecovery = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// KMS Secret can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:kms/secret:Secret example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kms/secret:Secret")]
    public partial class Secret : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the secret.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.224.0) The time when the secret is created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the secret.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Output("dkmsInstanceId")]
        public Output<string?> DkmsInstanceId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Output("enableAutomaticRotation")]
        public Output<bool?> EnableAutomaticRotation { get; private set; } = null!;

        /// <summary>
        /// The ID of the KMS key.
        /// </summary>
        [Output("encryptionKeyId")]
        public Output<string?> EncryptionKeyId { get; private set; } = null!;

        /// <summary>
        /// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Output("extendedConfig")]
        public Output<string?> ExtendedConfig { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Output("forceDeleteWithoutRecovery")]
        public Output<bool?> ForceDeleteWithoutRecovery { get; private set; } = null!;

        /// <summary>
        /// The time when the secret is scheduled to be deleted.
        /// </summary>
        [Output("plannedDeleteTime")]
        public Output<string> PlannedDeleteTime { get; private set; } = null!;

        /// <summary>
        /// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `force_delete_without_recovery` is set to `true`, `recovery_window_in_days` will be ignored.
        /// </summary>
        [Output("recoveryWindowInDays")]
        public Output<int?> RecoveryWindowInDays { get; private set; } = null!;

        /// <summary>
        /// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Output("rotationInterval")]
        public Output<string?> RotationInterval { get; private set; } = null!;

        /// <summary>
        /// The data of the secret. **NOTE:** From version 1.204.1, `secret_data` updating diff will be ignored when `secret_type` is not `Generic`.
        /// </summary>
        [Output("secretData")]
        public Output<string> SecretData { get; private set; } = null!;

        /// <summary>
        /// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
        /// </summary>
        [Output("secretDataType")]
        public Output<string?> SecretDataType { get; private set; } = null!;

        /// <summary>
        /// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Output("secretName")]
        public Output<string> SecretName { get; private set; } = null!;

        /// <summary>
        /// The type of the secret. Valid values:
        /// - `Generic`: Generic secret.
        /// - `Rds`: ApsaraDB RDS secret.
        /// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
        /// - `RAMCredentials`: RAM secret.
        /// - `ECS`: ECS secret.
        /// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
        /// </summary>
        [Output("secretType")]
        public Output<string> SecretType { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The version number of the initial version.
        /// </summary>
        [Output("versionId")]
        public Output<string> VersionId { get; private set; } = null!;

        /// <summary>
        /// The stage label that is used to mark the new version.
        /// </summary>
        [Output("versionStages")]
        public Output<ImmutableArray<string>> VersionStages { get; private set; } = null!;


        /// <summary>
        /// Create a Secret resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Secret(string name, SecretArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/secret:Secret", name, args ?? new SecretArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Secret(string name, Input<string> id, SecretState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/secret:Secret", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretData",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Secret resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Secret Get(string name, Input<string> id, SecretState? state = null, CustomResourceOptions? options = null)
        {
            return new Secret(name, id, state, options);
        }
    }

    public sealed class SecretArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the secret.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Input("dkmsInstanceId")]
        public Input<string>? DkmsInstanceId { get; set; }

        /// <summary>
        /// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Input("enableAutomaticRotation")]
        public Input<bool>? EnableAutomaticRotation { get; set; }

        /// <summary>
        /// The ID of the KMS key.
        /// </summary>
        [Input("encryptionKeyId")]
        public Input<string>? EncryptionKeyId { get; set; }

        /// <summary>
        /// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("extendedConfig")]
        public Input<string>? ExtendedConfig { get; set; }

        /// <summary>
        /// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Input("forceDeleteWithoutRecovery")]
        public Input<bool>? ForceDeleteWithoutRecovery { get; set; }

        /// <summary>
        /// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `force_delete_without_recovery` is set to `true`, `recovery_window_in_days` will be ignored.
        /// </summary>
        [Input("recoveryWindowInDays")]
        public Input<int>? RecoveryWindowInDays { get; set; }

        /// <summary>
        /// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        [Input("secretData", required: true)]
        private Input<string>? _secretData;

        /// <summary>
        /// The data of the secret. **NOTE:** From version 1.204.1, `secret_data` updating diff will be ignored when `secret_type` is not `Generic`.
        /// </summary>
        public Input<string>? SecretData
        {
            get => _secretData;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretData = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
        /// </summary>
        [Input("secretDataType")]
        public Input<string>? SecretDataType { get; set; }

        /// <summary>
        /// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("secretName", required: true)]
        public Input<string> SecretName { get; set; } = null!;

        /// <summary>
        /// The type of the secret. Valid values:
        /// - `Generic`: Generic secret.
        /// - `Rds`: ApsaraDB RDS secret.
        /// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
        /// - `RAMCredentials`: RAM secret.
        /// - `ECS`: ECS secret.
        /// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The version number of the initial version.
        /// </summary>
        [Input("versionId", required: true)]
        public Input<string> VersionId { get; set; } = null!;

        [Input("versionStages")]
        private InputList<string>? _versionStages;

        /// <summary>
        /// The stage label that is used to mark the new version.
        /// </summary>
        public InputList<string> VersionStages
        {
            get => _versionStages ?? (_versionStages = new InputList<string>());
            set => _versionStages = value;
        }

        public SecretArgs()
        {
        }
        public static new SecretArgs Empty => new SecretArgs();
    }

    public sealed class SecretState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the secret.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// (Available since v1.224.0) The time when the secret is created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the secret.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Input("dkmsInstanceId")]
        public Input<string>? DkmsInstanceId { get; set; }

        /// <summary>
        /// Specifies whether to enable automatic rotation. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Input("enableAutomaticRotation")]
        public Input<bool>? EnableAutomaticRotation { get; set; }

        /// <summary>
        /// The ID of the KMS key.
        /// </summary>
        [Input("encryptionKeyId")]
        public Input<string>? EncryptionKeyId { get; set; }

        /// <summary>
        /// The extended configuration of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("extendedConfig")]
        public Input<string>? ExtendedConfig { get; set; }

        /// <summary>
        /// Specifies whether to immediately delete a secret. Default value: `false`. Valid values: `true`, `false`.
        /// </summary>
        [Input("forceDeleteWithoutRecovery")]
        public Input<bool>? ForceDeleteWithoutRecovery { get; set; }

        /// <summary>
        /// The time when the secret is scheduled to be deleted.
        /// </summary>
        [Input("plannedDeleteTime")]
        public Input<string>? PlannedDeleteTime { get; set; }

        /// <summary>
        /// The content of the secret policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setsecretpolicy).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Specifies the recovery period of the secret if you do not forcibly delete it. Unit: Days. Default value: `30`. Valid values: `7` to `30`. **NOTE:**  If `force_delete_without_recovery` is set to `true`, `recovery_window_in_days` will be ignored.
        /// </summary>
        [Input("recoveryWindowInDays")]
        public Input<int>? RecoveryWindowInDays { get; set; }

        /// <summary>
        /// The interval for automatic rotation. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        [Input("secretData")]
        private Input<string>? _secretData;

        /// <summary>
        /// The data of the secret. **NOTE:** From version 1.204.1, `secret_data` updating diff will be ignored when `secret_type` is not `Generic`.
        /// </summary>
        public Input<string>? SecretData
        {
            get => _secretData;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretData = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The type of the secret value. Default value: `text`. Valid values: `text`, `binary`.
        /// </summary>
        [Input("secretDataType")]
        public Input<string>? SecretDataType { get; set; }

        /// <summary>
        /// The name of the secret. For more information, see [How to use it](https://www.alibabacloud.com/help/en/key-management-service/latest/kms-createsecret).
        /// </summary>
        [Input("secretName")]
        public Input<string>? SecretName { get; set; }

        /// <summary>
        /// The type of the secret. Valid values:
        /// - `Generic`: Generic secret.
        /// - `Rds`: ApsaraDB RDS secret.
        /// - `Redis`: (Available since v1.253.0) ApsaraDB for Redis secret.
        /// - `RAMCredentials`: RAM secret.
        /// - `ECS`: ECS secret.
        /// - `PolarDB`: (Available since v1.253.0) PolarDB secret.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The version number of the initial version.
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        [Input("versionStages")]
        private InputList<string>? _versionStages;

        /// <summary>
        /// The stage label that is used to mark the new version.
        /// </summary>
        public InputList<string> VersionStages
        {
            get => _versionStages ?? (_versionStages = new InputList<string>());
            set => _versionStages = value;
        }

        public SecretState()
        {
        }
        public static new SecretState Empty => new SecretState();
    }
}
