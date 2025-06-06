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
    public sealed class ServiceMeshMeshConfigSidecarInjector
    {
        /// <summary>
        /// Whether to enable by Pod Annotations automatic injection Sidecar
        /// </summary>
        public readonly bool? AutoInjectionPolicyEnabled;
        /// <summary>
        /// Whether it is the all namespaces you turn on the auto injection capabilities
        /// </summary>
        public readonly bool? EnableNamespacesByDefault;
        /// <summary>
        /// CNI configuration See `init_cni_configuration` below.
        /// </summary>
        public readonly Outputs.ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration? InitCniConfiguration;
        /// <summary>
        /// Sidecar injector Pods on the throttle
        /// </summary>
        public readonly string? LimitCpu;
        /// <summary>
        /// Sidecar injector Pods on the throttle
        /// </summary>
        public readonly string? LimitMemory;
        /// <summary>
        /// Sidecar injector Pods on the requested resource
        /// </summary>
        public readonly string? RequestCpu;
        /// <summary>
        /// Sidecar injector Pods on the requested resource
        /// </summary>
        public readonly string? RequestMemory;
        /// <summary>
        /// Other automatic injection Sidecar configuration (in YAML format)
        /// </summary>
        public readonly string? SidecarInjectorWebhookAsYaml;

        [OutputConstructor]
        private ServiceMeshMeshConfigSidecarInjector(
            bool? autoInjectionPolicyEnabled,

            bool? enableNamespacesByDefault,

            Outputs.ServiceMeshMeshConfigSidecarInjectorInitCniConfiguration? initCniConfiguration,

            string? limitCpu,

            string? limitMemory,

            string? requestCpu,

            string? requestMemory,

            string? sidecarInjectorWebhookAsYaml)
        {
            AutoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
            EnableNamespacesByDefault = enableNamespacesByDefault;
            InitCniConfiguration = initCniConfiguration;
            LimitCpu = limitCpu;
            LimitMemory = limitMemory;
            RequestCpu = requestCpu;
            RequestMemory = requestMemory;
            SidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
        }
    }
}
