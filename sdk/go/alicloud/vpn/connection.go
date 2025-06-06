// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// # Basic Usage
//
// [IPsec-VPN connections support the dual-tunnel mode](https://www.alibabacloud.com/help/en/vpn/product-overview/ipsec-vpn-connections-support-the-dual-tunnel-mode)
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			spec := "5"
//			if param := cfg.Get("spec"); param != "" {
//				spec = param
//			}
//			_default, err := vpn.GetGatewayZones(ctx, &vpn.GetGatewayZonesArgs{
//				Spec: "5M",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "default", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//				VpcName:   pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			default0, err := vpc.NewSwitch(ctx, "default0", &vpc.SwitchArgs{
//				CidrBlock: pulumi.String("172.16.0.0/24"),
//				VpcId:     defaultNetwork.ID(),
//				ZoneId:    pulumi.String(_default.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			default1, err := vpc.NewSwitch(ctx, "default1", &vpc.SwitchArgs{
//				CidrBlock: pulumi.String("172.16.1.0/24"),
//				VpcId:     defaultNetwork.ID(),
//				ZoneId:    pulumi.String(_default.Ids[1]),
//			})
//			if err != nil {
//				return err
//			}
//			HA_VPN, err := vpn.NewGateway(ctx, "HA-VPN", &vpn.GatewayArgs{
//				VpnType:                   pulumi.String("Normal"),
//				DisasterRecoveryVswitchId: default1.ID(),
//				VpnGatewayName:            pulumi.String(name),
//				VswitchId:                 default0.ID(),
//				AutoPay:                   pulumi.Bool(true),
//				VpcId:                     defaultNetwork.ID(),
//				NetworkType:               pulumi.String("public"),
//				PaymentType:               pulumi.String("Subscription"),
//				EnableIpsec:               pulumi.Bool(true),
//				Bandwidth:                 pulumi.String(spec),
//			})
//			if err != nil {
//				return err
//			}
//			defaultCustomerGateway, err := vpn.NewCustomerGateway(ctx, "defaultCustomerGateway", &vpn.CustomerGatewayArgs{
//				Description:         pulumi.String("defaultCustomerGateway"),
//				IpAddress:           pulumi.String("2.2.2.5"),
//				Asn:                 pulumi.String("2224"),
//				CustomerGatewayName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpn.NewCustomerGateway(ctx, "changeCustomerGateway", &vpn.CustomerGatewayArgs{
//				Description:         pulumi.String("changeCustomerGateway"),
//				IpAddress:           pulumi.String("2.2.2.6"),
//				Asn:                 pulumi.String("2225"),
//				CustomerGatewayName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpn.NewConnection(ctx, "default", &vpn.ConnectionArgs{
//				VpnGatewayId:      HA_VPN.ID(),
//				VpnConnectionName: pulumi.String(name),
//				LocalSubnets: pulumi.StringArray{
//					pulumi.String("3.0.0.0/24"),
//				},
//				RemoteSubnets: pulumi.StringArray{
//					pulumi.String("10.0.0.0/24"),
//					pulumi.String("10.0.1.0/24"),
//				},
//				Tags: pulumi.StringMap{
//					"Created": pulumi.String("TF"),
//					"For":     pulumi.String("example"),
//				},
//				EnableTunnelsBgp: pulumi.Bool(true),
//				TunnelOptionsSpecifications: vpn.ConnectionTunnelOptionsSpecificationArray{
//					&vpn.ConnectionTunnelOptionsSpecificationArgs{
//						TunnelIpsecConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs{
//							IpsecAuthAlg:  pulumi.String("md5"),
//							IpsecEncAlg:   pulumi.String("aes256"),
//							IpsecLifetime: pulumi.Int(16400),
//							IpsecPfs:      pulumi.String("group5"),
//						},
//						CustomerGatewayId: defaultCustomerGateway.ID(),
//						Role:              pulumi.String("master"),
//						TunnelBgpConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs{
//							LocalAsn:   pulumi.String("1219002"),
//							TunnelCidr: pulumi.String("169.254.30.0/30"),
//							LocalBgpIp: pulumi.String("169.254.30.1"),
//						},
//						TunnelIkeConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs{
//							IkeMode:     pulumi.String("aggressive"),
//							IkeVersion:  pulumi.String("ikev2"),
//							LocalId:     pulumi.String("localid_tunnel2"),
//							Psk:         pulumi.String("12345678"),
//							RemoteId:    pulumi.String("remote2"),
//							IkeAuthAlg:  pulumi.String("md5"),
//							IkeEncAlg:   pulumi.String("aes256"),
//							IkeLifetime: pulumi.Int(3600),
//							IkePfs:      pulumi.String("group14"),
//						},
//					},
//					&vpn.ConnectionTunnelOptionsSpecificationArgs{
//						TunnelIkeConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelIkeConfigArgs{
//							RemoteId:    pulumi.String("remote24"),
//							IkeEncAlg:   pulumi.String("aes256"),
//							IkeLifetime: pulumi.Int(27000),
//							IkeMode:     pulumi.String("aggressive"),
//							IkePfs:      pulumi.String("group5"),
//							IkeAuthAlg:  pulumi.String("md5"),
//							IkeVersion:  pulumi.String("ikev2"),
//							LocalId:     pulumi.String("localid_tunnel2"),
//							Psk:         pulumi.String("12345678"),
//						},
//						TunnelIpsecConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelIpsecConfigArgs{
//							IpsecLifetime: pulumi.Int(2700),
//							IpsecPfs:      pulumi.String("group14"),
//							IpsecAuthAlg:  pulumi.String("md5"),
//							IpsecEncAlg:   pulumi.String("aes256"),
//						},
//						CustomerGatewayId: defaultCustomerGateway.ID(),
//						Role:              pulumi.String("slave"),
//						TunnelBgpConfig: &vpn.ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs{
//							LocalAsn:   pulumi.String("1219002"),
//							LocalBgpIp: pulumi.String("169.254.40.1"),
//							TunnelCidr: pulumi.String("169.254.40.0/30"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// VPN connection can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpn/connection:Connection example <id>
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Whether to configure routing automatically. Value:
	// - **true**: Automatically configure routes.
	// - **false**: does not automatically configure routes.
	AutoConfigRoute pulumi.BoolPtrOutput `pulumi:"autoConfigRoute"`
	// vpnBgp configuration. See `bgpConfig` below.
	BgpConfig ConnectionBgpConfigOutput `pulumi:"bgpConfig"`
	// The time when the IPsec-VPN connection was created.
	CreateTime pulumi.IntOutput `pulumi:"createTime"`
	// The ID of the customer gateway.
	CustomerGatewayId pulumi.StringPtrOutput `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrOutput `pulumi:"effectImmediately"`
	// Wether enable Dpd detection.
	EnableDpd pulumi.BoolOutput `pulumi:"enableDpd"`
	// enable nat traversal.
	EnableNatTraversal pulumi.BoolOutput `pulumi:"enableNatTraversal"`
	// Enable tunnel bgp.
	EnableTunnelsBgp pulumi.BoolOutput `pulumi:"enableTunnelsBgp"`
	// Health Check information. See `healthCheckConfig` below.
	HealthCheckConfig ConnectionHealthCheckConfigOutput `pulumi:"healthCheckConfig"`
	// The configuration of Phase 1 negotiations. See `ikeConfig` below.
	IkeConfig ConnectionIkeConfigOutput `pulumi:"ikeConfig"`
	// IPsec configuration. See `ipsecConfig` below.
	IpsecConfig ConnectionIpsecConfigOutput `pulumi:"ipsecConfig"`
	// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
	LocalSubnets pulumi.StringArrayOutput `pulumi:"localSubnets"`
	// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The network type of the IPsec connection. Value:
	// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
	// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
	NetworkType pulumi.StringPtrOutput `pulumi:"networkType"`
	// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
	RemoteSubnets pulumi.StringArrayOutput `pulumi:"remoteSubnets"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The negotiation status of Tunnel.
	Status pulumi.StringOutput `pulumi:"status"`
	// Tags.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
	TunnelOptionsSpecifications ConnectionTunnelOptionsSpecificationArrayOutput `pulumi:"tunnelOptionsSpecifications"`
	// The name of the IPsec-VPN connection.
	VpnConnectionName pulumi.StringOutput `pulumi:"vpnConnectionName"`
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringOutput `pulumi:"vpnGatewayId"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LocalSubnets == nil {
		return nil, errors.New("invalid value for required argument 'LocalSubnets'")
	}
	if args.RemoteSubnets == nil {
		return nil, errors.New("invalid value for required argument 'RemoteSubnets'")
	}
	if args.VpnGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'VpnGatewayId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("alicloud:vpn/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("alicloud:vpn/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Whether to configure routing automatically. Value:
	// - **true**: Automatically configure routes.
	// - **false**: does not automatically configure routes.
	AutoConfigRoute *bool `pulumi:"autoConfigRoute"`
	// vpnBgp configuration. See `bgpConfig` below.
	BgpConfig *ConnectionBgpConfig `pulumi:"bgpConfig"`
	// The time when the IPsec-VPN connection was created.
	CreateTime *int `pulumi:"createTime"`
	// The ID of the customer gateway.
	CustomerGatewayId *string `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// Wether enable Dpd detection.
	EnableDpd *bool `pulumi:"enableDpd"`
	// enable nat traversal.
	EnableNatTraversal *bool `pulumi:"enableNatTraversal"`
	// Enable tunnel bgp.
	EnableTunnelsBgp *bool `pulumi:"enableTunnelsBgp"`
	// Health Check information. See `healthCheckConfig` below.
	HealthCheckConfig *ConnectionHealthCheckConfig `pulumi:"healthCheckConfig"`
	// The configuration of Phase 1 negotiations. See `ikeConfig` below.
	IkeConfig *ConnectionIkeConfig `pulumi:"ikeConfig"`
	// IPsec configuration. See `ipsecConfig` below.
	IpsecConfig *ConnectionIpsecConfig `pulumi:"ipsecConfig"`
	// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
	LocalSubnets []string `pulumi:"localSubnets"`
	// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
	Name *string `pulumi:"name"`
	// The network type of the IPsec connection. Value:
	// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
	// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
	NetworkType *string `pulumi:"networkType"`
	// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
	RemoteSubnets []string `pulumi:"remoteSubnets"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The negotiation status of Tunnel.
	Status *string `pulumi:"status"`
	// Tags.
	Tags map[string]string `pulumi:"tags"`
	// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
	TunnelOptionsSpecifications []ConnectionTunnelOptionsSpecification `pulumi:"tunnelOptionsSpecifications"`
	// The name of the IPsec-VPN connection.
	VpnConnectionName *string `pulumi:"vpnConnectionName"`
	// The ID of the VPN gateway.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

type ConnectionState struct {
	// Whether to configure routing automatically. Value:
	// - **true**: Automatically configure routes.
	// - **false**: does not automatically configure routes.
	AutoConfigRoute pulumi.BoolPtrInput
	// vpnBgp configuration. See `bgpConfig` below.
	BgpConfig ConnectionBgpConfigPtrInput
	// The time when the IPsec-VPN connection was created.
	CreateTime pulumi.IntPtrInput
	// The ID of the customer gateway.
	CustomerGatewayId pulumi.StringPtrInput
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrInput
	// Wether enable Dpd detection.
	EnableDpd pulumi.BoolPtrInput
	// enable nat traversal.
	EnableNatTraversal pulumi.BoolPtrInput
	// Enable tunnel bgp.
	EnableTunnelsBgp pulumi.BoolPtrInput
	// Health Check information. See `healthCheckConfig` below.
	HealthCheckConfig ConnectionHealthCheckConfigPtrInput
	// The configuration of Phase 1 negotiations. See `ikeConfig` below.
	IkeConfig ConnectionIkeConfigPtrInput
	// IPsec configuration. See `ipsecConfig` below.
	IpsecConfig ConnectionIpsecConfigPtrInput
	// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
	LocalSubnets pulumi.StringArrayInput
	// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
	Name pulumi.StringPtrInput
	// The network type of the IPsec connection. Value:
	// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
	// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
	NetworkType pulumi.StringPtrInput
	// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
	RemoteSubnets pulumi.StringArrayInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The negotiation status of Tunnel.
	Status pulumi.StringPtrInput
	// Tags.
	Tags pulumi.StringMapInput
	// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
	TunnelOptionsSpecifications ConnectionTunnelOptionsSpecificationArrayInput
	// The name of the IPsec-VPN connection.
	VpnConnectionName pulumi.StringPtrInput
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Whether to configure routing automatically. Value:
	// - **true**: Automatically configure routes.
	// - **false**: does not automatically configure routes.
	AutoConfigRoute *bool `pulumi:"autoConfigRoute"`
	// vpnBgp configuration. See `bgpConfig` below.
	BgpConfig *ConnectionBgpConfig `pulumi:"bgpConfig"`
	// The ID of the customer gateway.
	CustomerGatewayId *string `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// Wether enable Dpd detection.
	EnableDpd *bool `pulumi:"enableDpd"`
	// enable nat traversal.
	EnableNatTraversal *bool `pulumi:"enableNatTraversal"`
	// Enable tunnel bgp.
	EnableTunnelsBgp *bool `pulumi:"enableTunnelsBgp"`
	// Health Check information. See `healthCheckConfig` below.
	HealthCheckConfig *ConnectionHealthCheckConfig `pulumi:"healthCheckConfig"`
	// The configuration of Phase 1 negotiations. See `ikeConfig` below.
	IkeConfig *ConnectionIkeConfig `pulumi:"ikeConfig"`
	// IPsec configuration. See `ipsecConfig` below.
	IpsecConfig *ConnectionIpsecConfig `pulumi:"ipsecConfig"`
	// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
	LocalSubnets []string `pulumi:"localSubnets"`
	// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
	Name *string `pulumi:"name"`
	// The network type of the IPsec connection. Value:
	// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
	// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
	NetworkType *string `pulumi:"networkType"`
	// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
	RemoteSubnets []string `pulumi:"remoteSubnets"`
	// Tags.
	Tags map[string]string `pulumi:"tags"`
	// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
	TunnelOptionsSpecifications []ConnectionTunnelOptionsSpecification `pulumi:"tunnelOptionsSpecifications"`
	// The name of the IPsec-VPN connection.
	VpnConnectionName *string `pulumi:"vpnConnectionName"`
	// The ID of the VPN gateway.
	VpnGatewayId string `pulumi:"vpnGatewayId"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Whether to configure routing automatically. Value:
	// - **true**: Automatically configure routes.
	// - **false**: does not automatically configure routes.
	AutoConfigRoute pulumi.BoolPtrInput
	// vpnBgp configuration. See `bgpConfig` below.
	BgpConfig ConnectionBgpConfigPtrInput
	// The ID of the customer gateway.
	CustomerGatewayId pulumi.StringPtrInput
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrInput
	// Wether enable Dpd detection.
	EnableDpd pulumi.BoolPtrInput
	// enable nat traversal.
	EnableNatTraversal pulumi.BoolPtrInput
	// Enable tunnel bgp.
	EnableTunnelsBgp pulumi.BoolPtrInput
	// Health Check information. See `healthCheckConfig` below.
	HealthCheckConfig ConnectionHealthCheckConfigPtrInput
	// The configuration of Phase 1 negotiations. See `ikeConfig` below.
	IkeConfig ConnectionIkeConfigPtrInput
	// IPsec configuration. See `ipsecConfig` below.
	IpsecConfig ConnectionIpsecConfigPtrInput
	// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
	LocalSubnets pulumi.StringArrayInput
	// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
	Name pulumi.StringPtrInput
	// The network type of the IPsec connection. Value:
	// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
	// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
	NetworkType pulumi.StringPtrInput
	// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
	RemoteSubnets pulumi.StringArrayInput
	// Tags.
	Tags pulumi.StringMapInput
	// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
	TunnelOptionsSpecifications ConnectionTunnelOptionsSpecificationArrayInput
	// The name of the IPsec-VPN connection.
	VpnConnectionName pulumi.StringPtrInput
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// Whether to configure routing automatically. Value:
// - **true**: Automatically configure routes.
// - **false**: does not automatically configure routes.
func (o ConnectionOutput) AutoConfigRoute() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolPtrOutput { return v.AutoConfigRoute }).(pulumi.BoolPtrOutput)
}

// vpnBgp configuration. See `bgpConfig` below.
func (o ConnectionOutput) BgpConfig() ConnectionBgpConfigOutput {
	return o.ApplyT(func(v *Connection) ConnectionBgpConfigOutput { return v.BgpConfig }).(ConnectionBgpConfigOutput)
}

// The time when the IPsec-VPN connection was created.
func (o ConnectionOutput) CreateTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Connection) pulumi.IntOutput { return v.CreateTime }).(pulumi.IntOutput)
}

// The ID of the customer gateway.
func (o ConnectionOutput) CustomerGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.CustomerGatewayId }).(pulumi.StringPtrOutput)
}

// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
func (o ConnectionOutput) EffectImmediately() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolPtrOutput { return v.EffectImmediately }).(pulumi.BoolPtrOutput)
}

// Wether enable Dpd detection.
func (o ConnectionOutput) EnableDpd() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.EnableDpd }).(pulumi.BoolOutput)
}

// enable nat traversal.
func (o ConnectionOutput) EnableNatTraversal() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.EnableNatTraversal }).(pulumi.BoolOutput)
}

// Enable tunnel bgp.
func (o ConnectionOutput) EnableTunnelsBgp() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.EnableTunnelsBgp }).(pulumi.BoolOutput)
}

// Health Check information. See `healthCheckConfig` below.
func (o ConnectionOutput) HealthCheckConfig() ConnectionHealthCheckConfigOutput {
	return o.ApplyT(func(v *Connection) ConnectionHealthCheckConfigOutput { return v.HealthCheckConfig }).(ConnectionHealthCheckConfigOutput)
}

// The configuration of Phase 1 negotiations. See `ikeConfig` below.
func (o ConnectionOutput) IkeConfig() ConnectionIkeConfigOutput {
	return o.ApplyT(func(v *Connection) ConnectionIkeConfigOutput { return v.IkeConfig }).(ConnectionIkeConfigOutput)
}

// IPsec configuration. See `ipsecConfig` below.
func (o ConnectionOutput) IpsecConfig() ConnectionIpsecConfigOutput {
	return o.ApplyT(func(v *Connection) ConnectionIpsecConfigOutput { return v.IpsecConfig }).(ConnectionIpsecConfigOutput)
}

// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
func (o ConnectionOutput) LocalSubnets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringArrayOutput { return v.LocalSubnets }).(pulumi.StringArrayOutput)
}

// . Field 'name' has been deprecated from provider version 1.216.0. New field 'vpn_connection_name' instead.
//
// Deprecated: Field 'name' has been deprecated since provider version 1.216.0. New field 'vpn_connection_name' instead.
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The network type of the IPsec connection. Value:
// - **public**: public network, indicating that the IPsec connection establishes an encrypted communication channel through the public network.
// - **private**: private network, indicating that the IPsec connection establishes an encrypted communication channel through the private network.
func (o ConnectionOutput) NetworkType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.NetworkType }).(pulumi.StringPtrOutput)
}

// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
func (o ConnectionOutput) RemoteSubnets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringArrayOutput { return v.RemoteSubnets }).(pulumi.StringArrayOutput)
}

// The ID of the resource group.
func (o ConnectionOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The negotiation status of Tunnel.
func (o ConnectionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Tags.
func (o ConnectionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The tunnel options of IPsec. See `tunnelOptionsSpecification` below.
func (o ConnectionOutput) TunnelOptionsSpecifications() ConnectionTunnelOptionsSpecificationArrayOutput {
	return o.ApplyT(func(v *Connection) ConnectionTunnelOptionsSpecificationArrayOutput {
		return v.TunnelOptionsSpecifications
	}).(ConnectionTunnelOptionsSpecificationArrayOutput)
}

// The name of the IPsec-VPN connection.
func (o ConnectionOutput) VpnConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.VpnConnectionName }).(pulumi.StringOutput)
}

// The ID of the VPN gateway.
func (o ConnectionOutput) VpnGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.VpnGatewayId }).(pulumi.StringOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
