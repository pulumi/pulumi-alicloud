// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Inputs
{

    public sealed class ForwardingRuleRuleActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Forwarding configuration. See `forward_group_config` below.
        /// &gt; **NOTE:** From version 1.207.0, We recommend that you do not use `forward_group_config`, and we recommend that you use the `rule_action_type` and `rule_action_value` to configure forwarding actions.
        /// </summary>
        [Input("forwardGroupConfig")]
        public Input<Inputs.ForwardingRuleRuleActionForwardGroupConfigGetArgs>? ForwardGroupConfig { get; set; }

        /// <summary>
        /// Forwarding priority.
        /// </summary>
        [Input("order", required: true)]
        public Input<int> Order { get; set; } = null!;

        /// <summary>
        /// The type of the forwarding action. Valid values: `ForwardGroup`, `Redirect`, `FixResponse`, `Rewrite`, `AddHeader`, `RemoveHeader`, `Drop`.
        /// </summary>
        [Input("ruleActionType", required: true)]
        public Input<string> RuleActionType { get; set; } = null!;

        /// <summary>
        /// The value of the forwarding action type. For more information, see [How to use it](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createforwardingrules).
        /// </summary>
        [Input("ruleActionValue")]
        public Input<string>? RuleActionValue { get; set; }

        public ForwardingRuleRuleActionGetArgs()
        {
        }
        public static new ForwardingRuleRuleActionGetArgs Empty => new ForwardingRuleRuleActionGetArgs();
    }
}
