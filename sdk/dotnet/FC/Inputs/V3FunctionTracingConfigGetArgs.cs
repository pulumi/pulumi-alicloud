// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class V3FunctionTracingConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("params")]
        private InputMap<string>? _params;

        /// <summary>
        /// Tracing parameters.
        /// </summary>
        public InputMap<string> Params
        {
            get => _params ?? (_params = new InputMap<string>());
            set => _params = value;
        }

        /// <summary>
        /// The tracing protocol type. Currently, only Jaeger is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public V3FunctionTracingConfigGetArgs()
        {
        }
        public static new V3FunctionTracingConfigGetArgs Empty => new V3FunctionTracingConfigGetArgs();
    }
}