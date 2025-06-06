// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleConditionQueryStringConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("values")]
        private InputList<Inputs.RuleRuleConditionQueryStringConfigValueGetArgs>? _values;

        /// <summary>
        /// Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
        /// </summary>
        public InputList<Inputs.RuleRuleConditionQueryStringConfigValueGetArgs> Values
        {
            get => _values ?? (_values = new InputList<Inputs.RuleRuleConditionQueryStringConfigValueGetArgs>());
            set => _values = value;
        }

        public RuleRuleConditionQueryStringConfigGetArgs()
        {
        }
        public static new RuleRuleConditionQueryStringConfigGetArgs Empty => new RuleRuleConditionQueryStringConfigGetArgs();
    }
}
