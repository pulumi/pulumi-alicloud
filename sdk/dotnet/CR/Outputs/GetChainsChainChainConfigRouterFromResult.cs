// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR.Outputs
{

    [OutputType]
    public sealed class GetChainsChainChainConfigRouterFromResult
    {
        /// <summary>
        /// The name of delivery chain node.
        /// </summary>
        public readonly string NodeName;

        [OutputConstructor]
        private GetChainsChainChainConfigRouterFromResult(string nodeName)
        {
            NodeName = nodeName;
        }
    }
}
