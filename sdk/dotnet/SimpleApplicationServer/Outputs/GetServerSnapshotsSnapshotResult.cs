// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SimpleApplicationServer.Outputs
{

    [OutputType]
    public sealed class GetServerSnapshotsSnapshotResult
    {
        /// <summary>
        /// The time when the snapshot was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the source disk. This parameter has a value even after the source disk is released.
        /// </summary>
        public readonly string DiskId;
        /// <summary>
        /// The ID of the Snapshot.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The progress of snapshot creation.
        /// </summary>
        public readonly string Progress;
        /// <summary>
        /// The remarks of the snapshot.
        /// </summary>
        public readonly string Remark;
        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        public readonly string SnapshotName;
        /// <summary>
        /// A snapshot of the source of a disk type. Possible values: `System`, `Data`.
        /// </summary>
        public readonly string SourceDiskType;
        /// <summary>
        /// The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetServerSnapshotsSnapshotResult(
            string createTime,

            string diskId,

            string id,

            string progress,

            string remark,

            string snapshotId,

            string snapshotName,

            string sourceDiskType,

            string status)
        {
            CreateTime = createTime;
            DiskId = diskId;
            Id = id;
            Progress = progress;
            Remark = remark;
            SnapshotId = snapshotId;
            SnapshotName = snapshotName;
            SourceDiskType = sourceDiskType;
            Status = status;
        }
    }
}
