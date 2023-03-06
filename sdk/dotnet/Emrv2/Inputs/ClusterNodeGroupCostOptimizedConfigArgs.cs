// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Inputs
{

    public sealed class ClusterNodeGroupCostOptimizedConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cost optimized configuration which on demand based capacity.
        /// </summary>
        [Input("onDemandBaseCapacity", required: true)]
        public Input<int> OnDemandBaseCapacity { get; set; } = null!;

        /// <summary>
        /// The cost optimized configuration which on demand percentage above based capacity.
        /// </summary>
        [Input("onDemandPercentageAboveBaseCapacity", required: true)]
        public Input<int> OnDemandPercentageAboveBaseCapacity { get; set; } = null!;

        /// <summary>
        /// The cost optimized configuration with spot instance pools.
        /// </summary>
        [Input("spotInstancePools", required: true)]
        public Input<int> SpotInstancePools { get; set; } = null!;

        public ClusterNodeGroupCostOptimizedConfigArgs()
        {
        }
        public static new ClusterNodeGroupCostOptimizedConfigArgs Empty => new ClusterNodeGroupCostOptimizedConfigArgs();
    }
}