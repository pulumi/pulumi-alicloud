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
    public sealed class ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTag
    {
        /// <summary>
        /// The tag key for this scaling rule specific metrics trigger.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The tag value for this scaling rule specific metrics trigger.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private ClusterNodeGroupAutoScalingPolicyScalingRuleMetricsTriggerConditionTag(
            string key,

            string? value)
        {
            Key = key;
            Value = value;
        }
    }
}