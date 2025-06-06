// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alicloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Message Center Contacts of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.132.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := alicloud.GetMscSubContacts(ctx, &alicloud.GetMscSubContactsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mscSubContactId1", ids.Contacts[0].Id)
//			nameRegex, err := alicloud.GetMscSubContacts(ctx, &alicloud.GetMscSubContactsArgs{
//				NameRegex: pulumi.StringRef("^my-Contact"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mscSubContactId2", nameRegex.Contacts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetMscSubContacts(ctx *pulumi.Context, args *GetMscSubContactsArgs, opts ...pulumi.InvokeOption) (*GetMscSubContactsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMscSubContactsResult
	err := ctx.Invoke("alicloud:index/getMscSubContacts:getMscSubContacts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMscSubContacts.
type GetMscSubContactsArgs struct {
	// A list of Contact IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Contact name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getMscSubContacts.
type GetMscSubContactsResult struct {
	// A list of Msc Sub Contacts. Each element contains the following attributes:
	Contacts []GetMscSubContactsContact `pulumi:"contacts"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Contact names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetMscSubContactsOutput(ctx *pulumi.Context, args GetMscSubContactsOutputArgs, opts ...pulumi.InvokeOption) GetMscSubContactsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMscSubContactsResultOutput, error) {
			args := v.(GetMscSubContactsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:index/getMscSubContacts:getMscSubContacts", args, GetMscSubContactsResultOutput{}, options).(GetMscSubContactsResultOutput), nil
		}).(GetMscSubContactsResultOutput)
}

// A collection of arguments for invoking getMscSubContacts.
type GetMscSubContactsOutputArgs struct {
	// A list of Contact IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Contact name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetMscSubContactsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMscSubContactsArgs)(nil)).Elem()
}

// A collection of values returned by getMscSubContacts.
type GetMscSubContactsResultOutput struct{ *pulumi.OutputState }

func (GetMscSubContactsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMscSubContactsResult)(nil)).Elem()
}

func (o GetMscSubContactsResultOutput) ToGetMscSubContactsResultOutput() GetMscSubContactsResultOutput {
	return o
}

func (o GetMscSubContactsResultOutput) ToGetMscSubContactsResultOutputWithContext(ctx context.Context) GetMscSubContactsResultOutput {
	return o
}

// A list of Msc Sub Contacts. Each element contains the following attributes:
func (o GetMscSubContactsResultOutput) Contacts() GetMscSubContactsContactArrayOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) []GetMscSubContactsContact { return v.Contacts }).(GetMscSubContactsContactArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMscSubContactsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetMscSubContactsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetMscSubContactsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Contact names.
func (o GetMscSubContactsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetMscSubContactsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMscSubContactsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMscSubContactsResultOutput{})
}
