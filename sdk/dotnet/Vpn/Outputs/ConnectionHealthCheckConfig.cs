// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class ConnectionHealthCheckConfig
    {
        /// <summary>
        /// Destination IP.
        /// </summary>
        public readonly string? Dip;
        /// <summary>
        /// Specifies whether to enable healthcheck.
        /// </summary>
        public readonly bool? Enable;
        /// <summary>
        /// Retry interval.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// retry times.
        /// </summary>
        public readonly int? Retry;
        /// <summary>
        /// Source IP.
        /// </summary>
        public readonly string? Sip;

        [OutputConstructor]
        private ConnectionHealthCheckConfig(
            string? dip,

            bool? enable,

            int? interval,

            int? retry,

            string? sip)
        {
            Dip = dip;
            Enable = enable;
            Interval = interval;
            Retry = retry;
            Sip = sip;
        }
    }
}
