// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DatabaseFilesystem.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// the number of nodes of the Database file system.
        /// </summary>
        public readonly int AttachNodeNumber;
        /// <summary>
        /// The type of the Database file system. Valid values: `standard`.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// The create time of the Database file system.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The cluster ID of the Database file system.
        /// </summary>
        public readonly string DbfsClusterId;
        /// <summary>
        /// The collection of ECS instances mounted to the Database file system.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceEcsListResult> EcsLists;
        /// <summary>
        /// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        /// </summary>
        public readonly bool EnableRaid;
        /// <summary>
        /// Whether to encrypt the Database file system. Valid values: `true` and `false`.
        /// </summary>
        public readonly bool Encryption;
        /// <summary>
        /// The ID of the Instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Database File System
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The name of the Database file system.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        /// </summary>
        public readonly string KmsKeyId;
        /// <summary>
        /// Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        public readonly string PerformanceLevel;
        /// <summary>
        /// The number of strip . When `enable_raid` parameter is set to `true` will transfer. This parameter is valid When `enable_raid` parameter is set to `true`.
        /// </summary>
        public readonly string RaidStripeUnitNumber;
        /// <summary>
        /// The size Of the Database file system. Unit: GiB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The status of the Database file system.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The Zone ID of the Database file system.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            int attachNodeNumber,

            string category,

            string createTime,

            string dbfsClusterId,

            ImmutableArray<Outputs.GetInstancesInstanceEcsListResult> ecsLists,

            bool enableRaid,

            bool encryption,

            string id,

            string instanceId,

            string instanceName,

            string kmsKeyId,

            string paymentType,

            string performanceLevel,

            string raidStripeUnitNumber,

            int size,

            string status,

            string zoneId)
        {
            AttachNodeNumber = attachNodeNumber;
            Category = category;
            CreateTime = createTime;
            DbfsClusterId = dbfsClusterId;
            EcsLists = ecsLists;
            EnableRaid = enableRaid;
            Encryption = encryption;
            Id = id;
            InstanceId = instanceId;
            InstanceName = instanceName;
            KmsKeyId = kmsKeyId;
            PaymentType = paymentType;
            PerformanceLevel = performanceLevel;
            RaidStripeUnitNumber = raidStripeUnitNumber;
            Size = size;
            Status = status;
            ZoneId = zoneId;
        }
    }
}