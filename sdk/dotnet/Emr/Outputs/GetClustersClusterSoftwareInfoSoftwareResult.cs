// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterSoftwareInfoSoftwareResult
    {
        /// <summary>
        /// The name of the service.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The internal name of the service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Whether it shows.
        /// </summary>
        public readonly bool OnlyDisplay;
        /// <summary>
        /// Startup type.
        /// </summary>
        public readonly int StartTpe;
        /// <summary>
        /// Service version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetClustersClusterSoftwareInfoSoftwareResult(
            string displayName,

            string name,

            bool onlyDisplay,

            int startTpe,

            string version)
        {
            DisplayName = displayName;
            Name = name;
            OnlyDisplay = onlyDisplay;
            StartTpe = startTpe;
            Version = version;
        }
    }
}
