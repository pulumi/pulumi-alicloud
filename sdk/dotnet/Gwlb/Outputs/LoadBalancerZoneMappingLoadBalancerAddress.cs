// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gwlb.Outputs
{

    [OutputType]
    public sealed class LoadBalancerZoneMappingLoadBalancerAddress
    {
        /// <summary>
        /// The ID of the ENI.
        /// </summary>
        public readonly string? EniId;
        /// <summary>
        /// IPv4 private network address.
        /// </summary>
        public readonly string? PrivateIpv4Address;

        [OutputConstructor]
        private LoadBalancerZoneMappingLoadBalancerAddress(
            string? eniId,

            string? privateIpv4Address)
        {
            EniId = eniId;
            PrivateIpv4Address = privateIpv4Address;
        }
    }
}