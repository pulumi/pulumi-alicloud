// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package esa

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ESA Rate Plan Instance can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:esa/ratePlanInstance:RatePlanInstance example <id>
// ```
type RatePlanInstance struct {
	pulumi.CustomResourceState

	// Whether to pay automatically.
	AutoPay pulumi.BoolPtrOutput `pulumi:"autoPay"`
	// Auto Renew:
	//
	// true: Automatic renewal.
	//
	// false: Do not renew automatically.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Acceleration area:
	//
	// domestic: Mainland China only.
	//
	// global: global.
	//
	// overseas: Global (excluding Mainland China).
	Coverage pulumi.StringPtrOutput `pulumi:"coverage"`
	// The new purchase time of the package instance.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Renewing: renewing
	InstanceStatus pulumi.StringOutput `pulumi:"instanceStatus"`
	// The payment type of the resource, Valid vales: Subscription.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// Purchase cycle (in months).
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The plan name, which is obtained from the DescribeRatePlanPrice interface.
	PlanName pulumi.StringPtrOutput `pulumi:"planName"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// Site access type:
	//
	// NS:NS access.
	//
	// CNAME:CNAME access.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewRatePlanInstance registers a new resource with the given unique name, arguments, and options.
func NewRatePlanInstance(ctx *pulumi.Context,
	name string, args *RatePlanInstanceArgs, opts ...pulumi.ResourceOption) (*RatePlanInstance, error) {
	if args == nil {
		args = &RatePlanInstanceArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RatePlanInstance
	err := ctx.RegisterResource("alicloud:esa/ratePlanInstance:RatePlanInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRatePlanInstance gets an existing RatePlanInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRatePlanInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RatePlanInstanceState, opts ...pulumi.ResourceOption) (*RatePlanInstance, error) {
	var resource RatePlanInstance
	err := ctx.ReadResource("alicloud:esa/ratePlanInstance:RatePlanInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RatePlanInstance resources.
type ratePlanInstanceState struct {
	// Whether to pay automatically.
	AutoPay *bool `pulumi:"autoPay"`
	// Auto Renew:
	//
	// true: Automatic renewal.
	//
	// false: Do not renew automatically.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Acceleration area:
	//
	// domestic: Mainland China only.
	//
	// global: global.
	//
	// overseas: Global (excluding Mainland China).
	Coverage *string `pulumi:"coverage"`
	// The new purchase time of the package instance.
	CreateTime *string `pulumi:"createTime"`
	// Renewing: renewing
	InstanceStatus *string `pulumi:"instanceStatus"`
	// The payment type of the resource, Valid vales: Subscription.
	PaymentType *string `pulumi:"paymentType"`
	// Purchase cycle (in months).
	Period *int `pulumi:"period"`
	// The plan name, which is obtained from the DescribeRatePlanPrice interface.
	PlanName *string `pulumi:"planName"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// Site access type:
	//
	// NS:NS access.
	//
	// CNAME:CNAME access.
	Type *string `pulumi:"type"`
}

type RatePlanInstanceState struct {
	// Whether to pay automatically.
	AutoPay pulumi.BoolPtrInput
	// Auto Renew:
	//
	// true: Automatic renewal.
	//
	// false: Do not renew automatically.
	AutoRenew pulumi.BoolPtrInput
	// Acceleration area:
	//
	// domestic: Mainland China only.
	//
	// global: global.
	//
	// overseas: Global (excluding Mainland China).
	Coverage pulumi.StringPtrInput
	// The new purchase time of the package instance.
	CreateTime pulumi.StringPtrInput
	// Renewing: renewing
	InstanceStatus pulumi.StringPtrInput
	// The payment type of the resource, Valid vales: Subscription.
	PaymentType pulumi.StringPtrInput
	// Purchase cycle (in months).
	Period pulumi.IntPtrInput
	// The plan name, which is obtained from the DescribeRatePlanPrice interface.
	PlanName pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// Site access type:
	//
	// NS:NS access.
	//
	// CNAME:CNAME access.
	Type pulumi.StringPtrInput
}

func (RatePlanInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*ratePlanInstanceState)(nil)).Elem()
}

type ratePlanInstanceArgs struct {
	// Whether to pay automatically.
	AutoPay *bool `pulumi:"autoPay"`
	// Auto Renew:
	//
	// true: Automatic renewal.
	//
	// false: Do not renew automatically.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Acceleration area:
	//
	// domestic: Mainland China only.
	//
	// global: global.
	//
	// overseas: Global (excluding Mainland China).
	Coverage *string `pulumi:"coverage"`
	// The payment type of the resource, Valid vales: Subscription.
	PaymentType *string `pulumi:"paymentType"`
	// Purchase cycle (in months).
	Period *int `pulumi:"period"`
	// The plan name, which is obtained from the DescribeRatePlanPrice interface.
	PlanName *string `pulumi:"planName"`
	// Site access type:
	//
	// NS:NS access.
	//
	// CNAME:CNAME access.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a RatePlanInstance resource.
type RatePlanInstanceArgs struct {
	// Whether to pay automatically.
	AutoPay pulumi.BoolPtrInput
	// Auto Renew:
	//
	// true: Automatic renewal.
	//
	// false: Do not renew automatically.
	AutoRenew pulumi.BoolPtrInput
	// Acceleration area:
	//
	// domestic: Mainland China only.
	//
	// global: global.
	//
	// overseas: Global (excluding Mainland China).
	Coverage pulumi.StringPtrInput
	// The payment type of the resource, Valid vales: Subscription.
	PaymentType pulumi.StringPtrInput
	// Purchase cycle (in months).
	Period pulumi.IntPtrInput
	// The plan name, which is obtained from the DescribeRatePlanPrice interface.
	PlanName pulumi.StringPtrInput
	// Site access type:
	//
	// NS:NS access.
	//
	// CNAME:CNAME access.
	Type pulumi.StringPtrInput
}

func (RatePlanInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ratePlanInstanceArgs)(nil)).Elem()
}

type RatePlanInstanceInput interface {
	pulumi.Input

	ToRatePlanInstanceOutput() RatePlanInstanceOutput
	ToRatePlanInstanceOutputWithContext(ctx context.Context) RatePlanInstanceOutput
}

func (*RatePlanInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**RatePlanInstance)(nil)).Elem()
}

func (i *RatePlanInstance) ToRatePlanInstanceOutput() RatePlanInstanceOutput {
	return i.ToRatePlanInstanceOutputWithContext(context.Background())
}

func (i *RatePlanInstance) ToRatePlanInstanceOutputWithContext(ctx context.Context) RatePlanInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RatePlanInstanceOutput)
}

// RatePlanInstanceArrayInput is an input type that accepts RatePlanInstanceArray and RatePlanInstanceArrayOutput values.
// You can construct a concrete instance of `RatePlanInstanceArrayInput` via:
//
//	RatePlanInstanceArray{ RatePlanInstanceArgs{...} }
type RatePlanInstanceArrayInput interface {
	pulumi.Input

	ToRatePlanInstanceArrayOutput() RatePlanInstanceArrayOutput
	ToRatePlanInstanceArrayOutputWithContext(context.Context) RatePlanInstanceArrayOutput
}

type RatePlanInstanceArray []RatePlanInstanceInput

func (RatePlanInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RatePlanInstance)(nil)).Elem()
}

func (i RatePlanInstanceArray) ToRatePlanInstanceArrayOutput() RatePlanInstanceArrayOutput {
	return i.ToRatePlanInstanceArrayOutputWithContext(context.Background())
}

func (i RatePlanInstanceArray) ToRatePlanInstanceArrayOutputWithContext(ctx context.Context) RatePlanInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RatePlanInstanceArrayOutput)
}

// RatePlanInstanceMapInput is an input type that accepts RatePlanInstanceMap and RatePlanInstanceMapOutput values.
// You can construct a concrete instance of `RatePlanInstanceMapInput` via:
//
//	RatePlanInstanceMap{ "key": RatePlanInstanceArgs{...} }
type RatePlanInstanceMapInput interface {
	pulumi.Input

	ToRatePlanInstanceMapOutput() RatePlanInstanceMapOutput
	ToRatePlanInstanceMapOutputWithContext(context.Context) RatePlanInstanceMapOutput
}

type RatePlanInstanceMap map[string]RatePlanInstanceInput

func (RatePlanInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RatePlanInstance)(nil)).Elem()
}

func (i RatePlanInstanceMap) ToRatePlanInstanceMapOutput() RatePlanInstanceMapOutput {
	return i.ToRatePlanInstanceMapOutputWithContext(context.Background())
}

func (i RatePlanInstanceMap) ToRatePlanInstanceMapOutputWithContext(ctx context.Context) RatePlanInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RatePlanInstanceMapOutput)
}

type RatePlanInstanceOutput struct{ *pulumi.OutputState }

func (RatePlanInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RatePlanInstance)(nil)).Elem()
}

func (o RatePlanInstanceOutput) ToRatePlanInstanceOutput() RatePlanInstanceOutput {
	return o
}

func (o RatePlanInstanceOutput) ToRatePlanInstanceOutputWithContext(ctx context.Context) RatePlanInstanceOutput {
	return o
}

// Whether to pay automatically.
func (o RatePlanInstanceOutput) AutoPay() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.BoolPtrOutput { return v.AutoPay }).(pulumi.BoolPtrOutput)
}

// Auto Renew:
//
// true: Automatic renewal.
//
// false: Do not renew automatically.
func (o RatePlanInstanceOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// Acceleration area:
//
// domestic: Mainland China only.
//
// global: global.
//
// overseas: Global (excluding Mainland China).
func (o RatePlanInstanceOutput) Coverage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringPtrOutput { return v.Coverage }).(pulumi.StringPtrOutput)
}

// The new purchase time of the package instance.
func (o RatePlanInstanceOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Renewing: renewing
func (o RatePlanInstanceOutput) InstanceStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringOutput { return v.InstanceStatus }).(pulumi.StringOutput)
}

// The payment type of the resource, Valid vales: Subscription.
func (o RatePlanInstanceOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// Purchase cycle (in months).
func (o RatePlanInstanceOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// The plan name, which is obtained from the DescribeRatePlanPrice interface.
func (o RatePlanInstanceOutput) PlanName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringPtrOutput { return v.PlanName }).(pulumi.StringPtrOutput)
}

// The status of the resource
func (o RatePlanInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Site access type:
//
// NS:NS access.
//
// CNAME:CNAME access.
func (o RatePlanInstanceOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RatePlanInstance) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type RatePlanInstanceArrayOutput struct{ *pulumi.OutputState }

func (RatePlanInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RatePlanInstance)(nil)).Elem()
}

func (o RatePlanInstanceArrayOutput) ToRatePlanInstanceArrayOutput() RatePlanInstanceArrayOutput {
	return o
}

func (o RatePlanInstanceArrayOutput) ToRatePlanInstanceArrayOutputWithContext(ctx context.Context) RatePlanInstanceArrayOutput {
	return o
}

func (o RatePlanInstanceArrayOutput) Index(i pulumi.IntInput) RatePlanInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RatePlanInstance {
		return vs[0].([]*RatePlanInstance)[vs[1].(int)]
	}).(RatePlanInstanceOutput)
}

type RatePlanInstanceMapOutput struct{ *pulumi.OutputState }

func (RatePlanInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RatePlanInstance)(nil)).Elem()
}

func (o RatePlanInstanceMapOutput) ToRatePlanInstanceMapOutput() RatePlanInstanceMapOutput {
	return o
}

func (o RatePlanInstanceMapOutput) ToRatePlanInstanceMapOutputWithContext(ctx context.Context) RatePlanInstanceMapOutput {
	return o
}

func (o RatePlanInstanceMapOutput) MapIndex(k pulumi.StringInput) RatePlanInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RatePlanInstance {
		return vs[0].(map[string]*RatePlanInstance)[vs[1].(string)]
	}).(RatePlanInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RatePlanInstanceInput)(nil)).Elem(), &RatePlanInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*RatePlanInstanceArrayInput)(nil)).Elem(), RatePlanInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RatePlanInstanceMapInput)(nil)).Elem(), RatePlanInstanceMap{})
	pulumi.RegisterOutputType(RatePlanInstanceOutput{})
	pulumi.RegisterOutputType(RatePlanInstanceArrayOutput{})
	pulumi.RegisterOutputType(RatePlanInstanceMapOutput{})
}