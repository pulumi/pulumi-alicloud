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
    public sealed class GetNatFirewallsFirewallResult
    {
        /// <summary>
        /// Alibaba Cloud account ID
        /// </summary>
        public readonly int AliUid;
        /// <summary>
        /// The ID of the resource supplied above.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Member Account ID
        /// </summary>
        public readonly int MemberUid;
        /// <summary>
        /// NAT gateway ID
        /// </summary>
        public readonly string NatGatewayId;
        /// <summary>
        /// NAT Gateway name
        /// </summary>
        public readonly string NatGatewayName;
        /// <summary>
        /// The list of routes to be switched by the NAT gateway.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatFirewallsFirewallNatRouteEntryListResult> NatRouteEntryLists;
        /// <summary>
        /// NAT firewall ID
        /// </summary>
        public readonly string ProxyId;
        /// <summary>
        /// NAT firewall name
        /// </summary>
        public readonly string ProxyName;
        /// <summary>
        /// Whether strict mode is enabled1-Enable strict mode0-Disable strict mode
        /// </summary>
        public readonly int StrictMode;
        /// <summary>
        /// The ID of the VPC instance.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetNatFirewallsFirewallResult(
            int aliUid,

            string id,

            int memberUid,

            string natGatewayId,

            string natGatewayName,

            ImmutableArray<Outputs.GetNatFirewallsFirewallNatRouteEntryListResult> natRouteEntryLists,

            string proxyId,

            string proxyName,

            int strictMode,

            string vpcId)
        {
            AliUid = aliUid;
            Id = id;
            MemberUid = memberUid;
            NatGatewayId = natGatewayId;
            NatGatewayName = natGatewayName;
            NatRouteEntryLists = natRouteEntryLists;
            ProxyId = proxyId;
            ProxyName = proxyName;
            StrictMode = strictMode;
            VpcId = vpcId;
        }
    }
}
