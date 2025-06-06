// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apig

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// APIG Gateway can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:apig/gateway:Gateway example <id>
// ```
type Gateway struct {
	pulumi.CustomResourceState

	// The creation timestamp. Unit: milliseconds.
	CreateTime pulumi.IntOutput `pulumi:"createTime"`
	// The name of the resource
	GatewayName pulumi.StringPtrOutput `pulumi:"gatewayName"`
	// Log Configuration See `logConfig` below.
	LogConfig GatewayLogConfigPtrOutput `pulumi:"logConfig"`
	// Network Access Configuration See `networkAccessConfig` below.
	NetworkAccessConfig GatewayNetworkAccessConfigPtrOutput `pulumi:"networkAccessConfig"`
	// The payment type of the resource
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// Gateway instance specifications
	Spec pulumi.StringPtrOutput `pulumi:"spec"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The VPC associated with the Gateway. See `vpc` below.
	Vpc GatewayVpcPtrOutput `pulumi:"vpc"`
	// The virtual switch associated with the Gateway. See `vswitch` below.
	Vswitch GatewayVswitchPtrOutput `pulumi:"vswitch"`
	// Availability Zone Configuration See `zoneConfig` below.
	ZoneConfig GatewayZoneConfigOutput `pulumi:"zoneConfig"`
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOption) (*Gateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	if args.ZoneConfig == nil {
		return nil, errors.New("invalid value for required argument 'ZoneConfig'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Gateway
	err := ctx.RegisterResource("alicloud:apig/gateway:Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayState, opts ...pulumi.ResourceOption) (*Gateway, error) {
	var resource Gateway
	err := ctx.ReadResource("alicloud:apig/gateway:Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gateway resources.
type gatewayState struct {
	// The creation timestamp. Unit: milliseconds.
	CreateTime *int `pulumi:"createTime"`
	// The name of the resource
	GatewayName *string `pulumi:"gatewayName"`
	// Log Configuration See `logConfig` below.
	LogConfig *GatewayLogConfig `pulumi:"logConfig"`
	// Network Access Configuration See `networkAccessConfig` below.
	NetworkAccessConfig *GatewayNetworkAccessConfig `pulumi:"networkAccessConfig"`
	// The payment type of the resource
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Gateway instance specifications
	Spec *string `pulumi:"spec"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// The tag of the resource
	Tags map[string]string `pulumi:"tags"`
	// The VPC associated with the Gateway. See `vpc` below.
	Vpc *GatewayVpc `pulumi:"vpc"`
	// The virtual switch associated with the Gateway. See `vswitch` below.
	Vswitch *GatewayVswitch `pulumi:"vswitch"`
	// Availability Zone Configuration See `zoneConfig` below.
	ZoneConfig *GatewayZoneConfig `pulumi:"zoneConfig"`
}

type GatewayState struct {
	// The creation timestamp. Unit: milliseconds.
	CreateTime pulumi.IntPtrInput
	// The name of the resource
	GatewayName pulumi.StringPtrInput
	// Log Configuration See `logConfig` below.
	LogConfig GatewayLogConfigPtrInput
	// Network Access Configuration See `networkAccessConfig` below.
	NetworkAccessConfig GatewayNetworkAccessConfigPtrInput
	// The payment type of the resource
	PaymentType pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// Gateway instance specifications
	Spec pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// The tag of the resource
	Tags pulumi.StringMapInput
	// The VPC associated with the Gateway. See `vpc` below.
	Vpc GatewayVpcPtrInput
	// The virtual switch associated with the Gateway. See `vswitch` below.
	Vswitch GatewayVswitchPtrInput
	// Availability Zone Configuration See `zoneConfig` below.
	ZoneConfig GatewayZoneConfigPtrInput
}

func (GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayState)(nil)).Elem()
}

type gatewayArgs struct {
	// The name of the resource
	GatewayName *string `pulumi:"gatewayName"`
	// Log Configuration See `logConfig` below.
	LogConfig *GatewayLogConfig `pulumi:"logConfig"`
	// Network Access Configuration See `networkAccessConfig` below.
	NetworkAccessConfig *GatewayNetworkAccessConfig `pulumi:"networkAccessConfig"`
	// The payment type of the resource
	PaymentType string `pulumi:"paymentType"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Gateway instance specifications
	Spec *string `pulumi:"spec"`
	// The tag of the resource
	Tags map[string]string `pulumi:"tags"`
	// The VPC associated with the Gateway. See `vpc` below.
	Vpc *GatewayVpc `pulumi:"vpc"`
	// The virtual switch associated with the Gateway. See `vswitch` below.
	Vswitch *GatewayVswitch `pulumi:"vswitch"`
	// Availability Zone Configuration See `zoneConfig` below.
	ZoneConfig GatewayZoneConfig `pulumi:"zoneConfig"`
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// The name of the resource
	GatewayName pulumi.StringPtrInput
	// Log Configuration See `logConfig` below.
	LogConfig GatewayLogConfigPtrInput
	// Network Access Configuration See `networkAccessConfig` below.
	NetworkAccessConfig GatewayNetworkAccessConfigPtrInput
	// The payment type of the resource
	PaymentType pulumi.StringInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// Gateway instance specifications
	Spec pulumi.StringPtrInput
	// The tag of the resource
	Tags pulumi.StringMapInput
	// The VPC associated with the Gateway. See `vpc` below.
	Vpc GatewayVpcPtrInput
	// The virtual switch associated with the Gateway. See `vswitch` below.
	Vswitch GatewayVswitchPtrInput
	// Availability Zone Configuration See `zoneConfig` below.
	ZoneConfig GatewayZoneConfigInput
}

func (GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayArgs)(nil)).Elem()
}

type GatewayInput interface {
	pulumi.Input

	ToGatewayOutput() GatewayOutput
	ToGatewayOutputWithContext(ctx context.Context) GatewayOutput
}

func (*Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (i *Gateway) ToGatewayOutput() GatewayOutput {
	return i.ToGatewayOutputWithContext(context.Background())
}

func (i *Gateway) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayOutput)
}

// GatewayArrayInput is an input type that accepts GatewayArray and GatewayArrayOutput values.
// You can construct a concrete instance of `GatewayArrayInput` via:
//
//	GatewayArray{ GatewayArgs{...} }
type GatewayArrayInput interface {
	pulumi.Input

	ToGatewayArrayOutput() GatewayArrayOutput
	ToGatewayArrayOutputWithContext(context.Context) GatewayArrayOutput
}

type GatewayArray []GatewayInput

func (GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (i GatewayArray) ToGatewayArrayOutput() GatewayArrayOutput {
	return i.ToGatewayArrayOutputWithContext(context.Background())
}

func (i GatewayArray) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayArrayOutput)
}

// GatewayMapInput is an input type that accepts GatewayMap and GatewayMapOutput values.
// You can construct a concrete instance of `GatewayMapInput` via:
//
//	GatewayMap{ "key": GatewayArgs{...} }
type GatewayMapInput interface {
	pulumi.Input

	ToGatewayMapOutput() GatewayMapOutput
	ToGatewayMapOutputWithContext(context.Context) GatewayMapOutput
}

type GatewayMap map[string]GatewayInput

func (GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (i GatewayMap) ToGatewayMapOutput() GatewayMapOutput {
	return i.ToGatewayMapOutputWithContext(context.Background())
}

func (i GatewayMap) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayMapOutput)
}

type GatewayOutput struct{ *pulumi.OutputState }

func (GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (o GatewayOutput) ToGatewayOutput() GatewayOutput {
	return o
}

func (o GatewayOutput) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return o
}

// The creation timestamp. Unit: milliseconds.
func (o GatewayOutput) CreateTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Gateway) pulumi.IntOutput { return v.CreateTime }).(pulumi.IntOutput)
}

// The name of the resource
func (o GatewayOutput) GatewayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.GatewayName }).(pulumi.StringPtrOutput)
}

// Log Configuration See `logConfig` below.
func (o GatewayOutput) LogConfig() GatewayLogConfigPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayLogConfigPtrOutput { return v.LogConfig }).(GatewayLogConfigPtrOutput)
}

// Network Access Configuration See `networkAccessConfig` below.
func (o GatewayOutput) NetworkAccessConfig() GatewayNetworkAccessConfigPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayNetworkAccessConfigPtrOutput { return v.NetworkAccessConfig }).(GatewayNetworkAccessConfigPtrOutput)
}

// The payment type of the resource
func (o GatewayOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The ID of the resource group
func (o GatewayOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Gateway instance specifications
func (o GatewayOutput) Spec() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.Spec }).(pulumi.StringPtrOutput)
}

// The status of the resource
func (o GatewayOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource
func (o GatewayOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The VPC associated with the Gateway. See `vpc` below.
func (o GatewayOutput) Vpc() GatewayVpcPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayVpcPtrOutput { return v.Vpc }).(GatewayVpcPtrOutput)
}

// The virtual switch associated with the Gateway. See `vswitch` below.
func (o GatewayOutput) Vswitch() GatewayVswitchPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayVswitchPtrOutput { return v.Vswitch }).(GatewayVswitchPtrOutput)
}

// Availability Zone Configuration See `zoneConfig` below.
func (o GatewayOutput) ZoneConfig() GatewayZoneConfigOutput {
	return o.ApplyT(func(v *Gateway) GatewayZoneConfigOutput { return v.ZoneConfig }).(GatewayZoneConfigOutput)
}

type GatewayArrayOutput struct{ *pulumi.OutputState }

func (GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (o GatewayArrayOutput) ToGatewayArrayOutput() GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) Index(i pulumi.IntInput) GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].([]*Gateway)[vs[1].(int)]
	}).(GatewayOutput)
}

type GatewayMapOutput struct{ *pulumi.OutputState }

func (GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (o GatewayMapOutput) ToGatewayMapOutput() GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) MapIndex(k pulumi.StringInput) GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].(map[string]*Gateway)[vs[1].(string)]
	}).(GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayInput)(nil)).Elem(), &Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayArrayInput)(nil)).Elem(), GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayMapInput)(nil)).Elem(), GatewayMap{})
	pulumi.RegisterOutputType(GatewayOutput{})
	pulumi.RegisterOutputType(GatewayArrayOutput{})
	pulumi.RegisterOutputType(GatewayMapOutput{})
}
