// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos.Outputs
{

    [OutputType]
    public sealed class SchedulerRuleRule
    {
        /// <summary>
        /// The priority of the rule.
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
        /// </summary>
        public readonly string? RegionId;
        /// <summary>
        /// The status of the scheduling rule.
        /// </summary>
        public readonly int? Status;
        /// <summary>
        /// The address type of the interaction resource. Valid values:
        /// `A`: IPv4 address.
        /// `CNAME`: CNAME record.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The address of the interaction resource.
        /// </summary>
        public readonly string? Value;
        /// <summary>
        /// Required. The type of the linked resource. It is an Integer. Valid values:
        /// `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
        /// `2`: the IP address of the interaction resource (in the tiered protection scenario)
        /// `3`: the IP address used to accelerate access (in the network acceleration scenario)
        /// `6` the IP address of the interaction resource (in the cloud service interaction scenario)
        /// </summary>
        public readonly int? ValueType;

        [OutputConstructor]
        private SchedulerRuleRule(
            int? priority,

            string? regionId,

            int? status,

            string? type,

            string? value,

            int? valueType)
        {
            Priority = priority;
            RegionId = regionId;
            Status = status;
            Type = type;
            Value = value;
            ValueType = valueType;
        }
    }
}
