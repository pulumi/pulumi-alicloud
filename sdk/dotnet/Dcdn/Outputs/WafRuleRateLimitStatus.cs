// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn.Outputs
{

    [OutputType]
    public sealed class WafRuleRateLimitStatus
    {
        /// <summary>
        /// The HTTP status code returned.
        /// </summary>
        public readonly string? Code;
        /// <summary>
        /// The number of times that the HTTP status code that was returned. Valid values: 2 to 50000. You can configure only one of the `ratio` and `count` fields.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// The percentage of HTTP status codes. Valid values: 1 to 100. You can configure only one of the `ratio` and `count` fields.
        /// </summary>
        public readonly int? Ratio;

        [OutputConstructor]
        private WafRuleRateLimitStatus(
            string? code,

            int? count,

            int? ratio)
        {
            Code = code;
            Count = count;
            Ratio = ratio;
        }
    }
}
