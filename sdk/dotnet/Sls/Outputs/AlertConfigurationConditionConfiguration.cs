// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sls.Outputs
{

    [OutputType]
    public sealed class AlertConfigurationConditionConfiguration
    {
        public readonly string? Condition;
        public readonly string? CountCondition;

        [OutputConstructor]
        private AlertConfigurationConditionConfiguration(
            string? condition,

            string? countCondition)
        {
            Condition = condition;
            CountCondition = countCondition;
        }
    }
}