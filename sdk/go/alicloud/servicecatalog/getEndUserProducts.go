// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Service Catalog End User Product available to the user.[What is End User Product](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-servicecatalog-2021-09-01-listproductsasenduser)
//
// > **NOTE:** Available since v1.197.0.
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
//			_default, err := servicecatalog.GetEndUserProducts(ctx, &servicecatalog.GetEndUserProductsArgs{
//				NameRegex: pulumi.StringRef("ram模板创建"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudServiceCatalogEndUserProductExampleId", _default.EndUserProducts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEndUserProducts(ctx *pulumi.Context, args *GetEndUserProductsArgs, opts ...pulumi.InvokeOption) (*GetEndUserProductsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEndUserProductsResult
	err := ctx.Invoke("alicloud:servicecatalog/getEndUserProducts:getEndUserProducts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEndUserProducts.
type GetEndUserProductsArgs struct {
	// A list of End User Product IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by product name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
	SortBy *string `pulumi:"sortBy"`
	// The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
	SortOrder *string `pulumi:"sortOrder"`
}

// A collection of values returned by getEndUserProducts.
type GetEndUserProductsResult struct {
	// A list of End User Product Entries. Each element contains the following attributes:
	EndUserProducts []GetEndUserProductsEndUserProduct `pulumi:"endUserProducts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of End User Product IDs.
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	SortBy     *string  `pulumi:"sortBy"`
	SortOrder  *string  `pulumi:"sortOrder"`
}

func GetEndUserProductsOutput(ctx *pulumi.Context, args GetEndUserProductsOutputArgs, opts ...pulumi.InvokeOption) GetEndUserProductsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetEndUserProductsResultOutput, error) {
			args := v.(GetEndUserProductsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:servicecatalog/getEndUserProducts:getEndUserProducts", args, GetEndUserProductsResultOutput{}, options).(GetEndUserProductsResultOutput), nil
		}).(GetEndUserProductsResultOutput)
}

// A collection of arguments for invoking getEndUserProducts.
type GetEndUserProductsOutputArgs struct {
	// A list of End User Product IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by product name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The field that is used to sort the queried data. The value is fixed as CreateTime, which specifies the creation time of products.
	SortBy pulumi.StringPtrInput `pulumi:"sortBy"`
	// The order in which you want to sort the queried data. Valid values: `Asc`, `Desc`.
	SortOrder pulumi.StringPtrInput `pulumi:"sortOrder"`
}

func (GetEndUserProductsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndUserProductsArgs)(nil)).Elem()
}

// A collection of values returned by getEndUserProducts.
type GetEndUserProductsResultOutput struct{ *pulumi.OutputState }

func (GetEndUserProductsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndUserProductsResult)(nil)).Elem()
}

func (o GetEndUserProductsResultOutput) ToGetEndUserProductsResultOutput() GetEndUserProductsResultOutput {
	return o
}

func (o GetEndUserProductsResultOutput) ToGetEndUserProductsResultOutputWithContext(ctx context.Context) GetEndUserProductsResultOutput {
	return o
}

// A list of End User Product Entries. Each element contains the following attributes:
func (o GetEndUserProductsResultOutput) EndUserProducts() GetEndUserProductsEndUserProductArrayOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) []GetEndUserProductsEndUserProduct { return v.EndUserProducts }).(GetEndUserProductsEndUserProductArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEndUserProductsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of End User Product IDs.
func (o GetEndUserProductsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEndUserProductsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEndUserProductsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEndUserProductsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetEndUserProductsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetEndUserProductsResultOutput) SortBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *string { return v.SortBy }).(pulumi.StringPtrOutput)
}

func (o GetEndUserProductsResultOutput) SortOrder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndUserProductsResult) *string { return v.SortOrder }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEndUserProductsResultOutput{})
}
