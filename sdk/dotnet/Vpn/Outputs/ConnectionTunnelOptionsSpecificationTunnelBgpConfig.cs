// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class ConnectionTunnelOptionsSpecificationTunnelBgpConfig
    {
        /// <summary>
        /// Whether BGP function is turned on.
        /// </summary>
        public readonly string? BgpStatus;
        /// <summary>
        /// Local asn.
        /// </summary>
        public readonly string? LocalAsn;
        /// <summary>
        /// Local bgp IP.
        /// </summary>
        public readonly string? LocalBgpIp;
        /// <summary>
        /// Peer asn.
        /// </summary>
        public readonly string? PeerAsn;
        /// <summary>
        /// Peer bgp ip.
        /// </summary>
        public readonly string? PeerBgpIp;
        /// <summary>
        /// IPSec tunnel Cidr.
        /// </summary>
        public readonly string? TunnelCidr;

        [OutputConstructor]
        private ConnectionTunnelOptionsSpecificationTunnelBgpConfig(
            string? bgpStatus,

            string? localAsn,

            string? localBgpIp,

            string? peerAsn,

            string? peerBgpIp,

            string? tunnelCidr)
        {
            BgpStatus = bgpStatus;
            LocalAsn = localAsn;
            LocalBgpIp = localBgpIp;
            PeerAsn = peerAsn;
            PeerBgpIp = peerBgpIp;
            TunnelCidr = tunnelCidr;
        }
    }
}