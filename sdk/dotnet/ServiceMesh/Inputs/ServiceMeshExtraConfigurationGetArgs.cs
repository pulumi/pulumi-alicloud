// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshExtraConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the data plane KubeAPI access capability is enabled.
        /// </summary>
        [Input("crAggregationEnabled")]
        public Input<bool>? CrAggregationEnabled { get; set; }

        public ServiceMeshExtraConfigurationGetArgs()
        {
        }
        public static new ServiceMeshExtraConfigurationGetArgs Empty => new ServiceMeshExtraConfigurationGetArgs();
    }
}
