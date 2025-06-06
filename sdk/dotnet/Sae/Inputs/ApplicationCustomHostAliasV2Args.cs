// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Inputs
{

    public sealed class ApplicationCustomHostAliasV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain name or hostname.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The IP address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        public ApplicationCustomHostAliasV2Args()
        {
        }
        public static new ApplicationCustomHostAliasV2Args Empty => new ApplicationCustomHostAliasV2Args();
    }
}
