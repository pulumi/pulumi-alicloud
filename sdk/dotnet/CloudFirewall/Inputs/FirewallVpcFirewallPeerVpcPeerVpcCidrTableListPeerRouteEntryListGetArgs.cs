// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("peerDestinationCidr", required: true)]
        public Input<string> PeerDestinationCidr { get; set; } = null!;

        [Input("peerNextHopInstanceId", required: true)]
        public Input<string> PeerNextHopInstanceId { get; set; } = null!;

        public FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListGetArgs()
        {
        }
        public static new FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListGetArgs Empty => new FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryListGetArgs();
    }
}
