// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a Vpc Ipv6 Gateway resource. Gateway Based on Internet Protocol Version 6.
    /// 
    /// For information about Vpc Ipv6 Gateway and how to use it, see [What is Ipv6 Gateway](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createipv6gateway).
    /// 
    /// &gt; **NOTE:** Available since v1.142.0.
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
    ///     var name = config.Get("name") ?? "tf-testacc-example";
    ///     var defaultVpc = new AliCloud.Vpc.Network("defaultVpc", new()
    ///     {
    ///         Description = "tf-testacc",
    ///         EnableIpv6 = true,
    ///     });
    /// 
    ///     var defaultRg = new AliCloud.ResourceManager.ResourceGroup("defaultRg", new()
    ///     {
    ///         DisplayName = "tf-testacc-ipv6gateway503",
    ///         ResourceGroupName = $"{name}1",
    ///     });
    /// 
    ///     var changeRg = new AliCloud.ResourceManager.ResourceGroup("changeRg", new()
    ///     {
    ///         DisplayName = "tf-testacc-ipv6gateway311",
    ///         ResourceGroupName = $"{name}2",
    ///     });
    /// 
    ///     var @default = new AliCloud.Vpc.Ipv6Gateway("default", new()
    ///     {
    ///         Description = "test",
    ///         Ipv6GatewayName = name,
    ///         VpcId = defaultVpc.Id,
    ///         ResourceGroupId = defaultRg.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Vpc Ipv6 Gateway can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:vpc/ipv6Gateway:Ipv6Gateway example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/ipv6Gateway:Ipv6Gateway")]
    public partial class Ipv6Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The status of the IPv6 gateway.
        /// </summary>
        [Output("businessStatus")]
        public Output<string> BusinessStatus { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The expiration time of IPv6 gateway.
        /// </summary>
        [Output("expiredTime")]
        public Output<string> ExpiredTime { get; private set; } = null!;

        /// <summary>
        /// The charge type of IPv6 gateway.
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// Resource primary key attribute field.
        /// </summary>
        [Output("ipv6GatewayId")]
        public Output<string> Ipv6GatewayId { get; private set; } = null!;

        /// <summary>
        /// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
        /// </summary>
        [Output("ipv6GatewayName")]
        public Output<string?> Ipv6GatewayName { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
        /// </summary>
        [Output("spec")]
        public Output<string> Spec { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: Available, Pending and Deleting.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags for the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a Ipv6Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ipv6Gateway(string name, Ipv6GatewayArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipv6Gateway:Ipv6Gateway", name, args ?? new Ipv6GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ipv6Gateway(string name, Input<string> id, Ipv6GatewayState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/ipv6Gateway:Ipv6Gateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ipv6Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ipv6Gateway Get(string name, Input<string> id, Ipv6GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Ipv6Gateway(name, id, state, options);
        }
    }

    public sealed class Ipv6GatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
        /// </summary>
        [Input("ipv6GatewayName")]
        public Input<string>? Ipv6GatewayName { get; set; }

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
        /// </summary>
        [Input("spec")]
        public Input<string>? Spec { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public Ipv6GatewayArgs()
        {
        }
        public static new Ipv6GatewayArgs Empty => new Ipv6GatewayArgs();
    }

    public sealed class Ipv6GatewayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the IPv6 gateway.
        /// </summary>
        [Input("businessStatus")]
        public Input<string>? BusinessStatus { get; set; }

        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the IPv6 gateway. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The expiration time of IPv6 gateway.
        /// </summary>
        [Input("expiredTime")]
        public Input<string>? ExpiredTime { get; set; }

        /// <summary>
        /// The charge type of IPv6 gateway.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Resource primary key attribute field.
        /// </summary>
        [Input("ipv6GatewayId")]
        public Input<string>? Ipv6GatewayId { get; set; }

        /// <summary>
        /// The name of the IPv6 gateway. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with http:// or https://.
        /// </summary>
        [Input("ipv6GatewayName")]
        public Input<string>? Ipv6GatewayName { get; set; }

        /// <summary>
        /// The ID of the resource group to which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// IPv6 gateways do not distinguish between specifications. This parameter is no longer used.
        /// </summary>
        [Input("spec")]
        public Input<string>? Spec { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: Available, Pending and Deleting.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// The tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the virtual private cloud (VPC) for which you want to create the IPv6 gateway.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public Ipv6GatewayState()
        {
        }
        public static new Ipv6GatewayState Empty => new Ipv6GatewayState();
    }
}
