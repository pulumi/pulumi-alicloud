// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Inputs
{

    public sealed class ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The comparison operator for this scaling rule specific metrics trigger. Invalid values: `EQ`, `NE`, `GT`, `LT`, `GE`, `LE`.
        /// </summary>
        [Input("comparisonOperator", required: true)]
        public Input<string> ComparisonOperator { get; set; } = null!;

        /// <summary>
        /// The metric name for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The statistics for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("statistics", required: true)]
        public Input<string> Statistics { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTagGetArgs>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The threshold for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        public ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs()
        {
        }
        public static new ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs Empty => new ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs();
    }
}
