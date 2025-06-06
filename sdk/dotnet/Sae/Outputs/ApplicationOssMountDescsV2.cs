// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class ApplicationOssMountDescsV2
    {
        /// <summary>
        /// The name of the OSS bucket.
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// The directory or object in OSS.
        /// </summary>
        public readonly string? BucketPath;
        /// <summary>
        /// The path of the container in SAE.
        /// </summary>
        public readonly string? MountPath;
        /// <summary>
        /// Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
        /// </summary>
        public readonly bool? ReadOnly;

        [OutputConstructor]
        private ApplicationOssMountDescsV2(
            string? bucketName,

            string? bucketPath,

            string? mountPath,

            bool? readOnly)
        {
            BucketName = bucketName;
            BucketPath = bucketPath;
            MountPath = mountPath;
            ReadOnly = readOnly;
        }
    }
}
