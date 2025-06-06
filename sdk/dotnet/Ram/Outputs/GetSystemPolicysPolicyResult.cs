// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram.Outputs
{

    [OutputType]
    public sealed class GetSystemPolicysPolicyResult
    {
        /// <summary>
        /// Number of references.
        /// </summary>
        public readonly int AttachmentCount;
        /// <summary>
        /// Creation time.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The permission policy description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the resource supplied above.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The permission policy name.
        /// </summary>
        public readonly string PolicyName;
        /// <summary>
        /// Permission policy type.
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// Modification time.
        /// </summary>
        public readonly string UpdateDate;

        [OutputConstructor]
        private GetSystemPolicysPolicyResult(
            int attachmentCount,

            string createTime,

            string description,

            string id,

            string policyName,

            string policyType,

            string updateDate)
        {
            AttachmentCount = attachmentCount;
            CreateTime = createTime;
            Description = description;
            Id = id;
            PolicyName = policyName;
            PolicyType = policyType;
            UpdateDate = updateDate;
        }
    }
}
