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
    public sealed class GetApplicationScalingRulesRuleScalingRuleTimerResult
    {
        /// <summary>
        /// The short-term start date of the timed elastic scaling strategy.
        /// </summary>
        public readonly string BeginDate;
        /// <summary>
        /// The short-term end date of the timed elastic scaling strategy.
        /// </summary>
        public readonly string EndDate;
        /// <summary>
        /// The period in which a timed elastic scaling strategy is executed.
        /// </summary>
        public readonly string Period;
        /// <summary>
        /// Trigger point in time within a single day.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationScalingRulesRuleScalingRuleTimerScheduleResult> Schedules;

        [OutputConstructor]
        private GetApplicationScalingRulesRuleScalingRuleTimerResult(
            string beginDate,

            string endDate,

            string period,

            ImmutableArray<Outputs.GetApplicationScalingRulesRuleScalingRuleTimerScheduleResult> schedules)
        {
            BeginDate = beginDate;
            EndDate = endDate;
            Period = period;
            Schedules = schedules;
        }
    }
}
