// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroup
    {
        /// <summary>
        /// Additional security Group IDS for Cluster, you can also specify this key for each node group.
        /// </summary>
        public readonly ImmutableArray<string> AdditionalSecurityGroupIds;
        /// <summary>
        /// The detail cost optimized configuration of emr cluster. See `cost_optimized_config` below.
        /// </summary>
        public readonly Outputs.ClusterNodeGroupCostOptimizedConfig? CostOptimizedConfig;
        /// <summary>
        /// Host Ecs data disks information in this node group. See `data_disks` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterNodeGroupDataDisk> DataDisks;
        /// <summary>
        /// Deployment set strategy for this cluster node group. Supported value: NONE, CLUSTER or NODE_GROUP.
        /// </summary>
        public readonly string? DeploymentSetStrategy;
        /// <summary>
        /// Enable emr cluster of task node graceful decommission, ’true’ or ‘false’ .
        /// </summary>
        public readonly bool? GracefulShutdown;
        /// <summary>
        /// Host Ecs instance types.
        /// </summary>
        public readonly ImmutableArray<string> InstanceTypes;
        /// <summary>
        /// Host Ecs number in this node group.
        /// </summary>
        public readonly int NodeCount;
        /// <summary>
        /// The node group name of emr cluster.
        /// </summary>
        public readonly string NodeGroupName;
        /// <summary>
        /// The node group type of emr cluster, supported value: MASTER, CORE or TASK. Node group type of GATEWAY is available since v1.219.0.
        /// </summary>
        public readonly string NodeGroupType;
        /// <summary>
        /// Node resize strategy for this cluster node group. Supported value: PRIORITY, COST_OPTIMIZED.
        /// </summary>
        public readonly string? NodeResizeStrategy;
        /// <summary>
        /// Payment Type for this cluster. Supported value: PayAsYouGo or Subscription.
        /// </summary>
        public readonly string? PaymentType;
        /// <summary>
        /// The spot bid prices of a PayAsYouGo instance. See `spot_bid_prices` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterNodeGroupSpotBidPrice> SpotBidPrices;
        /// <summary>
        /// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
        /// </summary>
        public readonly bool? SpotInstanceRemedy;
        /// <summary>
        /// The detail configuration of subscription payment type. See `subscription_config` below.
        /// </summary>
        public readonly Outputs.ClusterNodeGroupSubscriptionConfig? SubscriptionConfig;
        /// <summary>
        /// Host Ecs system disk information in this node group. See `system_disk` below.
        /// </summary>
        public readonly Outputs.ClusterNodeGroupSystemDisk SystemDisk;
        /// <summary>
        /// Global vSwitch ids, you can also specify it in node group.
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;
        /// <summary>
        /// Whether the node has a public IP address enabled.
        /// </summary>
        public readonly bool? WithPublicIp;

        [OutputConstructor]
        private ClusterNodeGroup(
            ImmutableArray<string> additionalSecurityGroupIds,

            Outputs.ClusterNodeGroupCostOptimizedConfig? costOptimizedConfig,

            ImmutableArray<Outputs.ClusterNodeGroupDataDisk> dataDisks,

            string? deploymentSetStrategy,

            bool? gracefulShutdown,

            ImmutableArray<string> instanceTypes,

            int nodeCount,

            string nodeGroupName,

            string nodeGroupType,

            string? nodeResizeStrategy,

            string? paymentType,

            ImmutableArray<Outputs.ClusterNodeGroupSpotBidPrice> spotBidPrices,

            bool? spotInstanceRemedy,

            Outputs.ClusterNodeGroupSubscriptionConfig? subscriptionConfig,

            Outputs.ClusterNodeGroupSystemDisk systemDisk,

            ImmutableArray<string> vswitchIds,

            bool? withPublicIp)
        {
            AdditionalSecurityGroupIds = additionalSecurityGroupIds;
            CostOptimizedConfig = costOptimizedConfig;
            DataDisks = dataDisks;
            DeploymentSetStrategy = deploymentSetStrategy;
            GracefulShutdown = gracefulShutdown;
            InstanceTypes = instanceTypes;
            NodeCount = nodeCount;
            NodeGroupName = nodeGroupName;
            NodeGroupType = nodeGroupType;
            NodeResizeStrategy = nodeResizeStrategy;
            PaymentType = paymentType;
            SpotBidPrices = spotBidPrices;
            SpotInstanceRemedy = spotInstanceRemedy;
            SubscriptionConfig = subscriptionConfig;
            SystemDisk = systemDisk;
            VswitchIds = vswitchIds;
            WithPublicIp = withPublicIp;
        }
    }
}