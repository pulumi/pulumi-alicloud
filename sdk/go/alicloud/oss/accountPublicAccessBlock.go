// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oss

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a OSS Account Public Access Block resource. Blocking public access at the account level.
//
// For information about OSS Account Public Access Block and how to use it, see [What is Account Public Access Block](https://www.alibabacloud.com/help/en/oss/developer-reference/putpublicaccessblock).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
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
//			_, err := oss.NewAccountPublicAccessBlock(ctx, "default", &oss.AccountPublicAccessBlockArgs{
//				BlockPublicAccess: pulumi.Bool(true),
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
// OSS Account Public Access Block can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:oss/accountPublicAccessBlock:AccountPublicAccessBlock example
// ```
type AccountPublicAccessBlock struct {
	pulumi.CustomResourceState

	// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
	BlockPublicAccess pulumi.BoolOutput `pulumi:"blockPublicAccess"`
}

// NewAccountPublicAccessBlock registers a new resource with the given unique name, arguments, and options.
func NewAccountPublicAccessBlock(ctx *pulumi.Context,
	name string, args *AccountPublicAccessBlockArgs, opts ...pulumi.ResourceOption) (*AccountPublicAccessBlock, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BlockPublicAccess == nil {
		return nil, errors.New("invalid value for required argument 'BlockPublicAccess'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccountPublicAccessBlock
	err := ctx.RegisterResource("alicloud:oss/accountPublicAccessBlock:AccountPublicAccessBlock", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountPublicAccessBlock gets an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountPublicAccessBlock(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountPublicAccessBlockState, opts ...pulumi.ResourceOption) (*AccountPublicAccessBlock, error) {
	var resource AccountPublicAccessBlock
	err := ctx.ReadResource("alicloud:oss/accountPublicAccessBlock:AccountPublicAccessBlock", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountPublicAccessBlock resources.
type accountPublicAccessBlockState struct {
	// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
	BlockPublicAccess *bool `pulumi:"blockPublicAccess"`
}

type AccountPublicAccessBlockState struct {
	// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
	BlockPublicAccess pulumi.BoolPtrInput
}

func (AccountPublicAccessBlockState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountPublicAccessBlockState)(nil)).Elem()
}

type accountPublicAccessBlockArgs struct {
	// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
	BlockPublicAccess bool `pulumi:"blockPublicAccess"`
}

// The set of arguments for constructing a AccountPublicAccessBlock resource.
type AccountPublicAccessBlockArgs struct {
	// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
	BlockPublicAccess pulumi.BoolInput
}

func (AccountPublicAccessBlockArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountPublicAccessBlockArgs)(nil)).Elem()
}

type AccountPublicAccessBlockInput interface {
	pulumi.Input

	ToAccountPublicAccessBlockOutput() AccountPublicAccessBlockOutput
	ToAccountPublicAccessBlockOutputWithContext(ctx context.Context) AccountPublicAccessBlockOutput
}

func (*AccountPublicAccessBlock) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountPublicAccessBlock)(nil)).Elem()
}

func (i *AccountPublicAccessBlock) ToAccountPublicAccessBlockOutput() AccountPublicAccessBlockOutput {
	return i.ToAccountPublicAccessBlockOutputWithContext(context.Background())
}

func (i *AccountPublicAccessBlock) ToAccountPublicAccessBlockOutputWithContext(ctx context.Context) AccountPublicAccessBlockOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPublicAccessBlockOutput)
}

// AccountPublicAccessBlockArrayInput is an input type that accepts AccountPublicAccessBlockArray and AccountPublicAccessBlockArrayOutput values.
// You can construct a concrete instance of `AccountPublicAccessBlockArrayInput` via:
//
//	AccountPublicAccessBlockArray{ AccountPublicAccessBlockArgs{...} }
type AccountPublicAccessBlockArrayInput interface {
	pulumi.Input

	ToAccountPublicAccessBlockArrayOutput() AccountPublicAccessBlockArrayOutput
	ToAccountPublicAccessBlockArrayOutputWithContext(context.Context) AccountPublicAccessBlockArrayOutput
}

type AccountPublicAccessBlockArray []AccountPublicAccessBlockInput

func (AccountPublicAccessBlockArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountPublicAccessBlock)(nil)).Elem()
}

func (i AccountPublicAccessBlockArray) ToAccountPublicAccessBlockArrayOutput() AccountPublicAccessBlockArrayOutput {
	return i.ToAccountPublicAccessBlockArrayOutputWithContext(context.Background())
}

func (i AccountPublicAccessBlockArray) ToAccountPublicAccessBlockArrayOutputWithContext(ctx context.Context) AccountPublicAccessBlockArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPublicAccessBlockArrayOutput)
}

// AccountPublicAccessBlockMapInput is an input type that accepts AccountPublicAccessBlockMap and AccountPublicAccessBlockMapOutput values.
// You can construct a concrete instance of `AccountPublicAccessBlockMapInput` via:
//
//	AccountPublicAccessBlockMap{ "key": AccountPublicAccessBlockArgs{...} }
type AccountPublicAccessBlockMapInput interface {
	pulumi.Input

	ToAccountPublicAccessBlockMapOutput() AccountPublicAccessBlockMapOutput
	ToAccountPublicAccessBlockMapOutputWithContext(context.Context) AccountPublicAccessBlockMapOutput
}

type AccountPublicAccessBlockMap map[string]AccountPublicAccessBlockInput

func (AccountPublicAccessBlockMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountPublicAccessBlock)(nil)).Elem()
}

func (i AccountPublicAccessBlockMap) ToAccountPublicAccessBlockMapOutput() AccountPublicAccessBlockMapOutput {
	return i.ToAccountPublicAccessBlockMapOutputWithContext(context.Background())
}

func (i AccountPublicAccessBlockMap) ToAccountPublicAccessBlockMapOutputWithContext(ctx context.Context) AccountPublicAccessBlockMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountPublicAccessBlockMapOutput)
}

type AccountPublicAccessBlockOutput struct{ *pulumi.OutputState }

func (AccountPublicAccessBlockOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountPublicAccessBlock)(nil)).Elem()
}

func (o AccountPublicAccessBlockOutput) ToAccountPublicAccessBlockOutput() AccountPublicAccessBlockOutput {
	return o
}

func (o AccountPublicAccessBlockOutput) ToAccountPublicAccessBlockOutputWithContext(ctx context.Context) AccountPublicAccessBlockOutput {
	return o
}

// Whether or not AlibabaCloud OSS should block public bucket policies for buckets in this account is enabled.
func (o AccountPublicAccessBlockOutput) BlockPublicAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v *AccountPublicAccessBlock) pulumi.BoolOutput { return v.BlockPublicAccess }).(pulumi.BoolOutput)
}

type AccountPublicAccessBlockArrayOutput struct{ *pulumi.OutputState }

func (AccountPublicAccessBlockArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountPublicAccessBlock)(nil)).Elem()
}

func (o AccountPublicAccessBlockArrayOutput) ToAccountPublicAccessBlockArrayOutput() AccountPublicAccessBlockArrayOutput {
	return o
}

func (o AccountPublicAccessBlockArrayOutput) ToAccountPublicAccessBlockArrayOutputWithContext(ctx context.Context) AccountPublicAccessBlockArrayOutput {
	return o
}

func (o AccountPublicAccessBlockArrayOutput) Index(i pulumi.IntInput) AccountPublicAccessBlockOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccountPublicAccessBlock {
		return vs[0].([]*AccountPublicAccessBlock)[vs[1].(int)]
	}).(AccountPublicAccessBlockOutput)
}

type AccountPublicAccessBlockMapOutput struct{ *pulumi.OutputState }

func (AccountPublicAccessBlockMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountPublicAccessBlock)(nil)).Elem()
}

func (o AccountPublicAccessBlockMapOutput) ToAccountPublicAccessBlockMapOutput() AccountPublicAccessBlockMapOutput {
	return o
}

func (o AccountPublicAccessBlockMapOutput) ToAccountPublicAccessBlockMapOutputWithContext(ctx context.Context) AccountPublicAccessBlockMapOutput {
	return o
}

func (o AccountPublicAccessBlockMapOutput) MapIndex(k pulumi.StringInput) AccountPublicAccessBlockOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccountPublicAccessBlock {
		return vs[0].(map[string]*AccountPublicAccessBlock)[vs[1].(string)]
	}).(AccountPublicAccessBlockOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPublicAccessBlockInput)(nil)).Elem(), &AccountPublicAccessBlock{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPublicAccessBlockArrayInput)(nil)).Elem(), AccountPublicAccessBlockArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountPublicAccessBlockMapInput)(nil)).Elem(), AccountPublicAccessBlockMap{})
	pulumi.RegisterOutputType(AccountPublicAccessBlockOutput{})
	pulumi.RegisterOutputType(AccountPublicAccessBlockArrayOutput{})
	pulumi.RegisterOutputType(AccountPublicAccessBlockMapOutput{})
}
