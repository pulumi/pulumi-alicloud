// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Wafv3.Outputs
{

    [OutputType]
    public sealed class GetDomainsDomainResult
    {
        /// <summary>
        /// The CNAME assigned by WAF to the domain name.
        /// </summary>
        public readonly string Cname;
        /// <summary>
        /// The name of the domain name to query.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The ID of the domain. It formats as `&lt;instance_id&gt;:&lt;domain&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Configure listening information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainsDomainListenResult> Listens;
        /// <summary>
        /// Configure forwarding information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainsDomainRedirectResult> Redirects;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceManagerResourceGroupId;
        /// <summary>
        /// The status of the domain.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetDomainsDomainResult(
            string cname,

            string domain,

            string id,

            ImmutableArray<Outputs.GetDomainsDomainListenResult> listens,

            ImmutableArray<Outputs.GetDomainsDomainRedirectResult> redirects,

            string resourceManagerResourceGroupId,

            string status)
        {
            Cname = cname;
            Domain = domain;
            Id = id;
            Listens = listens;
            Redirects = redirects;
            ResourceManagerResourceGroupId = resourceManagerResourceGroupId;
            Status = status;
        }
    }
}
