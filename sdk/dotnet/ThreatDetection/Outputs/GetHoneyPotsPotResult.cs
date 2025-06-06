// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection.Outputs
{

    [OutputType]
    public sealed class GetHoneyPotsPotResult
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        public readonly string HoneypotId;
        /// <summary>
        /// The image ID of the honeypot.
        /// </summary>
        public readonly string HoneypotImageId;
        /// <summary>
        /// Honeypot mirror name.
        /// </summary>
        public readonly string HoneypotImageName;
        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        public readonly string HoneypotName;
        /// <summary>
        /// Honeypot ID. The value is the same as `honeypot_id`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        public readonly string NodeId;
        /// <summary>
        /// The custom parameter ID of honeypot.
        /// </summary>
        public readonly string PresetId;
        /// <summary>
        /// Honeypot status.
        /// </summary>
        public readonly ImmutableArray<string> States;
        /// <summary>
        /// The status of the resource
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetHoneyPotsPotResult(
            string honeypotId,

            string honeypotImageId,

            string honeypotImageName,

            string honeypotName,

            string id,

            string nodeId,

            string presetId,

            ImmutableArray<string> states,

            string status)
        {
            HoneypotId = honeypotId;
            HoneypotImageId = honeypotImageId;
            HoneypotImageName = honeypotImageName;
            HoneypotName = honeypotName;
            Id = id;
            NodeId = nodeId;
            PresetId = presetId;
            States = states;
            Status = status;
        }
    }
}
