// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn.Inputs
{

    public sealed class ErEnvConfPresetCanaryNeimengguGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedHosts")]
        private InputList<string>? _allowedHosts;
        public InputList<string> AllowedHosts
        {
            get => _allowedHosts ?? (_allowedHosts = new InputList<string>());
            set => _allowedHosts = value;
        }

        [Input("codeRev")]
        public Input<string>? CodeRev { get; set; }

        [Input("specName")]
        public Input<string>? SpecName { get; set; }

        public ErEnvConfPresetCanaryNeimengguGetArgs()
        {
        }
        public static new ErEnvConfPresetCanaryNeimengguGetArgs Empty => new ErEnvConfPresetCanaryNeimengguGetArgs();
    }
}