// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Outputs
{

    [OutputType]
    public sealed class ConnectionIkeConfig
    {
        /// <summary>
        /// IKE auth Algorithm.
        /// </summary>
        public readonly string? IkeAuthAlg;
        /// <summary>
        /// IKE encript algorithm.
        /// </summary>
        public readonly string? IkeEncAlg;
        /// <summary>
        /// IKE lifetime.
        /// </summary>
        public readonly int? IkeLifetime;
        /// <summary>
        /// The local ID, which supports the FQDN and IP formats, and defaults to the IP address of the selected VPN gateway.
        /// </summary>
        public readonly string? IkeLocalId;
        /// <summary>
        /// IKE mode, supports main and aggressive mode. The main mode is highly secure. If NAT traversal is enabled, we recommend that you use the aggressive mode.
        /// </summary>
        public readonly string? IkeMode;
        /// <summary>
        /// DH group.
        /// </summary>
        public readonly string? IkePfs;
        /// <summary>
        /// The peer ID. The FQDN and IP address formats are supported. The default value is the IP address of the selected customer gateway.
        /// </summary>
        public readonly string? IkeRemoteId;
        /// <summary>
        /// IKE version.
        /// </summary>
        public readonly string? IkeVersion;
        /// <summary>
        /// Preshared secret key.
        /// </summary>
        public readonly string? Psk;

        [OutputConstructor]
        private ConnectionIkeConfig(
            string? ikeAuthAlg,

            string? ikeEncAlg,

            int? ikeLifetime,

            string? ikeLocalId,

            string? ikeMode,

            string? ikePfs,

            string? ikeRemoteId,

            string? ikeVersion,

            string? psk)
        {
            IkeAuthAlg = ikeAuthAlg;
            IkeEncAlg = ikeEncAlg;
            IkeLifetime = ikeLifetime;
            IkeLocalId = ikeLocalId;
            IkeMode = ikeMode;
            IkePfs = ikePfs;
            IkeRemoteId = ikeRemoteId;
            IkeVersion = ikeVersion;
            Psk = psk;
        }
    }
}