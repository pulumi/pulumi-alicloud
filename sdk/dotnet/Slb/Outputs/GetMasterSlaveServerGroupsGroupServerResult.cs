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
    public sealed class GetMasterSlaveServerGroupsGroupServerResult
    {
        /// <summary>
        /// ID of the attached ECS instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// (Removed from v1.63.0) Determine if the server is executing.
        /// </summary>
        public readonly int IsBackup;
        /// <summary>
        /// The port used by the master slave server group.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The server type of the attached ECS instance.
        /// </summary>
        public readonly string ServerType;
        /// <summary>
        /// Weight associated to the ECS instance.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetMasterSlaveServerGroupsGroupServerResult(
            string instanceId,

            int isBackup,

            int port,

            string serverType,

            int weight)
        {
            InstanceId = instanceId;
            IsBackup = isBackup;
            Port = port;
            ServerType = serverType;
            Weight = weight;
        }
    }
}
