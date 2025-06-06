// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class V3FunctionOssMountConfigMountPointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OSS Bucket name
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        /// <summary>
        /// Path of the mounted OSS Bucket
        /// </summary>
        [Input("bucketPath")]
        public Input<string>? BucketPath { get; set; }

        /// <summary>
        /// OSS access endpoint
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("mountDir")]
        public Input<string>? MountDir { get; set; }

        /// <summary>
        /// Read-only
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public V3FunctionOssMountConfigMountPointGetArgs()
        {
        }
        public static new V3FunctionOssMountConfigMountPointGetArgs Empty => new V3FunctionOssMountConfigMountPointGetArgs();
    }
}
