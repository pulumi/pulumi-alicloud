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

// Provides a OSS Bucket Server Side Encryption resource. Server-side encryption rules of the bucket.
//
// For information about OSS Bucket Server Side Encryption and how to use it, see [What is Bucket Server Side Encryption](https://www.alibabacloud.com/help/en/oss/developer-reference/putbucketencryption).
//
// > **NOTE:** Available since v1.222.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
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
//			getKMS, err := kms.NewKey(ctx, "GetKMS", &kms.KeyArgs{
//				Origin:              pulumi.String("Aliyun_KMS"),
//				ProtectionLevel:     pulumi.String("SOFTWARE"),
//				Description:         pulumi.String(name),
//				KeySpec:             pulumi.String("Aliyun_AES_256"),
//				KeyUsage:            pulumi.String("ENCRYPT/DECRYPT"),
//				AutomaticRotation:   pulumi.String("Disabled"),
//				PendingWindowInDays: pulumi.Int(7),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = oss.NewBucketServerSideEncryption(ctx, "default", &oss.BucketServerSideEncryptionArgs{
//				KmsDataEncryption: pulumi.String("SM4"),
//				KmsMasterKeyId:    getKMS.ID(),
//				Bucket:            createBucket.Bucket,
//				SseAlgorithm:      pulumi.String("KMS"),
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
// OSS Bucket Server Side Encryption can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/bucketServerSideEncryption:BucketServerSideEncryption example <id>
// ```
type BucketServerSideEncryption struct {
	pulumi.CustomResourceState

	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
	KmsDataEncryption pulumi.StringPtrOutput `pulumi:"kmsDataEncryption"`
	// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
	KmsMasterKeyId pulumi.StringPtrOutput `pulumi:"kmsMasterKeyId"`
	// The server-side encryption method. Valid Values: KMS, AES256.
	SseAlgorithm pulumi.StringOutput `pulumi:"sseAlgorithm"`
}

// NewBucketServerSideEncryption registers a new resource with the given unique name, arguments, and options.
func NewBucketServerSideEncryption(ctx *pulumi.Context,
	name string, args *BucketServerSideEncryptionArgs, opts ...pulumi.ResourceOption) (*BucketServerSideEncryption, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.SseAlgorithm == nil {
		return nil, errors.New("invalid value for required argument 'SseAlgorithm'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketServerSideEncryption
	err := ctx.RegisterResource("alicloud:oss/bucketServerSideEncryption:BucketServerSideEncryption", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketServerSideEncryption gets an existing BucketServerSideEncryption resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketServerSideEncryption(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketServerSideEncryptionState, opts ...pulumi.ResourceOption) (*BucketServerSideEncryption, error) {
	var resource BucketServerSideEncryption
	err := ctx.ReadResource("alicloud:oss/bucketServerSideEncryption:BucketServerSideEncryption", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketServerSideEncryption resources.
type bucketServerSideEncryptionState struct {
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
	KmsDataEncryption *string `pulumi:"kmsDataEncryption"`
	// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
	KmsMasterKeyId *string `pulumi:"kmsMasterKeyId"`
	// The server-side encryption method. Valid Values: KMS, AES256.
	SseAlgorithm *string `pulumi:"sseAlgorithm"`
}

type BucketServerSideEncryptionState struct {
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
	KmsDataEncryption pulumi.StringPtrInput
	// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
	KmsMasterKeyId pulumi.StringPtrInput
	// The server-side encryption method. Valid Values: KMS, AES256.
	SseAlgorithm pulumi.StringPtrInput
}

func (BucketServerSideEncryptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketServerSideEncryptionState)(nil)).Elem()
}

type bucketServerSideEncryptionArgs struct {
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
	KmsDataEncryption *string `pulumi:"kmsDataEncryption"`
	// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
	KmsMasterKeyId *string `pulumi:"kmsMasterKeyId"`
	// The server-side encryption method. Valid Values: KMS, AES256.
	SseAlgorithm string `pulumi:"sseAlgorithm"`
}

// The set of arguments for constructing a BucketServerSideEncryption resource.
type BucketServerSideEncryptionArgs struct {
	// The name of the bucket.
	Bucket pulumi.StringInput
	// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
	KmsDataEncryption pulumi.StringPtrInput
	// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
	KmsMasterKeyId pulumi.StringPtrInput
	// The server-side encryption method. Valid Values: KMS, AES256.
	SseAlgorithm pulumi.StringInput
}

func (BucketServerSideEncryptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketServerSideEncryptionArgs)(nil)).Elem()
}

type BucketServerSideEncryptionInput interface {
	pulumi.Input

	ToBucketServerSideEncryptionOutput() BucketServerSideEncryptionOutput
	ToBucketServerSideEncryptionOutputWithContext(ctx context.Context) BucketServerSideEncryptionOutput
}

func (*BucketServerSideEncryption) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketServerSideEncryption)(nil)).Elem()
}

func (i *BucketServerSideEncryption) ToBucketServerSideEncryptionOutput() BucketServerSideEncryptionOutput {
	return i.ToBucketServerSideEncryptionOutputWithContext(context.Background())
}

func (i *BucketServerSideEncryption) ToBucketServerSideEncryptionOutputWithContext(ctx context.Context) BucketServerSideEncryptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketServerSideEncryptionOutput)
}

// BucketServerSideEncryptionArrayInput is an input type that accepts BucketServerSideEncryptionArray and BucketServerSideEncryptionArrayOutput values.
// You can construct a concrete instance of `BucketServerSideEncryptionArrayInput` via:
//
//	BucketServerSideEncryptionArray{ BucketServerSideEncryptionArgs{...} }
type BucketServerSideEncryptionArrayInput interface {
	pulumi.Input

	ToBucketServerSideEncryptionArrayOutput() BucketServerSideEncryptionArrayOutput
	ToBucketServerSideEncryptionArrayOutputWithContext(context.Context) BucketServerSideEncryptionArrayOutput
}

type BucketServerSideEncryptionArray []BucketServerSideEncryptionInput

func (BucketServerSideEncryptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketServerSideEncryption)(nil)).Elem()
}

func (i BucketServerSideEncryptionArray) ToBucketServerSideEncryptionArrayOutput() BucketServerSideEncryptionArrayOutput {
	return i.ToBucketServerSideEncryptionArrayOutputWithContext(context.Background())
}

func (i BucketServerSideEncryptionArray) ToBucketServerSideEncryptionArrayOutputWithContext(ctx context.Context) BucketServerSideEncryptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketServerSideEncryptionArrayOutput)
}

// BucketServerSideEncryptionMapInput is an input type that accepts BucketServerSideEncryptionMap and BucketServerSideEncryptionMapOutput values.
// You can construct a concrete instance of `BucketServerSideEncryptionMapInput` via:
//
//	BucketServerSideEncryptionMap{ "key": BucketServerSideEncryptionArgs{...} }
type BucketServerSideEncryptionMapInput interface {
	pulumi.Input

	ToBucketServerSideEncryptionMapOutput() BucketServerSideEncryptionMapOutput
	ToBucketServerSideEncryptionMapOutputWithContext(context.Context) BucketServerSideEncryptionMapOutput
}

type BucketServerSideEncryptionMap map[string]BucketServerSideEncryptionInput

func (BucketServerSideEncryptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketServerSideEncryption)(nil)).Elem()
}

func (i BucketServerSideEncryptionMap) ToBucketServerSideEncryptionMapOutput() BucketServerSideEncryptionMapOutput {
	return i.ToBucketServerSideEncryptionMapOutputWithContext(context.Background())
}

func (i BucketServerSideEncryptionMap) ToBucketServerSideEncryptionMapOutputWithContext(ctx context.Context) BucketServerSideEncryptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketServerSideEncryptionMapOutput)
}

type BucketServerSideEncryptionOutput struct{ *pulumi.OutputState }

func (BucketServerSideEncryptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketServerSideEncryption)(nil)).Elem()
}

func (o BucketServerSideEncryptionOutput) ToBucketServerSideEncryptionOutput() BucketServerSideEncryptionOutput {
	return o
}

func (o BucketServerSideEncryptionOutput) ToBucketServerSideEncryptionOutputWithContext(ctx context.Context) BucketServerSideEncryptionOutput {
	return o
}

// The name of the bucket.
func (o BucketServerSideEncryptionOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketServerSideEncryption) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// The algorithm used to encrypt objects. If this element is not specified, objects are encrypted by using AES256. This element is valid only when the value of SSEAlgorithm is set to KMS.
func (o BucketServerSideEncryptionOutput) KmsDataEncryption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketServerSideEncryption) pulumi.StringPtrOutput { return v.KmsDataEncryption }).(pulumi.StringPtrOutput)
}

// The CMK ID that must be specified when SSEAlgorithm is set to KMS and a specified CMK is used for encryption. In other cases, this element must be set to null.
func (o BucketServerSideEncryptionOutput) KmsMasterKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketServerSideEncryption) pulumi.StringPtrOutput { return v.KmsMasterKeyId }).(pulumi.StringPtrOutput)
}

// The server-side encryption method. Valid Values: KMS, AES256.
func (o BucketServerSideEncryptionOutput) SseAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketServerSideEncryption) pulumi.StringOutput { return v.SseAlgorithm }).(pulumi.StringOutput)
}

type BucketServerSideEncryptionArrayOutput struct{ *pulumi.OutputState }

func (BucketServerSideEncryptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketServerSideEncryption)(nil)).Elem()
}

func (o BucketServerSideEncryptionArrayOutput) ToBucketServerSideEncryptionArrayOutput() BucketServerSideEncryptionArrayOutput {
	return o
}

func (o BucketServerSideEncryptionArrayOutput) ToBucketServerSideEncryptionArrayOutputWithContext(ctx context.Context) BucketServerSideEncryptionArrayOutput {
	return o
}

func (o BucketServerSideEncryptionArrayOutput) Index(i pulumi.IntInput) BucketServerSideEncryptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketServerSideEncryption {
		return vs[0].([]*BucketServerSideEncryption)[vs[1].(int)]
	}).(BucketServerSideEncryptionOutput)
}

type BucketServerSideEncryptionMapOutput struct{ *pulumi.OutputState }

func (BucketServerSideEncryptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketServerSideEncryption)(nil)).Elem()
}

func (o BucketServerSideEncryptionMapOutput) ToBucketServerSideEncryptionMapOutput() BucketServerSideEncryptionMapOutput {
	return o
}

func (o BucketServerSideEncryptionMapOutput) ToBucketServerSideEncryptionMapOutputWithContext(ctx context.Context) BucketServerSideEncryptionMapOutput {
	return o
}

func (o BucketServerSideEncryptionMapOutput) MapIndex(k pulumi.StringInput) BucketServerSideEncryptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketServerSideEncryption {
		return vs[0].(map[string]*BucketServerSideEncryption)[vs[1].(string)]
	}).(BucketServerSideEncryptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketServerSideEncryptionInput)(nil)).Elem(), &BucketServerSideEncryption{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketServerSideEncryptionArrayInput)(nil)).Elem(), BucketServerSideEncryptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketServerSideEncryptionMapInput)(nil)).Elem(), BucketServerSideEncryptionMap{})
	pulumi.RegisterOutputType(BucketServerSideEncryptionOutput{})
	pulumi.RegisterOutputType(BucketServerSideEncryptionArrayOutput{})
	pulumi.RegisterOutputType(BucketServerSideEncryptionMapOutput{})
}