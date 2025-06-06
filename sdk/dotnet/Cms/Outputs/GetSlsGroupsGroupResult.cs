// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class GetSlsGroupsGroupResult
    {
        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the Sls Group. Its value is same as Queue Name.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Config of the Sls Group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSlsGroupsGroupSlsGroupConfigResult> SlsGroupConfigs;
        /// <summary>
        /// The Description of the Sls Group.
        /// </summary>
        public readonly string SlsGroupDescription;
        /// <summary>
        /// The name of the resource.
        /// </summary>
        public readonly string SlsGroupName;

        [OutputConstructor]
        private GetSlsGroupsGroupResult(
            string createTime,

            string id,

            ImmutableArray<Outputs.GetSlsGroupsGroupSlsGroupConfigResult> slsGroupConfigs,

            string slsGroupDescription,

            string slsGroupName)
        {
            CreateTime = createTime;
            Id = id;
            SlsGroupConfigs = slsGroupConfigs;
            SlsGroupDescription = slsGroupDescription;
            SlsGroupName = slsGroupName;
        }
    }
}
