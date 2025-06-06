// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class KubernetesAutoscalerNodepoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The scaling group id of the groups configured for cluster-autoscaler.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The labels for the nodes in scaling group.
        /// </summary>
        [Input("labels")]
        public Input<string>? Labels { get; set; }

        /// <summary>
        /// The taints for the nodes in scaling group.
        /// </summary>
        [Input("taints")]
        public Input<string>? Taints { get; set; }

        public KubernetesAutoscalerNodepoolArgs()
        {
        }
        public static new KubernetesAutoscalerNodepoolArgs Empty => new KubernetesAutoscalerNodepoolArgs();
    }
}
