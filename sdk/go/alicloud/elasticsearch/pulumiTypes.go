// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticsearch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GetInstancesInstance struct {
	CreatedAt          string            `pulumi:"createdAt"`
	DataNodeAmount     int               `pulumi:"dataNodeAmount"`
	DataNodeDiskSize   int               `pulumi:"dataNodeDiskSize"`
	DataNodeDiskType   string            `pulumi:"dataNodeDiskType"`
	DataNodeSpec       string            `pulumi:"dataNodeSpec"`
	Description        string            `pulumi:"description"`
	Id                 string            `pulumi:"id"`
	InstanceChargeType string            `pulumi:"instanceChargeType"`
	Status             string            `pulumi:"status"`
	Tags               map[string]string `pulumi:"tags"`
	UpdatedAt          string            `pulumi:"updatedAt"`
	Version            string            `pulumi:"version"`
	VswitchId          string            `pulumi:"vswitchId"`
}

// GetInstancesInstanceInput is an input type that accepts GetInstancesInstanceArgs and GetInstancesInstanceOutput values.
// You can construct a concrete instance of `GetInstancesInstanceInput` via:
//
//	GetInstancesInstanceArgs{...}
type GetInstancesInstanceInput interface {
	pulumi.Input

	ToGetInstancesInstanceOutput() GetInstancesInstanceOutput
	ToGetInstancesInstanceOutputWithContext(context.Context) GetInstancesInstanceOutput
}

type GetInstancesInstanceArgs struct {
	CreatedAt          pulumi.StringInput    `pulumi:"createdAt"`
	DataNodeAmount     pulumi.IntInput       `pulumi:"dataNodeAmount"`
	DataNodeDiskSize   pulumi.IntInput       `pulumi:"dataNodeDiskSize"`
	DataNodeDiskType   pulumi.StringInput    `pulumi:"dataNodeDiskType"`
	DataNodeSpec       pulumi.StringInput    `pulumi:"dataNodeSpec"`
	Description        pulumi.StringInput    `pulumi:"description"`
	Id                 pulumi.StringInput    `pulumi:"id"`
	InstanceChargeType pulumi.StringInput    `pulumi:"instanceChargeType"`
	Status             pulumi.StringInput    `pulumi:"status"`
	Tags               pulumi.StringMapInput `pulumi:"tags"`
	UpdatedAt          pulumi.StringInput    `pulumi:"updatedAt"`
	Version            pulumi.StringInput    `pulumi:"version"`
	VswitchId          pulumi.StringInput    `pulumi:"vswitchId"`
}

func (GetInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return i.ToGetInstancesInstanceOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceOutput)
}

// GetInstancesInstanceArrayInput is an input type that accepts GetInstancesInstanceArray and GetInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceArrayInput` via:
//
//	GetInstancesInstanceArray{ GetInstancesInstanceArgs{...} }
type GetInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput
	ToGetInstancesInstanceArrayOutputWithContext(context.Context) GetInstancesInstanceArrayOutput
}

type GetInstancesInstanceArray []GetInstancesInstanceInput

func (GetInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return i.ToGetInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceArrayOutput)
}

type GetInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) DataNodeAmount() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.DataNodeAmount }).(pulumi.IntOutput)
}

func (o GetInstancesInstanceOutput) DataNodeDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstancesInstance) int { return v.DataNodeDiskSize }).(pulumi.IntOutput)
}

func (o GetInstancesInstanceOutput) DataNodeDiskType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.DataNodeDiskType }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) DataNodeSpec() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.DataNodeSpec }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) InstanceChargeType() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceChargeType }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Status }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetInstancesInstance) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o GetInstancesInstanceOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Version }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.VswitchId }).(pulumi.StringOutput)
}

type GetInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstance {
		return vs[0].([]GetInstancesInstance)[vs[1].(int)]
	}).(GetInstancesInstanceOutput)
}

type GetZonesZone struct {
	// ID of the zone.
	Id string `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds []string `pulumi:"multiZoneIds"`
}

// GetZonesZoneInput is an input type that accepts GetZonesZoneArgs and GetZonesZoneOutput values.
// You can construct a concrete instance of `GetZonesZoneInput` via:
//
//	GetZonesZoneArgs{...}
type GetZonesZoneInput interface {
	pulumi.Input

	ToGetZonesZoneOutput() GetZonesZoneOutput
	ToGetZonesZoneOutputWithContext(context.Context) GetZonesZoneOutput
}

type GetZonesZoneArgs struct {
	// ID of the zone.
	Id pulumi.StringInput `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds pulumi.StringArrayInput `pulumi:"multiZoneIds"`
}

func (GetZonesZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return i.ToGetZonesZoneOutputWithContext(context.Background())
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneOutput)
}

// GetZonesZoneArrayInput is an input type that accepts GetZonesZoneArray and GetZonesZoneArrayOutput values.
// You can construct a concrete instance of `GetZonesZoneArrayInput` via:
//
//	GetZonesZoneArray{ GetZonesZoneArgs{...} }
type GetZonesZoneArrayInput interface {
	pulumi.Input

	ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput
	ToGetZonesZoneArrayOutputWithContext(context.Context) GetZonesZoneArrayOutput
}

type GetZonesZoneArray []GetZonesZoneInput

func (GetZonesZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return i.ToGetZonesZoneArrayOutputWithContext(context.Background())
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneArrayOutput)
}

type GetZonesZoneOutput struct{ *pulumi.OutputState }

func (GetZonesZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return o
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return o
}

// ID of the zone.
func (o GetZonesZoneOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Id }).(pulumi.StringOutput)
}

// A list of zone ids in which the multi zone.
func (o GetZonesZoneOutput) MultiZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.MultiZoneIds }).(pulumi.StringArrayOutput)
}

type GetZonesZoneArrayOutput struct{ *pulumi.OutputState }

func (GetZonesZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) Index(i pulumi.IntInput) GetZonesZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZonesZone {
		return vs[0].([]GetZonesZone)[vs[1].(int)]
	}).(GetZonesZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceInput)(nil)).Elem(), GetInstancesInstanceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetInstancesInstanceArrayInput)(nil)).Elem(), GetInstancesInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetZonesZoneInput)(nil)).Elem(), GetZonesZoneArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetZonesZoneArrayInput)(nil)).Elem(), GetZonesZoneArray{})
	pulumi.RegisterOutputType(GetInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneOutput{})
	pulumi.RegisterOutputType(GetZonesZoneArrayOutput{})
}
