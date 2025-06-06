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
    /// Provides a KMS Network Rule resource. Network rules that can be bound by Application Access Point's policies.
    /// 
    /// For information about KMS Network Rule and how to use it, see [What is Network Rule](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createnetworkrule).
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
    ///     var @default = new AliCloud.Kms.NetworkRule("default", new()
    ///     {
    ///         Description = "example-description",
    ///         SourcePrivateIps = new[]
    ///         {
    ///             "10.10.10.10/24",
    ///             "192.168.17.13",
    ///             "100.177.24.254",
    ///         },
    ///         NetworkRuleName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// KMS Network Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:kms/networkRule:NetworkRule example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:kms/networkRule:NetworkRule")]
    public partial class NetworkRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Network Rule Name.
        /// </summary>
        [Output("networkRuleName")]
        public Output<string> NetworkRuleName { get; private set; } = null!;

        /// <summary>
        /// Allowed private network addresses.
        /// </summary>
        [Output("sourcePrivateIps")]
        public Output<ImmutableArray<string>> SourcePrivateIps { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkRule(string name, NetworkRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/networkRule:NetworkRule", name, args ?? new NetworkRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkRule(string name, Input<string> id, NetworkRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/networkRule:NetworkRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkRule Get(string name, Input<string> id, NetworkRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkRule(name, id, state, options);
        }
    }

    public sealed class NetworkRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Network Rule Name.
        /// </summary>
        [Input("networkRuleName")]
        public Input<string>? NetworkRuleName { get; set; }

        [Input("sourcePrivateIps", required: true)]
        private InputList<string>? _sourcePrivateIps;

        /// <summary>
        /// Allowed private network addresses.
        /// </summary>
        public InputList<string> SourcePrivateIps
        {
            get => _sourcePrivateIps ?? (_sourcePrivateIps = new InputList<string>());
            set => _sourcePrivateIps = value;
        }

        public NetworkRuleArgs()
        {
        }
        public static new NetworkRuleArgs Empty => new NetworkRuleArgs();
    }

    public sealed class NetworkRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Network Rule Name.
        /// </summary>
        [Input("networkRuleName")]
        public Input<string>? NetworkRuleName { get; set; }

        [Input("sourcePrivateIps")]
        private InputList<string>? _sourcePrivateIps;

        /// <summary>
        /// Allowed private network addresses.
        /// </summary>
        public InputList<string> SourcePrivateIps
        {
            get => _sourcePrivateIps ?? (_sourcePrivateIps = new InputList<string>());
            set => _sourcePrivateIps = value;
        }

        public NetworkRuleState()
        {
        }
        public static new NetworkRuleState Empty => new NetworkRuleState();
    }
}
