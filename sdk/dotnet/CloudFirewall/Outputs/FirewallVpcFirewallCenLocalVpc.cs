// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Outputs
{

    [OutputType]
    public sealed class FirewallVpcFirewallCenLocalVpc
    {
        /// <summary>
        /// The connection ID of the network instance.
        /// </summary>
        public readonly string? AttachmentId;
        /// <summary>
        /// The connection name of the network instance.
        /// </summary>
        public readonly string? AttachmentName;
        /// <summary>
        /// The list of network segments protected by the VPC firewall.
        /// </summary>
        public readonly ImmutableArray<string> DefendCidrLists;
        /// <summary>
        /// List of elastic network cards.
        /// </summary>
        public readonly ImmutableArray<Outputs.FirewallVpcFirewallCenLocalVpcEniList> EniLists;
        /// <summary>
        /// The ID of the vSwitch specified when the routing mode is manual mode.
        /// </summary>
        public readonly string? ManualVswitchId;
        /// <summary>
        /// The ID of the VPC instance that created the VPC firewall.
        /// </summary>
        public readonly string NetworkInstanceId;
        /// <summary>
        /// The name of the network instance.
        /// </summary>
        public readonly string? NetworkInstanceName;
        /// <summary>
        /// The type of the network instance. Value: **VPC * *.
        /// </summary>
        public readonly string? NetworkInstanceType;
        /// <summary>
        /// The UID of the Alibaba Cloud account to which the VPC belongs.
        /// </summary>
        public readonly string? OwnerId;
        /// <summary>
        /// The region ID of the VPC.
        /// </summary>
        public readonly string? RegionNo;
        /// <summary>
        /// Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
        /// </summary>
        public readonly string? RouteMode;
        /// <summary>
        /// Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
        /// </summary>
        public readonly string? SupportManualMode;
        /// <summary>
        /// The ID of the CEN-TR instance.
        /// </summary>
        public readonly string? TransitRouterId;
        /// <summary>
        /// The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
        /// </summary>
        public readonly string? TransitRouterType;
        /// <summary>
        /// The VPC network segment list.
        /// </summary>
        public readonly ImmutableArray<Outputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableList> VpcCidrTableLists;
        /// <summary>
        /// The ID of the VPC instance.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// The instance name of the VPC.
        /// </summary>
        public readonly string? VpcName;

        [OutputConstructor]
        private FirewallVpcFirewallCenLocalVpc(
            string? attachmentId,

            string? attachmentName,

            ImmutableArray<string> defendCidrLists,

            ImmutableArray<Outputs.FirewallVpcFirewallCenLocalVpcEniList> eniLists,

            string? manualVswitchId,

            string networkInstanceId,

            string? networkInstanceName,

            string? networkInstanceType,

            string? ownerId,

            string? regionNo,

            string? routeMode,

            string? supportManualMode,

            string? transitRouterId,

            string? transitRouterType,

            ImmutableArray<Outputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableList> vpcCidrTableLists,

            string? vpcId,

            string? vpcName)
        {
            AttachmentId = attachmentId;
            AttachmentName = attachmentName;
            DefendCidrLists = defendCidrLists;
            EniLists = eniLists;
            ManualVswitchId = manualVswitchId;
            NetworkInstanceId = networkInstanceId;
            NetworkInstanceName = networkInstanceName;
            NetworkInstanceType = networkInstanceType;
            OwnerId = ownerId;
            RegionNo = regionNo;
            RouteMode = routeMode;
            SupportManualMode = supportManualMode;
            TransitRouterId = transitRouterId;
            TransitRouterType = transitRouterType;
            VpcCidrTableLists = vpcCidrTableLists;
            VpcId = vpcId;
            VpcName = vpcName;
        }
    }
}