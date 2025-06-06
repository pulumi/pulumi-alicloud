// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Outputs
{

    [OutputType]
    public sealed class GetDbInstancePlansPlanPlanConfigPauseResult
    {
        /// <summary>
        /// The executed time of the Plan.
        /// </summary>
        public readonly string ExecuteTime;
        /// <summary>
        /// The Cron Time of the plan.
        /// </summary>
        public readonly string PlanCronTime;
        /// <summary>
        /// The Status of the plan Task.
        /// </summary>
        public readonly string PlanTaskStatus;

        [OutputConstructor]
        private GetDbInstancePlansPlanPlanConfigPauseResult(
            string executeTime,

            string planCronTime,

            string planTaskStatus)
        {
            ExecuteTime = executeTime;
            PlanCronTime = planCronTime;
            PlanTaskStatus = planTaskStatus;
        }
    }
}
