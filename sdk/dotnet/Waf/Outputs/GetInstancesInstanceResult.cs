// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Waf.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// The timestamp (in seconds) indicating when the WAF instance expires.
        /// </summary>
        public readonly int EndDate;
        /// <summary>
        /// The ID of the WAF instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Indicates whether the WAF instance has overdue payments.
        /// </summary>
        public readonly int InDebt;
        /// <summary>
        /// The ID of WAF the instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The number of days before the trial period of the WAF instance expires.
        /// </summary>
        public readonly int RemainDay;
        /// <summary>
        /// The status of WAF instance to filter results. Optional value: `0`: The instance has expired, `1` : The instance has not expired and is working properly.
        /// </summary>
        public readonly int Status;
        public readonly string SubscriptionType;
        /// <summary>
        /// Indicates whether this is a trial instance.
        /// </summary>
        public readonly int Trial;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            int endDate,

            string id,

            int inDebt,

            string instanceId,

            int remainDay,

            int status,

            string subscriptionType,

            int trial)
        {
            EndDate = endDate;
            Id = id;
            InDebt = inDebt;
            InstanceId = instanceId;
            RemainDay = remainDay;
            Status = status;
            SubscriptionType = subscriptionType;
            Trial = trial;
        }
    }
}
