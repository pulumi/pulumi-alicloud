// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs.Outputs
{

    [OutputType]
    public sealed class EnterpriseSnapshotPolicySchedule
    {
        /// <summary>
        /// CronTab expression.
        /// </summary>
        public readonly string CronExpression;

        [OutputConstructor]
        private EnterpriseSnapshotPolicySchedule(string cronExpression)
        {
            CronExpression = cronExpression;
        }
    }
}
