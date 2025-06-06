// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class GetVbrHealthChecksCheckResult
    {
        /// <summary>
        /// The ID of the Cloud Enterprise Network (CEN) instance.
        /// </summary>
        public readonly string CenId;
        /// <summary>
        /// The time interval at which probe packets are sent during the health check.
        /// </summary>
        public readonly int HealthCheckInterval;
        /// <summary>
        /// The source IP address of the health check.
        /// </summary>
        public readonly string HealthCheckSourceIp;
        /// <summary>
        /// The destination IP address of the health check.
        /// </summary>
        public readonly string HealthCheckTargetIp;
        /// <summary>
        /// The number of probe packets that are sent during the health check.
        /// </summary>
        public readonly int HealthyThreshold;
        /// <summary>
        /// The ID of the CEN VBR Heath Check.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the VBR instance.
        /// </summary>
        public readonly string VbrInstanceId;
        /// <summary>
        /// The ID of the region where the VBR instance is deployed.
        /// </summary>
        public readonly string VbrInstanceRegionId;

        [OutputConstructor]
        private GetVbrHealthChecksCheckResult(
            string cenId,

            int healthCheckInterval,

            string healthCheckSourceIp,

            string healthCheckTargetIp,

            int healthyThreshold,

            string id,

            string vbrInstanceId,

            string vbrInstanceRegionId)
        {
            CenId = cenId;
            HealthCheckInterval = healthCheckInterval;
            HealthCheckSourceIp = healthCheckSourceIp;
            HealthCheckTargetIp = healthCheckTargetIp;
            HealthyThreshold = healthyThreshold;
            Id = id;
            VbrInstanceId = vbrInstanceId;
            VbrInstanceRegionId = vbrInstanceRegionId;
        }
    }
}
