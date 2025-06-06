// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse.Outputs
{

    [OutputType]
    public sealed class DbClusterMultiZoneVswitchList
    {
        /// <summary>
        /// The ID of the vswitch.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// The zone ID of the vswitch.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private DbClusterMultiZoneVswitchList(
            string vswitchId,

            string? zoneId)
        {
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
