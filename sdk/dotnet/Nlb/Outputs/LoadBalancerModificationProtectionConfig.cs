// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb.Outputs
{

    [OutputType]
    public sealed class LoadBalancerModificationProtectionConfig
    {
        /// <summary>
        /// Opening time.
        /// </summary>
        public readonly string? EnabledTime;
        /// <summary>
        /// Reason for opening.
        /// </summary>
        public readonly string? Reason;
        /// <summary>
        /// ON.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private LoadBalancerModificationProtectionConfig(
            string? enabledTime,

            string? reason,

            string? status)
        {
            EnabledTime = enabledTime;
            Reason = reason;
            Status = status;
        }
    }
}
