// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class ServerlessKubernetesOperationPolicy
    {
        /// <summary>
        /// Automatic cluster upgrade policy. See `cluster_auto_upgrade` below.
        /// </summary>
        public readonly Outputs.ServerlessKubernetesOperationPolicyClusterAutoUpgrade? ClusterAutoUpgrade;

        [OutputConstructor]
        private ServerlessKubernetesOperationPolicy(Outputs.ServerlessKubernetesOperationPolicyClusterAutoUpgrade? clusterAutoUpgrade)
        {
            ClusterAutoUpgrade = clusterAutoUpgrade;
        }
    }
}