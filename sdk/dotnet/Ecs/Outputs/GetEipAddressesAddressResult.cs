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
    public sealed class GetEipAddressesAddressResult
    {
        /// <summary>
        /// The name of the EIP.
        /// </summary>
        public readonly string AddressName;
        /// <summary>
        /// The ID of the EIP.
        /// </summary>
        public readonly string AllocationId;
        /// <summary>
        /// The ID of the region to which the EIP belongs.
        /// </summary>
        public readonly ImmutableArray<string> AvailableRegions;
        /// <summary>
        /// The maximum bandwidth of the EIP. Unit: Mbit/s.
        /// </summary>
        public readonly string Bandwidth;
        /// <summary>
        /// The bandwidth value of the EIP bandwidth plan with which the EIP is associated.
        /// </summary>
        public readonly string BandwidthPackageBandwidth;
        /// <summary>
        /// The ID of the EIP bandwidth plan.
        /// </summary>
        public readonly string BandwidthPackageId;
        /// <summary>
        /// The type of the bandwidth. Only CommonBandwidthPackage (an EIP bandwidth plan) is returned.
        /// </summary>
        public readonly string BandwidthPackageType;
        /// <summary>
        /// The time when the EIP was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Indicates whether deletion protection is enabled.
        /// </summary>
        public readonly bool DeletionProtection;
        /// <summary>
        /// The description of the EIP.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The expiration date. The time follows the ISO 8601 standard and is displayed in UTC. Format: YYYY-MM-DDThh:mmZ.
        /// </summary>
        public readonly string ExpiredTime;
        /// <summary>
        /// Indicates whether renewal data is included. This parameter returns true only when the parameter IncludeReservationData is set to true, and some orders have not taken effect.
        /// </summary>
        public readonly string HasReservationData;
        /// <summary>
        /// Indicates whether fine-grained monitoring is enabled for the EIP.
        /// </summary>
        public readonly string HdMonitorStatus;
        /// <summary>
        /// The ID of the Address.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the instance with which the EIP is associated.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The region ID of the associated resource.
        /// </summary>
        public readonly string InstanceRegionId;
        /// <summary>
        /// The type of the instance with which the EIP is associated.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// The metering method of the EIP.
        /// </summary>
        public readonly string InternetChargeType;
        /// <summary>
        /// The IP address of the EIP.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// The Internet service provider (ISP).
        /// </summary>
        public readonly string Isp;
        /// <summary>
        /// The details about the locked EIP.
        /// </summary>
        public readonly ImmutableArray<string> OperationLocks;
        /// <summary>
        /// The billing method of the EIP.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The time when the renewal takes effect.
        /// </summary>
        public readonly string ReservationActiveTime;
        /// <summary>
        /// The bandwidth after the renewal takes effect.
        /// </summary>
        public readonly string ReservationBandwidth;
        /// <summary>
        /// The metering method of the renewal.
        /// </summary>
        public readonly string ReservationInternetChargeType;
        /// <summary>
        /// The type of the renewal order.
        /// </summary>
        public readonly string ReservationOrderType;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// Indicates whether level-2 throttling is configured.
        /// </summary>
        public readonly bool SecondLimited;
        /// <summary>
        /// The IDs of the contiguous EIPs.
        /// </summary>
        public readonly string SegmentInstanceId;
        /// <summary>
        /// The status of the EIP.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetEipAddressesAddressResult(
            string addressName,

            string allocationId,

            ImmutableArray<string> availableRegions,

            string bandwidth,

            string bandwidthPackageBandwidth,

            string bandwidthPackageId,

            string bandwidthPackageType,

            string createTime,

            bool deletionProtection,

            string description,

            string expiredTime,

            string hasReservationData,

            string hdMonitorStatus,

            string id,

            string instanceId,

            string instanceRegionId,

            string instanceType,

            string internetChargeType,

            string ipAddress,

            string isp,

            ImmutableArray<string> operationLocks,

            string paymentType,

            string reservationActiveTime,

            string reservationBandwidth,

            string reservationInternetChargeType,

            string reservationOrderType,

            string resourceGroupId,

            bool secondLimited,

            string segmentInstanceId,

            string status,

            ImmutableDictionary<string, string> tags)
        {
            AddressName = addressName;
            AllocationId = allocationId;
            AvailableRegions = availableRegions;
            Bandwidth = bandwidth;
            BandwidthPackageBandwidth = bandwidthPackageBandwidth;
            BandwidthPackageId = bandwidthPackageId;
            BandwidthPackageType = bandwidthPackageType;
            CreateTime = createTime;
            DeletionProtection = deletionProtection;
            Description = description;
            ExpiredTime = expiredTime;
            HasReservationData = hasReservationData;
            HdMonitorStatus = hdMonitorStatus;
            Id = id;
            InstanceId = instanceId;
            InstanceRegionId = instanceRegionId;
            InstanceType = instanceType;
            InternetChargeType = internetChargeType;
            IpAddress = ipAddress;
            Isp = isp;
            OperationLocks = operationLocks;
            PaymentType = paymentType;
            ReservationActiveTime = reservationActiveTime;
            ReservationBandwidth = reservationBandwidth;
            ReservationInternetChargeType = reservationInternetChargeType;
            ReservationOrderType = reservationOrderType;
            ResourceGroupId = resourceGroupId;
            SecondLimited = secondLimited;
            SegmentInstanceId = segmentInstanceId;
            Status = status;
            Tags = tags;
        }
    }
}
