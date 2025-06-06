// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class ServerlessKubernetesOperationPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
        /// </summary>
        [Input("clusterAutoUpgrade")]
        public Input<Inputs.ServerlessKubernetesOperationPolicyClusterAutoUpgradeArgs>? ClusterAutoUpgrade { get; set; }

        public ServerlessKubernetesOperationPolicyArgs()
        {
        }
        public static new ServerlessKubernetesOperationPolicyArgs Empty => new ServerlessKubernetesOperationPolicyArgs();
    }
}
