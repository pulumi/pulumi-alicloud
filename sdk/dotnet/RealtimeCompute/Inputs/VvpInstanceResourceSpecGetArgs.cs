// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RealtimeCompute.Inputs
{

    public sealed class VvpInstanceResourceSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CPU number.
        /// </summary>
        [Input("cpu")]
        public Input<int>? Cpu { get; set; }

        /// <summary>
        /// Memory size.
        /// </summary>
        [Input("memoryGb")]
        public Input<int>? MemoryGb { get; set; }

        public VvpInstanceResourceSpecGetArgs()
        {
        }
        public static new VvpInstanceResourceSpecGetArgs Empty => new VvpInstanceResourceSpecGetArgs();
    }
}
