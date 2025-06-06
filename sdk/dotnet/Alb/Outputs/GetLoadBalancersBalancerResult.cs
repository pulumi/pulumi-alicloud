// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersBalancerResult
    {
        /// <summary>
        /// The Access Logging Configuration Structure.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerAccessLogConfigResult> AccessLogConfigs;
        /// <summary>
        /// The method in which IP addresses are assigned.
        /// </summary>
        public readonly string AddressAllocatedMode;
        /// <summary>
        /// The type of IP address that the ALB instance uses to provide services. Valid values: `Intranet`, `Internet`.
        /// </summary>
        public readonly string AddressType;
        /// <summary>
        /// The ID of the EIP bandwidth plan which is associated with an ALB instance that uses a
        /// public IP address.
        /// </summary>
        public readonly string BandwidthPackageId;
        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Remove the Protection Configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerDeletionProtectionConfigResult> DeletionProtectionConfigs;
        /// <summary>
        /// DNS Domain Name.
        /// </summary>
        public readonly string DnsName;
        /// <summary>
        /// The ID of the Load Balancer.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The configuration of the billing method.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerLoadBalancerBillingConfigResult> LoadBalancerBillingConfigs;
        /// <summary>
        /// Load Balancing of the Service Status. Valid Values: `Abnormal`and `Normal`.
        /// </summary>
        public readonly string LoadBalancerBusinessStatus;
        /// <summary>
        /// Field `load_balancer_bussiness_status` has been deprecated from provider version 1.142.0. New field `load_balancer_business_status` instead.
        /// </summary>
        public readonly string LoadBalancerBussinessStatus;
        /// <summary>
        /// The edition of the ALB instance.
        /// </summary>
        public readonly string LoadBalancerEdition;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string LoadBalancerId;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string LoadBalancerName;
        /// <summary>
        /// The Load Balancing Operations Lock Configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerLoadBalancerOperationLockResult> LoadBalancerOperationLocks;
        /// <summary>
        /// Modify the Protection Configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerModificationProtectionConfigResult> ModificationProtectionConfigs;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The load balancer status. Valid values: `Active`, `Configuring`, `CreateFailed`, `Inactive` and `Provisioning`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The ID of the virtual private cloud (VPC) where the ALB instance is deployed.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The zones and vSwitches.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersBalancerZoneMappingResult> ZoneMappings;

        [OutputConstructor]
        private GetLoadBalancersBalancerResult(
            ImmutableArray<Outputs.GetLoadBalancersBalancerAccessLogConfigResult> accessLogConfigs,

            string addressAllocatedMode,

            string addressType,

            string bandwidthPackageId,

            string createTime,

            ImmutableArray<Outputs.GetLoadBalancersBalancerDeletionProtectionConfigResult> deletionProtectionConfigs,

            string dnsName,

            string id,

            ImmutableArray<Outputs.GetLoadBalancersBalancerLoadBalancerBillingConfigResult> loadBalancerBillingConfigs,

            string loadBalancerBusinessStatus,

            string loadBalancerBussinessStatus,

            string loadBalancerEdition,

            string loadBalancerId,

            string loadBalancerName,

            ImmutableArray<Outputs.GetLoadBalancersBalancerLoadBalancerOperationLockResult> loadBalancerOperationLocks,

            ImmutableArray<Outputs.GetLoadBalancersBalancerModificationProtectionConfigResult> modificationProtectionConfigs,

            string resourceGroupId,

            string status,

            ImmutableDictionary<string, string> tags,

            string vpcId,

            ImmutableArray<Outputs.GetLoadBalancersBalancerZoneMappingResult> zoneMappings)
        {
            AccessLogConfigs = accessLogConfigs;
            AddressAllocatedMode = addressAllocatedMode;
            AddressType = addressType;
            BandwidthPackageId = bandwidthPackageId;
            CreateTime = createTime;
            DeletionProtectionConfigs = deletionProtectionConfigs;
            DnsName = dnsName;
            Id = id;
            LoadBalancerBillingConfigs = loadBalancerBillingConfigs;
            LoadBalancerBusinessStatus = loadBalancerBusinessStatus;
            LoadBalancerBussinessStatus = loadBalancerBussinessStatus;
            LoadBalancerEdition = loadBalancerEdition;
            LoadBalancerId = loadBalancerId;
            LoadBalancerName = loadBalancerName;
            LoadBalancerOperationLocks = loadBalancerOperationLocks;
            ModificationProtectionConfigs = modificationProtectionConfigs;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            ZoneMappings = zoneMappings;
        }
    }
}
