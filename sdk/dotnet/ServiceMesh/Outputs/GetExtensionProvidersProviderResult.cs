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
    public sealed class GetExtensionProvidersProviderResult
    {
        /// <summary>
        /// The config of the Service Mesh Extension Provider.
        /// </summary>
        public readonly string Config;
        /// <summary>
        /// The name of the Service Mesh Extension Provider.
        /// </summary>
        public readonly string ExtensionProviderName;
        /// <summary>
        /// The ID of the Service Mesh Extension Provider. It formats as `&lt;service_mesh_id&gt;:&lt;type&gt;:&lt;extension_provider_name&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Service Mesh.
        /// </summary>
        public readonly string ServiceMeshId;
        /// <summary>
        /// The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetExtensionProvidersProviderResult(
            string config,

            string extensionProviderName,

            string id,

            string serviceMeshId,

            string type)
        {
            Config = config;
            ExtensionProviderName = extensionProviderName;
            Id = id;
            ServiceMeshId = serviceMeshId;
            Type = type;
        }
    }
}
