// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class V2FunctionInstanceLifecycleConfigPreStopArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// entry point of function.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        /// <summary>
        /// max running time of function.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public V2FunctionInstanceLifecycleConfigPreStopArgs()
        {
        }
        public static new V2FunctionInstanceLifecycleConfigPreStopArgs Empty => new V2FunctionInstanceLifecycleConfigPreStopArgs();
    }
}