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
    public sealed class RocketMQInstanceNetworkInfoVpcInfoVswitch
    {
        /// <summary>
        /// VPC switch id.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private RocketMQInstanceNetworkInfoVpcInfoVswitch(string? vswitchId)
        {
            VswitchId = vswitchId;
        }
    }
}