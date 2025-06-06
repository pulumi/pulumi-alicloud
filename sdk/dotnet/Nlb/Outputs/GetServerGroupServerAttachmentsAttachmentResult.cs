// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb.Outputs
{

    [OutputType]
    public sealed class GetServerGroupServerAttachmentsAttachmentResult
    {
        /// <summary>
        /// The description of the backend server.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the server group. The value is formulated as `&lt;server_group_id&gt;:&lt;server_id&gt;:&lt;server_type&gt;:&lt;port&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The port used by the backend server.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The ID of the server group.
        /// </summary>
        public readonly string ServerGroupId;
        /// <summary>
        /// The ID of the server.
        /// </summary>
        public readonly string ServerId;
        /// <summary>
        /// The IP address of the backend server.
        /// </summary>
        public readonly string ServerIp;
        /// <summary>
        /// The type of the backend server.
        /// </summary>
        public readonly string ServerType;
        /// <summary>
        /// Indicates the status of the backend server.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The weight of the backend server.
        /// </summary>
        public readonly int Weight;
        /// <summary>
        /// The zone ID of the server.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetServerGroupServerAttachmentsAttachmentResult(
            string description,

            string id,

            int port,

            string serverGroupId,

            string serverId,

            string serverIp,

            string serverType,

            string status,

            int weight,

            string zoneId)
        {
            Description = description;
            Id = id;
            Port = port;
            ServerGroupId = serverGroupId;
            ServerId = serverId;
            ServerIp = serverIp;
            ServerType = serverType;
            Status = status;
            Weight = weight;
            ZoneId = zoneId;
        }
    }
}
