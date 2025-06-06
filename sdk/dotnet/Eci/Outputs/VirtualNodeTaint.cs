// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class VirtualNodeTaint
    {
        /// <summary>
        /// The effect of the taint. Valid values: `NoSchedule`, `NoExecute` and `PreferNoSchedule`.
        /// </summary>
        public readonly string? Effect;
        /// <summary>
        /// The key of the taint.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// The value of the taint.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private VirtualNodeTaint(
            string? effect,

            string? key,

            string? value)
        {
            Effect = effect;
            Key = key;
            Value = value;
        }
    }
}
