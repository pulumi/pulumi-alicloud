// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Inputs
{

    public sealed class RuleComplianceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of compliance. Valid values: `COMPLIANT`, `NON_COMPLIANT`, `NOT_APPLICABLE`, `INSUFFICIENT_DATA`.
        /// </summary>
        [Input("complianceType")]
        public Input<string>? ComplianceType { get; set; }

        /// <summary>
        /// The count of compliance.
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        public RuleComplianceArgs()
        {
        }
        public static new RuleComplianceArgs Empty => new RuleComplianceArgs();
    }
}