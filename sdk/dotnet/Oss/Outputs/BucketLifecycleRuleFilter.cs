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
    public sealed class BucketLifecycleRuleFilter
    {
        /// <summary>
        /// The condition that is matched by objects to which the lifecycle rule does not apply. See `not` below.
        /// </summary>
        public readonly Outputs.BucketLifecycleRuleFilterNot? Not;
        /// <summary>
        /// Minimum object size (in bytes) to which the rule applies.
        /// </summary>
        public readonly int? ObjectSizeGreaterThan;
        /// <summary>
        /// Maximum object size (in bytes) to which the rule applies.
        /// </summary>
        public readonly int? ObjectSizeLessThan;

        [OutputConstructor]
        private BucketLifecycleRuleFilter(
            Outputs.BucketLifecycleRuleFilterNot? not,

            int? objectSizeGreaterThan,

            int? objectSizeLessThan)
        {
            Not = not;
            ObjectSizeGreaterThan = objectSizeGreaterThan;
            ObjectSizeLessThan = objectSizeLessThan;
        }
    }
}
