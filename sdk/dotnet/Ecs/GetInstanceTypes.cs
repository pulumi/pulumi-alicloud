// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetInstanceTypes
    {
        /// <summary>
        /// This data source provides the ECS instance types of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available since v1.0.0.
        /// 
        /// &gt; **NOTE:** By default, only the upgraded instance types are returned. If you want to get outdated instance types, you must set `is_outdated` to true.
        /// 
        /// &gt; **NOTE:** If one instance type is sold out, it will not be exported.
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         InstanceTypeFamily = "ecs.sn1ne",
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_[0-9]+_[0-9]+_x64*",
        ///         MostRecent = true,
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = name,
        ///         CidrBlock = "192.168.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = name,
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "192.168.192.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = name,
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsNetworkInterface = new AliCloud.Ecs.EcsNetworkInterface("default", new()
        ///     {
        ///         NetworkInterfaceName = name,
        ///         VswitchId = defaultSwitch.Id,
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; 14; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         defaultInstance.Add(new AliCloud.Ecs.Instance($"default-{range.Value}", new()
        ///         {
        ///             ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///             InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///             InstanceName = name,
        ///             SecurityGroups = new[]
        ///             {
        ///                 defaultSecurityGroup,
        ///             }.Select(__item =&gt; __item.Id).ToList(),
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 10,
        ///             AvailabilityZone = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///             InstanceChargeType = "PostPaid",
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = defaultSwitch.Id,
        ///         }));
        ///     }
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceTypesResult> InvokeAsync(GetInstanceTypesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypesResult>("alicloud:ecs/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the ECS instance types of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available since v1.0.0.
        /// 
        /// &gt; **NOTE:** By default, only the upgraded instance types are returned. If you want to get outdated instance types, you must set `is_outdated` to true.
        /// 
        /// &gt; **NOTE:** If one instance type is sold out, it will not be exported.
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         InstanceTypeFamily = "ecs.sn1ne",
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_[0-9]+_[0-9]+_x64*",
        ///         MostRecent = true,
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = name,
        ///         CidrBlock = "192.168.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = name,
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "192.168.192.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = name,
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsNetworkInterface = new AliCloud.Ecs.EcsNetworkInterface("default", new()
        ///     {
        ///         NetworkInterfaceName = name,
        ///         VswitchId = defaultSwitch.Id,
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; 14; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         defaultInstance.Add(new AliCloud.Ecs.Instance($"default-{range.Value}", new()
        ///         {
        ///             ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///             InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///             InstanceName = name,
        ///             SecurityGroups = new[]
        ///             {
        ///                 defaultSecurityGroup,
        ///             }.Select(__item =&gt; __item.Id).ToList(),
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 10,
        ///             AvailabilityZone = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///             InstanceChargeType = "PostPaid",
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = defaultSwitch.Id,
        ///         }));
        ///     }
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceTypesResult> Invoke(GetInstanceTypesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypesResult>("alicloud:ecs/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the ECS instance types of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available since v1.0.0.
        /// 
        /// &gt; **NOTE:** By default, only the upgraded instance types are returned. If you want to get outdated instance types, you must set `is_outdated` to true.
        /// 
        /// &gt; **NOTE:** If one instance type is sold out, it will not be exported.
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-example";
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     // Declare the data source
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         InstanceTypeFamily = "ecs.sn1ne",
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_[0-9]+_[0-9]+_x64*",
        ///         MostRecent = true,
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = name,
        ///         CidrBlock = "192.168.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = name,
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "192.168.192.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = name,
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsNetworkInterface = new AliCloud.Ecs.EcsNetworkInterface("default", new()
        ///     {
        ///         NetworkInterfaceName = name,
        ///         VswitchId = defaultSwitch.Id,
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; 14; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         defaultInstance.Add(new AliCloud.Ecs.Instance($"default-{range.Value}", new()
        ///         {
        ///             ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///             InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///             InstanceName = name,
        ///             SecurityGroups = new[]
        ///             {
        ///                 defaultSecurityGroup,
        ///             }.Select(__item =&gt; __item.Id).ToList(),
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 10,
        ///             AvailabilityZone = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///             InstanceChargeType = "PostPaid",
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = defaultSwitch.Id,
        ///         }));
        ///     }
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceTypesResult> Invoke(GetInstanceTypesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypesResult>("alicloud:ecs/getInstanceTypes:getInstanceTypes", args ?? new GetInstanceTypesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTypesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The zone where instance types are supported.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        /// <summary>
        /// Filter the results to a specific number of cpu cores.
        /// </summary>
        [Input("cpuCoreCount")]
        public int? CpuCoreCount { get; set; }

        /// <summary>
        /// Filter the result whose network interface number is no more than `eni_amount`.
        /// </summary>
        [Input("eniAmount")]
        public int? EniAmount { get; set; }

        /// <summary>
        /// The GPU amount of an instance type.
        /// </summary>
        [Input("gpuAmount")]
        public int? GpuAmount { get; set; }

        /// <summary>
        /// The GPU spec of an instance type.
        /// </summary>
        [Input("gpuSpec")]
        public string? GpuSpec { get; set; }

        /// <summary>
        /// The ID of the image.
        /// </summary>
        [Input("imageId")]
        public string? ImageId { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public string? InstanceChargeType { get; set; }

        /// <summary>
        /// Instance specifications. For more information, see instance Specification Family, or you can call the describe instance types interface to get the latest specification table.
        /// </summary>
        [Input("instanceType")]
        public string? InstanceType { get; set; }

        /// <summary>
        /// Filter the results based on their family name. For example: 'ecs.n4'.
        /// </summary>
        [Input("instanceTypeFamily")]
        public string? InstanceTypeFamily { get; set; }

        /// <summary>
        /// If true, outdated instance types are included in the results. Default to false.
        /// </summary>
        [Input("isOutdated")]
        public bool? IsOutdated { get; set; }

        /// <summary>
        /// Filter the result which is used to create a kubernetes cluster
        /// and managed kubernetes cluster. Optional Values: `Master` and `Worker`.
        /// </summary>
        [Input("kubernetesNodeRole")]
        public string? KubernetesNodeRole { get; set; }

        /// <summary>
        /// Filter the results to a specific memory size in GB.
        /// </summary>
        [Input("memorySize")]
        public double? MemorySize { get; set; }

        /// <summary>
        /// The minimum number of IPv6 addresses per ENI. **Note:** If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
        /// </summary>
        [Input("minimumEniIpv6AddressQuantity")]
        public int? MinimumEniIpv6AddressQuantity { get; set; }

        /// <summary>
        /// The minimum expected IPv4 address upper limit of a single ENI when querying instance specifications. **Note:** If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
        /// </summary>
        [Input("minimumEniPrivateIpAddressQuantity")]
        public int? MinimumEniPrivateIpAddressQuantity { get; set; }

        /// <summary>
        /// Filter the results by network type. Valid values: `Classic` and `Vpc`.
        /// </summary>
        [Input("networkType")]
        public string? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Sort mode, valid values: `CPU`, `Memory`, `Price`.
        /// </summary>
        [Input("sortedBy")]
        public string? SortedBy { get; set; }

        /// <summary>
        /// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
        /// </summary>
        [Input("spotStrategy")]
        public string? SpotStrategy { get; set; }

        /// <summary>
        /// Filter the results by system disk category. Valid values: `cloud`, `ephemeral_ssd`, `cloud_essd`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd_entry`, `cloud_auto`. 
        /// **NOTE**: Its default value `cloud_efficiency` has been removed from the version v1.150.0.
        /// </summary>
        [Input("systemDiskCategory")]
        public string? SystemDiskCategory { get; set; }

        public GetInstanceTypesArgs()
        {
        }
        public static new GetInstanceTypesArgs Empty => new GetInstanceTypesArgs();
    }

    public sealed class GetInstanceTypesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The zone where instance types are supported.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Filter the results to a specific number of cpu cores.
        /// </summary>
        [Input("cpuCoreCount")]
        public Input<int>? CpuCoreCount { get; set; }

        /// <summary>
        /// Filter the result whose network interface number is no more than `eni_amount`.
        /// </summary>
        [Input("eniAmount")]
        public Input<int>? EniAmount { get; set; }

        /// <summary>
        /// The GPU amount of an instance type.
        /// </summary>
        [Input("gpuAmount")]
        public Input<int>? GpuAmount { get; set; }

        /// <summary>
        /// The GPU spec of an instance type.
        /// </summary>
        [Input("gpuSpec")]
        public Input<string>? GpuSpec { get; set; }

        /// <summary>
        /// The ID of the image.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Instance specifications. For more information, see instance Specification Family, or you can call the describe instance types interface to get the latest specification table.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Filter the results based on their family name. For example: 'ecs.n4'.
        /// </summary>
        [Input("instanceTypeFamily")]
        public Input<string>? InstanceTypeFamily { get; set; }

        /// <summary>
        /// If true, outdated instance types are included in the results. Default to false.
        /// </summary>
        [Input("isOutdated")]
        public Input<bool>? IsOutdated { get; set; }

        /// <summary>
        /// Filter the result which is used to create a kubernetes cluster
        /// and managed kubernetes cluster. Optional Values: `Master` and `Worker`.
        /// </summary>
        [Input("kubernetesNodeRole")]
        public Input<string>? KubernetesNodeRole { get; set; }

        /// <summary>
        /// Filter the results to a specific memory size in GB.
        /// </summary>
        [Input("memorySize")]
        public Input<double>? MemorySize { get; set; }

        /// <summary>
        /// The minimum number of IPv6 addresses per ENI. **Note:** If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
        /// </summary>
        [Input("minimumEniIpv6AddressQuantity")]
        public Input<int>? MinimumEniIpv6AddressQuantity { get; set; }

        /// <summary>
        /// The minimum expected IPv4 address upper limit of a single ENI when querying instance specifications. **Note:** If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
        /// </summary>
        [Input("minimumEniPrivateIpAddressQuantity")]
        public Input<int>? MinimumEniPrivateIpAddressQuantity { get; set; }

        /// <summary>
        /// Filter the results by network type. Valid values: `Classic` and `Vpc`.
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Sort mode, valid values: `CPU`, `Memory`, `Price`.
        /// </summary>
        [Input("sortedBy")]
        public Input<string>? SortedBy { get; set; }

        /// <summary>
        /// Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
        /// </summary>
        [Input("spotStrategy")]
        public Input<string>? SpotStrategy { get; set; }

        /// <summary>
        /// Filter the results by system disk category. Valid values: `cloud`, `ephemeral_ssd`, `cloud_essd`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd_entry`, `cloud_auto`. 
        /// **NOTE**: Its default value `cloud_efficiency` has been removed from the version v1.150.0.
        /// </summary>
        [Input("systemDiskCategory")]
        public Input<string>? SystemDiskCategory { get; set; }

        public GetInstanceTypesInvokeArgs()
        {
        }
        public static new GetInstanceTypesInvokeArgs Empty => new GetInstanceTypesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTypesResult
    {
        public readonly string? AvailabilityZone;
        /// <summary>
        /// Number of CPU cores.
        /// </summary>
        public readonly int? CpuCoreCount;
        /// <summary>
        /// (Deprecated since v1.239.0) The maximum number of ENIs per instance. It sames as `eni_quantity`.
        /// </summary>
        public readonly int? EniAmount;
        public readonly int? GpuAmount;
        public readonly string? GpuSpec;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of instance type IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? ImageId;
        public readonly string? InstanceChargeType;
        public readonly string? InstanceType;
        public readonly string? InstanceTypeFamily;
        /// <summary>
        /// A list of image types. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTypesInstanceTypeResult> InstanceTypes;
        public readonly bool? IsOutdated;
        public readonly string? KubernetesNodeRole;
        /// <summary>
        /// Size of memory, measured in GB.
        /// </summary>
        public readonly double? MemorySize;
        public readonly int? MinimumEniIpv6AddressQuantity;
        public readonly int? MinimumEniPrivateIpAddressQuantity;
        public readonly string? NetworkType;
        public readonly string? OutputFile;
        public readonly string? SortedBy;
        public readonly string? SpotStrategy;
        public readonly string? SystemDiskCategory;

        [OutputConstructor]
        private GetInstanceTypesResult(
            string? availabilityZone,

            int? cpuCoreCount,

            int? eniAmount,

            int? gpuAmount,

            string? gpuSpec,

            string id,

            ImmutableArray<string> ids,

            string? imageId,

            string? instanceChargeType,

            string? instanceType,

            string? instanceTypeFamily,

            ImmutableArray<Outputs.GetInstanceTypesInstanceTypeResult> instanceTypes,

            bool? isOutdated,

            string? kubernetesNodeRole,

            double? memorySize,

            int? minimumEniIpv6AddressQuantity,

            int? minimumEniPrivateIpAddressQuantity,

            string? networkType,

            string? outputFile,

            string? sortedBy,

            string? spotStrategy,

            string? systemDiskCategory)
        {
            AvailabilityZone = availabilityZone;
            CpuCoreCount = cpuCoreCount;
            EniAmount = eniAmount;
            GpuAmount = gpuAmount;
            GpuSpec = gpuSpec;
            Id = id;
            Ids = ids;
            ImageId = imageId;
            InstanceChargeType = instanceChargeType;
            InstanceType = instanceType;
            InstanceTypeFamily = instanceTypeFamily;
            InstanceTypes = instanceTypes;
            IsOutdated = isOutdated;
            KubernetesNodeRole = kubernetesNodeRole;
            MemorySize = memorySize;
            MinimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            MinimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            NetworkType = networkType;
            OutputFile = outputFile;
            SortedBy = sortedBy;
            SpotStrategy = spotStrategy;
            SystemDiskCategory = systemDiskCategory;
        }
    }
}
