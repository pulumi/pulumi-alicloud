// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class RdsCloneDbInstanceParameter
    {
        /// <summary>
        /// The parameters name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The parameters value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private RdsCloneDbInstanceParameter(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}