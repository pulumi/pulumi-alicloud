// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Inputs
{

    public sealed class CompliancePackConfigRuleIdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The rule ID of Config Rule.
        /// </summary>
        [Input("configRuleId")]
        public Input<string>? ConfigRuleId { get; set; }

        public CompliancePackConfigRuleIdArgs()
        {
        }
        public static new CompliancePackConfigRuleIdArgs Empty => new CompliancePackConfigRuleIdArgs();
    }
}
