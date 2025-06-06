// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Iot
{
    /// <summary>
    /// Provides a Iot Device Group resource.
    /// 
    /// For information about Iot Device Group and how to use it, see [What is Device Group](https://www.alibabacloud.com/help/product/30520.htm).
    /// 
    /// &gt; **NOTE:** Available since v1.134.0.
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
    ///     var name = config.Get("name") ?? "tfexample";
    ///     var example = new AliCloud.Iot.DeviceGroup("example", new()
    ///     {
    ///         GroupName = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Iot Device Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:iot/deviceGroup:DeviceGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:iot/deviceGroup:DeviceGroup")]
    public partial class DeviceGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The GroupDesc of the device group.
        /// </summary>
        [Output("groupDesc")]
        public Output<string?> GroupDesc { get; private set; } = null!;

        /// <summary>
        /// The GroupName of the device group.
        /// </summary>
        [Output("groupName")]
        public Output<string> GroupName { get; private set; } = null!;

        /// <summary>
        /// The id of the Iot Instance.
        /// </summary>
        [Output("iotInstanceId")]
        public Output<string?> IotInstanceId { get; private set; } = null!;

        /// <summary>
        /// The id of the SuperGroup.
        /// </summary>
        [Output("superGroupId")]
        public Output<string?> SuperGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceGroup(string name, DeviceGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:iot/deviceGroup:DeviceGroup", name, args ?? new DeviceGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceGroup(string name, Input<string> id, DeviceGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:iot/deviceGroup:DeviceGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeviceGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceGroup Get(string name, Input<string> id, DeviceGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceGroup(name, id, state, options);
        }
    }

    public sealed class DeviceGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GroupDesc of the device group.
        /// </summary>
        [Input("groupDesc")]
        public Input<string>? GroupDesc { get; set; }

        /// <summary>
        /// The GroupName of the device group.
        /// </summary>
        [Input("groupName", required: true)]
        public Input<string> GroupName { get; set; } = null!;

        /// <summary>
        /// The id of the Iot Instance.
        /// </summary>
        [Input("iotInstanceId")]
        public Input<string>? IotInstanceId { get; set; }

        /// <summary>
        /// The id of the SuperGroup.
        /// </summary>
        [Input("superGroupId")]
        public Input<string>? SuperGroupId { get; set; }

        public DeviceGroupArgs()
        {
        }
        public static new DeviceGroupArgs Empty => new DeviceGroupArgs();
    }

    public sealed class DeviceGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GroupDesc of the device group.
        /// </summary>
        [Input("groupDesc")]
        public Input<string>? GroupDesc { get; set; }

        /// <summary>
        /// The GroupName of the device group.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// The id of the Iot Instance.
        /// </summary>
        [Input("iotInstanceId")]
        public Input<string>? IotInstanceId { get; set; }

        /// <summary>
        /// The id of the SuperGroup.
        /// </summary>
        [Input("superGroupId")]
        public Input<string>? SuperGroupId { get; set; }

        public DeviceGroupState()
        {
        }
        public static new DeviceGroupState Empty => new DeviceGroupState();
    }
}
