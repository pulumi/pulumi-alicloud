// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationLivenessV2TcpSocketGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("port")]
        public Input<int>? Port { get; set; }

        public ApplicationLivenessV2TcpSocketGetArgs()
        {
        }
        public static new ApplicationLivenessV2TcpSocketGetArgs Empty => new ApplicationLivenessV2TcpSocketGetArgs();
    }
}
