// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class EciScalingConfigurationSecurityContextSysctl
    {
        /// <summary>
        /// The system name of the security context in which the elastic container instance is run.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The system value of the security context in which the elastic container instance is run.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private EciScalingConfigurationSecurityContextSysctl(
            string? name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}