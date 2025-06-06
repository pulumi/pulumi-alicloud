// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class AlarmEscalationsCritical
    {
        /// <summary>
        /// Critical level alarm comparison operator. Default value: `&gt;`. Valid values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `!=`, `==`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`. **NOTE:** From version 1.231.0, `comparison_operator` can be set to `==`.
        /// </summary>
        public readonly string? ComparisonOperator;
        /// <summary>
        /// Critical level alarm statistics method. It must be consistent with that defined for metrics. For more information, see [How to use it](https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs).
        /// </summary>
        public readonly string? Statistics;
        /// <summary>
        /// Critical level alarm threshold value, which must be a numeric value currently.
        /// </summary>
        public readonly string? Threshold;
        /// <summary>
        /// Critical level alarm retry times. Default value: `3`.
        /// </summary>
        public readonly int? Times;

        [OutputConstructor]
        private AlarmEscalationsCritical(
            string? comparisonOperator,

            string? statistics,

            string? threshold,

            int? times)
        {
            ComparisonOperator = comparisonOperator;
            Statistics = statistics;
            Threshold = threshold;
            Times = times;
        }
    }
}
