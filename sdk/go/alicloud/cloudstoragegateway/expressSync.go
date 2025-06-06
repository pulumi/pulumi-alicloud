// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudstoragegateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Storage Gateway Express Sync resource.
//
// For information about Cloud Storage Gateway Express Sync and how to use it, see [What is Express Sync](https://www.alibabacloud.com/help/en/cloud-storage-gateway/latest/xzpxo3).
//
// > **NOTE:** Available since v1.144.0.
//
// ## Import
//
// Cloud Storage Gateway Express Sync can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cloudstoragegateway/expressSync:ExpressSync example <id>
// ```
type ExpressSync struct {
	pulumi.CustomResourceState

	// The name of the OSS Bucket.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrOutput `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringOutput `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringOutput `pulumi:"expressSyncName"`
}

// NewExpressSync registers a new resource with the given unique name, arguments, and options.
func NewExpressSync(ctx *pulumi.Context,
	name string, args *ExpressSyncArgs, opts ...pulumi.ResourceOption) (*ExpressSync, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.BucketRegion == nil {
		return nil, errors.New("invalid value for required argument 'BucketRegion'")
	}
	if args.ExpressSyncName == nil {
		return nil, errors.New("invalid value for required argument 'ExpressSyncName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ExpressSync
	err := ctx.RegisterResource("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExpressSync gets an existing ExpressSync resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExpressSync(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExpressSyncState, opts ...pulumi.ResourceOption) (*ExpressSync, error) {
	var resource ExpressSync
	err := ctx.ReadResource("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExpressSync resources.
type expressSyncState struct {
	// The name of the OSS Bucket.
	BucketName *string `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix *string `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion *string `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description *string `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName *string `pulumi:"expressSyncName"`
}

type ExpressSyncState struct {
	// The name of the OSS Bucket.
	BucketName pulumi.StringPtrInput
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrInput
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringPtrInput
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrInput
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringPtrInput
}

func (ExpressSyncState) ElementType() reflect.Type {
	return reflect.TypeOf((*expressSyncState)(nil)).Elem()
}

type expressSyncArgs struct {
	// The name of the OSS Bucket.
	BucketName string `pulumi:"bucketName"`
	// The prefix of the OSS Bucket.
	BucketPrefix *string `pulumi:"bucketPrefix"`
	// The region of the OSS Bucket.
	BucketRegion string `pulumi:"bucketRegion"`
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description *string `pulumi:"description"`
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName string `pulumi:"expressSyncName"`
}

// The set of arguments for constructing a ExpressSync resource.
type ExpressSyncArgs struct {
	// The name of the OSS Bucket.
	BucketName pulumi.StringInput
	// The prefix of the OSS Bucket.
	BucketPrefix pulumi.StringPtrInput
	// The region of the OSS Bucket.
	BucketRegion pulumi.StringInput
	// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
	Description pulumi.StringPtrInput
	// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
	ExpressSyncName pulumi.StringInput
}

func (ExpressSyncArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*expressSyncArgs)(nil)).Elem()
}

type ExpressSyncInput interface {
	pulumi.Input

	ToExpressSyncOutput() ExpressSyncOutput
	ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput
}

func (*ExpressSync) ElementType() reflect.Type {
	return reflect.TypeOf((**ExpressSync)(nil)).Elem()
}

func (i *ExpressSync) ToExpressSyncOutput() ExpressSyncOutput {
	return i.ToExpressSyncOutputWithContext(context.Background())
}

func (i *ExpressSync) ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncOutput)
}

// ExpressSyncArrayInput is an input type that accepts ExpressSyncArray and ExpressSyncArrayOutput values.
// You can construct a concrete instance of `ExpressSyncArrayInput` via:
//
//	ExpressSyncArray{ ExpressSyncArgs{...} }
type ExpressSyncArrayInput interface {
	pulumi.Input

	ToExpressSyncArrayOutput() ExpressSyncArrayOutput
	ToExpressSyncArrayOutputWithContext(context.Context) ExpressSyncArrayOutput
}

type ExpressSyncArray []ExpressSyncInput

func (ExpressSyncArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExpressSync)(nil)).Elem()
}

func (i ExpressSyncArray) ToExpressSyncArrayOutput() ExpressSyncArrayOutput {
	return i.ToExpressSyncArrayOutputWithContext(context.Background())
}

func (i ExpressSyncArray) ToExpressSyncArrayOutputWithContext(ctx context.Context) ExpressSyncArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncArrayOutput)
}

// ExpressSyncMapInput is an input type that accepts ExpressSyncMap and ExpressSyncMapOutput values.
// You can construct a concrete instance of `ExpressSyncMapInput` via:
//
//	ExpressSyncMap{ "key": ExpressSyncArgs{...} }
type ExpressSyncMapInput interface {
	pulumi.Input

	ToExpressSyncMapOutput() ExpressSyncMapOutput
	ToExpressSyncMapOutputWithContext(context.Context) ExpressSyncMapOutput
}

type ExpressSyncMap map[string]ExpressSyncInput

func (ExpressSyncMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExpressSync)(nil)).Elem()
}

func (i ExpressSyncMap) ToExpressSyncMapOutput() ExpressSyncMapOutput {
	return i.ToExpressSyncMapOutputWithContext(context.Background())
}

func (i ExpressSyncMap) ToExpressSyncMapOutputWithContext(ctx context.Context) ExpressSyncMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExpressSyncMapOutput)
}

type ExpressSyncOutput struct{ *pulumi.OutputState }

func (ExpressSyncOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExpressSync)(nil)).Elem()
}

func (o ExpressSyncOutput) ToExpressSyncOutput() ExpressSyncOutput {
	return o
}

func (o ExpressSyncOutput) ToExpressSyncOutputWithContext(ctx context.Context) ExpressSyncOutput {
	return o
}

// The name of the OSS Bucket.
func (o ExpressSyncOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *ExpressSync) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// The prefix of the OSS Bucket.
func (o ExpressSyncOutput) BucketPrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExpressSync) pulumi.StringPtrOutput { return v.BucketPrefix }).(pulumi.StringPtrOutput)
}

// The region of the OSS Bucket.
func (o ExpressSyncOutput) BucketRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *ExpressSync) pulumi.StringOutput { return v.BucketRegion }).(pulumi.StringOutput)
}

// The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
func (o ExpressSyncOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExpressSync) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
func (o ExpressSyncOutput) ExpressSyncName() pulumi.StringOutput {
	return o.ApplyT(func(v *ExpressSync) pulumi.StringOutput { return v.ExpressSyncName }).(pulumi.StringOutput)
}

type ExpressSyncArrayOutput struct{ *pulumi.OutputState }

func (ExpressSyncArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExpressSync)(nil)).Elem()
}

func (o ExpressSyncArrayOutput) ToExpressSyncArrayOutput() ExpressSyncArrayOutput {
	return o
}

func (o ExpressSyncArrayOutput) ToExpressSyncArrayOutputWithContext(ctx context.Context) ExpressSyncArrayOutput {
	return o
}

func (o ExpressSyncArrayOutput) Index(i pulumi.IntInput) ExpressSyncOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExpressSync {
		return vs[0].([]*ExpressSync)[vs[1].(int)]
	}).(ExpressSyncOutput)
}

type ExpressSyncMapOutput struct{ *pulumi.OutputState }

func (ExpressSyncMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExpressSync)(nil)).Elem()
}

func (o ExpressSyncMapOutput) ToExpressSyncMapOutput() ExpressSyncMapOutput {
	return o
}

func (o ExpressSyncMapOutput) ToExpressSyncMapOutputWithContext(ctx context.Context) ExpressSyncMapOutput {
	return o
}

func (o ExpressSyncMapOutput) MapIndex(k pulumi.StringInput) ExpressSyncOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExpressSync {
		return vs[0].(map[string]*ExpressSync)[vs[1].(string)]
	}).(ExpressSyncOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncInput)(nil)).Elem(), &ExpressSync{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncArrayInput)(nil)).Elem(), ExpressSyncArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExpressSyncMapInput)(nil)).Elem(), ExpressSyncMap{})
	pulumi.RegisterOutputType(ExpressSyncOutput{})
	pulumi.RegisterOutputType(ExpressSyncArrayOutput{})
	pulumi.RegisterOutputType(ExpressSyncMapOutput{})
}
