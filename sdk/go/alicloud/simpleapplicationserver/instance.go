// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package simpleapplicationserver

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Simple Application Server Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:simpleapplicationserver/instance:Instance example <id>
// ```
type Instance struct {
	pulumi.CustomResourceState

	// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
	DataDiskSize pulumi.IntPtrOutput `pulumi:"dataDiskSize"`
	// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
	ImageId pulumi.StringOutput `pulumi:"imageId"`
	// The name of the simple application server.
	InstanceName pulumi.StringPtrOutput `pulumi:"instanceName"`
	// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The paymen type of the resource. Valid values: `Subscription`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
	Period pulumi.IntOutput `pulumi:"period"`
	// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
	PlanId pulumi.StringOutput `pulumi:"planId"`
	// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImageId == nil {
		return nil, errors.New("invalid value for required argument 'ImageId'")
	}
	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.PlanId == nil {
		return nil, errors.New("invalid value for required argument 'PlanId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("alicloud:simpleapplicationserver/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:simpleapplicationserver/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
	DataDiskSize *int `pulumi:"dataDiskSize"`
	// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
	ImageId *string `pulumi:"imageId"`
	// The name of the simple application server.
	InstanceName *string `pulumi:"instanceName"`
	// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
	Password *string `pulumi:"password"`
	// The paymen type of the resource. Valid values: `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
	Period *int `pulumi:"period"`
	// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
	PlanId *string `pulumi:"planId"`
	// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
	Status *string `pulumi:"status"`
}

type InstanceState struct {
	// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
	AutoRenew pulumi.BoolPtrInput
	// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
	AutoRenewPeriod pulumi.IntPtrInput
	// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
	DataDiskSize pulumi.IntPtrInput
	// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
	ImageId pulumi.StringPtrInput
	// The name of the simple application server.
	InstanceName pulumi.StringPtrInput
	// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
	Password pulumi.StringPtrInput
	// The paymen type of the resource. Valid values: `Subscription`.
	PaymentType pulumi.StringPtrInput
	// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
	Period pulumi.IntPtrInput
	// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
	PlanId pulumi.StringPtrInput
	// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
	Status pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
	DataDiskSize *int `pulumi:"dataDiskSize"`
	// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
	ImageId string `pulumi:"imageId"`
	// The name of the simple application server.
	InstanceName *string `pulumi:"instanceName"`
	// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
	Password *string `pulumi:"password"`
	// The paymen type of the resource. Valid values: `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
	Period int `pulumi:"period"`
	// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
	PlanId string `pulumi:"planId"`
	// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
	AutoRenew pulumi.BoolPtrInput
	// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
	AutoRenewPeriod pulumi.IntPtrInput
	// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
	DataDiskSize pulumi.IntPtrInput
	// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
	ImageId pulumi.StringInput
	// The name of the simple application server.
	InstanceName pulumi.StringPtrInput
	// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
	Password pulumi.StringPtrInput
	// The paymen type of the resource. Valid values: `Subscription`.
	PaymentType pulumi.StringPtrInput
	// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
	Period pulumi.IntInput
	// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
	PlanId pulumi.StringInput
	// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
	Status pulumi.StringPtrInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// Specifies whether to enable auto-renewal. Unit: months. Valid values: `true` and `false`.
func (o InstanceOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// The auto renew period. Valid values: `1`,`3`, `6`, `12`, `24`, `36`. **NOTE:** The attribute `autoRenew` is valid when the attribute is `true`.
func (o InstanceOutput) AutoRenewPeriod() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.AutoRenewPeriod }).(pulumi.IntPtrOutput)
}

// The size of the data disk. Unit: GB. Valid values: `0` to `16380`.
func (o InstanceOutput) DataDiskSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntPtrOutput { return v.DataDiskSize }).(pulumi.IntPtrOutput)
}

// The ID of the image.  You can use the `simpleapplicationserver.getImages` to query the available images in the specified region. The value must be an integral multiple of 20.
func (o InstanceOutput) ImageId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.ImageId }).(pulumi.StringOutput)
}

// The name of the simple application server.
func (o InstanceOutput) InstanceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.InstanceName }).(pulumi.StringPtrOutput)
}

// The password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`.
func (o InstanceOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The paymen type of the resource. Valid values: `Subscription`.
func (o InstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The period. Unit: months. Valid values: `1`,`3`, `6`, `12`, `24`, `36`.
func (o InstanceOutput) Period() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.Period }).(pulumi.IntOutput)
}

// The ID of the plan. You can use the `simpleapplicationserver.getServerPlans`  to query all the plans provided by Simple Application Server in the specified region.
func (o InstanceOutput) PlanId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PlanId }).(pulumi.StringOutput)
}

// The status of the simple application server. Valid values: `Resetting`, `Running`, `Stopped`.
func (o InstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
