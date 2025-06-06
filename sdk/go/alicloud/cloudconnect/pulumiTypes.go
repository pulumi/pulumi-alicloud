// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GetNetworksNetwork struct {
	// CidrBlock of the CCN instance.
	CidrBlock   string `pulumi:"cidrBlock"`
	Description string `pulumi:"description"`
	// ID of the CCN instance.
	Id string `pulumi:"id"`
	// IsDefault of the CCN instance.
	IsDefault bool `pulumi:"isDefault"`
	// Name of the CCN instance.
	Name string `pulumi:"name"`
}

// GetNetworksNetworkInput is an input type that accepts GetNetworksNetworkArgs and GetNetworksNetworkOutput values.
// You can construct a concrete instance of `GetNetworksNetworkInput` via:
//
//	GetNetworksNetworkArgs{...}
type GetNetworksNetworkInput interface {
	pulumi.Input

	ToGetNetworksNetworkOutput() GetNetworksNetworkOutput
	ToGetNetworksNetworkOutputWithContext(context.Context) GetNetworksNetworkOutput
}

type GetNetworksNetworkArgs struct {
	// CidrBlock of the CCN instance.
	CidrBlock   pulumi.StringInput `pulumi:"cidrBlock"`
	Description pulumi.StringInput `pulumi:"description"`
	// ID of the CCN instance.
	Id pulumi.StringInput `pulumi:"id"`
	// IsDefault of the CCN instance.
	IsDefault pulumi.BoolInput `pulumi:"isDefault"`
	// Name of the CCN instance.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetNetworksNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksNetwork)(nil)).Elem()
}

func (i GetNetworksNetworkArgs) ToGetNetworksNetworkOutput() GetNetworksNetworkOutput {
	return i.ToGetNetworksNetworkOutputWithContext(context.Background())
}

func (i GetNetworksNetworkArgs) ToGetNetworksNetworkOutputWithContext(ctx context.Context) GetNetworksNetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetNetworksNetworkOutput)
}

// GetNetworksNetworkArrayInput is an input type that accepts GetNetworksNetworkArray and GetNetworksNetworkArrayOutput values.
// You can construct a concrete instance of `GetNetworksNetworkArrayInput` via:
//
//	GetNetworksNetworkArray{ GetNetworksNetworkArgs{...} }
type GetNetworksNetworkArrayInput interface {
	pulumi.Input

	ToGetNetworksNetworkArrayOutput() GetNetworksNetworkArrayOutput
	ToGetNetworksNetworkArrayOutputWithContext(context.Context) GetNetworksNetworkArrayOutput
}

type GetNetworksNetworkArray []GetNetworksNetworkInput

func (GetNetworksNetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetNetworksNetwork)(nil)).Elem()
}

func (i GetNetworksNetworkArray) ToGetNetworksNetworkArrayOutput() GetNetworksNetworkArrayOutput {
	return i.ToGetNetworksNetworkArrayOutputWithContext(context.Background())
}

func (i GetNetworksNetworkArray) ToGetNetworksNetworkArrayOutputWithContext(ctx context.Context) GetNetworksNetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetNetworksNetworkArrayOutput)
}

type GetNetworksNetworkOutput struct{ *pulumi.OutputState }

func (GetNetworksNetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksNetwork)(nil)).Elem()
}

func (o GetNetworksNetworkOutput) ToGetNetworksNetworkOutput() GetNetworksNetworkOutput {
	return o
}

func (o GetNetworksNetworkOutput) ToGetNetworksNetworkOutputWithContext(ctx context.Context) GetNetworksNetworkOutput {
	return o
}

// CidrBlock of the CCN instance.
func (o GetNetworksNetworkOutput) CidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksNetwork) string { return v.CidrBlock }).(pulumi.StringOutput)
}

func (o GetNetworksNetworkOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksNetwork) string { return v.Description }).(pulumi.StringOutput)
}

// ID of the CCN instance.
func (o GetNetworksNetworkOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksNetwork) string { return v.Id }).(pulumi.StringOutput)
}

// IsDefault of the CCN instance.
func (o GetNetworksNetworkOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v GetNetworksNetwork) bool { return v.IsDefault }).(pulumi.BoolOutput)
}

// Name of the CCN instance.
func (o GetNetworksNetworkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksNetwork) string { return v.Name }).(pulumi.StringOutput)
}

type GetNetworksNetworkArrayOutput struct{ *pulumi.OutputState }

func (GetNetworksNetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetNetworksNetwork)(nil)).Elem()
}

func (o GetNetworksNetworkArrayOutput) ToGetNetworksNetworkArrayOutput() GetNetworksNetworkArrayOutput {
	return o
}

func (o GetNetworksNetworkArrayOutput) ToGetNetworksNetworkArrayOutputWithContext(ctx context.Context) GetNetworksNetworkArrayOutput {
	return o
}

func (o GetNetworksNetworkArrayOutput) Index(i pulumi.IntInput) GetNetworksNetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetNetworksNetwork {
		return vs[0].([]GetNetworksNetwork)[vs[1].(int)]
	}).(GetNetworksNetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetNetworksNetworkInput)(nil)).Elem(), GetNetworksNetworkArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetNetworksNetworkArrayInput)(nil)).Elem(), GetNetworksNetworkArray{})
	pulumi.RegisterOutputType(GetNetworksNetworkOutput{})
	pulumi.RegisterOutputType(GetNetworksNetworkArrayOutput{})
}
