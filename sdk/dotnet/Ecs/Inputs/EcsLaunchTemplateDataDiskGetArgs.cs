// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class EcsLaunchTemplateDataDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category of the disk.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Indicates whether the data disk is released with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// The description of the data disk.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The mount point of the data disk.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// Encrypted the data in this disk.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The ID of the KMS key used for the data disk.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The name of the data disk.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The performance level of the ESSD used as the data disk.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The size of the data disk.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The snapshot ID used to initialize the data disk. If the size specified by snapshot is greater that the size of the disk, use the size specified by snapshot as the size of the data disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public EcsLaunchTemplateDataDiskGetArgs()
        {
        }
        public static new EcsLaunchTemplateDataDiskGetArgs Empty => new EcsLaunchTemplateDataDiskGetArgs();
    }
}
