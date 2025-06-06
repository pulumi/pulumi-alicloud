// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.BastionHost.Outputs
{

    [OutputType]
    public sealed class GetHostsHostResult
    {
        /// <summary>
        /// Specify the new create a host of address types. Valid values: Public: the IP address of a Public network Private: Private network address.
        /// </summary>
        public readonly string ActiveAddressType;
        /// <summary>
        /// Specify a host of notes, supports up to 500 characters.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The host ID.
        /// </summary>
        public readonly string HostId;
        /// <summary>
        /// Specify the new create a host name of the supports up to 128 characters.
        /// </summary>
        public readonly string HostName;
        /// <summary>
        /// Specify the new create a host of the private network address, it is possible to use the domain name or IP ADDRESS.
        /// </summary>
        public readonly string HostPrivateAddress;
        /// <summary>
        /// Specify the new create a host of the IP address of a public network, it is possible to use the domain name or IP ADDRESS.
        /// </summary>
        public readonly string HostPublicAddress;
        /// <summary>
        /// The ID of the Host.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specify the new create a host where the Bastion host ID of.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Specify the new create the host's operating system. Valid values: Linux Windows.
        /// </summary>
        public readonly string OsType;
        /// <summary>
        /// The host of the protocol information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHostsHostProtocolResult> Protocols;
        /// <summary>
        /// Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// Specify the newly created ECS instance ID or dedicated cluster host ID.
        /// </summary>
        public readonly string SourceInstanceId;

        [OutputConstructor]
        private GetHostsHostResult(
            string activeAddressType,

            string comment,

            string hostId,

            string hostName,

            string hostPrivateAddress,

            string hostPublicAddress,

            string id,

            string instanceId,

            string osType,

            ImmutableArray<Outputs.GetHostsHostProtocolResult> protocols,

            string source,

            string sourceInstanceId)
        {
            ActiveAddressType = activeAddressType;
            Comment = comment;
            HostId = hostId;
            HostName = hostName;
            HostPrivateAddress = hostPrivateAddress;
            HostPublicAddress = hostPublicAddress;
            Id = id;
            InstanceId = instanceId;
            OsType = osType;
            Protocols = protocols;
            Source = source;
            SourceInstanceId = sourceInstanceId;
        }
    }
}
