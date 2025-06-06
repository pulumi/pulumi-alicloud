// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class HybridMonitorSlsTaskSlsProcessConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("expresses")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressGetArgs>? _expresses;

        /// <summary>
        /// The extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressGetArgs> Expresses
        {
            get => _expresses ?? (_expresses = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressGetArgs>());
            set => _expresses = value;
        }

        /// <summary>
        /// The conditions that are used to filter logs imported from Log Service. See `filter` below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.HybridMonitorSlsTaskSlsProcessConfigFilterGetArgs>? Filter { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByGetArgs>? _groupBies;

        /// <summary>
        /// The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See `group_by` below.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("statistics")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs>? _statistics;

        /// <summary>
        /// The method that is used to aggregate logs imported from Log Service. See `statistics` below.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs> Statistics
        {
            get => _statistics ?? (_statistics = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticGetArgs>());
            set => _statistics = value;
        }

        public HybridMonitorSlsTaskSlsProcessConfigGetArgs()
        {
        }
        public static new HybridMonitorSlsTaskSlsProcessConfigGetArgs Empty => new HybridMonitorSlsTaskSlsProcessConfigGetArgs();
    }
}
