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
    public sealed class LaunchTemplateDataDisk
    {
        /// <summary>
        /// The category of the disk:
        /// - cloud: Basic cloud disk.
        /// - cloud_efficiency: Ultra cloud disk.
        /// - cloud_ssd: SSD cloud Disks.
        /// - ephemeral_ssd: local SSD Disks
        /// - cloud_essd: ESSD cloud Disks.
        /// 
        /// Default to `cloud_efficiency`.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// Delete this data disk when the instance is destroyed. It only works on cloud, cloud_efficiency, cloud_ssd and cloud_essd disk. If the category of this data disk was ephemeral_ssd, please don't set this param.
        /// 
        /// Default to true
        /// </summary>
        public readonly bool? DeleteWithInstance;
        /// <summary>
        /// The description of the data disk.
        /// </summary>
        public readonly string? Description;
        public readonly string? Device;
        /// <summary>
        /// Encrypted the data in this disk.
        /// 
        /// Default to false
        /// </summary>
        public readonly bool? Encrypted;
        public readonly string? KmsKeyId;
        /// <summary>
        /// The name of the data disk.
        /// </summary>
        public readonly string? Name;
        public readonly string? PerformanceLevel;
        /// <summary>
        /// The size of the data disk.
        /// - cloud：[5, 2000]
        /// - cloud_efficiency：[20, 32768]
        /// - cloud_ssd：[20, 32768]
        /// - cloud_essd：[20, 32768]
        /// - ephemeral_ssd: [5, 800]
        /// </summary>
        public readonly int? Size;
        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        public readonly string? SnapshotId;

        [OutputConstructor]
        private LaunchTemplateDataDisk(
            string? category,

            bool? deleteWithInstance,

            string? description,

            string? device,

            bool? encrypted,

            string? kmsKeyId,

            string? name,

            string? performanceLevel,

            int? size,

            string? snapshotId)
        {
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Description = description;
            Device = device;
            Encrypted = encrypted;
            KmsKeyId = kmsKeyId;
            Name = name;
            PerformanceLevel = performanceLevel;
            Size = size;
            SnapshotId = snapshotId;
        }
    }
}
