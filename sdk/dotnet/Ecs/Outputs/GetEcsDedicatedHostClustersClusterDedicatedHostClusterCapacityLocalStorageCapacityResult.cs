// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacityResult
    {
        /// <summary>
        /// The available capacity of the local disk. Unit: `GiB`.
        /// </summary>
        public readonly int AvailableDisk;
        /// <summary>
        /// The category of the data disk. Valid values:`cloud`, `cloud_efficiency`, `cloud_ssd`, `ephemeral_ssd`, `cloud_essd`.
        /// </summary>
        public readonly string DataDiskCategory;
        /// <summary>
        /// The total capacity of the local disk. Unit: `GiB`.
        /// </summary>
        public readonly int TotalDisk;

        [OutputConstructor]
        private GetEcsDedicatedHostClustersClusterDedicatedHostClusterCapacityLocalStorageCapacityResult(
            int availableDisk,

            string dataDiskCategory,

            int totalDisk)
        {
            AvailableDisk = availableDisk;
            DataDiskCategory = dataDiskCategory;
            TotalDisk = totalDisk;
        }
    }
}
