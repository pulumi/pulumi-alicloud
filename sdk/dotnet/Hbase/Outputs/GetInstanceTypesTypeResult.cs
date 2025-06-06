// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbase.Outputs
{

    [OutputType]
    public sealed class GetInstanceTypesTypeResult
    {
        /// <summary>
        /// Cpu size of the instance type.
        /// </summary>
        public readonly int CpuSize;
        /// <summary>
        /// Mem size of the instance type.
        /// </summary>
        public readonly int MemSize;
        /// <summary>
        /// Name of the instance type.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetInstanceTypesTypeResult(
            int cpuSize,

            int memSize,

            string value)
        {
            CpuSize = cpuSize;
            MemSize = memSize;
            Value = value;
        }
    }
}
