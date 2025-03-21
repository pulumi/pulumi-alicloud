// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas.Outputs
{

    [OutputType]
    public sealed class FileSystemRecycleBin
    {
        /// <summary>
        /// The time at which the recycle bin was enabled.
        /// </summary>
        public readonly string? EnableTime;
        /// <summary>
        /// The retention period of the files in the recycle bin. Unit: days. Default value: `3`. Valid values: `1` to `180`. **NOTE:** `reserved_days` takes effect only if `status` is set to `Enable`.
        /// </summary>
        public readonly int? ReservedDays;
        /// <summary>
        /// The size of the Infrequent Access (IA) data that is dumped to the recycle bin.
        /// </summary>
        public readonly int? SecondarySize;
        /// <summary>
        /// The size of the files that are dumped to the recycle bin.
        /// </summary>
        public readonly int? Size;
        /// <summary>
        /// Specifies whether to enable the recycle bin feature. Default value: `Disable`. Valid values: `Enable`, `Disable`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private FileSystemRecycleBin(
            string? enableTime,

            int? reservedDays,

            int? secondarySize,

            int? size,

            string? status)
        {
            EnableTime = enableTime;
            ReservedDays = reservedDays;
            SecondarySize = secondarySize;
            Size = size;
            Status = status;
        }
    }
}
