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
    public sealed class GetBucketsBucketRefererConfigResult
    {
        /// <summary>
        /// Indicate whether the access request referer field can be empty.
        /// </summary>
        public readonly bool AllowEmpty;
        /// <summary>
        /// Referer access whitelist.
        /// </summary>
        public readonly ImmutableArray<string> Referers;

        [OutputConstructor]
        private GetBucketsBucketRefererConfigResult(
            bool allowEmpty,

            ImmutableArray<string> referers)
        {
            AllowEmpty = allowEmpty;
            Referers = referers;
        }
    }
}
