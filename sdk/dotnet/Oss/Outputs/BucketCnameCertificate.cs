// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketCnameCertificate
    {
        /// <summary>
        /// Certificate Identifier
        /// </summary>
        public readonly string? CertId;
        /// <summary>
        /// The certificate public key.
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// Certificate creation time
        /// </summary>
        public readonly string? CreationDate;
        /// <summary>
        /// Certificate Fingerprint
        /// </summary>
        public readonly string? Fingerprint;
        /// <summary>
        /// The certificate private key.
        /// </summary>
        public readonly string? PrivateKey;
        /// <summary>
        /// Cname status
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// Certificate Type
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Certificate validity period end time
        /// </summary>
        public readonly string? ValidEndDate;
        /// <summary>
        /// Certificate validity period start time
        /// </summary>
        public readonly string? ValidStartDate;

        [OutputConstructor]
        private BucketCnameCertificate(
            string? certId,

            string? certificate,

            string? creationDate,

            string? fingerprint,

            string? privateKey,

            string? status,

            string? type,

            string? validEndDate,

            string? validStartDate)
        {
            CertId = certId;
            Certificate = certificate;
            CreationDate = creationDate;
            Fingerprint = fingerprint;
            PrivateKey = privateKey;
            Status = status;
            Type = type;
            ValidEndDate = validEndDate;
            ValidStartDate = validStartDate;
        }
    }
}