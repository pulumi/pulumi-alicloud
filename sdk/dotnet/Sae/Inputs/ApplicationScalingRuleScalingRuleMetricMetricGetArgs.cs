// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationScalingRuleScalingRuleMetricMetricGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metricTargetAverageUtilization")]
        public Input<int>? MetricTargetAverageUtilization { get; set; }

        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        [Input("slbId")]
        public Input<string>? SlbId { get; set; }

        [Input("slbLogStore")]
        public Input<string>? SlbLogStore { get; set; }

        [Input("slbProject")]
        public Input<string>? SlbProject { get; set; }

        [Input("vport")]
        public Input<string>? Vport { get; set; }

        public ApplicationScalingRuleScalingRuleMetricMetricGetArgs()
        {
        }
        public static new ApplicationScalingRuleScalingRuleMetricMetricGetArgs Empty => new ApplicationScalingRuleScalingRuleMetricMetricGetArgs();
    }
}