// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Inputs
{

    public sealed class RocketMQInstanceNetworkInfoInternetInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Public network bandwidth specification. Unit: Mb/s.This field should only be filled when the public network billing type is set to payByBandwidth.The value range is [1 - 1000].
        /// </summary>
        [Input("flowOutBandwidth")]
        public Input<int>? FlowOutBandwidth { get; set; }

        /// <summary>
        /// Public network billing type. The parameter values are as follows:
        /// - payByBandwidth: Fixed bandwidth billing. Set this value when enabling public network access.
        /// - uninvolved: Not involved. Set this value when disabling public network access.
        /// </summary>
        [Input("flowOutType", required: true)]
        public Input<string> FlowOutType { get; set; } = null!;

        /// <summary>
        /// Whether to enable public network access. Instances by default support VPC access. If public network access is enabled, Alibaba Cloud Message Queue RocketMQ version will incur charges for public network outbound bandwidth. For specific billing information, please refer to [Public Network Access Fees](https://help.aliyun.com/zh/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/product-overview/internet-access-fee). The parameter values are as follows:
        /// - enable: Enable public network access
        /// - disable: Disable public network access
        /// </summary>
        [Input("internetSpec", required: true)]
        public Input<string> InternetSpec { get; set; } = null!;

        [Input("ipWhitelists")]
        private InputList<string>? _ipWhitelists;

        /// <summary>
        /// internet ip whitelist.
        /// </summary>
        public InputList<string> IpWhitelists
        {
            get => _ipWhitelists ?? (_ipWhitelists = new InputList<string>());
            set => _ipWhitelists = value;
        }

        public RocketMQInstanceNetworkInfoInternetInfoGetArgs()
        {
        }
        public static new RocketMQInstanceNetworkInfoInternetInfoGetArgs Empty => new RocketMQInstanceNetworkInfoInternetInfoGetArgs();
    }
}