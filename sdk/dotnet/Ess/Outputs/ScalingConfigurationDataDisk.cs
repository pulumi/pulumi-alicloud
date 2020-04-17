// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        public readonly string? Category;
        public readonly bool? DeleteWithInstance;
        public readonly string? Device;
        public readonly int? Size;
        public readonly string? SnapshotId;

        [OutputConstructor]
        private ScalingConfigurationDataDisk(
            string? category,

            bool? deleteWithInstance,

            string? device,

            int? size,

            string? snapshotId)
        {
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Device = device;
            Size = size;
            SnapshotId = snapshotId;
        }
    }
}