// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroupCostOptimizedConfig
    {
        /// <summary>
        /// The cost optimized configuration which on demand based capacity.
        /// </summary>
        public readonly int OnDemandBaseCapacity;
        /// <summary>
        /// The cost optimized configuration which on demand percentage above based capacity.
        /// </summary>
        public readonly int OnDemandPercentageAboveBaseCapacity;
        /// <summary>
        /// The cost optimized configuration with spot instance pools.
        /// </summary>
        public readonly int SpotInstancePools;

        [OutputConstructor]
        private ClusterNodeGroupCostOptimizedConfig(
            int onDemandBaseCapacity,

            int onDemandPercentageAboveBaseCapacity,

            int spotInstancePools)
        {
            OnDemandBaseCapacity = onDemandBaseCapacity;
            OnDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            SpotInstancePools = spotInstancePools;
        }
    }
}
