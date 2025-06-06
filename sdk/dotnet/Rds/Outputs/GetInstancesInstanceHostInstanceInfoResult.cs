// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceHostInstanceInfoResult
    {
        /// <summary>
        /// The time when the secondary instance completed the synchronization of data from the primary instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string DataSyncTime;
        /// <summary>
        /// The time when the secondary instance received logs from the primary instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string LogSyncTime;
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        public readonly string NodeId;
        /// <summary>
        /// The type of the node.
        /// </summary>
        public readonly string NodeType;
        /// <summary>
        /// The region ID of the instance.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The synchronization status.
        /// </summary>
        public readonly string SyncStatus;
        /// <summary>
        /// The ID of the zone.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetInstancesInstanceHostInstanceInfoResult(
            string dataSyncTime,

            string logSyncTime,

            string nodeId,

            string nodeType,

            string regionId,

            string syncStatus,

            string zoneId)
        {
            DataSyncTime = dataSyncTime;
            LogSyncTime = logSyncTime;
            NodeId = nodeId;
            NodeType = nodeType;
            RegionId = regionId;
            SyncStatus = syncStatus;
            ZoneId = zoneId;
        }
    }
}
