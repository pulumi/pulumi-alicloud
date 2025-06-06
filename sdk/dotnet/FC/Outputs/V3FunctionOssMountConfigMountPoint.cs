// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V3FunctionOssMountConfigMountPoint
    {
        /// <summary>
        /// OSS Bucket name
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// Path of the mounted OSS Bucket
        /// </summary>
        public readonly string? BucketPath;
        /// <summary>
        /// OSS access endpoint
        /// </summary>
        public readonly string? Endpoint;
        public readonly string? MountDir;
        /// <summary>
        /// Read-only
        /// </summary>
        public readonly bool? ReadOnly;

        [OutputConstructor]
        private V3FunctionOssMountConfigMountPoint(
            string? bucketName,

            string? bucketPath,

            string? endpoint,

            string? mountDir,

            bool? readOnly)
        {
            BucketName = bucketName;
            BucketPath = bucketPath;
            Endpoint = endpoint;
            MountDir = mountDir;
            ReadOnly = readOnly;
        }
    }
}
