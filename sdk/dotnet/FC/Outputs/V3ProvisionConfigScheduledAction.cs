// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V3ProvisionConfigScheduledAction
    {
        /// <summary>
        /// Policy expiration time.
        /// </summary>
        public readonly string? EndTime;
        /// <summary>
        /// Policy Name.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Timing Configuration.
        /// </summary>
        public readonly string? ScheduleExpression;
        /// <summary>
        /// Policy effective time.
        /// </summary>
        public readonly string? StartTime;
        /// <summary>
        /// Number of reserved target resources.
        /// </summary>
        public readonly int? Target;
        /// <summary>
        /// Time zone.
        /// </summary>
        public readonly string? TimeZone;

        [OutputConstructor]
        private V3ProvisionConfigScheduledAction(
            string? endTime,

            string? name,

            string? scheduleExpression,

            string? startTime,

            int? target,

            string? timeZone)
        {
            EndTime = endTime;
            Name = name;
            ScheduleExpression = scheduleExpression;
            StartTime = startTime;
            Target = target;
            TimeZone = timeZone;
        }
    }
}