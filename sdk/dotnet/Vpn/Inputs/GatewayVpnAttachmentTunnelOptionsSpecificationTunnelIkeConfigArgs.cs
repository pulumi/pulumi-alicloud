// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Inputs
{

    public sealed class GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("ikeAuthAlg")]
        public Input<string>? IkeAuthAlg { get; set; }

        [Input("ikeEncAlg")]
        public Input<string>? IkeEncAlg { get; set; }

        [Input("ikeLifetime")]
        public Input<int>? IkeLifetime { get; set; }

        [Input("ikeMode")]
        public Input<string>? IkeMode { get; set; }

        [Input("ikePfs")]
        public Input<string>? IkePfs { get; set; }

        [Input("ikeVersion")]
        public Input<string>? IkeVersion { get; set; }

        [Input("localId")]
        public Input<string>? LocalId { get; set; }

        [Input("psk")]
        public Input<string>? Psk { get; set; }

        [Input("remoteId")]
        public Input<string>? RemoteId { get; set; }

        public GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs()
        {
        }
        public static new GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs Empty => new GatewayVpnAttachmentTunnelOptionsSpecificationTunnelIkeConfigArgs();
    }
}
