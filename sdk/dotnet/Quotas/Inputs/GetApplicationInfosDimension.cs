// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas.Inputs
{

    public sealed class GetApplicationInfosDimensionArgs : global::Pulumi.InvokeArgs
    {
        [Input("key")]
        public string? Key { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetApplicationInfosDimensionArgs()
        {
        }
        public static new GetApplicationInfosDimensionArgs Empty => new GetApplicationInfosDimensionArgs();
    }
}
