// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceCatalog.Outputs
{

    [OutputType]
    public sealed class ProvisionedProductOutput
    {
        /// <summary>
        /// Description of the output value defined in the template.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The name of the output value defined in the template.
        /// </summary>
        public readonly string? OutputKey;
        /// <summary>
        /// The content of the output value defined in the template.
        /// </summary>
        public readonly string? OutputValue;

        [OutputConstructor]
        private ProvisionedProductOutput(
            string? description,

            string? outputKey,

            string? outputValue)
        {
            Description = description;
            OutputKey = outputKey;
            OutputValue = outputValue;
        }
    }
}
