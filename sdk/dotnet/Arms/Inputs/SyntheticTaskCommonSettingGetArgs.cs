// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class SyntheticTaskCommonSettingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom host. See `custom_host` below.
        /// </summary>
        [Input("customHost")]
        public Input<Inputs.SyntheticTaskCommonSettingCustomHostGetArgs>? CustomHost { get; set; }

        /// <summary>
        /// IpType.
        /// </summary>
        [Input("ipType")]
        public Input<int>? IpType { get; set; }

        /// <summary>
        /// Whether to enable link tracking.
        /// </summary>
        [Input("isOpenTrace")]
        public Input<bool>? IsOpenTrace { get; set; }

        /// <summary>
        /// Whether the monitoring samples are evenly distributed:
        /// - 0: No
        /// 1: Yes.
        /// </summary>
        [Input("monitorSamples")]
        public Input<int>? MonitorSamples { get; set; }

        /// <summary>
        /// Link trace client type:
        /// - 0:ARMS Agent
        /// - 1:OpenTelemetry
        /// - 2:Jaeger.
        /// </summary>
        [Input("traceClientType")]
        public Input<int>? TraceClientType { get; set; }

        /// <summary>
        /// The link data is reported to the region.
        /// </summary>
        [Input("xtraceRegion")]
        public Input<string>? XtraceRegion { get; set; }

        public SyntheticTaskCommonSettingGetArgs()
        {
        }
        public static new SyntheticTaskCommonSettingGetArgs Empty => new SyntheticTaskCommonSettingGetArgs();
    }
}
