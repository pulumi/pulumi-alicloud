// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a VPN Gateway Vpn Attachment resource.
//
// For information about VPN Gateway Vpn Attachment and how to use it, see [What is Vpn Attachment](https://www.alibabacloud.com/help/zh/virtual-private-cloud/latest/createvpnattachment).
//
// > **NOTE:** Available since v1.181.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := vpn.NewCustomerGateway(ctx, "default", &vpn.CustomerGatewayArgs{
//				CustomerGatewayName: pulumi.String(name),
//				IpAddress:           pulumi.String("42.104.22.210"),
//				Asn:                 pulumi.String("45014"),
//				Description:         pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpn.NewGatewayVpnAttachment(ctx, "default", &vpn.GatewayVpnAttachmentArgs{
//				CustomerGatewayId: _default.ID(),
//				NetworkType:       pulumi.String("public"),
//				LocalSubnet:       pulumi.String("0.0.0.0/0"),
//				RemoteSubnet:      pulumi.String("0.0.0.0/0"),
//				EffectImmediately: pulumi.Bool(false),
//				IkeConfig: &vpn.GatewayVpnAttachmentIkeConfigArgs{
//					IkeAuthAlg:  pulumi.String("md5"),
//					IkeEncAlg:   pulumi.String("des"),
//					IkeVersion:  pulumi.String("ikev2"),
//					IkeMode:     pulumi.String("main"),
//					IkeLifetime: pulumi.Int(86400),
//					Psk:         pulumi.String("tf-testvpn2"),
//					IkePfs:      pulumi.String("group1"),
//					RemoteId:    pulumi.String("testbob2"),
//					LocalId:     pulumi.String("testalice2"),
//				},
//				IpsecConfig: &vpn.GatewayVpnAttachmentIpsecConfigArgs{
//					IpsecPfs:      pulumi.String("group5"),
//					IpsecEncAlg:   pulumi.String("des"),
//					IpsecAuthAlg:  pulumi.String("md5"),
//					IpsecLifetime: pulumi.Int(86400),
//				},
//				BgpConfig: &vpn.GatewayVpnAttachmentBgpConfigArgs{
//					Enable:     pulumi.Bool(true),
//					LocalAsn:   pulumi.Int(45014),
//					TunnelCidr: pulumi.String("169.254.11.0/30"),
//					LocalBgpIp: pulumi.String("169.254.11.1"),
//				},
//				HealthCheckConfig: &vpn.GatewayVpnAttachmentHealthCheckConfigArgs{
//					Enable:   pulumi.Bool(true),
//					Sip:      pulumi.String("192.168.1.1"),
//					Dip:      pulumi.String("10.0.0.1"),
//					Interval: pulumi.Int(10),
//					Retry:    pulumi.Int(10),
//					Policy:   pulumi.String("revoke_route"),
//				},
//				EnableDpd:          pulumi.Bool(true),
//				EnableNatTraversal: pulumi.Bool(true),
//				VpnAttachmentName:  pulumi.String(name),
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
// VPN Gateway Vpn Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:vpn/gatewayVpnAttachment:GatewayVpnAttachment example <id>
// ```
type GatewayVpnAttachment struct {
	pulumi.CustomResourceState

	// Bgp configuration information. See `bgpConfig` below.
	BgpConfig GatewayVpnAttachmentBgpConfigOutput `pulumi:"bgpConfig"`
	// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
	CustomerGatewayId pulumi.StringOutput `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrOutput `pulumi:"effectImmediately"`
	// Whether to enable the DPD (peer survival detection) function.
	EnableDpd pulumi.BoolOutput `pulumi:"enableDpd"`
	// Allow NAT penetration.
	EnableNatTraversal pulumi.BoolOutput `pulumi:"enableNatTraversal"`
	// Health check configuration information. See `healthCheckConfig` below.
	HealthCheckConfig GatewayVpnAttachmentHealthCheckConfigOutput `pulumi:"healthCheckConfig"`
	// Configuration negotiated in the second stage. See `ikeConfig` below.
	IkeConfig GatewayVpnAttachmentIkeConfigOutput `pulumi:"ikeConfig"`
	// The VPN gateway IP.
	InternetIp pulumi.StringOutput `pulumi:"internetIp"`
	// Configuration negotiated in the second stage. See `ipsecConfig` below.
	IpsecConfig GatewayVpnAttachmentIpsecConfigOutput `pulumi:"ipsecConfig"`
	// The CIDR block of the virtual private cloud (VPC).
	LocalSubnet pulumi.StringOutput `pulumi:"localSubnet"`
	// The network type of the IPsec connection. Valid values: `public`, `private`.
	NetworkType pulumi.StringOutput `pulumi:"networkType"`
	// The CIDR block of the on-premises data center.
	RemoteSubnet pulumi.StringOutput `pulumi:"remoteSubnet"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the vpn attachment.
	VpnAttachmentName pulumi.StringPtrOutput `pulumi:"vpnAttachmentName"`
}

// NewGatewayVpnAttachment registers a new resource with the given unique name, arguments, and options.
func NewGatewayVpnAttachment(ctx *pulumi.Context,
	name string, args *GatewayVpnAttachmentArgs, opts ...pulumi.ResourceOption) (*GatewayVpnAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomerGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'CustomerGatewayId'")
	}
	if args.LocalSubnet == nil {
		return nil, errors.New("invalid value for required argument 'LocalSubnet'")
	}
	if args.RemoteSubnet == nil {
		return nil, errors.New("invalid value for required argument 'RemoteSubnet'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayVpnAttachment
	err := ctx.RegisterResource("alicloud:vpn/gatewayVpnAttachment:GatewayVpnAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayVpnAttachment gets an existing GatewayVpnAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayVpnAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayVpnAttachmentState, opts ...pulumi.ResourceOption) (*GatewayVpnAttachment, error) {
	var resource GatewayVpnAttachment
	err := ctx.ReadResource("alicloud:vpn/gatewayVpnAttachment:GatewayVpnAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayVpnAttachment resources.
type gatewayVpnAttachmentState struct {
	// Bgp configuration information. See `bgpConfig` below.
	BgpConfig *GatewayVpnAttachmentBgpConfig `pulumi:"bgpConfig"`
	// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
	CustomerGatewayId *string `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// Whether to enable the DPD (peer survival detection) function.
	EnableDpd *bool `pulumi:"enableDpd"`
	// Allow NAT penetration.
	EnableNatTraversal *bool `pulumi:"enableNatTraversal"`
	// Health check configuration information. See `healthCheckConfig` below.
	HealthCheckConfig *GatewayVpnAttachmentHealthCheckConfig `pulumi:"healthCheckConfig"`
	// Configuration negotiated in the second stage. See `ikeConfig` below.
	IkeConfig *GatewayVpnAttachmentIkeConfig `pulumi:"ikeConfig"`
	// The VPN gateway IP.
	InternetIp *string `pulumi:"internetIp"`
	// Configuration negotiated in the second stage. See `ipsecConfig` below.
	IpsecConfig *GatewayVpnAttachmentIpsecConfig `pulumi:"ipsecConfig"`
	// The CIDR block of the virtual private cloud (VPC).
	LocalSubnet *string `pulumi:"localSubnet"`
	// The network type of the IPsec connection. Valid values: `public`, `private`.
	NetworkType *string `pulumi:"networkType"`
	// The CIDR block of the on-premises data center.
	RemoteSubnet *string `pulumi:"remoteSubnet"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The name of the vpn attachment.
	VpnAttachmentName *string `pulumi:"vpnAttachmentName"`
}

type GatewayVpnAttachmentState struct {
	// Bgp configuration information. See `bgpConfig` below.
	BgpConfig GatewayVpnAttachmentBgpConfigPtrInput
	// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
	CustomerGatewayId pulumi.StringPtrInput
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrInput
	// Whether to enable the DPD (peer survival detection) function.
	EnableDpd pulumi.BoolPtrInput
	// Allow NAT penetration.
	EnableNatTraversal pulumi.BoolPtrInput
	// Health check configuration information. See `healthCheckConfig` below.
	HealthCheckConfig GatewayVpnAttachmentHealthCheckConfigPtrInput
	// Configuration negotiated in the second stage. See `ikeConfig` below.
	IkeConfig GatewayVpnAttachmentIkeConfigPtrInput
	// The VPN gateway IP.
	InternetIp pulumi.StringPtrInput
	// Configuration negotiated in the second stage. See `ipsecConfig` below.
	IpsecConfig GatewayVpnAttachmentIpsecConfigPtrInput
	// The CIDR block of the virtual private cloud (VPC).
	LocalSubnet pulumi.StringPtrInput
	// The network type of the IPsec connection. Valid values: `public`, `private`.
	NetworkType pulumi.StringPtrInput
	// The CIDR block of the on-premises data center.
	RemoteSubnet pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The name of the vpn attachment.
	VpnAttachmentName pulumi.StringPtrInput
}

func (GatewayVpnAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayVpnAttachmentState)(nil)).Elem()
}

type gatewayVpnAttachmentArgs struct {
	// Bgp configuration information. See `bgpConfig` below.
	BgpConfig *GatewayVpnAttachmentBgpConfig `pulumi:"bgpConfig"`
	// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
	CustomerGatewayId string `pulumi:"customerGatewayId"`
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// Whether to enable the DPD (peer survival detection) function.
	EnableDpd *bool `pulumi:"enableDpd"`
	// Allow NAT penetration.
	EnableNatTraversal *bool `pulumi:"enableNatTraversal"`
	// Health check configuration information. See `healthCheckConfig` below.
	HealthCheckConfig *GatewayVpnAttachmentHealthCheckConfig `pulumi:"healthCheckConfig"`
	// Configuration negotiated in the second stage. See `ikeConfig` below.
	IkeConfig *GatewayVpnAttachmentIkeConfig `pulumi:"ikeConfig"`
	// Configuration negotiated in the second stage. See `ipsecConfig` below.
	IpsecConfig *GatewayVpnAttachmentIpsecConfig `pulumi:"ipsecConfig"`
	// The CIDR block of the virtual private cloud (VPC).
	LocalSubnet string `pulumi:"localSubnet"`
	// The network type of the IPsec connection. Valid values: `public`, `private`.
	NetworkType *string `pulumi:"networkType"`
	// The CIDR block of the on-premises data center.
	RemoteSubnet string `pulumi:"remoteSubnet"`
	// The name of the vpn attachment.
	VpnAttachmentName *string `pulumi:"vpnAttachmentName"`
}

// The set of arguments for constructing a GatewayVpnAttachment resource.
type GatewayVpnAttachmentArgs struct {
	// Bgp configuration information. See `bgpConfig` below.
	BgpConfig GatewayVpnAttachmentBgpConfigPtrInput
	// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
	CustomerGatewayId pulumi.StringInput
	// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
	EffectImmediately pulumi.BoolPtrInput
	// Whether to enable the DPD (peer survival detection) function.
	EnableDpd pulumi.BoolPtrInput
	// Allow NAT penetration.
	EnableNatTraversal pulumi.BoolPtrInput
	// Health check configuration information. See `healthCheckConfig` below.
	HealthCheckConfig GatewayVpnAttachmentHealthCheckConfigPtrInput
	// Configuration negotiated in the second stage. See `ikeConfig` below.
	IkeConfig GatewayVpnAttachmentIkeConfigPtrInput
	// Configuration negotiated in the second stage. See `ipsecConfig` below.
	IpsecConfig GatewayVpnAttachmentIpsecConfigPtrInput
	// The CIDR block of the virtual private cloud (VPC).
	LocalSubnet pulumi.StringInput
	// The network type of the IPsec connection. Valid values: `public`, `private`.
	NetworkType pulumi.StringPtrInput
	// The CIDR block of the on-premises data center.
	RemoteSubnet pulumi.StringInput
	// The name of the vpn attachment.
	VpnAttachmentName pulumi.StringPtrInput
}

func (GatewayVpnAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayVpnAttachmentArgs)(nil)).Elem()
}

type GatewayVpnAttachmentInput interface {
	pulumi.Input

	ToGatewayVpnAttachmentOutput() GatewayVpnAttachmentOutput
	ToGatewayVpnAttachmentOutputWithContext(ctx context.Context) GatewayVpnAttachmentOutput
}

func (*GatewayVpnAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayVpnAttachment)(nil)).Elem()
}

func (i *GatewayVpnAttachment) ToGatewayVpnAttachmentOutput() GatewayVpnAttachmentOutput {
	return i.ToGatewayVpnAttachmentOutputWithContext(context.Background())
}

func (i *GatewayVpnAttachment) ToGatewayVpnAttachmentOutputWithContext(ctx context.Context) GatewayVpnAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayVpnAttachmentOutput)
}

// GatewayVpnAttachmentArrayInput is an input type that accepts GatewayVpnAttachmentArray and GatewayVpnAttachmentArrayOutput values.
// You can construct a concrete instance of `GatewayVpnAttachmentArrayInput` via:
//
//	GatewayVpnAttachmentArray{ GatewayVpnAttachmentArgs{...} }
type GatewayVpnAttachmentArrayInput interface {
	pulumi.Input

	ToGatewayVpnAttachmentArrayOutput() GatewayVpnAttachmentArrayOutput
	ToGatewayVpnAttachmentArrayOutputWithContext(context.Context) GatewayVpnAttachmentArrayOutput
}

type GatewayVpnAttachmentArray []GatewayVpnAttachmentInput

func (GatewayVpnAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayVpnAttachment)(nil)).Elem()
}

func (i GatewayVpnAttachmentArray) ToGatewayVpnAttachmentArrayOutput() GatewayVpnAttachmentArrayOutput {
	return i.ToGatewayVpnAttachmentArrayOutputWithContext(context.Background())
}

func (i GatewayVpnAttachmentArray) ToGatewayVpnAttachmentArrayOutputWithContext(ctx context.Context) GatewayVpnAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayVpnAttachmentArrayOutput)
}

// GatewayVpnAttachmentMapInput is an input type that accepts GatewayVpnAttachmentMap and GatewayVpnAttachmentMapOutput values.
// You can construct a concrete instance of `GatewayVpnAttachmentMapInput` via:
//
//	GatewayVpnAttachmentMap{ "key": GatewayVpnAttachmentArgs{...} }
type GatewayVpnAttachmentMapInput interface {
	pulumi.Input

	ToGatewayVpnAttachmentMapOutput() GatewayVpnAttachmentMapOutput
	ToGatewayVpnAttachmentMapOutputWithContext(context.Context) GatewayVpnAttachmentMapOutput
}

type GatewayVpnAttachmentMap map[string]GatewayVpnAttachmentInput

func (GatewayVpnAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayVpnAttachment)(nil)).Elem()
}

func (i GatewayVpnAttachmentMap) ToGatewayVpnAttachmentMapOutput() GatewayVpnAttachmentMapOutput {
	return i.ToGatewayVpnAttachmentMapOutputWithContext(context.Background())
}

func (i GatewayVpnAttachmentMap) ToGatewayVpnAttachmentMapOutputWithContext(ctx context.Context) GatewayVpnAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayVpnAttachmentMapOutput)
}

type GatewayVpnAttachmentOutput struct{ *pulumi.OutputState }

func (GatewayVpnAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayVpnAttachment)(nil)).Elem()
}

func (o GatewayVpnAttachmentOutput) ToGatewayVpnAttachmentOutput() GatewayVpnAttachmentOutput {
	return o
}

func (o GatewayVpnAttachmentOutput) ToGatewayVpnAttachmentOutputWithContext(ctx context.Context) GatewayVpnAttachmentOutput {
	return o
}

// Bgp configuration information. See `bgpConfig` below.
func (o GatewayVpnAttachmentOutput) BgpConfig() GatewayVpnAttachmentBgpConfigOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) GatewayVpnAttachmentBgpConfigOutput { return v.BgpConfig }).(GatewayVpnAttachmentBgpConfigOutput)
}

// The ID of the customer gateway. From version 1.196.0, `customerGatewayId` can be modified.
func (o GatewayVpnAttachmentOutput) CustomerGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.CustomerGatewayId }).(pulumi.StringOutput)
}

// Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
func (o GatewayVpnAttachmentOutput) EffectImmediately() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.BoolPtrOutput { return v.EffectImmediately }).(pulumi.BoolPtrOutput)
}

// Whether to enable the DPD (peer survival detection) function.
func (o GatewayVpnAttachmentOutput) EnableDpd() pulumi.BoolOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.BoolOutput { return v.EnableDpd }).(pulumi.BoolOutput)
}

// Allow NAT penetration.
func (o GatewayVpnAttachmentOutput) EnableNatTraversal() pulumi.BoolOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.BoolOutput { return v.EnableNatTraversal }).(pulumi.BoolOutput)
}

// Health check configuration information. See `healthCheckConfig` below.
func (o GatewayVpnAttachmentOutput) HealthCheckConfig() GatewayVpnAttachmentHealthCheckConfigOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) GatewayVpnAttachmentHealthCheckConfigOutput { return v.HealthCheckConfig }).(GatewayVpnAttachmentHealthCheckConfigOutput)
}

// Configuration negotiated in the second stage. See `ikeConfig` below.
func (o GatewayVpnAttachmentOutput) IkeConfig() GatewayVpnAttachmentIkeConfigOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) GatewayVpnAttachmentIkeConfigOutput { return v.IkeConfig }).(GatewayVpnAttachmentIkeConfigOutput)
}

// The VPN gateway IP.
func (o GatewayVpnAttachmentOutput) InternetIp() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.InternetIp }).(pulumi.StringOutput)
}

// Configuration negotiated in the second stage. See `ipsecConfig` below.
func (o GatewayVpnAttachmentOutput) IpsecConfig() GatewayVpnAttachmentIpsecConfigOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) GatewayVpnAttachmentIpsecConfigOutput { return v.IpsecConfig }).(GatewayVpnAttachmentIpsecConfigOutput)
}

// The CIDR block of the virtual private cloud (VPC).
func (o GatewayVpnAttachmentOutput) LocalSubnet() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.LocalSubnet }).(pulumi.StringOutput)
}

// The network type of the IPsec connection. Valid values: `public`, `private`.
func (o GatewayVpnAttachmentOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.NetworkType }).(pulumi.StringOutput)
}

// The CIDR block of the on-premises data center.
func (o GatewayVpnAttachmentOutput) RemoteSubnet() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.RemoteSubnet }).(pulumi.StringOutput)
}

// The status of the resource.
func (o GatewayVpnAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The name of the vpn attachment.
func (o GatewayVpnAttachmentOutput) VpnAttachmentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GatewayVpnAttachment) pulumi.StringPtrOutput { return v.VpnAttachmentName }).(pulumi.StringPtrOutput)
}

type GatewayVpnAttachmentArrayOutput struct{ *pulumi.OutputState }

func (GatewayVpnAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayVpnAttachment)(nil)).Elem()
}

func (o GatewayVpnAttachmentArrayOutput) ToGatewayVpnAttachmentArrayOutput() GatewayVpnAttachmentArrayOutput {
	return o
}

func (o GatewayVpnAttachmentArrayOutput) ToGatewayVpnAttachmentArrayOutputWithContext(ctx context.Context) GatewayVpnAttachmentArrayOutput {
	return o
}

func (o GatewayVpnAttachmentArrayOutput) Index(i pulumi.IntInput) GatewayVpnAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayVpnAttachment {
		return vs[0].([]*GatewayVpnAttachment)[vs[1].(int)]
	}).(GatewayVpnAttachmentOutput)
}

type GatewayVpnAttachmentMapOutput struct{ *pulumi.OutputState }

func (GatewayVpnAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayVpnAttachment)(nil)).Elem()
}

func (o GatewayVpnAttachmentMapOutput) ToGatewayVpnAttachmentMapOutput() GatewayVpnAttachmentMapOutput {
	return o
}

func (o GatewayVpnAttachmentMapOutput) ToGatewayVpnAttachmentMapOutputWithContext(ctx context.Context) GatewayVpnAttachmentMapOutput {
	return o
}

func (o GatewayVpnAttachmentMapOutput) MapIndex(k pulumi.StringInput) GatewayVpnAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayVpnAttachment {
		return vs[0].(map[string]*GatewayVpnAttachment)[vs[1].(string)]
	}).(GatewayVpnAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayVpnAttachmentInput)(nil)).Elem(), &GatewayVpnAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayVpnAttachmentArrayInput)(nil)).Elem(), GatewayVpnAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayVpnAttachmentMapInput)(nil)).Elem(), GatewayVpnAttachmentMap{})
	pulumi.RegisterOutputType(GatewayVpnAttachmentOutput{})
	pulumi.RegisterOutputType(GatewayVpnAttachmentArrayOutput{})
	pulumi.RegisterOutputType(GatewayVpnAttachmentMapOutput{})
}
