// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Inputs
{

    public sealed class GetInstanceClassInfosInfoInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code of the instance type.
        /// </summary>
        [Input("classCode")]
        public Input<string>? ClassCode { get; set; }

        /// <summary>
        /// The instance family of the instance.
        /// </summary>
        [Input("classGroup")]
        public Input<string>? ClassGroup { get; set; }

        /// <summary>
        /// The number of cores that are supported by the instance type. Unit: cores.
        /// </summary>
        [Input("cpu")]
        public Input<string>? Cpu { get; set; }

        /// <summary>
        /// The architecture of the instance type.
        /// </summary>
        [Input("instructionSetArch")]
        public Input<string>? InstructionSetArch { get; set; }

        /// <summary>
        /// The maximum number of connections that are supported by the instance type. Unit: connections.
        /// </summary>
        [Input("maxConnections")]
        public Input<string>? MaxConnections { get; set; }

        /// <summary>
        /// The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.
        /// </summary>
        [Input("maxIombps")]
        public Input<string>? MaxIombps { get; set; }

        /// <summary>
        /// The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.
        /// </summary>
        [Input("maxIops")]
        public Input<string>? MaxIops { get; set; }

        /// <summary>
        /// The memory capacity that is supported by the instance type. Unit: GB.
        /// </summary>
        [Input("memoryClass")]
        public Input<string>? MemoryClass { get; set; }

        /// <summary>
        /// The fee that you must pay for the instance type. Unit: cent (USD).
        /// </summary>
        [Input("referencePrice")]
        public Input<string>? ReferencePrice { get; set; }

        public GetInstanceClassInfosInfoInputArgs()
        {
        }
        public static new GetInstanceClassInfosInfoInputArgs Empty => new GetInstanceClassInfosInfoInputArgs();
    }
}
