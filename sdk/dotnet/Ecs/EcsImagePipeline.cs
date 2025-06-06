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
    /// Provides a ECS Image Pipeline resource.
    /// 
    /// For information about ECS Image Pipeline and how to use it, see [What is Image Pipeline](https://www.alibabacloud.com/help/en/doc-detail/200427.html).
    /// 
    /// &gt; **NOTE:** Available in v1.163.0+.
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
    ///     var @default = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
    ///     {
    ///         NameRegex = "default",
    ///     });
    /// 
    ///     var defaultGetZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultGetImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultGetInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         ImageId = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Ids[0]),
    ///     });
    /// 
    ///     var defaultGetAccount = AliCloud.GetAccount.Invoke();
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
    ///         ZoneId = defaultGetZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var defaultEcsImagePipeline = new AliCloud.Ecs.EcsImagePipeline("default", new()
    ///     {
    ///         AddAccounts = new[]
    ///         {
    ///             defaultGetAccount.Apply(getAccountResult =&gt; getAccountResult.Id),
    ///         },
    ///         BaseImage = defaultGetImages.Apply(getImagesResult =&gt; getImagesResult.Ids[0]),
    ///         BaseImageType = "IMAGE",
    ///         BuildContent = "RUN yum update -y",
    ///         DeleteInstanceOnFailure = false,
    ///         ImageName = "terraform-example",
    ///         Name = "terraform-example",
    ///         Description = "terraform-example",
    ///         InstanceType = defaultGetInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.Ids[0]),
    ///         ResourceGroupId = @default.Apply(@default =&gt; @default.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id)),
    ///         InternetMaxBandwidthOut = 20,
    ///         SystemDiskSize = 40,
    ///         ToRegionIds = new[]
    ///         {
    ///             "cn-qingdao",
    ///             "cn-zhangjiakou",
    ///         },
    ///         VswitchId = defaultSwitch.Id,
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "Acceptance-test" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Image Pipeline can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ecs/ecsImagePipeline:EcsImagePipeline example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsImagePipeline:EcsImagePipeline")]
    public partial class EcsImagePipeline : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of Alibaba Cloud account to which to share the created image.
        /// </summary>
        [Output("addAccounts")]
        public Output<ImmutableArray<string>> AddAccounts { get; private set; } = null!;

        /// <summary>
        /// The source image. When you set `base_image_type` to `IMAGE`, set `base_image` to the ID of a custom image. When you set `base_image_type` to `IMAGE_FAMILY`, set `base_image` to the name of an image family.
        /// </summary>
        [Output("baseImage")]
        public Output<string> BaseImage { get; private set; } = null!;

        /// <summary>
        /// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
        /// - IMAGE: custom image.
        /// - IMAGE_FAMILY: image family.
        /// </summary>
        [Output("baseImageType")]
        public Output<string> BaseImageType { get; private set; } = null!;

        /// <summary>
        /// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
        /// </summary>
        [Output("buildContent")]
        public Output<string?> BuildContent { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to release the intermediate instance if the image cannot be created.
        /// </summary>
        [Output("deleteInstanceOnFailure")]
        public Output<bool> DeleteInstanceOnFailure { get; private set; } = null!;

        /// <summary>
        /// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Output("imageName")]
        public Output<string?> ImageName { get; private set; } = null!;

        /// <summary>
        /// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
        /// </summary>
        [Output("instanceType")]
        public Output<string?> InstanceType { get; private set; } = null!;

        /// <summary>
        /// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
        /// </summary>
        [Output("internetMaxBandwidthOut")]
        public Output<int> InternetMaxBandwidthOut { get; private set; } = null!;

        /// <summary>
        /// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
        /// </summary>
        [Output("systemDiskSize")]
        public Output<int> SystemDiskSize { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of region to which to distribute the created image.
        /// </summary>
        [Output("toRegionIds")]
        public Output<ImmutableArray<string>> ToRegionIds { get; private set; } = null!;

        /// <summary>
        /// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a EcsImagePipeline resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsImagePipeline(string name, EcsImagePipelineArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, args ?? new EcsImagePipelineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsImagePipeline(string name, Input<string> id, EcsImagePipelineState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsImagePipeline resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsImagePipeline Get(string name, Input<string> id, EcsImagePipelineState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsImagePipeline(name, id, state, options);
        }
    }

    public sealed class EcsImagePipelineArgs : global::Pulumi.ResourceArgs
    {
        [Input("addAccounts")]
        private InputList<string>? _addAccounts;

        /// <summary>
        /// The ID of Alibaba Cloud account to which to share the created image.
        /// </summary>
        public InputList<string> AddAccounts
        {
            get => _addAccounts ?? (_addAccounts = new InputList<string>());
            set => _addAccounts = value;
        }

        /// <summary>
        /// The source image. When you set `base_image_type` to `IMAGE`, set `base_image` to the ID of a custom image. When you set `base_image_type` to `IMAGE_FAMILY`, set `base_image` to the name of an image family.
        /// </summary>
        [Input("baseImage", required: true)]
        public Input<string> BaseImage { get; set; } = null!;

        /// <summary>
        /// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
        /// - IMAGE: custom image.
        /// - IMAGE_FAMILY: image family.
        /// </summary>
        [Input("baseImageType", required: true)]
        public Input<string> BaseImageType { get; set; } = null!;

        /// <summary>
        /// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
        /// </summary>
        [Input("buildContent")]
        public Input<string>? BuildContent { get; set; }

        /// <summary>
        /// Specifies whether to release the intermediate instance if the image cannot be created.
        /// </summary>
        [Input("deleteInstanceOnFailure")]
        public Input<bool>? DeleteInstanceOnFailure { get; set; }

        /// <summary>
        /// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
        /// </summary>
        [Input("internetMaxBandwidthOut")]
        public Input<int>? InternetMaxBandwidthOut { get; set; }

        /// <summary>
        /// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("toRegionIds")]
        private InputList<string>? _toRegionIds;

        /// <summary>
        /// The ID of region to which to distribute the created image.
        /// </summary>
        public InputList<string> ToRegionIds
        {
            get => _toRegionIds ?? (_toRegionIds = new InputList<string>());
            set => _toRegionIds = value;
        }

        /// <summary>
        /// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public EcsImagePipelineArgs()
        {
        }
        public static new EcsImagePipelineArgs Empty => new EcsImagePipelineArgs();
    }

    public sealed class EcsImagePipelineState : global::Pulumi.ResourceArgs
    {
        [Input("addAccounts")]
        private InputList<string>? _addAccounts;

        /// <summary>
        /// The ID of Alibaba Cloud account to which to share the created image.
        /// </summary>
        public InputList<string> AddAccounts
        {
            get => _addAccounts ?? (_addAccounts = new InputList<string>());
            set => _addAccounts = value;
        }

        /// <summary>
        /// The source image. When you set `base_image_type` to `IMAGE`, set `base_image` to the ID of a custom image. When you set `base_image_type` to `IMAGE_FAMILY`, set `base_image` to the name of an image family.
        /// </summary>
        [Input("baseImage")]
        public Input<string>? BaseImage { get; set; }

        /// <summary>
        /// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
        /// - IMAGE: custom image.
        /// - IMAGE_FAMILY: image family.
        /// </summary>
        [Input("baseImageType")]
        public Input<string>? BaseImageType { get; set; }

        /// <summary>
        /// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
        /// </summary>
        [Input("buildContent")]
        public Input<string>? BuildContent { get; set; }

        /// <summary>
        /// Specifies whether to release the intermediate instance if the image cannot be created.
        /// </summary>
        [Input("deleteInstanceOnFailure")]
        public Input<bool>? DeleteInstanceOnFailure { get; set; }

        /// <summary>
        /// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
        /// </summary>
        [Input("internetMaxBandwidthOut")]
        public Input<int>? InternetMaxBandwidthOut { get; set; }

        /// <summary>
        /// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("toRegionIds")]
        private InputList<string>? _toRegionIds;

        /// <summary>
        /// The ID of region to which to distribute the created image.
        /// </summary>
        public InputList<string> ToRegionIds
        {
            get => _toRegionIds ?? (_toRegionIds = new InputList<string>());
            set => _toRegionIds = value;
        }

        /// <summary>
        /// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public EcsImagePipelineState()
        {
        }
        public static new EcsImagePipelineState Empty => new EcsImagePipelineState();
    }
}
