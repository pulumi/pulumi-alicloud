// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class RuleRuleActionFixedResponseConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fixed response. The response cannot exceed 1 KB in size and can contain only ASCII characters.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// The format of the fixed response. Valid values: `text/plain`, `text/css`, `text/html`, `application/javascript`, and `application/json`.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// The redirect method. Valid values: `301`, `302`, `303`, `307`, and `308`.
        /// </summary>
        [Input("httpCode")]
        public Input<string>? HttpCode { get; set; }

        public RuleRuleActionFixedResponseConfigGetArgs()
        {
        }
        public static new RuleRuleActionFixedResponseConfigGetArgs Empty => new RuleRuleActionFixedResponseConfigGetArgs();
    }
}
