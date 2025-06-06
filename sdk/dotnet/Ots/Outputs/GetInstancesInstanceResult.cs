// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// The cluster type of the instance. Possible values: `SSD`, `HYBRID`.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// The create time of the instance.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The description of the instance.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (Removed since v1.221.0) The instance quota which indicating the maximum number of tables.
        /// </summary>
        public readonly int EntityQuota;
        /// <summary>
        /// ID of the instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Instance name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (Removed since v1.221.0) The network type of the instance. Possible values: `NORMAL`, `VPC`, `VPC_CONSOLE`.
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// (Available since v1.221.0) The set of request sources that are allowed access. Possible values: `TRUST_PROXY`.
        /// </summary>
        public readonly ImmutableArray<string> NetworkSourceAcls;
        /// <summary>
        /// (Available since v1.221.0) The set of network types that are allowed access. Possible values: `CLASSIC`, `VPC`, `INTERNET`.
        /// </summary>
        public readonly ImmutableArray<string> NetworkTypeAcls;
        /// <summary>
        /// (Available since v1.221.0) instance policy, json string.
        /// </summary>
        public readonly string Policy;
        /// <summary>
        /// (Available since v1.221.0) instance policy version.
        /// </summary>
        public readonly int PolicyVersion;
        /// <summary>
        /// (Available since v1.221.0) The resource group the instance belongs to.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// Instance status. Possible values: `Running`, `Disabled`, `Deleting`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// (Available since v1.221.0) The instance quota which indicating the maximum number of tables.
        /// </summary>
        public readonly int TableQuota;
        /// <summary>
        /// A map of tags assigned to the instance. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var instancesDs = AliCloud.Ots.GetInstances.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The user id of the instance.
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string clusterType,

            string createTime,

            string description,

            int entityQuota,

            string id,

            string name,

            string network,

            ImmutableArray<string> networkSourceAcls,

            ImmutableArray<string> networkTypeAcls,

            string policy,

            int policyVersion,

            string resourceGroupId,

            string status,

            int tableQuota,

            ImmutableDictionary<string, string> tags,

            string userId)
        {
            ClusterType = clusterType;
            CreateTime = createTime;
            Description = description;
            EntityQuota = entityQuota;
            Id = id;
            Name = name;
            Network = network;
            NetworkSourceAcls = networkSourceAcls;
            NetworkTypeAcls = networkTypeAcls;
            Policy = policy;
            PolicyVersion = policyVersion;
            ResourceGroupId = resourceGroupId;
            Status = status;
            TableQuota = tableQuota;
            Tags = tags;
            UserId = userId;
        }
    }
}
