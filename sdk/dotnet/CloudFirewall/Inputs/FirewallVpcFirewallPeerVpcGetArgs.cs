// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallPeerVpcGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the instance of the ENI in the peer VPC.
        /// </summary>
        [Input("eniId")]
        public Input<string>? EniId { get; set; }

        /// <summary>
        /// The private IP address of the elastic network card in the peer VPC.
        /// </summary>
        [Input("eniPrivateIpAddress")]
        public Input<string>? EniPrivateIpAddress { get; set; }

        [Input("peerVpcCidrTableLists", required: true)]
        private InputList<Inputs.FirewallVpcFirewallPeerVpcPeerVpcCidrTableListGetArgs>? _peerVpcCidrTableLists;

        /// <summary>
        /// The network segment list of the peer VPC. See `peer_vpc_cidr_table_list` below.
        /// </summary>
        public InputList<Inputs.FirewallVpcFirewallPeerVpcPeerVpcCidrTableListGetArgs> PeerVpcCidrTableLists
        {
            get => _peerVpcCidrTableLists ?? (_peerVpcCidrTableLists = new InputList<Inputs.FirewallVpcFirewallPeerVpcPeerVpcCidrTableListGetArgs>());
            set => _peerVpcCidrTableLists = value;
        }

        /// <summary>
        /// The region ID of the peer VPC.
        /// </summary>
        [Input("regionNo", required: true)]
        public Input<string> RegionNo { get; set; } = null!;

        /// <summary>
        /// The ID of the router interface in the peer VPC.
        /// </summary>
        [Input("routerInterfaceId")]
        public Input<string>? RouterInterfaceId { get; set; }

        /// <summary>
        /// The ID of the peer VPC instance.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The instance name of the peer VPC.
        /// </summary>
        [Input("vpcName")]
        public Input<string>? VpcName { get; set; }

        public FirewallVpcFirewallPeerVpcGetArgs()
        {
        }
        public static new FirewallVpcFirewallPeerVpcGetArgs Empty => new FirewallVpcFirewallPeerVpcGetArgs();
    }
}