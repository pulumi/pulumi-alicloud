// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ens

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ENS Nat Gateway resource.
//
// Nat gateway of ENS.
//
// For information about ENS Nat Gateway and how to use it, see [What is Nat Gateway](https://next.api.alibabacloud.com/document/Ens/2017-11-10/CreateNatGateway).
//
// > **NOTE:** Available since v1.227.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ens"
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
//			ensRegionId := "cn-chenzhou-telecom_unicom_cmcc"
//			if param := cfg.Get("ensRegionId"); param != "" {
//				ensRegionId = param
//			}
//			defaultObbrL7, err := ens.NewNetwork(ctx, "defaultObbrL7", &ens.NetworkArgs{
//				NetworkName: pulumi.String(name),
//				Description: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.0.0.0/8"),
//				EnsRegionId: pulumi.String(ensRegionId),
//			})
//			if err != nil {
//				return err
//			}
//			defaulteFw783, err := ens.NewVswitch(ctx, "defaulteFw783", &ens.VswitchArgs{
//				CidrBlock:   pulumi.String("10.0.8.0/24"),
//				VswitchName: pulumi.String(name),
//				EnsRegionId: defaultObbrL7.EnsRegionId,
//				NetworkId:   defaultObbrL7.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ens.NewNatGateway(ctx, "default", &ens.NatGatewayArgs{
//				VswitchId:    defaulteFw783.ID(),
//				EnsRegionId:  defaulteFw783.EnsRegionId,
//				NetworkId:    defaulteFw783.NetworkId,
//				InstanceType: pulumi.String("enat.default"),
//				NatName:      pulumi.String(name),
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
// ENS Nat Gateway can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ens/natGateway:NatGateway example <id>
// ```
type NatGateway struct {
	pulumi.CustomResourceState

	// Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The ID of the ENS node.
	EnsRegionId pulumi.StringOutput `pulumi:"ensRegionId"`
	// NAT specifications. Value: `enat.default`.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
	NatName pulumi.StringPtrOutput `pulumi:"natName"`
	// The network ID.
	NetworkId pulumi.StringOutput `pulumi:"networkId"`
	// The vSwitch ID.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewNatGateway registers a new resource with the given unique name, arguments, and options.
func NewNatGateway(ctx *pulumi.Context,
	name string, args *NatGatewayArgs, opts ...pulumi.ResourceOption) (*NatGateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnsRegionId == nil {
		return nil, errors.New("invalid value for required argument 'EnsRegionId'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NatGateway
	err := ctx.RegisterResource("alicloud:ens/natGateway:NatGateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNatGateway gets an existing NatGateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNatGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NatGatewayState, opts ...pulumi.ResourceOption) (*NatGateway, error) {
	var resource NatGateway
	err := ctx.ReadResource("alicloud:ens/natGateway:NatGateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NatGateway resources.
type natGatewayState struct {
	// Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
	CreateTime *string `pulumi:"createTime"`
	// The ID of the ENS node.
	EnsRegionId *string `pulumi:"ensRegionId"`
	// NAT specifications. Value: `enat.default`.
	InstanceType *string `pulumi:"instanceType"`
	// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
	NatName *string `pulumi:"natName"`
	// The network ID.
	NetworkId *string `pulumi:"networkId"`
	// The vSwitch ID.
	VswitchId *string `pulumi:"vswitchId"`
}

type NatGatewayState struct {
	// Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
	CreateTime pulumi.StringPtrInput
	// The ID of the ENS node.
	EnsRegionId pulumi.StringPtrInput
	// NAT specifications. Value: `enat.default`.
	InstanceType pulumi.StringPtrInput
	// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
	NatName pulumi.StringPtrInput
	// The network ID.
	NetworkId pulumi.StringPtrInput
	// The vSwitch ID.
	VswitchId pulumi.StringPtrInput
}

func (NatGatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*natGatewayState)(nil)).Elem()
}

type natGatewayArgs struct {
	// The ID of the ENS node.
	EnsRegionId string `pulumi:"ensRegionId"`
	// NAT specifications. Value: `enat.default`.
	InstanceType *string `pulumi:"instanceType"`
	// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
	NatName *string `pulumi:"natName"`
	// The network ID.
	NetworkId string `pulumi:"networkId"`
	// The vSwitch ID.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a NatGateway resource.
type NatGatewayArgs struct {
	// The ID of the ENS node.
	EnsRegionId pulumi.StringInput
	// NAT specifications. Value: `enat.default`.
	InstanceType pulumi.StringPtrInput
	// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
	NatName pulumi.StringPtrInput
	// The network ID.
	NetworkId pulumi.StringInput
	// The vSwitch ID.
	VswitchId pulumi.StringInput
}

func (NatGatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*natGatewayArgs)(nil)).Elem()
}

type NatGatewayInput interface {
	pulumi.Input

	ToNatGatewayOutput() NatGatewayOutput
	ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput
}

func (*NatGateway) ElementType() reflect.Type {
	return reflect.TypeOf((**NatGateway)(nil)).Elem()
}

func (i *NatGateway) ToNatGatewayOutput() NatGatewayOutput {
	return i.ToNatGatewayOutputWithContext(context.Background())
}

func (i *NatGateway) ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayOutput)
}

// NatGatewayArrayInput is an input type that accepts NatGatewayArray and NatGatewayArrayOutput values.
// You can construct a concrete instance of `NatGatewayArrayInput` via:
//
//	NatGatewayArray{ NatGatewayArgs{...} }
type NatGatewayArrayInput interface {
	pulumi.Input

	ToNatGatewayArrayOutput() NatGatewayArrayOutput
	ToNatGatewayArrayOutputWithContext(context.Context) NatGatewayArrayOutput
}

type NatGatewayArray []NatGatewayInput

func (NatGatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatGateway)(nil)).Elem()
}

func (i NatGatewayArray) ToNatGatewayArrayOutput() NatGatewayArrayOutput {
	return i.ToNatGatewayArrayOutputWithContext(context.Background())
}

func (i NatGatewayArray) ToNatGatewayArrayOutputWithContext(ctx context.Context) NatGatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayArrayOutput)
}

// NatGatewayMapInput is an input type that accepts NatGatewayMap and NatGatewayMapOutput values.
// You can construct a concrete instance of `NatGatewayMapInput` via:
//
//	NatGatewayMap{ "key": NatGatewayArgs{...} }
type NatGatewayMapInput interface {
	pulumi.Input

	ToNatGatewayMapOutput() NatGatewayMapOutput
	ToNatGatewayMapOutputWithContext(context.Context) NatGatewayMapOutput
}

type NatGatewayMap map[string]NatGatewayInput

func (NatGatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatGateway)(nil)).Elem()
}

func (i NatGatewayMap) ToNatGatewayMapOutput() NatGatewayMapOutput {
	return i.ToNatGatewayMapOutputWithContext(context.Background())
}

func (i NatGatewayMap) ToNatGatewayMapOutputWithContext(ctx context.Context) NatGatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayMapOutput)
}

type NatGatewayOutput struct{ *pulumi.OutputState }

func (NatGatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NatGateway)(nil)).Elem()
}

func (o NatGatewayOutput) ToNatGatewayOutput() NatGatewayOutput {
	return o
}

func (o NatGatewayOutput) ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput {
	return o
}

// Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
func (o NatGatewayOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the ENS node.
func (o NatGatewayOutput) EnsRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.EnsRegionId }).(pulumi.StringOutput)
}

// NAT specifications. Value: `enat.default`.
func (o NatGatewayOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with 'http:// 'or 'https.
func (o NatGatewayOutput) NatName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringPtrOutput { return v.NatName }).(pulumi.StringPtrOutput)
}

// The network ID.
func (o NatGatewayOutput) NetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.NetworkId }).(pulumi.StringOutput)
}

// The vSwitch ID.
func (o NatGatewayOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type NatGatewayArrayOutput struct{ *pulumi.OutputState }

func (NatGatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatGateway)(nil)).Elem()
}

func (o NatGatewayArrayOutput) ToNatGatewayArrayOutput() NatGatewayArrayOutput {
	return o
}

func (o NatGatewayArrayOutput) ToNatGatewayArrayOutputWithContext(ctx context.Context) NatGatewayArrayOutput {
	return o
}

func (o NatGatewayArrayOutput) Index(i pulumi.IntInput) NatGatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NatGateway {
		return vs[0].([]*NatGateway)[vs[1].(int)]
	}).(NatGatewayOutput)
}

type NatGatewayMapOutput struct{ *pulumi.OutputState }

func (NatGatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatGateway)(nil)).Elem()
}

func (o NatGatewayMapOutput) ToNatGatewayMapOutput() NatGatewayMapOutput {
	return o
}

func (o NatGatewayMapOutput) ToNatGatewayMapOutputWithContext(ctx context.Context) NatGatewayMapOutput {
	return o
}

func (o NatGatewayMapOutput) MapIndex(k pulumi.StringInput) NatGatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NatGateway {
		return vs[0].(map[string]*NatGateway)[vs[1].(string)]
	}).(NatGatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayInput)(nil)).Elem(), &NatGateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayArrayInput)(nil)).Elem(), NatGatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayMapInput)(nil)).Elem(), NatGatewayMap{})
	pulumi.RegisterOutputType(NatGatewayOutput{})
	pulumi.RegisterOutputType(NatGatewayArrayOutput{})
	pulumi.RegisterOutputType(NatGatewayMapOutput{})
}
