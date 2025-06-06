// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class GetGreyTagRoutesRouteScRuleResult
    {
        /// <summary>
        /// The Conditional Patterns for Grayscale Rules.
        /// </summary>
        public readonly string Condition;
        /// <summary>
        /// A list of conditions items.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGreyTagRoutesRouteScRuleItemResult> Items;
        /// <summary>
        /// The path corresponding to the grayscale rule.
        /// </summary>
        public readonly string Path;

        [OutputConstructor]
        private GetGreyTagRoutesRouteScRuleResult(
            string condition,

            ImmutableArray<Outputs.GetGreyTagRoutesRouteScRuleItemResult> items,

            string path)
        {
            Condition = condition;
            Items = items;
            Path = path;
        }
    }
}
