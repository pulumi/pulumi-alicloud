// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// Public network bandwidth specification. Unit: Mb/s.This field should only be filled when the public network billing type is set to payByBandwidth.The value range is [1 - 1000].
        /// </summary>
        public readonly int? FlowOutBandwidth;
        /// <summary>
        /// Public network billing type. The parameter values are as follows:
        /// - payByBandwidth: Fixed bandwidth billing. Set this value when enabling public network access.
        /// - uninvolved: Not involved. Set this value when disabling public network access.
        /// </summary>
        public readonly string FlowOutType;
        /// <summary>
        /// Whether to enable public network access. Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee). The parameter values are as follows:
        /// - enable: Enable public network access
        /// - disable: Disable public network access
        /// </summary>
        public readonly string InternetSpec;
        /// <summary>
        /// internet ip whitelist.
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