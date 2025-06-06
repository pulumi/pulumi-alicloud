// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    /// <summary>
    /// Provides a ALB Security Policy resource.
    /// 
    /// For information about ALB Security Policy and how to use it, see [What is Security Policy](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createsecuritypolicy).
    /// 
    /// &gt; **NOTE:** Available since v1.130.0.
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
    ///     var @default = new AliCloud.Alb.SecurityPolicy("default", new()
    ///     {
    ///         SecurityPolicyName = "tf_example",
    ///         TlsVersions = new[]
    ///         {
    ///             "TLSv1.0",
    ///         },
    ///         Ciphers = new[]
    ///         {
    ///             "ECDHE-ECDSA-AES128-SHA",
    ///             "AES256-SHA",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ALB Security Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:alb/securityPolicy:SecurityPolicy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alb/securityPolicy:SecurityPolicy")]
    public partial class SecurityPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        /// </summary>
        [Output("ciphers")]
        public Output<ImmutableArray<string>> Ciphers { get; private set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        /// </summary>
        [Output("securityPolicyName")]
        public Output<string> SecurityPolicyName { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        /// </summary>
        [Output("tlsVersions")]
        public Output<ImmutableArray<string>> TlsVersions { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityPolicy(string name, SecurityPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:alb/securityPolicy:SecurityPolicy", name, args ?? new SecurityPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityPolicy(string name, Input<string> id, SecurityPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alb/securityPolicy:SecurityPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityPolicy Get(string name, Input<string> id, SecurityPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityPolicy(name, id, state, options);
        }
    }

    public sealed class SecurityPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("ciphers", required: true)]
        private InputList<string>? _ciphers;

        /// <summary>
        /// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        /// </summary>
        public InputList<string> Ciphers
        {
            get => _ciphers ?? (_ciphers = new InputList<string>());
            set => _ciphers = value;
        }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        /// </summary>
        [Input("securityPolicyName", required: true)]
        public Input<string> SecurityPolicyName { get; set; } = null!;

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

        [Input("tlsVersions", required: true)]
        private InputList<string>? _tlsVersions;

        /// <summary>
        /// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        /// </summary>
        public InputList<string> TlsVersions
        {
            get => _tlsVersions ?? (_tlsVersions = new InputList<string>());
            set => _tlsVersions = value;
        }

        public SecurityPolicyArgs()
        {
        }
        public static new SecurityPolicyArgs Empty => new SecurityPolicyArgs();
    }

    public sealed class SecurityPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("ciphers")]
        private InputList<string>? _ciphers;

        /// <summary>
        /// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
        /// </summary>
        public InputList<string> Ciphers
        {
            get => _ciphers ?? (_ciphers = new InputList<string>());
            set => _ciphers = value;
        }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
        /// </summary>
        [Input("securityPolicyName")]
        public Input<string>? SecurityPolicyName { get; set; }

        /// <summary>
        /// The status of the resource.
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

        [Input("tlsVersions")]
        private InputList<string>? _tlsVersions;

        /// <summary>
        /// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
        /// </summary>
        public InputList<string> TlsVersions
        {
            get => _tlsVersions ?? (_tlsVersions = new InputList<string>());
            set => _tlsVersions = value;
        }

        public SecurityPolicyState()
        {
        }
        public static new SecurityPolicyState Empty => new SecurityPolicyState();
    }
}
