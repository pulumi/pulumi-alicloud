// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gwlb.Inputs
{

    public sealed class ServerGroupServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port used by the backend server.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The server group ID.
        /// </summary>
        [Input("serverGroupId")]
        public Input<string>? ServerGroupId { get; set; }

        /// <summary>
        /// The ID of the backend server.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        /// <summary>
        /// Server ip.
        /// </summary>
        [Input("serverIp")]
        public Input<string>? ServerIp { get; set; }

        /// <summary>
        /// Backend server type. Valid values:
        /// - `Ecs`: ECS instance.
        /// - `Eni`: ENI instance.
        /// - `Eci`: ECI elastic container.
        /// - `Ip`: Ip address.
        /// </summary>
        [Input("serverType", required: true)]
        public Input<string> ServerType { get; set; } = null!;

        /// <summary>
        /// Server group status. Value:
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ServerGroupServerArgs()
        {
        }
        public static new ServerGroupServerArgs Empty => new ServerGroupServerArgs();
    }
}