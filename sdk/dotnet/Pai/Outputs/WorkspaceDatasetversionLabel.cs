// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pai.Outputs
{

    [OutputType]
    public sealed class WorkspaceDatasetversionLabel
    {
        /// <summary>
        /// The key of the tags
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The value of the tags
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private WorkspaceDatasetversionLabel(
            string? key,

            string? value)
        {
            Key = key;
            Value = value;
        }
    }
}