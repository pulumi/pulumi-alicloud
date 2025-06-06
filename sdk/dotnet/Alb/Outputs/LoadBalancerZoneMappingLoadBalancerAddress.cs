// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class LoadBalancerZoneMappingLoadBalancerAddress
    {
        /// <summary>
        /// An IP address of the IPv4 type.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// The elastic IP identifier.
        /// </summary>
        public readonly string? AllocationId;
        /// <summary>
        /// The type of the public EIP. Value:
        /// </summary>
        public readonly string? EipType;
        /// <summary>
        /// IPv4 private network address.
        /// </summary>
        public readonly string? IntranetAddress;
        /// <summary>
        /// The private network IPv4 address detection status of the application-oriented load balancing instance.
        /// </summary>
        public readonly string? IntranetAddressHcStatus;
        /// <summary>
        /// IPv4 Local address list. The list of addresses used by ALB to interact with the backend service.
        /// </summary>
        public readonly ImmutableArray<string> Ipv4LocalAddresses;
        /// <summary>
        /// An IP address of the IPv6 type.
        /// </summary>
        public readonly string? Ipv6Address;
        /// <summary>
        /// The IPv6 address detection status of the application-based load balancing instance.
        /// </summary>
        public readonly string? Ipv6AddressHcStatus;
        /// <summary>
        /// IPv6 Local address list. The list of addresses used by ALB to interact with the backend service.
        /// </summary>
        public readonly ImmutableArray<string> Ipv6LocalAddresses;

        [OutputConstructor]
        private LoadBalancerZoneMappingLoadBalancerAddress(
            string? address,

            string? allocationId,

            string? eipType,

            string? intranetAddress,

            string? intranetAddressHcStatus,

            ImmutableArray<string> ipv4LocalAddresses,

            string? ipv6Address,

            string? ipv6AddressHcStatus,

            ImmutableArray<string> ipv6LocalAddresses)
        {
            Address = address;
            AllocationId = allocationId;
            EipType = eipType;
            IntranetAddress = intranetAddress;
            IntranetAddressHcStatus = intranetAddressHcStatus;
            Ipv4LocalAddresses = ipv4LocalAddresses;
            Ipv6Address = ipv6Address;
            Ipv6AddressHcStatus = ipv6AddressHcStatus;
            Ipv6LocalAddresses = ipv6LocalAddresses;
        }
    }
}
