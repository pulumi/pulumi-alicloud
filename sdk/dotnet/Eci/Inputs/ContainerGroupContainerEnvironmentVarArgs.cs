// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Inputs
{

    public sealed class ContainerGroupContainerEnvironmentVarArgs : global::Pulumi.ResourceArgs
    {
        [Input("fieldReves")]
        private InputList<Inputs.ContainerGroupContainerEnvironmentVarFieldRefArgs>? _fieldReves;
        public InputList<Inputs.ContainerGroupContainerEnvironmentVarFieldRefArgs> FieldReves
        {
            get => _fieldReves ?? (_fieldReves = new InputList<Inputs.ContainerGroupContainerEnvironmentVarFieldRefArgs>());
            set => _fieldReves = value;
        }

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public ContainerGroupContainerEnvironmentVarArgs()
        {
        }
        public static new ContainerGroupContainerEnvironmentVarArgs Empty => new ContainerGroupContainerEnvironmentVarArgs();
    }
}
