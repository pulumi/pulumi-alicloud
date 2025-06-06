// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class GetRulesRuleRuleConditionCookieConfigValueResult
    {
        /// <summary>
        /// The key of the query string.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The value of the query string.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetRulesRuleRuleConditionCookieConfigValueResult(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
