// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class ContainerGroupContainerLivenessProbeTcpSocket
    {
        public readonly int? Port;

        [OutputConstructor]
        private ContainerGroupContainerLivenessProbeTcpSocket(int? port)
        {
            Port = port;
        }
    }
}