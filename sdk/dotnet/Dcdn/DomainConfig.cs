// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    /// <summary>
    /// Provides a DCDN Accelerated Domain resource.
    /// 
    /// For information about domain config and how to use it, see [Batch set config](https://www.alibabacloud.com/help/en/doc-detail/130632.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.131.0.
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
    ///     var domainName = config.Get("domainName") ?? "alibaba-example.com";
    ///     var example = new AliCloud.Dcdn.Domain("example", new()
    ///     {
    ///         DomainName = domainName,
    ///         Scope = "overseas",
    ///         Status = "online",
    ///         Sources = new[]
    ///         {
    ///             new AliCloud.Dcdn.Inputs.DomainSourceArgs
    ///             {
    ///                 Content = "1.1.1.1",
    ///                 Type = "ipaddr",
    ///                 Priority = "20",
    ///                 Port = 80,
    ///                 Weight = "10",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var ipAllowListSet = new AliCloud.Dcdn.DomainConfig("ip_allow_list_set", new()
    ///     {
    ///         DomainName = example.DomainName,
    ///         FunctionName = "ip_allow_list_set",
    ///         FunctionArgs = new[]
    ///         {
    ///             new AliCloud.Dcdn.Inputs.DomainConfigFunctionArgArgs
    ///             {
    ///                 ArgName = "ip_list",
    ///                 ArgValue = "192.168.0.1",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var refererWhiteListSet = new AliCloud.Dcdn.DomainConfig("referer_white_list_set", new()
    ///     {
    ///         DomainName = example.DomainName,
    ///         FunctionName = "referer_white_list_set",
    ///         FunctionArgs = new[]
    ///         {
    ///             new AliCloud.Dcdn.Inputs.DomainConfigFunctionArgArgs
    ///             {
    ///                 ArgName = "refer_domain_allow_list",
    ///                 ArgValue = "110.110.110.110",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var filetypeBasedTtlSet = new AliCloud.Dcdn.DomainConfig("filetype_based_ttl_set", new()
    ///     {
    ///         DomainName = example.DomainName,
    ///         FunctionName = "filetype_based_ttl_set",
    ///         FunctionArgs = new[]
    ///         {
    ///             new AliCloud.Dcdn.Inputs.DomainConfigFunctionArgArgs
    ///             {
    ///                 ArgName = "ttl",
    ///                 ArgValue = "300",
    ///             },
    ///             new AliCloud.Dcdn.Inputs.DomainConfigFunctionArgArgs
    ///             {
    ///                 ArgName = "file_type",
    ///                 ArgValue = "jpg",
    ///             },
    ///             new AliCloud.Dcdn.Inputs.DomainConfigFunctionArgArgs
    ///             {
    ///                 ArgName = "weight",
    ///                 ArgValue = "1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DCDN domain config can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:dcdn/domainConfig:DomainConfig example &lt;domain_name&gt;:&lt;function_name&gt;:&lt;config_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dcdn/domainConfig:DomainConfig")]
    public partial class DomainConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the configuration.
        /// </summary>
        [Output("configId")]
        public Output<string> ConfigId { get; private set; } = null!;

        /// <summary>
        /// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// The args of the domain config. See `function_args` below.
        /// </summary>
        [Output("functionArgs")]
        public Output<ImmutableArray<Outputs.DomainConfigFunctionArg>> FunctionArgs { get; private set; } = null!;

        /// <summary>
        /// The name of the domain config.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// By configuring the function condition (rule engine) in the domain name configuration function parameters, Rule conditions can be created (Rule conditions can match and filter user requests by identifying various parameters carried in user requests). After each rule condition is created, a corresponding ConfigId will be generated, and the ConfigId can be referenced by other functions as a ParentId parameter, in this way, the rule conditions can be combined with the functional configuration to form a more flexible configuration.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        /// <summary>
        /// The status of the Config.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a DomainConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainConfig(string name, DomainConfigArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/domainConfig:DomainConfig", name, args ?? new DomainConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainConfig(string name, Input<string> id, DomainConfigState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/domainConfig:DomainConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainConfig Get(string name, Input<string> id, DomainConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainConfig(name, id, state, options);
        }
    }

    public sealed class DomainConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        [Input("functionArgs", required: true)]
        private InputList<Inputs.DomainConfigFunctionArgArgs>? _functionArgs;

        /// <summary>
        /// The args of the domain config. See `function_args` below.
        /// </summary>
        public InputList<Inputs.DomainConfigFunctionArgArgs> FunctionArgs
        {
            get => _functionArgs ?? (_functionArgs = new InputList<Inputs.DomainConfigFunctionArgArgs>());
            set => _functionArgs = value;
        }

        /// <summary>
        /// The name of the domain config.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// By configuring the function condition (rule engine) in the domain name configuration function parameters, Rule conditions can be created (Rule conditions can match and filter user requests by identifying various parameters carried in user requests). After each rule condition is created, a corresponding ConfigId will be generated, and the ConfigId can be referenced by other functions as a ParentId parameter, in this way, the rule conditions can be combined with the functional configuration to form a more flexible configuration.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        public DomainConfigArgs()
        {
        }
        public static new DomainConfigArgs Empty => new DomainConfigArgs();
    }

    public sealed class DomainConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the configuration.
        /// </summary>
        [Input("configId")]
        public Input<string>? ConfigId { get; set; }

        /// <summary>
        /// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("functionArgs")]
        private InputList<Inputs.DomainConfigFunctionArgGetArgs>? _functionArgs;

        /// <summary>
        /// The args of the domain config. See `function_args` below.
        /// </summary>
        public InputList<Inputs.DomainConfigFunctionArgGetArgs> FunctionArgs
        {
            get => _functionArgs ?? (_functionArgs = new InputList<Inputs.DomainConfigFunctionArgGetArgs>());
            set => _functionArgs = value;
        }

        /// <summary>
        /// The name of the domain config.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// By configuring the function condition (rule engine) in the domain name configuration function parameters, Rule conditions can be created (Rule conditions can match and filter user requests by identifying various parameters carried in user requests). After each rule condition is created, a corresponding ConfigId will be generated, and the ConfigId can be referenced by other functions as a ParentId parameter, in this way, the rule conditions can be combined with the functional configuration to form a more flexible configuration.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// The status of the Config.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public DomainConfigState()
        {
        }
        public static new DomainConfigState Empty => new DomainConfigState();
    }
}
