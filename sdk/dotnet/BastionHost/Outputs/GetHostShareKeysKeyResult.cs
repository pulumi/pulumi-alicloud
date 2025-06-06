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
    public sealed class GetHostShareKeysKeyResult
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string HostShareKeyId;
        /// <summary>
        /// The name of the host shared key.
        /// </summary>
        public readonly string HostShareKeyName;
        /// <summary>
        /// The ID of the Host Share Key.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Bastion instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The fingerprint of the private key.
        /// </summary>
        public readonly string PrivateKeyFingerPrint;

        [OutputConstructor]
        private GetHostShareKeysKeyResult(
            string hostShareKeyId,

            string hostShareKeyName,

            string id,

            string instanceId,

            string privateKeyFingerPrint)
        {
            HostShareKeyId = hostShareKeyId;
            HostShareKeyName = hostShareKeyName;
            Id = id;
            InstanceId = instanceId;
            PrivateKeyFingerPrint = privateKeyFingerPrint;
        }
    }
}
