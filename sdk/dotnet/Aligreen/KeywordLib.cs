// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Aligreen
{
    /// <summary>
    /// Provides a Aligreen Keyword Lib resource.
    /// 
    /// Keyword library for text detection.
    /// 
    /// For information about Aligreen Keyword Lib and how to use it, see [What is Keyword Lib](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.228.0.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform";
    ///     var @default = new Random.Index.Integer("default", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var defaultMn8sVK = new AliCloud.Aligreen.BizType("defaultMn8sVK", new()
    ///     {
    ///         BizTypeName = $"{name}{@default.Result}",
    ///         CiteTemplate = true,
    ///         IndustryInfo = "社交-注册信息-昵称",
    ///     });
    /// 
    ///     var defaultKeywordLib = new AliCloud.Aligreen.KeywordLib("default", new()
    ///     {
    ///         Category = "BLACK",
    ///         ResourceType = "TEXT",
    ///         LibType = "textKeyword",
    ///         KeywordLibName = name,
    ///         MatchMode = "fuzzy",
    ///         Language = "cn",
    ///         BizTypes = new[]
    ///         {
    ///             "example_007",
    ///         },
    ///         Lang = "cn",
    ///         Enable = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Aligreen Keyword Lib can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:aligreen/keywordLib:KeywordLib example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:aligreen/keywordLib:KeywordLib")]
    public partial class KeywordLib : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The business scenario. Example:["bizTypeA","bizTypeB"]
        /// </summary>
        [Output("bizTypes")]
        public Output<ImmutableArray<string>> BizTypes { get; private set; } = null!;

        /// <summary>
        /// The category of the text library. Valid values: BLACK: a blacklist. WHITE: a whitelist. REVIEW: a review list
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable text library.true: Enable the text library. This is the default value.false: Disable the text library.
        /// </summary>
        [Output("enable")]
        public Output<bool> Enable { get; private set; } = null!;

        /// <summary>
        /// The name of the keyword library defined by the customer. It can contain no more than 20 characters in Chinese, English, and underscore (_).
        /// </summary>
        [Output("keywordLibName")]
        public Output<string> KeywordLibName { get; private set; } = null!;

        /// <summary>
        /// Language.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// Language used by the text Library
        /// </summary>
        [Output("language")]
        public Output<string> Language { get; private set; } = null!;

        /// <summary>
        /// The category of the text library in each moderation scenario. Valid values: textKeyword: a text library against which terms in text are matched. similarText: a text library against which text patterns are matched. textKeyword: a text library against which terms extracted from images are matched. voiceText: a text library against which terms converted from audio are matched.
        /// </summary>
        [Output("libType")]
        public Output<string> LibType { get; private set; } = null!;

        /// <summary>
        /// The matching method. Valid values:fuzzy: fuzzy match precise: exact match
        /// </summary>
        [Output("matchMode")]
        public Output<string> MatchMode { get; private set; } = null!;

        /// <summary>
        /// The moderation scenario to which the text library applies. Valid values:TEXT: text anti-spam、IMAGE: ad violation detection、VOICE: audio anti-spam
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;


        /// <summary>
        /// Create a KeywordLib resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KeywordLib(string name, KeywordLibArgs args, CustomResourceOptions? options = null)
            : base("alicloud:aligreen/keywordLib:KeywordLib", name, args ?? new KeywordLibArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KeywordLib(string name, Input<string> id, KeywordLibState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:aligreen/keywordLib:KeywordLib", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KeywordLib resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KeywordLib Get(string name, Input<string> id, KeywordLibState? state = null, CustomResourceOptions? options = null)
        {
            return new KeywordLib(name, id, state, options);
        }
    }

    public sealed class KeywordLibArgs : global::Pulumi.ResourceArgs
    {
        [Input("bizTypes")]
        private InputList<string>? _bizTypes;

        /// <summary>
        /// The business scenario. Example:["bizTypeA","bizTypeB"]
        /// </summary>
        public InputList<string> BizTypes
        {
            get => _bizTypes ?? (_bizTypes = new InputList<string>());
            set => _bizTypes = value;
        }

        /// <summary>
        /// The category of the text library. Valid values: BLACK: a blacklist. WHITE: a whitelist. REVIEW: a review list
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Specifies whether to enable text library.true: Enable the text library. This is the default value.false: Disable the text library.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The name of the keyword library defined by the customer. It can contain no more than 20 characters in Chinese, English, and underscore (_).
        /// </summary>
        [Input("keywordLibName", required: true)]
        public Input<string> KeywordLibName { get; set; } = null!;

        /// <summary>
        /// Language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Language used by the text Library
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The category of the text library in each moderation scenario. Valid values: textKeyword: a text library against which terms in text are matched. similarText: a text library against which text patterns are matched. textKeyword: a text library against which terms extracted from images are matched. voiceText: a text library against which terms converted from audio are matched.
        /// </summary>
        [Input("libType")]
        public Input<string>? LibType { get; set; }

        /// <summary>
        /// The matching method. Valid values:fuzzy: fuzzy match precise: exact match
        /// </summary>
        [Input("matchMode")]
        public Input<string>? MatchMode { get; set; }

        /// <summary>
        /// The moderation scenario to which the text library applies. Valid values:TEXT: text anti-spam、IMAGE: ad violation detection、VOICE: audio anti-spam
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        public KeywordLibArgs()
        {
        }
        public static new KeywordLibArgs Empty => new KeywordLibArgs();
    }

    public sealed class KeywordLibState : global::Pulumi.ResourceArgs
    {
        [Input("bizTypes")]
        private InputList<string>? _bizTypes;

        /// <summary>
        /// The business scenario. Example:["bizTypeA","bizTypeB"]
        /// </summary>
        public InputList<string> BizTypes
        {
            get => _bizTypes ?? (_bizTypes = new InputList<string>());
            set => _bizTypes = value;
        }

        /// <summary>
        /// The category of the text library. Valid values: BLACK: a blacklist. WHITE: a whitelist. REVIEW: a review list
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Specifies whether to enable text library.true: Enable the text library. This is the default value.false: Disable the text library.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The name of the keyword library defined by the customer. It can contain no more than 20 characters in Chinese, English, and underscore (_).
        /// </summary>
        [Input("keywordLibName")]
        public Input<string>? KeywordLibName { get; set; }

        /// <summary>
        /// Language.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// Language used by the text Library
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The category of the text library in each moderation scenario. Valid values: textKeyword: a text library against which terms in text are matched. similarText: a text library against which text patterns are matched. textKeyword: a text library against which terms extracted from images are matched. voiceText: a text library against which terms converted from audio are matched.
        /// </summary>
        [Input("libType")]
        public Input<string>? LibType { get; set; }

        /// <summary>
        /// The matching method. Valid values:fuzzy: fuzzy match precise: exact match
        /// </summary>
        [Input("matchMode")]
        public Input<string>? MatchMode { get; set; }

        /// <summary>
        /// The moderation scenario to which the text library applies. Valid values:TEXT: text anti-spam、IMAGE: ad violation detection、VOICE: audio anti-spam
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        public KeywordLibState()
        {
        }
        public static new KeywordLibState Empty => new KeywordLibState();
    }
}