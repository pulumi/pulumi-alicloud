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
    public sealed class GetLoadBalancersBalancerBackendServerResult
    {
        public readonly string Description;
        public readonly string ServerId;
        public readonly string Type;
        public readonly int Weight;

        [OutputConstructor]
        private GetLoadBalancersBalancerBackendServerResult(
            string description,

            string serverId,

            string type,

            int weight)
        {
            Description = description;
            ServerId = serverId;
            Type = type;
            Weight = weight;
        }
    }
}
