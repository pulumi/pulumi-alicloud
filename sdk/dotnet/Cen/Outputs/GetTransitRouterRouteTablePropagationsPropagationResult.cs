// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class GetTransitRouterRouteTablePropagationsPropagationResult
    {
        public readonly string Id;
        /// <summary>
        /// ID of the transit router route table association.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// Type of the resource.
        /// </summary>
        public readonly string ResourceType;
        /// <summary>
        /// The status of the route table, including `Active`, `Enabling`, `Disabling`, `Deleted`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// ID of the cen transit router attachment.
        /// </summary>
        public readonly string TransitRouterAttachmentId;

        [OutputConstructor]
        private GetTransitRouterRouteTablePropagationsPropagationResult(
            string id,

            string resourceId,

            string resourceType,

            string status,

            string transitRouterAttachmentId)
        {
            Id = id;
            ResourceId = resourceId;
            ResourceType = resourceType;
            Status = status;
            TransitRouterAttachmentId = transitRouterAttachmentId;
        }
    }
}
