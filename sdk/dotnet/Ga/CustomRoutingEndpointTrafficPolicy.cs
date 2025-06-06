// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Global Accelerator (GA) Custom Routing Endpoint Traffic Policy resource.
    /// 
    /// For information about Global Accelerator (GA) Custom Routing Endpoint Traffic Policy and how to use it, see [What is Custom Routing Endpoint Traffic Policy](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createcustomroutingendpointtrafficpolicies).
    /// 
    /// &gt; **NOTE:** Available since v1.197.0.
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
    ///     var region = config.Get("region") ?? "cn-hangzhou";
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var @default = AliCloud.GetZones.Invoke();
    /// 
    ///     var defaultGetAccelerators = AliCloud.Ga.GetAccelerators.Invoke(new()
    ///     {
    ///         Status = "active",
    ///         BandwidthBillingType = "BandwidthPackage",
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
    ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Ids[0])),
    ///     });
    /// 
    ///     var defaultBandwidthPackage = new AliCloud.Ga.BandwidthPackage("default", new()
    ///     {
    ///         Bandwidth = 100,
    ///         Type = "Basic",
    ///         BandwidthType = "Basic",
    ///         PaymentType = "PayAsYouGo",
    ///         BillingType = "PayBy95",
    ///         Ratio = 30,
    ///     });
    /// 
    ///     var defaultGetRegions = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var defaultBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("default", new()
    ///     {
    ///         AcceleratorId = defaultGetAccelerators.Apply(getAcceleratorsResult =&gt; getAcceleratorsResult.Accelerators[1]?.Id),
    ///         BandwidthPackageId = defaultBandwidthPackage.Id,
    ///     });
    /// 
    ///     var defaultListener = new AliCloud.Ga.Listener("default", new()
    ///     {
    ///         AcceleratorId = defaultBandwidthPackageAttachment.AcceleratorId,
    ///         ListenerType = "CustomRouting",
    ///         PortRanges = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
    ///             {
    ///                 FromPort = 10000,
    ///                 ToPort = 26000,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultCustomRoutingEndpointGroup = new AliCloud.Ga.CustomRoutingEndpointGroup("default", new()
    ///     {
    ///         AcceleratorId = defaultListener.AcceleratorId,
    ///         ListenerId = defaultListener.Id,
    ///         EndpointGroupRegion = defaultGetRegions.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id),
    ///         CustomRoutingEndpointGroupName = name,
    ///         Description = name,
    ///     });
    /// 
    ///     var defaultCustomRoutingEndpointGroupDestination = new AliCloud.Ga.CustomRoutingEndpointGroupDestination("default", new()
    ///     {
    ///         EndpointGroupId = defaultCustomRoutingEndpointGroup.Id,
    ///         Protocols = new[]
    ///         {
    ///             "TCP",
    ///         },
    ///         FromPort = 1,
    ///         ToPort = 10,
    ///     });
    /// 
    ///     var defaultCustomRoutingEndpoint = new AliCloud.Ga.CustomRoutingEndpoint("default", new()
    ///     {
    ///         EndpointGroupId = defaultCustomRoutingEndpointGroupDestination.EndpointGroupId,
    ///         Endpoint = defaultSwitch.Id,
    ///         Type = "PrivateSubNet",
    ///         TrafficToEndpointPolicy = "AllowAll",
    ///     });
    /// 
    ///     var defaultCustomRoutingEndpointTrafficPolicy = new AliCloud.Ga.CustomRoutingEndpointTrafficPolicy("default", new()
    ///     {
    ///         EndpointId = defaultCustomRoutingEndpoint.CustomRoutingEndpointId,
    ///         Address = "192.168.192.2",
    ///         PortRanges = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.CustomRoutingEndpointTrafficPolicyPortRangeArgs
    ///             {
    ///                 FromPort = 1,
    ///                 ToPort = 2,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Accelerator (GA) Custom Routing Endpoint Traffic Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy example &lt;endpoint_id&gt;:&lt;custom_routing_endpoint_traffic_policy_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy")]
    public partial class CustomRoutingEndpointTrafficPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The IP address of the destination to which traffic is allowed.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The ID of the Custom Routing Endpoint Traffic Policy.
        /// </summary>
        [Output("customRoutingEndpointTrafficPolicyId")]
        public Output<string> CustomRoutingEndpointTrafficPolicyId { get; private set; } = null!;

        /// <summary>
        /// The ID of the endpoint group.
        /// </summary>
        [Output("endpointGroupId")]
        public Output<string> EndpointGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Custom Routing Endpoint.
        /// </summary>
        [Output("endpointId")]
        public Output<string> EndpointId { get; private set; } = null!;

        /// <summary>
        /// The ID of the listener.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// Port rangeSee the following. See `port_ranges` below.
        /// </summary>
        [Output("portRanges")]
        public Output<ImmutableArray<Outputs.CustomRoutingEndpointTrafficPolicyPortRange>> PortRanges { get; private set; } = null!;

        /// <summary>
        /// The status of the Custom Routing Endpoint Traffic Policy.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a CustomRoutingEndpointTrafficPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomRoutingEndpointTrafficPolicy(string name, CustomRoutingEndpointTrafficPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy", name, args ?? new CustomRoutingEndpointTrafficPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomRoutingEndpointTrafficPolicy(string name, Input<string> id, CustomRoutingEndpointTrafficPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/customRoutingEndpointTrafficPolicy:CustomRoutingEndpointTrafficPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomRoutingEndpointTrafficPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomRoutingEndpointTrafficPolicy Get(string name, Input<string> id, CustomRoutingEndpointTrafficPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomRoutingEndpointTrafficPolicy(name, id, state, options);
        }
    }

    public sealed class CustomRoutingEndpointTrafficPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address of the destination to which traffic is allowed.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The ID of the Custom Routing Endpoint.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        [Input("portRanges")]
        private InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeArgs>? _portRanges;

        /// <summary>
        /// Port rangeSee the following. See `port_ranges` below.
        /// </summary>
        public InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeArgs> PortRanges
        {
            get => _portRanges ?? (_portRanges = new InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeArgs>());
            set => _portRanges = value;
        }

        public CustomRoutingEndpointTrafficPolicyArgs()
        {
        }
        public static new CustomRoutingEndpointTrafficPolicyArgs Empty => new CustomRoutingEndpointTrafficPolicyArgs();
    }

    public sealed class CustomRoutingEndpointTrafficPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the GA instance.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The IP address of the destination to which traffic is allowed.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The ID of the Custom Routing Endpoint Traffic Policy.
        /// </summary>
        [Input("customRoutingEndpointTrafficPolicyId")]
        public Input<string>? CustomRoutingEndpointTrafficPolicyId { get; set; }

        /// <summary>
        /// The ID of the endpoint group.
        /// </summary>
        [Input("endpointGroupId")]
        public Input<string>? EndpointGroupId { get; set; }

        /// <summary>
        /// The ID of the Custom Routing Endpoint.
        /// </summary>
        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        /// <summary>
        /// The ID of the listener.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        [Input("portRanges")]
        private InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeGetArgs>? _portRanges;

        /// <summary>
        /// Port rangeSee the following. See `port_ranges` below.
        /// </summary>
        public InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeGetArgs> PortRanges
        {
            get => _portRanges ?? (_portRanges = new InputList<Inputs.CustomRoutingEndpointTrafficPolicyPortRangeGetArgs>());
            set => _portRanges = value;
        }

        /// <summary>
        /// The status of the Custom Routing Endpoint Traffic Policy.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public CustomRoutingEndpointTrafficPolicyState()
        {
        }
        public static new CustomRoutingEndpointTrafficPolicyState Empty => new CustomRoutingEndpointTrafficPolicyState();
    }
}
