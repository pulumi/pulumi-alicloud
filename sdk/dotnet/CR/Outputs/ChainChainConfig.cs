// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR.Outputs
{

    [OutputType]
    public sealed class ChainChainConfig
    {
        /// <summary>
        /// Each node in the delivery chain. See `nodes` below.
        /// 
        /// &gt; **NOTE:** The `from` and `to` fields are all fixed, and their structure and the value of `node_name` are fixed. You can refer to the template given in the example for configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.ChainChainConfigNode> Nodes;
        /// <summary>
        /// Execution sequence relationship between delivery chain nodes. See `routers` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ChainChainConfigRouter> Routers;

        [OutputConstructor]
        private ChainChainConfig(
            ImmutableArray<Outputs.ChainChainConfigNode> nodes,

            ImmutableArray<Outputs.ChainChainConfigRouter> routers)
        {
            Nodes = nodes;
            Routers = routers;
        }
    }
}