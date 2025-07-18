// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEcsLaunchTemplates
    {
        /// <summary>
        /// This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.120.0.
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
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_18.*64",
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = "terraform-example",
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsLaunchTemplate = new AliCloud.Ecs.EcsLaunchTemplate("default", new()
        ///     {
        ///         LaunchTemplateName = "terraform-example",
        ///         Description = "terraform-example",
        ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///         HostName = "terraform-example",
        ///         InstanceChargeType = "PrePaid",
        ///         InstanceName = "terraform-example",
        ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///         InternetChargeType = "PayByBandwidth",
        ///         InternetMaxBandwidthIn = 5,
        ///         InternetMaxBandwidthOut = 5,
        ///         IoOptimized = "optimized",
        ///         KeyPairName = "key_pair_name",
        ///         RamRoleName = "ram_role_name",
        ///         NetworkType = "vpc",
        ///         SecurityEnhancementStrategy = "Active",
        ///         SpotPriceLimit = 5,
        ///         SpotStrategy = "SpotWithPriceLimit",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///         SystemDisk = new AliCloud.Ecs.Inputs.EcsLaunchTemplateSystemDiskArgs
        ///         {
        ///             Category = "cloud_ssd",
        ///             Description = "Test For Terraform",
        ///             Name = "terraform-example",
        ///             Size = 40,
        ///             DeleteWithInstance = false,
        ///         },
        ///         UserData = "xxxxxxx",
        ///         VswitchId = defaultSwitch.Id,
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         TemplateTags = 
        ///         {
        ///             { "Create", "Terraform" },
        ///             { "For", "example" },
        ///         },
        ///         NetworkInterfaces = new AliCloud.Ecs.Inputs.EcsLaunchTemplateNetworkInterfacesArgs
        ///         {
        ///             Name = "eth0",
        ///             Description = "hello1",
        ///             PrimaryIp = "10.0.0.2",
        ///             SecurityGroupId = defaultSecurityGroup.Id,
        ///             VswitchId = defaultSwitch.Id,
        ///         },
        ///         DataDisks = new[]
        ///         {
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk1",
        ///                 Description = "description",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk2",
        ///                 Description = "description2",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsLaunchTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsLaunchTemplate.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsLaunchTemplateId0"] = ids.Apply(getEcsLaunchTemplatesResult =&gt; getEcsLaunchTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEcsLaunchTemplatesResult> InvokeAsync(GetEcsLaunchTemplatesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEcsLaunchTemplatesResult>("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", args ?? new GetEcsLaunchTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.120.0.
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
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_18.*64",
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = "terraform-example",
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsLaunchTemplate = new AliCloud.Ecs.EcsLaunchTemplate("default", new()
        ///     {
        ///         LaunchTemplateName = "terraform-example",
        ///         Description = "terraform-example",
        ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///         HostName = "terraform-example",
        ///         InstanceChargeType = "PrePaid",
        ///         InstanceName = "terraform-example",
        ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///         InternetChargeType = "PayByBandwidth",
        ///         InternetMaxBandwidthIn = 5,
        ///         InternetMaxBandwidthOut = 5,
        ///         IoOptimized = "optimized",
        ///         KeyPairName = "key_pair_name",
        ///         RamRoleName = "ram_role_name",
        ///         NetworkType = "vpc",
        ///         SecurityEnhancementStrategy = "Active",
        ///         SpotPriceLimit = 5,
        ///         SpotStrategy = "SpotWithPriceLimit",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///         SystemDisk = new AliCloud.Ecs.Inputs.EcsLaunchTemplateSystemDiskArgs
        ///         {
        ///             Category = "cloud_ssd",
        ///             Description = "Test For Terraform",
        ///             Name = "terraform-example",
        ///             Size = 40,
        ///             DeleteWithInstance = false,
        ///         },
        ///         UserData = "xxxxxxx",
        ///         VswitchId = defaultSwitch.Id,
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         TemplateTags = 
        ///         {
        ///             { "Create", "Terraform" },
        ///             { "For", "example" },
        ///         },
        ///         NetworkInterfaces = new AliCloud.Ecs.Inputs.EcsLaunchTemplateNetworkInterfacesArgs
        ///         {
        ///             Name = "eth0",
        ///             Description = "hello1",
        ///             PrimaryIp = "10.0.0.2",
        ///             SecurityGroupId = defaultSecurityGroup.Id,
        ///             VswitchId = defaultSwitch.Id,
        ///         },
        ///         DataDisks = new[]
        ///         {
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk1",
        ///                 Description = "description",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk2",
        ///                 Description = "description2",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsLaunchTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsLaunchTemplate.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsLaunchTemplateId0"] = ids.Apply(getEcsLaunchTemplatesResult =&gt; getEcsLaunchTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEcsLaunchTemplatesResult> Invoke(GetEcsLaunchTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsLaunchTemplatesResult>("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", args ?? new GetEcsLaunchTemplatesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.120.0.
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
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_18.*64",
        ///         Owners = "system",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VswitchName = "terraform-example",
        ///         CidrBlock = "172.17.3.0/24",
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///     });
        /// 
        ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
        ///     {
        ///         Name = "terraform-example",
        ///         VpcId = defaultNetwork.Id,
        ///     });
        /// 
        ///     var defaultEcsLaunchTemplate = new AliCloud.Ecs.EcsLaunchTemplate("default", new()
        ///     {
        ///         LaunchTemplateName = "terraform-example",
        ///         Description = "terraform-example",
        ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///         HostName = "terraform-example",
        ///         InstanceChargeType = "PrePaid",
        ///         InstanceName = "terraform-example",
        ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///         InternetChargeType = "PayByBandwidth",
        ///         InternetMaxBandwidthIn = 5,
        ///         InternetMaxBandwidthOut = 5,
        ///         IoOptimized = "optimized",
        ///         KeyPairName = "key_pair_name",
        ///         RamRoleName = "ram_role_name",
        ///         NetworkType = "vpc",
        ///         SecurityEnhancementStrategy = "Active",
        ///         SpotPriceLimit = 5,
        ///         SpotStrategy = "SpotWithPriceLimit",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             defaultSecurityGroup.Id,
        ///         },
        ///         SystemDisk = new AliCloud.Ecs.Inputs.EcsLaunchTemplateSystemDiskArgs
        ///         {
        ///             Category = "cloud_ssd",
        ///             Description = "Test For Terraform",
        ///             Name = "terraform-example",
        ///             Size = 40,
        ///             DeleteWithInstance = false,
        ///         },
        ///         UserData = "xxxxxxx",
        ///         VswitchId = defaultSwitch.Id,
        ///         VpcId = defaultNetwork.Id,
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         TemplateTags = 
        ///         {
        ///             { "Create", "Terraform" },
        ///             { "For", "example" },
        ///         },
        ///         NetworkInterfaces = new AliCloud.Ecs.Inputs.EcsLaunchTemplateNetworkInterfacesArgs
        ///         {
        ///             Name = "eth0",
        ///             Description = "hello1",
        ///             PrimaryIp = "10.0.0.2",
        ///             SecurityGroupId = defaultSecurityGroup.Id,
        ///             VswitchId = defaultSwitch.Id,
        ///         },
        ///         DataDisks = new[]
        ///         {
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk1",
        ///                 Description = "description",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///             new AliCloud.Ecs.Inputs.EcsLaunchTemplateDataDiskArgs
        ///             {
        ///                 Name = "disk2",
        ///                 Description = "description2",
        ///                 DeleteWithInstance = true,
        ///                 Category = "cloud",
        ///                 Encrypted = false,
        ///                 PerformanceLevel = "PL0",
        ///                 Size = 20,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var ids = AliCloud.Ecs.GetEcsLaunchTemplates.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultEcsLaunchTemplate.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecsLaunchTemplateId0"] = ids.Apply(getEcsLaunchTemplatesResult =&gt; getEcsLaunchTemplatesResult.Templates[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEcsLaunchTemplatesResult> Invoke(GetEcsLaunchTemplatesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsLaunchTemplatesResult>("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", args ?? new GetEcsLaunchTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEcsLaunchTemplatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to query the detailed list of resource attributes. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Launch Template IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the launch template.
        /// </summary>
        [Input("launchTemplateName")]
        public string? LaunchTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Launch Template name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("templateResourceGroupId")]
        public string? TemplateResourceGroupId { get; set; }

        [Input("templateTags")]
        private Dictionary<string, string>? _templateTags;

        /// <summary>
        /// The tags of the launch template.
        /// </summary>
        public Dictionary<string, string> TemplateTags
        {
            get => _templateTags ?? (_templateTags = new Dictionary<string, string>());
            set => _templateTags = value;
        }

        public GetEcsLaunchTemplatesArgs()
        {
        }
        public static new GetEcsLaunchTemplatesArgs Empty => new GetEcsLaunchTemplatesArgs();
    }

    public sealed class GetEcsLaunchTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether to query the detailed list of resource attributes. Default value: `false`.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Launch Template IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the launch template.
        /// </summary>
        [Input("launchTemplateName")]
        public Input<string>? LaunchTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Launch Template name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("templateResourceGroupId")]
        public Input<string>? TemplateResourceGroupId { get; set; }

        [Input("templateTags")]
        private InputMap<string>? _templateTags;

        /// <summary>
        /// The tags of the launch template.
        /// </summary>
        public InputMap<string> TemplateTags
        {
            get => _templateTags ?? (_templateTags = new InputMap<string>());
            set => _templateTags = value;
        }

        public GetEcsLaunchTemplatesInvokeArgs()
        {
        }
        public static new GetEcsLaunchTemplatesInvokeArgs Empty => new GetEcsLaunchTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetEcsLaunchTemplatesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The name of the Launch Template.
        /// </summary>
        public readonly string? LaunchTemplateName;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Launch Template names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? TemplateResourceGroupId;
        /// <summary>
        /// The tags of the launch template.
        /// &gt; **NOTE:** Except for the fields `id`, `launch_template_id`, `launch_template_name`, `default_version_number`, `latest_version_number`, `created_by`, `modified_time`, `resource_group_id`, `template_tags`, all other fields take effect only if `enable_details` is set to `true`.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? TemplateTags;
        /// <summary>
        /// A list of Ecs Launch Templates. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEcsLaunchTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetEcsLaunchTemplatesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? launchTemplateName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? templateResourceGroupId,

            ImmutableDictionary<string, string>? templateTags,

            ImmutableArray<Outputs.GetEcsLaunchTemplatesTemplateResult> templates)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            LaunchTemplateName = launchTemplateName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            TemplateResourceGroupId = templateResourceGroupId;
            TemplateTags = templateTags;
            Templates = templates;
        }
    }
}
