// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager.Outputs
{

    [OutputType]
    public sealed class GetSharedResourcesResourceResult
    {
        /// <summary>
        /// The ID of the Shared Resource. It formats as `&lt;resource_id&gt;:&lt;resource_type&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the shared resource.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// The resource share ID of resource manager.
        /// </summary>
        public readonly string ResourceShareId;
        /// <summary>
        /// The type of shared resource.
        /// </summary>
        public readonly string ResourceType;
        /// <summary>
        /// The status of share resource. Valid values: `Associated`, `Associating`, `Disassociated`, `Disassociating` and `Failed`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetSharedResourcesResourceResult(
            string id,

            string resourceId,

            string resourceShareId,

            string resourceType,

            string status)
        {
            Id = id;
            ResourceId = resourceId;
            ResourceShareId = resourceShareId;
            ResourceType = resourceType;
            Status = status;
        }
    }
}