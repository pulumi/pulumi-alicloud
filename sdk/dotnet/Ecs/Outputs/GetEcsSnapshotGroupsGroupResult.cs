// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetEcsSnapshotGroupsGroupResult
    {
        /// <summary>
        /// The description of the snapshot-consistent group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Snapshot Group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The ID of the resource group to which the snapshot consistency group belongs.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string SnapshotGroupId;
        /// <summary>
        /// The name of the snapshot-consistent group.
        /// </summary>
        public readonly string SnapshotGroupName;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// List of label key-value pairs.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetEcsSnapshotGroupsGroupResult(
            string description,

            string id,

            string instanceId,

            string resourceGroupId,

            string snapshotGroupId,

            string snapshotGroupName,

            string status,

            ImmutableDictionary<string, string>? tags)
        {
            Description = description;
            Id = id;
            InstanceId = instanceId;
            ResourceGroupId = resourceGroupId;
            SnapshotGroupId = snapshotGroupId;
            SnapshotGroupName = snapshotGroupName;
            Status = status;
            Tags = tags;
        }
    }
}
