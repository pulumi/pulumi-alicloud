// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:** This datasource has been renamed to ecs.getEcsKeyPairs from version 1.121.0.
//
// This data source provides a list of key pairs in an Alibaba Cloud account according to the specified filters.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Declare the data source
//			defaultKeyPair, err := ecs.NewKeyPair(ctx, "default", &ecs.KeyPairArgs{
//				KeyName: pulumi.String("keyPairDatasource"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = ecs.GetKeyPairsOutput(ctx, ecs.GetKeyPairsOutputArgs{
//				NameRegex: defaultKeyPair.KeyName,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func GetKeyPairs(ctx *pulumi.Context, args *GetKeyPairsArgs, opts ...pulumi.InvokeOption) (*GetKeyPairsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKeyPairsResult
	err := ctx.Invoke("alicloud:ecs/getKeyPairs:getKeyPairs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKeyPairs.
type GetKeyPairsArgs struct {
	// A finger print used to retrieve specified key pair.
	FingerPrint *string `pulumi:"fingerPrint"`
	// A list of key pair IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to apply to the resulting key pairs.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Id of resource group which the key pair belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getKeyPairs.
type GetKeyPairsResult struct {
	// Finger print of the key pair.
	FingerPrint *string `pulumi:"fingerPrint"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// A list of key pairs. Each element contains the following attributes:
	//
	// Deprecated: Field `keyPairs` has been deprecated from provider version 1.121.0. New field `pairs` instead.
	KeyPairs  []GetKeyPairsKeyPair `pulumi:"keyPairs"`
	NameRegex *string              `pulumi:"nameRegex"`
	// A list of key pair names.
	Names      []string          `pulumi:"names"`
	OutputFile *string           `pulumi:"outputFile"`
	Pairs      []GetKeyPairsPair `pulumi:"pairs"`
	// The Id of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func GetKeyPairsOutput(ctx *pulumi.Context, args GetKeyPairsOutputArgs, opts ...pulumi.InvokeOption) GetKeyPairsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetKeyPairsResultOutput, error) {
			args := v.(GetKeyPairsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ecs/getKeyPairs:getKeyPairs", args, GetKeyPairsResultOutput{}, options).(GetKeyPairsResultOutput), nil
		}).(GetKeyPairsResultOutput)
}

// A collection of arguments for invoking getKeyPairs.
type GetKeyPairsOutputArgs struct {
	// A finger print used to retrieve specified key pair.
	FingerPrint pulumi.StringPtrInput `pulumi:"fingerPrint"`
	// A list of key pair IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to apply to the resulting key pairs.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Id of resource group which the key pair belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetKeyPairsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyPairsArgs)(nil)).Elem()
}

// A collection of values returned by getKeyPairs.
type GetKeyPairsResultOutput struct{ *pulumi.OutputState }

func (GetKeyPairsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyPairsResult)(nil)).Elem()
}

func (o GetKeyPairsResultOutput) ToGetKeyPairsResultOutput() GetKeyPairsResultOutput {
	return o
}

func (o GetKeyPairsResultOutput) ToGetKeyPairsResultOutputWithContext(ctx context.Context) GetKeyPairsResultOutput {
	return o
}

// Finger print of the key pair.
func (o GetKeyPairsResultOutput) FingerPrint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKeyPairsResult) *string { return v.FingerPrint }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKeyPairsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyPairsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetKeyPairsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetKeyPairsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of key pairs. Each element contains the following attributes:
//
// Deprecated: Field `keyPairs` has been deprecated from provider version 1.121.0. New field `pairs` instead.
func (o GetKeyPairsResultOutput) KeyPairs() GetKeyPairsKeyPairArrayOutput {
	return o.ApplyT(func(v GetKeyPairsResult) []GetKeyPairsKeyPair { return v.KeyPairs }).(GetKeyPairsKeyPairArrayOutput)
}

func (o GetKeyPairsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKeyPairsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of key pair names.
func (o GetKeyPairsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetKeyPairsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetKeyPairsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKeyPairsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetKeyPairsResultOutput) Pairs() GetKeyPairsPairArrayOutput {
	return o.ApplyT(func(v GetKeyPairsResult) []GetKeyPairsPair { return v.Pairs }).(GetKeyPairsPairArrayOutput)
}

// The Id of resource group.
func (o GetKeyPairsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKeyPairsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
func (o GetKeyPairsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetKeyPairsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKeyPairsResultOutput{})
}
