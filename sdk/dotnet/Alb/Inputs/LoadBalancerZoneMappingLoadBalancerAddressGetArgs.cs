// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class LoadBalancerZoneMappingLoadBalancerAddressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An IP address of the IPv4 type.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The elastic IP identifier.
        /// </summary>
        [Input("allocationId")]
        public Input<string>? AllocationId { get; set; }

        /// <summary>
        /// The type of the public EIP. Value:
        /// </summary>
        [Input("eipType")]
        public Input<string>? EipType { get; set; }

        /// <summary>
        /// IPv4 private network address.
        /// </summary>
        [Input("intranetAddress")]
        public Input<string>? IntranetAddress { get; set; }

        /// <summary>
        /// The private network IPv4 address detection status of the application-oriented load balancing instance.
        /// </summary>
        [Input("intranetAddressHcStatus")]
        public Input<string>? IntranetAddressHcStatus { get; set; }

        [Input("ipv4LocalAddresses")]
        private InputList<string>? _ipv4LocalAddresses;

        /// <summary>
        /// IPv4 Local address list. The list of addresses used by ALB to interact with the backend service.
        /// </summary>
        public InputList<string> Ipv4LocalAddresses
        {
            get => _ipv4LocalAddresses ?? (_ipv4LocalAddresses = new InputList<string>());
            set => _ipv4LocalAddresses = value;
        }

        /// <summary>
        /// An IP address of the IPv6 type.
        /// </summary>
        [Input("ipv6Address")]
        public Input<string>? Ipv6Address { get; set; }

        /// <summary>
        /// The IPv6 address detection status of the application-based load balancing instance.
        /// </summary>
        [Input("ipv6AddressHcStatus")]
        public Input<string>? Ipv6AddressHcStatus { get; set; }

        [Input("ipv6LocalAddresses")]
        private InputList<string>? _ipv6LocalAddresses;

        /// <summary>
        /// IPv6 Local address list. The list of addresses used by ALB to interact with the backend service.
        /// </summary>
        public InputList<string> Ipv6LocalAddresses
        {
            get => _ipv6LocalAddresses ?? (_ipv6LocalAddresses = new InputList<string>());
            set => _ipv6LocalAddresses = value;
        }

        public LoadBalancerZoneMappingLoadBalancerAddressGetArgs()
        {
        }
        public static new LoadBalancerZoneMappingLoadBalancerAddressGetArgs Empty => new LoadBalancerZoneMappingLoadBalancerAddressGetArgs();
    }
}
