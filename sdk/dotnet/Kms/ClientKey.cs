// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    /// <summary>
    /// Provides a KMS Client Key resource. Client key (of Application Access Point).
    /// 
    /// For information about KMS Client Key and how to use it, see [What is Client Key](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createclientkey).
    /// 
    /// &gt; **NOTE:** Available since v1.210.0.
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
    ///     var aAP0 = new AliCloud.Kms.ApplicationAccessPoint("aAP0", new()
    ///     {
    ///         Policies = new[]
    ///         {
    ///             "aa",
    ///         },
    ///         Description = "aa",
    ///         ApplicationAccessPointName = name,
    ///     });
    /// 
    ///     var @default = new AliCloud.Kms.ClientKey("default", new()
    ///     {
    ///         AapName = aAP0.ApplicationAccessPointName,
    ///         Password = "YouPassword123!",
    ///         NotBefore = "2023-09-01T14:11:22Z",
    ///         NotAfter = "2028-09-01T14:11:22Z",
    ///         PrivateKeyDataFile = "./private_key_data_file.txt",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// KMS Client Key can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:kms/clientKey:ClientKey example &lt;id&gt;
    /// ```
    /// 
    ///  Resource attributes such as `password`, `private_key_data_file` are not available for imported resources as this information cannot be read from the KMS API.
    /// </summary>
    [AliCloudResourceType("alicloud:kms/clientKey:ClientKey")]
    public partial class ClientKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ClientKey's parent Application Access Point name.
        /// </summary>
        [Output("aapName")]
        public Output<string> AapName { get; private set; } = null!;

        /// <summary>
        /// Create timestamp, e.g. "2022-08-10T08:03:30Z".
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        /// </summary>
        [Output("notAfter")]
        public Output<string?> NotAfter { get; private set; } = null!;

        /// <summary>
        /// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        /// </summary>
        [Output("notBefore")]
        public Output<string?> NotBefore { get; private set; } = null!;

        /// <summary>
        /// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Output("privateKeyDataFile")]
        public Output<string?> PrivateKeyDataFile { get; private set; } = null!;


        /// <summary>
        /// Create a ClientKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientKey(string name, ClientKeyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/clientKey:ClientKey", name, args ?? new ClientKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientKey(string name, Input<string> id, ClientKeyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/clientKey:ClientKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClientKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientKey Get(string name, Input<string> id, ClientKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientKey(name, id, state, options);
        }
    }

    public sealed class ClientKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ClientKey's parent Application Access Point name.
        /// </summary>
        [Input("aapName", required: true)]
        public Input<string> AapName { get; set; } = null!;

        /// <summary>
        /// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        /// </summary>
        [Input("notAfter")]
        public Input<string>? NotAfter { get; set; }

        /// <summary>
        /// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
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
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Input("privateKeyDataFile")]
        public Input<string>? PrivateKeyDataFile { get; set; }

        public ClientKeyArgs()
        {
        }
        public static new ClientKeyArgs Empty => new ClientKeyArgs();
    }

    public sealed class ClientKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ClientKey's parent Application Access Point name.
        /// </summary>
        [Input("aapName")]
        public Input<string>? AapName { get; set; }

        /// <summary>
        /// Create timestamp, e.g. "2022-08-10T08:03:30Z".
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The ClientKey expiration time. Example: "2027-08-10 T08:03:30Z".
        /// </summary>
        [Input("notAfter")]
        public Input<string>? NotAfter { get; set; }

        /// <summary>
        /// The valid start time of the ClientKey. Example: "2022-08-10 T08:03:30Z".
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// To enhance security, set a password for the downloaded Client Key,When an application accesses KMS, you must use the ClientKey content and this password to initialize the SDK client.
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
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Input("privateKeyDataFile")]
        public Input<string>? PrivateKeyDataFile { get; set; }

        public ClientKeyState()
        {
        }
        public static new ClientKeyState Empty => new ClientKeyState();
    }
}