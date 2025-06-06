// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetEcsPrefixListsListEntryResult
    {
        public readonly string Cidr;
        /// <summary>
        /// The description of the prefix list.
        /// </summary>
        public readonly string Description;

        [OutputConstructor]
        private GetEcsPrefixListsListEntryResult(
            string cidr,

            string description)
        {
            Cidr = cidr;
            Description = description;
        }
    }
}
