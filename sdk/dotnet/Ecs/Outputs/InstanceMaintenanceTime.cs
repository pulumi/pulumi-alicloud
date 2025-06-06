// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class InstanceMaintenanceTime
    {
        /// <summary>
        /// The end time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
        /// </summary>
        public readonly string? EndTime;
        /// <summary>
        /// The start time of maintenance. The time must be on the hour at exactly 0 minute and 0 second. The `start_time` and `end_time` parameters must be specified at the same time. The `end_time` value must be 1 to 23 hours later than the `start_time` value. Specify the time in the HH:mm:ss format. The time must be in UTC+8.
        /// </summary>
        public readonly string? StartTime;

        [OutputConstructor]
        private InstanceMaintenanceTime(
            string? endTime,

            string? startTime)
        {
            EndTime = endTime;
            StartTime = startTime;
        }
    }
}
