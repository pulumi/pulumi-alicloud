// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Esa
{
    /// <summary>
    /// Provides a ESA Compression Rule resource.
    /// 
    /// For information about ESA Compression Rule and how to use it, see [What is Compression Rule](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateCompressionRule).
    /// 
    /// &gt; **NOTE:** Available since v1.244.0.
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
    ///     var @default = AliCloud.Esa.GetSites.Invoke(new()
    ///     {
    ///         PlanSubscribeType = "enterpriseplan",
    ///     });
    /// 
    ///     var example = new AliCloud.Esa.Site("example", new()
    ///     {
    ///         SiteName = "compression.example.com",
    ///         InstanceId = @default.Apply(@default =&gt; @default.Apply(getSitesResult =&gt; getSitesResult.Sites[0]?.InstanceId)),
    ///         Coverage = "domestic",
    ///         AccessType = "NS",
    ///     });
    /// 
    ///     var defaultCompressionRule = new AliCloud.Esa.CompressionRule("default", new()
    ///     {
    ///         Gzip = "off",
    ///         Brotli = "off",
    ///         Rule = "http.host eq \"video.example.com\"",
    ///         SiteVersion = 0,
    ///         RuleName = "rule_example",
    ///         SiteId = example.Id,
    ///         Zstd = "off",
    ///         RuleEnable = "off",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ESA Compression Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:esa/compressionRule:CompressionRule example &lt;site_id&gt;:&lt;config_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:esa/compressionRule:CompressionRule")]
    public partial class CompressionRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Brotli compression. Value range:
        /// </summary>
        [Output("brotli")]
        public Output<string?> Brotli { get; private set; } = null!;

        /// <summary>
        /// Config Id
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// Gzip compression. Value range:
        /// </summary>
        [Output("gzip")]
        public Output<string?> Gzip { get; private set; } = null!;

        /// <summary>
        /// Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        /// - Match all incoming requests: value set to true
        /// - Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
        /// </summary>
        [Output("rule")]
        public Output<string?> Rule { get; private set; } = null!;

        /// <summary>
        /// Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        /// </summary>
        [Output("ruleEnable")]
        public Output<string?> RuleEnable { get; private set; } = null!;

        /// <summary>
        /// Rule name. When adding global configuration, this parameter does not need to be set.
        /// </summary>
        [Output("ruleName")]
        public Output<string?> RuleName { get; private set; } = null!;

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Output("siteId")]
        public Output<int> SiteId { get; private set; } = null!;

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Output("siteVersion")]
        public Output<int?> SiteVersion { get; private set; } = null!;

        /// <summary>
        /// Zstd compression. Value range:
        /// </summary>
        [Output("zstd")]
        public Output<string?> Zstd { get; private set; } = null!;


        /// <summary>
        /// Create a CompressionRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CompressionRule(string name, CompressionRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:esa/compressionRule:CompressionRule", name, args ?? new CompressionRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CompressionRule(string name, Input<string> id, CompressionRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:esa/compressionRule:CompressionRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CompressionRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CompressionRule Get(string name, Input<string> id, CompressionRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new CompressionRule(name, id, state, options);
        }
    }

    public sealed class CompressionRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Brotli compression. Value range:
        /// </summary>
        [Input("brotli")]
        public Input<string>? Brotli { get; set; }

        /// <summary>
        /// Gzip compression. Value range:
        /// </summary>
        [Input("gzip")]
        public Input<string>? Gzip { get; set; }

        /// <summary>
        /// Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        /// - Match all incoming requests: value set to true
        /// - Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        /// <summary>
        /// Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        /// </summary>
        [Input("ruleEnable")]
        public Input<string>? RuleEnable { get; set; }

        /// <summary>
        /// Rule name. When adding global configuration, this parameter does not need to be set.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Input("siteId", required: true)]
        public Input<int> SiteId { get; set; } = null!;

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Input("siteVersion")]
        public Input<int>? SiteVersion { get; set; }

        /// <summary>
        /// Zstd compression. Value range:
        /// </summary>
        [Input("zstd")]
        public Input<string>? Zstd { get; set; }

        public CompressionRuleArgs()
        {
        }
        public static new CompressionRuleArgs Empty => new CompressionRuleArgs();
    }

    public sealed class CompressionRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Brotli compression. Value range:
        /// </summary>
        [Input("brotli")]
        public Input<string>? Brotli { get; set; }

        /// <summary>
        /// Config Id
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// Gzip compression. Value range:
        /// </summary>
        [Input("gzip")]
        public Input<string>? Gzip { get; set; }

        /// <summary>
        /// Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        /// - Match all incoming requests: value set to true
        /// - Match specified request: Set the value to a custom expression, for example: (http.host eq \"video.example.com\")
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        /// <summary>
        /// Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        /// </summary>
        [Input("ruleEnable")]
        public Input<string>? RuleEnable { get; set; }

        /// <summary>
        /// Rule name. When adding global configuration, this parameter does not need to be set.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Input("siteId")]
        public Input<int>? SiteId { get; set; }

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Input("siteVersion")]
        public Input<int>? SiteVersion { get; set; }

        /// <summary>
        /// Zstd compression. Value range:
        /// </summary>
        [Input("zstd")]
        public Input<string>? Zstd { get; set; }

        public CompressionRuleState()
        {
        }
        public static new CompressionRuleState Empty => new CompressionRuleState();
    }
}
