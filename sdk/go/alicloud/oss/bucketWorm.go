// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oss

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// OSS Bucket Worm can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/bucketWorm:BucketWorm example <bucket>:<worm_id>
// ```
type BucketWorm struct {
	pulumi.CustomResourceState

	// The name of the bucket
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// The creation time of the resource
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The specified number of days to retain the Object.
	RetentionPeriodInDays pulumi.IntPtrOutput `pulumi:"retentionPeriodInDays"`
	// The status of the compliance retention policy. Optional values:
	// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
	// - `Locked`: The compliance retention policy is Locked.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the retention policy.
	WormId pulumi.StringOutput `pulumi:"wormId"`
}

// NewBucketWorm registers a new resource with the given unique name, arguments, and options.
func NewBucketWorm(ctx *pulumi.Context,
	name string, args *BucketWormArgs, opts ...pulumi.ResourceOption) (*BucketWorm, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketWorm
	err := ctx.RegisterResource("alicloud:oss/bucketWorm:BucketWorm", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketWorm gets an existing BucketWorm resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketWorm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketWormState, opts ...pulumi.ResourceOption) (*BucketWorm, error) {
	var resource BucketWorm
	err := ctx.ReadResource("alicloud:oss/bucketWorm:BucketWorm", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketWorm resources.
type bucketWormState struct {
	// The name of the bucket
	Bucket *string `pulumi:"bucket"`
	// The creation time of the resource
	CreateTime *string `pulumi:"createTime"`
	// The specified number of days to retain the Object.
	RetentionPeriodInDays *int `pulumi:"retentionPeriodInDays"`
	// The status of the compliance retention policy. Optional values:
	// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
	// - `Locked`: The compliance retention policy is Locked.
	Status *string `pulumi:"status"`
	// The ID of the retention policy.
	WormId *string `pulumi:"wormId"`
}

type BucketWormState struct {
	// The name of the bucket
	Bucket pulumi.StringPtrInput
	// The creation time of the resource
	CreateTime pulumi.StringPtrInput
	// The specified number of days to retain the Object.
	RetentionPeriodInDays pulumi.IntPtrInput
	// The status of the compliance retention policy. Optional values:
	// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
	// - `Locked`: The compliance retention policy is Locked.
	Status pulumi.StringPtrInput
	// The ID of the retention policy.
	WormId pulumi.StringPtrInput
}

func (BucketWormState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketWormState)(nil)).Elem()
}

type bucketWormArgs struct {
	// The name of the bucket
	Bucket string `pulumi:"bucket"`
	// The specified number of days to retain the Object.
	RetentionPeriodInDays *int `pulumi:"retentionPeriodInDays"`
	// The status of the compliance retention policy. Optional values:
	// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
	// - `Locked`: The compliance retention policy is Locked.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a BucketWorm resource.
type BucketWormArgs struct {
	// The name of the bucket
	Bucket pulumi.StringInput
	// The specified number of days to retain the Object.
	RetentionPeriodInDays pulumi.IntPtrInput
	// The status of the compliance retention policy. Optional values:
	// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
	// - `Locked`: The compliance retention policy is Locked.
	Status pulumi.StringPtrInput
}

func (BucketWormArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketWormArgs)(nil)).Elem()
}

type BucketWormInput interface {
	pulumi.Input

	ToBucketWormOutput() BucketWormOutput
	ToBucketWormOutputWithContext(ctx context.Context) BucketWormOutput
}

func (*BucketWorm) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketWorm)(nil)).Elem()
}

func (i *BucketWorm) ToBucketWormOutput() BucketWormOutput {
	return i.ToBucketWormOutputWithContext(context.Background())
}

func (i *BucketWorm) ToBucketWormOutputWithContext(ctx context.Context) BucketWormOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWormOutput)
}

// BucketWormArrayInput is an input type that accepts BucketWormArray and BucketWormArrayOutput values.
// You can construct a concrete instance of `BucketWormArrayInput` via:
//
//	BucketWormArray{ BucketWormArgs{...} }
type BucketWormArrayInput interface {
	pulumi.Input

	ToBucketWormArrayOutput() BucketWormArrayOutput
	ToBucketWormArrayOutputWithContext(context.Context) BucketWormArrayOutput
}

type BucketWormArray []BucketWormInput

func (BucketWormArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketWorm)(nil)).Elem()
}

func (i BucketWormArray) ToBucketWormArrayOutput() BucketWormArrayOutput {
	return i.ToBucketWormArrayOutputWithContext(context.Background())
}

func (i BucketWormArray) ToBucketWormArrayOutputWithContext(ctx context.Context) BucketWormArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWormArrayOutput)
}

// BucketWormMapInput is an input type that accepts BucketWormMap and BucketWormMapOutput values.
// You can construct a concrete instance of `BucketWormMapInput` via:
//
//	BucketWormMap{ "key": BucketWormArgs{...} }
type BucketWormMapInput interface {
	pulumi.Input

	ToBucketWormMapOutput() BucketWormMapOutput
	ToBucketWormMapOutputWithContext(context.Context) BucketWormMapOutput
}

type BucketWormMap map[string]BucketWormInput

func (BucketWormMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketWorm)(nil)).Elem()
}

func (i BucketWormMap) ToBucketWormMapOutput() BucketWormMapOutput {
	return i.ToBucketWormMapOutputWithContext(context.Background())
}

func (i BucketWormMap) ToBucketWormMapOutputWithContext(ctx context.Context) BucketWormMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWormMapOutput)
}

type BucketWormOutput struct{ *pulumi.OutputState }

func (BucketWormOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketWorm)(nil)).Elem()
}

func (o BucketWormOutput) ToBucketWormOutput() BucketWormOutput {
	return o
}

func (o BucketWormOutput) ToBucketWormOutputWithContext(ctx context.Context) BucketWormOutput {
	return o
}

// The name of the bucket
func (o BucketWormOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketWorm) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// The creation time of the resource
func (o BucketWormOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketWorm) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The specified number of days to retain the Object.
func (o BucketWormOutput) RetentionPeriodInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BucketWorm) pulumi.IntPtrOutput { return v.RetentionPeriodInDays }).(pulumi.IntPtrOutput)
}

// The status of the compliance retention policy. Optional values:
// - `InProgress`: After a compliance retention policy is created, the policy is in the InProgress status by default, and the validity period of this status is 24 hours.
// - `Locked`: The compliance retention policy is Locked.
func (o BucketWormOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketWorm) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the retention policy.
func (o BucketWormOutput) WormId() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketWorm) pulumi.StringOutput { return v.WormId }).(pulumi.StringOutput)
}

type BucketWormArrayOutput struct{ *pulumi.OutputState }

func (BucketWormArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketWorm)(nil)).Elem()
}

func (o BucketWormArrayOutput) ToBucketWormArrayOutput() BucketWormArrayOutput {
	return o
}

func (o BucketWormArrayOutput) ToBucketWormArrayOutputWithContext(ctx context.Context) BucketWormArrayOutput {
	return o
}

func (o BucketWormArrayOutput) Index(i pulumi.IntInput) BucketWormOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketWorm {
		return vs[0].([]*BucketWorm)[vs[1].(int)]
	}).(BucketWormOutput)
}

type BucketWormMapOutput struct{ *pulumi.OutputState }

func (BucketWormMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketWorm)(nil)).Elem()
}

func (o BucketWormMapOutput) ToBucketWormMapOutput() BucketWormMapOutput {
	return o
}

func (o BucketWormMapOutput) ToBucketWormMapOutputWithContext(ctx context.Context) BucketWormMapOutput {
	return o
}

func (o BucketWormMapOutput) MapIndex(k pulumi.StringInput) BucketWormOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketWorm {
		return vs[0].(map[string]*BucketWorm)[vs[1].(string)]
	}).(BucketWormOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWormInput)(nil)).Elem(), &BucketWorm{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWormArrayInput)(nil)).Elem(), BucketWormArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWormMapInput)(nil)).Elem(), BucketWormMap{})
	pulumi.RegisterOutputType(BucketWormOutput{})
	pulumi.RegisterOutputType(BucketWormArrayOutput{})
	pulumi.RegisterOutputType(BucketWormMapOutput{})
}