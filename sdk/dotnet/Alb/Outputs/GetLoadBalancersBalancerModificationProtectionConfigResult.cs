// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersBalancerModificationProtectionConfigResult
    {
        /// <summary>
        /// The reason for modification protection.
        /// </summary>
        public readonly string Reason;
        /// <summary>
        /// The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetLoadBalancersBalancerModificationProtectionConfigResult(
            string reason,

            string status)
        {
            Reason = reason;
            Status = status;
        }
    }
}
