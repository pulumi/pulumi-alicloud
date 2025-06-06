// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterAccessInfoResult
    {
        /// <summary>
        /// Link address information list of ZooKeeper.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterAccessInfoZkLinkResult> ZkLinks;

        [OutputConstructor]
        private GetClustersClusterAccessInfoResult(ImmutableArray<Outputs.GetClustersClusterAccessInfoZkLinkResult> zkLinks)
        {
            ZkLinks = zkLinks;
        }
    }
}
