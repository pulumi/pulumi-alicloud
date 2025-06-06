// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class GetAlertContactGroupsGroupResult
    {
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string AlertContactGroupId;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string AlertContactGroupName;
        /// <summary>
        /// contact ids.
        /// </summary>
        public readonly ImmutableArray<string> ContactIds;
        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the Alert Contact Group.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAlertContactGroupsGroupResult(
            string alertContactGroupId,

            string alertContactGroupName,

            ImmutableArray<string> contactIds,

            string createTime,

            string id)
        {
            AlertContactGroupId = alertContactGroupId;
            AlertContactGroupName = alertContactGroupName;
            ContactIds = contactIds;
            CreateTime = createTime;
            Id = id;
        }
    }
}
