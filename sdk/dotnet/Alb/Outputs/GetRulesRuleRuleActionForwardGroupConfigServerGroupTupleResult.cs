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
    public sealed class GetRulesRuleRuleActionForwardGroupConfigServerGroupTupleResult
    {
        /// <summary>
        /// The ID of the destination server group to which requests are forwarded.
        /// </summary>
        public readonly string ServerGroupId;
        /// <summary>
        /// The Weight of server group.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetRulesRuleRuleActionForwardGroupConfigServerGroupTupleResult(
            string serverGroupId,

            int weight)
        {
            ServerGroupId = serverGroupId;
            Weight = weight;
        }
    }
}
