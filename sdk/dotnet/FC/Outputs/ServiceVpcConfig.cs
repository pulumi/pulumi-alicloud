// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class ServiceVpcConfig
    {
        /// <summary>
        /// A security group ID associated with the Function Compute Service.
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// A vpc ID associated with the Function Compute Service.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// A list of vswitch IDs associated with the Function Compute Service.
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;

        [OutputConstructor]
        private ServiceVpcConfig(
            string securityGroupId,

            string? vpcId,

            ImmutableArray<string> vswitchIds)
        {
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
            VswitchIds = vswitchIds;
        }
    }
}
