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
    public sealed class GetAggregateConfigRulesRuleResult
    {
        /// <summary>
        /// The Aliyun User ID.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The config rule name.
        /// </summary>
        public readonly string AggregateConfigRuleName;
        /// <summary>
        /// The ID of aggregator.
        /// </summary>
        public readonly string AggregatorId;
        /// <summary>
        /// The ID of Compliance Package.
        /// </summary>
        public readonly string CompliancePackId;
        /// <summary>
        /// The Compliance information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAggregateConfigRulesRuleComplianceResult> Compliances;
        /// <summary>
        /// The config rule arn.
        /// </summary>
        public readonly string ConfigRuleArn;
        /// <summary>
        /// The ID of the rule.
        /// </summary>
        public readonly string ConfigRuleId;
        /// <summary>
        /// The trigger types of config rules.
        /// </summary>
        public readonly string ConfigRuleTriggerTypes;
        /// <summary>
        /// The description of the rule.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Event source of the Config Rule.
        /// </summary>
        public readonly string EventSource;
        /// <summary>
        /// The id of the resources to be evaluated against the rule.
        /// </summary>
        public readonly string ExcludeResourceIdsScope;
        /// <summary>
        /// The ID of the Aggregate Config Rule.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The settings of the input parameters for the rule.
        /// </summary>
        public readonly ImmutableDictionary<string, string> InputParameters;
        /// <summary>
        /// The frequency of the compliance evaluations.
        /// </summary>
        public readonly string MaximumExecutionFrequency;
        /// <summary>
        /// The timestamp when the rule was last modified.
        /// </summary>
        public readonly string ModifiedTimestamp;
        /// <summary>
        /// The scope of resource region ids.
        /// </summary>
        public readonly string RegionIdsScope;
        /// <summary>
        /// The scope of resource group ids.
        /// </summary>
        public readonly string ResourceGroupIdsScope;
        /// <summary>
        /// The types of resources evaluated by the rule.
        /// </summary>
        public readonly ImmutableArray<string> ResourceTypesScopes;
        /// <summary>
        /// The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
        /// </summary>
        public readonly int RiskLevel;
        /// <summary>
        /// The identifier of the managed rule or the arn of the custom function.
        /// </summary>
        public readonly string SourceIdentifier;
        /// <summary>
        /// The source owner of the Config Rule.
        /// </summary>
        public readonly string SourceOwner;
        /// <summary>
        /// The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The scope of tay key.
        /// </summary>
        public readonly string TagKeyScope;
        /// <summary>
        /// The scope of tay value.
        /// </summary>
        public readonly string TagValueScope;

        [OutputConstructor]
        private GetAggregateConfigRulesRuleResult(
            string accountId,

            string aggregateConfigRuleName,

            string aggregatorId,

            string compliancePackId,

            ImmutableArray<Outputs.GetAggregateConfigRulesRuleComplianceResult> compliances,

            string configRuleArn,

            string configRuleId,

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

            string sourceIdentifier,

            string sourceOwner,

            string status,

            string tagKeyScope,

            string tagValueScope)
        {
            AccountId = accountId;
            AggregateConfigRuleName = aggregateConfigRuleName;
            AggregatorId = aggregatorId;
            CompliancePackId = compliancePackId;
            Compliances = compliances;
            ConfigRuleArn = configRuleArn;
            ConfigRuleId = configRuleId;
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
            SourceIdentifier = sourceIdentifier;
            SourceOwner = sourceOwner;
            Status = status;
            TagKeyScope = tagKeyScope;
            TagValueScope = tagValueScope;
        }
    }
}
