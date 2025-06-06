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
    public sealed class RocketMQInstanceNetworkInfo
    {
        /// <summary>
        /// Access point list.
        /// </summary>
        public readonly ImmutableArray<Outputs.RocketMQInstanceNetworkInfoEndpoint> Endpoints;
        /// <summary>
        /// instance internet info. See `internet_info` below.
        /// </summary>
        public readonly Outputs.RocketMQInstanceNetworkInfoInternetInfo InternetInfo;
        /// <summary>
        /// Proprietary network information. See `vpc_info` below.
        /// </summary>
        public readonly Outputs.RocketMQInstanceNetworkInfoVpcInfo VpcInfo;

        [OutputConstructor]
        private RocketMQInstanceNetworkInfo(
            ImmutableArray<Outputs.RocketMQInstanceNetworkInfoEndpoint> endpoints,

            Outputs.RocketMQInstanceNetworkInfoInternetInfo internetInfo,

            Outputs.RocketMQInstanceNetworkInfoVpcInfo vpcInfo)
        {
            Endpoints = endpoints;
            InternetInfo = internetInfo;
            VpcInfo = vpcInfo;
        }
    }
}
