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
    public sealed class RuleRuleActionForwardGroupConfig
    {
        /// <summary>
        /// The configuration of session persistence for server groups. See `server_group_sticky_session` below.
        /// </summary>
        public readonly Outputs.RuleRuleActionForwardGroupConfigServerGroupStickySession? ServerGroupStickySession;
        /// <summary>
        /// The destination server group to which requests are forwarded. See `server_group_tuples` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RuleRuleActionForwardGroupConfigServerGroupTuple> ServerGroupTuples;

        [OutputConstructor]
        private RuleRuleActionForwardGroupConfig(
            Outputs.RuleRuleActionForwardGroupConfigServerGroupStickySession? serverGroupStickySession,

            ImmutableArray<Outputs.RuleRuleActionForwardGroupConfigServerGroupTuple> serverGroupTuples)
        {
            ServerGroupStickySession = serverGroupStickySession;
            ServerGroupTuples = serverGroupTuples;
        }
    }
}
