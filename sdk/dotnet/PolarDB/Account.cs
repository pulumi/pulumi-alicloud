// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    /// <summary>
    /// Provides a PolarDB account resource and used to manage databases.
    /// 
    /// &gt; **NOTE:** Available since v1.67.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = AliCloud.PolarDB.GetNodeClasses.Invoke(new()
    ///     {
    ///         DbType = "MySQL",
    ///         DbVersion = "8.0",
    ///         PayType = "PostPaid",
    ///         Category = "Normal",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = "terraform-example",
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/24",
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.ZoneId)),
    ///         VswitchName = "terraform-example",
    ///     });
    /// 
    ///     var defaultCluster = new AliCloud.PolarDB.Cluster("default", new()
    ///     {
    ///         DbType = "MySQL",
    ///         DbVersion = "8.0",
    ///         DbNodeClass = @default.Apply(@default =&gt; @default.Apply(getNodeClassesResult =&gt; getNodeClassesResult.Classes[0]?.SupportedEngines[0]?.AvailableResources[0]?.DbNodeClass)),
    ///         PayType = "PostPaid",
    ///         VswitchId = defaultSwitch.Id,
    ///         Description = "terraform-example",
    ///     });
    /// 
    ///     var defaultAccount = new AliCloud.PolarDB.Account("default", new()
    ///     {
    ///         DbClusterId = defaultCluster.Id,
    ///         AccountName = "terraform_example",
    ///         AccountPassword = "Example1234",
    ///         AccountDescription = "terraform-example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// PolarDB account can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:polardb/account:Account example "pc-12345:tf_account"
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:polardb/account:Account")]
    public partial class Account : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Output("accountDescription")]
        public Output<string?> AccountDescription { get; private set; } = null!;

        /// <summary>
        /// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
        /// </summary>
        [Output("accountPassword")]
        public Output<string> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
        /// </summary>
        [Output("accountType")]
        public Output<string?> AccountType { get; private set; } = null!;

        /// <summary>
        /// The Id of cluster in which account belongs.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        [Output("kmsEncryptionContext")]
        public Output<ImmutableDictionary<string, string>?> KmsEncryptionContext { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs args, CustomResourceOptions? options = null)
            : base("alicloud:polardb/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:polardb/account:Account", name, state, MakeResourceOptions(options, id))
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
        /// Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        [Input("accountPassword", required: true)]
        private Input<string>? _accountPassword;

        /// <summary>
        /// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
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
        /// Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
        /// </summary>
        [Input("accountType")]
        public Input<string>? AccountType { get; set; }

        /// <summary>
        /// The Id of cluster in which account belongs.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
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
        /// Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
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
        /// Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
        /// </summary>
        [Input("accountType")]
        public Input<string>? AccountType { get; set; }

        /// <summary>
        /// The Id of cluster in which account belongs.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `account_password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<string> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<string>());
            set => _kmsEncryptionContext = value;
        }

        public AccountState()
        {
        }
        public static new AccountState Empty => new AccountState();
    }
}
