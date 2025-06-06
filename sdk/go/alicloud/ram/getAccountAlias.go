// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides an alias for the Alibaba Cloud account.
//
// > **NOTE:** Available since v1.0.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			aliasDs, err := ram.LookupAccountAlias(ctx, &ram.LookupAccountAliasArgs{
//				OutputFile: pulumi.StringRef("alias.txt"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("accountAlias", aliasDs.AccountAlias)
//			return nil
//		})
//	}
//
// ```
func LookupAccountAlias(ctx *pulumi.Context, args *LookupAccountAliasArgs, opts ...pulumi.InvokeOption) (*LookupAccountAliasResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountAliasResult
	err := ctx.Invoke("alicloud:ram/getAccountAlias:getAccountAlias", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountAlias.
type LookupAccountAliasArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAccountAlias.
type LookupAccountAliasResult struct {
	// Alias of the account.
	AccountAlias string `pulumi:"accountAlias"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	OutputFile *string `pulumi:"outputFile"`
}

func LookupAccountAliasOutput(ctx *pulumi.Context, args LookupAccountAliasOutputArgs, opts ...pulumi.InvokeOption) LookupAccountAliasResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccountAliasResultOutput, error) {
			args := v.(LookupAccountAliasArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:ram/getAccountAlias:getAccountAlias", args, LookupAccountAliasResultOutput{}, options).(LookupAccountAliasResultOutput), nil
		}).(LookupAccountAliasResultOutput)
}

// A collection of arguments for invoking getAccountAlias.
type LookupAccountAliasOutputArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (LookupAccountAliasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountAliasArgs)(nil)).Elem()
}

// A collection of values returned by getAccountAlias.
type LookupAccountAliasResultOutput struct{ *pulumi.OutputState }

func (LookupAccountAliasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountAliasResult)(nil)).Elem()
}

func (o LookupAccountAliasResultOutput) ToLookupAccountAliasResultOutput() LookupAccountAliasResultOutput {
	return o
}

func (o LookupAccountAliasResultOutput) ToLookupAccountAliasResultOutputWithContext(ctx context.Context) LookupAccountAliasResultOutput {
	return o
}

// Alias of the account.
func (o LookupAccountAliasResultOutput) AccountAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountAliasResult) string { return v.AccountAlias }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountAliasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountAliasResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccountAliasResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountAliasResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountAliasResultOutput{})
}
