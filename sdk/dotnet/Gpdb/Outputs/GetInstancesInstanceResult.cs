// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        public readonly string AvailabilityZone;
        public readonly string ChargeType;
        /// <summary>
        /// The connection string of the instance.
        /// </summary>
        public readonly string ConnectionString;
        /// <summary>
        /// The number of CPU cores of the computing node. Unit: Core.
        /// </summary>
        public readonly string CpuCores;
        /// <summary>
        /// The time when the instance was created. The time is in the YYYY-MM-DDThh:mm:ssZ format, such as 2011-05-30T12:11:4Z.
        /// </summary>
        public readonly string CreateTime;
        public readonly string CreationTime;
        public readonly string DbInstanceCategory;
        public readonly string DbInstanceClass;
        /// <summary>
        /// The db instance id.
        /// </summary>
        public readonly string DbInstanceId;
        /// <summary>
        /// The db instance mode. Valid values: `StorageElastic`, `Serverless`, `Classic`.
        /// </summary>
        public readonly string DbInstanceMode;
        /// <summary>
        /// The description of the instance.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The database engine used by the instance.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// The version of the database engine used by the instance.
        /// </summary>
        public readonly string EngineVersion;
        /// <summary>
        /// The ID of the db Instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The network type of the instance.
        /// </summary>
        public readonly string InstanceNetworkType;
        /// <summary>
        /// The ip whitelist.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceIpWhitelistResult> IpWhitelists;
        /// <summary>
        /// The end time of the maintenance window for the instance.
        /// </summary>
        public readonly string MaintainEndTime;
        /// <summary>
        /// The start time of the maintenance window for the instance.
        /// </summary>
        public readonly string MaintainStartTime;
        /// <summary>
        /// The number of Master nodes. Valid values: 1 to 2. if it is not filled in, the default value is 1 Master node.
        /// </summary>
        public readonly string MasterNodeNum;
        /// <summary>
        /// The memory size of the compute node.
        /// </summary>
        public readonly string MemorySize;
        /// <summary>
        /// The billing method of the instance. Valid values: `Subscription`, `PayAsYouGo`.
        /// </summary>
        public readonly string PaymentType;
        public readonly string RegionId;
        /// <summary>
        /// Calculate the number of nodes. The value range of the high-availability version of the storage elastic mode is 4 to 512, and the value must be a multiple of 4. The value range of the basic version of the storage elastic mode is 2 to 512, and the value must be a multiple of 2. The-Serverless version has a value range of 2 to 512. The value must be a multiple of 2.
        /// </summary>
        public readonly string SegNodeNum;
        /// <summary>
        /// The status of the instance. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardDBInstanceCreating`, `GuardSwitching`, `Importing`, `ImportingFromOtherInstance`, `Rebooting`, `Restoring`, `Running`, `Transfering`, `TransferingToOtherInstance`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The storage capacity. Unit: GB. Value: `50` to `4000`.
        /// </summary>
        public readonly int StorageSize;
        /// <summary>
        /// The type of disks. Valid values: `cloud_essd`, `cloud_efficiency`.
        /// </summary>
        public readonly string StorageType;
        /// <summary>
        /// The tags of the instance.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// The ID of the VPC。.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The vswitch id.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string availabilityZone,

            string chargeType,

            string connectionString,

            string cpuCores,

            string createTime,

            string creationTime,

            string dbInstanceCategory,

            string dbInstanceClass,

            string dbInstanceId,

            string dbInstanceMode,

            string description,

            string engine,

            string engineVersion,

            string id,

            string instanceNetworkType,

            ImmutableArray<Outputs.GetInstancesInstanceIpWhitelistResult> ipWhitelists,

            string maintainEndTime,

            string maintainStartTime,

            string masterNodeNum,

            string memorySize,

            string paymentType,

            string regionId,

            string segNodeNum,

            string status,

            int storageSize,

            string storageType,

            ImmutableDictionary<string, object> tags,

            string vpcId,

            string vswitchId,

            string zoneId)
        {
            AvailabilityZone = availabilityZone;
            ChargeType = chargeType;
            ConnectionString = connectionString;
            CpuCores = cpuCores;
            CreateTime = createTime;
            CreationTime = creationTime;
            DbInstanceCategory = dbInstanceCategory;
            DbInstanceClass = dbInstanceClass;
            DbInstanceId = dbInstanceId;
            DbInstanceMode = dbInstanceMode;
            Description = description;
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            InstanceNetworkType = instanceNetworkType;
            IpWhitelists = ipWhitelists;
            MaintainEndTime = maintainEndTime;
            MaintainStartTime = maintainStartTime;
            MasterNodeNum = masterNodeNum;
            MemorySize = memorySize;
            PaymentType = paymentType;
            RegionId = regionId;
            SegNodeNum = segNodeNum;
            Status = status;
            StorageSize = storageSize;
            StorageType = storageType;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}