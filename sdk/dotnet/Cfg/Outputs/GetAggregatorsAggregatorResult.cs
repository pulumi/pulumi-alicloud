// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg.Outputs
{

    [OutputType]
    public sealed class GetAggregatorsAggregatorResult
    {
        /// <summary>
        /// Aggregator account uid.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Account information in aggregator.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAggregatorsAggregatorAggregatorAccountResult> AggregatorAccounts;
        /// <summary>
        /// The id of aggregator.
        /// </summary>
        public readonly string AggregatorId;
        /// <summary>
        /// The name of aggregator.
        /// </summary>
        public readonly string AggregatorName;
        /// <summary>
        /// The type of aggregator.
        /// </summary>
        public readonly string AggregatorType;
        /// <summary>
        /// The description of aggregator.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The id of the aggregator.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the resource. Valid Values:  `0`: creating `1`: normal `2`: deleting.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAggregatorsAggregatorResult(
            string accountId,

            ImmutableArray<Outputs.GetAggregatorsAggregatorAggregatorAccountResult> aggregatorAccounts,

            string aggregatorId,

            string aggregatorName,

            string aggregatorType,

            string description,

            string id,

            string status)
        {
            AccountId = accountId;
            AggregatorAccounts = aggregatorAccounts;
            AggregatorId = aggregatorId;
            AggregatorName = aggregatorName;
            AggregatorType = aggregatorType;
            Description = description;
            Id = id;
            Status = status;
        }
    }
}
