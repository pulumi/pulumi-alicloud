// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Inputs
{

    public sealed class ClusterComponentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Component Configuration See `component_config` below.
        /// </summary>
        [Input("componentConfig")]
        public Input<Inputs.ClusterComponentComponentConfigArgs>? ComponentConfig { get; set; }

        /// <summary>
        /// Component Type
        /// </summary>
        [Input("componentType")]
        public Input<string>? ComponentType { get; set; }

        public ClusterComponentArgs()
        {
        }
        public static new ClusterComponentArgs Empty => new ClusterComponentArgs();
    }
}
