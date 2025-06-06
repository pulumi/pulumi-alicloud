// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Outputs
{

    [OutputType]
    public sealed class InstanceToConnectVpcIpBlock
    {
        /// <summary>
        /// The CIDR block of the VSwitch.
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// Specifies whether the IP block is customized.
        /// </summary>
        public readonly bool? Customized;
        /// <summary>
        /// The VSwitch ID.
        /// </summary>
        public readonly string? VswitchId;
        /// <summary>
        /// The zone ID.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private InstanceToConnectVpcIpBlock(
            string cidrBlock,

            bool? customized,

            string? vswitchId,

            string? zoneId)
        {
            CidrBlock = cidrBlock;
            Customized = customized;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
