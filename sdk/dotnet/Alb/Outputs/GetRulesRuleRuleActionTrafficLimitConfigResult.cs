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
    public sealed class GetRulesRuleRuleActionTrafficLimitConfigResult
    {
        /// <summary>
        /// The Number of requests per second.
        /// </summary>
        public readonly int Qps;

        [OutputConstructor]
        private GetRulesRuleRuleActionTrafficLimitConfigResult(int qps)
        {
            Qps = qps;
        }
    }
}
