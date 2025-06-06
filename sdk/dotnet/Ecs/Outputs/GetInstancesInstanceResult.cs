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
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// Availability zone where instances are located.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Instance creation time.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// Instance description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Description of the attached disks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceDiskDeviceMappingResult> DiskDeviceMappings;
        /// <summary>
        /// EIP address the VPC instance is using.
        /// </summary>
        public readonly string Eip;
        /// <summary>
        /// ID of the instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The image ID of some ECS instance used.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// Instance charge type.
        /// </summary>
        public readonly string InstanceChargeType;
        /// <summary>
        /// Instance type.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// Instance network charge type.
        /// </summary>
        public readonly string InternetChargeType;
        /// <summary>
        /// Max output bandwidth for internet.
        /// </summary>
        public readonly int InternetMaxBandwidthOut;
        /// <summary>
        /// Key pair the instance is using.
        /// </summary>
        public readonly string KeyName;
        /// <summary>
        /// Instance name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Instance private IP address.
        /// </summary>
        public readonly string PrivateIp;
        /// <summary>
        /// Instance public IP address.
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// The RAM role name which the instance attaches.
        /// </summary>
        public readonly string RamRoleName;
        /// <summary>
        /// Region ID the instance belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The ID of resource group which the instance belongs.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// List of security group IDs the instance belongs to.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// Spot strategy the instance is using.
        /// </summary>
        public readonly string SpotStrategy;
        /// <summary>
        /// Instance status. Valid values: "Creating", "Starting", "Running", "Stopping" and "Stopped". If undefined, all statuses are considered.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A map of tags assigned to the ECS instances. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var taggedInstances = AliCloud.Ecs.GetInstances.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// ID of the VPC linked to the instances.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// ID of the vSwitch linked to the instances.
        /// </summary>
        public readonly string VswitchId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string availabilityZone,

            string creationTime,

            string description,

            ImmutableArray<Outputs.GetInstancesInstanceDiskDeviceMappingResult> diskDeviceMappings,

            string eip,

            string id,

            string imageId,

            string instanceChargeType,

            string instanceType,

            string internetChargeType,

            int internetMaxBandwidthOut,

            string keyName,

            string name,

            string privateIp,

            string publicIp,

            string ramRoleName,

            string regionId,

            string resourceGroupId,

            ImmutableArray<string> securityGroups,

            string spotStrategy,

            string status,

            ImmutableDictionary<string, string> tags,

            string vpcId,

            string vswitchId)
        {
            AvailabilityZone = availabilityZone;
            CreationTime = creationTime;
            Description = description;
            DiskDeviceMappings = diskDeviceMappings;
            Eip = eip;
            Id = id;
            ImageId = imageId;
            InstanceChargeType = instanceChargeType;
            InstanceType = instanceType;
            InternetChargeType = internetChargeType;
            InternetMaxBandwidthOut = internetMaxBandwidthOut;
            KeyName = keyName;
            Name = name;
            PrivateIp = privateIp;
            PublicIp = publicIp;
            RamRoleName = ramRoleName;
            RegionId = regionId;
            ResourceGroupId = resourceGroupId;
            SecurityGroups = securityGroups;
            SpotStrategy = spotStrategy;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
