// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds.Outputs
{

    [OutputType]
    public sealed class GetRamDirectoriesDirectoryLogResult
    {
        /// <summary>
        /// The level of log.
        /// </summary>
        public readonly string Level;
        /// <summary>
        /// The message of log.
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// The step of log.
        /// </summary>
        public readonly string Step;
        /// <summary>
        /// The time stamp of log.
        /// </summary>
        public readonly string TimeStamp;

        [OutputConstructor]
        private GetRamDirectoriesDirectoryLogResult(
            string level,

            string message,

            string step,

            string timeStamp)
        {
            Level = level;
            Message = message;
            Step = step;
            TimeStamp = timeStamp;
        }
    }
}
