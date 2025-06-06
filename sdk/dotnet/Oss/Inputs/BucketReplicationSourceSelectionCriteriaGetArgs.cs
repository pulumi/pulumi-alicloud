// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketReplicationSourceSelectionCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Filter source objects encrypted by using SSE-KMS. See `sse_kms_encrypted_objects` below.
        /// </summary>
        [Input("sseKmsEncryptedObjects")]
        public Input<Inputs.BucketReplicationSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs>? SseKmsEncryptedObjects { get; set; }

        public BucketReplicationSourceSelectionCriteriaGetArgs()
        {
        }
        public static new BucketReplicationSourceSelectionCriteriaGetArgs Empty => new BucketReplicationSourceSelectionCriteriaGetArgs();
    }
}
