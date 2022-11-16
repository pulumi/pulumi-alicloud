// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class RuleRuleActionTrafficMirrorConfigMirrorGroupConfig
    {
        /// <summary>
        /// The destination server group to which requests are forwarded.
        /// </summary>
        public readonly ImmutableArray<Outputs.RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> ServerGroupTuples;

        [OutputConstructor]
        private RuleRuleActionTrafficMirrorConfigMirrorGroupConfig(ImmutableArray<Outputs.RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTuple> serverGroupTuples)
        {
            ServerGroupTuples = serverGroupTuples;
        }
    }
}