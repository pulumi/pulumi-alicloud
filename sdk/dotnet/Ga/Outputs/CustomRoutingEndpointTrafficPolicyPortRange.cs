// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class CustomRoutingEndpointTrafficPolicyPortRange
    {
        /// <summary>
        /// The start port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
        /// </summary>
        public readonly int? FromPort;
        /// <summary>
        /// The end port of the port range of the traffic destination. The specified port must fall within the port range of the specified endpoint group.
        /// </summary>
        public readonly int? ToPort;

        [OutputConstructor]
        private CustomRoutingEndpointTrafficPolicyPortRange(
            int? fromPort,

            int? toPort)
        {
            FromPort = fromPort;
            ToPort = toPort;
        }
    }
}
