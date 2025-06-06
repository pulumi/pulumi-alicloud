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
    public sealed class GetLoadBalancersBalancerAccessLogConfigResult
    {
        /// <summary>
        /// The log service that access logs are shipped to.
        /// </summary>
        public readonly string LogProject;
        /// <summary>
        /// The logstore that access logs are shipped to.
        /// </summary>
        public readonly string LogStore;

        [OutputConstructor]
        private GetLoadBalancersBalancerAccessLogConfigResult(
            string logProject,

            string logStore)
        {
            LogProject = logProject;
            LogStore = logStore;
        }
    }
}
