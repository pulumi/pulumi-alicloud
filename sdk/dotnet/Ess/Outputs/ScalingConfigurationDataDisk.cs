// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class ScalingConfigurationDataDisk
    {
        /// <summary>
        /// The id of auto snapshot policy for data disk.
        /// </summary>
        public readonly string? AutoSnapshotPolicyId;
        /// <summary>
        /// Category of data disk. The parameter value options are `ephemeral_ssd`, `cloud_efficiency`, `cloud_ssd` , `cloud_essd` and `cloud`.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Whether to delete data disks attached on ecs when release ecs instance. Optional value: `true` or `false`, default to `true`.
        /// </summary>
        public readonly bool? DeleteWithInstance;
        /// <summary>
        /// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The mount point of data disk N. Valid values of N: 1 to 16. If this parameter is not specified, the system automatically allocates a mount point to created ECS instances. The name of the mount point ranges from /dev/xvdb to /dev/xvdz in alphabetical order.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Specifies whether data disk N is to be encrypted. Valid values of N: 1 to 16. Valid values: `true`: encrypted, `false`: not encrypted. Default value: `false`.
        /// </summary>
        public readonly bool? Encrypted;
        /// <summary>
        /// The CMK ID for data disk N. Valid values of N: 1 to 16.
        /// </summary>
        public readonly string? KmsKeyId;
        /// <summary>
        /// The name of data disk N. Valid values of N: 1 to 16. It must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-). Default value: null.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The performance level of the ESSD used as data disk.
        /// </summary>
        public readonly string? PerformanceLevel;
        /// <summary>
        /// IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.
        /// </summary>
        public readonly int? ProvisionedIops;
        /// <summary>
        /// Size of data disk, in GB. The value ranges [5,2000] for a cloud disk, [5,1024] for an ephemeral disk, [5,800] for an ephemeral_ssd disk, [20,32768] for cloud_efficiency, cloud_ssd, cloud_essd disk.
        /// </summary>
        public readonly int? Size;
        /// <summary>
        /// Snapshot used for creating the data disk. If this parameter is specified, the size parameter is neglected, and the size of the created disk is the size of the snapshot.
        /// </summary>
        public readonly string? SnapshotId;

        [OutputConstructor]
        private ScalingConfigurationDataDisk(
            string? autoSnapshotPolicyId,

            string? category,

            bool? deleteWithInstance,

            string? description,

            string? device,

            bool? encrypted,

            string? kmsKeyId,

            string? name,

            string? performanceLevel,

            int? provisionedIops,

            int? size,

            string? snapshotId)
        {
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Description = description;
            Device = device;
            Encrypted = encrypted;
            KmsKeyId = kmsKeyId;
            Name = name;
            PerformanceLevel = performanceLevel;
            ProvisionedIops = provisionedIops;
            Size = size;
            SnapshotId = snapshotId;
        }
    }
}
