// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB.Inputs
{

    public sealed class ClusterParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kernel parameter name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Kernel parameter value.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ClusterParameterArgs()
        {
        }
        public static new ClusterParameterArgs Empty => new ClusterParameterArgs();
    }
}