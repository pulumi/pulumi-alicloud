// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Outputs
{

    [OutputType]
    public sealed class GetCustomLinesLineIpSegmentListResult
    {
        /// <summary>
        /// The end IP address of the CIDR block.
        /// </summary>
        public readonly string EndIp;
        /// <summary>
        /// The start IP address of the CIDR block.
        /// </summary>
        public readonly string StartIp;

        [OutputConstructor]
        private GetCustomLinesLineIpSegmentListResult(
            string endIp,

            string startIp)
        {
            EndIp = endIp;
            StartIp = startIp;
        }
    }
}
