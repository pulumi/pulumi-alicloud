// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Outputs
{

    [OutputType]
    public sealed class ClusterComponentComponentConfig
    {
        /// <summary>
        /// Component Basic Parameters
        /// </summary>
        public readonly string? BasicArgs;
        /// <summary>
        /// Node pool configuration, and is used to establish the corresponding relationship between node groups and node pools. When
        /// ComponentType = "ACKEdge" is required. Other values are empty.
        /// </summary>
        public readonly ImmutableArray<string> NodeUnits;

        [OutputConstructor]
        private ClusterComponentComponentConfig(
            string? basicArgs,

            ImmutableArray<string> nodeUnits)
        {
            BasicArgs = basicArgs;
            NodeUnits = nodeUnits;
        }
    }
}
