// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class HybridMonitorSlsTaskSlsProcessConfig
    {
        /// <summary>
        /// The extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        public readonly ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigExpress> Expresses;
        /// <summary>
        /// The conditions that are used to filter logs imported from Log Service. See `filter` below.
        /// </summary>
        public readonly Outputs.HybridMonitorSlsTaskSlsProcessConfigFilter? Filter;
        /// <summary>
        /// The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See `group_by` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigGroupBy> GroupBies;
        /// <summary>
        /// The method that is used to aggregate logs imported from Log Service. See `statistics` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigStatistic> Statistics;

        [OutputConstructor]
        private HybridMonitorSlsTaskSlsProcessConfig(
            ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigExpress> expresses,

            Outputs.HybridMonitorSlsTaskSlsProcessConfigFilter? filter,

            ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigGroupBy> groupBies,

            ImmutableArray<Outputs.HybridMonitorSlsTaskSlsProcessConfigStatistic> statistics)
        {
            Expresses = expresses;
            Filter = filter;
            GroupBies = groupBies;
            Statistics = statistics;
        }
    }
}