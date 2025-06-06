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
    public sealed class GetCustomRoutingPortMappingsCustomRoutingPortMappingResult
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// The acceleration port.
        /// </summary>
        public readonly int AcceleratorPort;
        /// <summary>
        /// The service IP address and port of the backend instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomRoutingPortMappingsCustomRoutingPortMappingDestinationSocketAddressResult> DestinationSocketAddresses;
        /// <summary>
        /// The ID of the endpoint group.
        /// </summary>
        public readonly string EndpointGroupId;
        /// <summary>
        /// The ID of the region in which the endpoint group resides.
        /// </summary>
        public readonly string EndpointGroupRegion;
        /// <summary>
        /// The ID of the endpoint.
        /// </summary>
        public readonly string EndpointId;
        /// <summary>
        /// The ID of the listener.
        /// </summary>
        public readonly string ListenerId;
        /// <summary>
        /// The protocol of the backend service.
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// The access policy of traffic for the backend instance. Valid Values: `allow`, `deny`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The ID of the endpoint (vSwitch).
        /// </summary>
        public readonly string Vswitch;

        [OutputConstructor]
        private GetCustomRoutingPortMappingsCustomRoutingPortMappingResult(
            string acceleratorId,

            int acceleratorPort,

            ImmutableArray<Outputs.GetCustomRoutingPortMappingsCustomRoutingPortMappingDestinationSocketAddressResult> destinationSocketAddresses,

            string endpointGroupId,

            string endpointGroupRegion,

            string endpointId,

            string listenerId,

            ImmutableArray<string> protocols,

            string status,

            string vswitch)
        {
            AcceleratorId = acceleratorId;
            AcceleratorPort = acceleratorPort;
            DestinationSocketAddresses = destinationSocketAddresses;
            EndpointGroupId = endpointGroupId;
            EndpointGroupRegion = endpointGroupRegion;
            EndpointId = endpointId;
            ListenerId = listenerId;
            Protocols = protocols;
            Status = status;
            Vswitch = vswitch;
        }
    }
}
