// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ
{
    /// <summary>
    /// Provides a Sag ClientUser resource. This topic describes how to manage accounts as an administrator. After you configure the network, you can create multiple accounts and distribute them to end users so that clients can access Alibaba Cloud.
    /// 
    /// For information about Sag ClientUser and how to use it, see [What is Sag ClientUser](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/createsmartaccessgatewayclientuser).
    /// 
    /// &gt; **NOTE:** Available since v1.65.0.
    /// 
    /// &gt; **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
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
    ///     var sagId = config.Get("sagId") ?? "sag-9bifkfaz4fg***";
    ///     var @default = new AliCloud.Sag.ClientUser("default", new()
    ///     {
    ///         SagId = sagId,
    ///         Bandwidth = 20,
    ///         UserMail = "tf-example@abc.com",
    ///         UserName = name,
    ///         Password = "example1234",
    ///         ClientIp = "192.1.10.0",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The Sag ClientUser can be imported using the name, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:rocketmq/clientUser:ClientUser example sag-abc123456:tf-username-abc123456
    /// ```
    /// </summary>
    [Obsolete(@"alicloud.rocketmq/clientuser.ClientUser has been deprecated in favor of alicloud.sag/clientuser.ClientUser")]
    [AliCloudResourceType("alicloud:rocketmq/clientUser:ClientUser")]
    public partial class ClientUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        /// </summary>
        [Output("clientIp")]
        public Output<string?> ClientIp { get; private set; } = null!;

        /// <summary>
        /// The password of the KMS Encryption.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// The context of the KMS Encryption.
        /// </summary>
        [Output("kmsEncryptionContext")]
        public Output<ImmutableDictionary<string, string>?> KmsEncryptionContext { get; private set; } = null!;

        /// <summary>
        /// The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The ID of the SAG instance created for the SAG APP.
        /// </summary>
        [Output("sagId")]
        public Output<string> SagId { get; private set; } = null!;

        /// <summary>
        /// The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        /// </summary>
        [Output("userMail")]
        public Output<string> UserMail { get; private set; } = null!;

        /// <summary>
        /// The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a ClientUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientUser(string name, ClientUserArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/clientUser:ClientUser", name, args ?? new ClientUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientUser(string name, Input<string> id, ClientUserState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/clientUser:ClientUser", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClientUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientUser Get(string name, Input<string> id, ClientUserState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientUser(name, id, state, options);
        }
    }

    public sealed class ClientUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        /// <summary>
        /// The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        /// </summary>
        [Input("clientIp")]
        public Input<string>? ClientIp { get; set; }

        /// <summary>
        /// The password of the KMS Encryption.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// The context of the KMS Encryption.
        /// </summary>
        public InputMap<string> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<string>());
            set => _kmsEncryptionContext = value;
        }

        /// <summary>
        /// The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The ID of the SAG instance created for the SAG APP.
        /// </summary>
        [Input("sagId", required: true)]
        public Input<string> SagId { get; set; } = null!;

        /// <summary>
        /// The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        /// </summary>
        [Input("userMail", required: true)]
        public Input<string> UserMail { get; set; } = null!;

        /// <summary>
        /// The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public ClientUserArgs()
        {
        }
        public static new ClientUserArgs Empty => new ClientUserArgs();
    }

    public sealed class ClientUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        /// </summary>
        [Input("clientIp")]
        public Input<string>? ClientIp { get; set; }

        /// <summary>
        /// The password of the KMS Encryption.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<string>? _kmsEncryptionContext;

        /// <summary>
        /// The context of the KMS Encryption.
        /// </summary>
        public InputMap<string> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<string>());
            set => _kmsEncryptionContext = value;
        }

        /// <summary>
        /// The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The ID of the SAG instance created for the SAG APP.
        /// </summary>
        [Input("sagId")]
        public Input<string>? SagId { get; set; }

        /// <summary>
        /// The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        /// </summary>
        [Input("userMail")]
        public Input<string>? UserMail { get; set; }

        /// <summary>
        /// The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public ClientUserState()
        {
        }
        public static new ClientUserState Empty => new ClientUserState();
    }
}
