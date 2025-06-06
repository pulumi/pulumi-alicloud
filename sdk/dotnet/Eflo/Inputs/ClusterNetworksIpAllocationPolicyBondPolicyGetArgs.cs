// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Inputs
{

    public sealed class ClusterNetworksIpAllocationPolicyBondPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default bond cluster subnet
        /// </summary>
        [Input("bondDefaultSubnet")]
        public Input<string>? BondDefaultSubnet { get; set; }

        [Input("bonds")]
        private InputList<Inputs.ClusterNetworksIpAllocationPolicyBondPolicyBondGetArgs>? _bonds;

        /// <summary>
        /// Bond information See `bonds` below.
        /// </summary>
        public InputList<Inputs.ClusterNetworksIpAllocationPolicyBondPolicyBondGetArgs> Bonds
        {
            get => _bonds ?? (_bonds = new InputList<Inputs.ClusterNetworksIpAllocationPolicyBondPolicyBondGetArgs>());
            set => _bonds = value;
        }

        public ClusterNetworksIpAllocationPolicyBondPolicyGetArgs()
        {
        }
        public static new ClusterNetworksIpAllocationPolicyBondPolicyGetArgs Empty => new ClusterNetworksIpAllocationPolicyBondPolicyGetArgs();
    }
}
