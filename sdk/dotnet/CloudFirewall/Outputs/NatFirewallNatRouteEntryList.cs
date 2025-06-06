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
    public sealed class NatFirewallNatRouteEntryList
    {
        /// <summary>
        /// The destination network segment of the default route.
        /// </summary>
        public readonly string DestinationCidr;
        /// <summary>
        /// The next hop address of the original NAT gateway.
        /// </summary>
        public readonly string NexthopId;
        /// <summary>
        /// The network type of the next hop. Value: NatGateway : NAT Gateway.
        /// </summary>
        public readonly string NexthopType;
        /// <summary>
        /// The route table where the default route of the NAT gateway is located.
        /// </summary>
        public readonly string RouteTableId;

        [OutputConstructor]
        private NatFirewallNatRouteEntryList(
            string destinationCidr,

            string nexthopId,

            string nexthopType,

            string routeTableId)
        {
            DestinationCidr = destinationCidr;
            NexthopId = nexthopId;
            NexthopType = nexthopType;
            RouteTableId = routeTableId;
        }
    }
}
