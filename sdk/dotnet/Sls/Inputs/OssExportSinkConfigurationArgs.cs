// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Inputs
{

    public sealed class OssExportSinkConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The beginning of the time range to ship data. The value 1 specifies that the data shipping job ships data from the first log in the Logstore. Example value: 1718380800
        /// </summary>
        [Input("fromTime", required: true)]
        public Input<int> FromTime { get; set; } = null!;

        /// <summary>
        /// The name of the Logstore.
        /// </summary>
        [Input("logstore", required: true)]
        public Input<string> Logstore { get; set; } = null!;

        /// <summary>
        /// The ARN of the RAM role that is used to write data to OSS. Example value: acs:ram::xxxxxxx
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// The configurations of the Object Storage Service (OSS) data shipping job. See `sink` below.
        /// </summary>
        [Input("sink", required: true)]
        public Input<Inputs.OssExportSinkConfigurationSinkArgs> Sink { get; set; } = null!;

        /// <summary>
        /// The end of the time range to ship data. The value 0 specifies that the data shipping job continuously ships data until the job is manually stopped. Example value: 1718380800
        /// </summary>
        [Input("toTime", required: true)]
        public Input<int> ToTime { get; set; } = null!;

        public OssExportSinkConfigurationArgs()
        {
        }
        public static new OssExportSinkConfigurationArgs Empty => new OssExportSinkConfigurationArgs();
    }
}
