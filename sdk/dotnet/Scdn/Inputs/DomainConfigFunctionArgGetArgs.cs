// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Scdn.Inputs
{

    public sealed class DomainConfigFunctionArgGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of arg.
        /// </summary>
        [Input("argName", required: true)]
        public Input<string> ArgName { get; set; } = null!;

        /// <summary>
        /// The value of arg.
        /// </summary>
        [Input("argValue", required: true)]
        public Input<string> ArgValue { get; set; } = null!;

        public DomainConfigFunctionArgGetArgs()
        {
        }
        public static new DomainConfigFunctionArgGetArgs Empty => new DomainConfigFunctionArgGetArgs();
    }
}
