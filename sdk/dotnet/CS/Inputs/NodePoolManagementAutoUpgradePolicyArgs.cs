// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolManagementAutoUpgradePolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoUpgradeKubelet")]
        public Input<bool>? AutoUpgradeKubelet { get; set; }

        public NodePoolManagementAutoUpgradePolicyArgs()
        {
        }
        public static new NodePoolManagementAutoUpgradePolicyArgs Empty => new NodePoolManagementAutoUpgradePolicyArgs();
    }
}