// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds
{
    /// <summary>
    /// Provides a Elastic Desktop Service (ECD) User resource.
    /// 
    /// For information about Elastic Desktop Service (ECD) User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-eds-user-2021-03-08-createusers-desktop).
    /// 
    /// &gt; **NOTE:** Available since v1.142.0.
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
    ///     var @default = new AliCloud.Eds.User("default", new()
    ///     {
    ///         EndUserId = "terraform_example123",
    ///         Email = "tf.example@abc.com",
    ///         Phone = "18888888888",
    ///         Password = "Example_123",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECD User can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:eds/user:User example &lt;end_user_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eds/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The email of the user email.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        /// </summary>
        [Output("endUserId")]
        public Output<string> EndUserId { get; private set; } = null!;

        /// <summary>
        /// The password of the user password.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The phone of the mobile phone number.
        /// </summary>
        [Output("phone")]
        public Output<string?> Phone { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Unlocked`, `Locked`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eds/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eds/user:User", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email of the user email.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        /// </summary>
        [Input("endUserId", required: true)]
        public Input<string> EndUserId { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the user password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The phone of the mobile phone number.
        /// </summary>
        [Input("phone")]
        public Input<string>? Phone { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Unlocked`, `Locked`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email of the user email.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        /// </summary>
        [Input("endUserId")]
        public Input<string>? EndUserId { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the user password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The phone of the mobile phone number.
        /// </summary>
        [Input("phone")]
        public Input<string>? Phone { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Unlocked`, `Locked`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
