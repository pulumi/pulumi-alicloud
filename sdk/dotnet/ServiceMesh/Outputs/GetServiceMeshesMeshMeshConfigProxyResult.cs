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
    public sealed class GetServiceMeshesMeshMeshConfigProxyResult
    {
        /// <summary>
        /// The domain name of the Cluster.
        /// </summary>
        public readonly string ClusterDomain;
        /// <summary>
        /// Sidecar injector Pods on the throttle.
        /// </summary>
        public readonly string LimitCpu;
        /// <summary>
        /// The memory limit  of the Sidecar injector Pods.
        /// </summary>
        public readonly string LimitMemory;
        /// <summary>
        /// The requested cpu the Sidecar injector Pods.
        /// </summary>
        public readonly string RequestCpu;
        /// <summary>
        /// The requested memory the Sidecar injector Pods.
        /// </summary>
        public readonly string RequestMemory;

        [OutputConstructor]
        private GetServiceMeshesMeshMeshConfigProxyResult(
            string clusterDomain,

            string limitCpu,

            string limitMemory,

            string requestCpu,

            string requestMemory)
        {
            ClusterDomain = clusterDomain;
            LimitCpu = limitCpu;
            LimitMemory = limitMemory;
            RequestCpu = requestCpu;
            RequestMemory = requestMemory;
        }
    }
}
