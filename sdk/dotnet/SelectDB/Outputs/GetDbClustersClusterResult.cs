// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SelectDB.Outputs
{

    [OutputType]
    public sealed class GetDbClustersClusterResult
    {
        /// <summary>
        /// The cache size for DBCluster.
        /// </summary>
        public readonly int CacheSize;
        /// <summary>
        /// The cpu resource amount of DBCluster. Depends on `db_cluster_class`.
        /// </summary>
        public readonly int Cpu;
        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The DBCluster class. db_cluster_class has a range of class from `selectdb.xlarge` to `selectdb.256xlarge`.
        /// </summary>
        public readonly string DbClusterClass;
        /// <summary>
        /// The DBCluster description.
        /// </summary>
        public readonly string DbClusterDescription;
        /// <summary>
        /// The cluster ID.
        /// </summary>
        public readonly string DbClusterId;
        /// <summary>
        /// The instance ID.
        /// </summary>
        public readonly string DbInstanceId;
        /// <summary>
        /// The Engine of the DBCluster.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// The engine version of the DBCluster.
        /// </summary>
        public readonly string EngineVersion;
        public readonly string Id;
        /// <summary>
        /// The memory resource amount of DBCluster. Depends on `db_cluster_class`.
        /// </summary>
        public readonly int Memory;
        /// <summary>
        /// The configuration change logs of parameters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDbClustersClusterParamChangeLogResult> ParamChangeLogs;
        /// <summary>
        /// The details about each parameter in DBCluster returned.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDbClustersClusterParamResult> Params;
        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The ID of region for the cluster.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The status of the DBCluster. Valid values: `ACTIVATION`,`CREATING`,`DELETING`,`RESTARTING`,`ORDER_PREPARING`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The ID of the VPC for the cluster.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The ID of zone for the cluster.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetDbClustersClusterResult(
            int cacheSize,

            int cpu,

            string createTime,

            string dbClusterClass,

            string dbClusterDescription,

            string dbClusterId,

            string dbInstanceId,

            string engine,

            string engineVersion,

            string id,

            int memory,

            ImmutableArray<Outputs.GetDbClustersClusterParamChangeLogResult> paramChangeLogs,

            ImmutableArray<Outputs.GetDbClustersClusterParamResult> @params,

            string paymentType,

            string regionId,

            string status,

            string vpcId,

            string zoneId)
        {
            CacheSize = cacheSize;
            Cpu = cpu;
            CreateTime = createTime;
            DbClusterClass = dbClusterClass;
            DbClusterDescription = dbClusterDescription;
            DbClusterId = dbClusterId;
            DbInstanceId = dbInstanceId;
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            Memory = memory;
            ParamChangeLogs = paramChangeLogs;
            Params = @params;
            PaymentType = paymentType;
            RegionId = regionId;
            Status = status;
            VpcId = vpcId;
            ZoneId = zoneId;
        }
    }
}