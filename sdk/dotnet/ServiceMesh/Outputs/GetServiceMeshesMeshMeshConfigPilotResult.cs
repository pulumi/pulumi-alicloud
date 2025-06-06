// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Outputs
{

    [OutputType]
    public sealed class GetServiceMeshesMeshMeshConfigPilotResult
    {
        /// <summary>
        /// Whether to support the HTTP1.0.
        /// </summary>
        public readonly bool Http10Enabled;
        /// <summary>
        /// The  percentage of the Link trace sampling.
        /// </summary>
        public readonly double TraceSampling;

        [OutputConstructor]
        private GetServiceMeshesMeshMeshConfigPilotResult(
            bool http10Enabled,

            double traceSampling)
        {
            Http10Enabled = http10Enabled;
            TraceSampling = traceSampling;
        }
    }
}
