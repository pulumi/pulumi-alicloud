// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga.Outputs
{

    [OutputType]
    public sealed class GetAdditionalCertificatesCertificateResult
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        public readonly string AcceleratorId;
        /// <summary>
        /// The Certificate ID.
        /// </summary>
        public readonly string CertificateId;
        /// <summary>
        /// The domain name specified by the certificate.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The ID of the Additional Certificate. The value formats as `&lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;domain&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the listener. Only HTTPS listeners support this parameter.
        /// </summary>
        public readonly string ListenerId;

        [OutputConstructor]
        private GetAdditionalCertificatesCertificateResult(
            string acceleratorId,

            string certificateId,

            string domain,

            string id,

            string listenerId)
        {
            AcceleratorId = acceleratorId;
            CertificateId = certificateId;
            Domain = domain;
            Id = id;
            ListenerId = listenerId;
        }
    }
}
