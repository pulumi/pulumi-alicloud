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
    public sealed class GetHybridMonitorDatasDataResult
    {
        /// <summary>
        /// The label of the time dimension.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHybridMonitorDatasDataLabelResult> Labels;
        /// <summary>
        /// The name of the monitoring indicator.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// The metric values that are collected at different timestamps.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHybridMonitorDatasDataValueResult> Values;

        [OutputConstructor]
        private GetHybridMonitorDatasDataResult(
            ImmutableArray<Outputs.GetHybridMonitorDatasDataLabelResult> labels,

            string metricName,

            ImmutableArray<Outputs.GetHybridMonitorDatasDataValueResult> values)
        {
            Labels = labels;
            MetricName = metricName;
            Values = values;
        }
    }
}
