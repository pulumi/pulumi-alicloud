// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager.Outputs
{

    [OutputType]
    public sealed class GetPoliciesPolicyResult
    {
        /// <summary>
        /// The number of times the policy is referenced.
        /// </summary>
        public readonly int AttachmentCount;
        /// <summary>
        /// The default version of the policy.
        /// </summary>
        public readonly string DefaultVersion;
        /// <summary>
        /// The description of the policy.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the policy.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the policy.
        /// </summary>
        public readonly string PolicyName;
        /// <summary>
        /// The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// The time when the policy was updated.
        /// </summary>
        public readonly string UpdateDate;

        [OutputConstructor]
        private GetPoliciesPolicyResult(
            int attachmentCount,

            string defaultVersion,

            string description,

            string id,

            string policyName,

            string policyType,

            string updateDate)
        {
            AttachmentCount = attachmentCount;
            DefaultVersion = defaultVersion;
            Description = description;
            Id = id;
            PolicyName = policyName;
            PolicyType = policyType;
            UpdateDate = updateDate;
        }
    }
}
