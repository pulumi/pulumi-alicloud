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
    ///     var @default = new AliCloud.Ga.Accelerator("default", new()
    ///     {
    ///         Duration = 1,
    ///         AutoUseCoupon = true,
    ///         Spec = "1",
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
    ///     var defaultBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("default", new()
    ///     {
    ///         AcceleratorId = @default.Id,
    ///         BandwidthPackageId = defaultBandwidthPackage.Id,
    ///     });
    /// 
    ///     var defaultListener = new AliCloud.Ga.Listener("default", new()
    ///     {
    ///         AcceleratorId = defaultBandwidthPackageAttachment.AcceleratorId,
    ///         PortRanges = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
    ///             {
    ///                 FromPort = 60,
    ///                 ToPort = 70,
    ///             },
    ///         },
    ///         ClientAffinity = "SOURCE_IP",
    ///         Protocol = "UDP",
    ///         Name = "terraform-example",
    ///     });
    /// 
    ///     var defaultEipAddress = new List&lt;AliCloud.Ecs.EipAddress&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; 2; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         defaultEipAddress.Add(new AliCloud.Ecs.EipAddress($"default-{range.Value}", new()
    ///         {
    ///             Bandwidth = "10",
    ///             InternetChargeType = "PayByBandwidth",
    ///             AddressName = "terraform-example",
    ///         }));
    ///     }
    ///     var defaultEndpointGroup = new AliCloud.Ga.EndpointGroup("default", new()
    ///     {
    ///         AcceleratorId = @default.Id,
    ///         EndpointConfigurations = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
    ///             {
    ///                 Endpoint = defaultEipAddress[0].IpAddress,
    ///                 Type = "PublicIp",
    ///                 Weight = 20,
    ///             },
    ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
    ///             {
    ///                 Endpoint = defaultEipAddress[1].IpAddress,
    ///                 Type = "PublicIp",
    ///                 Weight = 20,
    ///             },
    ///         },
    ///         EndpointGroupRegion = region,
    ///         ListenerId = defaultListener.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ga Endpoint Group can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ga/endpointGroup:EndpointGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/endpointGroup:EndpointGroup")]
    public partial class EndpointGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See `endpoint_configurations` below.
        /// </summary>
        [Output("endpointConfigurations")]
        public Output<ImmutableArray<Outputs.EndpointGroupEndpointConfiguration>> EndpointConfigurations { get; private set; } = null!;

        /// <summary>
        /// (Available since v1.213.0) The active endpoint IP addresses of the endpoint group. `endpoint_group_ip_list` will change with the growth of network traffic. You can run `pulumi up` to query the latest CIDR blocks and IP addresses.
        /// </summary>
        [Output("endpointGroupIpLists")]
        public Output<ImmutableArray<string>> EndpointGroupIpLists { get; private set; } = null!;

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Output("endpointGroupRegion")]
        public Output<string> EndpointGroupRegion { get; private set; } = null!;

        /// <summary>
        /// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
        /// &gt; **NOTE:** Currently, only `HTTP` or `HTTPS` protocol listener can directly create a `virtual` Endpoint Group. If it is `TCP` protocol listener, and you want to create a `virtual` Endpoint Group, please ensure that the `default` Endpoint Group has been created.
        /// </summary>
        [Output("endpointGroupType")]
        public Output<string> EndpointGroupType { get; private set; } = null!;

        /// <summary>
        /// The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values: `HTTP1.1`, `HTTP2`.
        /// &gt; **NOTE:** `endpoint_protocol_version` is valid only when `endpoint_request_protocol` is set to `HTTPS`.
        /// </summary>
        [Output("endpointProtocolVersion")]
        public Output<string> EndpointProtocolVersion { get; private set; } = null!;

        /// <summary>
        /// The protocol that is used by the backend server. Valid values: `HTTP`, `HTTPS`.
        /// &gt; **NOTE:** `endpoint_request_protocol` can be specified only if the listener that is associated with the endpoint group uses `HTTP` or `HTTPS`. For the listener of `HTTP` protocol, `endpoint_request_protocol` can only be set to `HTTP`.
        /// </summary>
        [Output("endpointRequestProtocol")]
        public Output<string> EndpointRequestProtocol { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable the health check feature. Valid values:
        /// </summary>
        [Output("healthCheckEnabled")]
        public Output<bool?> HealthCheckEnabled { get; private set; } = null!;

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Output("healthCheckIntervalSeconds")]
        public Output<int?> HealthCheckIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Output("healthCheckPath")]
        public Output<string?> HealthCheckPath { get; private set; } = null!;

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Output("healthCheckPort")]
        public Output<int?> HealthCheckPort { get; private set; } = null!;

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values:
        /// - `TCP` or `tcp`: TCP protocol.
        /// - `HTTP` or `http`: HTTP protocol.
        /// - `HTTPS` or `https`: HTTPS protocol.
        /// &gt; **NOTE:** From version 1.223.0, `health_check_protocol` can be set to `TCP`, `HTTP`, `HTTPS`.
        /// </summary>
        [Output("healthCheckProtocol")]
        public Output<string?> HealthCheckProtocol { get; private set; } = null!;

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See `port_overrides` below.
        /// &gt; **NOTE:** Port mapping is only supported when creating terminal node group for listening instance of HTTP or HTTPS protocol. The listening port in the port map must be consistent with the listening port of the current listening instance.
        /// </summary>
        [Output("portOverrides")]
        public Output<Outputs.EndpointGroupPortOverrides?> PortOverrides { get; private set; } = null!;

        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value: `3`.
        /// </summary>
        [Output("thresholdCount")]
        public Output<int> ThresholdCount { get; private set; } = null!;

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Output("trafficPercentage")]
        public Output<int?> TrafficPercentage { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointGroup(string name, EndpointGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/endpointGroup:EndpointGroup", name, args ?? new EndpointGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointGroup(string name, Input<string> id, EndpointGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/endpointGroup:EndpointGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointGroup Get(string name, Input<string> id, EndpointGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointGroup(name, id, state, options);
        }
    }

    public sealed class EndpointGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("endpointConfigurations", required: true)]
        private InputList<Inputs.EndpointGroupEndpointConfigurationArgs>? _endpointConfigurations;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See `endpoint_configurations` below.
        /// </summary>
        public InputList<Inputs.EndpointGroupEndpointConfigurationArgs> EndpointConfigurations
        {
            get => _endpointConfigurations ?? (_endpointConfigurations = new InputList<Inputs.EndpointGroupEndpointConfigurationArgs>());
            set => _endpointConfigurations = value;
        }

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Input("endpointGroupRegion", required: true)]
        public Input<string> EndpointGroupRegion { get; set; } = null!;

        /// <summary>
        /// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
        /// &gt; **NOTE:** Currently, only `HTTP` or `HTTPS` protocol listener can directly create a `virtual` Endpoint Group. If it is `TCP` protocol listener, and you want to create a `virtual` Endpoint Group, please ensure that the `default` Endpoint Group has been created.
        /// </summary>
        [Input("endpointGroupType")]
        public Input<string>? EndpointGroupType { get; set; }

        /// <summary>
        /// The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values: `HTTP1.1`, `HTTP2`.
        /// &gt; **NOTE:** `endpoint_protocol_version` is valid only when `endpoint_request_protocol` is set to `HTTPS`.
        /// </summary>
        [Input("endpointProtocolVersion")]
        public Input<string>? EndpointProtocolVersion { get; set; }

        /// <summary>
        /// The protocol that is used by the backend server. Valid values: `HTTP`, `HTTPS`.
        /// &gt; **NOTE:** `endpoint_request_protocol` can be specified only if the listener that is associated with the endpoint group uses `HTTP` or `HTTPS`. For the listener of `HTTP` protocol, `endpoint_request_protocol` can only be set to `HTTP`.
        /// </summary>
        [Input("endpointRequestProtocol")]
        public Input<string>? EndpointRequestProtocol { get; set; }

        /// <summary>
        /// Specifies whether to enable the health check feature. Valid values:
        /// </summary>
        [Input("healthCheckEnabled")]
        public Input<bool>? HealthCheckEnabled { get; set; }

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Input("healthCheckIntervalSeconds")]
        public Input<int>? HealthCheckIntervalSeconds { get; set; }

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Input("healthCheckPort")]
        public Input<int>? HealthCheckPort { get; set; }

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values:
        /// - `TCP` or `tcp`: TCP protocol.
        /// - `HTTP` or `http`: HTTP protocol.
        /// - `HTTPS` or `https`: HTTPS protocol.
        /// &gt; **NOTE:** From version 1.223.0, `health_check_protocol` can be set to `TCP`, `HTTP`, `HTTPS`.
        /// </summary>
        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId", required: true)]
        public Input<string> ListenerId { get; set; } = null!;

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See `port_overrides` below.
        /// &gt; **NOTE:** Port mapping is only supported when creating terminal node group for listening instance of HTTP or HTTPS protocol. The listening port in the port map must be consistent with the listening port of the current listening instance.
        /// </summary>
        [Input("portOverrides")]
        public Input<Inputs.EndpointGroupPortOverridesArgs>? PortOverrides { get; set; }

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

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value: `3`.
        /// </summary>
        [Input("thresholdCount")]
        public Input<int>? ThresholdCount { get; set; }

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Input("trafficPercentage")]
        public Input<int>? TrafficPercentage { get; set; }

        public EndpointGroupArgs()
        {
        }
        public static new EndpointGroupArgs Empty => new EndpointGroupArgs();
    }

    public sealed class EndpointGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("endpointConfigurations")]
        private InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs>? _endpointConfigurations;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See `endpoint_configurations` below.
        /// </summary>
        public InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs> EndpointConfigurations
        {
            get => _endpointConfigurations ?? (_endpointConfigurations = new InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs>());
            set => _endpointConfigurations = value;
        }

        [Input("endpointGroupIpLists")]
        private InputList<string>? _endpointGroupIpLists;

        /// <summary>
        /// (Available since v1.213.0) The active endpoint IP addresses of the endpoint group. `endpoint_group_ip_list` will change with the growth of network traffic. You can run `pulumi up` to query the latest CIDR blocks and IP addresses.
        /// </summary>
        public InputList<string> EndpointGroupIpLists
        {
            get => _endpointGroupIpLists ?? (_endpointGroupIpLists = new InputList<string>());
            set => _endpointGroupIpLists = value;
        }

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Input("endpointGroupRegion")]
        public Input<string>? EndpointGroupRegion { get; set; }

        /// <summary>
        /// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
        /// &gt; **NOTE:** Currently, only `HTTP` or `HTTPS` protocol listener can directly create a `virtual` Endpoint Group. If it is `TCP` protocol listener, and you want to create a `virtual` Endpoint Group, please ensure that the `default` Endpoint Group has been created.
        /// </summary>
        [Input("endpointGroupType")]
        public Input<string>? EndpointGroupType { get; set; }

        /// <summary>
        /// The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values: `HTTP1.1`, `HTTP2`.
        /// &gt; **NOTE:** `endpoint_protocol_version` is valid only when `endpoint_request_protocol` is set to `HTTPS`.
        /// </summary>
        [Input("endpointProtocolVersion")]
        public Input<string>? EndpointProtocolVersion { get; set; }

        /// <summary>
        /// The protocol that is used by the backend server. Valid values: `HTTP`, `HTTPS`.
        /// &gt; **NOTE:** `endpoint_request_protocol` can be specified only if the listener that is associated with the endpoint group uses `HTTP` or `HTTPS`. For the listener of `HTTP` protocol, `endpoint_request_protocol` can only be set to `HTTP`.
        /// </summary>
        [Input("endpointRequestProtocol")]
        public Input<string>? EndpointRequestProtocol { get; set; }

        /// <summary>
        /// Specifies whether to enable the health check feature. Valid values:
        /// </summary>
        [Input("healthCheckEnabled")]
        public Input<bool>? HealthCheckEnabled { get; set; }

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Input("healthCheckIntervalSeconds")]
        public Input<int>? HealthCheckIntervalSeconds { get; set; }

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Input("healthCheckPort")]
        public Input<int>? HealthCheckPort { get; set; }

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values:
        /// - `TCP` or `tcp`: TCP protocol.
        /// - `HTTP` or `http`: HTTP protocol.
        /// - `HTTPS` or `https`: HTTPS protocol.
        /// &gt; **NOTE:** From version 1.223.0, `health_check_protocol` can be set to `TCP`, `HTTP`, `HTTPS`.
        /// </summary>
        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See `port_overrides` below.
        /// &gt; **NOTE:** Port mapping is only supported when creating terminal node group for listening instance of HTTP or HTTPS protocol. The listening port in the port map must be consistent with the listening port of the current listening instance.
        /// </summary>
        [Input("portOverrides")]
        public Input<Inputs.EndpointGroupPortOverridesGetArgs>? PortOverrides { get; set; }

        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

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

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value: `3`.
        /// </summary>
        [Input("thresholdCount")]
        public Input<int>? ThresholdCount { get; set; }

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Input("trafficPercentage")]
        public Input<int>? TrafficPercentage { get; set; }

        public EndpointGroupState()
        {
        }
        public static new EndpointGroupState Empty => new EndpointGroupState();
    }
}
