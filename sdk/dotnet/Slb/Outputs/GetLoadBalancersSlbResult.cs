// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersSlbResult
    {
        /// <summary>
        /// Service address of the SLBs.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// SLB creation time.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// ID of the SLB.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// SLB addressType: internet if `true`, intranet if `false`. Must be `false` when `network_type` is `vpc`.
        /// </summary>
        public readonly bool Internet;
        /// <summary>
        /// Master availability zone of the SLBs.
        /// </summary>
        public readonly string MasterAvailabilityZone;
        /// <summary>
        /// SLB name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network type of the SLBs. Valid values: `vpc` and `classic`.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// Region ID the SLB belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// Slave availability zone of the SLBs.
        /// </summary>
        public readonly string SlaveAvailabilityZone;
        /// <summary>
        /// SLB current status. Possible values: `inactive`, `active` and `locked`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var taggedInstances = AliCloud.Slb.GetLoadBalancers.Invoke(new()
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
        /// ID of the VPC linked to the SLBs.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// ID of the vSwitch linked to the SLBs.
        /// </summary>
        public readonly string VswitchId;

        [OutputConstructor]
        private GetLoadBalancersSlbResult(
            string address,

            string creationTime,

            string id,

            bool internet,

            string masterAvailabilityZone,

            string name,

            string networkType,

            string regionId,

            string slaveAvailabilityZone,

            string status,

            ImmutableDictionary<string, string> tags,

            string vpcId,

            string vswitchId)
        {
            Address = address;
            CreationTime = creationTime;
            Id = id;
            Internet = internet;
            MasterAvailabilityZone = masterAvailabilityZone;
            Name = name;
            NetworkType = networkType;
            RegionId = regionId;
            SlaveAvailabilityZone = slaveAvailabilityZone;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
