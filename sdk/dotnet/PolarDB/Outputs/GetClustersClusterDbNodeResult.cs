// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterDbNodeResult
    {
        /// <summary>
        /// The create_time of the db_nodes.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The db_node_class of the db_nodes.
        /// </summary>
        public readonly string DbNodeClass;
        /// <summary>
        /// The db_node_id of the db_nodes.
        /// </summary>
        public readonly string DbNodeId;
        /// <summary>
        /// The db_node_role of the db_nodes.
        /// </summary>
        public readonly string DbNodeRole;
        /// <summary>
        /// The db_node_status of the db_nodes.
        /// </summary>
        public readonly string DbNodeStatus;
        /// <summary>
        /// The max_connections of the db_nodes.
        /// </summary>
        public readonly int MaxConnections;
        /// <summary>
        /// The max_iops of the db_nodes.
        /// </summary>
        public readonly int MaxIops;
        /// <summary>
        /// The region_id of the db_nodes.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The zone_id of the db_nodes.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetClustersClusterDbNodeResult(
            string createTime,

            string dbNodeClass,

            string dbNodeId,

            string dbNodeRole,

            string dbNodeStatus,

            int maxConnections,

            int maxIops,

            string regionId,

            string zoneId)
        {
            CreateTime = createTime;
            DbNodeClass = dbNodeClass;
            DbNodeId = dbNodeId;
            DbNodeRole = dbNodeRole;
            DbNodeStatus = dbNodeStatus;
            MaxConnections = maxConnections;
            MaxIops = maxIops;
            RegionId = regionId;
            ZoneId = zoneId;
        }
    }
}
