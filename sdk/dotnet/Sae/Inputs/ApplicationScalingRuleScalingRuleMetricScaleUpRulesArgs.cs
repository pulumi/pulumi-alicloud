// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("stabilizationWindowSeconds")]
        public Input<int>? StabilizationWindowSeconds { get; set; }

        [Input("step")]
        public Input<int>? Step { get; set; }

        public ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs()
        {
        }
        public static new ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs Empty => new ApplicationScalingRuleScalingRuleMetricScaleUpRulesArgs();
    }
}