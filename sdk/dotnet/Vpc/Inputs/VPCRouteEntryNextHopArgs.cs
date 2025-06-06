// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Inputs
{

    public sealed class VPCRouteEntryNextHopArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the route is available.
        /// </summary>
        [Input("enabled")]
        public Input<int>? Enabled { get; set; }

        /// <summary>
        /// The region of the next instance.
        /// </summary>
        [Input("nextHopRegionId")]
        public Input<string>? NextHopRegionId { get; set; }

        /// <summary>
        /// Next hop information.
        /// </summary>
        [Input("nextHopRelatedInfo")]
        public Input<Inputs.VPCRouteEntryNextHopNextHopRelatedInfoArgs>? NextHopRelatedInfo { get; set; }

        /// <summary>
        /// ID of next hop
        /// </summary>
        [Input("nexthopId")]
        public Input<string>? NexthopId { get; set; }

        /// <summary>
        /// type of next hop
        /// </summary>
        [Input("nexthopType")]
        public Input<string>? NexthopType { get; set; }

        /// <summary>
        /// The weight of the route entry.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public VPCRouteEntryNextHopArgs()
        {
        }
        public static new VPCRouteEntryNextHopArgs Empty => new VPCRouteEntryNextHopArgs();
    }
}
