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
    public sealed class ContainerGroupContainerPort
    {
        public readonly int? Port;
        public readonly string? Protocol;

        [OutputConstructor]
        private ContainerGroupContainerPort(
            int? port,

            string? protocol)
        {
            Port = port;
            Protocol = protocol;
        }
    }
}
