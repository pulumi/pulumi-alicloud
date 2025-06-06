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
    public sealed class ChainChainConfigRouterTo
    {
        /// <summary>
        /// The name of node. Valid values: `DOCKER_IMAGE_BUILD`, `DOCKER_IMAGE_PUSH`, `VULNERABILITY_SCANNING`, `ACTIVATE_REPLICATION`, `TRIGGER`, `SNAPSHOT`, `TRIGGER_SNAPSHOT`.
        /// </summary>
        public readonly string? NodeName;

        [OutputConstructor]
        private ChainChainConfigRouterTo(string? nodeName)
        {
            NodeName = nodeName;
        }
    }
}
