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
    public sealed class GetServiceMeshesMeshMeshConfigPrometheusResult
    {
        /// <summary>
        /// The  service addresses of the Prometheus.
        /// </summary>
        public readonly string ExternalUrl;
        /// <summary>
        /// Whether to enable external Prometheus.
        /// </summary>
        public readonly bool UseExternal;

        [OutputConstructor]
        private GetServiceMeshesMeshMeshConfigPrometheusResult(
            string externalUrl,

            bool useExternal)
        {
            ExternalUrl = externalUrl;
            UseExternal = useExternal;
        }
    }
}
