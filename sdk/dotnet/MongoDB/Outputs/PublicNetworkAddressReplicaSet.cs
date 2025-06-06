// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB.Outputs
{

    [OutputType]
    public sealed class PublicNetworkAddressReplicaSet
    {
        /// <summary>
        /// The connection address of the node.
        /// </summary>
        public readonly string? ConnectionDomain;
        /// <summary>
        /// The connection port of the node.
        /// </summary>
        public readonly string? ConnectionPort;
        /// <summary>
        /// The connection type.
        /// </summary>
        public readonly string? ConnectionType;
        /// <summary>
        /// The network type, should be always "Public".
        /// </summary>
        public readonly string? NetworkType;
        /// <summary>
        /// The role of the node.
        /// </summary>
        public readonly string? ReplicaSetRole;
        /// <summary>
        /// The id of the role.
        /// </summary>
        public readonly string? RoleId;

        [OutputConstructor]
        private PublicNetworkAddressReplicaSet(
            string? connectionDomain,

            string? connectionPort,

            string? connectionType,

            string? networkType,

            string? replicaSetRole,

            string? roleId)
        {
            ConnectionDomain = connectionDomain;
            ConnectionPort = connectionPort;
            ConnectionType = connectionType;
            NetworkType = networkType;
            ReplicaSetRole = replicaSetRole;
            RoleId = roleId;
        }
    }
}
