// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigKialiRamOauthConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The redirect Uri provided to the RAM OAuth application. This needs to be the access address of the mesh topology service. When not provided, the redirect Uri will be automatically inferred based on the ServerConfig or the CLB address of the mesh topology integration.
        /// </summary>
        [Input("redirectUris")]
        public Input<string>? RedirectUris { get; set; }

        public ServiceMeshMeshConfigKialiRamOauthConfigGetArgs()
        {
        }
        public static new ServiceMeshMeshConfigKialiRamOauthConfigGetArgs Empty => new ServiceMeshMeshConfigKialiRamOauthConfigGetArgs();
    }
}