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
    public sealed class ImageImportDiskDeviceMapping
    {
        /// <summary>
        /// The device name of the disk.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The size of the disk. Default value: `5`.
        /// </summary>
        public readonly int? DiskImageSize;
        /// <summary>
        /// The format of the image. Valid values: `RAW`, `VHD`, `qcow2`.
        /// </summary>
        public readonly string? Format;
        /// <summary>
        /// The OSS bucket where the image file is stored.
        /// </summary>
        public readonly string? OssBucket;
        /// <summary>
        /// The name (key) of the object that the uploaded image is stored as in the OSS bucket.
        /// </summary>
        public readonly string? OssObject;

        [OutputConstructor]
        private ImageImportDiskDeviceMapping(
            string? device,

            int? diskImageSize,

            string? format,

            string? ossBucket,

            string? ossObject)
        {
            Device = device;
            DiskImageSize = diskImageSize;
            Format = format;
            OssBucket = ossBucket;
            OssObject = ossObject;
        }
    }
}
