// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerCondition
    {
        /// <summary>
        /// The comparison operator for this scaling rule specific metrics trigger. Invalid values: `EQ`, `NE`, `GT`, `LT`, `GE`, `LE`.
        /// </summary>
        public readonly string ComparisonOperator;
        /// <summary>
        /// The metric name for this scaling rule specific metrics trigger.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// The statistics for this scaling rule specific metrics trigger.
        /// </summary>
        public readonly string Statistics;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTag> Tags;
        /// <summary>
        /// The threshold for this scaling rule specific metrics trigger.
        /// </summary>
        public readonly double Threshold;

        [OutputConstructor]
        private ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerCondition(
            string comparisonOperator,

            string metricName,

            string statistics,

            ImmutableArray<Outputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTag> tags,

            double threshold)
        {
            ComparisonOperator = comparisonOperator;
            MetricName = metricName;
            Statistics = statistics;
            Tags = tags;
            Threshold = threshold;
        }
    }
}