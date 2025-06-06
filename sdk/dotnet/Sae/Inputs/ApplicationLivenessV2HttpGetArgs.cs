// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationLivenessV2HttpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("isContainKeyWord")]
        public Input<bool>? IsContainKeyWord { get; set; }

        [Input("keyWord")]
        public Input<string>? KeyWord { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        public ApplicationLivenessV2HttpGetArgs()
        {
        }
        public static new ApplicationLivenessV2HttpGetArgs Empty => new ApplicationLivenessV2HttpGetArgs();
    }
}
