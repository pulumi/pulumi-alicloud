// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Bss.Outputs
{

    [OutputType]
    public sealed class GetOpenApiPricingModulesModuleValueResult
    {
        /// <summary>
        /// The module Code corresponds to the attribute value.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Module value description information.
        /// </summary>
        public readonly string Remark;
        /// <summary>
        /// The attribute value type corresponding to the module Code. Value:
        /// * single_float: single value type.
        /// * range_float: range value type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The module Code corresponds to the attribute value.
        /// &gt; format 1024-1024000 when Type = range_float: 1024 means from 1024 to 1024000, step size 1024.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetOpenApiPricingModulesModuleValueResult(
            string name,

            string remark,

            string type,

            string value)
        {
            Name = name;
            Remark = remark;
            Type = type;
            Value = value;
        }
    }
}
