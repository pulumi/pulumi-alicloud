// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Esa.Outputs
{

    [OutputType]
    public sealed class SiteDeliveryTaskS3Delivery
    {
        public readonly string? AccessKey;
        public readonly string? BucketPath;
        public readonly string? Endpoint;
        public readonly string? PrefixPath;
        public readonly string? Region;
        public readonly bool? S3Cmpt;
        public readonly string? SecretKey;
        /// <summary>
        /// Server-side encryption
        /// </summary>
        public readonly bool? ServerSideEncryption;
        /// <summary>
        /// Authentication Type
        /// </summary>
        public readonly string? VertifyType;

        [OutputConstructor]
        private SiteDeliveryTaskS3Delivery(
            string? accessKey,

            string? bucketPath,

            string? endpoint,

            string? prefixPath,

            string? region,

            bool? s3Cmpt,

            string? secretKey,

            bool? serverSideEncryption,

            string? vertifyType)
        {
            AccessKey = accessKey;
            BucketPath = bucketPath;
            Endpoint = endpoint;
            PrefixPath = prefixPath;
            Region = region;
            S3Cmpt = s3Cmpt;
            SecretKey = secretKey;
            ServerSideEncryption = serverSideEncryption;
            VertifyType = vertifyType;
        }
    }
}
