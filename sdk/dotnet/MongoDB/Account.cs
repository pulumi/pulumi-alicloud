// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    /// <summary>
    /// ## Import
    /// 
    /// Mongo D B Account can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:mongodb/account:Account example &lt;instance_id&gt;:&lt;account_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mongodb/account:Account")]
    public partial class Account : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account comment information.
        /// 
        /// &gt; **NOTE:**  Call the ModifyAccountDescription interface to set the account description information before this parameter is returned.
        /// </summary>
        [Output("accountDescription")]
        public Output<string?> AccountDescription { get; private set; } = null!;

        /// <summary>
        /// The new password.
        /// 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `! # $ % ^ &amp; * ( ) _ + - =`
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// The password of the database account. The password must be 8 to 32 characters in length. It can contain at least three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! # $ % ^ &amp; \* ( ) \_ + - =
        /// </summary>
        [Output("accountPassword")]
        public Output<string> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// The role type of the instance. Value description
        /// 
        /// - When the instance type is sharded cluster, charactertype is required. The values are db and cs.
        /// - When the instance type is a replica set, charactertype can be null or pass in normal.
        /// </summary>
        [Output("characterType")]
        public Output<string> CharacterType { get; private set; } = null!;

        /// <summary>
        /// The account whose password needs to be reset. Set the value to `root`.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Account Status
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
            : base("alicloud:mongodb/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/account:Account", name, state, MakeResourceOptions(options, id))
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
        /// Account comment information.
        /// 
        /// &gt; **NOTE:**  Call the ModifyAccountDescription interface to set the account description information before this parameter is returned.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// The new password.
        /// 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `! # $ % ^ &amp; * ( ) _ + - =`
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        [Input("accountPassword", required: true)]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the database account. The password must be 8 to 32 characters in length. It can contain at least three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! # $ % ^ &amp; \* ( ) \_ + - =
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
        /// The role type of the instance. Value description
        /// 
        /// - When the instance type is sharded cluster, charactertype is required. The values are db and cs.
        /// - When the instance type is a replica set, charactertype can be null or pass in normal.
        /// </summary>
        [Input("characterType")]
        public Input<string>? CharacterType { get; set; }

        /// <summary>
        /// The account whose password needs to be reset. Set the value to `root`.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public AccountArgs()
        {
        }
        public static new AccountArgs Empty => new AccountArgs();
    }

    public sealed class AccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account comment information.
        /// 
        /// &gt; **NOTE:**  Call the ModifyAccountDescription interface to set the account description information before this parameter is returned.
        /// </summary>
        [Input("accountDescription")]
        public Input<string>? AccountDescription { get; set; }

        /// <summary>
        /// The new password.
        /// 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `! # $ % ^ &amp; * ( ) _ + - =`
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// The password of the database account. The password must be 8 to 32 characters in length. It can contain at least three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. Special characters include ! # $ % ^ &amp; \* ( ) \_ + - =
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
        /// The role type of the instance. Value description
        /// 
        /// - When the instance type is sharded cluster, charactertype is required. The values are db and cs.
        /// - When the instance type is a replica set, charactertype can be null or pass in normal.
        /// </summary>
        [Input("characterType")]
        public Input<string>? CharacterType { get; set; }

        /// <summary>
        /// The account whose password needs to be reset. Set the value to `root`.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Account Status
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AccountState()
        {
        }
        public static new AccountState Empty => new AccountState();
    }
}
