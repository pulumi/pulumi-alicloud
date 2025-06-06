// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Inputs
{

    public sealed class DomainNewSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of source. Valid values can be ip or doaminName. Each item's `content` can not be repeated.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The port of source. Valid values are `443` and `80`. Default value is `80`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Priority of the source. Valid values are `0` and `100`. Default value is `20`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public DomainNewSourceArgs()
        {
        }
        public static new DomainNewSourceArgs Empty => new DomainNewSourceArgs();
    }
}
