// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas.Inputs
{

    public sealed class GetQuotasDimensionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The key of dimensions.
        /// </summary>
        [Input("key")]
        public string? Key { get; set; }

        /// <summary>
        /// The value of dimensions.
        /// </summary>
        [Input("value")]
        public string? Value { get; set; }

        public GetQuotasDimensionArgs()
        {
        }
        public static new GetQuotasDimensionArgs Empty => new GetQuotasDimensionArgs();
    }
}
