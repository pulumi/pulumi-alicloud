// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Esa.Inputs
{

    public sealed class HttpResponseHeaderModificationRuleResponseHeaderModificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The response header name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Operation method. Possible values:
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// The response header value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public HttpResponseHeaderModificationRuleResponseHeaderModificationArgs()
        {
        }
        public static new HttpResponseHeaderModificationRuleResponseHeaderModificationArgs Empty => new HttpResponseHeaderModificationRuleResponseHeaderModificationArgs();
    }
}
