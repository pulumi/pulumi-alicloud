// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Outputs
{

    [OutputType]
    public sealed class PrefixListPrefixListAssociation
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the prefix list belongs.
        /// </summary>
        public readonly string? OwnerId;
        /// <summary>
        /// The ID of the query Prefix List.
        /// </summary>
        public readonly string? PrefixListId;
        /// <summary>
        /// Reason when the association fails.
        /// </summary>
        public readonly string? Reason;
        /// <summary>
        /// The region ID of the prefix list to be queried.
        /// </summary>
        public readonly string? RegionId;
        /// <summary>
        /// The ID of the associated resource.
        /// </summary>
        public readonly string? ResourceId;
        /// <summary>
        /// The associated resource type. Value:-**vpcRouteTable**: The VPC route table.-**trRouteTable**: the routing table of the forwarding router.
        /// </summary>
        public readonly string? ResourceType;
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) to which the resource bound to the prefix list belongs.
        /// </summary>
        public readonly string? ResourceUid;
        /// <summary>
        /// Resource attribute fields that represent the status of the resource.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private PrefixListPrefixListAssociation(
            string? ownerId,

            string? prefixListId,

            string? reason,

            string? regionId,

            string? resourceId,

            string? resourceType,

            string? resourceUid,

            string? status)
        {
            OwnerId = ownerId;
            PrefixListId = prefixListId;
            Reason = reason;
            RegionId = regionId;
            ResourceId = resourceId;
            ResourceType = resourceType;
            ResourceUid = resourceUid;
            Status = status;
        }
    }
}
