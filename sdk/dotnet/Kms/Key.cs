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
    /// Provides a KMS Key resource.
    /// 
    /// For information about KMS Key and how to use it, see [What is Key](https://www.alibabacloud.com/help/en/kms/developer-reference/api-createkey).
    /// 
    /// &gt; **NOTE:** Available since v1.85.0.
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
    ///     var @default = new AliCloud.Kms.Key("default", new()
    ///     {
    ///         Description = "Hello KMS",
    ///         Status = "Enabled",
    ///         PendingWindowInDays = 7,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// KMS Key can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:kms/key:Key example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kms/key:Key")]
    public partial class Key : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the key.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Output("automaticRotation")]
        public Output<string> AutomaticRotation { get; private set; } = null!;

        /// <summary>
        /// The time when the CMK was created.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The creator of the CMK.
        /// </summary>
        [Output("creator")]
        public Output<string> Creator { get; private set; } = null!;

        /// <summary>
        /// The time at which the CMK is scheduled for deletion.
        /// </summary>
        [Output("deleteDate")]
        public Output<string> DeleteDate { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable deletion protection. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Output("deletionProtection")]
        public Output<string> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// The description of deletion protection. **NOTE:** `deletion_protection_description` takes effect only if `deletion_protection` is set to `Enabled`.
        /// </summary>
        [Output("deletionProtectionDescription")]
        public Output<string?> DeletionProtectionDescription { get; private set; } = null!;

        /// <summary>
        /// Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
        /// </summary>
        [Output("deletionWindowInDays")]
        public Output<int?> DeletionWindowInDays { get; private set; } = null!;

        /// <summary>
        /// The description of the key.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Output("dkmsInstanceId")]
        public Output<string> DkmsInstanceId { get; private set; } = null!;

        /// <summary>
        /// Field `is_enabled` has been deprecated from provider version 1.85.0. New field `status` instead.
        /// 
        /// &gt; **NOTE:** If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
        /// 
        /// &gt; **NOTE:** The default type of the CMK is `Aliyun_AES_256`. Only Dedicated KMS supports `Aliyun_AES_128` and `Aliyun_AES_192`.
        /// 
        /// &gt; **NOTE:** When the pre-deletion days elapses, the key is permanently deleted and cannot be recovered.
        /// </summary>
        [Output("isEnabled")]
        public Output<bool> IsEnabled { get; private set; } = null!;

        /// <summary>
        /// The specification of the key. Default value: `Aliyun_AES_256`. Valid values: `Aliyun_AES_256`, `Aliyun_AES_128`, `Aliyun_AES_192`, `Aliyun_SM4`, `RSA_2048`, `RSA_3072`, `EC_P256`, `EC_P256K`, `EC_SM2`.
        /// </summary>
        [Output("keySpec")]
        public Output<string> KeySpec { get; private set; } = null!;

        /// <summary>
        /// Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
        /// </summary>
        [Output("keyState")]
        public Output<string> KeyStatus { get; private set; } = null!;

        /// <summary>
        /// The usage of the key. Default value: `ENCRYPT/DECRYPT`. Valid values:
        /// - `ENCRYPT/DECRYPT`: Encrypts or decrypts data.
        /// - `SIGN/VERIFY`: Generates or verifies a digital signature.
        /// </summary>
        [Output("keyUsage")]
        public Output<string> KeyUsage { get; private set; } = null!;

        /// <summary>
        /// The time when the last rotation was performed.
        /// </summary>
        [Output("lastRotationDate")]
        public Output<string> LastRotationDate { get; private set; } = null!;

        /// <summary>
        /// The time when the key material expires.
        /// </summary>
        [Output("materialExpireTime")]
        public Output<string> MaterialExpireTime { get; private set; } = null!;

        /// <summary>
        /// The time when the next rotation will be performed.
        /// </summary>
        [Output("nextRotationDate")]
        public Output<string> NextRotationDate { get; private set; } = null!;

        /// <summary>
        /// The key material origin. Default value: `Aliyun_KMS`. Valid values: `Aliyun_KMS`, `EXTERNAL`.
        /// </summary>
        [Output("origin")]
        public Output<string> Origin { get; private set; } = null!;

        /// <summary>
        /// The number of days before the CMK is deleted. During this period, the CMK is in the PendingDeletion state. After this period ends, you cannot cancel the deletion. Unit: days. Valid values: `7` to `366`. **NOTE:** From version 1.184.0, `pending_window_in_days` can be set to `366`.
        /// </summary>
        [Output("pendingWindowInDays")]
        public Output<int?> PendingWindowInDays { get; private set; } = null!;

        /// <summary>
        /// The content of the key policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setkeypolicy).
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The ID of the current primary key version of the symmetric CMK.
        /// </summary>
        [Output("primaryKeyVersion")]
        public Output<string> PrimaryKeyVersion { get; private set; } = null!;

        /// <summary>
        /// The protection level of the key. Default value: `SOFTWARE`. Valid values: `SOFTWARE`, `HSM`.
        /// </summary>
        [Output("protectionLevel")]
        public Output<string?> ProtectionLevel { get; private set; } = null!;

        /// <summary>
        /// The period of automatic key rotation. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day interval. **NOTE**: If `automatic_rotation` is set to `Enabled`, `rotation_interval` is required.
        /// </summary>
        [Output("rotationInterval")]
        public Output<string?> RotationInterval { get; private set; } = null!;

        /// <summary>
        /// The status of key. Default value: `Enabled`. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Key resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Key(string name, KeyArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/key:Key", name, args ?? new KeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Key(string name, Input<string> id, KeyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/key:Key", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Key resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Key Get(string name, Input<string> id, KeyState? state = null, CustomResourceOptions? options = null)
        {
            return new Key(name, id, state, options);
        }
    }

    public sealed class KeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("automaticRotation")]
        public Input<string>? AutomaticRotation { get; set; }

        /// <summary>
        /// Specifies whether to enable deletion protection. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("deletionProtection")]
        public Input<string>? DeletionProtection { get; set; }

        /// <summary>
        /// The description of deletion protection. **NOTE:** `deletion_protection_description` takes effect only if `deletion_protection` is set to `Enabled`.
        /// </summary>
        [Input("deletionProtectionDescription")]
        public Input<string>? DeletionProtectionDescription { get; set; }

        /// <summary>
        /// Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// The description of the key.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Input("dkmsInstanceId")]
        public Input<string>? DkmsInstanceId { get; set; }

        /// <summary>
        /// Field `is_enabled` has been deprecated from provider version 1.85.0. New field `status` instead.
        /// 
        /// &gt; **NOTE:** If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
        /// 
        /// &gt; **NOTE:** The default type of the CMK is `Aliyun_AES_256`. Only Dedicated KMS supports `Aliyun_AES_128` and `Aliyun_AES_192`.
        /// 
        /// &gt; **NOTE:** When the pre-deletion days elapses, the key is permanently deleted and cannot be recovered.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The specification of the key. Default value: `Aliyun_AES_256`. Valid values: `Aliyun_AES_256`, `Aliyun_AES_128`, `Aliyun_AES_192`, `Aliyun_SM4`, `RSA_2048`, `RSA_3072`, `EC_P256`, `EC_P256K`, `EC_SM2`.
        /// </summary>
        [Input("keySpec")]
        public Input<string>? KeySpec { get; set; }

        /// <summary>
        /// Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
        /// </summary>
        [Input("keyState")]
        public Input<string>? KeyStatus { get; set; }

        /// <summary>
        /// The usage of the key. Default value: `ENCRYPT/DECRYPT`. Valid values:
        /// - `ENCRYPT/DECRYPT`: Encrypts or decrypts data.
        /// - `SIGN/VERIFY`: Generates or verifies a digital signature.
        /// </summary>
        [Input("keyUsage")]
        public Input<string>? KeyUsage { get; set; }

        /// <summary>
        /// The key material origin. Default value: `Aliyun_KMS`. Valid values: `Aliyun_KMS`, `EXTERNAL`.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The number of days before the CMK is deleted. During this period, the CMK is in the PendingDeletion state. After this period ends, you cannot cancel the deletion. Unit: days. Valid values: `7` to `366`. **NOTE:** From version 1.184.0, `pending_window_in_days` can be set to `366`.
        /// </summary>
        [Input("pendingWindowInDays")]
        public Input<int>? PendingWindowInDays { get; set; }

        /// <summary>
        /// The content of the key policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setkeypolicy).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The protection level of the key. Default value: `SOFTWARE`. Valid values: `SOFTWARE`, `HSM`.
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        /// <summary>
        /// The period of automatic key rotation. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day interval. **NOTE**: If `automatic_rotation` is set to `Enabled`, `rotation_interval` is required.
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        /// <summary>
        /// The status of key. Default value: `Enabled`. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

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

        public KeyArgs()
        {
        }
        public static new KeyArgs Empty => new KeyArgs();
    }

    public sealed class KeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the key.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("automaticRotation")]
        public Input<string>? AutomaticRotation { get; set; }

        /// <summary>
        /// The time when the CMK was created.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The creator of the CMK.
        /// </summary>
        [Input("creator")]
        public Input<string>? Creator { get; set; }

        /// <summary>
        /// The time at which the CMK is scheduled for deletion.
        /// </summary>
        [Input("deleteDate")]
        public Input<string>? DeleteDate { get; set; }

        /// <summary>
        /// Specifies whether to enable deletion protection. Default value: `Disabled`. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("deletionProtection")]
        public Input<string>? DeletionProtection { get; set; }

        /// <summary>
        /// The description of deletion protection. **NOTE:** `deletion_protection_description` takes effect only if `deletion_protection` is set to `Enabled`.
        /// </summary>
        [Input("deletionProtectionDescription")]
        public Input<string>? DeletionProtectionDescription { get; set; }

        /// <summary>
        /// Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// The description of the key.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the KMS instance.
        /// </summary>
        [Input("dkmsInstanceId")]
        public Input<string>? DkmsInstanceId { get; set; }

        /// <summary>
        /// Field `is_enabled` has been deprecated from provider version 1.85.0. New field `status` instead.
        /// 
        /// &gt; **NOTE:** If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
        /// 
        /// &gt; **NOTE:** The default type of the CMK is `Aliyun_AES_256`. Only Dedicated KMS supports `Aliyun_AES_128` and `Aliyun_AES_192`.
        /// 
        /// &gt; **NOTE:** When the pre-deletion days elapses, the key is permanently deleted and cannot be recovered.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The specification of the key. Default value: `Aliyun_AES_256`. Valid values: `Aliyun_AES_256`, `Aliyun_AES_128`, `Aliyun_AES_192`, `Aliyun_SM4`, `RSA_2048`, `RSA_3072`, `EC_P256`, `EC_P256K`, `EC_SM2`.
        /// </summary>
        [Input("keySpec")]
        public Input<string>? KeySpec { get; set; }

        /// <summary>
        /// Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
        /// </summary>
        [Input("keyState")]
        public Input<string>? KeyStatus { get; set; }

        /// <summary>
        /// The usage of the key. Default value: `ENCRYPT/DECRYPT`. Valid values:
        /// - `ENCRYPT/DECRYPT`: Encrypts or decrypts data.
        /// - `SIGN/VERIFY`: Generates or verifies a digital signature.
        /// </summary>
        [Input("keyUsage")]
        public Input<string>? KeyUsage { get; set; }

        /// <summary>
        /// The time when the last rotation was performed.
        /// </summary>
        [Input("lastRotationDate")]
        public Input<string>? LastRotationDate { get; set; }

        /// <summary>
        /// The time when the key material expires.
        /// </summary>
        [Input("materialExpireTime")]
        public Input<string>? MaterialExpireTime { get; set; }

        /// <summary>
        /// The time when the next rotation will be performed.
        /// </summary>
        [Input("nextRotationDate")]
        public Input<string>? NextRotationDate { get; set; }

        /// <summary>
        /// The key material origin. Default value: `Aliyun_KMS`. Valid values: `Aliyun_KMS`, `EXTERNAL`.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The number of days before the CMK is deleted. During this period, the CMK is in the PendingDeletion state. After this period ends, you cannot cancel the deletion. Unit: days. Valid values: `7` to `366`. **NOTE:** From version 1.184.0, `pending_window_in_days` can be set to `366`.
        /// </summary>
        [Input("pendingWindowInDays")]
        public Input<int>? PendingWindowInDays { get; set; }

        /// <summary>
        /// The content of the key policy. The value is in the JSON format. The value can be up to 32,768 bytes in length. For more information, see [How to use it](https://www.alibabacloud.com/help/en/kms/developer-reference/api-setkeypolicy).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The ID of the current primary key version of the symmetric CMK.
        /// </summary>
        [Input("primaryKeyVersion")]
        public Input<string>? PrimaryKeyVersion { get; set; }

        /// <summary>
        /// The protection level of the key. Default value: `SOFTWARE`. Valid values: `SOFTWARE`, `HSM`.
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        /// <summary>
        /// The period of automatic key rotation. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day interval. **NOTE**: If `automatic_rotation` is set to `Enabled`, `rotation_interval` is required.
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        /// <summary>
        /// The status of key. Default value: `Enabled`. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

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

        public KeyState()
        {
        }
        public static new KeyState Empty => new KeyState();
    }
}
