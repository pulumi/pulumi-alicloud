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
    public sealed class EciScalingConfigurationInitContainerVolumeMount
    {
        public readonly string? MountPath;
        public readonly string? Name;
        public readonly bool? ReadOnly;

        [OutputConstructor]
        private EciScalingConfigurationInitContainerVolumeMount(
            string? mountPath,

            string? name,

            bool? readOnly)
        {
            MountPath = mountPath;
            Name = name;
            ReadOnly = readOnly;
        }
    }
}