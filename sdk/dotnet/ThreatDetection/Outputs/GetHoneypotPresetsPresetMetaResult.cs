// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection.Outputs
{

    [OutputType]
    public sealed class GetHoneypotPresetsPresetMetaResult
    {
        /// <summary>
        /// Burp counter.
        /// </summary>
        public readonly string Burp;
        /// <summary>
        /// Social traceability.
        /// </summary>
        public readonly bool PortraitOption;
        /// <summary>
        /// Git countered.
        /// </summary>
        public readonly string TrojanGit;

        [OutputConstructor]
        private GetHoneypotPresetsPresetMetaResult(
            string burp,

            bool portraitOption,

            string trojanGit)
        {
            Burp = burp;
            PortraitOption = portraitOption;
            TrojanGit = trojanGit;
        }
    }
}
