// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class GetAcceleratorsAcceleratorCrossDomainBandwidthPackageResult
    {
        /// <summary>
        /// Bandwidth value of cross-domain acceleration package.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Instance ID of the cross-domain acceleration package.
        /// </summary>
        public readonly string InstanceId;

        [OutputConstructor]
        private GetAcceleratorsAcceleratorCrossDomainBandwidthPackageResult(
            int bandwidth,

            string instanceId)
        {
            Bandwidth = bandwidth;
            InstanceId = instanceId;
        }
    }
}