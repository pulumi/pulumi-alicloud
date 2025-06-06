// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    /// <summary>
    /// Provides a Express Connect Vbr Pconn Association resource.
    /// 
    /// For information about Express Connect Vbr Pconn Association and how to use it, see [What is Vbr Pconn Association](https://www.alibabacloud.com/help/en/express-connect/latest/associatephysicalconnectiontovirtualborderrouter#doc-api-Vpc-AssociatePhysicalConnectionToVirtualBorderRouter).
    /// 
    /// &gt; **NOTE:** Available since v1.196.0.
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
    ///     var example = AliCloud.ExpressConnect.GetPhysicalConnections.Invoke(new()
    ///     {
    ///         NameRegex = "^preserved-NODELETING",
    ///     });
    /// 
    ///     var @default = new AliCloud.ExpressConnect.VirtualBorderRouter("default", new()
    ///     {
    ///         LocalGatewayIp = "10.0.0.1",
    ///         PeerGatewayIp = "10.0.0.2",
    ///         PeeringSubnetMask = "255.255.255.252",
    ///         PhysicalConnectionId = example.Apply(getPhysicalConnectionsResult =&gt; getPhysicalConnectionsResult.Connections[0]?.Id),
    ///         VirtualBorderRouterName = name,
    ///         VlanId = 110,
    ///         MinRxInterval = 1000,
    ///         MinTxInterval = 1000,
    ///         DetectMultiplier = 10,
    ///         EnableIpv6 = true,
    ///         LocalIpv6GatewayIp = "2408:4004:cc:400::1",
    ///         PeerIpv6GatewayIp = "2408:4004:cc:400::2",
    ///         PeeringIpv6SubnetMask = "2408:4004:cc:400::/56",
    ///     });
    /// 
    ///     var exampleVbrPconnAssociation = new AliCloud.ExpressConnect.VbrPconnAssociation("example", new()
    ///     {
    ///         PeerGatewayIp = "10.0.0.6",
    ///         LocalGatewayIp = "10.0.0.5",
    ///         PhysicalConnectionId = example.Apply(getPhysicalConnectionsResult =&gt; getPhysicalConnectionsResult.Connections[1]?.Id),
    ///         VbrId = @default.Id,
    ///         PeeringSubnetMask = "255.255.255.252",
    ///         VlanId = 1122,
    ///         EnableIpv6 = true,
    ///         LocalIpv6GatewayIp = "2408:4004:cc::3",
    ///         PeerIpv6GatewayIp = "2408:4004:cc::4",
    ///         PeeringIpv6SubnetMask = "2408:4004:cc::/56",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Express Connect Vbr Pconn Association can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation example &lt;VbrId&gt;:&lt;PhysicalConnectionId&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation")]
    public partial class VbrPconnAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The circuit code provided by the operator for the physical connection.
        /// </summary>
        [Output("circuitCode")]
        public Output<string> CircuitCode { get; private set; } = null!;

        /// <summary>
        /// Whether IPv6 is enabled. Value:
        /// - **true**: on.
        /// - **false** (default): Off.
        /// </summary>
        [Output("enableIpv6")]
        public Output<bool> EnableIpv6 { get; private set; } = null!;

        /// <summary>
        /// The Alibaba cloud IP address of the VBR instance.
        /// </summary>
        [Output("localGatewayIp")]
        public Output<string?> LocalGatewayIp { get; private set; } = null!;

        /// <summary>
        /// The IPv6 address on the Alibaba Cloud side of the VBR instance.
        /// </summary>
        [Output("localIpv6GatewayIp")]
        public Output<string?> LocalIpv6GatewayIp { get; private set; } = null!;

        /// <summary>
        /// The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Output("peerGatewayIp")]
        public Output<string?> PeerGatewayIp { get; private set; } = null!;

        /// <summary>
        /// The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Output("peerIpv6GatewayIp")]
        public Output<string?> PeerIpv6GatewayIp { get; private set; } = null!;

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
        /// </summary>
        [Output("peeringIpv6SubnetMask")]
        public Output<string?> PeeringIpv6SubnetMask { get; private set; } = null!;

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
        /// </summary>
        [Output("peeringSubnetMask")]
        public Output<string?> PeeringSubnetMask { get; private set; } = null!;

        /// <summary>
        /// The ID of the leased line instance.
        /// </summary>
        [Output("physicalConnectionId")]
        public Output<string> PhysicalConnectionId { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VBR instance.
        /// </summary>
        [Output("vbrId")]
        public Output<string> VbrId { get; private set; } = null!;

        /// <summary>
        /// VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
        /// </summary>
        [Output("vlanId")]
        public Output<int> VlanId { get; private set; } = null!;


        /// <summary>
        /// Create a VbrPconnAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VbrPconnAssociation(string name, VbrPconnAssociationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation", name, args ?? new VbrPconnAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VbrPconnAssociation(string name, Input<string> id, VbrPconnAssociationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:expressconnect/vbrPconnAssociation:VbrPconnAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VbrPconnAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VbrPconnAssociation Get(string name, Input<string> id, VbrPconnAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new VbrPconnAssociation(name, id, state, options);
        }
    }

    public sealed class VbrPconnAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether IPv6 is enabled. Value:
        /// - **true**: on.
        /// - **false** (default): Off.
        /// </summary>
        [Input("enableIpv6")]
        public Input<bool>? EnableIpv6 { get; set; }

        /// <summary>
        /// The Alibaba cloud IP address of the VBR instance.
        /// </summary>
        [Input("localGatewayIp")]
        public Input<string>? LocalGatewayIp { get; set; }

        /// <summary>
        /// The IPv6 address on the Alibaba Cloud side of the VBR instance.
        /// </summary>
        [Input("localIpv6GatewayIp")]
        public Input<string>? LocalIpv6GatewayIp { get; set; }

        /// <summary>
        /// The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Input("peerGatewayIp")]
        public Input<string>? PeerGatewayIp { get; set; }

        /// <summary>
        /// The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Input("peerIpv6GatewayIp")]
        public Input<string>? PeerIpv6GatewayIp { get; set; }

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
        /// </summary>
        [Input("peeringIpv6SubnetMask")]
        public Input<string>? PeeringIpv6SubnetMask { get; set; }

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
        /// </summary>
        [Input("peeringSubnetMask")]
        public Input<string>? PeeringSubnetMask { get; set; }

        /// <summary>
        /// The ID of the leased line instance.
        /// </summary>
        [Input("physicalConnectionId", required: true)]
        public Input<string> PhysicalConnectionId { get; set; } = null!;

        /// <summary>
        /// The ID of the VBR instance.
        /// </summary>
        [Input("vbrId", required: true)]
        public Input<string> VbrId { get; set; } = null!;

        /// <summary>
        /// VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
        /// </summary>
        [Input("vlanId", required: true)]
        public Input<int> VlanId { get; set; } = null!;

        public VbrPconnAssociationArgs()
        {
        }
        public static new VbrPconnAssociationArgs Empty => new VbrPconnAssociationArgs();
    }

    public sealed class VbrPconnAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The circuit code provided by the operator for the physical connection.
        /// </summary>
        [Input("circuitCode")]
        public Input<string>? CircuitCode { get; set; }

        /// <summary>
        /// Whether IPv6 is enabled. Value:
        /// - **true**: on.
        /// - **false** (default): Off.
        /// </summary>
        [Input("enableIpv6")]
        public Input<bool>? EnableIpv6 { get; set; }

        /// <summary>
        /// The Alibaba cloud IP address of the VBR instance.
        /// </summary>
        [Input("localGatewayIp")]
        public Input<string>? LocalGatewayIp { get; set; }

        /// <summary>
        /// The IPv6 address on the Alibaba Cloud side of the VBR instance.
        /// </summary>
        [Input("localIpv6GatewayIp")]
        public Input<string>? LocalIpv6GatewayIp { get; set; }

        /// <summary>
        /// The client IP address of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Input("peerGatewayIp")]
        public Input<string>? PeerGatewayIp { get; set; }

        /// <summary>
        /// The IPv6 address of the client side of the VBR instance. This attribute only allows the VBR owner to specify or modify. **NOTE:** Required when creating a VBR instance for the physical connection owner.
        /// </summary>
        [Input("peerIpv6GatewayIp")]
        public Input<string>? PeerIpv6GatewayIp { get; set; }

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.Two IPv6 addresses must be in the same subnet.
        /// </summary>
        [Input("peeringIpv6SubnetMask")]
        public Input<string>? PeeringIpv6SubnetMask { get; set; }

        /// <summary>
        /// The subnet mask of the Alibaba Cloud side and the client side of the VBR instance.The two IP addresses must be in the same subnet.
        /// </summary>
        [Input("peeringSubnetMask")]
        public Input<string>? PeeringSubnetMask { get; set; }

        /// <summary>
        /// The ID of the leased line instance.
        /// </summary>
        [Input("physicalConnectionId")]
        public Input<string>? PhysicalConnectionId { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VBR instance.
        /// </summary>
        [Input("vbrId")]
        public Input<string>? VbrId { get; set; }

        /// <summary>
        /// VLAN ID of the VBR. Valid values: **0 to 2999**. **NOTE:** only the owner of the physical connection can specify this parameter. The VLAN ID of two VBRs under the same physical connection cannot be the same.
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public VbrPconnAssociationState()
        {
        }
        public static new VbrPconnAssociationState Empty => new VbrPconnAssociationState();
    }
}
