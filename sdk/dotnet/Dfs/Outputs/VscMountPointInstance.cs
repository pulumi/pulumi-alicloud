// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs.Outputs
{

    [OutputType]
    public sealed class VscMountPointInstance
    {
        /// <summary>
        /// The ID of the ECS instance to which the HDFS file system is mounted.
        /// </summary>
        public readonly string? InstanceId;
        /// <summary>
        /// The status of the ECS instance on which the HDFS file system is mounted.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The VSC list of mounted HDFS file systems.
        /// </summary>
        public readonly ImmutableArray<Outputs.VscMountPointInstanceVsc> Vscs;

        [OutputConstructor]
        private VscMountPointInstance(
            string? instanceId,

            string? status,

            ImmutableArray<Outputs.VscMountPointInstanceVsc> vscs)
        {
            InstanceId = instanceId;
            Status = status;
            Vscs = vscs;
        }
    }
}
