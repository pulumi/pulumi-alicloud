// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class RdsUpgradeDbInstanceParameter
    {
        /// <summary>
        /// The parameter name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The parameter value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private RdsUpgradeDbInstanceParameter(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}
