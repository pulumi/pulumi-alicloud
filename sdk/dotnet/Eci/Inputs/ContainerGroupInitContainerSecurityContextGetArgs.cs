// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupInitContainerSecurityContextGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("capabilities")]
        private InputList<Inputs.ContainerGroupInitContainerSecurityContextCapabilityGetArgs>? _capabilities;
        public InputList<Inputs.ContainerGroupInitContainerSecurityContextCapabilityGetArgs> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<Inputs.ContainerGroupInitContainerSecurityContextCapabilityGetArgs>());
            set => _capabilities = value;
        }

        [Input("runAsUser")]
        public Input<int>? RunAsUser { get; set; }

        public ContainerGroupInitContainerSecurityContextGetArgs()
        {
        }
        public static new ContainerGroupInitContainerSecurityContextGetArgs Empty => new ContainerGroupInitContainerSecurityContextGetArgs();
    }
}
