// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Inputs
{

    public sealed class AlertConfigurationSeverityConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("evalCondition")]
        public Input<Inputs.AlertConfigurationSeverityConfigurationEvalConditionGetArgs>? EvalCondition { get; set; }

        [Input("severity")]
        public Input<int>? Severity { get; set; }

        public AlertConfigurationSeverityConfigurationGetArgs()
        {
        }
        public static new AlertConfigurationSeverityConfigurationGetArgs Empty => new AlertConfigurationSeverityConfigurationGetArgs();
    }
}