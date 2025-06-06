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
    public sealed class RecordAuthConf
    {
        /// <summary>
        /// The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:
        /// </summary>
        public readonly string? AuthType;
        /// <summary>
        /// The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.
        /// </summary>
        public readonly string? SecretKey;
        /// <summary>
        /// The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private RecordAuthConf(
            string? accessKey,

            string? authType,

            string? region,

            string? secretKey,

            string? version)
        {
            AccessKey = accessKey;
            AuthType = authType;
            Region = region;
            SecretKey = secretKey;
            Version = version;
        }
    }
}
