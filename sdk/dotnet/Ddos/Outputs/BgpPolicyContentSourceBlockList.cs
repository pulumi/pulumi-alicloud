// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos.Outputs
{

    [OutputType]
    public sealed class BgpPolicyContentSourceBlockList
    {
        /// <summary>
        /// Statistical cycle range 60-1200.
        /// </summary>
        public readonly int BlockExpireSeconds;
        /// <summary>
        /// The time (unit second) for automatically releasing the black after triggering the speed limit is 60~2592000.
        /// </summary>
        public readonly int EverySeconds;
        /// <summary>
        /// The number of times the speed limit is exceeded in a statistical period ranges from 1 to 1200.
        /// </summary>
        public readonly int ExceedLimitTimes;
        /// <summary>
        /// Type
        /// </summary>
        public readonly int Type;

        [OutputConstructor]
        private BgpPolicyContentSourceBlockList(
            int blockExpireSeconds,

            int everySeconds,

            int exceedLimitTimes,

            int type)
        {
            BlockExpireSeconds = blockExpireSeconds;
            EverySeconds = everySeconds;
            ExceedLimitTimes = exceedLimitTimes;
            Type = type;
        }
    }
}
