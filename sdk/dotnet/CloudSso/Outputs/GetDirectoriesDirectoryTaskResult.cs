// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Outputs
{

    [OutputType]
    public sealed class GetDirectoriesDirectoryTaskResult
    {
        /// <summary>
        /// The ID of Access Configuration.
        /// </summary>
        public readonly string AccessConfigurationId;
        /// <summary>
        /// The Name of Access Configuration.
        /// </summary>
        public readonly string AccessConfigurationName;
        /// <summary>
        /// The End Time of Task.
        /// </summary>
        public readonly string EndTime;
        /// <summary>
        /// the Reason for the Failure of  the task.
        /// </summary>
        public readonly string FailureReason;
        /// <summary>
        /// The ID of Cloud SSO Identity.
        /// </summary>
        public readonly string PrincipalId;
        /// <summary>
        /// The Name of Cloud SSO Identity.
        /// </summary>
        public readonly string PrincipalName;
        /// <summary>
        /// The Type of Cloud SSO Identity.
        /// </summary>
        public readonly string PrincipalType;
        /// <summary>
        /// The Start Time of Task.
        /// </summary>
        public readonly string StartTime;
        /// <summary>
        /// The Task Status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The Id of deploy target.
        /// </summary>
        public readonly string TargetId;
        /// <summary>
        /// The Name of Deploy Target.
        /// </summary>
        public readonly string TargetName;
        /// <summary>
        /// The Path in RD of Deploy Target.
        /// </summary>
        public readonly string TargetPath;
        /// <summary>
        /// The Type of Deploy Target.
        /// </summary>
        public readonly string TargetType;
        /// <summary>
        /// The ID of the Task.
        /// </summary>
        public readonly string TaskId;
        /// <summary>
        /// The Type of the Task.
        /// </summary>
        public readonly string TaskType;

        [OutputConstructor]
        private GetDirectoriesDirectoryTaskResult(
            string accessConfigurationId,

            string accessConfigurationName,

            string endTime,

            string failureReason,

            string principalId,

            string principalName,

            string principalType,

            string startTime,

            string status,

            string targetId,

            string targetName,

            string targetPath,

            string targetType,

            string taskId,

            string taskType)
        {
            AccessConfigurationId = accessConfigurationId;
            AccessConfigurationName = accessConfigurationName;
            EndTime = endTime;
            FailureReason = failureReason;
            PrincipalId = principalId;
            PrincipalName = principalName;
            PrincipalType = principalType;
            StartTime = startTime;
            Status = status;
            TargetId = targetId;
            TargetName = targetName;
            TargetPath = targetPath;
            TargetType = targetType;
            TaskId = taskId;
            TaskType = taskType;
        }
    }
}
