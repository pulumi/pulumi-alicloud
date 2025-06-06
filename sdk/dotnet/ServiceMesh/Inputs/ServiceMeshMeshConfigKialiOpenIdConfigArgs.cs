// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigKialiOpenIdConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client id provided by the OIDC application
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The client secret provided by the OIDC application
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// OIDC应用的Issuer URI
        /// </summary>
        [Input("issuerUri")]
        public Input<string>? IssuerUri { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// The scope of the mesh topology request to the OIDC application
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public ServiceMeshMeshConfigKialiOpenIdConfigArgs()
        {
        }
        public static new ServiceMeshMeshConfigKialiOpenIdConfigArgs Empty => new ServiceMeshMeshConfigKialiOpenIdConfigArgs();
    }
}
