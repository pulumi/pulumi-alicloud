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
    public sealed class GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListResult
    {
        /// <summary>
        /// The target network segment of the local VPC.
        /// </summary>
        public readonly string LocalDestinationCidr;
        /// <summary>
        /// The ID of the next-hop instance in the local VPC.
        /// </summary>
        public readonly string LocalNextHopInstanceId;

        [OutputConstructor]
        private GetVpcFirewallsFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListResult(
            string localDestinationCidr,

            string localNextHopInstanceId)
        {
            LocalDestinationCidr = localDestinationCidr;
            LocalNextHopInstanceId = localNextHopInstanceId;
        }
    }
}
