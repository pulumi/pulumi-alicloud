// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gwlb.Outputs
{

    [OutputType]
    public sealed class ServerGroupServer
    {
        /// <summary>
        /// The port used by the backend server.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The server group ID.
        /// </summary>
        public readonly string? ServerGroupId;
        /// <summary>
        /// The ID of the backend server.
        /// </summary>
        public readonly string ServerId;
        /// <summary>
        /// Server ip.
        /// </summary>
        public readonly string? ServerIp;
        /// <summary>
        /// Backend server type. Valid values:
        /// - `Ecs`: ECS instance.
        /// - `Eni`: ENI instance.
        /// - `Eci`: ECI elastic container.
        /// - `Ip`: Ip address.
        /// </summary>
        public readonly string ServerType;
        /// <summary>
        /// Server group status. Value:
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private ServerGroupServer(
            int? port,

            string? serverGroupId,

            string serverId,

            string? serverIp,

            string serverType,

            string? status)
        {
            Port = port;
            ServerGroupId = serverGroupId;
            ServerId = serverId;
            ServerIp = serverIp;
            ServerType = serverType;
            Status = status;
        }
    }
}