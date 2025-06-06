// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class GetForwardingRulesForwardingRuleRuleConditionResult
    {
        /// <summary>
        /// Domain name configuration information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleConditionHostConfigResult> HostConfigs;
        /// <summary>
        /// Path configuration information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleConditionPathConfigResult> PathConfigs;
        /// <summary>
        /// Forwarding condition type.
        /// </summary>
        public readonly string RuleConditionType;

        [OutputConstructor]
        private GetForwardingRulesForwardingRuleRuleConditionResult(
            ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleConditionHostConfigResult> hostConfigs,

            ImmutableArray<Outputs.GetForwardingRulesForwardingRuleRuleConditionPathConfigResult> pathConfigs,

            string ruleConditionType)
        {
            HostConfigs = hostConfigs;
            PathConfigs = pathConfigs;
            RuleConditionType = ruleConditionType;
        }
    }
}
