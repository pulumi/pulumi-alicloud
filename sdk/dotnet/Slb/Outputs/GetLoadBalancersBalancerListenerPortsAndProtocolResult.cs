// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersBalancerListenerPortsAndProtocolResult
    {
        public readonly string Description;
        public readonly int ForwardPort;
        public readonly string ListenerForward;
        public readonly int ListenerPort;
        public readonly string ListenerProtocol;

        [OutputConstructor]
        private GetLoadBalancersBalancerListenerPortsAndProtocolResult(
            string description,

            int forwardPort,

            string listenerForward,

            int listenerPort,

            string listenerProtocol)
        {
            Description = description;
            ForwardPort = forwardPort;
            ListenerForward = listenerForward;
            ListenerPort = listenerPort;
            ListenerProtocol = listenerProtocol;
        }
    }
}
