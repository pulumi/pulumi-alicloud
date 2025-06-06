// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class DbInstanceEndpointNodeItem
    {
        /// <summary>
        /// The ID of the node.
        /// </summary>
        public readonly string NodeId;
        /// <summary>
        /// The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private DbInstanceEndpointNodeItem(
            string nodeId,

            int weight)
        {
            NodeId = nodeId;
            Weight = weight;
        }
    }
}
