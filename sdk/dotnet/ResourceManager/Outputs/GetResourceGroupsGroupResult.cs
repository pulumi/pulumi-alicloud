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
    public sealed class GetResourceGroupsGroupResult
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account to which the resource group belongs.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The display name of the resource group.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The unique identifier of the resource group.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Available since v1.114.0) The status of the resource group in all regions.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetResourceGroupsGroupRegionStatusResult> RegionStatuses;
        /// <summary>
        /// (Available since v1.114.0) The unique identifier of the resource group.
        /// </summary>
        public readonly string ResourceGroupName;
        /// <summary>
        /// The status of the resource group. Valid values: `Creating`, `Deleted`, `Deleting`, `OK` and `PendingDelete`. **NOTE:** From version 1.114.0, `status` can be set to `Deleting`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetResourceGroupsGroupResult(
            string accountId,

            string displayName,

            string id,

            string name,

            ImmutableArray<Outputs.GetResourceGroupsGroupRegionStatusResult> regionStatuses,

            string resourceGroupName,

            string status)
        {
            AccountId = accountId;
            DisplayName = displayName;
            Id = id;
            Name = name;
            RegionStatuses = regionStatuses;
            ResourceGroupName = resourceGroupName;
            Status = status;
        }
    }
}