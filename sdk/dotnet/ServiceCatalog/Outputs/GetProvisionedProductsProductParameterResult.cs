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
    public sealed class GetProvisionedProductsProductParameterResult
    {
        public readonly string ParameterKey;
        public readonly string ParameterValue;

        [OutputConstructor]
        private GetProvisionedProductsProductParameterResult(
            string parameterKey,

            string parameterValue)
        {
            ParameterKey = parameterKey;
            ParameterValue = parameterValue;
        }
    }
}
