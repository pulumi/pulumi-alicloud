// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas.Outputs
{

    [OutputType]
    public sealed class GetDataFlowsFlowResult
    {
        /// <summary>
        /// The time when Fileset was created. Executing the ISO8601 standard means that the return format is: 'yyyy-MM-ddTHH:mm:ssZ'.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the Data Flow.
        /// </summary>
        public readonly string DataFlowId;
        /// <summary>
        /// The Description of data flow.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Error message.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        public readonly string FileSystemId;
        /// <summary>
        /// The path of Fileset in the CPFS file system.
        /// </summary>
        public readonly string FileSystemPath;
        /// <summary>
        /// Description of automatic update.
        /// </summary>
        public readonly string FsetDescription;
        /// <summary>
        /// The ID of the Fileset.
        /// </summary>
        public readonly string FsetId;
        /// <summary>
        /// The resource ID of the data flow. The value formats as `&lt;file_system_id&gt;:&lt;data_flow_id&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The security protection type of the source storage.
        /// </summary>
        public readonly string SourceSecurityType;
        /// <summary>
        /// The access path of the source store. Format: `&lt;storage type&gt;://&lt;path&gt;`.
        /// </summary>
        public readonly string SourceStorage;
        /// <summary>
        /// The status of the Data flow.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The maximum transmission bandwidth of data flow, unit: `MB/s`.
        /// </summary>
        public readonly int Throughput;

        [OutputConstructor]
        private GetDataFlowsFlowResult(
            string createTime,

            string dataFlowId,

            string description,

            string errorMessage,

            string fileSystemId,

            string fileSystemPath,

            string fsetDescription,

            string fsetId,

            string id,

            string sourceSecurityType,

            string sourceStorage,

            string status,

            int throughput)
        {
            CreateTime = createTime;
            DataFlowId = dataFlowId;
            Description = description;
            ErrorMessage = errorMessage;
            FileSystemId = fileSystemId;
            FileSystemPath = fileSystemPath;
            FsetDescription = fsetDescription;
            FsetId = fsetId;
            Id = id;
            SourceSecurityType = sourceSecurityType;
            SourceStorage = sourceStorage;
            Status = status;
            Throughput = throughput;
        }
    }
}
