// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb.Inputs
{

    public sealed class LoadBalancerDeletionProtectionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable deletion protection. Valid values:
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Opening time of the configuration read-only mode.
        /// </summary>
        [Input("enabledTime")]
        public Input<string>? EnabledTime { get; set; }

        /// <summary>
        /// The reason why deletion protection is enabled. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.
        /// 
        /// 
        /// &gt; **NOTE:**  This parameter takes effect only when `DeletionProtectionEnabled` is set to `true`.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        public LoadBalancerDeletionProtectionConfigArgs()
        {
        }
        public static new LoadBalancerDeletionProtectionConfigArgs Empty => new LoadBalancerDeletionProtectionConfigArgs();
    }
}
