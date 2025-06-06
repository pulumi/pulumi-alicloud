// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.KVStore
{
    /// <summary>
    /// Provides a Tair (Redis OSS-Compatible) And Memcache (KVStore) Account resource.
    /// 
    /// For information about Tair (Redis OSS-Compatible) And Memcache (KVStore) Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createaccount-redis).
    /// 
    /// &gt; **NOTE:** Available since v1.66.0.
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
    ///     var @default = AliCloud.KVStore.GetZones.Invoke();
    /// 
    ///     var defaultGetResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
    ///     {
    ///         Status = "OK",
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
    ///     var defaultInstance = new AliCloud.KVStore.Instance("default", new()
    ///     {
    ///         DbInstanceName = name,
    ///         VswitchId = defaultSwitch.Id,
    ///         ResourceGroupId = defaultGetResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Ids[0]),
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
    ///         InstanceClass = "redis.master.large.default",
    ///         InstanceType = "Redis",
    ///         EngineVersion = "5.0",
    ///         SecurityIps = new[]
    ///         {
    ///             "10.23.12.24",
    ///         },
    ///         Config = 
    ///         {
    ///             { "appendonly", "yes" },
    ///             { "lazyfree-lazy-eviction", "yes" },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "example" },
    ///         },
    ///     });
    /// 
    ///     var defaultAccount = new AliCloud.KVStore.Account("default", new()
    ///     {
    ///         AccountName = "tfexamplename",
    ///         AccountPassword = "YourPassword_123",
    ///         InstanceId = defaultInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Tair (Redis OSS-Compatible) And Memcache (KVStore) account can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:kvstore/account:Account example &lt;instance_id&gt;:&lt;account_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kvstore/account:Account")]
    public partial class Account : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the account. The name must meet the following requirements:
        /// * The name can contain lowercase letters, digits, and hyphens (-), and must start with a lowercase letter.
        /// * The name can be up to 100 characters in length.
        /// * The name cannot be one of the reserved words in the [Reserved words for Redis account names](https://www.alibabacloud.com/help/en/redis/user-guide/create-and-manage-database-accounts) section.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// The password of the account. The password must be 8 to 32 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!@ # $ % ^ &amp; * ( ) _ + - =`. You have to specify one of `account_password` and `kms_encrypted_password` fields.
        /// </summary>
        [Output("accountPassword")]
        public Output<string?> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// The privilege of account access database. Default value: `RoleReadWrite` 
        /// - `RoleReadOnly`: This value is only for Redis and Memcache
        /// - `RoleReadWrite`: This value is only for Redis and Memcache
        /// </summary>
        [Output("accountPrivilege")]
        public Output<string?> AccountPrivilege { get; private set; } = null!;

        /// <summary>
        /// Privilege type of account.
        /// - Normal: Common privilege.
        /// Default to Normal.
        /// </summary>
        [Output("accountType")]
        public Output<string?> AccountType { get; private set; } = null!;

        /// <summary>
        /// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a Tair (Redis OSS-Compatible) And Memcache (KVStore) account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a Tair (Redis OSS-Compatible) And Memcache (KVStore) account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        [Output("kmsEncryptionContext")]
        public Output<ImmutableDictionary<string, string>?> KmsEncryptionContext { get; private set; } = null!;

        /// <summary>
        /// The status of Tair (Redis OSS-Compatible) And Memcache (KVStore) Account.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kvstore/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kvstore/account:Account", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Account resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Account Get(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
        {
            return new Account(name, id, state, options);
        }
    }

    public sealed class AccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the account. The name must meet the following requirements:
        /// * The name can contain lowercase letters, digits, and hyphens (-), and must start with a lowercase letter.
        /// * The name can be up to 100 characters in length.
        /// * The name cannot be one of the reserved words in the [Reserved words for Redis account names](https://www.alibabacloud.com/help/en/redis/user-guide/create-and-manage-database-accounts) section.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the account. The password must be 8 to 32 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!@ # $ % ^ &amp; * ( ) _ + - =`. You have to specify one of `account_password` and `kms_encrypted_password` fields.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The privilege of account access database. Default value: `RoleReadWrite` 
        /// - `RoleReadOnly`: This value is only for Redis and Memcache
        /// - `RoleReadWrite`: This value is only for Redis and Memcache
        /// </summary>
        [Input("accountPrivilege")]
        public Input<string>? AccountPrivilege { get; set; }

        /// <summary>
        /// Privilege type of account.
        /// - Normal: Common privilege.
        /// Default to Normal.
        /// </summary>
        [Input("accountType")]
        public Input<string>? AccountType { get; set; }

        /// <summary>
        /// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a Tair (Redis OSS-Compatible) And Memcache (KVStore) account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a Tair (Redis OSS-Compatible) And Memcache (KVStore) account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<string> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<string>());
            set => _kmsEncryptionContext = value;
        }

        public AccountArgs()
        {
        }
        public static new AccountArgs Empty => new AccountArgs();
    }

    public sealed class AccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the account. The name must meet the following requirements:
        /// * The name can contain lowercase letters, digits, and hyphens (-), and must start with a lowercase letter.
        /// * The name can be up to 100 characters in length.
        /// * The name cannot be one of the reserved words in the [Reserved words for Redis account names](https://www.alibabacloud.com/help/en/redis/user-guide/create-and-manage-database-accounts) section.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the account. The password must be 8 to 32 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!@ # $ % ^ &amp; * ( ) _ + - =`. You have to specify one of `account_password` and `kms_encrypted_password` fields.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The privilege of account access database. Default value: `RoleReadWrite` 
        /// - `RoleReadOnly`: This value is only for Redis and Memcache
        /// - `RoleReadWrite`: This value is only for Redis and Memcache
        /// </summary>
        [Input("accountPrivilege")]
        public Input<string>? AccountPrivilege { get; set; }

        /// <summary>
        /// Privilege type of account.
        /// - Normal: Common privilege.
        /// Default to Normal.
        /// </summary>
        [Input("accountType")]
        public Input<string>? AccountType { get; set; }

        /// <summary>
        /// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a Tair (Redis OSS-Compatible) And Memcache (KVStore) account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a Tair (Redis OSS-Compatible) And Memcache (KVStore) account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<string> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<string>());
            set => _kmsEncryptionContext = value;
        }

        /// <summary>
        /// The status of Tair (Redis OSS-Compatible) And Memcache (KVStore) Account.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AccountState()
        {
        }
        public static new AccountState Empty => new AccountState();
    }
}
