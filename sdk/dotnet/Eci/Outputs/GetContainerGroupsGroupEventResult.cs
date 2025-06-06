// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class GetContainerGroupsGroupEventResult
    {
        /// <summary>
        /// The number of events.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The time when the event started.
        /// </summary>
        public readonly string FirstTimestamp;
        /// <summary>
        /// The time when the event ended.
        /// </summary>
        public readonly string LastTimestamp;
        /// <summary>
        /// The content of the event.
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// The name of the object to which the event belongs.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the event.
        /// </summary>
        public readonly string Reason;
        /// <summary>
        /// The type of the event. Valid values: Normal and Warning.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetContainerGroupsGroupEventResult(
            int count,

            string firstTimestamp,

            string lastTimestamp,

            string message,

            string name,

            string reason,

            string type)
        {
            Count = count;
            FirstTimestamp = firstTimestamp;
            LastTimestamp = lastTimestamp;
            Message = message;
            Name = name;
            Reason = reason;
            Type = type;
        }
    }
}
