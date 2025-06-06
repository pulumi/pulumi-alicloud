// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class GetInstanceAttachmentsAttachmentResult
    {
        /// <summary>
        /// The time when the network is associated with the CEN instance.
        /// </summary>
        public readonly string ChildInstanceAttachTime;
        /// <summary>
        /// The ID of the network.
        /// </summary>
        public readonly string ChildInstanceId;
        /// <summary>
        /// The ID of the account to which the network belongs.
        /// </summary>
        public readonly int ChildInstanceOwnerId;
        /// <summary>
        /// The region to which the network to be queried belongs.
        /// </summary>
        public readonly string ChildInstanceRegionId;
        /// <summary>
        /// The type of the associated network. Valid values: `VPC`, `VBR` and `CCN`.
        /// </summary>
        public readonly string ChildInstanceType;
        /// <summary>
        /// The ID of the CEN Instance Attachment.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The status of the Cen Child Instance Attachment. Valid value: `Attaching`, `Attached` and `Aetaching`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetInstanceAttachmentsAttachmentResult(
            string childInstanceAttachTime,

            string childInstanceId,

            int childInstanceOwnerId,

            string childInstanceRegionId,

            string childInstanceType,

            string id,

            string instanceId,

            string status)
        {
            ChildInstanceAttachTime = childInstanceAttachTime;
            ChildInstanceId = childInstanceId;
            ChildInstanceOwnerId = childInstanceOwnerId;
            ChildInstanceRegionId = childInstanceRegionId;
            ChildInstanceType = childInstanceType;
            Id = id;
            InstanceId = instanceId;
            Status = status;
        }
    }
}
