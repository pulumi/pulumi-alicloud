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

// Provides a OSS Bucket User Defined Log Fields resource. Used to personalize the userDefinedLogFields field in the Bucket real-time log.
//
// For information about OSS Bucket User Defined Log Fields and how to use it, see [What is Bucket User Defined Log Fields](https://www.alibabacloud.com/help/en/oss/developer-reference/putuserdefinedlogfieldsconfig).
//
// > **NOTE:** Available since v1.224.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			_, err := random.NewInteger(ctx, "default", &random.IntegerArgs{
//				Min: 10000,
//				Max: 99999,
//			})
//			if err != nil {
//				return err
//			}
//			createBucket, err := oss.NewBucket(ctx, "CreateBucket", &oss.BucketArgs{
//				StorageClass: pulumi.String("Standard"),
//				Bucket:       pulumi.String(fmt.Sprintf("%v-%v", name, _default.Result)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = oss.NewBucketUserDefinedLogFields(ctx, "default", &oss.BucketUserDefinedLogFieldsArgs{
//				Bucket: createBucket.Bucket,
//				ParamSets: pulumi.StringArray{
//					pulumi.String("oss-example"),
//					pulumi.String("example-para"),
//					pulumi.String("abc"),
//				},
//				HeaderSets: pulumi.StringArray{
//					pulumi.String("def"),
//					pulumi.String("example-header"),
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
// OSS Bucket User Defined Log Fields can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/bucketUserDefinedLogFields:BucketUserDefinedLogFields example <id>
// ```
type BucketUserDefinedLogFields struct {
	pulumi.CustomResourceState

	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Container for custom request header configuration information.
	HeaderSets pulumi.StringArrayOutput `pulumi:"headerSets"`
	// Container for custom request parameters configuration information.
	ParamSets pulumi.StringArrayOutput `pulumi:"paramSets"`
}

// NewBucketUserDefinedLogFields registers a new resource with the given unique name, arguments, and options.
func NewBucketUserDefinedLogFields(ctx *pulumi.Context,
	name string, args *BucketUserDefinedLogFieldsArgs, opts ...pulumi.ResourceOption) (*BucketUserDefinedLogFields, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketUserDefinedLogFields
	err := ctx.RegisterResource("alicloud:oss/bucketUserDefinedLogFields:BucketUserDefinedLogFields", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketUserDefinedLogFields gets an existing BucketUserDefinedLogFields resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketUserDefinedLogFields(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketUserDefinedLogFieldsState, opts ...pulumi.ResourceOption) (*BucketUserDefinedLogFields, error) {
	var resource BucketUserDefinedLogFields
	err := ctx.ReadResource("alicloud:oss/bucketUserDefinedLogFields:BucketUserDefinedLogFields", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketUserDefinedLogFields resources.
type bucketUserDefinedLogFieldsState struct {
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// Container for custom request header configuration information.
	HeaderSets []string `pulumi:"headerSets"`
	// Container for custom request parameters configuration information.
	ParamSets []string `pulumi:"paramSets"`
}

type BucketUserDefinedLogFieldsState struct {
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// Container for custom request header configuration information.
	HeaderSets pulumi.StringArrayInput
	// Container for custom request parameters configuration information.
	ParamSets pulumi.StringArrayInput
}

func (BucketUserDefinedLogFieldsState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketUserDefinedLogFieldsState)(nil)).Elem()
}

type bucketUserDefinedLogFieldsArgs struct {
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// Container for custom request header configuration information.
	HeaderSets []string `pulumi:"headerSets"`
	// Container for custom request parameters configuration information.
	ParamSets []string `pulumi:"paramSets"`
}

// The set of arguments for constructing a BucketUserDefinedLogFields resource.
type BucketUserDefinedLogFieldsArgs struct {
	// The name of the bucket.
	Bucket pulumi.StringInput
	// Container for custom request header configuration information.
	HeaderSets pulumi.StringArrayInput
	// Container for custom request parameters configuration information.
	ParamSets pulumi.StringArrayInput
}

func (BucketUserDefinedLogFieldsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketUserDefinedLogFieldsArgs)(nil)).Elem()
}

type BucketUserDefinedLogFieldsInput interface {
	pulumi.Input

	ToBucketUserDefinedLogFieldsOutput() BucketUserDefinedLogFieldsOutput
	ToBucketUserDefinedLogFieldsOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsOutput
}

func (*BucketUserDefinedLogFields) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketUserDefinedLogFields)(nil)).Elem()
}

func (i *BucketUserDefinedLogFields) ToBucketUserDefinedLogFieldsOutput() BucketUserDefinedLogFieldsOutput {
	return i.ToBucketUserDefinedLogFieldsOutputWithContext(context.Background())
}

func (i *BucketUserDefinedLogFields) ToBucketUserDefinedLogFieldsOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketUserDefinedLogFieldsOutput)
}

// BucketUserDefinedLogFieldsArrayInput is an input type that accepts BucketUserDefinedLogFieldsArray and BucketUserDefinedLogFieldsArrayOutput values.
// You can construct a concrete instance of `BucketUserDefinedLogFieldsArrayInput` via:
//
//	BucketUserDefinedLogFieldsArray{ BucketUserDefinedLogFieldsArgs{...} }
type BucketUserDefinedLogFieldsArrayInput interface {
	pulumi.Input

	ToBucketUserDefinedLogFieldsArrayOutput() BucketUserDefinedLogFieldsArrayOutput
	ToBucketUserDefinedLogFieldsArrayOutputWithContext(context.Context) BucketUserDefinedLogFieldsArrayOutput
}

type BucketUserDefinedLogFieldsArray []BucketUserDefinedLogFieldsInput

func (BucketUserDefinedLogFieldsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketUserDefinedLogFields)(nil)).Elem()
}

func (i BucketUserDefinedLogFieldsArray) ToBucketUserDefinedLogFieldsArrayOutput() BucketUserDefinedLogFieldsArrayOutput {
	return i.ToBucketUserDefinedLogFieldsArrayOutputWithContext(context.Background())
}

func (i BucketUserDefinedLogFieldsArray) ToBucketUserDefinedLogFieldsArrayOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketUserDefinedLogFieldsArrayOutput)
}

// BucketUserDefinedLogFieldsMapInput is an input type that accepts BucketUserDefinedLogFieldsMap and BucketUserDefinedLogFieldsMapOutput values.
// You can construct a concrete instance of `BucketUserDefinedLogFieldsMapInput` via:
//
//	BucketUserDefinedLogFieldsMap{ "key": BucketUserDefinedLogFieldsArgs{...} }
type BucketUserDefinedLogFieldsMapInput interface {
	pulumi.Input

	ToBucketUserDefinedLogFieldsMapOutput() BucketUserDefinedLogFieldsMapOutput
	ToBucketUserDefinedLogFieldsMapOutputWithContext(context.Context) BucketUserDefinedLogFieldsMapOutput
}

type BucketUserDefinedLogFieldsMap map[string]BucketUserDefinedLogFieldsInput

func (BucketUserDefinedLogFieldsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketUserDefinedLogFields)(nil)).Elem()
}

func (i BucketUserDefinedLogFieldsMap) ToBucketUserDefinedLogFieldsMapOutput() BucketUserDefinedLogFieldsMapOutput {
	return i.ToBucketUserDefinedLogFieldsMapOutputWithContext(context.Background())
}

func (i BucketUserDefinedLogFieldsMap) ToBucketUserDefinedLogFieldsMapOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketUserDefinedLogFieldsMapOutput)
}

type BucketUserDefinedLogFieldsOutput struct{ *pulumi.OutputState }

func (BucketUserDefinedLogFieldsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketUserDefinedLogFields)(nil)).Elem()
}

func (o BucketUserDefinedLogFieldsOutput) ToBucketUserDefinedLogFieldsOutput() BucketUserDefinedLogFieldsOutput {
	return o
}

func (o BucketUserDefinedLogFieldsOutput) ToBucketUserDefinedLogFieldsOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsOutput {
	return o
}

// The name of the bucket.
func (o BucketUserDefinedLogFieldsOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketUserDefinedLogFields) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Container for custom request header configuration information.
func (o BucketUserDefinedLogFieldsOutput) HeaderSets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BucketUserDefinedLogFields) pulumi.StringArrayOutput { return v.HeaderSets }).(pulumi.StringArrayOutput)
}

// Container for custom request parameters configuration information.
func (o BucketUserDefinedLogFieldsOutput) ParamSets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BucketUserDefinedLogFields) pulumi.StringArrayOutput { return v.ParamSets }).(pulumi.StringArrayOutput)
}

type BucketUserDefinedLogFieldsArrayOutput struct{ *pulumi.OutputState }

func (BucketUserDefinedLogFieldsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketUserDefinedLogFields)(nil)).Elem()
}

func (o BucketUserDefinedLogFieldsArrayOutput) ToBucketUserDefinedLogFieldsArrayOutput() BucketUserDefinedLogFieldsArrayOutput {
	return o
}

func (o BucketUserDefinedLogFieldsArrayOutput) ToBucketUserDefinedLogFieldsArrayOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsArrayOutput {
	return o
}

func (o BucketUserDefinedLogFieldsArrayOutput) Index(i pulumi.IntInput) BucketUserDefinedLogFieldsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketUserDefinedLogFields {
		return vs[0].([]*BucketUserDefinedLogFields)[vs[1].(int)]
	}).(BucketUserDefinedLogFieldsOutput)
}

type BucketUserDefinedLogFieldsMapOutput struct{ *pulumi.OutputState }

func (BucketUserDefinedLogFieldsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketUserDefinedLogFields)(nil)).Elem()
}

func (o BucketUserDefinedLogFieldsMapOutput) ToBucketUserDefinedLogFieldsMapOutput() BucketUserDefinedLogFieldsMapOutput {
	return o
}

func (o BucketUserDefinedLogFieldsMapOutput) ToBucketUserDefinedLogFieldsMapOutputWithContext(ctx context.Context) BucketUserDefinedLogFieldsMapOutput {
	return o
}

func (o BucketUserDefinedLogFieldsMapOutput) MapIndex(k pulumi.StringInput) BucketUserDefinedLogFieldsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketUserDefinedLogFields {
		return vs[0].(map[string]*BucketUserDefinedLogFields)[vs[1].(string)]
	}).(BucketUserDefinedLogFieldsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketUserDefinedLogFieldsInput)(nil)).Elem(), &BucketUserDefinedLogFields{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketUserDefinedLogFieldsArrayInput)(nil)).Elem(), BucketUserDefinedLogFieldsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketUserDefinedLogFieldsMapInput)(nil)).Elem(), BucketUserDefinedLogFieldsMap{})
	pulumi.RegisterOutputType(BucketUserDefinedLogFieldsOutput{})
	pulumi.RegisterOutputType(BucketUserDefinedLogFieldsArrayOutput{})
	pulumi.RegisterOutputType(BucketUserDefinedLogFieldsMapOutput{})
}