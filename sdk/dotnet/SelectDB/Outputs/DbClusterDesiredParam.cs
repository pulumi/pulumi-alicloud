// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SelectDB.Outputs
{

    [OutputType]
    public sealed class DbClusterDesiredParam
    {
        /// <summary>
        /// Parameter name.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The new value of Parameter.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private DbClusterDesiredParam(
            string? name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}
