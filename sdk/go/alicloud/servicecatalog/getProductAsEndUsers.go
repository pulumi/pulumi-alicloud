// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:** It has been deprecated from version `1.197.0`.
// Please use new datasource servicecatalog.getEndUserProducts instead.
//
// This data source provides Service Catalog Product As End User available to the user.[What is Product As End User](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-listproductsasenduser)
//
// > **NOTE:** Available in 1.196.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := servicecatalog.GetProductAsEndUsers(ctx, &servicecatalog.GetProductAsEndUsersArgs{
//				NameRegex: pulumi.StringRef("ram模板创建"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudServiceCatalogProductAsEndUserExampleId", _default.Users[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetProductAsEndUsers(ctx *pulumi.Context, args *GetProductAsEndUsersArgs, opts ...pulumi.InvokeOption) (*GetProductAsEndUsersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductAsEndUsersResult
	err := ctx.Invoke("alicloud:servicecatalog/getProductAsEndUsers:getProductAsEndUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProductAsEndUsers.
type GetProductAsEndUsersArgs struct {
	// A list of Product As End User IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by product name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	SortBy     *string `pulumi:"sortBy"`
	SortOrder  *string `pulumi:"sortOrder"`
}

// A collection of values returned by getProductAsEndUsers.
type GetProductAsEndUsersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Product As End User IDs.
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	OutputFile *string  `pulumi:"outputFile"`
	SortBy     *string  `pulumi:"sortBy"`
	SortOrder  *string  `pulumi:"sortOrder"`
	// A list of Product As End User Entries. Each element contains the following attributes:
	Users []GetProductAsEndUsersUser `pulumi:"users"`
}

func GetProductAsEndUsersOutput(ctx *pulumi.Context, args GetProductAsEndUsersOutputArgs, opts ...pulumi.InvokeOption) GetProductAsEndUsersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetProductAsEndUsersResultOutput, error) {
			args := v.(GetProductAsEndUsersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:servicecatalog/getProductAsEndUsers:getProductAsEndUsers", args, GetProductAsEndUsersResultOutput{}, options).(GetProductAsEndUsersResultOutput), nil
		}).(GetProductAsEndUsersResultOutput)
}

// A collection of arguments for invoking getProductAsEndUsers.
type GetProductAsEndUsersOutputArgs struct {
	// A list of Product As End User IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by product name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	SortBy     pulumi.StringPtrInput `pulumi:"sortBy"`
	SortOrder  pulumi.StringPtrInput `pulumi:"sortOrder"`
}

func (GetProductAsEndUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductAsEndUsersArgs)(nil)).Elem()
}

// A collection of values returned by getProductAsEndUsers.
type GetProductAsEndUsersResultOutput struct{ *pulumi.OutputState }

func (GetProductAsEndUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductAsEndUsersResult)(nil)).Elem()
}

func (o GetProductAsEndUsersResultOutput) ToGetProductAsEndUsersResultOutput() GetProductAsEndUsersResultOutput {
	return o
}

func (o GetProductAsEndUsersResultOutput) ToGetProductAsEndUsersResultOutputWithContext(ctx context.Context) GetProductAsEndUsersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductAsEndUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Product As End User IDs.
func (o GetProductAsEndUsersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetProductAsEndUsersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetProductAsEndUsersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetProductAsEndUsersResultOutput) SortBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) *string { return v.SortBy }).(pulumi.StringPtrOutput)
}

func (o GetProductAsEndUsersResultOutput) SortOrder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) *string { return v.SortOrder }).(pulumi.StringPtrOutput)
}

// A list of Product As End User Entries. Each element contains the following attributes:
func (o GetProductAsEndUsersResultOutput) Users() GetProductAsEndUsersUserArrayOutput {
	return o.ApplyT(func(v GetProductAsEndUsersResult) []GetProductAsEndUsersUser { return v.Users }).(GetProductAsEndUsersUserArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductAsEndUsersResultOutput{})
}
