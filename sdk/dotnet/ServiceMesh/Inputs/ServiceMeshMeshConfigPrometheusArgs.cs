// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh.Inputs
{

    public sealed class ServiceMeshMeshConfigPrometheusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prometheus service addresses (enabled external Prometheus when the system automatically populates).
        /// </summary>
        [Input("externalUrl")]
        public Input<string>? ExternalUrl { get; set; }

        /// <summary>
        /// Whether to enable external Prometheus.
        /// </summary>
        [Input("useExternal")]
        public Input<bool>? UseExternal { get; set; }

        public ServiceMeshMeshConfigPrometheusArgs()
        {
        }
        public static new ServiceMeshMeshConfigPrometheusArgs Empty => new ServiceMeshMeshConfigPrometheusArgs();
    }
}