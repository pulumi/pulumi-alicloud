// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class EcsInstanceSetDataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the automatic snapshot policy applied to the system disk.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// The category of the disk. Valid values: `cloud_efficiency`, `cloud_ssd`, `cloud_essd`, `cloud`.
        /// </summary>
        [Input("diskCategory")]
        public Input<string>? DiskCategory { get; set; }

        /// <summary>
        /// The description of the data disk.
        /// </summary>
        [Input("diskDescription")]
        public Input<string>? DiskDescription { get; set; }

        /// <summary>
        /// The name of the data disk.
        /// </summary>
        [Input("diskName")]
        public Input<string>? DiskName { get; set; }

        /// <summary>
        /// The size of the data disk. Unit: GiB.
        /// - When `disk_category` is `cloud_efficiency`, Valid values: `20` to `32768`.
        /// - When `disk_category` is `cloud_ssd`, Valid values: `20` to `32768`.
        /// - When `disk_category` is `cloud_essd`, Valid values: `20` to `32768`.
        /// - When `disk_category` is `cloud`, Valid values: `5` to `200`.
        /// </summary>
        [Input("diskSize", required: true)]
        public Input<int> DiskSize { get; set; } = null!;

        /// <summary>
        /// Encrypted the data in this disk. Default value: `false`.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The KMS key ID corresponding to the data disk.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The performance level of the ESSD used as data disk. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public EcsInstanceSetDataDiskGetArgs()
        {
        }
        public static new EcsInstanceSetDataDiskGetArgs Empty => new EcsInstanceSetDataDiskGetArgs();
    }
}
