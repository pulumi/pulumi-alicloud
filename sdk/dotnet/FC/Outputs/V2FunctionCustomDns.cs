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
    public sealed class V2FunctionCustomDns
    {
        /// <summary>
        /// DNS resolver configuration parameter list. See `dns_options` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.V2FunctionCustomDnsDnsOption> DnsOptions;
        /// <summary>
        /// List of IP addresses of DNS servers.
        /// </summary>
        public readonly ImmutableArray<string> NameServers;
        /// <summary>
        /// List of DNS search domains.
        /// </summary>
        public readonly ImmutableArray<string> Searches;

        [OutputConstructor]
        private V2FunctionCustomDns(
            ImmutableArray<Outputs.V2FunctionCustomDnsDnsOption> dnsOptions,

            ImmutableArray<string> nameServers,

            ImmutableArray<string> searches)
        {
            DnsOptions = dnsOptions;
            NameServers = nameServers;
            Searches = searches;
        }
    }
}
