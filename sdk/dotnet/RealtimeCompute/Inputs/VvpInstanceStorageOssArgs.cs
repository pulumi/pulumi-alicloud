// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RealtimeCompute.Inputs
{

    public sealed class VvpInstanceStorageOssArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OSS Bucket name.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        public VvpInstanceStorageOssArgs()
        {
        }
        public static new VvpInstanceStorageOssArgs Empty => new VvpInstanceStorageOssArgs();
    }
}
