// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class InstanceNetworkInterfaces
    {
        /// <summary>
        /// The ID of the secondary ENI.
        /// </summary>
        public readonly string? NetworkInterfaceId;

        [OutputConstructor]
        private InstanceNetworkInterfaces(string? networkInterfaceId)
        {
            NetworkInterfaceId = networkInterfaceId;
        }
    }
}