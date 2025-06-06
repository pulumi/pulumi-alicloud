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
    public sealed class RuleRuleActionForwardGroupConfigServerGroupTuple
    {
        /// <summary>
        /// The ID of the destination server group to which requests are forwarded.
        /// </summary>
        public readonly string? ServerGroupId;
        /// <summary>
        /// The Weight of server group. Default value: `100`. **NOTE:** This attribute is required when the number of `server_group_tuples` is greater than 2.
        /// </summary>
        public readonly int? Weight;

        [OutputConstructor]
        private RuleRuleActionForwardGroupConfigServerGroupTuple(
            string? serverGroupId,

            int? weight)
        {
            ServerGroupId = serverGroupId;
            Weight = weight;
        }
    }
}
