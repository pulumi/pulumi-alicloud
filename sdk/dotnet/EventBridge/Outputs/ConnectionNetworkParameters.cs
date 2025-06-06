// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Outputs
{

    [OutputType]
    public sealed class ConnectionNetworkParameters
    {
        /// <summary>
        /// The network type. Valid values: `PublicNetwork`, `PrivateNetwork`. **NOTE:** If you set `network_type` to `PrivateNetwork`, you must configure `vpc_id`, `vswitche_id`, and `security_group_id`.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The ID of the security group.
        /// </summary>
        public readonly string? SecurityGroupId;
        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// The ID of the VSwitch.
        /// </summary>
        public readonly string? VswitcheId;

        [OutputConstructor]
        private ConnectionNetworkParameters(
            string networkType,

            string? securityGroupId,

            string? vpcId,

            string? vswitcheId)
        {
            NetworkType = networkType;
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
            VswitcheId = vswitcheId;
        }
    }
}
