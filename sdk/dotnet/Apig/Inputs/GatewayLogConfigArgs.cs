// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Apig.Inputs
{

    public sealed class GatewayLogConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sls See `sls` below.
        /// </summary>
        [Input("sls")]
        public Input<Inputs.GatewayLogConfigSlsArgs>? Sls { get; set; }

        public GatewayLogConfigArgs()
        {
        }
        public static new GatewayLogConfigArgs Empty => new GatewayLogConfigArgs();
    }
}
