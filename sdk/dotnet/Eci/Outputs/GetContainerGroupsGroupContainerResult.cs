// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class GetContainerGroupsGroupContainerResult
    {
        /// <summary>
        /// The arguments passed to the commands. Maximum: `10`.
        /// </summary>
        public readonly ImmutableArray<string> Args;
        /// <summary>
        /// The commands run by the container. You can define a maximum of 20 commands. Minimum length per string: 256 characters.
        /// </summary>
        public readonly ImmutableArray<string> Commands;
        /// <summary>
        /// The amount of CPU resources allocated to the container.
        /// </summary>
        public readonly double Cpu;
        /// <summary>
        /// The environment variables.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerGroupsGroupContainerEnvironmentVarResult> EnvironmentVars;
        /// <summary>
        /// The amount of GPU resources allocated to the container.
        /// </summary>
        public readonly int Gpu;
        /// <summary>
        /// The image of the container.
        /// </summary>
        public readonly string Image;
        /// <summary>
        /// The policy for pulling an image.
        /// </summary>
        public readonly string ImagePullPolicy;
        /// <summary>
        /// The amount of memory resources allocated to the container.
        /// </summary>
        public readonly double Memory;
        /// <summary>
        /// The name of the container.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The list of exposed ports and protocols. Maximum: 100.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerGroupsGroupContainerPortResult> Ports;
        /// <summary>
        /// Indicates whether the container is ready.
        /// </summary>
        public readonly bool Ready;
        /// <summary>
        /// The number of times that the container has restarted.
        /// </summary>
        public readonly int RestartCount;
        /// <summary>
        /// The list of volumes mounted to the container.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerGroupsGroupContainerVolumeMountResult> VolumeMounts;
        /// <summary>
        /// The working directory of the container.
        /// </summary>
        public readonly string WorkingDir;

        [OutputConstructor]
        private GetContainerGroupsGroupContainerResult(
            ImmutableArray<string> args,

            ImmutableArray<string> commands,

            double cpu,

            ImmutableArray<Outputs.GetContainerGroupsGroupContainerEnvironmentVarResult> environmentVars,

            int gpu,

            string image,

            string imagePullPolicy,

            double memory,

            string name,

            ImmutableArray<Outputs.GetContainerGroupsGroupContainerPortResult> ports,

            bool ready,

            int restartCount,

            ImmutableArray<Outputs.GetContainerGroupsGroupContainerVolumeMountResult> volumeMounts,

            string workingDir)
        {
            Args = args;
            Commands = commands;
            Cpu = cpu;
            EnvironmentVars = environmentVars;
            Gpu = gpu;
            Image = image;
            ImagePullPolicy = imagePullPolicy;
            Memory = memory;
            Name = name;
            Ports = ports;
            Ready = ready;
            RestartCount = restartCount;
            VolumeMounts = volumeMounts;
            WorkingDir = workingDir;
        }
    }
}
