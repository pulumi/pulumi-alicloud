// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn.Outputs
{

    [OutputType]
    public sealed class GetWafPoliciesPolicyResult
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string DcdnWafPolicyId;
        /// <summary>
        /// The type of protection policy.
        /// </summary>
        public readonly string DefenseScene;
        /// <summary>
        /// The number of domain names that use this protection policy.
        /// </summary>
        public readonly int DomainCount;
        /// <summary>
        /// The time when the protection policy was modified.
        /// </summary>
        public readonly string GmtModified;
        /// <summary>
        /// The ID of the Waf Policy.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the protection policy.
        /// </summary>
        public readonly string PolicyName;
        /// <summary>
        /// The type of the protection policy.
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// The number of protection rules in this protection policy.
        /// </summary>
        public readonly string RuleCount;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetWafPoliciesPolicyResult(
            string dcdnWafPolicyId,

            string defenseScene,

            int domainCount,

            string gmtModified,

            string id,

            string policyName,

            string policyType,

            string ruleCount,

            string status)
        {
            DcdnWafPolicyId = dcdnWafPolicyId;
            DefenseScene = defenseScene;
            DomainCount = domainCount;
            GmtModified = gmtModified;
            Id = id;
            PolicyName = policyName;
            PolicyType = policyType;
            RuleCount = ruleCount;
            Status = status;
        }
    }
}