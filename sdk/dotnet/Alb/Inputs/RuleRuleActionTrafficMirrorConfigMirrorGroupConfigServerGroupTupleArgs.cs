// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverGroupId")]
        public Input<string>? ServerGroupId { get; set; }

        public RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs()
        {
        }
        public static new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs Empty => new RuleRuleActionTrafficMirrorConfigMirrorGroupConfigServerGroupTupleArgs();
    }
}