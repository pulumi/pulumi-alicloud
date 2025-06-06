// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class V3CustomDomainAuthConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication Information
        /// </summary>
        [Input("authInfo")]
        public Input<string>? AuthInfo { get; set; }

        /// <summary>
        /// Authentication type. anonymous, function, or jwt.
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        public V3CustomDomainAuthConfigArgs()
        {
        }
        public static new V3CustomDomainAuthConfigArgs Empty => new V3CustomDomainAuthConfigArgs();
    }
}
