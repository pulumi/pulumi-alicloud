// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Outputs
{

    [OutputType]
    public sealed class GetAlidnsDomainGroupsGroupResult
    {
        /// <summary>
        /// Number of domain names in the group.
        /// </summary>
        public readonly int DomainCount;
        /// <summary>
        /// Id of the domain group.
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// The name of the domain group.
        /// </summary>
        public readonly string GroupName;
        /// <summary>
        /// Id of the instance.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAlidnsDomainGroupsGroupResult(
            int domainCount,

            string groupId,

            string groupName,

            string id)
        {
            DomainCount = domainCount;
            GroupId = groupId;
            GroupName = groupName;
            Id = id;
        }
    }
}
