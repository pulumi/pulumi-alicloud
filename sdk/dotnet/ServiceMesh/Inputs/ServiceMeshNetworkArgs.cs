// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security group ID
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// VPC ID
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// Virtual Switch ID
        /// </summary>
        [Input("vswitcheList", required: true)]
        public Input<string> VswitcheList { get; set; } = null!;

        public ServiceMeshNetworkArgs()
        {
        }
        public static new ServiceMeshNetworkArgs Empty => new ServiceMeshNetworkArgs();
    }
}
