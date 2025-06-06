// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath
    {
        /// <summary>
        /// The content of the configuration file. Maximum size: 32 KB.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// The permissions on the ConfigFileVolume directory.
        /// </summary>
        public readonly int? Mode;
        /// <summary>
        /// The relative file path.
        /// </summary>
        public readonly string? Path;

        [OutputConstructor]
        private EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath(
            string? content,

            int? mode,

            string? path)
        {
            Content = content;
            Mode = mode;
            Path = path;
        }
    }
}
