// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Outputs
{

    [OutputType]
    public sealed class V3FunctionOssMountConfig
    {
        /// <summary>
        /// OSS mount point list. See `mount_points` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.V3FunctionOssMountConfigMountPoint> MountPoints;

        [OutputConstructor]
        private V3FunctionOssMountConfig(ImmutableArray<Outputs.V3FunctionOssMountConfigMountPoint> mountPoints)
        {
            MountPoints = mountPoints;
        }
    }
}