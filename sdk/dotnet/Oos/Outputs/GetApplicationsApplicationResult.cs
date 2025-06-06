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
    public sealed class GetApplicationsApplicationResult
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        public readonly string ApplicationName;
        /// <summary>
        /// The Created time of the application.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Application group description information.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Application. The value is formate as &lt;application_name&gt;.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The Updated time of the application.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetApplicationsApplicationResult(
            string applicationName,

            string createTime,

            string description,

            string id,

            string resourceGroupId,

            ImmutableDictionary<string, string> tags,

            string updateTime)
        {
            ApplicationName = applicationName;
            CreateTime = createTime;
            Description = description;
            Id = id;
            ResourceGroupId = resourceGroupId;
            Tags = tags;
            UpdateTime = updateTime;
        }
    }
}
