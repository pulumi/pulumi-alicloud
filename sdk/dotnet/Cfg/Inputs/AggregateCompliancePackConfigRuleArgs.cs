// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Inputs
{

    public sealed class AggregateCompliancePackConfigRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("configRuleParameters")]
        private InputList<Inputs.AggregateCompliancePackConfigRuleConfigRuleParameterArgs>? _configRuleParameters;

        /// <summary>
        /// A list of parameter rules. See `config_rule_parameters` below.
        /// </summary>
        public InputList<Inputs.AggregateCompliancePackConfigRuleConfigRuleParameterArgs> ConfigRuleParameters
        {
            get => _configRuleParameters ?? (_configRuleParameters = new InputList<Inputs.AggregateCompliancePackConfigRuleConfigRuleParameterArgs>());
            set => _configRuleParameters = value;
        }

        /// <summary>
        /// The Managed Rule Identifier.
        /// </summary>
        [Input("managedRuleIdentifier", required: true)]
        public Input<string> ManagedRuleIdentifier { get; set; } = null!;

        public AggregateCompliancePackConfigRuleArgs()
        {
        }
        public static new AggregateCompliancePackConfigRuleArgs Empty => new AggregateCompliancePackConfigRuleArgs();
    }
}