// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Inputs
{

    public sealed class PrefixListPrefixListAssociationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the prefix list belongs.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// The ID of the query Prefix List.
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        /// <summary>
        /// Reason when the association fails.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        /// <summary>
        /// The region ID of the prefix list to be queried.
        /// </summary>
        [Input("regionId")]
        public Input<string>? RegionId { get; set; }

        /// <summary>
        /// The ID of the associated resource.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The associated resource type. Value:-**vpcRouteTable**: The VPC route table.-**trRouteTable**: the routing table of the forwarding router.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the resource bound to the prefix list belongs.
        /// </summary>
        [Input("resourceUid")]
        public Input<string>? ResourceUid { get; set; }

        /// <summary>
        /// Resource attribute fields that represent the status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PrefixListPrefixListAssociationGetArgs()
        {
        }
        public static new PrefixListPrefixListAssociationGetArgs Empty => new PrefixListPrefixListAssociationGetArgs();
    }
}
