// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oos.Outputs
{

    [OutputType]
    public sealed class GetParametersParameterResult
    {
        /// <summary>
        /// The constraints of the common parameter.
        /// </summary>
        public readonly string Constraints;
        /// <summary>
        /// The time when the common parameter was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The user who created the common parameter.
        /// </summary>
        public readonly string CreatedBy;
        /// <summary>
        /// The description of the common parameter.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Parameter. Its value is same as `parameter_name`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the common parameter.
        /// </summary>
        public readonly string ParameterId;
        /// <summary>
        /// The name of the common parameter.
        /// </summary>
        public readonly string ParameterName;
        /// <summary>
        /// The version number of the common parameter.
        /// </summary>
        public readonly int ParameterVersion;
        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The share type of the common parameter.
        /// </summary>
        public readonly string ShareType;
        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// The data type of the common parameter.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The user who updated the common parameter.
        /// </summary>
        public readonly string UpdatedBy;
        /// <summary>
        /// The time when the common parameter was updated.
        /// </summary>
        public readonly string UpdatedDate;
        /// <summary>
        /// The value of the common parameter.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetParametersParameterResult(
            string constraints,

            string createTime,

            string createdBy,

            string description,

            string id,

            string parameterId,

            string parameterName,

            int parameterVersion,

            string resourceGroupId,

            string shareType,

            ImmutableDictionary<string, object> tags,

            string type,

            string updatedBy,

            string updatedDate,

            string value)
        {
            Constraints = constraints;
            CreateTime = createTime;
            CreatedBy = createdBy;
            Description = description;
            Id = id;
            ParameterId = parameterId;
            ParameterName = parameterName;
            ParameterVersion = parameterVersion;
            ResourceGroupId = resourceGroupId;
            ShareType = shareType;
            Tags = tags;
            Type = type;
            UpdatedBy = updatedBy;
            UpdatedDate = updatedDate;
            Value = value;
        }
    }
}