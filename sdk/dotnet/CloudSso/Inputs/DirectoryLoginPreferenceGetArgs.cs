// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Inputs
{

    public sealed class DirectoryLoginPreferenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the user can obtain the program access credential in the portal after logging in.
        /// </summary>
        [Input("allowUserToGetCredentials")]
        public Input<bool>? AllowUserToGetCredentials { get; set; }

        /// <summary>
        /// IP address whitelist
        /// </summary>
        [Input("loginNetworkMasks")]
        public Input<string>? LoginNetworkMasks { get; set; }

        public DirectoryLoginPreferenceGetArgs()
        {
        }
        public static new DirectoryLoginPreferenceGetArgs Empty => new DirectoryLoginPreferenceGetArgs();
    }
}
