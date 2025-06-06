// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolKubeletConfigurationTracingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint of the collector.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Number of samples to be collected per million span.
        /// </summary>
        [Input("samplingRatePerMillion")]
        public Input<string>? SamplingRatePerMillion { get; set; }

        public NodePoolKubeletConfigurationTracingGetArgs()
        {
        }
        public static new NodePoolKubeletConfigurationTracingGetArgs Empty => new NodePoolKubeletConfigurationTracingGetArgs();
    }
}
