// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class AlarmExpression
    {
        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
        /// </summary>
        public readonly string? ComparisonOperator;
        /// <summary>
        /// The name for the alarm's associated metric. See `dimensions` below for details.
        /// </summary>
        public readonly string? MetricName;
        /// <summary>
        /// The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
        /// </summary>
        public readonly int? Period;
        /// <summary>
        /// The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
        /// </summary>
        public readonly string? Statistics;
        /// <summary>
        /// The value against which the specified statistics is compared.
        /// </summary>
        public readonly double? Threshold;

        [OutputConstructor]
        private AlarmExpression(
            string? comparisonOperator,

            string? metricName,

            int? period,

            string? statistics,

            double? threshold)
        {
            ComparisonOperator = comparisonOperator;
            MetricName = metricName;
            Period = period;
            Statistics = statistics;
            Threshold = threshold;
        }
    }
}