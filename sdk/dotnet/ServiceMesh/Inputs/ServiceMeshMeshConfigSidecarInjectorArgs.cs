// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigSidecarInjectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable by Pod Annotations automatic injection Sidecar
        /// </summary>
        [Input("autoInjectionPolicyEnabled")]
        public Input<bool>? AutoInjectionPolicyEnabled { get; set; }

        /// <summary>
        /// Whether it is the all namespaces you turn on the auto injection capabilities
        /// </summary>
        [Input("enableNamespacesByDefault")]
        public Input<bool>? EnableNamespacesByDefault { get; set; }

        /// <summary>
        /// CNI configuration See `init_cni_configuration` below.
        /// </summary>
        [Input("initCniConfiguration")]
        public Input<Inputs.ServiceMeshMeshConfigSidecarInjectorInitCniConfigurationArgs>? InitCniConfiguration { get; set; }

        /// <summary>
        /// Sidecar injector Pods on the throttle
        /// </summary>
        [Input("limitCpu")]
        public Input<string>? LimitCpu { get; set; }

        /// <summary>
        /// Sidecar injector Pods on the throttle
        /// </summary>
        [Input("limitMemory")]
        public Input<string>? LimitMemory { get; set; }

        /// <summary>
        /// Sidecar injector Pods on the requested resource
        /// </summary>
        [Input("requestCpu")]
        public Input<string>? RequestCpu { get; set; }

        /// <summary>
        /// Sidecar injector Pods on the requested resource
        /// </summary>
        [Input("requestMemory")]
        public Input<string>? RequestMemory { get; set; }

        /// <summary>
        /// Other automatic injection Sidecar configuration (in YAML format)
        /// </summary>
        [Input("sidecarInjectorWebhookAsYaml")]
        public Input<string>? SidecarInjectorWebhookAsYaml { get; set; }

        public ServiceMeshMeshConfigSidecarInjectorArgs()
        {
        }
        public static new ServiceMeshMeshConfigSidecarInjectorArgs Empty => new ServiceMeshMeshConfigSidecarInjectorArgs();
    }
}
