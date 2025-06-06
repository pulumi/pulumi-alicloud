// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetricResult
    {
        /// <summary>
        /// The name of the trigger condition.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The percentage value of the monitoring indicator elasticity that triggers the shrinkage condition next time.
        /// </summary>
        public readonly int NextScaleInAverageUtilization;
        /// <summary>
        /// The percentage value of the monitoring indicator elasticity that triggers the expansion condition next time.
        /// </summary>
        public readonly int NextScaleOutAverageUtilization;

        [OutputConstructor]
        private GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetricResult(
            string name,

            int nextScaleInAverageUtilization,

            int nextScaleOutAverageUtilization)
        {
            Name = name;
            NextScaleInAverageUtilization = nextScaleInAverageUtilization;
            NextScaleOutAverageUtilization = nextScaleOutAverageUtilization;
        }
    }
}
