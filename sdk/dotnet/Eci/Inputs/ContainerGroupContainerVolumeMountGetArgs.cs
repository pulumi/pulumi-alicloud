// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerVolumeMountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("mountPath")]
        public Input<string>? MountPath { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        public ContainerGroupContainerVolumeMountGetArgs()
        {
        }
        public static new ContainerGroupContainerVolumeMountGetArgs Empty => new ContainerGroupContainerVolumeMountGetArgs();
    }
}
