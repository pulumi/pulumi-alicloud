// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigSidecarInjectorGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable by Pod Annotations automatic injection Sidecar.
        /// </summary>
        [Input("autoInjectionPolicyEnabled")]
        public Input<bool>? AutoInjectionPolicyEnabled { get; set; }

        /// <summary>
        /// Whether it is the all namespaces you turn on the auto injection capabilities.
        /// </summary>
        [Input("enableNamespacesByDefault")]
        public Input<bool>? EnableNamespacesByDefault { get; set; }

        /// <summary>
        /// The CPU resource  of the limitsOPA proxy container.
        /// </summary>
        [Input("limitCpu")]
        public Input<string>? LimitCpu { get; set; }

        /// <summary>
        /// The memory resource limit of the OPA proxy container.
        /// </summary>
        [Input("limitMemory")]
        public Input<string>? LimitMemory { get; set; }

        /// <summary>
        /// The CPU resource request of the OPA proxy container.
        /// </summary>
        [Input("requestCpu")]
        public Input<string>? RequestCpu { get; set; }

        /// <summary>
        /// The memory resource request of the OPA proxy container.
        /// </summary>
        [Input("requestMemory")]
        public Input<string>? RequestMemory { get; set; }

        public ServiceMeshMeshConfigSidecarInjectorGetArgs()
        {
        }
    }
}