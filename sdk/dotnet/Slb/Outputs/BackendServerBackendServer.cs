// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb.Outputs
{

    [OutputType]
    public sealed class BackendServerBackendServer
    {
        public readonly string ServerId;
        public readonly string? ServerIp;
        public readonly string? Type;
        public readonly int Weight;

        [OutputConstructor]
        private BackendServerBackendServer(
            string serverId,

            string? serverIp,

            string? type,

            int weight)
        {
            ServerId = serverId;
            ServerIp = serverIp;
            Type = type;
            Weight = weight;
        }
    }
}
