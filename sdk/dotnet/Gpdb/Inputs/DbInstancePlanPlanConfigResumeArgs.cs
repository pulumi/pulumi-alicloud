// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Inputs
{

    public sealed class DbInstancePlanPlanConfigResumeArgs : global::Pulumi.ResourceArgs
    {
        [Input("executeTime")]
        public Input<string>? ExecuteTime { get; set; }

        [Input("planCronTime")]
        public Input<string>? PlanCronTime { get; set; }

        public DbInstancePlanPlanConfigResumeArgs()
        {
        }
        public static new DbInstancePlanPlanConfigResumeArgs Empty => new DbInstancePlanPlanConfigResumeArgs();
    }
}