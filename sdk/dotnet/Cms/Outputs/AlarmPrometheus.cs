// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class AlarmPrometheus
    {
        /// <summary>
        /// The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Annotations;
        /// <summary>
        /// The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
        /// </summary>
        public readonly string? Level;
        /// <summary>
        /// The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
        /// </summary>
        public readonly string? PromQl;
        /// <summary>
        /// The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
        /// </summary>
        public readonly int? Times;

        [OutputConstructor]
        private AlarmPrometheus(
            ImmutableDictionary<string, object>? annotations,

            string? level,

            string? promQl,

            int? times)
        {
            Annotations = annotations;
            Level = level;
            PromQl = promQl;
            Times = times;
        }
    }
}