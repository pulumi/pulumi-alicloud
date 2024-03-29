// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Inputs
{

    public sealed class ForwardingRuleRuleConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostConfigs")]
        private InputList<Inputs.ForwardingRuleRuleConditionHostConfigGetArgs>? _hostConfigs;

        /// <summary>
        /// The configuration of the domain name. See `host_config` below.
        /// </summary>
        public InputList<Inputs.ForwardingRuleRuleConditionHostConfigGetArgs> HostConfigs
        {
            get => _hostConfigs ?? (_hostConfigs = new InputList<Inputs.ForwardingRuleRuleConditionHostConfigGetArgs>());
            set => _hostConfigs = value;
        }

        /// <summary>
        /// The configuration of the path. See `path_config` below.
        /// </summary>
        [Input("pathConfig")]
        public Input<Inputs.ForwardingRuleRuleConditionPathConfigGetArgs>? PathConfig { get; set; }

        /// <summary>
        /// The type of the forwarding conditions. Valid values: `Host`, `Path`.
        /// </summary>
        [Input("ruleConditionType", required: true)]
        public Input<string> RuleConditionType { get; set; } = null!;

        public ForwardingRuleRuleConditionGetArgs()
        {
        }
        public static new ForwardingRuleRuleConditionGetArgs Empty => new ForwardingRuleRuleConditionGetArgs();
    }
}
