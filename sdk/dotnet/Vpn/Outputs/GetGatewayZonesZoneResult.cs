// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class GetGatewayZonesZoneResult
    {
        /// <summary>
        /// The zone ID.
        /// </summary>
        public readonly string ZoneId;
        /// <summary>
        /// The zone name.
        /// </summary>
        public readonly string ZoneName;

        [OutputConstructor]
        private GetGatewayZonesZoneResult(
            string zoneId,

            string zoneName)
        {
            ZoneId = zoneId;
            ZoneName = zoneName;
        }
    }
}
