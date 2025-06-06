// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Inputs
{

    public sealed class ApiHttpServiceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of backend service.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The name of aone.
        /// </summary>
        [Input("aoneName")]
        public Input<string>? AoneName { get; set; }

        /// <summary>
        /// The content type category of backend service which supports values of 'DEFAULT','CUSTOM' and 'CLIENT'.
        /// </summary>
        [Input("contentTypeCategory")]
        public Input<string>? ContentTypeCategory { get; set; }

        /// <summary>
        /// The content type value of backend service.
        /// </summary>
        [Input("contentTypeValue")]
        public Input<string>? ContentTypeValue { get; set; }

        /// <summary>
        /// The http method of backend service.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// The path of backend service.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Backend service time-out time; unit: millisecond.
        /// </summary>
        [Input("timeout", required: true)]
        public Input<int> Timeout { get; set; } = null!;

        public ApiHttpServiceConfigGetArgs()
        {
        }
        public static new ApiHttpServiceConfigGetArgs Empty => new ApiHttpServiceConfigGetArgs();
    }
}
