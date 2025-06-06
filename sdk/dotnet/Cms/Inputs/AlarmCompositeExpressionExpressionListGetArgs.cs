// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class AlarmCompositeExpressionExpressionListGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comparisonOperator")]
        public Input<string>? ComparisonOperator { get; set; }

        /// <summary>
        /// The metric that is used to monitor the cloud service.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// The statistical period of the metric. Unit: seconds. Default value: `300`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// Field `statistics` has been removed from provider version 1.216.0. New field `escalations_critical.statistics` instead.
        /// </summary>
        [Input("statistics")]
        public Input<string>? Statistics { get; set; }

        /// <summary>
        /// Field `threshold` has been removed from provider version 1.216.0. New field `escalations_critical.threshold` instead.
        /// </summary>
        [Input("threshold")]
        public Input<string>? Threshold { get; set; }

        public AlarmCompositeExpressionExpressionListGetArgs()
        {
        }
        public static new AlarmCompositeExpressionExpressionListGetArgs Empty => new AlarmCompositeExpressionExpressionListGetArgs();
    }
}
