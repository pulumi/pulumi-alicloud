// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Inputs
{

    public sealed class ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The condition logic operator for this scaling rule specific metrics trigger. Valid values: `And` and `Or`.
        /// </summary>
        [Input("conditionLogicOperator")]
        public Input<string>? ConditionLogicOperator { get; set; }

        [Input("conditions")]
        private InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs>? _conditions;

        /// <summary>
        /// The conditions for this scaling rule specific metrics trigger. See `conditions` below.
        /// </summary>
        public InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionGetArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// The time of cool down interval for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("coolDownInterval")]
        public Input<int>? CoolDownInterval { get; set; }

        /// <summary>
        /// The evaluation count for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("evaluationCount", required: true)]
        public Input<int> EvaluationCount { get; set; } = null!;

        [Input("timeConstraints")]
        private InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerTimeConstraintGetArgs>? _timeConstraints;

        /// <summary>
        /// The time constraints for this scaling rule specific metrics trigger. See `time_constraints` below.
        /// </summary>
        public InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerTimeConstraintGetArgs> TimeConstraints
        {
            get => _timeConstraints ?? (_timeConstraints = new InputList<Inputs.ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerTimeConstraintGetArgs>());
            set => _timeConstraints = value;
        }

        /// <summary>
        /// The time window for this scaling rule specific metrics trigger.
        /// </summary>
        [Input("timeWindow", required: true)]
        public Input<int> TimeWindow { get; set; } = null!;

        public ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerGetArgs()
        {
        }
        public static new ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerGetArgs Empty => new ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerGetArgs();
    }
}
