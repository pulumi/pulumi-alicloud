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
    public sealed class ImageFeatures
    {
        /// <summary>
        /// Specifies whether to support the Non-Volatile Memory Express (NVMe) protocol. Valid values:
        /// - supported: The image supports NVMe. Instances created from this image also support NVMe.
        /// - unsupported: The image does not support NVMe. Instances created from this image do not support NVMe.
        /// </summary>
        public readonly string? NvmeSupport;

        [OutputConstructor]
        private ImageFeatures(string? nvmeSupport)
        {
            NvmeSupport = nvmeSupport;
        }
    }
}
