// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MaxCompute.Inputs
{

    public sealed class ProjectPropertiesEncryptionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        public ProjectPropertiesEncryptionGetArgs()
        {
        }
        public static new ProjectPropertiesEncryptionGetArgs Empty => new ProjectPropertiesEncryptionGetArgs();
    }
}