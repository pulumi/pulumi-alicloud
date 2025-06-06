// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class ContainerGroupHostAlias
    {
        /// <summary>
        /// The information about the host.
        /// </summary>
        public readonly ImmutableArray<string> Hostnames;
        /// <summary>
        /// The IP address of the host.
        /// </summary>
        public readonly string? Ip;

        [OutputConstructor]
        private ContainerGroupHostAlias(
            ImmutableArray<string> hostnames,

            string? ip)
        {
            Hostnames = hostnames;
            Ip = ip;
        }
    }
}
