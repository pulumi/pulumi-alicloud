// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Outputs
{

    [OutputType]
    public sealed class GetDisksDiskMountInstanceResult
    {
        /// <summary>
        /// Disk attachment time.
        /// </summary>
        public readonly string AttachedTime;
        public readonly string Device;
        /// <summary>
        /// Filter the results by the specified ECS instance ID.
        /// </summary>
        public readonly string InstanceId;

        [OutputConstructor]
        private GetDisksDiskMountInstanceResult(
            string attachedTime,

            string device,

            string instanceId)
        {
            AttachedTime = attachedTime;
            Device = device;
            InstanceId = instanceId;
        }
    }
}