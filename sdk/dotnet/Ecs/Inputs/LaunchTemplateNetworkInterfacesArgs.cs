// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class LaunchTemplateNetworkInterfacesArgs : global::Pulumi.ResourceArgs
    {
        [Input("deleteOnRelease")]
        public Input<bool>? DeleteOnRelease { get; set; }

        /// <summary>
        /// The ENI description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// ENI name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The primary private IP address of the ENI.
        /// </summary>
        [Input("primaryIp")]
        public Input<string>? PrimaryIp { get; set; }

        /// <summary>
        /// The security group ID must be one in the same VPC.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public LaunchTemplateNetworkInterfacesArgs()
        {
        }
        public static new LaunchTemplateNetworkInterfacesArgs Empty => new LaunchTemplateNetworkInterfacesArgs();
    }
}
