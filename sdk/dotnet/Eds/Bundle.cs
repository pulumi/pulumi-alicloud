// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds
{
    /// <summary>
    /// Provides a ECD Bundle resource.
    /// 
    /// For information about ECD Bundle and how to use it, see [What is Bundle](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-createbundle).
    /// 
    /// &gt; **NOTE:** Available since v1.170.0.
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
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = AliCloud.Eds.GetImages.Invoke(new()
    ///     {
    ///         ImageType = "SYSTEM",
    ///         OsType = "Windows",
    ///         DesktopInstanceType = "eds.hf.4c8g",
    ///     });
    /// 
    ///     var defaultGetDesktopTypes = AliCloud.Eds.GetDesktopTypes.Invoke(new()
    ///     {
    ///         InstanceTypeFamily = "eds.hf",
    ///         CpuCount = 4,
    ///         MemorySize = 8192,
    ///     });
    /// 
    ///     var defaultBundle = new AliCloud.Eds.Bundle("default", new()
    ///     {
    ///         Description = name,
    ///         DesktopType = defaultGetDesktopTypes.Apply(getDesktopTypesResult =&gt; getDesktopTypesResult.Ids[0]),
    ///         BundleName = name,
    ///         ImageId = @default.Apply(@default =&gt; @default.Apply(getImagesResult =&gt; getImagesResult.Ids[0])),
    ///         UserDiskSizeGibs = new[]
    ///         {
    ///             70,
    ///         },
    ///         RootDiskSizeGib = 80,
    ///         RootDiskPerformanceLevel = "PL1",
    ///         UserDiskPerformanceLevel = "PL1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECD Bundle can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:eds/bundle:Bundle example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eds/bundle:Bundle")]
    public partial class Bundle : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bundle.
        /// </summary>
        [Output("bundleName")]
        public Output<string?> BundleName { get; private set; } = null!;

        /// <summary>
        /// The description of the bundle.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
        /// </summary>
        [Output("desktopType")]
        public Output<string> DesktopType { get; private set; } = null!;

        /// <summary>
        /// The ID of the image.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        /// </summary>
        [Output("language")]
        public Output<string?> Language { get; private set; } = null!;

        /// <summary>
        /// The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Output("rootDiskPerformanceLevel")]
        public Output<string> RootDiskPerformanceLevel { get; private set; } = null!;

        /// <summary>
        /// The root disk size gib.
        /// </summary>
        [Output("rootDiskSizeGib")]
        public Output<int> RootDiskSizeGib { get; private set; } = null!;

        /// <summary>
        /// The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Output("userDiskPerformanceLevel")]
        public Output<string> UserDiskPerformanceLevel { get; private set; } = null!;

        /// <summary>
        /// The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        /// - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        /// - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        /// </summary>
        [Output("userDiskSizeGibs")]
        public Output<ImmutableArray<int>> UserDiskSizeGibs { get; private set; } = null!;


        /// <summary>
        /// Create a Bundle resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Bundle(string name, BundleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eds/bundle:Bundle", name, args ?? new BundleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Bundle(string name, Input<string> id, BundleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eds/bundle:Bundle", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Bundle resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Bundle Get(string name, Input<string> id, BundleState? state = null, CustomResourceOptions? options = null)
        {
            return new Bundle(name, id, state, options);
        }
    }

    public sealed class BundleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bundle.
        /// </summary>
        [Input("bundleName")]
        public Input<string>? BundleName { get; set; }

        /// <summary>
        /// The description of the bundle.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
        /// </summary>
        [Input("desktopType", required: true)]
        public Input<string> DesktopType { get; set; } = null!;

        /// <summary>
        /// The ID of the image.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        /// <summary>
        /// The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("rootDiskPerformanceLevel")]
        public Input<string>? RootDiskPerformanceLevel { get; set; }

        /// <summary>
        /// The root disk size gib.
        /// </summary>
        [Input("rootDiskSizeGib", required: true)]
        public Input<int> RootDiskSizeGib { get; set; } = null!;

        /// <summary>
        /// The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("userDiskPerformanceLevel")]
        public Input<string>? UserDiskPerformanceLevel { get; set; }

        [Input("userDiskSizeGibs", required: true)]
        private InputList<int>? _userDiskSizeGibs;

        /// <summary>
        /// The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        /// - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        /// - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        /// </summary>
        public InputList<int> UserDiskSizeGibs
        {
            get => _userDiskSizeGibs ?? (_userDiskSizeGibs = new InputList<int>());
            set => _userDiskSizeGibs = value;
        }

        public BundleArgs()
        {
        }
        public static new BundleArgs Empty => new BundleArgs();
    }

    public sealed class BundleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bundle.
        /// </summary>
        [Input("bundleName")]
        public Input<string>? BundleName { get; set; }

        /// <summary>
        /// The description of the bundle.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
        /// </summary>
        [Input("desktopType")]
        public Input<string>? DesktopType { get; set; }

        /// <summary>
        /// The ID of the image.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("rootDiskPerformanceLevel")]
        public Input<string>? RootDiskPerformanceLevel { get; set; }

        /// <summary>
        /// The root disk size gib.
        /// </summary>
        [Input("rootDiskSizeGib")]
        public Input<int>? RootDiskSizeGib { get; set; }

        /// <summary>
        /// The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("userDiskPerformanceLevel")]
        public Input<string>? UserDiskPerformanceLevel { get; set; }

        [Input("userDiskSizeGibs")]
        private InputList<int>? _userDiskSizeGibs;

        /// <summary>
        /// The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
        /// - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
        /// - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
        /// </summary>
        public InputList<int> UserDiskSizeGibs
        {
            get => _userDiskSizeGibs ?? (_userDiskSizeGibs = new InputList<int>());
            set => _userDiskSizeGibs = value;
        }

        public BundleState()
        {
        }
        public static new BundleState Empty => new BundleState();
    }
}
