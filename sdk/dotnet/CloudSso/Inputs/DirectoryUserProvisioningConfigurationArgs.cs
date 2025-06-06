// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Inputs
{

    public sealed class DirectoryUserProvisioningConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The duration of the Session after the user logs in.
        /// </summary>
        [Input("defaultLandingPage")]
        public Input<string>? DefaultLandingPage { get; set; }

        /// <summary>
        /// The duration of the Session after the user logs in.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        public DirectoryUserProvisioningConfigurationArgs()
        {
        }
        public static new DirectoryUserProvisioningConfigurationArgs Empty => new DirectoryUserProvisioningConfigurationArgs();
    }
}
