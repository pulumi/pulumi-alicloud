// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The automatic cluster upgrade channel. Valid values: `patch`, `stable`, `rapid`.
        /// 
        /// for example:
        /// ```
        /// operation_policy {
        /// cluster_auto_upgrade {
        /// enabled = true
        /// channel = "stable"
        /// }
        /// }
        /// ```
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        /// <summary>
        /// Whether the RRSA feature has been enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs()
        {
        }
        public static new ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs Empty => new ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs();
    }
}
