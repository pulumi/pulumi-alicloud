// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationPvtzDiscoverySvcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables the Kubernetes Service-based registration and discovery feature.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The ID of the namespace.
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        [Input("portProtocols")]
        private InputList<Inputs.ApplicationPvtzDiscoverySvcPortProtocolArgs>? _portProtocols;

        /// <summary>
        /// The port number and protocol. See `port_protocols` below.
        /// </summary>
        public InputList<Inputs.ApplicationPvtzDiscoverySvcPortProtocolArgs> PortProtocols
        {
            get => _portProtocols ?? (_portProtocols = new InputList<Inputs.ApplicationPvtzDiscoverySvcPortProtocolArgs>());
            set => _portProtocols = value;
        }

        /// <summary>
        /// The name of the Service.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public ApplicationPvtzDiscoverySvcArgs()
        {
        }
        public static new ApplicationPvtzDiscoverySvcArgs Empty => new ApplicationPvtzDiscoverySvcArgs();
    }
}
