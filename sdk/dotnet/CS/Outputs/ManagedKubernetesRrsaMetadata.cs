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
    public sealed class ManagedKubernetesRrsaMetadata
    {
        /// <summary>
        /// Whether the RRSA feature has been enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The arn of OIDC provider that was registered in RAM.
        /// </summary>
        public readonly string? RamOidcProviderArn;
        /// <summary>
        /// The name of OIDC Provider that was registered in RAM.
        /// </summary>
        public readonly string? RamOidcProviderName;
        /// <summary>
        /// The issuer URL of RRSA OIDC Token.
        /// </summary>
        public readonly string? RrsaOidcIssuerUrl;

        [OutputConstructor]
        private ManagedKubernetesRrsaMetadata(
            bool? enabled,

            string? ramOidcProviderArn,

            string? ramOidcProviderName,

            string? rrsaOidcIssuerUrl)
        {
            Enabled = enabled;
            RamOidcProviderArn = ramOidcProviderArn;
            RamOidcProviderName = ramOidcProviderName;
            RrsaOidcIssuerUrl = rrsaOidcIssuerUrl;
        }
    }
}