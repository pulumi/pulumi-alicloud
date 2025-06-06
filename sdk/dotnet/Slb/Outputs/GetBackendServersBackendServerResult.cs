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
    public sealed class GetBackendServersBackendServerResult
    {
        /// <summary>
        /// backend server ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Type of the backend server.
        /// </summary>
        public readonly string ServerType;
        /// <summary>
        /// Weight associated to the ECS instance.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetBackendServersBackendServerResult(
            string id,

            string serverType,

            int weight)
        {
            Id = id;
            ServerType = serverType;
            Weight = weight;
        }
    }
}
