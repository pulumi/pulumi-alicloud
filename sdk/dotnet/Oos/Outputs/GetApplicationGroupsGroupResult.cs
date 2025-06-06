// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oos.Outputs
{

    [OutputType]
    public sealed class GetApplicationGroupsGroupResult
    {
        /// <summary>
        /// The name of the Application group.
        /// </summary>
        public readonly string ApplicationGroupName;
        /// <summary>
        /// The name of the Application.
        /// </summary>
        public readonly string ApplicationName;
        /// <summary>
        /// The ID of the cloud monitor group.
        /// </summary>
        public readonly string CmsGroupId;
        /// <summary>
        /// The Creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The region ID of the deployment.
        /// </summary>
        public readonly string DeployRegionId;
        /// <summary>
        /// Application group description information.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Application Group. Its value is same as Queue Name.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Label key.
        /// </summary>
        public readonly string ImportTagKey;
        /// <summary>
        /// Label value.
        /// </summary>
        public readonly string ImportTagValue;
        /// <summary>
        /// The Update time of the resource.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetApplicationGroupsGroupResult(
            string applicationGroupName,

            string applicationName,

            string cmsGroupId,

            string createTime,

            string deployRegionId,

            string description,

            string id,

            string importTagKey,

            string importTagValue,

            string updateTime)
        {
            ApplicationGroupName = applicationGroupName;
            ApplicationName = applicationName;
            CmsGroupId = cmsGroupId;
            CreateTime = createTime;
            DeployRegionId = deployRegionId;
            Description = description;
            Id = id;
            ImportTagKey = importTagKey;
            ImportTagValue = importTagValue;
            UpdateTime = updateTime;
        }
    }
}
