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
    public sealed class GetRouteEntriesEntryResult
    {
        /// <summary>
        /// The destination CIDR block of the route entry to query.
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// A list of conflicted Route Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouteEntriesEntryConflictResult> Conflicts;
        /// <summary>
        /// ID of the next hop.
        /// </summary>
        public readonly string NextHopId;
        /// <summary>
        /// Type of the next hop, including "Instance", "HaVip" and "RouterInterface".
        /// </summary>
        public readonly string NextHopType;
        /// <summary>
        /// Whether to allow the route entry to be published or removed to or from CEN.
        /// </summary>
        public readonly bool OperationalMode;
        /// <summary>
        /// The publish status of the route entry in CEN, including "Published" and "NonPublished".
        /// </summary>
        public readonly string PublishStatus;
        /// <summary>
        /// ID of the route table of the VPC or VBR.
        /// </summary>
        public readonly string RouteTableId;
        /// <summary>
        /// Type of the route entry, including "System", "Custom" and "BGP".
        /// </summary>
        public readonly string RouteType;

        [OutputConstructor]
        private GetRouteEntriesEntryResult(
            string cidrBlock,

            ImmutableArray<Outputs.GetRouteEntriesEntryConflictResult> conflicts,

            string nextHopId,

            string nextHopType,

            bool operationalMode,

            string publishStatus,

            string routeTableId,

            string routeType)
        {
            CidrBlock = cidrBlock;
            Conflicts = conflicts;
            NextHopId = nextHopId;
            NextHopType = nextHopType;
            OperationalMode = operationalMode;
            PublishStatus = publishStatus;
            RouteTableId = routeTableId;
            RouteType = routeType;
        }
    }
}