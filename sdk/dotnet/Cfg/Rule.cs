// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    /// <summary>
    /// Provides a a Alicloud Config Rule resource. Cloud Config checks the validity of resources based on rules. You can create rules to evaluate resources as needed.
    /// For information about Alicloud Config Rule and how to use it, see [What is Alicloud Config Rule](https://www.alibabacloud.com/help/en/doc-detail/127388.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.99.0+.
    /// 
    /// &gt; **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-northeast-1`.
    /// 
    /// &gt; **NOTE:** If you use custom rules, you need to create your own rule functions in advance. Please refer to the link for [Create a custom rule.](https://www.alibabacloud.com/help/en/doc-detail/127405.htm)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Audit ECS instances under VPC using preset rules
    ///         var example = new AliCloud.Cfg.Rule("example", new AliCloud.Cfg.RuleArgs
    ///         {
    ///             Description = "ecs instances in vpc",
    ///             InputParameters = 
    ///             {
    ///                 { "vpcIds", "vpc-uf6gksw4ctjd******" },
    ///             },
    ///             RiskLevel = 1,
    ///             RuleName = "instances-in-vpc",
    ///             ScopeComplianceResourceId = "i-uf6j6rl141ps******",
    ///             ScopeComplianceResourceTypes = 
    ///             {
    ///                 "ACS::ECS::Instance",
    ///             },
    ///             SourceDetailMessageType = "ConfigurationItemChangeNotification",
    ///             SourceIdentifier = "ecs-instances-in-vpc",
    ///             SourceMaximumExecutionFrequency = "Twelve_Hours",
    ///             SourceOwner = "ALIYUN",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Rule : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the Config Rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Threshold value for managed rule triggering.
        /// </summary>
        [Output("inputParameters")]
        public Output<ImmutableDictionary<string, object>?> InputParameters { get; private set; } = null!;

        /// <summary>
        /// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multi_account` is set to true, this parameter is valid.
        /// </summary>
        [Output("memberId")]
        public Output<int?> MemberId { get; private set; } = null!;

        /// <summary>
        /// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
        /// </summary>
        [Output("multiAccount")]
        public Output<bool?> MultiAccount { get; private set; } = null!;

        /// <summary>
        /// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        [Output("riskLevel")]
        public Output<int> RiskLevel { get; private set; } = null!;

        /// <summary>
        /// The name of the Config Rule.
        /// </summary>
        [Output("ruleName")]
        public Output<string> RuleName { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource to be evaluated. If not set, all resources are evaluated.
        /// </summary>
        [Output("scopeComplianceResourceId")]
        public Output<string?> ScopeComplianceResourceId { get; private set; } = null!;

        /// <summary>
        /// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
        /// </summary>
        [Output("scopeComplianceResourceTypes")]
        public Output<ImmutableArray<string>> ScopeComplianceResourceTypes { get; private set; } = null!;

        /// <summary>
        /// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
        /// </summary>
        [Output("sourceDetailMessageType")]
        public Output<string> SourceDetailMessageType { get; private set; } = null!;

        /// <summary>
        /// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
        /// </summary>
        [Output("sourceIdentifier")]
        public Output<string> SourceIdentifier { get; private set; } = null!;

        /// <summary>
        /// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
        /// </summary>
        [Output("sourceMaximumExecutionFrequency")]
        public Output<string?> SourceMaximumExecutionFrequency { get; private set; } = null!;

        /// <summary>
        /// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
        /// </summary>
        [Output("sourceOwner")]
        public Output<string> SourceOwner { get; private set; } = null!;


        /// <summary>
        /// Create a Rule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rule(string name, RuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cfg/rule:Rule", name, args ?? new RuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rule(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cfg/rule:Rule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rule Get(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
        {
            return new Rule(name, id, state, options);
        }
    }

    public sealed class RuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Config Rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("inputParameters")]
        private InputMap<object>? _inputParameters;

        /// <summary>
        /// Threshold value for managed rule triggering.
        /// </summary>
        public InputMap<object> InputParameters
        {
            get => _inputParameters ?? (_inputParameters = new InputMap<object>());
            set => _inputParameters = value;
        }

        /// <summary>
        /// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multi_account` is set to true, this parameter is valid.
        /// </summary>
        [Input("memberId")]
        public Input<int>? MemberId { get; set; }

        /// <summary>
        /// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
        /// </summary>
        [Input("multiAccount")]
        public Input<bool>? MultiAccount { get; set; }

        /// <summary>
        /// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        [Input("riskLevel", required: true)]
        public Input<int> RiskLevel { get; set; } = null!;

        /// <summary>
        /// The name of the Config Rule.
        /// </summary>
        [Input("ruleName", required: true)]
        public Input<string> RuleName { get; set; } = null!;

        /// <summary>
        /// The ID of the resource to be evaluated. If not set, all resources are evaluated.
        /// </summary>
        [Input("scopeComplianceResourceId")]
        public Input<string>? ScopeComplianceResourceId { get; set; }

        [Input("scopeComplianceResourceTypes", required: true)]
        private InputList<string>? _scopeComplianceResourceTypes;

        /// <summary>
        /// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
        /// </summary>
        public InputList<string> ScopeComplianceResourceTypes
        {
            get => _scopeComplianceResourceTypes ?? (_scopeComplianceResourceTypes = new InputList<string>());
            set => _scopeComplianceResourceTypes = value;
        }

        /// <summary>
        /// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
        /// </summary>
        [Input("sourceDetailMessageType", required: true)]
        public Input<string> SourceDetailMessageType { get; set; } = null!;

        /// <summary>
        /// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
        /// </summary>
        [Input("sourceIdentifier", required: true)]
        public Input<string> SourceIdentifier { get; set; } = null!;

        /// <summary>
        /// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
        /// </summary>
        [Input("sourceMaximumExecutionFrequency")]
        public Input<string>? SourceMaximumExecutionFrequency { get; set; }

        /// <summary>
        /// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
        /// </summary>
        [Input("sourceOwner", required: true)]
        public Input<string> SourceOwner { get; set; } = null!;

        public RuleArgs()
        {
        }
    }

    public sealed class RuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the Config Rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("inputParameters")]
        private InputMap<object>? _inputParameters;

        /// <summary>
        /// Threshold value for managed rule triggering.
        /// </summary>
        public InputMap<object> InputParameters
        {
            get => _inputParameters ?? (_inputParameters = new InputMap<object>());
            set => _inputParameters = value;
        }

        /// <summary>
        /// The ID of the member account to which the rule to be created or modified belongs. The default is empty. When `multi_account` is set to true, this parameter is valid.
        /// </summary>
        [Input("memberId")]
        public Input<int>? MemberId { get; set; }

        /// <summary>
        /// Whether the enterprise management account is a member account to create or modify rules. Valid values: `true`: Enterprise management accounts create or modify rules for all member accounts in the resource directory. `false`:The enterprise management account creates or modifies rules for this account. Default value is `false`.
        /// </summary>
        [Input("multiAccount")]
        public Input<bool>? MultiAccount { get; set; }

        /// <summary>
        /// The risk level of the Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        [Input("riskLevel")]
        public Input<int>? RiskLevel { get; set; }

        /// <summary>
        /// The name of the Config Rule.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The ID of the resource to be evaluated. If not set, all resources are evaluated.
        /// </summary>
        [Input("scopeComplianceResourceId")]
        public Input<string>? ScopeComplianceResourceId { get; set; }

        [Input("scopeComplianceResourceTypes")]
        private InputList<string>? _scopeComplianceResourceTypes;

        /// <summary>
        /// Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
        /// </summary>
        public InputList<string> ScopeComplianceResourceTypes
        {
            get => _scopeComplianceResourceTypes ?? (_scopeComplianceResourceTypes = new InputList<string>());
            set => _scopeComplianceResourceTypes = value;
        }

        /// <summary>
        /// Trigger mechanism of rules. Valid values: `ConfigurationItemChangeNotification`,`OversizedConfigurationItemChangeNotification` and `ScheduledNotification`.
        /// </summary>
        [Input("sourceDetailMessageType")]
        public Input<string>? SourceDetailMessageType { get; set; }

        /// <summary>
        /// The name of the custom rule or managed rules. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
        /// </summary>
        [Input("sourceIdentifier")]
        public Input<string>? SourceIdentifier { get; set; }

        /// <summary>
        /// Rule execution cycle. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours` and `TwentyFour_Hours`.
        /// </summary>
        [Input("sourceMaximumExecutionFrequency")]
        public Input<string>? SourceMaximumExecutionFrequency { get; set; }

        /// <summary>
        /// The source owner of the Config Rule. Values: `CUSTOM_FC`: Custom rules, `ALIYUN`: Trusteeship rules.
        /// </summary>
        [Input("sourceOwner")]
        public Input<string>? SourceOwner { get; set; }

        public RuleState()
        {
        }
    }
}