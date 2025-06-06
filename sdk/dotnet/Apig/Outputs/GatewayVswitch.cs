// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Apig.Outputs
{

    [OutputType]
    public sealed class GatewayVswitch
    {
        /// <summary>
        /// The name of the VPC gateway.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The ID of the virtual switch.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private GatewayVswitch(
            string? name,

            string? vswitchId)
        {
            Name = name;
            VswitchId = vswitchId;
        }
    }
}
