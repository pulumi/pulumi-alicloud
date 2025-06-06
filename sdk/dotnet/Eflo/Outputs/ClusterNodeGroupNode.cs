// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Outputs
{

    [OutputType]
    public sealed class ClusterNodeGroupNode
    {
        /// <summary>
        /// Host name
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Login Password
        /// </summary>
        public readonly string? LoginPassword;
        public readonly string? NodeId;
        public readonly string? VpcId;
        public readonly string? VswitchId;

        [OutputConstructor]
        private ClusterNodeGroupNode(
            string? hostname,

            string? loginPassword,

            string? nodeId,

            string? vpcId,

            string? vswitchId)
        {
            Hostname = hostname;
            LoginPassword = loginPassword;
            NodeId = nodeId;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
