// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz.Outputs
{

    [OutputType]
    public sealed class GetZonesZoneBindVpcResult
    {
        /// <summary>
        /// The region ID of the VPC.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The name of the region where the VPC resides.
        /// </summary>
        public readonly string RegionName;
        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The Name of the VPC.
        /// </summary>
        public readonly string VpcName;

        [OutputConstructor]
        private GetZonesZoneBindVpcResult(
            string regionId,

            string regionName,

            string vpcId,

            string vpcName)
        {
            RegionId = regionId;
            RegionName = regionName;
            VpcId = vpcId;
            VpcName = vpcName;
        }
    }
}
