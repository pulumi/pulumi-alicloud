// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Outputs
{

    [OutputType]
    public sealed class ServiceMeshNetwork
    {
        /// <summary>
        /// Security group ID.
        /// </summary>
        public readonly string? SecurityGroupId;
        /// <summary>
        /// VPC ID.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// Virtual Switch ID.
        /// </summary>
        public readonly string VswitcheList;

        [OutputConstructor]
        private ServiceMeshNetwork(
            string? securityGroupId,

            string vpcId,

            string vswitcheList)
        {
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
            VswitcheList = vswitcheList;
        }
    }
}