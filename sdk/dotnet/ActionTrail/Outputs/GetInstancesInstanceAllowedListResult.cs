// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceAllowedListResult
    {
        /// <summary>
        /// The deployed type of the instance.
        /// </summary>
        public readonly string DeployType;
        /// <summary>
        /// The internet list of the instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceAllowedListInternetListResult> InternetLists;
        /// <summary>
        /// The vpc list of the instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceAllowedListVpcListResult> VpcLists;

        [OutputConstructor]
        private GetInstancesInstanceAllowedListResult(
            string deployType,

            ImmutableArray<Outputs.GetInstancesInstanceAllowedListInternetListResult> internetLists,

            ImmutableArray<Outputs.GetInstancesInstanceAllowedListVpcListResult> vpcLists)
        {
            DeployType = deployType;
            InternetLists = internetLists;
            VpcLists = vpcLists;
        }
    }
}
