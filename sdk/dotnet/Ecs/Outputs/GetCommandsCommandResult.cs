// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetCommandsCommandResult
    {
        /// <summary>
        /// The Base64-encoded content of the command.
        /// </summary>
        public readonly string CommandContent;
        /// <summary>
        /// The ID of the Command.
        /// </summary>
        public readonly string CommandId;
        /// <summary>
        /// The description of command.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Specifies whether to use custom parameters in the command to be created.
        /// </summary>
        public readonly bool EnableParameter;
        /// <summary>
        /// The ID of the Command.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the command
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of custom parameter names which are parsed from the command content specified when the command was being created.
        /// </summary>
        public readonly ImmutableArray<string> ParameterNames;
        /// <summary>
        /// The timeout period that is specified for the command to be run on ECS instances.
        /// </summary>
        public readonly int Timeout;
        /// <summary>
        /// The command type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The execution path of the command in the ECS instance.
        /// </summary>
        public readonly string WorkingDir;

        [OutputConstructor]
        private GetCommandsCommandResult(
            string commandContent,

            string commandId,

            string description,

            bool enableParameter,

            string id,

            string name,

            ImmutableArray<string> parameterNames,

            int timeout,

            string type,

            string workingDir)
        {
            CommandContent = commandContent;
            CommandId = commandId;
            Description = description;
            EnableParameter = enableParameter;
            Id = id;
            Name = name;
            ParameterNames = parameterNames;
            Timeout = timeout;
            Type = type;
            WorkingDir = workingDir;
        }
    }
}
