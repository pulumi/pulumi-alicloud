// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorMultiAlternatesMirrorMultiAlternate
    {
        /// <summary>
        /// Mirroring back-to-source multi-station Region
        /// </summary>
        public readonly string? MirrorMultiAlternateDstRegion;
        /// <summary>
        /// Image back-to-source multi-source station serial number
        /// </summary>
        public readonly int? MirrorMultiAlternateNumber;
        /// <summary>
        /// Mirroring back-to-source multi-source site URL
        /// </summary>
        public readonly string? MirrorMultiAlternateUrl;
        /// <summary>
        /// Mirroring back-to-source multi-source VpcId
        /// </summary>
        public readonly string? MirrorMultiAlternateVpcId;

        [OutputConstructor]
        private BucketWebsiteRoutingRulesRoutingRuleRedirectMirrorMultiAlternatesMirrorMultiAlternate(
            string? mirrorMultiAlternateDstRegion,

            int? mirrorMultiAlternateNumber,

            string? mirrorMultiAlternateUrl,

            string? mirrorMultiAlternateVpcId)
        {
            MirrorMultiAlternateDstRegion = mirrorMultiAlternateDstRegion;
            MirrorMultiAlternateNumber = mirrorMultiAlternateNumber;
            MirrorMultiAlternateUrl = mirrorMultiAlternateUrl;
            MirrorMultiAlternateVpcId = mirrorMultiAlternateVpcId;
        }
    }
}
