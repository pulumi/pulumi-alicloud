// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class GetTransitRouterCidrsCidrResult
    {
        /// <summary>
        /// The cidr of the transit router.
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// The description of the transit router.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The type of the transit router cidr.
        /// </summary>
        public readonly string Family;
        /// <summary>
        /// The ID of the Cen Transit Router Cidr. It formats as `&lt;transit_router_id&gt;:&lt;transit_router_cidr_id&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table.
        /// </summary>
        public readonly bool PublishCidrRoute;
        /// <summary>
        /// The ID of the transit router cidr.
        /// </summary>
        public readonly string TransitRouterCidrId;
        /// <summary>
        /// The name of the transit router.
        /// </summary>
        public readonly string TransitRouterCidrName;
        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        public readonly string TransitRouterId;

        [OutputConstructor]
        private GetTransitRouterCidrsCidrResult(
            string cidr,

            string description,

            string family,

            string id,

            bool publishCidrRoute,

            string transitRouterCidrId,

            string transitRouterCidrName,

            string transitRouterId)
        {
            Cidr = cidr;
            Description = description;
            Family = family;
            Id = id;
            PublishCidrRoute = publishCidrRoute;
            TransitRouterCidrId = transitRouterCidrId;
            TransitRouterCidrName = transitRouterCidrName;
            TransitRouterId = transitRouterId;
        }
    }
}