// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Inputs
{

    public sealed class ListenerCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the certificate.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public ListenerCertificateArgs()
        {
        }
        public static new ListenerCertificateArgs Empty => new ListenerCertificateArgs();
    }
}
