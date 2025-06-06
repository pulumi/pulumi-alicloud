// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketWebsiteRoutingRulesRoutingRuleCondition
    {
        /// <summary>
        /// When the specified Object is accessed, this status is returned to match this rule. This field must be 404 when the jump rule is mirrored back to the source.
        /// </summary>
        public readonly string? HttpErrorCodeReturnedEquals;
        /// <summary>
        /// This rule can only be matched if the request contains the specified Header and the value is the specified value. You can specify up to 10 containers. See `include_headers` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketWebsiteRoutingRulesRoutingRuleConditionIncludeHeader> IncludeHeaders;
        /// <summary>
        /// Only objects that match this prefix can match this rule.
        /// </summary>
        public readonly string? KeyPrefixEquals;
        /// <summary>
        /// Only objects that match this suffix can match this rule.
        /// </summary>
        public readonly string? KeySuffixEquals;

        [OutputConstructor]
        private BucketWebsiteRoutingRulesRoutingRuleCondition(
            string? httpErrorCodeReturnedEquals,

            ImmutableArray<Outputs.BucketWebsiteRoutingRulesRoutingRuleConditionIncludeHeader> includeHeaders,

            string? keyPrefixEquals,

            string? keySuffixEquals)
        {
            HttpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            IncludeHeaders = includeHeaders;
            KeyPrefixEquals = keyPrefixEquals;
            KeySuffixEquals = keySuffixEquals;
        }
    }
}
