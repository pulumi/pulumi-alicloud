// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    /// <summary>
    /// Provides a Resource Manager Auto Grouping Rule resource.
    /// 
    /// Auto grouping rules of resource group.
    /// 
    /// For information about Resource Manager Auto Grouping Rule and how to use it, see [What is Auto Grouping Rule](https://www.alibabacloud.com/help/en/resource-management/resource-group/developer-reference/api-resourcemanager-2020-03-31-createautogroupingrule-rg).
    /// 
    /// &gt; **NOTE:** Available since v1.246.0.
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
    ///     var @default = new AliCloud.ResourceManager.AutoGroupingRule("default", new()
    ///     {
    ///         RuleContents = new[]
    ///         {
    ///             new AliCloud.ResourceManager.Inputs.AutoGroupingRuleRuleContentArgs
    ///             {
    ///                 TargetResourceGroupCondition = @"    {
    ///         ""children"": [
    ///       {
    ///         ""desired"": ""rg-aek*****sbvy"",
    ///         ""featurePath"": ""$.resourceGroupId"",
    ///         ""featureSource"": ""RESOURCE"",
    ///         ""operator"": ""StringEquals""
    ///       }
    ///         ],
    ///         ""operator"": ""and""
    ///     }
    /// ",
    ///                 AutoGroupingScopeCondition = @"    {
    ///         ""children"": [
    ///       {
    ///         ""desired"": ""name_a"",
    ///         ""featurePath"": ""$.resourceName"",
    ///         ""featureSource"": ""RESOURCE"",
    ///         ""operator"": ""StringEqualsAny""
    ///       }
    ///         ],
    ///         ""operator"": ""and""
    ///     }
    /// ",
    ///             },
    ///         },
    ///         RuleDesc = name,
    ///         RuleType = "custom_condition",
    ///         RegionIdsScope = "cn-hangzhou,cn-shanghai",
    ///         ResourceIdsScope = "imock-xxxxxx",
    ///         ResourceGroupIdsScope = "rg-aek22*****3sbvz",
    ///         ResourceTypesScope = "ecs.instance,vpc.vpc",
    ///         RuleName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Resource Manager Auto Grouping Rule can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule")]
    public partial class AutoGroupingRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("excludeRegionIdsScope")]
        public Output<string?> ExcludeRegionIdsScope { get; private set; } = null!;

        /// <summary>
        /// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("excludeResourceGroupIdsScope")]
        public Output<string?> ExcludeResourceGroupIdsScope { get; private set; } = null!;

        /// <summary>
        /// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("excludeResourceIdsScope")]
        public Output<string?> ExcludeResourceIdsScope { get; private set; } = null!;

        /// <summary>
        /// The resource types to be excluded. Separate multiple resource types with commas (,).
        /// </summary>
        [Output("excludeResourceTypesScope")]
        public Output<string?> ExcludeResourceTypesScope { get; private set; } = null!;

        /// <summary>
        /// The IDs of regions. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("regionIdsScope")]
        public Output<string?> RegionIdsScope { get; private set; } = null!;

        /// <summary>
        /// The IDs of resource groups. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("resourceGroupIdsScope")]
        public Output<string?> ResourceGroupIdsScope { get; private set; } = null!;

        /// <summary>
        /// The IDs of resources. Separate multiple IDs with commas (,).
        /// </summary>
        [Output("resourceIdsScope")]
        public Output<string?> ResourceIdsScope { get; private set; } = null!;

        /// <summary>
        /// The resource types. Separate multiple resource types with commas (,).
        /// </summary>
        [Output("resourceTypesScope")]
        public Output<string?> ResourceTypesScope { get; private set; } = null!;

        /// <summary>
        /// The content records of the rule. See `rule_contents` below.
        /// </summary>
        [Output("ruleContents")]
        public Output<ImmutableArray<Outputs.AutoGroupingRuleRuleContent>> RuleContents { get; private set; } = null!;

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Output("ruleDesc")]
        public Output<string?> RuleDesc { get; private set; } = null!;

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Output("ruleName")]
        public Output<string> RuleName { get; private set; } = null!;

        /// <summary>
        /// The type of the rule. Valid values:
        /// </summary>
        [Output("ruleType")]
        public Output<string> RuleType { get; private set; } = null!;


        /// <summary>
        /// Create a AutoGroupingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutoGroupingRule(string name, AutoGroupingRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule", name, args ?? new AutoGroupingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutoGroupingRule(string name, Input<string> id, AutoGroupingRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/autoGroupingRule:AutoGroupingRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AutoGroupingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutoGroupingRule Get(string name, Input<string> id, AutoGroupingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AutoGroupingRule(name, id, state, options);
        }
    }

    public sealed class AutoGroupingRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeRegionIdsScope")]
        public Input<string>? ExcludeRegionIdsScope { get; set; }

        /// <summary>
        /// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeResourceGroupIdsScope")]
        public Input<string>? ExcludeResourceGroupIdsScope { get; set; }

        /// <summary>
        /// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeResourceIdsScope")]
        public Input<string>? ExcludeResourceIdsScope { get; set; }

        /// <summary>
        /// The resource types to be excluded. Separate multiple resource types with commas (,).
        /// </summary>
        [Input("excludeResourceTypesScope")]
        public Input<string>? ExcludeResourceTypesScope { get; set; }

        /// <summary>
        /// The IDs of regions. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("regionIdsScope")]
        public Input<string>? RegionIdsScope { get; set; }

        /// <summary>
        /// The IDs of resource groups. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("resourceGroupIdsScope")]
        public Input<string>? ResourceGroupIdsScope { get; set; }

        /// <summary>
        /// The IDs of resources. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("resourceIdsScope")]
        public Input<string>? ResourceIdsScope { get; set; }

        /// <summary>
        /// The resource types. Separate multiple resource types with commas (,).
        /// </summary>
        [Input("resourceTypesScope")]
        public Input<string>? ResourceTypesScope { get; set; }

        [Input("ruleContents", required: true)]
        private InputList<Inputs.AutoGroupingRuleRuleContentArgs>? _ruleContents;

        /// <summary>
        /// The content records of the rule. See `rule_contents` below.
        /// </summary>
        public InputList<Inputs.AutoGroupingRuleRuleContentArgs> RuleContents
        {
            get => _ruleContents ?? (_ruleContents = new InputList<Inputs.AutoGroupingRuleRuleContentArgs>());
            set => _ruleContents = value;
        }

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Input("ruleDesc")]
        public Input<string>? RuleDesc { get; set; }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        /// <summary>
        /// The type of the rule. Valid values:
        /// </summary>
        [Input("ruleType", required: true)]
        public Input<string> RuleType { get; set; } = null!;

        public AutoGroupingRuleArgs()
        {
        }
        public static new AutoGroupingRuleArgs Empty => new AutoGroupingRuleArgs();
    }

    public sealed class AutoGroupingRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IDs of regions to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeRegionIdsScope")]
        public Input<string>? ExcludeRegionIdsScope { get; set; }

        /// <summary>
        /// The IDs of resource groups to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeResourceGroupIdsScope")]
        public Input<string>? ExcludeResourceGroupIdsScope { get; set; }

        /// <summary>
        /// The IDs of resources to be excluded. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("excludeResourceIdsScope")]
        public Input<string>? ExcludeResourceIdsScope { get; set; }

        /// <summary>
        /// The resource types to be excluded. Separate multiple resource types with commas (,).
        /// </summary>
        [Input("excludeResourceTypesScope")]
        public Input<string>? ExcludeResourceTypesScope { get; set; }

        /// <summary>
        /// The IDs of regions. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("regionIdsScope")]
        public Input<string>? RegionIdsScope { get; set; }

        /// <summary>
        /// The IDs of resource groups. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("resourceGroupIdsScope")]
        public Input<string>? ResourceGroupIdsScope { get; set; }

        /// <summary>
        /// The IDs of resources. Separate multiple IDs with commas (,).
        /// </summary>
        [Input("resourceIdsScope")]
        public Input<string>? ResourceIdsScope { get; set; }

        /// <summary>
        /// The resource types. Separate multiple resource types with commas (,).
        /// </summary>
        [Input("resourceTypesScope")]
        public Input<string>? ResourceTypesScope { get; set; }

        [Input("ruleContents")]
        private InputList<Inputs.AutoGroupingRuleRuleContentGetArgs>? _ruleContents;

        /// <summary>
        /// The content records of the rule. See `rule_contents` below.
        /// </summary>
        public InputList<Inputs.AutoGroupingRuleRuleContentGetArgs> RuleContents
        {
            get => _ruleContents ?? (_ruleContents = new InputList<Inputs.AutoGroupingRuleRuleContentGetArgs>());
            set => _ruleContents = value;
        }

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Input("ruleDesc")]
        public Input<string>? RuleDesc { get; set; }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The type of the rule. Valid values:
        /// </summary>
        [Input("ruleType")]
        public Input<string>? RuleType { get; set; }

        public AutoGroupingRuleState()
        {
        }
        public static new AutoGroupingRuleState Empty => new AutoGroupingRuleState();
    }
}
