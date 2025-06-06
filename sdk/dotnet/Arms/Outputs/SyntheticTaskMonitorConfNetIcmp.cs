// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class SyntheticTaskMonitorConfNetIcmp
    {
        /// <summary>
        /// The interval between TCP connections. The unit is milliseconds (ms), the minimum value is 200, the maximum value is 10000, and the default value is 200.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// Number of ICMP(Ping) packets sent. The minimum value is 1, the maximum value is 50, and the default is 4.
        /// </summary>
        public readonly int? PackageNum;
        /// <summary>
        /// The size of the sent ICMP(Ping) packet. The unit is byte. The ICMP(PING) packet size is limited to 32, 64, 128, 256, 512, 1024, 1080, and 1450.
        /// </summary>
        public readonly int? PackageSize;
        /// <summary>
        /// Whether to split ICMP(Ping) packets. The default is true.
        /// </summary>
        public readonly bool? SplitPackage;
        /// <summary>
        /// The target URL.
        /// </summary>
        public readonly string TargetUrl;
        /// <summary>
        /// TCP dial test timeout. The unit is milliseconds (ms), the minimum value is 1000, the maximum value is 300000, and the default value is 20000.
        /// </summary>
        public readonly int? Timeout;
        /// <summary>
        /// Whether to enable tracert. The default is true.
        /// </summary>
        public readonly bool? TracertEnable;
        /// <summary>
        /// The maximum number of hops for tracert. The minimum value is 1, the maximum value is 128, and the default value is 20.
        /// </summary>
        public readonly int? TracertNumMax;
        /// <summary>
        /// The time-out of tracert. The unit is milliseconds (ms), the minimum value is 1000, the maximum value is 300000, and the default value is 60000.
        /// </summary>
        public readonly int? TracertTimeout;

        [OutputConstructor]
        private SyntheticTaskMonitorConfNetIcmp(
            int? interval,

            int? packageNum,

            int? packageSize,

            bool? splitPackage,

            string targetUrl,

            int? timeout,

            bool? tracertEnable,

            int? tracertNumMax,

            int? tracertTimeout)
        {
            Interval = interval;
            PackageNum = packageNum;
            PackageSize = packageSize;
            SplitPackage = splitPackage;
            TargetUrl = targetUrl;
            Timeout = timeout;
            TracertEnable = tracertEnable;
            TracertNumMax = tracertNumMax;
            TracertTimeout = tracertTimeout;
        }
    }
}
