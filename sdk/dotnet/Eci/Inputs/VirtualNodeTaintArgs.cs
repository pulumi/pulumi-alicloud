// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class VirtualNodeTaintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The effect of the taint. Valid values: `NoSchedule`, `NoExecute` and `PreferNoSchedule`.
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// The key of the taint.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The value of the taint.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public VirtualNodeTaintArgs()
        {
        }
        public static new VirtualNodeTaintArgs Empty => new VirtualNodeTaintArgs();
    }
}
