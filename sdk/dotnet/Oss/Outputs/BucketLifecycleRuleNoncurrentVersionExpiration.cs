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
    public sealed class BucketLifecycleRuleNoncurrentVersionExpiration
    {
        /// <summary>
        /// Specifies the number of days noncurrent object versions transition.
        /// </summary>
        public readonly int Days;

        [OutputConstructor]
        private BucketLifecycleRuleNoncurrentVersionExpiration(int days)
        {
            Days = days;
        }
    }
}
