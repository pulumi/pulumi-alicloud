// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Outputs
{

    [OutputType]
    public sealed class GetRemoteWritesRemoteWriteResult
    {
        /// <summary>
        /// The ID of the Prometheus instance.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The ID of the Remote Write. It formats as `&lt;cluster_id&gt;:&lt;remote_write_name&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Remote Write configuration item.
        /// </summary>
        public readonly string RemoteWriteName;
        /// <summary>
        /// The details of the Remote Write configuration item. The value is in the YAML format.
        /// </summary>
        public readonly string RemoteWriteYaml;

        [OutputConstructor]
        private GetRemoteWritesRemoteWriteResult(
            string clusterId,

            string id,

            string remoteWriteName,

            string remoteWriteYaml)
        {
            ClusterId = clusterId;
            Id = id;
            RemoteWriteName = remoteWriteName;
            RemoteWriteYaml = remoteWriteYaml;
        }
    }
}
