// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class ImageFeaturesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to support the Non-Volatile Memory Express (NVMe) protocol. Valid values:
        /// - supported: The image supports NVMe. Instances created from this image also support NVMe.
        /// - unsupported: The image does not support NVMe. Instances created from this image do not support NVMe.
        /// </summary>
        [Input("nvmeSupport")]
        public Input<string>? NvmeSupport { get; set; }

        public ImageFeaturesArgs()
        {
        }
        public static new ImageFeaturesArgs Empty => new ImageFeaturesArgs();
    }
}