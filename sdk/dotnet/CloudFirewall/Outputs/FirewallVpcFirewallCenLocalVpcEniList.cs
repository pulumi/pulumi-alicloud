// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Outputs
{

    [OutputType]
    public sealed class FirewallVpcFirewallCenLocalVpcEniList
    {
        /// <summary>
        /// The ID of the instance of the ENI in the VPC.
        /// </summary>
        public readonly string? EniId;
        /// <summary>
        /// The private IP address of the ENI in the VPC.
        /// </summary>
        public readonly string? EniPrivateIpAddress;

        [OutputConstructor]
        private FirewallVpcFirewallCenLocalVpcEniList(
            string? eniId,

            string? eniPrivateIpAddress)
        {
            EniId = eniId;
            EniPrivateIpAddress = eniPrivateIpAddress;
        }
    }
}
