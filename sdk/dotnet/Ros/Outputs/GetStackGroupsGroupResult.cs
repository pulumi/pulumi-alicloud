// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros.Outputs
{

    [OutputType]
    public sealed class GetStackGroupsGroupResult
    {
        /// <summary>
        /// The name of the RAM administrator role assumed by ROS.
        /// </summary>
        public readonly string AdministrationRoleName;
        /// <summary>
        /// The description of the stack group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the RAM execution role assumed by the administrator role.
        /// </summary>
        public readonly string ExecutionRoleName;
        /// <summary>
        /// The ID of the Stack Group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The parameters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStackGroupsGroupParameterResult> Parameters;
        /// <summary>
        /// The id of Stack Group.
        /// </summary>
        public readonly string StackGroupId;
        /// <summary>
        /// The name of the stack group..
        /// </summary>
        public readonly string StackGroupName;
        /// <summary>
        /// The status of Stack Group.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The structure that contains the template body.
        /// </summary>
        public readonly string TemplateBody;

        [OutputConstructor]
        private GetStackGroupsGroupResult(
            string administrationRoleName,

            string description,

            string executionRoleName,

            string id,

            ImmutableArray<Outputs.GetStackGroupsGroupParameterResult> parameters,

            string stackGroupId,

            string stackGroupName,

            string status,

            string templateBody)
        {
            AdministrationRoleName = administrationRoleName;
            Description = description;
            ExecutionRoleName = executionRoleName;
            Id = id;
            Parameters = parameters;
            StackGroupId = stackGroupId;
            StackGroupName = stackGroupName;
            Status = status;
            TemplateBody = templateBody;
        }
    }
}
