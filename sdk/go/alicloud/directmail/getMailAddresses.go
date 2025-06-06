// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directmail

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Direct Mail Mail Addresses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.134.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/directmail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := directmail.GetMailAddresses(ctx, &directmail.GetMailAddressesArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("directMailMailAddressId1", ids.Addresses[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetMailAddresses(ctx *pulumi.Context, args *GetMailAddressesArgs, opts ...pulumi.InvokeOption) (*GetMailAddressesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMailAddressesResult
	err := ctx.Invoke("alicloud:directmail/getMailAddresses:getMailAddresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMailAddresses.
type GetMailAddressesArgs struct {
	// A list of Mail Address IDs.
	Ids []string `pulumi:"ids"`
	// The key word about account email address.
	KeyWord *string `pulumi:"keyWord"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Account type. Valid values: `batch`, `trigger`.
	Sendtype *string `pulumi:"sendtype"`
	// Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getMailAddresses.
type GetMailAddressesResult struct {
	Addresses []GetMailAddressesAddress `pulumi:"addresses"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	KeyWord    *string  `pulumi:"keyWord"`
	OutputFile *string  `pulumi:"outputFile"`
	Sendtype   *string  `pulumi:"sendtype"`
	Status     *string  `pulumi:"status"`
}

func GetMailAddressesOutput(ctx *pulumi.Context, args GetMailAddressesOutputArgs, opts ...pulumi.InvokeOption) GetMailAddressesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMailAddressesResultOutput, error) {
			args := v.(GetMailAddressesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:directmail/getMailAddresses:getMailAddresses", args, GetMailAddressesResultOutput{}, options).(GetMailAddressesResultOutput), nil
		}).(GetMailAddressesResultOutput)
}

// A collection of arguments for invoking getMailAddresses.
type GetMailAddressesOutputArgs struct {
	// A list of Mail Address IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The key word about account email address.
	KeyWord pulumi.StringPtrInput `pulumi:"keyWord"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Account type. Valid values: `batch`, `trigger`.
	Sendtype pulumi.StringPtrInput `pulumi:"sendtype"`
	// Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetMailAddressesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMailAddressesArgs)(nil)).Elem()
}

// A collection of values returned by getMailAddresses.
type GetMailAddressesResultOutput struct{ *pulumi.OutputState }

func (GetMailAddressesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMailAddressesResult)(nil)).Elem()
}

func (o GetMailAddressesResultOutput) ToGetMailAddressesResultOutput() GetMailAddressesResultOutput {
	return o
}

func (o GetMailAddressesResultOutput) ToGetMailAddressesResultOutputWithContext(ctx context.Context) GetMailAddressesResultOutput {
	return o
}

func (o GetMailAddressesResultOutput) Addresses() GetMailAddressesAddressArrayOutput {
	return o.ApplyT(func(v GetMailAddressesResult) []GetMailAddressesAddress { return v.Addresses }).(GetMailAddressesAddressArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMailAddressesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMailAddressesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetMailAddressesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMailAddressesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetMailAddressesResultOutput) KeyWord() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMailAddressesResult) *string { return v.KeyWord }).(pulumi.StringPtrOutput)
}

func (o GetMailAddressesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMailAddressesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetMailAddressesResultOutput) Sendtype() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMailAddressesResult) *string { return v.Sendtype }).(pulumi.StringPtrOutput)
}

func (o GetMailAddressesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMailAddressesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMailAddressesResultOutput{})
}
