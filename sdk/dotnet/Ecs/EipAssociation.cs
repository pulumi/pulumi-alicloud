// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a EIP Association resource.
    /// 
    /// &gt; **NOTE:** `alicloud.ecs.EipAssociation` is useful in scenarios where EIPs are either
    ///  pre-existing or distributed to customers or users and therefore cannot be changed.
    /// 
    /// &gt; **NOTE:** From version 1.7.1, the resource support to associate EIP to SLB Instance or Nat Gateway.
    /// 
    /// &gt; **NOTE:** One EIP can only be associated with ECS or SLB instance which in the VPC.
    /// 
    /// For information about EIP Association and how to use it, see [What is Association](https://www.alibabacloud.com/help/en/vpc/developer-reference/api-vpc-2016-04-28-associateeipaddress).
    /// 
    /// &gt; **NOTE:** Available since v1.117.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var example = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "Instance",
    ///     });
    /// 
    ///     var exampleGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 1,
    ///         MemorySize = 2,
    ///     });
    /// 
    ///     var exampleGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         Owners = "system",
    ///     });
    /// 
    ///     var exampleNetwork = new AliCloud.Vpc.Network("example", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var exampleSwitch = new AliCloud.Vpc.Switch("example", new()
    ///     {
    ///         VswitchName = name,
    ///         CidrBlock = "10.4.0.0/24",
    ///         VpcId = exampleNetwork.Id,
    ///         ZoneId = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var exampleSecurityGroup = new AliCloud.Ecs.SecurityGroup("example", new()
    ///     {
    ///         Name = name,
    ///         VpcId = exampleNetwork.Id,
    ///     });
    /// 
    ///     var exampleInstance = new AliCloud.Ecs.Instance("example", new()
    ///     {
    ///         AvailabilityZone = example.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         InstanceName = name,
    ///         ImageId = exampleGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = exampleGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         SecurityGroups = new[]
    ///         {
    ///             exampleSecurityGroup.Id,
    ///         },
    ///         VswitchId = exampleSwitch.Id,
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "example" },
    ///         },
    ///     });
    /// 
    ///     var exampleEipAddress = new AliCloud.Ecs.EipAddress("example", new()
    ///     {
    ///         AddressName = name,
    ///     });
    /// 
    ///     var exampleEipAssociation = new AliCloud.Ecs.EipAssociation("example", new()
    ///     {
    ///         AllocationId = exampleEipAddress.Id,
    ///         InstanceId = exampleInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// EIP Association can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/eipAssociation:EipAssociation example &lt;allocation_id&gt;:&lt;instance_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/eipAssociation:EipAssociation")]
    public partial class EipAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the EIP instance.
        /// </summary>
        [Output("allocationId")]
        public Output<string> AllocationId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance with which you want to associate the EIP. You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The type of the instance with which you want to associate the EIP. Valid values:
        /// - `Nat`: NAT gateway
        /// - `SlbInstance`: CLB instance
        /// - `EcsInstance` (default): ECS instance
        /// - `NetworkInterface`: secondary ENI
        /// - `HaVip`: HAVIP
        /// - `IpAddress`: IP address
        /// 
        /// &gt; **NOTE:**   The default value is `EcsInstance`. If the instance with which you want to associate the EIP is not an ECS instance, this parameter is required.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The association mode. Valid values:
        /// - `NAT` (default): NAT mode
        /// - `MULTI_BINDED`: multi-EIP-to-ENI mode
        /// - `BINDED`: cut-network interface controller mode
        /// 
        /// &gt; **NOTE:**   This parameter is required only when `instance_type` is set to `NetworkInterface`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The IP address in the CIDR block of the vSwitch.
        /// 
        /// If you leave this parameter empty, the system allocates a private IP address based on the VPC ID and vSwitch ID.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Output("privateIpAddress")]
        public Output<string?> PrivateIpAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC in which an IPv4 gateway is created. The VPC and the EIP must be in the same region.
        /// 
        /// When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a EipAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EipAssociation(string name, EipAssociationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipAssociation:EipAssociation", name, args ?? new EipAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EipAssociation(string name, Input<string> id, EipAssociationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/eipAssociation:EipAssociation", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EipAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EipAssociation Get(string name, Input<string> id, EipAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new EipAssociation(name, id, state, options);
        }
    }

    public sealed class EipAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the EIP instance.
        /// </summary>
        [Input("allocationId", required: true)]
        public Input<string> AllocationId { get; set; } = null!;

        /// <summary>
        /// Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The ID of the instance with which you want to associate the EIP. You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The type of the instance with which you want to associate the EIP. Valid values:
        /// - `Nat`: NAT gateway
        /// - `SlbInstance`: CLB instance
        /// - `EcsInstance` (default): ECS instance
        /// - `NetworkInterface`: secondary ENI
        /// - `HaVip`: HAVIP
        /// - `IpAddress`: IP address
        /// 
        /// &gt; **NOTE:**   The default value is `EcsInstance`. If the instance with which you want to associate the EIP is not an ECS instance, this parameter is required.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The association mode. Valid values:
        /// - `NAT` (default): NAT mode
        /// - `MULTI_BINDED`: multi-EIP-to-ENI mode
        /// - `BINDED`: cut-network interface controller mode
        /// 
        /// &gt; **NOTE:**   This parameter is required only when `instance_type` is set to `NetworkInterface`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The IP address in the CIDR block of the vSwitch.
        /// 
        /// If you leave this parameter empty, the system allocates a private IP address based on the VPC ID and vSwitch ID.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// The ID of the VPC in which an IPv4 gateway is created. The VPC and the EIP must be in the same region.
        /// 
        /// When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public EipAssociationArgs()
        {
        }
        public static new EipAssociationArgs Empty => new EipAssociationArgs();
    }

    public sealed class EipAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the EIP instance.
        /// </summary>
        [Input("allocationId")]
        public Input<string>? AllocationId { get; set; }

        /// <summary>
        /// Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The ID of the instance with which you want to associate the EIP. You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The type of the instance with which you want to associate the EIP. Valid values:
        /// - `Nat`: NAT gateway
        /// - `SlbInstance`: CLB instance
        /// - `EcsInstance` (default): ECS instance
        /// - `NetworkInterface`: secondary ENI
        /// - `HaVip`: HAVIP
        /// - `IpAddress`: IP address
        /// 
        /// &gt; **NOTE:**   The default value is `EcsInstance`. If the instance with which you want to associate the EIP is not an ECS instance, this parameter is required.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The association mode. Valid values:
        /// - `NAT` (default): NAT mode
        /// - `MULTI_BINDED`: multi-EIP-to-ENI mode
        /// - `BINDED`: cut-network interface controller mode
        /// 
        /// &gt; **NOTE:**   This parameter is required only when `instance_type` is set to `NetworkInterface`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The IP address in the CIDR block of the vSwitch.
        /// 
        /// If you leave this parameter empty, the system allocates a private IP address based on the VPC ID and vSwitch ID.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// The ID of the VPC in which an IPv4 gateway is created. The VPC and the EIP must be in the same region.
        /// 
        /// When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.
        /// 
        /// &gt; **NOTE:**   This parameter is required if `instance_type` is set to `IpAddress`, which indicates that the EIP is to be associated with an IP address.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public EipAssociationState()
        {
        }
        public static new EipAssociationState Empty => new EipAssociationState();
    }
}
