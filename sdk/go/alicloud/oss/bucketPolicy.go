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

// Provides a OSS Bucket Policy resource.  Authorization policy of a bucket.
//
// For information about OSS Bucket Policy and how to use it, see [What is Bucket Policy](https://www.alibabacloud.com/help/en/oss/user-guide/use-bucket-policy-to-grant-permission-to-access-oss).
//
// > **NOTE:** Available since v1.220.0.
//
// ## Example Usage
//
// # Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
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
//			defaultRandomInteger, err := random.NewRandomInteger(ctx, "defaultRandomInteger", &random.RandomIntegerArgs{
//				Min: pulumi.Int(10000),
//				Max: pulumi.Int(99999),
//			})
//			if err != nil {
//				return err
//			}
//			createBucket, err := oss.NewBucket(ctx, "createBucket", &oss.BucketArgs{
//				StorageClass: pulumi.String("Standard"),
//				Bucket: defaultRandomInteger.Result.ApplyT(func(result int) (string, error) {
//					return fmt.Sprintf("%v-%v", name, result), nil
//				}).(pulumi.StringOutput),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"Version": "1",
//				"Statement": []map[string]interface{}{
//					map[string]interface{}{
//						"Action": []string{
//							"oss:PutObject",
//							"oss:GetObject",
//						},
//						"Effect": "Deny",
//						"Principal": []string{
//							"1234567890",
//						},
//						"Resource": []string{
//							"acs:oss:*:1234567890:*/*",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = oss.NewBucketPolicy(ctx, "defaultBucketPolicy", &oss.BucketPolicyArgs{
//				Policy: pulumi.String(json0),
//				Bucket: createBucket.Bucket,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// OSS Bucket Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/bucketPolicy:BucketPolicy example <id>
// ```
type BucketPolicy struct {
	pulumi.CustomResourceState

	// The name of the Bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Json-formatted authorization policies for buckets.
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewBucketPolicy registers a new resource with the given unique name, arguments, and options.
func NewBucketPolicy(ctx *pulumi.Context,
	name string, args *BucketPolicyArgs, opts ...pulumi.ResourceOption) (*BucketPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketPolicy
	err := ctx.RegisterResource("alicloud:oss/bucketPolicy:BucketPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketPolicy gets an existing BucketPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketPolicyState, opts ...pulumi.ResourceOption) (*BucketPolicy, error) {
	var resource BucketPolicy
	err := ctx.ReadResource("alicloud:oss/bucketPolicy:BucketPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketPolicy resources.
type bucketPolicyState struct {
	// The name of the Bucket.
	Bucket *string `pulumi:"bucket"`
	// Json-formatted authorization policies for buckets.
	Policy *string `pulumi:"policy"`
}

type BucketPolicyState struct {
	// The name of the Bucket.
	Bucket pulumi.StringPtrInput
	// Json-formatted authorization policies for buckets.
	Policy pulumi.StringPtrInput
}

func (BucketPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketPolicyState)(nil)).Elem()
}

type bucketPolicyArgs struct {
	// The name of the Bucket.
	Bucket string `pulumi:"bucket"`
	// Json-formatted authorization policies for buckets.
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a BucketPolicy resource.
type BucketPolicyArgs struct {
	// The name of the Bucket.
	Bucket pulumi.StringInput
	// Json-formatted authorization policies for buckets.
	Policy pulumi.StringInput
}

func (BucketPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketPolicyArgs)(nil)).Elem()
}

type BucketPolicyInput interface {
	pulumi.Input

	ToBucketPolicyOutput() BucketPolicyOutput
	ToBucketPolicyOutputWithContext(ctx context.Context) BucketPolicyOutput
}

func (*BucketPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketPolicy)(nil)).Elem()
}

func (i *BucketPolicy) ToBucketPolicyOutput() BucketPolicyOutput {
	return i.ToBucketPolicyOutputWithContext(context.Background())
}

func (i *BucketPolicy) ToBucketPolicyOutputWithContext(ctx context.Context) BucketPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketPolicyOutput)
}

// BucketPolicyArrayInput is an input type that accepts BucketPolicyArray and BucketPolicyArrayOutput values.
// You can construct a concrete instance of `BucketPolicyArrayInput` via:
//
//	BucketPolicyArray{ BucketPolicyArgs{...} }
type BucketPolicyArrayInput interface {
	pulumi.Input

	ToBucketPolicyArrayOutput() BucketPolicyArrayOutput
	ToBucketPolicyArrayOutputWithContext(context.Context) BucketPolicyArrayOutput
}

type BucketPolicyArray []BucketPolicyInput

func (BucketPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketPolicy)(nil)).Elem()
}

func (i BucketPolicyArray) ToBucketPolicyArrayOutput() BucketPolicyArrayOutput {
	return i.ToBucketPolicyArrayOutputWithContext(context.Background())
}

func (i BucketPolicyArray) ToBucketPolicyArrayOutputWithContext(ctx context.Context) BucketPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketPolicyArrayOutput)
}

// BucketPolicyMapInput is an input type that accepts BucketPolicyMap and BucketPolicyMapOutput values.
// You can construct a concrete instance of `BucketPolicyMapInput` via:
//
//	BucketPolicyMap{ "key": BucketPolicyArgs{...} }
type BucketPolicyMapInput interface {
	pulumi.Input

	ToBucketPolicyMapOutput() BucketPolicyMapOutput
	ToBucketPolicyMapOutputWithContext(context.Context) BucketPolicyMapOutput
}

type BucketPolicyMap map[string]BucketPolicyInput

func (BucketPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketPolicy)(nil)).Elem()
}

func (i BucketPolicyMap) ToBucketPolicyMapOutput() BucketPolicyMapOutput {
	return i.ToBucketPolicyMapOutputWithContext(context.Background())
}

func (i BucketPolicyMap) ToBucketPolicyMapOutputWithContext(ctx context.Context) BucketPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketPolicyMapOutput)
}

type BucketPolicyOutput struct{ *pulumi.OutputState }

func (BucketPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketPolicy)(nil)).Elem()
}

func (o BucketPolicyOutput) ToBucketPolicyOutput() BucketPolicyOutput {
	return o
}

func (o BucketPolicyOutput) ToBucketPolicyOutputWithContext(ctx context.Context) BucketPolicyOutput {
	return o
}

// The name of the Bucket.
func (o BucketPolicyOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketPolicy) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Json-formatted authorization policies for buckets.
func (o BucketPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

type BucketPolicyArrayOutput struct{ *pulumi.OutputState }

func (BucketPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketPolicy)(nil)).Elem()
}

func (o BucketPolicyArrayOutput) ToBucketPolicyArrayOutput() BucketPolicyArrayOutput {
	return o
}

func (o BucketPolicyArrayOutput) ToBucketPolicyArrayOutputWithContext(ctx context.Context) BucketPolicyArrayOutput {
	return o
}

func (o BucketPolicyArrayOutput) Index(i pulumi.IntInput) BucketPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketPolicy {
		return vs[0].([]*BucketPolicy)[vs[1].(int)]
	}).(BucketPolicyOutput)
}

type BucketPolicyMapOutput struct{ *pulumi.OutputState }

func (BucketPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketPolicy)(nil)).Elem()
}

func (o BucketPolicyMapOutput) ToBucketPolicyMapOutput() BucketPolicyMapOutput {
	return o
}

func (o BucketPolicyMapOutput) ToBucketPolicyMapOutputWithContext(ctx context.Context) BucketPolicyMapOutput {
	return o
}

func (o BucketPolicyMapOutput) MapIndex(k pulumi.StringInput) BucketPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketPolicy {
		return vs[0].(map[string]*BucketPolicy)[vs[1].(string)]
	}).(BucketPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketPolicyInput)(nil)).Elem(), &BucketPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketPolicyArrayInput)(nil)).Elem(), BucketPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketPolicyMapInput)(nil)).Elem(), BucketPolicyMap{})
	pulumi.RegisterOutputType(BucketPolicyOutput{})
	pulumi.RegisterOutputType(BucketPolicyArrayOutput{})
	pulumi.RegisterOutputType(BucketPolicyMapOutput{})
}