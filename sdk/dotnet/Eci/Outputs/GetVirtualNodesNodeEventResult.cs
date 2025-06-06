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
    public sealed class GetVirtualNodesNodeEventResult
    {
        /// <summary>
        /// The number of occurrences.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The first presentation time stamp.
        /// </summary>
        public readonly string FirstTimestamp;
        /// <summary>
        /// The most recent time stamp.
        /// </summary>
        public readonly string LastTimestamp;
        /// <summary>
        /// The event of the message body.
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// The name of the event.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The causes of the incident.
        /// </summary>
        public readonly string Reason;
        /// <summary>
        /// The Event type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetVirtualNodesNodeEventResult(
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
