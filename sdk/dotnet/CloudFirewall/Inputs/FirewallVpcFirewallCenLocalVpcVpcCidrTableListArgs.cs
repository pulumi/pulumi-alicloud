// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs : global::Pulumi.ResourceArgs
    {
        [Input("routeEntryLists")]
        private InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryListArgs>? _routeEntryLists;

        /// <summary>
        /// The list of route entries in the VPC.
        /// </summary>
        public InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryListArgs> RouteEntryLists
        {
            get => _routeEntryLists ?? (_routeEntryLists = new InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryListArgs>());
            set => _routeEntryLists = value;
        }

        /// <summary>
        /// The ID of the route table of the VPC.
        /// </summary>
        [Input("routeTableId")]
        public Input<string>? RouteTableId { get; set; }

        public FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs()
        {
        }
        public static new FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs Empty => new FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs();
    }
}
