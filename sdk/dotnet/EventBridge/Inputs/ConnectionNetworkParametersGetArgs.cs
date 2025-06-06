// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Inputs
{

    public sealed class ConnectionNetworkParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
        /// </summary>
        [Input("networkType", required: true)]
        public Input<string> NetworkType { get; set; } = null!;

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The ID of the VSwitch.
        /// </summary>
        [Input("vswitcheId")]
        public Input<string>? VswitcheId { get; set; }

        public ConnectionNetworkParametersGetArgs()
        {
        }
        public static new ConnectionNetworkParametersGetArgs Empty => new ConnectionNetworkParametersGetArgs();
    }
}
