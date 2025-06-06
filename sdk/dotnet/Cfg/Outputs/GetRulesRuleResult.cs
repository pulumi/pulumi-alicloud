// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Outputs
{

    [OutputType]
    public sealed class GetRulesRuleResult
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The compliance package ID.
        /// </summary>
        public readonly string CompliancePackId;
        /// <summary>
        /// The information about the compliance evaluations based on the rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRulesRuleComplianceResult> Compliances;
        /// <summary>
        /// The ARN of the Config Rule.
        /// </summary>
        public readonly string ConfigRuleArn;
        /// <summary>
        /// The ID of the Config Rule.
        /// </summary>
        public readonly string ConfigRuleId;
        /// <summary>
        /// Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
        /// </summary>
        public readonly string ConfigRuleState;
        /// <summary>
        /// (Available since v1.124.1) A list of trigger types of config rule.
        /// </summary>
        public readonly string ConfigRuleTriggerTypes;
        /// <summary>
        /// The description of the Config Rule.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Event source of the Config Rule.
        /// </summary>
        public readonly string EventSource;
        /// <summary>
        /// (Available since v1.124.1) The scope of exclude of resource ids.
        /// </summary>
        public readonly string ExcludeResourceIdsScope;
        /// <summary>
        /// The ID of the Config Rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The input parameters of the Config Rule.
        /// </summary>
        public readonly ImmutableDictionary<string, string> InputParameters;
        /// <summary>
        /// (Available since v1.124.1) The frequency of maximum execution.
        /// </summary>
        public readonly string MaximumExecutionFrequency;
        /// <summary>
        /// the timestamp of the Config Rule modified.
        /// </summary>
        public readonly string ModifiedTimestamp;
        /// <summary>
        /// (Available since v1.124.1) The scope of region ids.
        /// </summary>
        public readonly string RegionIdsScope;
        /// <summary>
        /// (Available since v1.124.1) The scope of resource group ids.
        /// </summary>
        public readonly string ResourceGroupIdsScope;
        /// <summary>
        /// (Available since v1.124.1) The scope of resource types.
        /// </summary>
        public readonly ImmutableArray<string> ResourceTypesScopes;
        /// <summary>
        /// The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        public readonly int RiskLevel;
        /// <summary>
        /// The name of config rule.
        /// </summary>
        public readonly string RuleName;
        /// <summary>
        /// The types of the resources to be evaluated against the rule.
        /// </summary>
        public readonly ImmutableArray<string> ScopeComplianceResourceTypes;
        /// <summary>
        /// Rule trigger mechanism.
        /// </summary>
        public readonly string SourceDetailMessageType;
        /// <summary>
        /// The identifier of the managed rule or the arn of the custom function.
        /// </summary>
        public readonly string SourceIdentifier;
        /// <summary>
        /// Rule execution cycle.
        /// </summary>
        public readonly string SourceMaximumExecutionFrequency;
        /// <summary>
        /// The source owner of the Config Rule.
        /// </summary>
        public readonly string SourceOwner;
        /// <summary>
        /// The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// (Available since v1.124.1) The scope of tag key.
        /// </summary>
        public readonly string TagKeyScope;
        /// <summary>
        /// (Available since v1.124.1) The scope of tag value.
        /// </summary>
        public readonly string TagValueScope;

        [OutputConstructor]
        private GetRulesRuleResult(
            string accountId,

            string compliancePackId,

            ImmutableArray<Outputs.GetRulesRuleComplianceResult> compliances,

            string configRuleArn,

            string configRuleId,

            string configRuleState,

            string configRuleTriggerTypes,

            string description,

            string eventSource,

            string excludeResourceIdsScope,

            string id,

            ImmutableDictionary<string, string> inputParameters,

            string maximumExecutionFrequency,

            string modifiedTimestamp,

            string regionIdsScope,

            string resourceGroupIdsScope,

            ImmutableArray<string> resourceTypesScopes,

            int riskLevel,

            string ruleName,

            ImmutableArray<string> scopeComplianceResourceTypes,

            string sourceDetailMessageType,

            string sourceIdentifier,

            string sourceMaximumExecutionFrequency,

            string sourceOwner,

            string status,

            string tagKeyScope,

            string tagValueScope)
        {
            AccountId = accountId;
            CompliancePackId = compliancePackId;
            Compliances = compliances;
            ConfigRuleArn = configRuleArn;
            ConfigRuleId = configRuleId;
            ConfigRuleState = configRuleState;
            ConfigRuleTriggerTypes = configRuleTriggerTypes;
            Description = description;
            EventSource = eventSource;
            ExcludeResourceIdsScope = excludeResourceIdsScope;
            Id = id;
            InputParameters = inputParameters;
            MaximumExecutionFrequency = maximumExecutionFrequency;
            ModifiedTimestamp = modifiedTimestamp;
            RegionIdsScope = regionIdsScope;
            ResourceGroupIdsScope = resourceGroupIdsScope;
            ResourceTypesScopes = resourceTypesScopes;
            RiskLevel = riskLevel;
            RuleName = ruleName;
            ScopeComplianceResourceTypes = scopeComplianceResourceTypes;
            SourceDetailMessageType = sourceDetailMessageType;
            SourceIdentifier = sourceIdentifier;
            SourceMaximumExecutionFrequency = sourceMaximumExecutionFrequency;
            SourceOwner = sourceOwner;
            Status = status;
            TagKeyScope = tagKeyScope;
            TagValueScope = tagValueScope;
        }
    }
}
