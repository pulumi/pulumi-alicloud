// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MaxCompute.Outputs
{

    [OutputType]
    public sealed class ProjectPropertiesEncryption
    {
        public readonly string? Algorithm;
        public readonly bool? Enable;
        public readonly string? Key;

        [OutputConstructor]
        private ProjectPropertiesEncryption(
            string? algorithm,

            bool? enable,

            string? key)
        {
            Algorithm = algorithm;
            Enable = enable;
            Key = key;
        }
    }
}