// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Outputs
{

    [OutputType]
    public sealed class GetServiceMeshesMeshNetworkResult
    {
        /// <summary>
        /// The ID of the Security group
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The list of Virtual Switch.
        /// </summary>
        public readonly ImmutableArray<string> VswitcheLists;

        [OutputConstructor]
        private GetServiceMeshesMeshNetworkResult(
            string securityGroupId,

            string vpcId,

            ImmutableArray<string> vswitcheLists)
        {
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
            VswitcheLists = vswitcheLists;
        }
    }
}
