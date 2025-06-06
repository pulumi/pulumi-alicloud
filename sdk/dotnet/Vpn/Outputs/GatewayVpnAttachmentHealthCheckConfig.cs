// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class GatewayVpnAttachmentHealthCheckConfig
    {
        /// <summary>
        /// Target IP.
        /// </summary>
        public readonly string? Dip;
        /// <summary>
        /// Whether health check is enabled:-`false`: not enabled. - `true`: enabled.
        /// </summary>
        public readonly bool? Enable;
        /// <summary>
        /// The health check retry interval, in seconds.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// Whether to revoke the published route when the health check fails
        /// </summary>
        public readonly string? Policy;
        /// <summary>
        /// Number of retries for health check.
        /// </summary>
        public readonly int? Retry;
        /// <summary>
        /// SOURCE IP.
        /// </summary>
        public readonly string? Sip;
        /// <summary>
        /// The negotiation status of Tunnel.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GatewayVpnAttachmentHealthCheckConfig(
            string? dip,

            bool? enable,

            int? interval,

            string? policy,

            int? retry,

            string? sip,

            string? status)
        {
            Dip = dip;
            Enable = enable;
            Interval = interval;
            Policy = policy;
            Retry = retry;
            Sip = sip;
            Status = status;
        }
    }
}
