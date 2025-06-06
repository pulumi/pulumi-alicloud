// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Inputs
{

    public sealed class ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable authentication.
        /// </summary>
        [Input("isValueSecret")]
        public Input<string>? IsValueSecret { get; set; }

        /// <summary>
        /// The key of the request path.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The key of the request path.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameterGetArgs()
        {
        }
        public static new ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameterGetArgs Empty => new ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameterGetArgs();
    }
}
