// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Outputs
{

    [OutputType]
    public sealed class RocketMQInstanceNetworkInfoInternetInfo
    {
        /// <summary>
        /// Public network bandwidth specification. Unit: Mb/s.  This field should only be filled when the public network billing type is set to payByBandwidth.  The value range is [1 - 1000].
        /// </summary>
        public readonly int? FlowOutBandwidth;
        /// <summary>
        /// Public network billing type.  Parameter values are as follows:
        /// - payByBandwidth: Fixed bandwidth billing. This parameter must be set to the value when public network access is enabled.
        /// - uninvolved: Not involved. This parameter must be set to the value when public network access is disabled.
        /// </summary>
        public readonly string FlowOutType;
        /// <summary>
        /// Whether to enable public network access.  The parameter values are as follows:
        /// - enable: Enable public network access
        /// - disable: Disable public network access   Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee).
        /// </summary>
        public readonly string InternetSpec;
        /// <summary>
        /// Field `ip_whitelist` has been deprecated from provider version 1.245.0. New field `ip_whitelists` instead.
        /// </summary>
        public readonly ImmutableArray<string> IpWhitelists;

        [OutputConstructor]
        private RocketMQInstanceNetworkInfoInternetInfo(
            int? flowOutBandwidth,

            string flowOutType,

            string internetSpec,

            ImmutableArray<string> ipWhitelists)
        {
            FlowOutBandwidth = flowOutBandwidth;
            FlowOutType = flowOutType;
            InternetSpec = internetSpec;
            IpWhitelists = ipWhitelists;
        }
    }
}
