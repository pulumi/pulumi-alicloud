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
    public sealed class GetTransitRouterAvailableResourcesResourceResult
    {
        /// <summary>
        /// The list of primary zones.
        /// </summary>
        public readonly ImmutableArray<string> MasterZones;
        /// <summary>
        /// The list of secondary zones.
        /// </summary>
        public readonly ImmutableArray<string> SlaveZones;

        [OutputConstructor]
        private GetTransitRouterAvailableResourcesResourceResult(
            ImmutableArray<string> masterZones,

            ImmutableArray<string> slaveZones)
        {
            MasterZones = masterZones;
            SlaveZones = slaveZones;
        }
    }
}