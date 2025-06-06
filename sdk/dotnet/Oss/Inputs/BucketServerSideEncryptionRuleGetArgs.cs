// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketServerSideEncryptionRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted with AES256. This element is valid only when the value of SSEAlgorithm is set to KMS. Valid values: `SM4`.
        /// </summary>
        [Input("kmsDataEncryption")]
        public Input<string>? KmsDataEncryption { get; set; }

        /// <summary>
        /// The alibaba cloud KMS master key ID used for the SSE-KMS encryption.
        /// </summary>
        [Input("kmsMasterKeyId")]
        public Input<string>? KmsMasterKeyId { get; set; }

        /// <summary>
        /// The server-side encryption algorithm to use. Possible values: `AES256` and `KMS`.
        /// </summary>
        [Input("sseAlgorithm", required: true)]
        public Input<string> SseAlgorithm { get; set; } = null!;

        public BucketServerSideEncryptionRuleGetArgs()
        {
        }
        public static new BucketServerSideEncryptionRuleGetArgs Empty => new BucketServerSideEncryptionRuleGetArgs();
    }
}
