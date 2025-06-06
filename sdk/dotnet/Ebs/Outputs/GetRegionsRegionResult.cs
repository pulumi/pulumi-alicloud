// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs.Outputs
{

    [OutputType]
    public sealed class GetRegionsRegionResult
    {
        /// <summary>
        /// The ID of the region.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// A list of Ebs Zones.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionsRegionZoneResult> Zones;

        [OutputConstructor]
        private GetRegionsRegionResult(
            string regionId,

            ImmutableArray<Outputs.GetRegionsRegionZoneResult> zones)
        {
            RegionId = regionId;
            Zones = zones;
        }
    }
}
