// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cassandra.Outputs
{

    [OutputType]
    public sealed class GetBackupPlansPlanResult
    {
        /// <summary>
        /// Specifies whether to activate the backup plan.
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
        /// </summary>
        public readonly string BackupPeriod;
        /// <summary>
        /// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
        /// </summary>
        public readonly string BackupTime;
        /// <summary>
        /// The ID of the cluster for the backup.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The time when the backup plan was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the data center for the backup in the cluster.
        /// </summary>
        public readonly string DataCenterId;
        /// <summary>
        /// The ID of the Backup Plan.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
        /// </summary>
        public readonly int RetentionPeriod;

        [OutputConstructor]
        private GetBackupPlansPlanResult(
            bool active,

            string backupPeriod,

            string backupTime,

            string clusterId,

            string createTime,

            string dataCenterId,

            string id,

            int retentionPeriod)
        {
            Active = active;
            BackupPeriod = backupPeriod;
            BackupTime = backupTime;
            ClusterId = clusterId;
            CreateTime = createTime;
            DataCenterId = dataCenterId;
            Id = id;
            RetentionPeriod = retentionPeriod;
        }
    }
}
