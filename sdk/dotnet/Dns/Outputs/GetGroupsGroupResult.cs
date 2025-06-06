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
    public sealed class GetGroupsGroupResult
    {
        /// <summary>
        /// Id of the group.
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// Name of the group.
        /// </summary>
        public readonly string GroupName;

        [OutputConstructor]
        private GetGroupsGroupResult(
            string groupId,

            string groupName)
        {
            GroupId = groupId;
            GroupName = groupName;
        }
    }
}
