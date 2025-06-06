// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Inputs
{

    public sealed class DbInstanceEndpointNodeItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the node.
        /// </summary>
        [Input("nodeId", required: true)]
        public Input<string> NodeId { get; set; } = null!;

        /// <summary>
        /// The weight of the node. Read requests are distributed based on the weight.Valid values: 0 to 100.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public DbInstanceEndpointNodeItemGetArgs()
        {
        }
        public static new DbInstanceEndpointNodeItemGetArgs Empty => new DbInstanceEndpointNodeItemGetArgs();
    }
}
