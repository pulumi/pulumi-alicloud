// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class SwarmNodeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("eip")]
        public Input<string>? Eip { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public SwarmNodeGetArgs()
        {
        }
        public static new SwarmNodeGetArgs Empty => new SwarmNodeGetArgs();
    }
}
