// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Esa.Inputs
{

    public sealed class HttpRequestHeaderModificationRuleRequestHeaderModificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Request Header Name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Mode of operation. Value range:
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Request header value
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public HttpRequestHeaderModificationRuleRequestHeaderModificationArgs()
        {
        }
        public static new HttpRequestHeaderModificationRuleRequestHeaderModificationArgs Empty => new HttpRequestHeaderModificationRuleRequestHeaderModificationArgs();
    }
}
