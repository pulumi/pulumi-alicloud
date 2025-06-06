// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterResult
    {
        /// <summary>
        /// The ID of the cluster that you want to create the application.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The name of the cluster.
        /// </summary>
        public readonly string ClusterName;
        /// <summary>
        /// The type of the cluster, Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernetes cluster.
        /// </summary>
        public readonly int ClusterType;
        /// <summary>
        /// The total number of CPUs in the cluster.
        /// </summary>
        public readonly int Cpu;
        /// <summary>
        /// The number of used CPUs in the cluster.
        /// </summary>
        public readonly int CpuUsed;
        /// <summary>
        /// Cluster's creation time.
        /// </summary>
        public readonly int CreateTime;
        /// <summary>
        /// The total amount of memory in the cluser. Unit: MB.
        /// </summary>
        public readonly int Mem;
        /// <summary>
        /// The amount of used memory in the cluser. Unit: MB.
        /// </summary>
        public readonly int MemUsed;
        /// <summary>
        /// The network type of the cluster. Valid values: 1: classic network. 2: VPC.
        /// </summary>
        public readonly int NetworkMode;
        /// <summary>
        /// The number of the Elastic Compute Service (ECS) instances that are deployed to the cluster.
        /// </summary>
        public readonly int NodeNum;
        /// <summary>
        /// The ID of the namespace the application belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The time when the cluster was last updated.
        /// </summary>
        public readonly int UpdateTime;
        /// <summary>
        /// The ID of the Virtual Private Cloud (VPC) for the cluster.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetClustersClusterResult(
            string clusterId,

            string clusterName,

            int clusterType,

            int cpu,

            int cpuUsed,

            int createTime,

            int mem,

            int memUsed,

            int networkMode,

            int nodeNum,

            string regionId,

            int updateTime,

            string vpcId)
        {
            ClusterId = clusterId;
            ClusterName = clusterName;
            ClusterType = clusterType;
            Cpu = cpu;
            CpuUsed = cpuUsed;
            CreateTime = createTime;
            Mem = mem;
            MemUsed = memUsed;
            NetworkMode = networkMode;
            NodeNum = nodeNum;
            RegionId = regionId;
            UpdateTime = updateTime;
            VpcId = vpcId;
        }
    }
}
