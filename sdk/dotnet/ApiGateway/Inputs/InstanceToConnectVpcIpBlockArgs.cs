// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Inputs
{

    public sealed class InstanceToConnectVpcIpBlockArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR block of the VSwitch.
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// Specifies whether the IP block is customized.
        /// </summary>
        [Input("customized")]
        public Input<bool>? Customized { get; set; }

        /// <summary>
        /// The VSwitch ID.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The zone ID.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceToConnectVpcIpBlockArgs()
        {
        }
        public static new InstanceToConnectVpcIpBlockArgs Empty => new InstanceToConnectVpcIpBlockArgs();
    }
}