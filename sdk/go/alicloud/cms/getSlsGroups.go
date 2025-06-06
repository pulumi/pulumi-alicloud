// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cms Sls Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.171.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cms.GetSlsGroups(ctx, &cms.GetSlsGroupsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cmsSlsGroupId1", ids.Groups[0].Id)
//			nameRegex, err := cms.GetSlsGroups(ctx, &cms.GetSlsGroupsArgs{
//				NameRegex: pulumi.StringRef("^my-SlsGroup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cmsSlsGroupId2", nameRegex.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSlsGroups(ctx *pulumi.Context, args *GetSlsGroupsArgs, opts ...pulumi.InvokeOption) (*GetSlsGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSlsGroupsResult
	err := ctx.Invoke("alicloud:cms/getSlsGroups:getSlsGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSlsGroups.
type GetSlsGroupsArgs struct {
	// A list of Sls Group IDs. Its element value is same as Sls Group Name.
	Ids []string `pulumi:"ids"`
	// The keywords of the `slsGroupName` or `slsGroupDescription` of the Sls Group.
	Keyword *string `pulumi:"keyword"`
	// A regex string to filter results by Sls Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getSlsGroups.
type GetSlsGroupsResult struct {
	Groups []GetSlsGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	Keyword    *string  `pulumi:"keyword"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
}

func GetSlsGroupsOutput(ctx *pulumi.Context, args GetSlsGroupsOutputArgs, opts ...pulumi.InvokeOption) GetSlsGroupsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSlsGroupsResultOutput, error) {
			args := v.(GetSlsGroupsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("alicloud:cms/getSlsGroups:getSlsGroups", args, GetSlsGroupsResultOutput{}, options).(GetSlsGroupsResultOutput), nil
		}).(GetSlsGroupsResultOutput)
}

// A collection of arguments for invoking getSlsGroups.
type GetSlsGroupsOutputArgs struct {
	// A list of Sls Group IDs. Its element value is same as Sls Group Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The keywords of the `slsGroupName` or `slsGroupDescription` of the Sls Group.
	Keyword pulumi.StringPtrInput `pulumi:"keyword"`
	// A regex string to filter results by Sls Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetSlsGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSlsGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getSlsGroups.
type GetSlsGroupsResultOutput struct{ *pulumi.OutputState }

func (GetSlsGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSlsGroupsResult)(nil)).Elem()
}

func (o GetSlsGroupsResultOutput) ToGetSlsGroupsResultOutput() GetSlsGroupsResultOutput {
	return o
}

func (o GetSlsGroupsResultOutput) ToGetSlsGroupsResultOutputWithContext(ctx context.Context) GetSlsGroupsResultOutput {
	return o
}

func (o GetSlsGroupsResultOutput) Groups() GetSlsGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) []GetSlsGroupsGroup { return v.Groups }).(GetSlsGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSlsGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSlsGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSlsGroupsResultOutput) Keyword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) *string { return v.Keyword }).(pulumi.StringPtrOutput)
}

func (o GetSlsGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSlsGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSlsGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSlsGroupsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetSlsGroupsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSlsGroupsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSlsGroupsResultOutput{})
}
