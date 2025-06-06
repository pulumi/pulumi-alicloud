// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class EcsInstanceSetNetworkInterface
    {
        /// <summary>
        /// The description of ENI.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The name of ENI.
        /// </summary>
        public readonly string? NetworkInterfaceName;
        /// <summary>
        /// The primary private IP address of ENI.
        /// </summary>
        public readonly string? PrimaryIpAddress;
        /// <summary>
        /// The ID of the security group to which to assign secondary ENI.
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// The ID of the vSwitch to which to connect ENI.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private EcsInstanceSetNetworkInterface(
            string? description,

            string? networkInterfaceName,

            string? primaryIpAddress,

            string securityGroupId,

            string? vswitchId)
        {
            Description = description;
            NetworkInterfaceName = networkInterfaceName;
            PrimaryIpAddress = primaryIpAddress;
            SecurityGroupId = securityGroupId;
            VswitchId = vswitchId;
        }
    }
}
