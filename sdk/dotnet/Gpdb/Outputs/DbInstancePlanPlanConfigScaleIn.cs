// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Outputs
{

    [OutputType]
    public sealed class DbInstancePlanPlanConfigScaleIn
    {
        public readonly string? ExecuteTime;
        public readonly string? PlanCronTime;
        public readonly string? SegmentNodeNum;

        [OutputConstructor]
        private DbInstancePlanPlanConfigScaleIn(
            string? executeTime,

            string? planCronTime,

            string? segmentNodeNum)
        {
            ExecuteTime = executeTime;
            PlanCronTime = planCronTime;
            SegmentNodeNum = segmentNodeNum;
        }
    }
}