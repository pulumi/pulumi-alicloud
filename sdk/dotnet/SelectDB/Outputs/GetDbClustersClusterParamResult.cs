// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.SelectDB.Outputs
{

    [OutputType]
    public sealed class GetDbClustersClusterParamResult
    {
        /// <summary>
        /// The comments on the parameter.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The default value of the parameter.
        /// </summary>
        public readonly string DefaultValue;
        /// <summary>
        /// Indicates whether the parameter immediately takes effect without requiring a restart.
        /// </summary>
        public readonly int IsDynamic;
        /// <summary>
        /// Indicates whether the parameter is modifiable.
        /// </summary>
        public readonly int IsUserModifiable;
        /// <summary>
        /// Changed parameter name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value range of the parameter.
        /// </summary>
        public readonly string Optional;
        /// <summary>
        /// The category of the parameter.
        /// </summary>
        public readonly string ParamCategory;
        /// <summary>
        /// The new value of Parameter.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetDbClustersClusterParamResult(
            string comment,

            string defaultValue,

            int isDynamic,

            int isUserModifiable,

            string name,

            string optional,

            string paramCategory,

            string value)
        {
            Comment = comment;
            DefaultValue = defaultValue;
            IsDynamic = isDynamic;
            IsUserModifiable = isUserModifiable;
            Name = name;
            Optional = optional;
            ParamCategory = paramCategory;
            Value = value;
        }
    }
}
