// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class GetIngressesIngressResult
    {
        /// <summary>
        /// Cert Id.
        /// </summary>
        public readonly string CertId;
        /// <summary>
        /// Default Rule.
        /// </summary>
        public readonly string DefaultRule;
        /// <summary>
        /// Description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Ingress.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The first ID of the resource.
        /// </summary>
        public readonly string IngressId;
        /// <summary>
        /// SLB listening port.
        /// </summary>
        public readonly int ListenerPort;
        /// <summary>
        /// The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// SLB ID.
        /// </summary>
        public readonly string SlbId;

        [OutputConstructor]
        private GetIngressesIngressResult(
            string certId,

            string defaultRule,

            string description,

            string id,

            string ingressId,

            int listenerPort,

            string namespaceId,

            string slbId)
        {
            CertId = certId;
            DefaultRule = defaultRule;
            Description = description;
            Id = id;
            IngressId = ingressId;
            ListenerPort = listenerPort;
            NamespaceId = namespaceId;
            SlbId = slbId;
        }
    }
}