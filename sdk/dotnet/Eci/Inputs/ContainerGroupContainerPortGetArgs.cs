// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerPortGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public ContainerGroupContainerPortGetArgs()
        {
        }
        public static new ContainerGroupContainerPortGetArgs Empty => new ContainerGroupContainerPortGetArgs();
    }
}
