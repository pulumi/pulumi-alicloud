// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ebs.Outputs
{

    [OutputType]
    public sealed class GetDiskReplicaPairsPairResult
    {
        /// <summary>
        /// The bandwidth for asynchronous data replication between cloud disks. The unit is Kbps. Value range:-10240 Kbps: equal to 10 Mbps.-20480 Kbps: equal to 20 Mbps.-51200 Kbps: equal to 50 Mbps.-102400 Kbps: equal to 100 Mbps.Default value: 10240.This parameter cannot be specified when the ChargeType value is POSTPAY. The system value is 0, which indicates that the disk is dynamically allocated according to data write changes during asynchronous replication.
        /// </summary>
        public readonly string Bandwidth;
        /// <summary>
        /// The description of the asynchronous replication relationship. 2 to 256 English or Chinese characters in length and cannot start with' http:// 'or' https.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the standby disk.
        /// </summary>
        public readonly string DestinationDiskId;
        /// <summary>
        /// The ID of the region to which the disaster recovery site belongs.
        /// </summary>
        public readonly string DestinationRegionId;
        /// <summary>
        /// The ID of the zone to which the disaster recovery site belongs.
        /// </summary>
        public readonly string DestinationZoneId;
        /// <summary>
        /// The ID of the primary disk.
        /// </summary>
        public readonly string DiskId;
        public readonly string Id;
        /// <summary>
        /// The name of the asynchronous replication relationship. The length must be 2 to 128 characters in length and must start with a letter or Chinese name. It cannot start with http:// or https. It can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-).
        /// </summary>
        public readonly string PairName;
        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The first ID of the resource
        /// </summary>
        public readonly string ReplicaPairId;
        /// <summary>
        /// The ID of the resource group
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The RPO value set by the consistency group in seconds. Currently only 900 seconds are supported.
        /// </summary>
        public readonly string Rpo;
        /// <summary>
        /// The ID of the zone to which the production site belongs.
        /// </summary>
        public readonly string SourceZoneId;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetDiskReplicaPairsPairResult(
            string bandwidth,

            string description,

            string destinationDiskId,

            string destinationRegionId,

            string destinationZoneId,

            string diskId,

            string id,

            string pairName,

            string paymentType,

            string replicaPairId,

            string resourceGroupId,

            string rpo,

            string sourceZoneId,

            string status)
        {
            Bandwidth = bandwidth;
            Description = description;
            DestinationDiskId = destinationDiskId;
            DestinationRegionId = destinationRegionId;
            DestinationZoneId = destinationZoneId;
            DiskId = diskId;
            Id = id;
            PairName = pairName;
            PaymentType = paymentType;
            ReplicaPairId = replicaPairId;
            ResourceGroupId = resourceGroupId;
            Rpo = rpo;
            SourceZoneId = sourceZoneId;
            Status = status;
        }
    }
}
