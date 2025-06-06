// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EipAnycast.Inputs
{

    public sealed class AnycastEipAddressAttachmentPopLocationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The access point information of the associated access area when the cloud resource instance is bound.If you are binding for the first time, this parameter does not need to be configured, and the system automatically associates all access areas.
        /// </summary>
        [Input("popLocation")]
        public Input<string>? PopLocation { get; set; }

        public AnycastEipAddressAttachmentPopLocationGetArgs()
        {
        }
        public static new AnycastEipAddressAttachmentPopLocationGetArgs Empty => new AnycastEipAddressAttachmentPopLocationGetArgs();
    }
}
