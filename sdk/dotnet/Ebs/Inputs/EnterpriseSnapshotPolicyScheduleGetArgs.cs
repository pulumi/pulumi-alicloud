// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs.Inputs
{

    public sealed class EnterpriseSnapshotPolicyScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CronTab expression.
        /// </summary>
        [Input("cronExpression", required: true)]
        public Input<string> CronExpression { get; set; } = null!;

        public EnterpriseSnapshotPolicyScheduleGetArgs()
        {
        }
        public static new EnterpriseSnapshotPolicyScheduleGetArgs Empty => new EnterpriseSnapshotPolicyScheduleGetArgs();
    }
}