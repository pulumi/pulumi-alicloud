// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MaxCompute.Outputs
{

    [OutputType]
    public sealed class GetProjectsProjectResult
    {
        /// <summary>
        /// Project description information. The length is 1 to 256 English or Chinese characters. The default value is blank.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// View the current storage size of the Project. The storage size is the same as the measurement size, that is, the compressed logical storage size collected by the Project.
        /// </summary>
        public readonly string CostStorage;
        /// <summary>
        /// Represents the creation time of the project
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Used to implement computing resource allocation.If the calculation Quota is not specified, the default Quota resource will be consumed by jobs initiated by the project. For more information about computing resource usage, see [Computing Resource Usage](https://www.alibabacloud.com/help/en/maxcompute/user-guide/use-of-computing-resources).
        /// </summary>
        public readonly string DefaultQuota;
        /// <summary>
        /// IP whitelist
        /// </summary>
        public readonly Outputs.GetProjectsProjectIpWhiteListResult IpWhiteList;
        /// <summary>
        /// Project owner
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// The name begins with a letter, containing letters, digits, and underscores (_). It can be 3 to 28 characters in length and is globally unique.
        /// </summary>
        public readonly string ProjectName;
        /// <summary>
        /// Project base attributes
        /// </summary>
        public readonly Outputs.GetProjectsProjectPropertiesResult Properties;
        /// <summary>
        /// Security-related attributes
        /// </summary>
        public readonly Outputs.GetProjectsProjectSecurityPropertiesResult SecurityProperties;
        /// <summary>
        /// The project status. Default value: AVAILABLE. Value: (AVAILABLE/READONLY/FROZEN/DELETING)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Project type
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetProjectsProjectResult(
            string comment,

            string costStorage,

            string createTime,

            string defaultQuota,

            Outputs.GetProjectsProjectIpWhiteListResult ipWhiteList,

            string owner,

            string projectName,

            Outputs.GetProjectsProjectPropertiesResult properties,

            Outputs.GetProjectsProjectSecurityPropertiesResult securityProperties,

            string status,

            string type)
        {
            Comment = comment;
            CostStorage = costStorage;
            CreateTime = createTime;
            DefaultQuota = defaultQuota;
            IpWhiteList = ipWhiteList;
            Owner = owner;
            ProjectName = projectName;
            Properties = properties;
            SecurityProperties = securityProperties;
            Status = status;
            Type = type;
        }
    }
}
