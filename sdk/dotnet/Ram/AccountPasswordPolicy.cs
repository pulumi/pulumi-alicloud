// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// Empty resource sets defaults values for every property.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.Ram.AccountPasswordPolicy("default");
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var corporate = new AliCloud.Ram.AccountPasswordPolicy("corporate", new()
    ///     {
    ///         MinimumPasswordLength = 9,
    ///         RequireLowercaseCharacters = false,
    ///         RequireUppercaseCharacters = false,
    ///         RequireNumbers = false,
    ///         RequireSymbols = false,
    ///         HardExpiry = true,
    ///         MaxPasswordAge = 12,
    ///         PasswordReusePrevention = 5,
    ///         MaxLoginAttempts = 3,
    ///     });
    /// 
    /// });
    /// ```
    /// For not specified values sets defaults.
    /// 
    /// ## Import
    /// 
    /// RAM account password policy can be imported using the `id`, e.g.
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ram/accountPasswordPolicy:AccountPasswordPolicy example ram-account-password-policy
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ram/accountPasswordPolicy:AccountPasswordPolicy")]
    public partial class AccountPasswordPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies if a password can expire in a hard way. Default to false.
        /// </summary>
        [Output("hardExpiry")]
        public Output<bool?> HardExpiry { get; private set; } = null!;

        /// <summary>
        /// Maximum logon attempts with an incorrect password within an hour. Valid value range: [0-32]. Default to 5.
        /// </summary>
        [Output("maxLoginAttempts")]
        public Output<int?> MaxLoginAttempts { get; private set; } = null!;

        /// <summary>
        /// The number of days after which password expires. A value of 0 indicates that the password never expires. Valid value range: [0-1095]. Default to 0.
        /// </summary>
        [Output("maxPasswordAge")]
        public Output<int?> MaxPasswordAge { get; private set; } = null!;

        /// <summary>
        /// Minimal required length of password for a user. Valid value range: [8-32]. Default to 12.
        /// </summary>
        [Output("minimumPasswordLength")]
        public Output<int?> MinimumPasswordLength { get; private set; } = null!;

        /// <summary>
        /// User is not allowed to use the latest number of passwords specified in this parameter. A value of 0 indicates the password history check policy is disabled. Valid value range: [0-24]. Default to 0.
        /// </summary>
        [Output("passwordReusePrevention")]
        public Output<int?> PasswordReusePrevention { get; private set; } = null!;

        /// <summary>
        /// Specifies if the occurrence of a lowercase character in the password is mandatory. Default to true.
        /// </summary>
        [Output("requireLowercaseCharacters")]
        public Output<bool?> RequireLowercaseCharacters { get; private set; } = null!;

        /// <summary>
        /// Specifies if the occurrence of a number in the password is mandatory. Default to true.
        /// </summary>
        [Output("requireNumbers")]
        public Output<bool?> RequireNumbers { get; private set; } = null!;

        /// <summary>
        /// Specifies if the occurrence of a special character in the password is mandatory. Default to true.
        /// </summary>
        [Output("requireSymbols")]
        public Output<bool?> RequireSymbols { get; private set; } = null!;

        /// <summary>
        /// Specifies if the occurrence of an uppercase character in the password is mandatory. Default to true.
        /// </summary>
        [Output("requireUppercaseCharacters")]
        public Output<bool?> RequireUppercaseCharacters { get; private set; } = null!;


        /// <summary>
        /// Create a AccountPasswordPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountPasswordPolicy(string name, AccountPasswordPolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/accountPasswordPolicy:AccountPasswordPolicy", name, args ?? new AccountPasswordPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountPasswordPolicy(string name, Input<string> id, AccountPasswordPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/accountPasswordPolicy:AccountPasswordPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountPasswordPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountPasswordPolicy Get(string name, Input<string> id, AccountPasswordPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountPasswordPolicy(name, id, state, options);
        }
    }

    public sealed class AccountPasswordPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if a password can expire in a hard way. Default to false.
        /// </summary>
        [Input("hardExpiry")]
        public Input<bool>? HardExpiry { get; set; }

        /// <summary>
        /// Maximum logon attempts with an incorrect password within an hour. Valid value range: [0-32]. Default to 5.
        /// </summary>
        [Input("maxLoginAttempts")]
        public Input<int>? MaxLoginAttempts { get; set; }

        /// <summary>
        /// The number of days after which password expires. A value of 0 indicates that the password never expires. Valid value range: [0-1095]. Default to 0.
        /// </summary>
        [Input("maxPasswordAge")]
        public Input<int>? MaxPasswordAge { get; set; }

        /// <summary>
        /// Minimal required length of password for a user. Valid value range: [8-32]. Default to 12.
        /// </summary>
        [Input("minimumPasswordLength")]
        public Input<int>? MinimumPasswordLength { get; set; }

        /// <summary>
        /// User is not allowed to use the latest number of passwords specified in this parameter. A value of 0 indicates the password history check policy is disabled. Valid value range: [0-24]. Default to 0.
        /// </summary>
        [Input("passwordReusePrevention")]
        public Input<int>? PasswordReusePrevention { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a lowercase character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireLowercaseCharacters")]
        public Input<bool>? RequireLowercaseCharacters { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a number in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireNumbers")]
        public Input<bool>? RequireNumbers { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a special character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireSymbols")]
        public Input<bool>? RequireSymbols { get; set; }

        /// <summary>
        /// Specifies if the occurrence of an uppercase character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireUppercaseCharacters")]
        public Input<bool>? RequireUppercaseCharacters { get; set; }

        public AccountPasswordPolicyArgs()
        {
        }
        public static new AccountPasswordPolicyArgs Empty => new AccountPasswordPolicyArgs();
    }

    public sealed class AccountPasswordPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if a password can expire in a hard way. Default to false.
        /// </summary>
        [Input("hardExpiry")]
        public Input<bool>? HardExpiry { get; set; }

        /// <summary>
        /// Maximum logon attempts with an incorrect password within an hour. Valid value range: [0-32]. Default to 5.
        /// </summary>
        [Input("maxLoginAttempts")]
        public Input<int>? MaxLoginAttempts { get; set; }

        /// <summary>
        /// The number of days after which password expires. A value of 0 indicates that the password never expires. Valid value range: [0-1095]. Default to 0.
        /// </summary>
        [Input("maxPasswordAge")]
        public Input<int>? MaxPasswordAge { get; set; }

        /// <summary>
        /// Minimal required length of password for a user. Valid value range: [8-32]. Default to 12.
        /// </summary>
        [Input("minimumPasswordLength")]
        public Input<int>? MinimumPasswordLength { get; set; }

        /// <summary>
        /// User is not allowed to use the latest number of passwords specified in this parameter. A value of 0 indicates the password history check policy is disabled. Valid value range: [0-24]. Default to 0.
        /// </summary>
        [Input("passwordReusePrevention")]
        public Input<int>? PasswordReusePrevention { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a lowercase character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireLowercaseCharacters")]
        public Input<bool>? RequireLowercaseCharacters { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a number in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireNumbers")]
        public Input<bool>? RequireNumbers { get; set; }

        /// <summary>
        /// Specifies if the occurrence of a special character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireSymbols")]
        public Input<bool>? RequireSymbols { get; set; }

        /// <summary>
        /// Specifies if the occurrence of an uppercase character in the password is mandatory. Default to true.
        /// </summary>
        [Input("requireUppercaseCharacters")]
        public Input<bool>? RequireUppercaseCharacters { get; set; }

        public AccountPasswordPolicyState()
        {
        }
        public static new AccountPasswordPolicyState Empty => new AccountPasswordPolicyState();
    }
}
