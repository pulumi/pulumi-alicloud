// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroupAutoScalingPolicyConstraints
    {
        /// <summary>
        /// The maximum capacity of constraints for emr node group auto scaling policy.
        /// </summary>
        public readonly int? MaxCapacity;
        /// <summary>
        /// The minimum capacity of constraints for emr node group auto scaling policy.
        /// </summary>
        public readonly int? MinCapacity;

        [OutputConstructor]
        private ClusterNodeGroupAutoScalingPolicyConstraints(
            int? maxCapacity,

            int? minCapacity)
        {
            MaxCapacity = maxCapacity;
            MinCapacity = minCapacity;
        }
    }
}