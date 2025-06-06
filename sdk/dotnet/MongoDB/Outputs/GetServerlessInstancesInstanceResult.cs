// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB.Outputs
{

    [OutputType]
    public sealed class GetServerlessInstancesInstanceResult
    {
        /// <summary>
        /// The read/write throughput consumed by the instance.
        /// </summary>
        public readonly int CapacityUnit;
        /// <summary>
        /// The db instance class.
        /// </summary>
        public readonly string DbInstanceClass;
        /// <summary>
        /// The db instance description.
        /// </summary>
        public readonly string DbInstanceDescription;
        /// <summary>
        /// The db instance id.
        /// </summary>
        public readonly string DbInstanceId;
        /// <summary>
        /// The db instance release protection.
        /// </summary>
        public readonly bool DbInstanceReleaseProtection;
        /// <summary>
        /// The db instance storage.
        /// </summary>
        public readonly int DbInstanceStorage;
        /// <summary>
        /// The database engine of the instance.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// The database version number. Valid values: `4.2`.
        /// </summary>
        public readonly string EngineVersion;
        /// <summary>
        /// The time when the subscription instance expires. The time is in the `yyyy-MM-ddTHH:mmZ` format. The time is displayed in UTC.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// The ID of the Serverless Instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Indicates the type of the instance. Valid values: `0`: physical machine. `1`: ECS. `2`: DOCKER. `18`: k8s new architecture instance.
        /// </summary>
        public readonly string KindCode;
        /// <summary>
        /// The locked status of the instance.
        /// </summary>
        public readonly string LockMode;
        /// <summary>
        /// The start time of the maintenance window. The time is in the `HH:mmZ` format. The time is displayed in UTC.
        /// </summary>
        public readonly string MaintainEndTime;
        /// <summary>
        /// The end time of the maintenance window. The time is in the `HH:mmZ` format. The time is displayed in UTC.
        /// </summary>
        public readonly string MaintainStartTime;
        /// <summary>
        /// Instance maximum connections.
        /// </summary>
        public readonly int MaxConnections;
        /// <summary>
        /// The maximum IOPS of the instance.
        /// </summary>
        public readonly int MaxIops;
        /// <summary>
        /// The network type of the instance.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The Payment type of the instance.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The access protocol type of the instance. Valid values: `mongodb`, `dynamodb`.
        /// </summary>
        public readonly string ProtocolType;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The security ip list.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerlessInstancesInstanceSecurityIpGroupResult> SecurityIpGroups;
        /// <summary>
        /// The status of the instance.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The storage engine used by the instance.
        /// </summary>
        public readonly string StorageEngine;
        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Intranet secret free access mode.
        /// </summary>
        public readonly string VpcAuthMode;
        /// <summary>
        /// The ID of the VPC network.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The id of the vswitch.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// The ID of the zone.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetServerlessInstancesInstanceResult(
            int capacityUnit,

            string dbInstanceClass,

            string dbInstanceDescription,

            string dbInstanceId,

            bool dbInstanceReleaseProtection,

            int dbInstanceStorage,

            string engine,

            string engineVersion,

            string expireTime,

            string id,

            string kindCode,

            string lockMode,

            string maintainEndTime,

            string maintainStartTime,

            int maxConnections,

            int maxIops,

            string networkType,

            string paymentType,

            string protocolType,

            string resourceGroupId,

            ImmutableArray<Outputs.GetServerlessInstancesInstanceSecurityIpGroupResult> securityIpGroups,

            string status,

            string storageEngine,

            ImmutableDictionary<string, string> tags,

            string vpcAuthMode,

            string vpcId,

            string vswitchId,

            string zoneId)
        {
            CapacityUnit = capacityUnit;
            DbInstanceClass = dbInstanceClass;
            DbInstanceDescription = dbInstanceDescription;
            DbInstanceId = dbInstanceId;
            DbInstanceReleaseProtection = dbInstanceReleaseProtection;
            DbInstanceStorage = dbInstanceStorage;
            Engine = engine;
            EngineVersion = engineVersion;
            ExpireTime = expireTime;
            Id = id;
            KindCode = kindCode;
            LockMode = lockMode;
            MaintainEndTime = maintainEndTime;
            MaintainStartTime = maintainStartTime;
            MaxConnections = maxConnections;
            MaxIops = maxIops;
            NetworkType = networkType;
            PaymentType = paymentType;
            ProtocolType = protocolType;
            ResourceGroupId = resourceGroupId;
            SecurityIpGroups = securityIpGroups;
            Status = status;
            StorageEngine = storageEngine;
            Tags = tags;
            VpcAuthMode = vpcAuthMode;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
