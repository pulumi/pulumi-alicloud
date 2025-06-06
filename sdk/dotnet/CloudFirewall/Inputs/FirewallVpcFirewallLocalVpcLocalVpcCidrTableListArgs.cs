// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallLocalVpcLocalVpcCidrTableListArgs : global::Pulumi.ResourceArgs
    {
        [Input("localRouteEntryLists", required: true)]
        private InputList<Inputs.FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs>? _localRouteEntryLists;

        /// <summary>
        /// The list of route entries of the local VPC. See `local_route_entry_list` below.
        /// </summary>
        public InputList<Inputs.FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs> LocalRouteEntryLists
        {
            get => _localRouteEntryLists ?? (_localRouteEntryLists = new InputList<Inputs.FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs>());
            set => _localRouteEntryLists = value;
        }

        /// <summary>
        /// The ID of the route table of the local VPC.
        /// </summary>
        [Input("localRouteTableId", required: true)]
        public Input<string> LocalRouteTableId { get; set; } = null!;

        public FirewallVpcFirewallLocalVpcLocalVpcCidrTableListArgs()
        {
        }
        public static new FirewallVpcFirewallLocalVpcLocalVpcCidrTableListArgs Empty => new FirewallVpcFirewallLocalVpcLocalVpcCidrTableListArgs();
    }
}
